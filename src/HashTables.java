import java.util.Hashtable;

public class HashTables {

    public void HashTableImplementation() {

        //Normal HashTable Implementation
        Hashtable<Integer, String> NewHashTable = new Hashtable<>();

        NewHashTable.put(1, "This");
        NewHashTable.put(2, "Is");
        NewHashTable.put(3, "Hash");
        NewHashTable.put(4, "Table");

        System.out.println(NewHashTable);

        //HashTable Implementation With Initial Capacity
        Hashtable<Integer, String> HashTableWithSize = new Hashtable<>(3);
    }
}
