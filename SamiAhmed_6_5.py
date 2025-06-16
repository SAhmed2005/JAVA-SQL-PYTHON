def unite_lists(list_1, list_2):
    united = list_1
    for element in list_2:
        if element not in united:
            united.append(element)
    return united

print(unite_lists([2,4,6,8],[3,6,9,12]))