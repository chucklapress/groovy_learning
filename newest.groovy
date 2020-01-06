def range = 0 ..10
assert (0 ..10) instanceof List
println range.collect()

// eample of Coercion operator 
Integer x = 12345
String s = x as String

println s
