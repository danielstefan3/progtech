#Prototype
###videó:
nada
###Tankönyv szöveg:
A prototípus tervezési minta fő technikája a klónozás. A klónozás feladata, hogy az eredeti
objektummal megegyező objektumot hozzon létre. Erre az egyszerű értékadás nem alkalmas, mert
azok csak az objektum referenciáját másolják, így a két referencia ugyanoda mutat. A klónozásnak két
fajtája van:

* sekély klónozás (angolul: shallow copy),
* mély klónozás (angolul: deep copy).

A különbség, hogy sekély esetben az osztály referenciáit ugyanúgy másoljuk, mint az elemi típusait.
Mély klónozásnál az osztály referenciái által mutatott objektumokat is klónozzuk.

![prototypeUML](https://refactoring.guru/images/patterns/diagrams/prototype/structure.png)

1. The Prototype interface declares the cloning methods. In most cases, it’s a single clone method.
2. The Concrete Prototype class implements the cloning method. In addition to copying the original object’s data to the clone, this method may also handle some edge cases of the cloning process related to cloning linked objects, untangling recursive dependencies, etc.
3. The Client can produce a copy of any object that follows the prototype interface.

![prototypeUML](https://refactoring.guru/images/patterns/diagrams/prototype/example.png)