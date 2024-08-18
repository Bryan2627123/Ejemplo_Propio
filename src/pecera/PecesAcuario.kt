package pecera

abstract class Pez {
    abstract val color: String
}

interface AccionPez {
    fun comer()
}

class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"

    override fun comer() {
        println("Tiburón: cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"

    override fun comer() {
        println("Pez Payaso: comer algas")
    }
}
