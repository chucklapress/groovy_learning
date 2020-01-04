def strippedFirstNewline = '''\
line one
line two
line three
'''

assert !strippedFirstNewline.startsWith('\n')
println strippedFirstNewline


def aMultilineString = '''line one
line two
line three'''
/*println aMultilineString*/

def startingAndEndingWithANewline = '''
line one
line two
line three
'''
/*println startingAndEndingWithANewline*/

println 'an escaped single quote: \' needs a backslash'
println 'an escaped escape character: \\ needs a double backslash'
println 'The Euro currency symbol: \u20AC'


def sum = "The sum of 3 and 3 equals ${3 + 3}"
assert sum.toString() == 'The sum of 3 and 3 equals 6'
println sum

def color = 'blue'
def interpolatedSlashy = /a ${color} wig/

assert interpolatedSlashy == 'a blue wig'
println interpolatedSlashy

def heterogeneous = [1, "a", true]

assert heterogeneous instanceof List
assert heterogeneous.size() == 3
println heterogeneous[2]


def multi = [[0, 1], [2, 3]]
println multi[0][1]

def numArr = [1, 2, 3] as int[]
println numArr[1]

/**
  * Example of a Groovy slashy string and groovy doc comment
  */
def otherfooPattern = /...yikes..../
println otherfooPattern
