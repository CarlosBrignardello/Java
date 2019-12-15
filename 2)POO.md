# Programación orientada a Objetos en Java



La programación orientada a objetos es un paradigma, posee ciertas bases y pilares.

* **Abstracción:** consiste en aislar un elemento de la naturaleza que se toma como un objeto mediante sus características.
* **Encapsulación:** proceso en que se protegen las características de un objeto contra modificaciones.
* **Herencia:** proceso en que se toman las características de un objeto a otro.
* **Polimorfismo:** permite crear diferentes formas de una forma base, esta relacionado con la herencia, permite comunicar objetos utilizando una misma sintaxis, teniendo distintos objetos pueden realizar la misma acción con una misma sintaxis.



Una clase es una especie de plano de cada uno de los objetos que serán creados, la clases poseen atributos(propiedades) y métodos(comportamiento).

Los objetos son instancias(elemento creado a partir de una clase) de una clase.

Para trabajar con el encapsulamiento existen los métodos Getters y Setters, permiten asignar valores a los atributos para luego obtenerlos, sirven para proteger la información.





### CLASES

**Crear clase** 

```java
class Persona{
    // Atributos
    // "private" permite proteger los atributos los métodos
    private String nombre; 
    private int edad;
    private float peso;
    private float estatura;

    // Métodos para trabajar los atributos desde otras clases
    // Setters and Getters
    void setNombre(String n){
        this.nombre = n;
    }
    String getNombre(){
        return this.nombre;
    }
    void setEdad(int e){ // Protegemos el atributo
        if(e < 0 || e > 120){
            System.out.println("Edad no válida");
        }
        else{
            this.edad = e;
        }
    }
    int getEdad(){
        return this.edad;
    }
    void setPeso(float p){
        this.peso = p;
    }
    float getPeso(){
        return this.peso;
    }
    void setEstatura(float e){
        this.estatura = e;
    }
    float getEstatura(){
        return this.estatura;
    }
}
```

> Podemos crear clases independientes las cuales serán llamadas mediante clases principales, en este caso la clase se encarga de definir los atributos de una persona y posee métodos para que sean obtenidos mediante otras clases.



**Clase principal**

```java
class Base{
    public static void main(String []args){
        Persona persona = new Persona(); // Creamos instancia
        persona.setNombre("Carlos Brignardello");
        persona.setEdad(21);
        persona.setPeso(84f);
        persona.setEstatura(1.68f);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Estatura: " + persona.getEstatura());
    }
}
```

> Mediante nuestra clase principal generamos una instancia de la clase persona para poder trabajar con ella, definimos los valores gracias a los métodos Setter generados en la clase Persona y posteriormente los mostramos y obtenemos mediante los métodos Getter.



**Constructor**

Mediante constructores podemos generar instancias con unos atributos ya definidos.

```java
    // Constructor
    public Persona(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.peso = 0f;
        this.estatura = 0f;
    }
    public Persona(String name, int edad, float peso, float estatura){ // Sobre carga
        this.nombre = name;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
```

>
> En el mismo ejemplo anterior creamos un constructor convencional que define los valores iniciales y posteriormente utilizamos otro constructor, esto recibe el nombre de sobre carga de constructor, se trata de escribir un método con el mismo nombre, pero con distinta firma, en este caso al definir el constructor desde otra clase será posible definir sus valores inmediatamente.



```java
class Base{
    public static void main(String []args){
        Persona persona = new Persona(); // Creamos instancia
        Persona damaris = new Persona("Damaris Bejar", 21, 68f, 1.65f);
        
        persona.setNombre("Carlos Brignardello");
        persona.setEdad(21);
        persona.setPeso(84f);
        persona.setEstatura(1.68f);

        System.out.println("\nNombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Peso: " + persona.getPeso());
        System.out.println("Estatura: " + persona.getEstatura());

        System.out.println("\nNombre: " + damaris.getNombre());
        System.out.println("Edad: " + damaris.getEdad());
        System.out.println("Peso: " + damaris.getPeso());
        System.out.println("Estatura: " + damaris.getEstatura());
    }
}
```

> Al instanciar declaramos directamente todos los valores de los atributos del objeto.





### PAQUETES

Java permite organizar el código en paquetes, se trata de carpetas en las que se va organizando el código. En primer lugar permite tener el código ordenado, al trabajarse en proyectos grandes, se van a crear clases que tienen a tener el mismo nombre, esto puede ocasionar problemas si no se tienen divididos en paquetes.



**Modificadores**

Permiten controlar el acceso a los atributos o a los métodos de una clase, existen cuatro:



* **public:** puede ser accedido desde cualquier clase.
* **private:** puede ser accedido SOLO desde su propia clase.
* **default:** es el que viene por defecto, puede ser accedido desde su propia clase, las clases del mismo paquete y las clases heredadas del mismo paquete, NO pueden heredar a otros paquetes.
* **protected:** puede ser accedido desde su clase, clases en otros paquetes, puede heredar desde otros paquetes.



**Public**

* Podemos acceder desde cualquier parte.

```java
package Public.paquete01;

public class Persona {
    public int edad;
}
```

> Esta clase es utilizada para crear objetos desde otras clases.



```java
package Public.paquete01;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 35;
        System.out.println(p.edad);
    }
}
```

> Utilizamos esta clase para obtener atributos de una clase publica ubicada en el mismo paquete.



```java
package Public.paquete02;
import Public.paquete01.Persona;    // Importamos el paquete y la clase

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 10;
        System.out.println(p.edad);
    }
}

```

> Utilizamos esta clase para obtener atributos de una clase publica ubicada en otro paquete.



**Private**

* Podemos acceder SOLO desde la misma clase.

```java
package Private.paquete01;

public class Persona {
    private int edad;
}
```

> Esta clase es utilizada para crear objetos desde otras clases.



```java
package Private.paquete01;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 35;
        System.out.println(p.edad);
    }
}
```

> Utilizamos esta clase para obtener atributos de una clase publica ubicada en el mismo paquete, NO es posible sin métodos Getters y Setters.



```java
package Private.paquete02;
import Private.paquete01.Persona;    // Importamos el paquete y la clase

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 10;
        System.out.println(p.edad);
    }
}
```

> Utilizamos esta clase para obtener atributos de una clase privada ubicada en otro paquete, NO es posible sin el uso de métodos getters y setters.



**Default**

* Es posible acceder mediante el clases del mismo paquete.

```java
package Default.paquete01;

public class Persona {
    int edad;
}

```

> Esta clase es utilizada para crear objetos desde otras clases.



```java
package Default.paquete01;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 35;
        System.out.println(p.edad);
    }
}
```

> Utilizamos esta clase para obtener atributos de una clase por defecto ubicada en el mismo paquete.



```java
package Default.paquete02;

import Private.paquete01.Persona;

public class Ejecutar02 {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.edad = 10;
        System.out.println(p.edad);
    }
}
```

> Utilizamos esta clase para obtener atributos de una clase por defecto ubicada en otro paquete, NO es posible sin el uso de métodos getters y setters.



* Es posible acceder desde una clase que hereda desde el mismo paquete



```
package Default.paquete01;

public class Herencia extends Persona {
    public void saludar(){
        System.out.println("Mi edad es: " + edad);
    }
}

```

> Esta clase utiliza la herencia de clase.



```
package Default.paquete01;

/*
Utilizamos esta clase para obtener atributos de una clase por defecto ubicada en el mismo paquete.
*/

import java.net.http.HttpRequest;

public class Ejecutar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Herencia estudiante = new Herencia();

        p.edad = 35;
        System.out.println(p.edad);
        estudiante.edad = 21;
        estudiante.saludar();
    }
}
```

> Confirmamos que es posible acceder a una tributo mediante la herencia.

**Nota:** La herencia con distintos paquetes no funciona.



**Protected**

Finalmente con protected ocurre lo mismo que con Default salvo que si se puede trabajar la herencia en distintos paquetes.



### Miembros Estáticos

Todos aquellos atributos o métodos a los que se les antepone la palabra static hacen que ese atributo o método se conviertan en atributos o métodos de clase, es decir que no se requerirá de instanciar el objeto para poder acceder a el.



**Creamos un método estático**

```java
package Static;

public class Mátematicas {
    public static int sumar(int a, int b){
        return a + b ;
    }
}
```



**Ejecutamos el método sin instanciar**

```java
package Static;

public class PruebaStatic {
    public static void main(String[] args) {
        int result = Mátematicas.sumar(3, 4); // Clase.método();
        System.out.println("El resultado es: " + result);
    }
}
```



**Ejemplo #2 - Atributo estático**

```java
package Static;

public class Mátematicas {
    public static float PI = 3.1416f;
}
```

```java
package Static;

public class PruebaStatic {
    public static void main(String[] args) {
        System.out.println("El valor de Pi es: " + Mátematicas.PI);
    }
}
```



### Herencia

Se puede heredar de otras clases sus características y comportamientos. Java no soporta la multi herencia, SOLO se puede heredar de una sola clase.



**Creamos la clase que será heredada**

```java
package Herencia.clases;

public class Persona {
    public String nombre;
    public int edad;
    public float altura;
    public float peso;

    public void saludar(){
        System.out.println("Hola soy: " + nombre);
    }

    public void comer(){
        System.out.println("Para esta basura de comida mejor no me des nada");
    }
}
```



**Creamos la clase que hereda**

```
package Herencia.clases;

public class Profesor extends Persona { // Heredamos las caracteristicas de otra clase.
    public void enseñar(String asignatura, int horas){
        System.out.println("Voy a enseñarte " + asignatura + " durante " + horas + " horas.");
    }
}
```

> Utilizamos la palabra clave `extends` para heredar de otra clase.



**Probamos las clases**

```java
package Herencia.ejecutar;

import Herencia.clases.Persona;
import Herencia.clases.Profesor;

public class Main {
    public static void main(String[] args) {
        Persona carlos = new Persona();
        Profesor juan = new Profesor();
        carlos.nombre = "Carlos";
        carlos.saludar();
        
        juan.nombre = "Juan";
        juan.saludar();
        juan.comer();
        juan.enseñar("Redes IV", 7);
    }
}
```



### Sobre escritura de métodos

La sobre escritura de métodos permite cambiar el comportamiento de un método, se hace sobre la herencia/polimorfismo.

Se denota de la siguiente forma:

```java
@Override
public void método(){
	........
}
```



**Crear clases base**

```java
package sobreEscritura;

public class Pobre {
    public String nombre;
    public int edad;

    public void saludar(){
        System.out.println("Hola, soy " + this.nombre);
    }
    public void comer(){
        System.out.println("Fideos con salsa, que delicia!");
    }
    public void salario(){
        System.out.println("Necesito más!");
    }
    public void dormir(){
        System.out.println("Me ire a dormir");
    }
}
```



**Sobre escribir Método**

```java
package sobreEscritura;

public class Rico extends Pobre {

    public void invertir(){
        System.out.println("Voy a invertir, como me sobra el dinero...");
    }

    @Override	// Sobre escribimos un método
    public void comer() {
        System.out.println("Iré a un restaurant");
    }
}
```



**Ejecutamos**

```java
package sobreEscritura;

public class Main {
    public static void main(String[] args) {
        Pobre pobre = new Pobre();
        Rico rico = new Rico();

        pobre.nombre = "Carlos";
        pobre.saludar();
        pobre.salario();
        pobre.comer();

        rico.nombre = "Damaris";
        rico.saludar();
        rico.salario();
        rico.comer();
        rico.invertir();
    }
}
```



### Super

La palabra super hace referencia al constructor de la clase que estamos heredando, lo podemos utilizar para manipular o seleccionar un constructor heredado de forma abreviada.



EJEMPLO



### Clases abstractas

Con las clases abstractas no se podrá instanciar objetos de dicha clase, solo se podrá instanciar objetos de clases concretas, que hereden de la clase abstracta.



**Crear clase abstracta**

```java
package claseAbstracta;

public abstract class Persona { // Creamos una clase abstracta
    public String nombre;
    public int edad;

// No utilizamos constructores
/*    public Persona(){
        this.nombre = "Desconocido";
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
*/
    public void saludar(String mensaje){
            System.out.println(mensaje);
    }

    public abstract void reirse(); // Creamos método que debera ser implementado por otras clases.
}
```

> En las clases abstractos no utilizamos constructores pues nunca podremos instanciar la clase. Es posible volver abstractos los métodos, de esta forma no poseen contenido lo que los obligara a sobre escribirlos en otras clases en caso de heredar la clase que posee los métodos abstractos.



**Heredamos la clase**

```java
package claseAbstracta;

public class PersonaNivelDos extends Persona {

    @Override
    public void reirse() {
        System.out.println("La clase abstracta me ha heredado esta capacidad\nJAJAJAJAJA");
    }
}
```

> Es obligatorio sobre escribir los métodos abstractos al heredar una clase que los posee.



**Ejecutamos**

```java
package claseAbstracta;

public class Main {
    public static void main(String[] args) {
    //  Persona pobre = new Persona(); // No podemos instanciar
        PersonaNivelDos carlos = new PersonaNivelDos();
        carlos.reirse();
    }
}

```

> No podemos instanciar las clases abstractas, sin embargo podemos utilizar la herencia para implementar sus características.



### Polimorfismo (Interfaces)

Con las interfaces es posible generar diferentes formas (Polimorfismo) que poseen comportamiento similar a nivel de sintaxis, se pueden llamar diferentes objetos que son de distintas clases a las cuales se les puede dar la misma orden si poseen la misma interfaz.



Si por ejemplo poseemos una interfaz llamada figura, podemos mediante métodos obtener área y perímetro, puedo tener unas clases denominadas cuadrado, circulo y  triangulo. Todas estas clases deben implementar los mismos métodos.



**Generamos una interfaz**

```java
package polimorfismo;

public interface Figuras {
    double PI = Math.PI;
    String getFigura();
    double getArea();
}
```

> Las interfaces utilizan la palabra clave `interface`, solo pueden tener atributos en formato de constante(final), estos son indicados de forma automática por lo que no es necesario indicarlo.
>
> Todos los métodos implementados en la interfaz deben ser implementados en las clases que hereden.



**Generamos las clases**

```java
package polimorfismo;

public class Rectangulo implements Figuras{
    String figura = "Rectangulo";
    double alto;
    double ancho;

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    public String getFigura(){
        return figura;
    }
    @Override
    public double getArea() {
        return this.alto * this.ancho;
    }
}
```

> En cada caso debemos heredar la interfaz para trabajar el polimorfismo y al mismo tiempo debemos implementar cada método.



```java
package polimorfismo;

public class Circulo implements Figuras {
    String figura = "Circulo";
    double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    public String getFigura(){
        return figura;
    }
    @Override
    public double getArea() {
        return PI * this.radio * this.radio;
    }
}
```



```java
package polimorfismo;

public class Triangulo implements Figuras{
    String figura = "Triangulo";
    double base;
    double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public String getFigura(){
        return figura;
    }

    @Override
    public double getArea() {
        return (this.base * this.altura) / 2;
    }
}
```



**Ejecutamos el código**

```java
package polimorfismo;

public class Ejecutar {
    public static void main(String[] args) {
    Figuras formas[] = new Figuras[3];
    formas[0] = new Rectangulo(20, 30);
    formas[1] = new Circulo(15);
    formas[2] = new Triangulo(10, 20);

    for(Figuras v: formas){
        System.out.println("\nEl área del " + v.getFigura() + " es " + v.getArea());
        }
    }
}
```

