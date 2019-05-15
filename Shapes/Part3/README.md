# Geometric shapes III

We will re-use the code from Part 2. When creating graphical applications, we must be able to _resize_ shapes.
That means we will introduce a new interface `Resizable`, that provides one single method: 
- `resize(double percent)`

Now let all your concrete shapes extend the `Resizable` interface and implement the resize operation for all your shapes.
Write test code for it. Do NOT let `Shape` implement `Resizable`! These two things have different meanings and should remain separate.
