select distinct b.Title, p.Name as Publisher_Name
    from book b
join publisher p on b.Pub_Id = p.Pub_Id
join book_invoice bi on b.Book_Id = bi.Book_Id;

select p.Name as Publisher_Name , COUNT(b.Book_Id) as Total_Books
FROM Publisher p
JOIN Book b ON p.Pub_Id = b.Pub_Id
group by p.Name ;

select b.Title,p.Name as Publisher_Name
from book b
join publisher p on b.Pub_Id = p.Pub_Id
where b.Price > (select AVG(Price) from book);

select m.*, COUNT(bi.Book_Id) as Books_Borrowed
    from member m
join book_invoice bi on m.CardNo = bi.CardNo
group by m.CardNo;

select b.Title, p.Name as Publisher_Name
    from book b
join publisher p on b.Pub_Id = p.Pub_Id
where b.Price = (SELECT max(Price) FROM book);

SELECT b.Title, p.Name AS Publisher_Name
FROM Book b
         JOIN Publisher p ON b.Pub_Id = p.Pub_Id
WHERE b.Price = (SELECT MIN(Price) FROM Book);

SELECT COUNT(*) AS Total_Books FROM Book;

SELECT DISTINCT b.Title, p.Name AS Publisher_Name
FROM Book b
         JOIN Publisher p ON b.Pub_Id = p.Pub_Id
         JOIN Book_Invoice bi ON b.Book_Id = bi.Book_Id
WHERE bi.Date_Out <= bi.Due_Date;

SELECT m.*, COUNT(bi.Book_Id) AS Books_Borrowed
FROM Member m
         JOIN Book_Invoice bi ON m.CardNo = bi.CardNo
GROUP BY m.CardNo
ORDER BY Books_Borrowed DESC;

select p.Name as Publisher_Name , count(b.Book_Id) as Total_Books
from publisher p
JOIN Book b ON p.Pub_Id = b.Pub_Id
group by p.Name
having COUNT(b.Book_Id) >= 2;

SELECT m.*, COUNT(*) AS Crime_Story_Borrowed
FROM Member m
         JOIN Book_Invoice bi ON m.CardNo = bi.CardNo
         JOIN Book b ON bi.Book_Id = b.Book_Id
WHERE b.Type = 'crime story'
GROUP BY m.CardNo
HAVING COUNT(*) >= 1;

SELECT b.Title, bi.Date_Out,
       DATEDIFF(CURRENT_DATE, bi.Due_Date) AS Days_Overdue
FROM Book b
         JOIN Book_Invoice bi ON b.Book_Id = bi.Book_Id
WHERE CURRENT_DATE > bi.Due_Date;

SELECT b.Title, p.Name AS Publisher_Name,
       DATEDIFF(CURRENT_DATE, bi.Due_Date) AS Days_Overdue
FROM Book b
         JOIN Publisher p ON b.Pub_Id = p.Pub_Id
         JOIN Book_Invoice bi ON b.Book_Id = bi.Book_Id
WHERE CURRENT_DATE > bi.Due_Date AND DATEDIFF(CURRENT_DATE, bi.Due_Date) > 7;

SELECT e.Emp_Id, e.Name, COUNT(*) AS Invoices_Today
FROM Employee e
         JOIN Book_Invoice bi ON e.Emp_Id = bi.Emp_Id
WHERE DATE(bi.Date_Out) = CURRENT_DATE
GROUP BY e.Emp_Id;

SELECT b.Title, COUNT(*) AS Times_Borrowed
FROM Book b
         JOIN Publisher p ON b.Pub_Id = p.Pub_Id
         JOIN Book_Invoice bi ON b.Book_Id = bi.Book_Id
WHERE p.City = 'Hanoi'
GROUP BY b.Title;

Select b.Title,b.Price
FROM Book b
JOIN publisher p on b.Pub_Id = p.Pub_Id
where b.Price <(SELECT AVG(Price) FROM book)
and p.City = 'Ha Noi';




