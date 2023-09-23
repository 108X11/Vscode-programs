class BookingSystem:
  def __init__(self):
    self.booksystem = []
    self.scanner = input

  def addbook(self):
    book_name = input("Add all books you want to add(type 'exit'  when you're done: \nEnter a book: )")
    while book_name.lower() != 'exit':
        self.bookisystem.append(book_name)
        book_name = input()

  def removebook(self):
    book_name = input("Enter a book: ")
    if book_name in self.bookisystem:
      self.bookisystem.remove(book_name)
      print(f"The book named {book_name} is succesfully removed!")
    else:
      print(f"The book name {book_name} is not found!!")
  
  def borrowbook(self):
    book_name = input("Enter a book: ")
    if book_name in self.bookingsystem:
      self.bookingsystem.remove(book_name)
      print(f"The book named {book_name} is found!\n You can borrow the book!")
    else:
      print(f"The book name {book_name} is not found!!")

  def showlist(self):
    print("Book list: ")
    for booklist in self.bookingsystem:
      print(f" - {booklist}")

  def closescanner(self):
    pass

if __name__ == "__main__":
  bookingSystem = BookingSystem()

  while True:
    print("What do you want to do? ")
    print("1. Add a book ")
    print("2. Remove a book ")
    print("3. Borrow a book ")
    print("4. Show list of book ")
    print("5. Exit the program ")
    choice = input("Enter choice: ")

    if choice == '1':
      BookingSystem.addbook()
    elif choice == '2':
      BookingSystem.removebook(book_name)
    elif choice == '3':
      bookingSystem.borrowbook(book_name)
    elif choice == '4':
      BookingSystem == showlist
    elif choice == '5':
     print("Program Finished!!")
     break
    else:
      print("Invalid Keyword!!!")

