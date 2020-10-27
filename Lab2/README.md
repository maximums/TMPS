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
**Adapter DP**, I've implemented in **TechniqueAdapter**,which allows me to use method arrangeHouse(Furniture... furnishes) from class House, 
with parameters of type Technique instead of type Furniture.<br><br>

```
    void arrangeHouse(Furniture... furnishes){
        System.out.println("\nCreated house contain objects:\n");
        for (Furniture furniture : furnishes)
            System.out.println(furniture.toString());
    }
```
<br>

The __Decorator DP__  lets us attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
In my project I have implemented it in __BaseFurnitureFactoryDecorator__ and __ColorSetter__ classes from package wrappers.
__ColorSetter__ allow us to customize our furniture object and instead of creating a standard furniture object, in our case attribute _color_
is set to _standard_, we can create a furniture object with desired color. <br>
<br>

```

@Override
    public Furniture createFurniture(String type) {
        Furniture furniture = super.createFurniture(type);
        furniture.setColor(this.customColor);
        return furniture;
    }
```
<br>
Third structural DP I had implemented is __Facade DP__ which allows me to hide the complex process of creating cusom furniture item
and make this process simpler for him. I have implemented this DP in __FurnitureCustomizer__ class, with method _getCustomFurniture()_
get furniture item with his personal color. 
<br>

```

 public Furniture getCustomFurniture(String type, String customColor) {
        BaseFurnitureFactoryDecorator customFurniture = new ColorSetter(furnitureFactory, customColor);
        return customFurniture.createFurniture(type);
    }
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
