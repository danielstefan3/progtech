# Singleton
### videó: [link](https://www.youtube.com/watch?v=EcFVTgRHJLM&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=4)
3 factory:
1. sima factory (nem igazán pattern)
2. factory method
3. abstract factory

Elmondja hogy más példát választott, mint ami a könyvben van mert ő azt nem értette.

Példa:
1.
    * superclass Animal, subclass: Cat, Dog, Duck
    * National Park simulator: spawnol Cat, Dog, Duck
    * RandomFactory, BalancedFactory ...
2.
    * játék: pályák, űrben aszteroidák és ki kell kerüli őket, ha szétlövöm több lesz belőle
    * createObstecale (createAsteroid, createPowerups...)
    * a pályák erősségét paraméterben adja át mintha egy szorzó lenne például (aszteroida nagysága, sebessége)
### Tankönyv szöveg:
Ezzel a mintával lehet szépen kiváltani a programunkban lévő rengeteg hasonló new utasítást. A
minta leírja, hogyan készítsünk gyártófüggvényt. Ezt magyarul gyakran készít, angolul a create szóval
kezdjük. A gyártófüggvény a nevében magadott terméket adja vissza, tehát a készítKutya (createDog)
egy kutyát, a készítMacska (createCat) egy macskát. Ez azért jobb, mint a new Kutya() vagy a new
Macska() konstruktor hívás, mert itt az elkészítés algoritmusát egységbe tudjuk zárni. Ez azért 
106
előnyös, mert ha a gyártás folyamata változik, akkor azt csak egy helyen kell módosítani. Általában a
gyártás folyamata ritkán változik, inkább az a kérdés mit kell gyártani, azaz ez gyakran változik, ezért
ezt az OCP elvnek megfelelően a gyermek osztály dönti el.
Tehát az ősben lévő gyártómetódus leírja a gyártás algoritmusát, a gyermek osztály eldönti, hogy mit
kell pontosan gyártani. Ezt úgy érjük el, hogy az algoritmus 3 féle lépést tartalmazhat:

* A gyártás közös lépései: Ezek az ősben konkrét metódusok, általában nem virtuálisak, illetve
Java nyelven final metódusok.
* A gyártás kötelező változó lépései. Ezek az ősben absztrakt metódusok, amiket a gyermek
felülír, hogy eldöntse, hogy mit kell gyártani. A gyermek osztályok itt hívják meg a termék
konstruktorát.
* A gyártás opcionális lépései: Ezek az ősben hook metódusok, azaz a metódusnak van törzse,
de az üres. Ezeket az OCP elv megszegése nélkül lehet felülírni az opcionális lépések
kifejtéséhez.

Jó példa a gyártó metódusra az Office csomag alkalmazásaiban lévő Új menüpont. Ez minden
alkalmazásban létrehoz egy új dokumentumot és megnyitja. A megnyitás közös, de a létrehozás más
és más. A szövegszerkesztő esetén egy üres szöveged dokumentumot, táblázatkezelő esetén egy üres
táblázatot kell létrehozni.
Érdekes megfigyelni, hogy az absztrakt ős és a gyermek osztályai IOC (inversion of control)
viszonyban állnak. Azaz nem a gyermek hívja az ős metódusait, hanem az ős a gyermekét. Ezt úgy
érjük el, hogy a gyártófüggvény absztrakt, illetve virtuális metódusokat hív. Amikor a gyermek osztály
példányán keresztül hívjuk majd a gyártófüggvényt, akkor a késői kötés miatt ezen metódusok
helyett az őket felülíró gyermekbéli metódusok fognak lefutni.

![FacotryMethodUML](https://refactoring.guru/images/patterns/diagrams/factory-method/structure.png)
1. The Product declares the interface, which is common to all objects that can be produced by the creator and its subclasses.
2. Concrete Products are different implementations of the product interface.
3. The Creator class declares the factory method that returns new product objects. It’s important that the return type of this method matches the product interface.
   
   You can declare the factory method as abstract to force all subclasses to implement their own versions of the method. As an alternative, the base factory method can return some default product type.
   
   Note, despite its name, product creation is not the primary responsibility of the creator. Usually, the creator class already has some core business logic related to products. The factory method helps to decouple this logic from the concrete product classes. Here is an analogy: a large software development company can have a training department for programmers. However, the primary function of the company as a whole is still writing code, not producing programmers.
4. Concrete Creators override the base factory method so it returns a different type of product.
   
   Note that the factory method doesn’t have to create new instances all the time. It can also return existing objects from a cache, an object pool, or another source.