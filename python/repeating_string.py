def repeatedString(s, n):

    if not 'a' in s:
        return 0 
    if len(s) == 1:
        return n

    letter_quantity = s.count('a')
    repettitions = n // len(s)
    rest = n % len(s)
    rest = s[:rest].count('a')
    print(rest)
    total = repettitions * letter_quantity + rest


    print(total)


    



s = 'afcfffaged'
n = 962645758455


repeatedString(s, n)