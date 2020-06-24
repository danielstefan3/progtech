# Decorator
### videó: [link](https://www.youtube.com/watch?v=GCraGHx6gso&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=3)

##### Tankönyv szöveg:

 > A díszítő minta az átlátszó csomagolás klasszikus példája. Klasszikus példája a karácsonyfa. Attól,
hogy a karácsonyfára felteszek egy gömböt, az még karácsonyfa marad, azaz a díszítés átlátszó. Ezt
úgy érjük el, hogy az objektum összetételben szereplő mindkét osztály ugyanazon őstől származik,
azaz ugyanolyan típusúak. Ez azért hasznos, mert a díszítő elemek gyakran változnak, könnyen
elképzelhető, hogy új díszt kell felvenni. Ha díszítő egy külön típus lenne, akkor a karácsonyfa
feldolgozó algoritmusok esetleg bonyolultak lehetnek.
A díszítő mintánál egy absztrakt ősből indulunk ki. Ennek kétfajta gyermeke van, alap osztályok,
amiket díszíteni lehet és díszítő osztályok. A karácsonyfa példa esetén az alap osztályok a különböző
fenyőfák. A díszítő osztályokat általában egy absztrakt díszítő osztály alá szervezzük, de ez nem
kötelező.
A díszítés során az ős minden metódusát implementálni kell, úgy hogy, a becsomagolt példány
metódusát meghívjuk, illetve ahol ez szükséges, ott hozzáadjuk a plusz funkcionalitást. Kétféle
díszítésről beszélhetünk:
> * Amikor a meglévő metódusok felelősségkörét bővítjük. Ilyen a karácsonyfás példa.
> * Amikor új metódusokat is hozzáadunk a meglévőkhöz. Ilyen a Java adatfolyam (angolul:
stream) kezelése, illetve a lenti kölcsönözhető jármű példa.
>
> Mindkét esetben a példányosítás tipikusan így történik:
ŐsOsztály példány = new DíszítőN(…new Díszítő1( new AlapOsztály())…);
Mivel a csomagolás átlátszó, ezért akárhányszor becsomagolhatjuk a példányunkat, akár egy
díszítővel kétszer is. Ez rendkívül dinamikus, könnyen bővíthető szerkezetet eredményez, amit
öröklődéssel csak nagyon sok osztállyal lehetne megvalósítani.
Érdekes megfigyelni a minta UML ábráján, hogy a díszítő osztályból visszafelé mutat egy aggregáció
az ős osztályra. Ez az adatbázis kezelés Alkalmazott – Főnök reláció megoldásához hasonlít, amikor az
Alkalmazott tábla önmagával áll egy-több kapcsolatban, ahol a külső kulcs a főnök alkalmazott_ID
értékét tartalmazza.
