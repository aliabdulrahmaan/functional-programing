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

### Consumer :

```
Represents an operation that accepts a single input argument and returns no result. 
Unlike most other functional interfaces, Consumer is expected to operate via side-effects. 
This is a functional interface whose functional method is accept(Object) .

Inteface methods:

1. accept()
 - Performs this operation on the given argument.
 
2. andThen(Consumer<? super T> after)
 - Returns a composed Consumer that performs, in sequence, 
  this operation followed by the after operation.
```

### Function :

```
It represents a function which takes in one argument and produces a result. 
Hence this functional interface takes in 2 generics namely as follows:

 >> T: denotes the type of the input argument
 >>R: denotes the return type of the function
 
Inteface methods:

1. apply()
 - This method takes in only one parameter t which is the function argument.
 
2. andThen(Consumer<? super T> after)
 - It returns a composed function wherein the parameterized function will be executed after the first one. 
   If evaluation of either function throws an error, it is relayed to the caller of the composed function.

2. compose()
 - It returns a composed function wherein the parameterized function will be executed after the first one. 
   If evaluation of either function throws an error, it is relayed to the caller of the composed function.
   
2. andThen(Consumer<? super T> after)
 - It returns a composed function wherein the parameterized function will be executed after the first one. 
   If evaluation of either function throws an error, it is relayed to the caller of the composed function.   
   
```

### Supplier :

```
The Supplier Interface is a part of the java.util.function package which has been introduced since Java 8,
to implement functional programming in Java. It represents a function which does not take
in any argument but produces a value of type T.

Inteface methods:

1. T get()
 
```
