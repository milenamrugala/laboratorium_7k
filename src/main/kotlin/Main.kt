fun main() {
    println("Zadanie 1")
    val group = Group<Student>()

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

    println()
    println("Zadanie 2")
    val myList = listOf("Opel", "Toyota", "Honda", "Volvo", "Volkswagen")
    group.display(myList)

    println()
    println("Zadanie 3")
    val students = listOf(
        Student("Milena", "Mrugała", "51251", Grades.DB),
        Student("Monika", "Mrugała", "31431", Grades.BDB)
    )

    val grades = listOf(
        Grades.DB_PLUS,
        Grades.DST,
        Grades.NB
    )

    println("Students:")
    group.display(students)

    println()

    println("Grades:")
   group.display(grades)
}