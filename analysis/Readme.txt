Food delivery
ROLE -> Admin, shops, customer 

Shop -> profile, ShopAdmin, stock management,  shop varification
Customer  -> profile

google outh token, data handling, Ui

----------------------------------------------------------------------------------------------------
https://github.com/tarun-developer/TruYum
https://github.com/eshanjain267
-----------------------------------------------------------------------------------------------------

Requirement
-------------------
mysql, 
springboot, microservice

Backend 
----------------
Curd ops, graph analysis(2nd Step)
--> Admin
profile
create shop

---> shop
profile
Add Item
Update Stock

---> customer
order
profile


---> Access 
/admin/ ? token?="token" access/not
/user/? token="token" access/not

 --> SHOULD CREATE ESSENTIAL TABLE WITH FIELD <--

table for user, shop, admin
table Items ->  price/kg,  packed Item, Oil, (UI Loose item categories loose/packet) avaibility , name, Id, stock,
                             Loose item) price/per kg,( 10, 25 50 100 250 500 1000 in gram) 
                             Unit(kg/ liter)
                             -> companyId, productId, productVariant, shopId, 
                                       {(id) -> quantity} (unique product -> [3 merge], Stock also manage using this
                            -> itemQuantity,  ItemID(which), 
                            -> record manngement
                            -> previous order
                            -> cart mangement   
                            -> open timing, opening, gtm, open, close, status, (Shop responsibility)

master_state, master_city, address,  pin, mobile, email, image_link(image compression(compression))

++++++++++++++++
// mysql, postgers
 ----> Real data pe kamm
 ----> 
( All capital colmun capital )
[  master_table_product ] ( 
[ id, productId, companyId, itemId, productName , image_url, Cost, wight, categoryId, isDeleted, updateDate, insertedDate]

[ master_table _category ]
[ id, type, isDeleted, updateDate, insertedDate]

[ master_table _company ]
[ id, name, isDeleted, updateDate, insertedDate]

[ table_shop ]
[shopId, productId, stockId]

[ table_stock ]
[id, quantity, wieght]

[ table_admin ]
[ id, userName, password, otp, isVarified, address, pin, isDeleted]

[ table_user ]
[ id, userName, password, otp, isVarified, address, pin, isDeleted]

[master_country][master_city]

