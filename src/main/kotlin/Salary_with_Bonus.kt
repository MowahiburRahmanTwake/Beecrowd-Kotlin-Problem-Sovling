fun main() {
    var name = readLine()!!
    var fixedsalary = readLine()!!.toDouble()
    var total_sales = readLine()!!.toDouble()
    var commission = 0.15 * total_sales
    var salary = fixedsalary + commission
    println("TOTAL = R$ ${"%.2f".format(salary)}")
}