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
                        "\n1.- Add course")

            }
            2 -> {

            }
            3 -> {

            }
            4 -> {
                println(" USTED ESTA A PUNTO DE SALIR DEL SISTEMA 🔚")
            }
            else -> println("Si no ingresa un número de los indicados, permanecera aquí infinitamente")
        }

    }while(courseType == 4)


}