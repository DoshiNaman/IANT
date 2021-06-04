import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("delete from customers WHERE address = 'Surat'")
mydb.commit()

print(mycursor.rowcount, "record(s) deleted")