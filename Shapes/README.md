# Geometric shapes 

## Consider this basic object structure for geometric shapes

* `Shape (abstract)`: has properties for `color` and whether its `filled` or not. Further it provides two abstract methods `getArea(): double` and `getPerimeter(): double`.
* `Circle` extends `Shape` and adds properties for its `radius`. 
* `Rectangle` extends `Shape` and adds properties for `width` and `length`
* `Square` extends `Rectangle` and adds another property `side`. 

## Please implement this class hierarchy considering the following points
* Shape is `abstract` and can therefore not be instantiated. `getArea()` and `getPerimeter()` are abstract and must be implemented by subclasses
* all classes must override the `toString()` method
* all classes must provide an explicit default constructor. Additionally, each class must provide a constructor with all parameters that "it needs"
* implement a test program `Main.java`, that creates several instances and prints `area` and `perimeter`
* practice rigorous information hiding: all members should be `private` unless you really really need them not to be.
* your test code should exhibit the principles of polymorphism, e.g. write ```Shape s = new Rectangle(4.0, 4.5)``` rather than
```Rectangle r = new Rectangle(...)```
* the number `pi` is defined in `Math.PI`
