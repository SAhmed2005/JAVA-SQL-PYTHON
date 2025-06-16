def content_combiner(dict_a, dict_b):
    for keys, value in dict_b.items():
        if keys not in dict_a.items():
                dict_a[keys] = value
    return dict_a

if __name__ == '__main__':
    print(content_combiner({"gold": "Yellow"}, {"karats": 24}))