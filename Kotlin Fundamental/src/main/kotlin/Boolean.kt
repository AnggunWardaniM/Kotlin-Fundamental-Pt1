fun main() {
    val nilaiMu = 98
    val grade : String
    grade = if (nilaiMu > 90) {
        "A"
    } else if (nilaiMu <= 90 && nilaiMu > 80) {
        "B"
    } else if (nilaiMu <= 80 && nilaiMu > 70) {
        "C"
    } else if (nilaiMu <= 70 && nilaiMu > 60) {
        "D"
    } else {
        "E"
    }
    print("NilaiMu $grade")
}