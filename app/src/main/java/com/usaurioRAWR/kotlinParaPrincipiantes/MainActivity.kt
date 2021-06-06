package com.usaurioRAWR.kotlinParaPrincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Leccion 1
            variablesYConstantes()
        // Leccion 2
            tiposDeDatos()
    }

    // <Inicio> Aqui vamos a hablar de variables y constantes.--------------------------------------

    private fun variablesYConstantes() {
        // <Inicio> Variables-----------------------------------------------------------------------
            var myFirstVariable = "Hola mundo :3"
            var myFirstNumber = 1
            println(myFirstVariable)

            // Una Variable puede cambiar su valor a lo largo de la ejecucion.
            myFirstVariable = "Bienvenmidos a mi Variable"
            println(myFirstVariable)

            /*
                +. myFirstVariable = 1
                    -. Error; The integer literal does not conform to the expected type String
                    -. trad. direc.> El literal entero no se ajusta al tipo esperado String.
                    -. trad> El numero entero no se ajusta al tipo (de variable) esperado String.

                    * No podemos asignar un tipo Int a una variable de tipo String

                    ** Da error debido a que la variable "myFirstVariable" es de tipo Texto(String)
        y nosotros le estamos introduciondo un valor de tipo numero entero(Int).

                +. ¿Cuando hemos definido que tipo de variable es?
                    -. Definimos indirectamente el tipo de variable, al escribirla por primera vez.
                    -. Kotlin asigna automaticamente el tipo de variable que es, respecto al tipo de
        informacion que le introduciendo por primera vez.
            */
            var mySecondVariable = "Suscribete!"
            println(mySecondVariable)

            mySecondVariable = myFirstVariable
            println(mySecondVariable)

            myFirstVariable = "¿Ya te has suscrito?"
            println(myFirstVariable)
        // <Fin> Variables--------------------------------------------------------------------------
        // <Inicio> Constantes----------------------------------------------------------------------
            val myFirstConstant = "¿Te ha gustado el tutorial?"
            println(myFirstConstant)
            /*
                myFirstConstant = "Si te ha gustado, dale LIKE"
                    Error; Val cannot be reassigned
                        trad. direc.> Val no se puede reasignar

                * Una constante no puede modificar su valor
             */
            // Una constante puede obtener el valor de una variable.
                val mySecondConstant = myFirstVariable
                println(mySecondConstant)
        // <Fin> Constantes-------------------------------------------------------------------------
    }
    // <Fin> Aqui terminamos de hablar de variables y constantes.-----------------------------------
    // <Inicio> Aqui vamos a hablar de tipos de datos (data types) principales.---------------------

    private fun tiposDeDatos() {
        /* El tipo de dato va a definir el tipo de valor de nuestra variable o constante y las
        operaciones que podemos realizar con estos datos. */
        // <Inicio> String (Cadena)-----------------------------------------------------------------
            // Este tipo de dato va a representar una cadena de texto
            val myString1 = "Hola myString"
            /*
                -. Como podemos observar en nungun sitio hemos indicado de que esta varible es de tipo String.
                Porque Kotlin tiene una caracteristica llamada "la diferecia de tipos" y esto no es
        nadamas, ni nada menos que kotlin es capaz de saber a que tipo de datos no estamos refiriendo
        unicamente por como lo estamos representando.

                -. En este caso, cualquier cadena de texto tiene que ir entre comillas dobles simples(" "),
        por lo que kotlin automaticamente deduce y declara que la variable a declarar es de tipo String.

                +. Seria lo mismo que nosotros a continuacion de la variablle o constante pusieramos "dos
        puntos + espacio + palabra reserbada para el tipo de dato"
                    -. Ej.
                        val myString: String = "Hola myString"
                    -. Pero el propio Android Studio nos diria que esto es redundante ya tiene una
                    caracteristica a la que llaman "la diferecia de tipos"
            */
            val myString2 = "Biembenido a Kotlin"
            /* <Inicio> Operaciones que podemos realizar con los datos de tipo String.------------------
                    +. Juntarlos / sumerlos.
                        +. Sintaxis;
                            -. val nombreDeLaNuevaVariable = variableAJuntar + variableASumar
                        +. Ej.
                            +. Entrada;
                                - val myString3 = myString1 + myString2
                            +. Salida;
                                - Hola myStringBiembenido a Kotlin

                        +. Para crear un espacion entre las dos variables sumaremos <" "> entre las dos.
                            +. Ej.
                                -. val myString3 = myString1 + " " + myString2
           <Fin> Operaciones que podemos realizar con los datos de tipo String.---------------------- */
            val myString3 = myString1 + " " + myString2
            println(myString3)
        // <Fin> String (Cadena)--------------------------------------------------------------------
        // <Inicio> Enteros (Byte, Short, Int, Long)------------------------------------------------
            /* <Inicio> Tipos de numeros enteros.---------------------------------------------------
                +. La unica diferencia entre los cuatro tipos de numeros enteros; Byte, Short, Int and
    Long es la longitud del numero que podemos escribir.
                    -. Byte; Numeros entre -127 y 128.
                    -. Short; Numeros entre -32.768 y 32.767
                    -. Int; Numeros entre -2.147.483.647 y 2.147.483.647
                    -. Long; Numeros entre -9.223.372.036.854.775.807 a 9.223.372.036.854.775.807

                -. La recomendacion es utilizar el tipo de dato que mejor se adapte "a la posible
    longitud, para que asi ocupe menos en memoria".

                -. Lo mas normal es trabajar casi siempre con numeros enteros de tipo Int y cuando
    son muy muy grandes, de tipo long
             <Fin> Tipos de numeros enteros.------------------------------------------------------*/
            val myInt = 1 // Kotlin dara siempre por sentado que es de tipo Int.
            val myInt2 = 2
            val myInt3 = myInt + myInt2
            println(myInt3)
        // <Fin> Enteros (Byte, Short, Int, Long)---------------------------------------------------
        // <Inicio> Decimales (Float; 32bits, Double; 64bits)---------------------------------------
            val myDouble = 1.5 // Kotlin dara siempre por sentado que es de tipo Double.
            val myFloat: Float = 1.5f // Para indicar que es de tipo Float se debe de hacer asi.
            val myDouble2 = 1.6
            val myDouble3 = 2 // En realidad es un numero entero de tipo Int.
            val myDouble4 = myFloat + myDouble2 + myDouble3
            // La diferencias de tipo asignara que "myDouble4" sera de tipo Double.
            // En la suma decimal hay una variable que con un valor entero "myDouble3", lo que
            // sucedera es que el sistema internamente lo convertira en un numero decimal 2 > 2.0
            println(myDouble4)
            val myDouble5 = myDouble - myDouble3 // La diferencias de tipo asignara Double.
            println(myDouble5)
            val myDouble6: Double = myDouble - myDouble3 // Se establece que sea de tipo Double.
            println(myDouble6)
        // <Fin> Decimales (Float; 32bits, Double; 64bits)------------------------------------------
        // <Inicio> Boolean (Bool, Describe condiciones; verdadera o flasa)-------------------------
            
        // <Fin> Boolean (Bool, Describe condiciones; verdadera o flasa)----------------------------
    // (Fin) Aqui vamos a hablar de tipos de datos (data types) principales.--------------------
    }
}