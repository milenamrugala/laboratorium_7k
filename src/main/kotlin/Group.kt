class Group<T> {
    private val students: MutableMap<String, Student> = HashMap()
    private val items: MutableList<T> = mutableListOf()

    fun addStudent(student: Student) {
        students[student.getId()] = student
    }

    fun getStudentByIDorNull(id: String?): Student? {
        if (id != null) {
            return students[id]
        }
        return null
    }

    fun getStudentByID(id: String): Student {
        return students[id] ?: throw NoSuchElementException("Student with ID: $id not found")
    }

    fun add(item: T) {
        items.add(item)
    }
    fun <T> display(items: List<T>) {
        for ((index, item) in items.withIndex()) {
            println("${index + 1}. $item")
        }
    }
}
