CREATE TABLE users (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       email VARCHAR(255) UNIQUE,
                       password VARCHAR(500),
                       fullname VARCHAR(255),
                       status VARCHAR(50),
                       role VARCHAR(50)
);
CREATE TABLE products (
                          id INT PRIMARY KEY AUTO_INCREMENT,
                          name VARCHAR(500),
                          description TEXT,
                          price DECIMAL(19,3),
                          stock INT,
                          original_price DECIMAL(19,3),
                          category VARCHAR(500)
);
CREATE TABLE carts (
                       id INT PRIMARY KEY AUTO_INCREMENT,
                       user_id INT,
                       FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE cart_items (
                            id INT PRIMARY KEY AUTO_INCREMENT,
                            product_id INT,
                            quantity INT,
                            cart_id INT,
                            FOREIGN KEY (product_id) REFERENCES products(id),
                            FOREIGN KEY (cart_id) REFERENCES carts(id)
);
CREATE TABLE orders (
                        id INT PRIMARY KEY AUTO_INCREMENT,
                        description VARCHAR(500),
                        status ENUM(
                            'ORDER_INIT',
                            'ORDER_PROCESSING',
                            'ORDER_FAIL',
                            'ORDER_SUCCESS',
                            'ORDER_CANCEL',
                            'PREPARE_PRODUCT',
                            'DELIVERY_PROCESSING',
                            'DELIVERY_FAIL',
                            'DELIVERY_SUCCESS'
                            ),
                        total_amount DECIMAL(19, 3),
                        user_id INT,
                        FOREIGN KEY (user_id) REFERENCES users(id)
);
CREATE TABLE order_items (
                             id INT PRIMARY KEY AUTO_INCREMENT,
                             product_id INT,
                             order_id INT,
                             original_price DECIMAL(19,3),
                             price DECIMAL(19,3),
                             FOREIGN KEY (product_id) REFERENCES products(id),
                             FOREIGN KEY (order_id) REFERENCES orders(id)
);

INSERT INTO users (id, email, password, fullname, status, role) VALUES
                                                                    (1, 'john.doe@example.com', 'pass123', 'John Doe', 'active', 'customer'),
                                                                    (2, 'jane.smith@example.com', 'pass456', 'Jane Smith', 'active', 'customer'),
                                                                    (3, 'michael.brown@example.com', 'pass789', 'Michael Brown', 'active', 'customer'),
                                                                    (4, 'emily.johnson@example.com', 'pass234', 'Emily Johnson', 'active', 'customer'),
                                                                    (5, 'admin@company.com', 'admin123', 'Admin User', 'active', 'admin'),
                                                                    (6, 'david.wilson@example.com', 'pass345', 'David Wilson', 'active', 'customer'),
                                                                    (7, 'sarah.lee@example.com', 'pass567', 'Sarah Lee', 'active', 'customer'),
                                                                    (8, 'james.taylor@example.com', 'pass890', 'James Taylor', 'inactive', 'customer'),
                                                                    (9, 'jennifer.davis@example.com', 'pass321', 'Jennifer Davis', 'active', 'customer'),
                                                                    (10, 'robert.martinez@example.com', 'pass654', 'Robert Martinez', 'active', 'customer'),
                                                                    (11, 'manager@company.com', 'manager123', 'Manager User', 'active', 'manager'),
                                                                    (12, 'lisa.anderson@example.com', 'pass987', 'Lisa Anderson', 'active', 'customer'),
                                                                    (13, 'thomas.wilson@example.com', 'pass135', 'Thomas Wilson', 'active', 'customer'),
                                                                    (14, 'olivia.garcia@example.com', 'pass246', 'Olivia Garcia', 'active', 'customer'),
                                                                    (15, 'william.rodriguez@example.com', 'pass357', 'William Rodriguez', 'inactive', 'customer'),
                                                                    (16, 'sophia.lopez@example.com', 'pass468', 'Sophia Lopez', 'active', 'customer'),
                                                                    (17, 'daniel.lee@example.com', 'pass579', 'Daniel Lee', 'active', 'customer'),
                                                                    (18, 'emma.harris@example.com', 'pass680', 'Emma Harris', 'active', 'customer'),
                                                                    (19, 'matthew.clark@example.com', 'pass791', 'Matthew Clark', 'active', 'customer'),
                                                                    (20, 'ava.lewis@example.com', 'pass802', 'Ava Lewis', 'active', 'customer'),
                                                                    (21, 'staff@company.com', 'staff123', 'Staff User', 'active', 'staff'),
                                                                    (22, 'joseph.walker@example.com', 'pass913', 'Joseph Walker', 'active', 'customer'),
                                                                    (23, 'natalie.hall@example.com', 'pass024', 'Natalie Hall', 'active', 'customer'),
                                                                    (24, 'christopher.young@example.com', 'pass135', 'Christopher Young', 'active', 'customer'),
                                                                    (25, 'mia.allen@example.com', 'pass246', 'Mia Allen', 'active', 'customer'),
                                                                    (26, 'andrew.king@example.com', 'pass357', 'Andrew King', 'inactive', 'customer'),
                                                                    (27, 'abigail.wright@example.com', 'pass468', 'Abigail Wright', 'active', 'customer'),
                                                                    (28, 'joshua.scott@example.com', 'pass579', 'Joshua Scott', 'active', 'customer'),
                                                                    (29, 'elizabeth.green@example.com', 'pass680', 'Elizabeth Green', 'active', 'customer'),
                                                                    (30, 'ryan.baker@example.com', 'pass791', 'Ryan Baker', 'active', 'customer'),
                                                                    (31, 'hai.nguyen@example.com', 'pass802', 'Hai Nguyen', 'active', 'customer'),
                                                                    (32, 'minh.tran@example.com', 'pass913', 'Minh Tran', 'active', 'customer'),
                                                                    (33, 'linh.pham@example.com', 'pass024', 'Linh Pham', 'active', 'customer'),
                                                                    (34, 'nam.le@example.com', 'pass135', 'Nam Le', 'active', 'customer'),
                                                                    (35, 'van.hoang@example.com', 'pass246', 'Van Hoang', 'active', 'customer'),
                                                                    (36, 'tuan.vu@example.com', 'pass357', 'Tuan Vu', 'active', 'customer'),
                                                                    (37, 'hoa.dang@example.com', 'pass468', 'Hoa Dang', 'inactive', 'customer'),
                                                                    (38, 'thanh.trinh@example.com', 'pass579', 'Thanh Trinh', 'active', 'customer'),
                                                                    (39, 'huong.do@example.com', 'pass680', 'Huong Do', 'active', 'customer'),
                                                                    (40, 'dung.ngo@example.com', 'pass791', 'Dung Ngo', 'active', 'customer'),
                                                                    (41, 'hung.dinh@example.com', 'pass802', 'Hung Dinh', 'active', 'customer'),
                                                                    (42, 'lan.bui@example.com', 'pass913', 'Lan Bui', 'active', 'customer'),
                                                                    (43, 'support@company.com', 'support123', 'Support User', 'active', 'support'),
                                                                    (44, 'hong.duong@example.com', 'pass024', 'Hong Duong', 'active', 'customer'),
                                                                    (45, 'cuong.vo@example.com', 'pass135', 'Cuong Vo', 'active', 'customer'),
                                                                    (46, 'mai.cao@example.com', 'pass246', 'Mai Cao', 'active', 'customer'),
                                                                    (47, 'binh.luu@example.com', 'pass357', 'Binh Luu', 'inactive', 'customer'),
                                                                    (48, 'thu.ly@example.com', 'pass468', 'Thu Ly', 'active', 'customer'),
                                                                    (49, 'vinh.truong@example.com', 'pass579', 'Vinh Truong', 'active', 'customer'),
                                                                    (50, 'phuong.nguyen@example.com', 'pass680', 'Phuong Nguyen', 'active', 'customer');
INSERT INTO products (id, name, description, price, stock, original_price, category) VALUES
                                                                                         (1, 'Smartphone X Pro', 'Latest smartphone with advanced features', 799.99, 120, 899.99, 'Electronics'),
                                                                                         (2, 'Laptop Ultra Slim', '13-inch ultrabook with SSD', 1299.99, 45, 1499.99, 'Electronics'),
                                                                                         (3, 'Wireless Earbuds', 'Noise-cancelling bluetooth earbuds', 129.99, 200, 149.99, 'Audio'),
                                                                                         (4, 'LED Smart TV 55"', '4K Ultra HD Smart TV', 549.99, 30, 649.99, 'Electronics'),
                                                                                         (5, 'Coffee Maker Deluxe', 'Programmable coffee machine', 89.99, 60, 99.99, 'Kitchen'),
                                                                                         (6, 'Fitness Tracker', 'Waterproof fitness band with heart rate monitor', 59.99, 150, 79.99, 'Wearables'),
                                                                                         (7, 'Bluetooth Speaker', 'Portable wireless speaker', 49.99, 180, 69.99, 'Audio'),
                                                                                         (8, 'Digital Camera', '24MP digital camera with zoom', 399.99, 25, 449.99, 'Electronics'),
                                                                                         (9, 'Air Purifier', 'HEPA filter air cleaner for home', 149.99, 40, 179.99, 'Home'),
                                                                                         (10, 'Electric Toothbrush', 'Rechargeable sonic toothbrush', 39.99, 100, 49.99, 'Personal Care'),
                                                                                         (11, 'Gaming Console', 'Next-gen gaming system', 499.99, 35, 549.99, 'Gaming'),
                                                                                         (12, 'Blender Professional', 'High-speed blender for smoothies', 79.99, 50, 99.99, 'Kitchen'),
                                                                                         (13, 'Wireless Mouse', 'Ergonomic wireless mouse', 29.99, 120, 34.99, 'Computer Accessories'),
                                                                                         (14, 'External Hard Drive 1TB', 'Portable storage solution', 59.99, 80, 69.99, 'Computer Accessories'),
                                                                                         (15, 'Smart Watch', 'Fitness and notifications smartwatch', 199.99, 90, 229.99, 'Wearables'),
                                                                                         (16, 'E-book Reader', '6-inch e-reader with backlight', 119.99, 60, 139.99, 'Electronics'),
                                                                                         (17, 'Smart Thermostat', 'WiFi connected home thermostat', 129.99, 30, 149.99, 'Smart Home'),
                                                                                         (18, 'Robot Vacuum', 'Automated cleaning robot', 249.99, 25, 299.99, 'Home'),
                                                                                         (19, 'Ceramic Non-stick Pan', 'Premium kitchen cookware', 39.99, 70, 49.99, 'Kitchen'),
                                                                                         (20, 'Wireless Keyboard', 'Slim wireless keyboard', 49.99, 85, 59.99, 'Computer Accessories'),
                                                                                         (21, 'Protein Powder', 'Whey protein supplement 2kg', 59.99, 120, 69.99, 'Nutrition'),
                                                                                         (22, 'Yoga Mat', 'Non-slip exercise mat', 24.99, 100, 29.99, 'Fitness'),
                                                                                         (23, 'Hair Dryer', 'Professional salon hair dryer', 69.99, 45, 89.99, 'Personal Care'),
                                                                                         (24, 'Desk Lamp', 'LED adjustable desk light', 34.99, 60, 39.99, 'Home'),
                                                                                         (25, 'Water Filter Pitcher', 'Filtration system for clean water', 29.99, 80, 34.99, 'Kitchen'),
                                                                                         (26, 'Mechanical Keyboard', 'Gaming mechanical keyboard with RGB', 89.99, 40, 109.99, 'Computer Accessories'),
                                                                                         (27, 'Bathroom Scale', 'Digital weight scale', 19.99, 90, 24.99, 'Personal Care'),
                                                                                         (28, 'Winter Jacket', 'Warm waterproof winter coat', 129.99, 35, 159.99, 'Clothing'),
                                                                                         (29, 'Running Shoes', 'Lightweight athletic footwear', 89.99, 65, 109.99, 'Footwear'),
                                                                                         (30, 'Backpack', 'Durable travel backpack', 49.99, 55, 59.99, 'Accessories'),
                                                                                         (31, 'Sunglasses', 'UV protection polarized glasses', 79.99, 40, 99.99, 'Accessories'),
                                                                                         (32, 'Portable Charger', '10000mAh power bank', 29.99, 150, 39.99, 'Electronics'),
                                                                                         (33, 'Smart Light Bulbs', 'WiFi controlled color changing bulbs', 39.99, 70, 49.99, 'Smart Home'),
                                                                                         (34, 'Security Camera', 'Wireless home security camera', 79.99, 30, 99.99, 'Smart Home'),
                                                                                         (35, 'Electric Kettle', 'Fast-boiling water kettle', 29.99, 60, 34.99, 'Kitchen'),
                                                                                         (36, 'Digital Food Scale', 'Precision kitchen scale', 19.99, 75, 24.99, 'Kitchen'),
                                                                                         (37, 'Wireless Headphones', 'Over-ear bluetooth headphones', 149.99, 50, 179.99, 'Audio'),
                                                                                         (38, 'Massage Gun', 'Percussion therapy device', 99.99, 35, 129.99, 'Health'),
                                                                                         (39, 'Cast Iron Skillet', 'Pre-seasoned cooking pan', 29.99, 45, 39.99, 'Kitchen'),
                                                                                         (40, 'Resistance Bands Set', 'Home workout equipment', 19.99, 100, 29.99, 'Fitness'),
                                                                                         (41, 'Office Chair', 'Ergonomic desk chair', 149.99, 25, 179.99, 'Furniture'),
                                                                                         (42, 'Foam Roller', 'Muscle recovery equipment', 24.99, 70, 29.99, 'Fitness'),
                                                                                         (43, 'Slow Cooker', '6-quart programmable cooker', 49.99, 40, 59.99, 'Kitchen'),
                                                                                         (44, 'Face Moisturizer', 'Hydrating skin cream', 24.99, 90, 29.99, 'Beauty'),
                                                                                         (45, 'Nonstick Cookware Set', '10-piece kitchen set', 129.99, 20, 149.99, 'Kitchen'),
                                                                                         (46, 'USB Flash Drive 64GB', 'Portable storage device', 19.99, 110, 24.99, 'Computer Accessories'),
                                                                                         (47, 'Hand Sanitizer', 'Antibacterial gel 500ml', 4.99, 200, 6.99, 'Health'),
                                                                                         (48, 'Cotton T-shirt', 'Basic casual tee', 14.99, 150, 19.99, 'Clothing'),
                                                                                         (49, 'Sleep Mask', 'Blackout eye mask for travel', 12.99, 80, 14.99, 'Travel'),
                                                                                         (50, 'Wireless Charging Pad', 'Fast charging station', 24.99, 65, 29.99, 'Electronics');
INSERT INTO carts (id, user_id) VALUES
                                    (1, 1),
                                    (2, 2),
                                    (3, 3),
                                    (4, 4),
                                    (5, 5),
                                    (6, 6),
                                    (7, 7),
                                    (8, 8),
                                    (9, 9),
                                    (10, 10),
                                    (11, 11),
                                    (12, 12),
                                    (13, 13),
                                    (14, 14),
                                    (15, 15),
                                    (16, 16),
                                    (17, 17),
                                    (18, 18),
                                    (19, 19),
                                    (20, 20),
                                    (21, 21),
                                    (22, 22),
                                    (23, 23),
                                    (24, 24),
                                    (25, 25),
                                    (26, 26),
                                    (27, 27),
                                    (28, 28),
                                    (29, 29),
                                    (30, 30),
                                    (31, 31),
                                    (32, 32),
                                    (33, 33),
                                    (34, 34),
                                    (35, 35),
                                    (36, 36),
                                    (37, 37),
                                    (38, 38),
                                    (39, 39),
                                    (40, 40),
                                    (41, 41),
                                    (42, 42),
                                    (43, 43),
                                    (44, 44),
                                    (45, 45),
                                    (46, 46),
                                    (47, 47),
                                    (48, 48),
                                    (49, 49),
                                    (50, 50);
INSERT INTO cart_items (id, product_id, quantity, cart_id) VALUES
                                                               (1, 5, 1, 1),
                                                               (2, 10, 2, 1),
                                                               (3, 15, 1, 2),
                                                               (4, 20, 3, 3),
                                                               (5, 25, 1, 4),
                                                               (6, 30, 2, 5),
                                                               (7, 35, 1, 5),
                                                               (8, 40, 1, 6),
                                                               (9, 45, 1, 7),
                                                               (10, 2, 1, 8),
                                                               (11, 7, 2, 9),
                                                               (12, 12, 1, 10),
                                                               (13, 17, 1, 11),
                                                               (14, 22, 1, 12),
                                                               (15, 27, 1, 12),
                                                               (16, 32, 2, 13),
                                                               (17, 37, 1, 14),
                                                               (18, 42, 1, 15),
                                                               (19, 47, 3, 16),
                                                               (20, 1, 1, 17),
                                                               (21, 6, 1, 18),
                                                               (22, 11, 1, 19),
                                                               (23, 16, 1, 20),
                                                               (24, 21, 2, 21),
                                                               (25, 26, 1, 22),
                                                               (26, 31, 1, 23),
                                                               (27, 36, 2, 24),
                                                               (28, 41, 1, 25),
                                                               (29, 46, 1, 26),
                                                               (30, 3, 1, 27),
                                                               (31, 8, 1, 28),
                                                               (32, 13, 2, 29),
                                                               (33, 18, 1, 30),
                                                               (34, 23, 1, 31),
                                                               (35, 28, 1, 32),
                                                               (36, 33, 2, 33),
                                                               (37, 38, 1, 34),
                                                               (38, 43, 1, 35),
                                                               (39, 48, 3, 36),
                                                               (40, 4, 1, 37),
                                                               (41, 9, 1, 38),
                                                               (42, 14, 1, 39),
                                                               (43, 19, 1, 40),
                                                               (44, 24, 2, 41),
                                                               (45, 29, 1, 42),
                                                               (46, 34, 1, 43),
                                                               (47, 39, 1, 44),
                                                               (48, 44, 2, 45),
                                                               (49, 49, 1, 46),
                                                               (50, 50, 1, 47);
INSERT INTO orders (id, description, status, total_amount, user_id) VALUES
                                                                        (1, 'Weekend purchase', 'ORDER_SUCCESS', 129.98, 1),
                                                                        (2, 'Birthday gift', 'DELIVERY_SUCCESS', 199.99, 2),
                                                                        (3, 'Monthly groceries', 'ORDER_PROCESSING', 149.97, 3),
                                                                        (4, 'New home items', 'PREPARE_PRODUCT', 29.99, 4),
                                                                        (5, 'Tech upgrade', 'DELIVERY_PROCESSING', 279.98, 5),
                                                                        (6, 'Fitness equipment', 'ORDER_SUCCESS', 19.99, 6),
                                                                        (7, 'Kitchen essentials', 'DELIVERY_SUCCESS', 129.99, 7),
                                                                        (8, 'Gift for mom', 'ORDER_INIT', 1299.99, 8),
                                                                        (9, 'Office supplies', 'ORDER_PROCESSING', 79.98, 9),
                                                                        (10, 'Summer clothes', 'PREPARE_PRODUCT', 129.99, 10),
                                                                        (11, 'Winter gear', 'DELIVERY_PROCESSING', 129.99, 11),
                                                                        (12, 'Back to school', 'ORDER_FAIL', 94.98, 12),
                                                                        (13, 'Anniversary gift', 'ORDER_CANCEL', 149.99, 13),
                                                                        (14, 'Home improvement', 'DELIVERY_FAIL', 24.99, 14),
                                                                        (15, 'Electronics upgrade', 'ORDER_SUCCESS', 199.99, 15),
                                                                        (16, 'Holiday shopping', 'DELIVERY_SUCCESS', 59.97, 16),
                                                                        (17, 'Personal care items', 'ORDER_PROCESSING', 799.99, 17),
                                                                        (18, 'Kitchen renovation', 'PREPARE_PRODUCT', 59.99, 18),
                                                                        (19, 'Travel accessories', 'DELIVERY_PROCESSING', 499.99, 19),
                                                                        (20, 'Workout equipment', 'ORDER_SUCCESS', 89.99, 20),
                                                                        (21, 'Home office setup', 'DELIVERY_SUCCESS', 119.98, 21),
                                                                        (22, 'Camping gear', 'ORDER_INIT', 79.99, 22),
                                                                        (23, 'Baby products', 'ORDER_PROCESSING', 119.99, 23),
                                                                        (24, 'Pet supplies', 'PREPARE_PRODUCT', 69.98, 24),
                                                                        (25, 'Gaming accessories', 'DELIVERY_PROCESSING', 149.99, 25),
                                                                        (26, 'Beauty products', 'ORDER_FAIL', 79.99, 26),
                                                                        (27, 'Sport equipment', 'ORDER_CANCEL', 59.98, 27),
                                                                        (28, 'Smart home devices', 'DELIVERY_FAIL', 149.99, 28),
                                                                        (29, 'Computer upgrade', 'ORDER_SUCCESS', 59.99, 29),
                                                                        (30, 'Outdoor furniture', 'DELIVERY_SUCCESS', 399.99, 30),
                                                                        (31, 'Audio equipment', 'ORDER_PROCESSING', 69.99, 31),
                                                                        (32, 'Phone accessories', 'PREPARE_PRODUCT', 79.99, 32),
                                                                        (33, 'Cookware set', 'DELIVERY_PROCESSING', 39.98, 33),
                                                                        (34, 'Bathroom essentials', 'ORDER_SUCCESS', 249.99, 34),
                                                                        (35, 'Health supplements', 'DELIVERY_SUCCESS', 99.99, 35),
                                                                        (36, 'Lighting fixtures', 'ORDER_INIT', 79.98, 36),
                                                                        (37, 'Party supplies', 'ORDER_PROCESSING', 99.99, 37),
                                                                        (38, 'Video games', 'PREPARE_PRODUCT', 29.99, 38),
                                                                        (39, 'Jewelry', 'DELIVERY_PROCESSING', 29.97, 39),
                                                                        (40, 'Books', 'ORDER_FAIL', 549.99, 40),
                                                                        (41, 'Gardening tools', 'ORDER_CANCEL', 29.99, 41),
                                                                        (42, 'Cleaning supplies', 'DELIVERY_FAIL', 59.99, 42),
                                                                        (43, 'Hardware tools', 'ORDER_SUCCESS', 39.99, 43),
                                                                        (44, 'Storage solutions', 'DELIVERY_SUCCESS', 69.98, 44),
                                                                        (45, 'Car accessories', 'ORDER_PROCESSING', 24.99, 45),
                                                                        (46, 'Craft supplies', 'PREPARE_PRODUCT', 79.99, 46),
                                                                        (47, 'Home decor', 'DELIVERY_PROCESSING', 29.99, 47),
                                                                        (48, 'Snacks and treats', 'ORDER_SUCCESS', 49.98, 48),
                                                                        (49, 'Gift cards', 'DELIVERY_SUCCESS', 12.99, 49),
                                                                        (50, 'Tech accessories', 'ORDER_INIT', 24.99, 50);