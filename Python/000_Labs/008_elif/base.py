n1 = (int)(input("Number: "))
n2 = (int)(input("Number: "))
o = (input("Operation: "))
cs = "-"
ca = "+"
cm = "*"
cd = "/"
if o == cs:
    a1 = n1 - n2
    print(str(n1) + " - " + str(n2) + " = " + str(a1))
elif o == ca:
    a2 = n1 + n2
    print(str(n1) + " + " + str(n2) + " = " + str(a2))
elif o == cm:
    a3 = n1 + n2
    print(str(n1) + " * " + str(n2) + " = " + str(a3))
elif o == cd:
    a4 = n1 / n2
    print(str(n1) + " * " + str(n2) + " = " + str(a4))
else:
    print("No")