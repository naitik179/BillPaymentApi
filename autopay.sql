drop event test;

CREATE EVENT test
ON SCHEDULE EVERY 1 minute
STARTS current_date()
DO
UPDATE accounts
   set accounts.currentbal = accounts.currentbal - 100 
   where accounts.consumeraccountno = 
   (
        select registered_billers.consumeraccountno from registered_billers
        where registered_billers.autopay=true and registered_billers.consumeraccountno = 
        (select consumeraccountno from registered_billers,bills where registered_billers.billerid = bills.billerid and time(bills.duedate) >= time(current_time()) and registered_billers.autopay=true and bills.status = true)
    );

        
        
        