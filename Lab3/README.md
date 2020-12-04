# Topic: Behavioral Design Patterns
### Author: Dodi Cristian-Dumitru
#### Group: FAF-181
## Objectives:
1. **Study and understand the Behavioral Design Patterns**<br>
2. **Expanding previous laboratory work by adding some additional functionalities using some behavioral design patterns**<br>

## Theory:
**Design patterns** are typical solutions to common problems
in software design. Each pattern is like a blueprint
that can be customized to solve a particular
design problem.They define a common language that helps developer teams
communicate more efficiently.<br>
<br>
In software engineering, **behavioral design patterns** are design patterns that identify 
common communication patterns between objects and realize these patterns.
 By doing so, these patterns increase flexibility in carrying out this communication.
Some examples of from this category of design patterns are:<br>
- Chain of responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Observer
- Null Object
- Strategy

## Implementation:<br>
In this project I've implemented 2 behavioral design patterns i.e(Null Object and Iterator) with 
the emphasis on the objects of type Furniture:Chair, Table, Sofa and objects of type Technique:
PC, TV, Playstation.<br><br>
The intent of a **Null Object DP** is to encapsulate the absence of an object by 
providing a substitutable alternative that offers suitable default do nothing behavior.
**Null Object**, I've implemented for both types of objects(*Furniture*, *Technique*) in **NullFurniture**
and **NullTechnique** classes which can be found in packages *furniture* and *technique*.
<br>

The __Iterator DP__  lets us traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.)
In my project I have implemented it in __FurnitureIterator__ class from package _iterator_, it allows me to
iterate through objects from __House__, it implements interface __FurnitureCollection__ and contain a collection of objects(Furniture, Technique)
also this class return iterator through next method:
```
@Override
    public Iterator<Furniture> iterator() {
        return new FurnitureIterator(furnitures);
    }
```
This iterator I used later in main class, __Main__ to traverse all objects from _house_ in static method
_printFurnitureObjects_:
```
private static void printFurnitureObjects(Iterator<Furniture> iterator) {
        while (iterator.hasNext()) {
            Furniture furniture = iterator.next();
            System.out.println(furniture.toString());
        }
    }
```

### Program output:<br>
![Output](https://github.com/maximums/TMPS/blob/master/Lab2/img/output.png)
<br>
#### Iterator DP:
![Output](https://github.com/maximums/TMPS/blob/master/Lab2/img/iterator.png)
