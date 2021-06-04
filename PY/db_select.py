import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("select * from customers")
myresult=mycursor.fetchall()
#myresult=mycursor.fetchone()

for x in myresult:
    print(x)