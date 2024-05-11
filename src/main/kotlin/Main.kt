fun main() {
    val group = Group()

    val firstStudent = Student("Milena", "Mrugała", "51251", Grades.DB)
    val secondStudent = Student("Monika", "Mrugała", "31431", Grades.DB_PLUS)

    group.addStudent(firstStudent)
    group.addStudent(secondStudent)

    val first = group.getStudentByIDorNull("51251")
    val second = group.getStudentByIDorNull("22222")

    println("Student - $first found - ${if (first != null) "Yes" else "No"}")
    println("Student - $second found - ${if (second != null) "Yes" else "No"}")

    try {
        val firstStudentByID = group.getStudentByID("31431")
        println("Student - $firstStudentByID")
    } catch (e: NoSuchElementException) {
        println("Exception - ${e.message}")
    }

    try {
        val secondStudentByID = group.getStudentByID("12345")
        println("Student: $secondStudentByID")
    } catch (e: NoSuchElementException) {
        println("Exception - ${e.message}")
    }
}