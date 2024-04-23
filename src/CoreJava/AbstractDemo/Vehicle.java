package CoreJava.AbstractDemo;
/*
When to use Abstract Methods & Abstract Class?
Abstract methods are usually declared where two or more subclasses are expected to do a
similar thing in different ways through different implementations. These subclasses extend
the same Abstract class and provide different implementations for the abstract methods.

 */
abstract  class Vehicle {
    public abstract void engine();
}
