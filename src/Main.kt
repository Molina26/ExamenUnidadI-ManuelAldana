import java.util.*

fun main(args: Array<String>) {

    var courseType : Int = 4
    var menuOption : Int = 5
    var sc = Scanner(System.`in`)

    println("🚧🚧🚧🚧🚧🚧 Bienvenido al sistema de cursos 🚧🚧🚧🚧🚧🚧")
    println("\nIn the next program you will can read and management Cooking and Programing courses, wich you are " +
            "also invited to be part of them \n")

    do{
        println("Then, enter the action number you want to do: " +
                "\n1.- COOKING COURSES 🍔🍟🍗🌮🧁🥕" +
                "\n2.- PROGRAMING COURSES 💻🖥📱🖱🖨📈" +
                "\n3.- GET ALL ✅🔄" +
                "\n4.- GO OUT OF THE SYSTEM ✈🚸🔚")
        courseType = sc.nextInt()

        when(courseType){
            1 -> {

                println("Welcome to Cooking courses, please select an option by entering the corresponding number: " +
                        "\n1.- Add course" +
                        "\n2.- Update course" +
                        "\n3.- Delete course" +
                        "\n4.- Get course" +
                        "\n5.- Return to menu principal")
                menuOption = sc.nextInt()
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
                println("Welcome to Programing courses, please select an option by entering the corresponding number: " +
                        "\n1.- Add course" +
                        "\n2.- Update course" +
                        "\n3.- Delete course" +
                        "\n4.- Get course" +
                        "\n5.- Return to menu principal")
                menuOption = sc.nextInt()
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