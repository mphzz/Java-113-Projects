# CS113-HW03-DoubleLinkedList
## HW #4 for CS113 - Double Linked List Implementation

#### "A list is only as strong as its weakest link." — Donald Knuth
#### "If you find that you're spending almost all your time on theory, start turning some attention to practical things; it will improve your theories. If you find that you're spending almost all your time on practice, start turning some attention to theoretical things; it will improve your practice." — Donald Knuth

Provide your implementation for a DoubleLinkedList<E>. Apart from a default constructor and toString() method, make sure to implement the methods from the List interface and create an inner class implementing ListIterator interface (in addition to the necessary static inner class Node<E>). You will be graded on having all the methods below implemented and passing all JUnit tests for the List interface in addition to the JUnit tests for its ListIterator. Feel free to use code from the book (KWLinkedList) or slides.
  
  ListIterator interface methods to implement:
  
- Iterator<E> ||	iterator()
Returns an iterator over the elements in this list in proper sequence.
  
- ListIterator<E> ||	listIterator()
Returns a list iterator over the elements in this list (in proper sequence).
  
- ListIterator<E> ||	listIterator(int index)
Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
  
- boolean ||	add(E e)
Appends the specified element to the end of this list (optional operation).
  
- void ||	add(int index, E element)
Inserts the specified element at the specified position in this list (optional operation).
  
- void ||	clear()
Removes all of the elements from this list (optional operation).
  
- boolean ||	equals(Object o)
Compares the specified object with this list for equality.
  
- boolean || contains(Object o)
Returns true if this list contains the specified element.
  
- E || get(int index)
Returns the element at the specified position in this list.
  
- int || indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
  
- int || lastIndexOf(Object o)
Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
  
- boolean || isEmpty()
Returns true if this list contains no elements.
  
- E || remove(int index)
Removes the element at the specified position in this list (optional operation).
  
- boolean	|| remove(Object o)
Removes the first occurrence of the specified element from this list, if it is present (optional operation).
  
- E || set(int index, E element)
Replaces the element at the specified position in this list with the specified element (optional operation).
  
- int	|| size()
Returns the number of elements in this list.
