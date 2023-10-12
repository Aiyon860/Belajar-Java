# Legacy Collection

// Definiton //
Collection has been there in Java since Version 1, but as times flies, Java Collection has been more developed.
In fact, there are a few of Legacy Collections (old collection) that we hasn't discuss yet. But it's really rarely used in current days.

# Vector Class
// Definition //
Vector Class is the implementation of List Interface.
How Vector works is similar to ArrayList, the difference is that all method in Vector use 'Synchronized' keyword, means that it's Thread Safe. -> Can be used in Paralel process
However, the problem is that because all method use 'Synchronized' keyword, automatically it will impact to its performance that causing slow performance than when we use ArrayList.
So, how do we want to make list that can be used in Paralel process? In current-new Java version, Java already provided with the more advanced ones for that process. Therefore, Vector utilization is rarely used in current days.

# HashTable Class
// Definition //
HashTable is the implementation of Map that similar to HashMap.
Sames as Vector, all method in HashTable have 'Synchronized' keyword, so that the performance will be more slower than HashMap.
Also because in new Java version there is already ConcurrentHashMap, so that HashTable utilization is rarely found in current days.

# Stack Class
// Definition //
Stack Class is the implementation of 'LIFO Stack (Last In First Out)' Data Structure.
But, Deque has already provide features that more complete and consistent. So, there is no reason to use Stack class anymore.

// Other //
! check out Mr. Eko's Google Slide !

# End of Lesson