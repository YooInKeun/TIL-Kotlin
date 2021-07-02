data class Student(val name: String, val age: Number)

// dto 생성
val student1 = Student("Aiden", 26)
println("학생 1 => 이름: ${student1.name}, 나이: ${student1.age}")

val (name, age) = student1
println("학생 1 => 이름: ${name}, 나이: ${age}")

// 똑같은 값의 dto 생성법
var student2 = Student("Aiden", 26)
println(student1.equals(student2)) // true
println(student1 == student2) // true

// dto 복사
val copiedStudent1 = student1.copy()
println(student1.equals(copiedStudent1)) // true
println(student1 == copiedStudent1) // true

// name만 변경하고 나머지만 copy
val copiedStudent2 = student2.copy(name = "Kevin")
println(student2.equals(copiedStudent2)) // false
println(student2 == copiedStudent2) // false