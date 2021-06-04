import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("select name from customers where address='Surat'")
#mycursor.execute("select name from customers where address LIKE '%way%'")
myresult=mycursor.fetchall()
#myresult=mycursor.fetchone()

for x in myresult:
    print(x)