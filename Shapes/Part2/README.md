# Geometric shapes II

We will re-use the code from Part 1. When creating graphical applications, shapes must be able to move around.
That means that each graphical shape needs a _position_. In the screen space, positions are measured in pixels. "X" means the 
amount of pixels from the left side of the screen, "Y" means the amount of pixels from the top of the screen.
 
How position is interpreted will depend on the shape:
- circles have a center point
- rectangles have an anchor point (one of the four corners, usually top-left)

# Make shapes space-aware
Shapes need a geometrical position which will be exposed by a new interface `Movable`. It will expose the following methods:
- `moveUp(int amount)`
- `moveDown(int amount)`
- `moveLeft(int amount)`
- `moveRight(int amount)`
- `getPosition(): MovablePoint`: gets the shape-specific position which is represented as a `MovablePoint`

Now let all your shapes extend the `Movable` interface and implement all the required methods and rename the Shapes.
Write test code for it. Do NOT let `Shape` implement `Movable`! These two things have different meanings and should remain separate.

Extend your Shape subclasses such that they also print their respective position value when calling `toString()`.
