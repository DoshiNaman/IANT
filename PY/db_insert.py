import mysql.connector

mydb=mysql.connector.connect(
    host="localhost",
    user="root",
    password="",
    database="py"
)
mycursor=mydb.cursor()

sql="insert into customers (name,address) values (%s,%s)"
#val=("Naman","Ahmedabad")

val=[
    ('Sahil','Surat'),
    ('Yash','Surat')
]

#mycursor.execute(sql,val)
mycursor.executemany(sql,val)
mydb.commit()
print(mycursor.rowcount, "record inserted.")