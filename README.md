# Interfaces

Las Interfaces definen un contrato publico que usa un cliente.
La palabra _interfaz_ tiene dos significados, uno es el de la palabra
reservada de java y el otro es el de una interfaz como un concepto 
abstracto de ese contrato a utilizar, una interfaz puede ser también 
un puerto usb, en el cual podemos conectar centenares de artefactos mientras
cumplan con esas especificaciones, igualmente eso ocurre con las interfaces 
en programación, en nuestro ejemplo de los comestibles cualquiera que implemente
nuestra interfaz debera ser capaz de decir la manera en que se prepara ese 
comestible, programar hacia las interfaces o la abstracción no es más que
programar hacia los super tipos.

## comparacion de interfaces y clases abstractas

interfaces                                       | clases abstractas
---|---
no se puede instanciar                           | idem
Todas las variables deben ser public static final| no tiene restricciones
los metodos deben ser todos publicos y abstractos| no tiene restricciones


## cuando usar clases abstractas y cuando usar interfaces

Tanto las interfaces como las clases abstractas pueden servirnos como nuestro super tipo, 
sin embargo son conceptos diferentes, las clases nos sirven para agrupar tipos que tengan 
las mismas características y por lo general tienen ademas tienen variables de instancia 
(o sea tiene estado); en cambio las interfaces solo definen comportamiento.
En java casi todas las clases implementan la interfaz comparable que sirve para comparar 
los objetos, pero no es correcto decir por ejemplo que un animal sea un comparable.
Una de las grandes ventajas de las interfaces es que nos permiten tener el código menos 
acoplado (es un concepto que se ve extensamente a lo largo de la materia); pero además
nos permite utilizar características similares a la herencia multiple (algunos lenguajes como c++
permiten heredar de mas de una clase, mientras esto trae cierto flexibilidad también genera 
inconvenientes) en java para lograr los beneficios de la herencia multiple utilizamos las
interfaces, ya que si bien no podemos extender de más de una clase podemos implementar
todas las interfaces que queramos, así por ejemplo nuestra clase Pollo del ejemplo además de 
"ser" comestible(digo ser en el sentido polimorfico de se puede usar como ) tambien puede ser
 comparable.

                  
