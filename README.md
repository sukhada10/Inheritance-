🦸 Superhero Inheritance & Polymorphism Demo
📌 Overview
This project is a simple Java program that demonstrates the concepts of inheritance and method overriding (runtime polymorphism) using a Superhero parent class and multiple child classes (Ironman, Spiderman, DoctorStrange).
Each superhero overrides the power() method to display their unique abilities.

🛠 Features
- Parent Class (Superhero)
- Defines a generic power() method.
- Child Classes
- Ironman: Genius intellect and advanced armored suit.
- Spiderman: Wall-climbing and web-swinging abilities.
- DoctorStrange: Master of mystical arts and time manipulation.
- Polymorphism in Action
- A single reference variable (Superhero hero) is used to point to different child objects.
- At runtime, the correct power() method is executed depending on the object type.

📂 Code Structure
Superhero.java        // Parent class
Ironman.java          // Child class 1
Spiderman.java        // Child class 2
DoctorStrange.java    // Child class 3
InheritPoly.java      // Main class with demo



▶️ How to Run
- Save all classes in the same directory (or package).
- Compile the program:
javac InheritPoly.java
- Run the program:
java InheritPoly



📊 Expected Output
Every superhero has some power!
Ironman:Genius-level intellect and a high-tech armored suit!
spiderman:climbs walls and swings between skyscrapers with web!
Doctor strange:master of mystical arts and time manipulatiuon!




