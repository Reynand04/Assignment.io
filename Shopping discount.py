
book_price = 150
pen_price = 10
notebook_price = 25

num_books = 2
num_pens = 5
num_notebooks = 3


total_book_cost = num_books * book_price
total_pen_cost = num_pens * pen_price
total_notebook_cost = num_notebooks * notebook_price


total_cost = total_book_cost + total_pen_cost + total_notebook_cost


if total_cost > 350.00:
  discount = total_cost*.15
  print (discount)
  total_payment = total_cost-discount
  print (total_payment)
else:
    print("no discount")


   
