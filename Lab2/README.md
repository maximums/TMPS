# Topic: Creational Design Patterns
### Author: Dodi Cristian-Dumitru
#### Group: FAF-181
## Objectives:
1. **Study the Structural Design Patterns**<br>
2. **Expanding previous laboratory work by adding some additional functionalities using some structural design patterns**<br>

## Theory:
**Design patterns** are typical solutions to common problems
in software design. Each pattern is like a blueprint
that can be customize to solve a particular
design problem.They define a common language that helps developer teams
communicate more efficiently.<br>
<br>
In software engineering, the **Structural Design Patterns** are concerned with how classes and objects are composed
 to form larger structures.
 Structural class patterns use inheritance to create a hierarchy of classes/abstractions,
 but the structural object patterns use composition which is generally a more flexible alternative to inheritance.<br>
Some examples of from this category of design patterns are:<br>
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

## Implementation:<br>
In this project I've implemented 3 structural design patterns i.e(Decorator, Facade and Adapter) with 
the emphasis on the objects of type Furniture:Chair, Table, Sofa and objects of type Technique:
PC, TV, Playstation.Type Furniture contains 4 attributes, *get* and *set* methods and *toString*, which is used 
for output,type Technique contains 3 attributes and same methods as Furniture type.<br>
**Adapter DP**, I've implemented in **TechniqueAdapter**,__||||VOI CONTINUA||||__ **ModernFurnitureFactory** and **ArtDecoFurnitureFactory** classes. For this I use a
static attribute for instance.<br><br>
`private static ArtDecoFurnitureFactory artDecoFurnitureFactory;`<br>
`private static CyberPunkFurnitureFactory cyberPunkFurnitureFactory;`<br>
`private static  ModerFurnitureFactory moderFurnitureFactory;`<br><br>
Then I declare the constructor as private:<br><br>
`private ArtDecoFurnitureFactory () {}`<br>
`private CyberPunkFurnitureFactory() {}`<br>
`private ModerFurnitureFactory() {}`<br><br>
So that the class could be instantiated only from *getInstance()* method which is a
static and by a simple if i.e.:<br>
```
public static ModerFurnitureFactory getModerFurnitureFactory() {
        if (moderFurnitureFactory == null)
            synchronized (ModerFurnitureFactory.class) {
                moderFurnitureFactory = new ModerFurnitureFactory();
            }
        return moderFurnitureFactory;
    }
```
<br>

The __Builder DP__ ensures that a program can create different objects by the same creational process.
In my project there are 2 stages to create the furniture object.First is chosen the factory by the style of furniture(Art Deco, Modern,
 CyberPunk) and then in the coresponding factory is chosen a builder class. The creation methods are implemented in __Director__ class.<br>
<br>
The factory methods that I've used in my project are in Builder package ,FurnitureBuilder interface.
There are multiple classes which implement the interface(ChairBuilder, SofaBuilder, TableBuilder). Then based on the type parameter it is chosen one of them.<br>
<br>
Above that I have the factories which get the coresponding builder for each *style* .
These factories implements the **BaseFactory** interface. <br>
<br>
The process of creating different types of furnitures of different styles is in the following lines from **Main** class:
<br>

```

BaseFactory cyberPunkFactory = CyberPunkFurnitureFactory.getCyberPunkFurnitureFactoryFactory();
        System.out.println(cyberPunkFactory.createFurniture("chair").toString());
        System.out.println(cyberPunkFactory.createFurniture("sofa").toString());
        System.out.println(cyberPunkFactory.createFurniture("table").toString());

        BaseFactory artDecoFactory = ArtDecoFurnitureFactory.getArtDecoFurnitureFactory();
        System.out.println(artDecoFactory.createFurniture("chair").toString());
        System.out.println(artDecoFactory.createFurniture("sofa").toString());
        System.out.println(artDecoFactory.createFurniture("table").toString());

        BaseFactory moderFactory = ModerFurnitureFactory.getModerFurnitureFactory();
        System.out.println(moderFactory.createFurniture("chair").toString());
        System.out.println(moderFactory.createFurniture("sofa").toString());
        System.out.println(moderFactory.createFurniture("table").toString());
```

<br>

### Program output:<br>
![Output](https://github.com/maximums/TMPS/blob/master/Lab2/img/output.png)
<br>
### Diagram of program structure:
![Output](https://github.com/maximums/TMPS/blob/master/Lab2/img/diagrama.png)
<br>
### UML diagram of program structure:
![Output](https://github.com/maximums/TMPS/blob/master/Lab2/img/diagrama1.png)
