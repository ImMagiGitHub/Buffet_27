x = int(input("Enter a number: "))
y = 0

for count in range(1, x):
    print(count, end="+")
    y = y + count

print(x)
y = y + x
print("Anwser: " + str(y))