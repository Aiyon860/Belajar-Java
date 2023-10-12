# Map Interface

--// DEFINITION //--
Map is Data Structure of Collection that contains mapping between Key and Value.
Where the Key on the Map is must be UNIQUE. No Key duplicate. And only one Key that can mapping into one Key (slot).
Map in fact is same as Array, but the difference is that in Array its key is Index (integer). Whereas in Map, the Key is can be anything up to us/according to our own.

----------------

# HashMap

// Definition //
HashMap is the Map implementation that can distribute Key using hashCode() method/function.
Because HashMap is highly rely on hashCode() method/function, so assure that we must make the hashCode() function as unique as possible. Because if there are too many same hashCode() value, therefore the distribution Key won't be optimal so that the 'get data' process in Map will be getting slower.
On HashMap, the verification of duplicate data is done by using its equals() method. 

----------------

# WeakHashMap

// Definition //
WeakHashMap is the Map implementation that similar/alike to HashMap.
The difference is that WeakHashMap use 'Weak Key', where if the Key isn't used anymore then the data automatically removed from WeakHashMap.
That means, if there is Garbage Collection in Java, so likely the data in WeakHashMap will be removed.
WeakHashMap is suitable when it used for store Cache Data in the memory for a while/temporary.

----------------

# IdentityHashMap

// Definition //
IdentityHashMap is the Map implementation that same as HashMap.
The difference is the way to verify/checking the similarity of the Data, it doesn't use equals() function/method, however it use == operator (reference equality).
Means that the data is considered same, if the location is same on the memory.

----------------

# LinkedHashMap

// Definition //
LinkedHashMap is the Map implementation by using Double Linked List.
The data in LinkedHashMap will be more predictable because the data will be stored sequentially in Linked List according to our order/sequence when we insert and store the data.
However, there is a thing to note. The 'get data' process in LinkedHashMap will be more slower because we must iterate data in Linked List first.
Therefore, use LinkedHashMap if it is indeed for the iteration of the Map data.

# EnumHashMap

// Definition //
EnumMap is the Map implementation where the Key is Enum.
Because the Enum data is undoubtly unique. Therefore it fits as Key in Map.
The Algorithm of Key Distribution is get optimized for Enum type. So that it will be more optimal than using hashCode() method/function.

----------------

--// Others //--
! check out Mr. Eko's Google Slide !

# End of Lesson