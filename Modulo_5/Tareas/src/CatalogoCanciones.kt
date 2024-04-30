class Cancion(
    val titulo: String,
    val artista: String,
    val anio: Int,
    var conteo: Int
) {
    val popular: Boolean
        get() = conteo > 1000

    fun reproducir() {
        println("$titulo, interpretada por $artista, se lanzó en $anio.")
    }
}

fun main() {

    Cancion("Misery Business", "Paramore", 2007, 2570).reproducir()
    Cancion("In the Air Tonight", "Phil Collins", 1981, 1000000).reproducir()
    Cancion("Fall for You", "SecondHand Serenade", 2008, 590).reproducir()

}