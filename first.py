import random
import string
character = list((string.ascii_letters + string.digits + string.punctuation))
def generate_random_password():
  lenght = int(input("Entr the lenght of the password :"))#lenght of the password
  random.shuffle(character)#shuffle the character
  password = []
  for x in range(lenght):
     password.append(random.choice(character))
     random.shuffle(password)
  print("".join(password))
generate_random_password()   #invoking the function  
