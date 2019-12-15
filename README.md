# JAVA



### Introducción

**Como funciona Java**

Java posee un proceso de compilación en el que se revisa que el código sea correcto, este proceso genera otro código que será interpretado en otra maquina.

Al escribir código en Java se escribe texto plano que posee una sintaxis, el proceso de compilación toma el texto plano y lo convierte a byte codes que será interpretado por una maquina virtual.

Esta maquina virtual es denominada JavaRuntimeEnviorenment



**Estructura de los archivos**

La estructura de los archivos Java deben poseer la siguiente sintaxis:

* El nombre del archivo DEBE comenzar con una mayúscula.
  * Esto es debido a que las clases de Java deben coincidir con el nombre del archivo para que no existan problemas con la compilación.
* El contenido del archivo debe poseer como mínimo la palabra reservada `class` acompañada del nombre del archivo.
  *  `class NombreDelArchivo{}`



**Datos primitivos**

Java es un lenguaje de programación de tipado estático, las variables en este tipo de lenguaje son de un tipo y no pueden ser modificado el tipo de dato.

**Ejemplo:**

```java
byte edad = 127;
short inventario = 32767;
int = 21; /* MI FAVORITO ABSOLUTO */
long largo = 21;
float decimal = 1.68;
double muyLargo = 21; 
boolean obtenerEstado = False;
char letra = 'C';
```

> Los tipos de dato string son considerados objetos, así es, una completa locura, aquí los llamaremos String, con mayúsculas, por que destacan .... y por que son objetos y esa es su sintaxis jeje.



**Sintaxis Básica**

```java
public class Example{
	public static void main(String args[]){
		System.out.println("Hello World!");
	}
}
```



**Método Main**

Para poder ejecutar cualquier código en Java se necesita el método main, su sintaxis es la siguiente:

```java
public static void main(String args[]){ /* OPC #1 */

}

public static void main(String []args){ /* OPC #2 */

}

public static void main(String ..args){  /* OPC #3 */
    
}
```



**Sumar dos números**

```java
class Suma{
    public static void main(String []args){
        int valorA;
        valorA = 10;
        int valorB = 20;

        int valorSuma = valorA + valorB;
        System.out.println("\nEl resultado es: " + valorSuma);
    }
}
```



**Constantes en Java**

```java
int cambia = 10;
int cambia = 20; /* Ahora vale 20 */

final int noCambia = 10;
int noCambia = 20; /* PROVOCA UN ERROR, No permite compilar */
```



**Suma de valores byte**

No podemos sumar valores del tipo byte debido a que al ser sumados son considerados como entero. Por ello nos vemos forzados a cambiar el resultado de la suma de los valores a entero, para que tenga sentido.

```java
class Tipos{
    public static void main(String []args){
        byte valorA = 5;
        byte valorB = 5;
        int sumaByte = valorA + valorB; /* Establecemos la variable como entero */
        System.out.println("\nEl resultado es: " + sumaByte);
    }
}
```



**Castear valores**

Otra forma es realizar un casteo para ello anteponemos entre paréntesis el tipo de dato al que deseamos convertir.

```java
class Tipos{
    public static void main(String []args){
        byte valorA = 5;
        byte valorB = 5;
        byte sumaByte = (byte) (valorA + valorB); /* Casteamos la variable */
        System.out.println("\nEl resultado es: " + sumaByte);
    }
}
```

> De esta forma nos aseguramos que los valores coincidan con el tipo de dato, por lo que se permite realizar la suma de los valores.



**Castear flotantes**

Si intentamos sumar dos valores decimales serán tomados como tipo double, por lo que debemos formatear el tipo de dato.



* **Forma 1**

```java
class Float{
    public static void main(String []args){
        float valorA = (float) 10;
        float valorB = (float) 5.5;
        float sumaByte = (valorA + valorB);
        System.out.println("\nEl resultado es: " + sumaByte);
    }
}
```



* **Forma 2**

```java
class Float{
    public static void main(String []args){
        float valorA = 10f;
        float valorB = 5.5f;
        float sumaByte = (valorA + valorB);
        System.out.println("\nEl resultado es: " + sumaByte);
    }
}
```

**Nota:** el casteo de float no basta en este caso, seguirá arrojando un error, por lo que la solución depende de la aplicación de los métodos anteriores.



**Obtener divisiones con resultado decimal**

Para obtener como resultado en una división un valor decimal debemos castear el valor del resultado de la operación y los valores asociados.

```java
class DivisionFlotante {
    public static void main(String []args){
        int valorA = 5;
        int valorB = 2;
        float divisionFlotante = (float) valorA / (float) valorB;
        System.out.println("\nEl resultado es: " + divisionFlotante);
    }
}
```



### Operaciones



**Pre incremento y Post incremento**

El **post incremento** obtiene el valor original de una variable y luego la incrementa.

El **pre incremento** incrementa el valor de una variable y luego obtiene su valor.

```java
class Incremento{
    public static void main(String []args){
        int valorA = 20;
        int valorB = valorA++; /* Post incremento */
        int valorC = ++valorA; /* Pre incremento */
        
        System.out.println("\nValor inicial: 20\n" + "\nVariable Original: " + valorA + "\nPost Incremento: " + valorB + "\nPre incremento: " + valorC);
    }
}
```

> Valor inicial: 20
>
> Variable Original: 22
> Post Incremento: 20
> Pre incremento: 22

**Recomendación:** Nunca utilizar los incrementos dentro de una operación, es mejor realizarlo previamente.

```java
valorA++;
++valorA;
```



### Ingresar Datos

Existen muchas formas de realizar una entrada y salida de datos, en este ejemplo veremos como conseguir una entrada de datos a nuestros programas.

- **Salida de datos:** Extraer información de nuestro programa al exterior.
- **Entrada de datos:** Ingresar información del exterior a nuestros programas.

Hasta el momento como salida hemos utilizado la consola del sistema ``System.out`` y el método ``println()`` para mostrar la información.

- **Scanner:** Es relativamente reciente, permite introducir información gracias a la Consola.

Tiene tres métodos principales:

- **nextLine():** Permite introducir texto.
- **nextInt():** Permite introducir enteros.
- **nextDouble():** Permite introducir doubles.


- **JOptionPane:** Permite construir una ventana para que el usuario introduzca datos.

Podemos hacerlo gracias al método ``showInputDialog()``, su inconveniente es que es estático (Depende de la clase siempre para ser utilizado, a diferencia de los métodos de String por ejemplo).

Esto no sucede con los métodos de **Scanner**, pues estos métodos simplemente dependen de que se le asigne un nombre a un objeto de Scanner y así poder utilizarlo libremente.

### Scanner

La clase Scanner tiene varios Constructores.

**Constructor:** Es un método especial, pues tiene el mismo nombre que la clase, las clases pueden tener o bien un solo método constructor o varios. Dependiendo de los argumentos que se le pasen al método constructor el objeto que creemos tendrá un **estado inicial distinto**.

Nosotros utilizaremos el primer método constructor, el cual permite construir un objeto del tipo Scanner que nos proporcionara un valor procedente del origen del archivo (***En este caso tomara información de la Consola***) con ``System.in``.
Los constructores dependen de anteponer la palabra ``new`` para poder utilizarlos.

``Scanner LeerDato = new Scanner(System.in);``

Scanner ***LeerDato*** es igual al constructor Scanner que va a tomar datos de origen de la consola del sistema.

- ***Recordar importar el paquete java.util***

Ahora pasamos por pantalla una solicitud para que el usuario ingrese un valor, con ``System.out.println("Ingrese un dato: ");``.

Por el momento no tenemos permitido introducir ninguna valor, es por eso que requerimos de los métodos **(nextLine();, nextInt();, nextDouble();)**.

- ***Recordemos que estos métodos al no ser estáticos dependen de haber creado previamente un objeto del tipo ``Scanner LeerDato = new Scanner(System.in);``***

Ahora para lograr ingresar datos lo hacemos de la siguiente manera: 

``String Nombre = LeerDato.nextLine();``

Ahora simplemente lo mostramos por pantalla con ``System.out.println("Tu nombre es: " + Nombre);``.

```java
import java.util.*;

public class ClaseScanner {

	public static void main(String[] args) {
		Scanner LeerDato = new Scanner(System.in);
		
		System.out.println("\nIngresa tu nombre:");
		String Nombre = LeerDato.nextLine();
		
		System.out.println("Ingresa tu edad:");
		int Edad = LeerDato.nextInt();
		
		System.out.println("Ingresa tu Cedula");
		int Identidad = LeerDato.nextInt();
		
		System.out.println("\nHola " + Nombre + ".");	
		System.out.println("Tu edad es: " + Edad + " Años.");
		System.out.println("Tu Cedula es: " + Identidad + ".");
	}
}
```

En el resto del código simplemente solicitamos valores numéricos para mostrar finalmente un resumen con todos los datos.



### JOptionPane

Ahora trabajaremos con **JOptionPane**, la cual pertenece al paquete ***javax.swing***, por lo que debemos importarlo y utilizaremos el método ``showInputDialog();``.

Existen varios tipos, todos los métodos ``showInputDialog();`` son estáticos, por lo que no dependemos de la creación de un objeto para utilizarlo. Utilizaremos el método para manejar Strings. ``String Nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");``.

Si ejecutamos así sin mas, se nos ejecutara una ventana solicitando introducir información. Podemos hacer exactamente lo mismo para solicitar la edad, el problema es que ***nuestro método solo acepta Strings***, así que tendremos que establecer la variable como una String.
Esto es un problema por que no podremos modificar ese valor como si se tratase de un numero (Sumar, Multiplicar, restar, etc...)
Por ende **se vuelve necesario convertir el valor**.

**Convertir valor:** Lo podemos hacer con ``parseInt();``, ***de esta forma pasamos SOLO de String a Entero***.
Lo que haremos será crear una nueva variable que nos convierta los valores seleccionados a enteros.

```java
import javax.swing.*;

public class ClaseJOptionPane {

	public static void main(String[] args) {
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
		System.out.println("Hola " + nombre + ".");
		
		
		String edad = JOptionPane.showInputDialog(nombre + ", introduce tu edad porfavor: ");
		int edadInt = Integer.parseInt(edad);
		System.out.println("Tienes " + edad + " Años.");
		
		String año = JOptionPane.showInputDialog(nombre + ", introduce un número, este sera sumado a tu edad.");
		int añoInt = Integer.parseInt(año);
		System.out.println(nombre + ", en " + año + " años más tendras: " + (edadInt+añoInt));
	}
}
```



### Condicionales



**Condicional If**

En el siguiente ejemplo revisamos si una variable es mayor que otra:

```java
class CondIf{
    public static void main(String []args){
        final int MAYORIA_EDAD = 18;
        int edad = 21;
        if(edad >= MAYORIA_EDAD){
            System.out.println("\nEs mayor de edad");
        }
        else{
            System.out.println("\nEs menor de edad");
        }
    }
}
```

**VER MÁS EJEMPLOS**



**Condicional Switch**

En el siguiente ejemplo un Switch básico:

```java
class CondSwitch{
    public static void main(String []args){
        int dia = 1;
        System.out.println("\n");
        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Que le pasa a tus semanas dios mio");
        }
    }
}
```



**Ciclo Do While**

Ejecutamos una porción de código aunque la condición indicada no se cumpla.

```java
class CicloDoWhile{
    public static void main(String []args){
        int i = 0;
        do{
            System.out.println("El valor es " + i);
            i++;
            if(i % 2 == 0){
                continue;
            }
            System.out.println("No se cumple la condición i == " + i);
        }while(i < 5);
    }
}
```

> El valor es 0
> El valor es 1
> El valor es 2
> El valor es 3
> El valor es 4



**Do While | If Continue**

A continuación utilizamos la palabra clave `continue` dentro de un condicional IF para detener la ejecución del código restante en el do siempre que se cumpla la condición.

```java
class IfContinue {
    public static void main(String []args){
        int i = 0;
        do{
            i++;
            if (i % 2 == 0){
                System.out.println("El valor es " + i);
                continue;
            }
            System.out.println("No se cumple la condición i == " + i);

        }while(i < 5);
    }
}
```

> No se cumple la condición i == 1
> El valor es 2
> No se cumple la condición i == 3
> El valor es 4
> No se cumple la condición i == 5



**Ciclo While**

```java
class CicloWhile{
    public static void main(String []args){
        int i = 0;

        while (i < 10){
            System.out.println("El valor es: " + i);
            i++;
            if(i == 5){
                break;
            }
        }
    }
}
```

> El valor es: 0
> El valor es: 1
> El valor es: 2
> El valor es: 3
> El valor es: 4



**Nota:** las condicionales extra que poseen un `break` o un `continue` son utilizadas para no procesar algunos elementos de arreglos, listas o mapas que deseamos recorrer.



**Ciclo For**

```java
class CicloFor{
    public static void main(String []args){
        for( int i = 0; i < 10; i++){
            System.out.println("Valor: " + i);
            if(i == 5){
                break;
            }
        }
    }
}
```

> Valor: 0
> Valor: 1
> Valor: 2
> Valor: 3
> Valor: 4
> Valor: 5



**Ciclo For Each**

```java
class CicloForEach{
    public static void main(String []args){

        String []nombres = new String []{"Carlos", "Damaris", "Dante", "Ale"};
        for (String nombre : nombres) {
            System.out.println("Soy: " + nombre);
        }
    }
}
```

> Soy: Carlos
> Soy: Damaris
> Soy: Dante
> Soy: Ale



**For Each en mapas**

Los mapas son elementos que poseen una clave y un valor. La forma en que estos son creados es la siguiente:

```java
import java.util.HashMap;
import java.util.Map;

class CicloForEachMapa{
    public static void main(String []args){

        Map<Integer, String> nombres = new HashMap<>();
        nombres.put(1, "Carlos");
        nombres.put(2, "Damaris");
        nombres.put(3, "Ale");

        nombres.forEach((id, name) -> {
            System.out.println("\nNombre: " + name + "\nID: " + id);
        });
    }
}
```

> Nombre: Carlos
> ID: 1
>
> Nombre: Damaris
> ID: 2
>
> Nombre: Ale
> ID: 3



### Arrays



Los arrays poseen dos características, poseen un tamaño fijo, solo puede contener elementos de un mismo tipo inclusive objetos, se definen de la siguiente forma:

```java
int numeros[]; /* Creamos un arreglo denominado "numeros"*/
numeros = new int [5]; /* Definimos su tamaño */
int numeros = new int [5]; /* Creamos un arreglo y le asignamos un tamaño */

Persona personas[] = new Persona[5]; /* Creamos un arreglo con un objeto */

int a[] = {3, 9, -20, 50}; /* Creamos un arreglo y les asignamos directamente el valor */
System.out.println(a[0]); /* Obtenemos el valor de la variable */
a[0] = 5; /* Modificamos el valor del primer elemento */
```



**Ordenar Array**

```java
class MetodoBurbuja{
    public static void main(String []args){

        int []valores = new int [4];

        for (int i = 0; i < valores.length; i++) { /* Asignamos valores aleatorios al array */
            valores[i] = (int) (Math.random() * 100);
        }
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores: " + valor);
        }
        for(int reco = 0; reco < valores.length - 1; reco++){ /* Ordenamos con el metodo burbuja */
            for(int element = 0; element < valores.length -1; element++){
                if( valores[element] > valores[element + 1]){
                    int temp = valores[element];
                    valores[element] = valores[element + 1];
                    valores[element + 1] = temp;
                }
            }
        }
        System.out.println("\n");
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores ordenados: " + valor);
        }
    }
}
```

> Valores: 52
> Valores: 43
> Valores: 8
> Valores: 2
>
> Valores ordenados: 2
> Valores ordenados: 8
> Valores ordenados: 43
> Valores ordenados: 52

**Nota: ** este método no se utilizan en producción.



**Búsqueda lineal**

Siempre que se almacenan elementos, se generan índices para que se pueda ordenar la información y la búsqueda sea más eficiente.

Este método no es muy eficiente, sin embargo sirve para buscar elementos concretos.

```java
class BusquedaLineal{
    public static void main(String []args){
        int []valores = new int [4];

        for (int i = 0; i < valores.length; i++) { /* Asignamos valores aleatorios al array */
            valores[i] = (int) (Math.random() * 100);
        }
        for(int valor : valores){ /* Mostramos los valores nuevos */
            System.out.println("Valores: " + valor);
        }

        valores[2] = 50;
        int busqueda = 50;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] == busqueda){ /* Busqueda Lineal */
                System.out.println("El número: " + busqueda + " existe en el indice #" + i);
                break;
            }
        }
    }
```

> Valores: 67
> Valores: 67
> Valores: 64
> Valores: 73
> El número: 50 existe en el índice #2

**Nota: ** este método no se utilizan en producción.