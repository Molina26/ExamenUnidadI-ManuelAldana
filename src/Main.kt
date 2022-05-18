import java.util.*

fun main(args: Array<String>) {

    var courseType : Int = 4
    var menuOption : Int = 5
    val scanNumbers = Scanner(System.`in`)
    val scanString = Scanner(System.`in`)

    val programmingCourse: ProgramingCourse =  ProgramingCourse()

    println("🚧🚧🚧🚧🚧🚧 Bienvenido al sistema de cursos 🚧🚧🚧🚧🚧🚧")
    println("\nIn the next program you will can read and management Cooking and Programming courses, wich you are " +
            "also invited to be part of them \n")

    do{
        println("Then, enter the action number you want to do: " +
                "\n1.- COOKING COURSES 🍔🍟🍗🌮🧁🥕" +
                "\n2.- PROGRAMING COURSES 💻🖥📱🖱🖨📈" +
                "\n3.- GET ALL ✅🔄" +
                "\n4.- GO OUT OF THE SYSTEM ✈🚸🔚")
        courseType = scanNumbers.nextInt()

        when(courseType){
            1 -> {

                println("Welcome to Cooking courses, please select an option by entering the corresponding number: " +
                        "\n1.- Add course" +
                        "\n2.- Update course" +
                        "\n3.- Delete course" +
                        "\n4.- Get course" +
                        "\n5.- Return to menu principal")
                menuOption = scanNumbers.nextInt()
                do{
                    when(menuOption){
                        1 -> {
                            // ADD


                        }
                        2 -> {
                            // UPDATE

                        }
                        3 -> {
                            //DELETE

                        }
                        4 -> {
                            //GET

                        }
                        5 -> {
                            // RETURN

                        }
                        else -> {

                        }
                    }
                }while(menuOption == 5)


            }
            2 -> {
                println("Welcome to Programming courses, please select an option by entering the corresponding number: " +
                        "\n1.- Add course" +
                        "\n2.- Update course" +
                        "\n3.- Delete course" +
                        "\n4.- Get course" +
                        "\n5.- Return to menu principal")
                menuOption = scanNumbers.nextInt()
                do{
                    when(menuOption){
                        1 -> {
                            // ADD
                            println("ADDING A PROGRAMMING COURSE")
                            println("Enter course name: ")
                            var nameProgrammingCourse : String = scanString.nextLine()
                            println()
                            println("Enter a description of the course: ")
                            var descriptionProgrammingCourse : String = scanString.nextLine()
                            println()
                            println("Enter the course technologies in one line")
                            var technologiesProgrammingCourse : String = scanString.nextLine()
                            println()
                            println("Enter if the course is for movil or web app")
                            var areaProgrammingCourse : String = scanString.nextLine()
                            println()
                            val programingCourseTemporal = ProgramingCourse(0, nameProgrammingCourse, descriptionProgrammingCourse, technologiesProgrammingCourse, areaProgrammingCourse)

                            println("RESPONSE ${programmingCourse.addCourse(programmingCourse)}")
                        }
                        2 -> {
                            // UPDATE
                            println("UPDATE A PROGRAMMING COURSE")
                            println("ENTER AN ID COURSE FOR UPDATE IT")
                            var idUpdate : Int = scanNumbers.nextInt()
                            println("Enter course name: ")
                            var nameProgrammingCourse : String = scanString.nextLine()
                            println("Enter a description of the course: ")
                            var descriptionProgrammingCourse : String = scanString.nextLine()
                            println("Enter the course technologies in one line")
                            var technologiesProgrammingCourse : String = scanString.nextLine()
                            println("Enter if the course is for movil or web app")
                            var areaProgrammingCourse : String = scanString.nextLine()
                            val programingCourseTemporal = ProgramingCourse(idUpdate, nameProgrammingCourse, descriptionProgrammingCourse, technologiesProgrammingCourse, areaProgrammingCourse)
                            programmingCourse.updateCourse(programmingCourse)
                        }
                        3 -> {
                            //DELETE
                            println("DELETE PROGRAMMING COURSE")
                            println("Enter an id course for delete it")
                            var idProgrammingCourse : Int = scanNumbers.nextInt()
                            println(programmingCourse.deleteCourse(idProgrammingCourse))
                        }
                        4 -> {
                            //GET
                            println("GET A PROGRAMMING COURSE")
                            println("Enter an id course for delete it")
                            var idProgrammingCourse : Int = scanNumbers.nextInt()
                            println(programmingCourse.getCourseById(idProgrammingCourse))
                        }
                        5 -> {
                            // RETURN
                            println("BYE")
                        }
                        else -> {

                        }
                    }
                }while(menuOption == 5)
            }
            3 -> {
                //GET ALL

            }
            4 -> {
                //OUT
                println(" YOU ARE EXITING THE SYSTEM 🔚")
            }
            else -> println("If you don't enter a valid number, you will be here infinitely")
        }

    }while(courseType == 4)


}