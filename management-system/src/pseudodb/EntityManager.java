package pseudodb;

import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public interface EntityManager<T> {
    T addEntry(T entry);

    T getEntryById(String id);

    Map<UUID, T> getAllEntries();
    //might not want to use this since i will have to deal with object equals and hash code
    //void removeEntity(T entity);

    T updateEntryById(String id, T updatedEntry);

    void removeEntryById(String id);

}
