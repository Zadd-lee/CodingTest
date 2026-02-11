day = int(input())
carList = list(map(int,input().split()))

error = 0
for car in carList:
    if(day == car):
        error+=1
print(error)