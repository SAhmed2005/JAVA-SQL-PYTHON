multiplier_amount = 1000000

def calculate_gains(amount_inv=0.0):
    gain_margin = 0.1/100
    total_gains = 0
    total_amount = 0
    if amount_inv > 1000:
        pass
    if (amount_inv <= 100000000) & (amount_inv > multiplier_amount):
        amount = amount_inv/multiplier_amount
        gain_margin += amount/100
    if amount_inv > 100000000:
        amount = 100000000/multiplier_amount
        gain_margin += amount/100
    total_gains = amount_inv * gain_margin
    total_amount = amount_inv + total_gains
    return total_amount

print(calculate_gains(amount_inv=2000000))

def format_currency(value, currency='USD'):
    formatted_value = (currency, round(value,2))

    return formatted_value


print(format_currency(1000, 'USD'))

def calculate_gains_over_time(amount_inv=0.0, period=12):
    total_amount = calculate_gains(amount_inv=4000000)
    i = 0
    while i <  11:
        new_amount = calculate_gains(amount_inv=total_amount)
        total_amount = new_amount
        i += 1
    return total_amount
print(calculate_gains_over_time(amount_inv=4000000, period=12))
print(format_currency(calculate_gains_over_time(amount_inv=4000000, period=12), currency='USD'))
