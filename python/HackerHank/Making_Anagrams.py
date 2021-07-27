def makeAnagram(a,b):

    anagram = ''.join(reversed(b))
    print(anagram)

a = 'bacdc'
b = 'dcbac'


makeAnagram(a,b)