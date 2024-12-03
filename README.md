# 3.2--Patterns2-Nivell3

#Nivell 1

En tots els exercicis, crea un projecte Gradle amb una classe Main que demostri l'ús del patró (amb les invocacions que es necessitin).

Builder
Desenvolupa un sistema de gestió de comandes de pizzes utilitzant el patró de disseny Builder en Java. El sistema ha de permetre la creació de diferents tipus de pizzes amb configuracions de mida, massa i ingredients diferents.

Defineix una classe Pizza amb els següents atributs:
size (mida)
dough (tipus de massa)
toppings (ingredients)
Crea una interfície PizzaBuilder amb els mètodes necessaris per configurar la mida, la massa i els ingredients d'una pizza.
Implementa una o més classes que actuïn com a constructors concrets (PizzaBuilder) per a diferents tipus de pizzes. Per exemple, podries tenir un constructor per a la pizza hawaiana, un altre per a la pizza vegetariana, etc.
Desenvolupa una classe MestrePizzer que rebi un PizzaBuilder i que permeti construir pizzes de manera específica.
En el programa principal (Main), crea instàncies de PizzaBuilder i de MestrePizzer, i utilitza'ls per construir pizzes amb diferents configuracions.


#Nivell 2

Observer
Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers) canvis quan la Borsa puja o baixa.

És necessari que l'objecte Observable mantingui referències als Observers.


#Nivell 3

Callback
Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: targeta de crèdit, Paypal o deute en compte bancari.

La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
La classe que invoca la passarel·la de pagament serà una botiga de sabates.

