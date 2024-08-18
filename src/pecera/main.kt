package pecera

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso = PezPayaso()

    println("El tiburón es de color: ${tiburon.color}")
    tiburon.comer()

    println("El pez payaso es de color: ${pezPayaso.color}")
    pezPayaso.comer()
}

fun construirAcuario() {
    val acuario = Acuario(ancho = 25, largo = 25, alto = 40)
    acuario.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 45)
    miTorre.imprimirTamano()
}

fun main() {
    println("Construyendo peceras...")
    construirAcuario()

    println("\nCreando peces...")
    crearPeces()
}
