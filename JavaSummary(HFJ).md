# Java Summary Sheet

# Table of Contents
1. [Get to know the Java API](#get-to-know-the-Java-API)

# Get to know the Java API

## Working with ArrayList
```java
// Make one
ArrayList<Egg> myList = new ArrayList<Egg>();

// Put something in it
Egg s = new Egg();
myList.add(s);

//Remove something from it
myList.remove(s);

// Find out how many things are in it
int theSize = myList.size();

// Find out if it contains something
boolean isIn = myList.contains(s);

// Find out if it’s empty
boolean empty = myList.isEmpty();

// Find out where something is (i.e. its index)
int idx = myList.indexOf(b);

// Put another thing in it
Egg b = new Egg();
myList.add(b);
```

## Boolean Operators

* In the case of &&, if the JVM sees that the left side of a && expression is false, it stops right there! Doesn’t even bother to look at the right side. Similar is the case with || .

### Non Short Circuit Operators ( & , | )
* When used in boolean expressions, the & and | operators act like their && and || counterparts, except that they force the JVM to always check both sides of the expression. Typically, & and | are used in another context, for manipulating bits.

### Packages
* They help the overall organization of a project or library
* Packages give you a namescoping, to help prevent collisions for a class with the same name
* Packages provide a level of security, because you can restrict the code you write so that only other classes in the same package can access it
* classes in java.lang package don't need to be imported (for ex. java.lang.String)

# Inheritance and Polymorphism

* the subclass inherits the members (the instance variables and methods) of the superclass
* methods can be overriden by subclass but Instance variables are not overridden (because they don’t need to be)
* In Java, we say that **the subclass extends the superclass**


```java

public class Doctor {
	boolean worksAtHospital;

	void treatPatient() {
// perform a checkup
	}
}

public class FamilyDoctor extends Doctor {
	boolean makesHouseCalls;

	void giveAdvice() {
// give homespun advice
	}
}

public class Surgeon extends Doctor {
	void treatPatient() {
// perform surgery
	}

	void makeIncision() {
// make incision (yikes!)
	}
}

```



```java
```
Source : [Head First Java 2nd Ed.]