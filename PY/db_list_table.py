import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("show tables")

for x in mycursor:
    print(x)