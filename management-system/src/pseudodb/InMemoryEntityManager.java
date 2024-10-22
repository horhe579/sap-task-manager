package pseudodb;

import entities.Entity;
import exceptions.InvalidIdException;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryEntityManager<T extends Entity> implements EntityManager<T> {

    private final Map<UUID, T> entries = new ConcurrentHashMap<>();

    public InMemoryEntityManager() {
    }

    @Override
    public T addEntry(T entity) {
        UUID entryId = entity.getId();
        return this.entries.putIfAbsent(entryId ,entity);
    }

    @Override
    public T getEntryById(String id) {
        try {
            UUID entryId = UUID.fromString(id);
            return this.entries.getOrDefault(entryId, null);
        } catch (Exception e) {
            //custom exception for invalid id given 409
            throw new InvalidIdException("Given ID: " + id + " is not in correct UUID format.");
        }
    }

    @Override
    public Map<UUID, T> getAllEntries() {
        return entries;
    }

    @Override
    public T updateEntryById(String id, T updatedEntity) {
        try {
            UUID entryId = UUID.fromString(id);
            T entity = this.entries.getOrDefault(entryId, null);

            if(entity == null) return null;

            return this.entries.put(entryId, updatedEntity);
        } catch (Exception e) {
            //custom exception for invalid id given 409
            throw new InvalidIdException("Given ID: " + id + " is not in correct UUID format.");
        }
    }

    @Override
    public void removeEntryById(String id) {
        try {
            UUID entryId = UUID.fromString(id);
            T entity = this.entries.getOrDefault(entryId, null);

            if(entity == null) return;

            this.entries.remove(entryId);
        } catch (Exception e) {
            //custom exception for invalid id given 409
            throw new InvalidIdException("Given ID: " + id + " is not in correct UUID format.");
        }
    }


}
