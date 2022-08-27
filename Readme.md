## Functional Interface
```
It is defined as an interface that contains only one abstract function or method. 
Functional interfaces can represent abstract concepts such as functions,
actions or predicates.
```
Major functional interfaces in java are:

- Predicate
- Consumer 
- Function 
- Supplier
- BinaryOperator 
- UnaryOperator

### Predicate :
```
Predicate is defined in the java,util.Function package.
the test method is the abstract method for this functional interface which return boolean based on thr condition.

It improves manageability of code, helps in unit-testing them separately, 
and contain some methods like:

1. isEqual(Object targetRef) : 
 - Returns a predicate that tests if two arguments are equal according to Objects.
 
2. and(Predicate<? super T> other) + or(Predicate<? super T> other) 

3. negate()
 - is the default method of Predicate that returns a predicate that represents the logical negation of this predicate.
 
4. not(Predicate<? super T> target)
 - not is the static method of Predicate introduced in Java 11. not returns predicate that is the negation of supplied predicate.
 This is accomplished by returning result of the calling target.negate(). Find the example of Predicate.not.
 
```

