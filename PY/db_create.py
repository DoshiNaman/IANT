import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password=""
)

#print(mydb)

mycursor=mydb.cursor()

#print(mycursor)

mycursor.execute("CREATE DATABASE PY")
