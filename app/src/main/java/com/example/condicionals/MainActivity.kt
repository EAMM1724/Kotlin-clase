package com.example.condicionals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(){

    val dato = "sos"
    println("El tipo de triangulo es: ${tipoDeTriangulo(lado1 = 1, lado2 = 0, lado3 = 9)}")

    println("El tipo de dato es: ${tipoDato(dato)}")

}


fun tipoDeTriangulo(lado1 : Int, lado2:  Int, lado3 : Int){

    if(lado1 == lado2 && lado2 == lado3){
        println("Es un triangulo equilatero")

    }else if (

        (lado1 == lado2 && lado3!= lado1 ) ||
        (lado2 == lado3 && lado1!= lado2) ||
        (lado3 == lado1 && lado2!= lado3) ){
        println("Es un tringulo isosceles")
    }else{
        println("Es un triangulo escaleno")
    }

}




fun tipoDato(dato: Any){
    when(dato){
        is String -> println("Es un String")
        is Int -> println("Es un entero")
        is Double -> println("Es un Double")
        else -> println("Tipo de dato soportado")
    }

}


