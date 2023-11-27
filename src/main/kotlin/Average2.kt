fun main() {
    val gradeA = readLine()!!.toDouble()
    val gradeB = readLine()!!.toDouble()
    val gradeC = readLine()!!.toDouble()
    val average = ((gradeA * 2) + (gradeB * 3) + (gradeC * 5)) / 10.0
    println("MEDIA = ${"%.1f".format(average)}")
}
