def is_leap(year):
    answer = year % 4 == 0 and (year % 400 == 0 or year % 100 != 0)
    return answer
    

year = int(input())
print(is_leap(year))
