def vowels(text):
    return sum(1 for char in text.lower() if char in 'aeiou')

text = ("Reyrey")
print(f"The number of vowels in {text} is: {vowels(text)}")