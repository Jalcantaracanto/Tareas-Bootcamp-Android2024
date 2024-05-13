package com.example.appmovieskotlin.model

import android.os.Parcel
import android.os.Parcelable

enum class MovieCategory {
    ACCION,
    COMEDIA,
    DRAMA,
    TERROR,
    ROMANCE,
    AVENTURA,
    THRILLER,
    FANTASIA,
    CIENCIA_FICCION,
    DOCUMENTAL,
    OTRO,
    FAMILIA,
    ANIMACION,
    SUSPENSO,
    CRIMEN
}

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val category: Array<MovieCategory>,
    val overview: String,
    val poster: String,
    val duration: Int,
): Parcelable {
    companion object {
        val dataMovies = mutableListOf<Movie>(
            Movie(
                id = "m01",
                title = "Constantine",
                year = "2005",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.DRAMA,
                    MovieCategory.TERROR
                ),
                overview = "Como Constantine, Keanu Reeves (Matrix), lucha contra un nuevo inframundo en este thriller impresionante y sobrenatural basado en los personajes de DC Comics/ Vertigo y las novelas de Hellblazer Graphic. Situada en una Ciudad de Ángeles donde las fronteras del mundo espiritual se han roto y el infierno está suelto. Agua bendita, un lanzallamas con aliento de dragón, un rifle con un crucifijo tallado. Armado con estos elementos y ayudado por una intrépida policía (Rachel Weisz), John Constantine, es un guerrero espiritual llevado a una guerra apocalíptica. Agradece que Constantine esté de tu lado.",
                poster = "https://image.tmdb.org/t/p/w154/9bIvXIAf2i7NRMnrGowMhJJzPuY.jpg",
                duration = 121,
            ),
            Movie(
                id = "m02",
                title = "Pobres Criaturas",
                year = "2023",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.COMEDIA,
                ),
                overview = "Bella Baxter es una joven revivida por el brillante y poco ortodoxo científico Dr. Godwin Baxter. Bajo la protección de Baxter, Bella está ansiosa por aprender. Hambrienta de la mundanidad que le falta, Bella se escapa con Duncan Wedderburn, un sofisticado y perverso abogado, en una aventura vertiginosa a través de los continentes. Libre de los prejuicios de su época, Bella se vuelve firme en su propósito de defender la igualdad y la liberación.",
                poster = "https://image.tmdb.org/t/p/w154/xbfzQ7Q7qmDUf50eZH8C57Ygx6n.jpg",
                duration = 141,
            ),
            Movie(
                id = "m03",
                title = "Einstein y la bomba",
                year = "2024",
                category = arrayOf(
                    MovieCategory.DOCUMENTAL,
                    MovieCategory.DRAMA,
                ),
                overview = "¿Qué pasó después de que Einstein huyera de la Alemania nazi? Este docudrama usa imágenes de archivo y sus propias palabras para sumergirse en la mente de un genio torturado.",
                poster = "https://image.tmdb.org/t/p/w154/vMkM6i1EobVxq9i9al6hnG5cLh0.jpg",
                duration = 76,
            ),
            Movie(
                id = "m04",
                title = "El Hobbit: La batalla de los cinco ejércitos",
                year = "2013",
                category = arrayOf(
                    MovieCategory.AVENTURA,
                    MovieCategory.ACCION,
                    MovieCategory.FANTASIA,
                ),
                overview = "Después de haber recuperado el reino del Dragón Smaug, la Compañ\u00ADa ha desencadenado, sin querer, una potencia maligna. Un Smaug enfurecido vuela hacia la Ciudad del Lago para acabar con cualquier resto de vida. Obsesionado sobre todo con el reino recuperado, Thorin sacrifica la amistad y el honor para mantenerlo mientras que Bilbo intenta frenéticamente hacerle ver la razón por la que el hobbit toma una decisión desesperada y peligrosa. Pero hay aún mayores peligros por delante. Sin la ayuda aparente del mago Gandalf, su gran enemigo Sauron ha enviado legiones de orcos hacia la Montaña Solitaria en un ataque furtivo. Cuando la oscuridad se cierna sobre ellos, las razas de los Enanos, Elfos y Hombres deben decidir si unirse o ser destruidos. Bilbo se encontrará así\u00AD en la batalla épica de los Cinco Ejércitos, donde el futuro de la Tierra Media está en juego.",
                poster = "https://image.tmdb.org/t/p/w154/zgKZ1Yz1uiqDZ89qnB6SsH4O6Pp.jpg",
                duration = 144,
            ),
            Movie(
                id = "m05",
                title = "Matrix",
                year = "1999",
                category = arrayOf(
                    MovieCategory.ACCION,
                    MovieCategory.CIENCIA_FICCION,
                ),
                overview = "Thomas Anderson lleva una doble vida: por el dia es programador en una importante empresa de software, y por la noche un hacker informatico llamado Neo. Su vida no volvera a ser igual cuando unos misteriosos personajes le inviten a descubrir la pregunta que no le deja dormir: ¿que es Matrix?",
                poster = "https://image.tmdb.org/t/p/w154/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
                duration = 138,
            ),
            Movie(
                id = "m06",
                title = "Dobles de accion",
                year = "2023",
                category = arrayOf(
                    MovieCategory.COMEDIA,
                    MovieCategory.CIENCIA_FICCION,
                ),
                overview = "Lao Luo está muy apegado a su amado caballo. Cuando parece que le pueden quitar el caballo, se embarca en un viaje por carretera con su hija Xiaobao y su novio para resolver la crisis.",
                poster = "https://image.tmdb.org/t/p/w154/arF1VcDtjuK4AV43FSQNKOl0J23.jpg",
                duration = 125,
            ),
            Movie(
                id = "m07",
                title = "Madame Web",
                year = "2024",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.ACCION,
                    MovieCategory.CIENCIA_FICCION
                ),
                overview = "Después de sobrevivir a un accidente, la paramédica Cassandra Webb comienza a desenvolver sus habilidades clarividentes. Obligada a enfrentar revelaciones sobre su pasado, forja una relación con tres mujeres jóvenes destinadas a futuros poderosos... si todas pueden sobrevivir a un presente mortal.",
                poster = "https://image.tmdb.org/t/p/w154/8enikn5rdpsVyQd1qnpOqpACZqO.jpg",
                duration = 116,
            ),
            Movie(
                id = "m08",
                title = "El Sonido de la Juventud",
                year = "2021",
                category = arrayOf(
                    MovieCategory.DRAMA,
                    MovieCategory.THRILLER,
                ),
                overview = "Desesperada por escapar de las trampas de su pequeño pueblo agrícola costero, Abby, de 16 años, se enamora del cantante principal de una banda de rock en gira y debe decidir si dejar atrás a su familia y amigos. Con actuaciones de música en vivo y un elenco emocionante, COAST se trata de amistades femeninas, encontrar tu verdad y dejar que la música te lleve a casa.",
                poster = "https://image.tmdb.org/t/p/w154/7kTdoQqHV47xOxtXzm0vh3pGZlH.jpg",
                duration = 96,
            ),
            Movie(
                id = "m09",
                title = "The Ghosts of Monday",
                year = "2022",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.ACCION,
                    MovieCategory.CIENCIA_FICCION
                ),
                overview = "Un grupo de cineastas estadounidenses viajan a Chipre para filmar un documental en el trágicamente famoso Hotel Gula, un lugar que alguna vez fue popular donde más de 100 personas murieron en circunstancias misteriosas. Lo que comienza como un día cualquiera eventualmente se convertirá en un viaje aterrador hacia lo desconocido.",
                poster = "https://image.tmdb.org/t/p/w154/bheqmEY1OIBbEUhppkNm66XCP4f.jpg",
                duration = 80,
            ),
            Movie(
                id = "m10",
                title = "Los Portales",
                year = "2021",
                category = arrayOf(
                    MovieCategory.CIENCIA_FICCION
                ),
                overview = "Cuando una serie de misteriosas “Puertas” alienígenas aparecen repentinamente en todo el mundo, individuos de todos los ámbitos de la vida deben unirse para descubrir qué son estas puertas, a dónde conducen y si podemos, o debemos, intentar cruzar al otro lado.",
                poster = "https://image.tmdb.org/t/p/w154/8Y2OKICR9N6761NARS9DmmjFAmp.jpg",
                duration = 84,
            ),
            Movie(
                id = "m11",
                title = "La Bruja de Hielo",
                year = "2022",
                category = arrayOf(
                    MovieCategory.CIENCIA_FICCION,
                    MovieCategory.FANTASIA
                ),
                overview = "A instancias de su jefe Ronnie, la periodista Ingrid Hoffman regresa a su hogar ancestral después de que se encuentren varios niños asesinados en un bosque cercano. Con el pueblo sospechando que la infame Bruja del Invierno está detrás de los asesinatos, junto con su hija Eleanor y la abuela Omi, de la que está separada, Ingrid debe descubrir la verdad y detener la maldición de Frau Perchta de una vez por todas.",
                poster = "https://image.tmdb.org/t/p/w154/esmu39G0XWcbKdaakPjmTfRbHIv.jpg",
                duration = 81,
            ),
            Movie(
                id = "m12",
                title = "El Principito",
                year = "2015",
                category = arrayOf(
                    MovieCategory.AVENTURA,
                    MovieCategory.FANTASIA,
                    MovieCategory.ANIMACION,
                    MovieCategory.FAMILIA
                ),
                overview = "Para que todo salga bien en la prestigiosa Academia Werth, la pequeña y su madre se mudan a una casa nueva. La pequeña es muy seria y madura para su edad y planea estudiar durante las vacaciones siguiendo un estricto programa organizado por su madre; pero sus planes son perturbados por un vecino excéntrico y generoso. Él le enseña un mundo extraordinario en donde todo es posible. Un mundo en el que el Aviador se topó alguna vez con el misterioso Principito. Entonces comienza la aventura de la pequeña en el universo del Principito. Y así descubre nuevamente su infancia y comprenderá que sólo se ve bien con el corazón. Lo esencial es invisible a los ojos. Cuenta con las voces (en versión inglesa) de James Franco, Rachel McAdams, Marion Cotillard, Jeff Bridges, Benicio Del Toro, Mackenzie Foy y Paul Giamatti.",
                poster = "https://image.tmdb.org/t/p/w154/i8gmsOtNe2Zqlj7dqstEprf3w1T.jpg",
                duration = 106,
            ),
            Movie(
                id = "m13",
                title = "À mon seul désir",
                year = "2023",
                category = arrayOf(
                    MovieCategory.DRAMA,
                    MovieCategory.ROMANCE
                ),
                overview = "Nunca has estado en un club de striptease. Pero has querido, al menos una vez... No te atreviste, eso es todo. Esta película cuenta la historia de alguien que se atrevió.",
                poster = "https://image.tmdb.org/t/p/w154/ds0tapugknJAD6ClBI3cD6Z4CiI.jpg",
                duration = 119,
            ),
            Movie(
                id = "m14",
                title = "Wonka",
                year = "2023",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.OTRO
                ),
                overview = "Willy Wonka, repleto de ideas y decidido a cambiar el mundo con un delicioso bocado a la vez, es una prueba de que las mejores cosas de la vida comienzan con un sueño y, si tienes la suerte de conocer a Willy Wonka, todo es posible.",
                poster = "https://image.tmdb.org/t/p/w154/6eHcR7zwvNSvkOl9jbctU0lvZQ1.jpg",
                duration = 112,
            ),
            Movie(
                id = "m15",
                title = "Todos los nombres de Dios",
                year = "2023",
                category = arrayOf(
                    MovieCategory.CIENCIA_FICCION,
                    MovieCategory.ACCION
                ),
                overview = "Tras verse implicado en un atentado terrorista, Santi, un taxista, es tomado como rehén por uno de los autores.",
                poster = "https://image.tmdb.org/t/p/w154/y1OIPQA0UIFzm68uCdwZF2L3W0M.jpg",
                duration = 105,
            ),
            Movie(
                id = "m16",
                title = "Taylor Swift: The Eras Tour",
                year = "2023",
                category = arrayOf(
                    MovieCategory.DOCUMENTAL,
                    MovieCategory.DRAMA
                ),
                overview = "¡El fenómeno cultural continúa en la pantalla grande! Sumérgete en esta experiencia cinematográfica de concierto única en la vida con una vista cinematográfica impresionante de la gira histórica.",
                poster = "https://image.tmdb.org/t/p/w154/jf3YO8hOqGHCupsREf5qymYq1n.jpg",
                duration = 112,
            ),
            Movie(
                id = "m17",
                title = "Familia revuelta",
                year = "2023",
                category = arrayOf(
                    MovieCategory.DOCUMENTAL,
                    MovieCategory.DRAMA
                ),
                overview = "Una familia se hunde en el caos cuando un suceso cósmico intercambia el cuerpo de los padres con los de sus hijos adolescentes poco antes de Navidad.",
                poster = "https://image.tmdb.org/t/p/w154/mDJiZua9gUzHRwefHhw2OaJ8HTF.jpg",
                duration = 101,
            ),
            Movie(
                id = "m18",
                title = "La chica de la capa roja",
                year = "2011",
                category = arrayOf(
                    MovieCategory.FANTASIA,
                    MovieCategory.AVENTURA
                ),
                overview = "Durante décadas, los habitantes de Daggerhorn mantienen un pacto con el hombre lobo: para saciar su apetito, le ofrecen un animal cada mes, hasta que la bestia incumple el pacto y devora a un ser humano. Una mujer sospecha quién es el licántropo.",
                poster = "https://image.tmdb.org/t/p/w154/27cmo6xr3IThPZmAF2s4FfGVeUs.jpg",
                duration = 100,
            ),
            Movie(
                id = "m19",
                title = "Oppenheimer",
                year = "2023",
                category = arrayOf(
                    MovieCategory.SUSPENSO
                ),
                overview = "Película sobre el físico J. Robert Oppenheimer y su papel como desarrollador de la bomba atómica. Basada en el libro 'American Prometheus: The Triumph and Tragedy of J. Robert Oppenheimer' de Kai Bird y Martin J. Sherwin.",
                poster = "https://image.tmdb.org/t/p/w154/ncKCQVXgk4BcQV6XbvesgZ2zLvZ.jpg",
                duration = 181,
            ),
            Movie(
                id = "m20",
                title = "Tiempos violentos",
                year = "1994",
                category = arrayOf(
                    MovieCategory.SUSPENSO,
                    MovieCategory.CRIMEN
                ),
                overview = "Jules y Vincent, dos asesinos a sueldo con muy pocas luces, trabajan para Marsellus Wallace. Vincent le confiesa a Jules que Marsellus le ha pedido que cuide de Mia, su mujer. Jules le recomienda prudencia porque es muy peligroso sobrepasarse con la novia del jefe. Cuando llega la hora de trabajar, ambos deben ponerse manos a la obra. Su misión: recuperar un misterioso maletín.",
                poster = "https://image.tmdb.org/t/p/w154/vruZ74rfN7LhykfkAJz21cVpN8M.jpg",
                duration = 154,
            ),
        )

        val dataEmpty = mutableListOf<Movie>()
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        TODO("Not yet implemented")
    }
}