#Oops - Rent-A-Ride 


A customer to Rent a Ride, you book a cab. We charge you as per the distance covered. We charge 8rs/km.
The moment you click the button to RIDE, we search for the nearby drivers who will accept your ride.
Suppose there are 15 drivers near your location, then we send the request to the first driver who is closest to you, then the second, and so on.
There are a few conditions though, on the basis of which we cannot send the request to the nearby driver.

Condition 1:
If the driver rating is lower than 4. (Out of 5)

Condition 2:
If you selected a specific car, and that car driver is not the closest one.
In case there is no driver present as per your request for the car, we will ask you to select some other car.
Let’s see an example!

Driver  Car Model   Rating    Distance From Customer
A        Sedan       4          500m
B      Hatchback    4.3          1km
C      5-Seater      4.8         200m
D      Sedan         4.1        700m
E      Hatchback     4.7        430m

The customer booked a cab asking for a sedan. The total distance that will occur is 43km.
The driver with the closest distance is C but it is not a Sedan, therefore we will look for Sedan. Driver A (500) and Driver D(700). Both have ratings greater than 4.
Driver A gets the request first because he is the closest driver.
Driver A accepts the request. There is no mechanism now a driver can cancel the request. Unless he/she doesn’t fit the criteria.

SAMPLE INPUT 1 :

Customer Ride Distance: 43km
Car Requested: Sedan
List of Drivers with Details:

Driver   Car Model   Rating   Distance From Customer
A        Sedan        4           500m
B       Hatchback     4.3         1km
C       5-Seater      4.8         200m
D       Sedan         4.1         700m
E     Hatchback       4.7         430m

SAMPLE OUTPUT: 
Driver A will get you to the destination.
Your charge will be Rs 344 (43*8).
