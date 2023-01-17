fun main(){
        val numbs = listOf(22, 101, 370, 500, 678, 1001, 470, 880, 563, 620)
    numbs.filterSmaller().printSmaller()

    }
    fun List<Int>.filterSmaller() : List<Int> {
        return this.filter{it < 500} }
    fun List<Int>.printSmaller(){
        this.forEach {it-> println("This number is < 500: $it") }
    }
