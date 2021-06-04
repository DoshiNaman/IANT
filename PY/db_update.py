import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("Update customers SET address='Pune' where address='Ahmedabad'")
mydb.commit()

print(mycursor.rowcount, "record(s) affected")