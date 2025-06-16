def word_counter(word):
    dictionary1 = {}
    for letter in word:
        dictionary1[letter] = dictionary1.get(letter, 0) + 1
    return dictionary1
print(word_counter("Mississippi"))

