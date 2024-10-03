import io.github.serpro69.kfaker.Faker

fun main(args: Array<String>) {
    val fake = Faker()

    val wordArray1 = arrayListOf(fake.name.name())
    val wordArray2 = arrayListOf(fake.address.city())
    val wordArray3 = arrayListOf(fake.phoneNumber.phoneNumber())
    val wordArray4 = arrayListOf(fake.animal.name())
    val wordArray5 = arrayListOf(fake.heroes.names())


    for (x in 0..3) {
        wordArray1.add(fake.name.name())
        wordArray2.add(fake.address.city())
        wordArray3.add(fake.phoneNumber.phoneNumber())
        wordArray4.add(fake.animal.name())
        wordArray5.add(fake.heroes.names())
    }
    print("List full name: ")
    printArray(wordArray1)
    print("\nList cities: ")
    printArray(wordArray2)
    print("\nList phone numbers: ")
    printArray(wordArray3)
    print("\nList animals: ")
    printArray(wordArray4)
    print("\nList heroes: ")
    printArray(wordArray5)

    val rand1 = randInt(wordArray1.size)
    val rand2 = randInt(wordArray2.size)
    val rand3 = randInt(wordArray3.size)
    val rand4 = randInt(wordArray4.size)
    val rand5 = randInt(wordArray5.size)

    val phrase ="\n\nAnswer: " +
            "\nHello, ${fake.name.name()}!" +
            "\nMy name is ${wordArray1[rand1]}. I live in ${wordArray2[rand2]}." +
            "\nMy phone number is ${wordArray3[rand3]}." +
            "\nMy love animal is ${wordArray4[rand4]} and my love heroes is ${wordArray5[rand5]}."
    println(phrase)
}

