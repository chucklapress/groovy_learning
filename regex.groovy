import java.util.regex.Pattern

//def pattern = ~"([Gg])roovy"

//assert pattern.class == Pattern
//println pattern.class
def result = ("This is test. Test is good, lol." =~ /(?i)\b([a-z])[a-z]*\1\b/).findAll()*.first()
println result

def input = "shazam"

switch (input) {
    case ~/\d{3}/:
        println "The number has 3 digits."
        break

    case ~/\w{6}/:
        println "The word has 6 letters."
        break

    default:
        println "Unrecognized..."
}
