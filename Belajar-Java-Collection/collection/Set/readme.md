# Set Interface

// Definition //
Set is one of the Collection that contains unique elements a.k.a cannot be duplicate.
Set doesn't have index as List, hence there is no data guarantee that the data will be in ordered list as we insert the data in Set.

Set doesn't have new method, therefore we only use methods from the parents (Collection and Iterable).
Because Set doesn't have index, to retrieve the data from the set we must iterate the data one by one.

// HashSet vs LinkedHashSet //
Behind of HashSet and LinkedHashSet, literally there is a hash table. 
Where the data is stored in a hash table with calculation of hashCode() function.

The difference between HashSet and LinkedHashSet is that HashSet DON'T guarantee our data will be in ordered list as we insert the data.
Whereas LinkedHashSet guarantee our data will be in ordered list as we insert the data.
The Data Order in LinkedHashSet is preserved because the behind of LinkedHashSet use Double Linked List.

// Enum Set //
EnumSet is the set where the data element must be in Enum.
Because the Enum data is unique, so that it suitable using Set than List.

// Others //
! check out Mr. Eko's Google Slide !

# End of Lesson