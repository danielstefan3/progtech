# Adapter (wrapper)
### videó: [link](https://www.youtube.com/watch?v=2PKQtcJjYvc&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=8)
Konnektor adaptereket mutat. Benéz egy cica.
4 minta amit könnyen össze lehet téveszteni:
* Adapter(illesztő) --> Arról szól, hogy kompatibilissá teszünk 2 különböző interfacet ami nem kompatibilis
    * Kompitibilissá teszi az interfaceket 
* Facade(homlokzat?) --> Arról szól, hogy veszünk egy pár komplex interakciót és készítünk egy facedeot a helyett hogy a komplex interakciókat használnánk?
    * Elrejt komplex logikát
* Proxy(helyettes) --> Arról szól, hogy készítünk egy helyettest a közé amit hívni akarunk (okok: biztosnsági okok, caching...)
    * Intercepts calls, and adds controlled access to the underlined object
* Decorator(díszítő) --> Viselkedést adunk egy objektumhoz, a nélkül, hogy változtatnánk az objektumon.
    * Viselkedést ad az objektumokhoz, amiket decorálunk.


Különböző fali villásdugókkaldugókkal és travel adapterekkel példálózik.
NodeJS reduce metódusát hozza még fel, itt a paraméterek sorrendje cserélődik egy újabb verzióban.
Objektum összetételes példát hoz fel nem öröklődéseset. (többszörös öröklődés kell hozzá)

A lényeg hogy a viselkedésen ne változtassunk. (példának a trafót hozza fel a laptopján, az nem adapter lenne, mert a feszültségváltozáshoz a viselkedésén kell változtatni szal az pl decorator lenne)
Arra kell az adapter hogy a viselkedését használhassuk de ne módosítsunk rajta.
### Tankönyv szöveg:

Az illesztő (angolul: adapter) tervezési minta arra szolgál, hogy egy meglévő osztály felületét hozzá
igazítsuk saját elvárásainkhoz. Leggyakoribb példa, hogy egy régebben megírt osztályt akarunk
újrahasznosítani úgy, hogy beillesztjük egy osztály hierarchiába. Mivel ehhez hozzá kell igazítani az ős
által előírt felülethez, ezért illesztő mintát kell használnunk.
A régi osztályt ilyen estben gyakran illesztendőnek (adaptee) hívjuk. Az illesztő és az illesztendő
között általában kompozíció van, azaz az illesztő kizárólagosan birtokolja az illesztendőt. Ezt gyakran
úgy is mondjuk, hogy az illesztő becsomagolja az illesztendőt. Ennek megfelelő az illesztő minta másik
angol neve a Wrapper. Ugyanakkor ez a becsomagolás nem átlátszó, hiszen az illesztő nem nyújtja az
illesztendő felületét. 

### PéldaKód képe:
![AdapterExampleUML](https://refactoring.guru/images/patterns/diagrams/adapter/example.png)
