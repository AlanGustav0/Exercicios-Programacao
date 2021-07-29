def LeapYear(year):

    #Condition to verify if the year is a leap year
    if year % 4 == 0 and year % 400 == 0 or year % 100 != 0:
        print('{} is a leap year'.format(year))
    else:
        print('{} isen\'t a leap year'.format(year))
        
#Insert the year
year = int(input('Insert the year: '))

#Calls the function that checks if the year is a leap year
LeapYear(year)
