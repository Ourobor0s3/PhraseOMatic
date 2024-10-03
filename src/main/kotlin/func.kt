fun printArray(list : ArrayList<String>) : Unit {
    for (item in list) {
        print("$item, ")
    }
}

fun randInt(int: Int) : Int = (Math.random() * int).toInt()