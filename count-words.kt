
fun main() {
    //A program to count the number of words in a string
    println("Enter text:")
    val text = readlnOrNull().toString()
    val words = text.trim().split(Regex("\\s+"))
    val wordCount = words.size
    println("The text contains $wordCount words.")
}