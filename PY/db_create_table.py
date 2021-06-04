import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()
mycursor.execute("create table customers (name VARCHAR(255),address VARCHAR(255))")
