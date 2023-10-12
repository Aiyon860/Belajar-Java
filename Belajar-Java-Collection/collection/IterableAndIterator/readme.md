# Iterable and Iterator

// Definition //
Iterable are parent for all collection in Java, except Map.
Iterable itself is pretty simple, it only used to advocate for-each loop.
Because all collection implements Iterable, automatically all collection in Java advocate for-each loop. So not only Array.

// How it Works? //
Literally, for-each in Iterable can occur because there is iterator() method that return 'Iterator' object.
Iterator is interface that define our way to access element in collection sequentially.
For-each itself is appeared since Java 5, before Java 5 to do collection iteration, we usually do it manually using Iterator

# End of Lesson 
