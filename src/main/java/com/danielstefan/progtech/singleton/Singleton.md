# Singleton
### videó: [link](https://www.youtube.com/watch?v=hUE_j6q0LTQ&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=7&t=0s)
Csávó szerint ez inkább codesmell.
> "One man's constant is another man's variable"

### Tankönyv szöveg:
 > Gyakori feladat, hogy egy osztályt úgy kell megírnunk, hogy csak egy példány lehet belőle. Ez nem
  okoz gondot, ha jól ismerjük az objektum orientált programozás alapelveit. Tudjuk, hogy az osztályból
  példányt a konstruktorával készíthetünk. Ha van publikus konstruktor az osztályban, akkor akárhány
  példány készíthető belőle. Tehát publikus konstruktora nem lehet az egykének. De ha nincs
  konstruktor, akkor nincs példány, amin keresztül hívhatnánk a metódusait. A megoldás az osztály
  szintű metódusok. Ezeket akkor is lehet hívni, ha nincs példány. Az egykének van egy osztály szintű
  szerezPéldány (angolul: getInstance) metódusa, ami mindenkinek ugyanazt a példányt adja vissza.
  Természetesen ezt a példányt is létre kell hozni, de a privát konstruktort a szerezPéldány hívhatja,
  hiszen ő is az egyke osztály része.

1. Ensure that a class has just a single instance.
2. Provide a global access point to that instance.

All implementations of the Singleton have these two steps in common:

* Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
* Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.

If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that method is called, the same object is always returned.

![singletonUML](https://refactoring.guru/images/patterns/diagrams/singleton/structure-en-indexed.png)
 1. The Singleton class declares the static method getInstance that returns the same instance of its own class.
 
    The Singleton’s constructor should be hidden from the client code. Calling the getInstance method should be the only way of getting the Singleton object.