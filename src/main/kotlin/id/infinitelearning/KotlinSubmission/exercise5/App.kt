package id.infinitelearning.KotlinSubmission.exercise5

fun setProfile(name: String, age: Int, height: Double) {
    val profile = "Name: $name, Age: $age, Height: $height cm"
    println(profile)
}

var status: String = ""

fun profile() {
    println("Status terkini: $status")
}

fun jalan() {
    status += "Jalan "
}

fun lari() {
    status += "Lari "
}

fun makan() {
    status += "Makan "
}

fun minum() {
    status += "Minum "
}

fun lompat() {
    status += "Lompat "
}

fun duduk() {
    status += "Duduk "
}

fun main() {
    class Hero(val name: String, val power: String)
    /**
     * Latihan 1
     * Buat variable dengan nama hero dibawah ini dan isi nilai variable tersebut dengan class Hero
     *
     */
    val hero = Hero("Binaaa", "bisa hidup lagi, terbang, dan menghilang")

    // Menggunakan nilai variabel hero
    println("Nama Hero: ${hero.name}")
    println("Kekuatan Hero: ${hero.power}")



    /**
     * Latihan 2
     * Set data profile dengan memanggil fungsi setProfile() dibawah ini
     * Dan isi argumen-argumen / data dari parameter sesuai data diri Anda (Name, Age, Height)
     *
     */
    val name = "Sabrina Kurnia"
    val age = 21
    val height = 158.0


    /**
     * Latihan 3
     * Tampilkan data profile dibawah ini, sebelum melakukan aktivitas
     *
     */
    setProfile(name, age, height)



    /**
    Challenge:
    Group 1: jalan 5x, lari 2x, makan 3x, minum 1x, lompat 3x, duduk 1x
    Group 2: jalan 2x, lari 2x, makan 1x, minum 3x, lompat 1x, duduk 2x
    Group 3: jalan 3x, lari 1x, makan 5x, minum 1x, lompat 5x, duduk 3x
    Group 4: jalan 5x, lari 4x, makan 4x, minum 4x, lompat 3x, duduk 2x
    Group 5: jalan 4x, lari 1x, makan 3x, minum 5x, lompat 5x, duduk 3x
    Group 6: jalan 2x, lari 4x, makan 2x, minum 2x, lompat 7x, duduk 4x
     **/

    /**
     * Latihan 4
     * Jalankan aktivitas-aktivitas dengan memanggil fungsi-fungsi sesuai challenge diatas
     *
     */

    // Group 4
    repeat(5) { jalan() }
    repeat(4) { lari() }
    repeat(4) { makan() }
    repeat(4) { minum() }
    repeat(3) { lompat() }
    repeat(2) { duduk() }

    /**
     * Latihan 5
     * Panggil fungsi profile dibawah ini untuk menampilkan status terkini setelah melakukan aktivitas
     *
     */
    profile()

}