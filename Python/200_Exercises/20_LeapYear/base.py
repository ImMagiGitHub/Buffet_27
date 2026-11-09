a = (int)(input("Leap year?: "))
if a % 4 != 0:
    print(str(a) + " is not a leap year!")
elif a % 100 == 0 and a % 400 !=0:
    print(str(a) + " is not a leap year!")
else:
    print(str(a) + " is a leap year.")