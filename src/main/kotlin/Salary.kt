fun main() {
    var employeeNumber = readLine()!!.toInt()
    var workHours = readLine()!!.toInt()
    var salaryPerHour = readLine()!!.toDouble()
    var salary = workHours * salaryPerHour
    println("NUMBER = ${employeeNumber}")
    println("SALARY = U$ ${"%.2f".format(salary)}")
}
