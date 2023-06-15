fun main() {
    var title = "Born a Crime"
   println(title)
    println("Total value of ${product1.name}: $totalValue1")
    println("Total value of ${product2.name}: $totalValue2")

    val student1 = Student("Emmily", 20, listOf(30, 34, 60, 95))
    val student2 = Student("Stephanie", 24, listOf(50,65, 95, 80))

    student1.displayStudentInfo()
    println("Average Grade: ${student1.calculateAverageGrade()}")
    println("Passed: ${student1.hasPassed()}")

    student2.displayStudentInfo()
    println("Average Grade: ${student2.calculateAverageGrade()}")
    println("Passed: ${student2.hasPassed()}")


//   question 8

    val book1 = Book("The Born a Crime", "Trevor Noah", 55)
    val book2 = Book("Blossoms Of The Savanna", "Oloisudori", 20)
    println(book2)






    }


// Story Class
class Story(val title: String, val length: String, val group: String) {
    fun getTitle(title: String): String {
        return title
    }


    fun getLength(length: String): String {
        return ("The length of the story is $length")
    }

    fun group(group: String): String {
        return group
    }
}

// StoryTeller Class
class StoryTeller(val name: String) {
    val stories = mutableListOf<Story>()

    fun getStories(story: String): List<Story> {
        return stories
    }

    fun addStory(story: Story) {
        stories.add(story)
    }

    fun removeStory(story: Story) {
        stories.remove(story)
    }
}

// Translator Class
class Translator(val name: String, val languagePairs: List<String>) {
    fun getLanguagePairs(languagePairs: List<String>): List<String> {
        return languagePairs
    }

    fun translate(story: Story, targetLanguage: String) {
        // Implementation for translation
    }
}

//QUESTION5
class Product(val name: String, val price: Double, val quantity: Int) {
    fun calculateTotalValue(): Double {
        return price * quantity
    }
}

// Create multiple objects of the Product class
val product1 = Product("Mango", 56.5, 10)
val product2 = Product("Orange", 67.0, 20)


// Calculate the total values of the products
val totalValue1 = product1.calculateTotalValue()
val totalValue2 = product2.calculateTotalValue()


//QUESTION 6
class Student(val name: String, val age: Int, val grades: List<Int>) {
    fun calculateAverageGrade(): Double {
        val sum = grades.sum()
        return sum.toDouble() / grades.size
    }

    fun displayStudentInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Grades: $grades")
    }

    fun hasPassed(): Boolean {
        val averageGrade = calculateAverageGrade()
        return averageGrade >= 60
    }
}



//QUESTION 8
class Book(val title: String, val author: String, var availableBooks: Int)

class LibraryBooks {
    val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun searchByTitle(title: String): List<Book> {
        val foundBooks = mutableListOf<Book>()
        for (book in books) {
            if (book.title.equals(title.toLowerCase())) {
                foundBooks.add(book)
            }
        }
        return foundBooks
    }


    fun displayBookDetails(book: Book) {
        println("Title: ${book.title}")
        println("Author: ${book.author}")
        println("Available Copies: ${book.availableBooks}")
    }
}

// Usage example
//val catalog = LibraryCatalog()
//
//val book1 = Book("The Great Gatsby", "F. Scott Fitzgerald", 5)
//val book2 = Book("To Kill a Mockingbird", "Harper Lee", 3)
//
//catalog.addBook(book1)
//catalog.addBook(book2)
//
//val foundBooks = catalog.searchByTitle("To Kill a Mockingbird")
//for (book in foundBooks) {
//    catalog.displayBookDetails(book)
