def skip_integers(*numbers):
    for i in numbers:
        if isinstance(i, int):
            continue
        print(i)


answer = skip_integers(5.2, "value", 6.0, 7)
print(answer)
