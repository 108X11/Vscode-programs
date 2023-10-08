num1 = int(input("Enter number 1: "))

num2 = int(input("Enter number 2: "))

<<<<<<< HEAD
ope = char(input("Enter operator: "))
=======
ope = str(input("Enter operator: "))
>>>>>>> c955ef999f5df98b589e0bc977638777e0649a70

if ope == '+':
    add = num1 + num2
    print("The addition of " + str(num1) + " " + "and " + str(num2) + " " + "is " + str(add))
elif ope == '-':
    diff = num1 - num2
    print("The difference of " + str(num1) + " " + "and " + str(num2) + " " + "is " + str(diff))
elif ope == '/':
    div = num1 / num2
    print("The division of " + str(num1) + " " + "and " + str(num2) + " " + "is " + str(div))
elif ope == '%':

    print("The modulus of " + str(num1) + " " + "and " + str(num2) + " " + "is " + str(num1 % num2))




