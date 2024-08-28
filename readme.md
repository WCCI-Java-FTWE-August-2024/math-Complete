## Objective
This session focuses heavily on Test-Driven Development (TDD). We will also utilize GitHub for version control, using commands such as fetch, branch, commit, push, pull, and merge.

## What is Test-Driven Development (TDD)?
Test-Driven Development is a software development approach where tests are written before the code that needs to be tested. This ensures that the code meets its requirements and facilitates more reliable and maintainable code.

## Overview
The Students will not get the stories in advance, thay will get a story to code for based on a random selection in PickerWheel. You will show the Stories one at a time and allow the student to lead the class through the development of the UnitTest and then code up a function. 

In this session, students will solve problems using TDD methods and utilize GitHub for version control. We will conduct a Round Robin exercise focused on math problems using the PickerWheel platform.

## Round Robin Exercise

1. Load the PickerWheel platform.
2. Select a student to lead the class in coding a randomly assigned problem.
3. Each student will follow along and implement the solution in their own codebases.
4. Repeat until each student has led the class. Continue the cycle as time permits.
----
## Steps for Students

1. Ensure you have the latest version of the "main" branch by using fetch.
2. Create a new branch with an appropriate name to address the issue.
3. Add a UnitTest based on the problem you're solving.
   - Write a unit test or an integration test that replicates the requirement.
   - This stage it will fail RED
4. Implement the code to fix the problem.
   - Make necessary code changes to resolve the issue.
   - This will a GREEN stage.
5. Time to REFACTOR
   - make sure Clean Code
   - 
6. Refine and reengineer the test.
   -  Ensure the test covers all edge cases and validates the fix effectively.
   - Exceptions are handled as additional UnitTest
7.  Repeat steps 3-5 until the problem is fully resolved and all tests pass.
8.  Commit your changes.
9.  Push the branch to the remote repository.
10. Create a pull request for peer review.
11. Go to your repository on GitHub and initiate a pull request from your branch to the main branch.
12. Address feedback and repeat steps 3-9 until the pull request passes peer review.
13. Fetch the latest changes from the main branch again to ensure you're up to date.
14. Merge your current branch into the main branch.
    
## Additional Stories
- **Story 1:** Adding Prices of Grocery Items
**Objective:** Understand how to add prices of multiple grocery items using Java.
````
    Story: Sarah buys apples for $3, bread for \$2, and milk for \$4. The program should calculate and display the total amount spent, which should be $9.
````

- **Story 2:**  Calculating Total Distance Traveled
**Objective:** Learn how to add distances using Java.
````
    Story: Jake runs 5 miles on Monday, 3 miles on Tuesday, and 4 miles on Wednesday. 
        The program should add these distances and display the total, which is 12 miles.
````
- **Story 3:**  Summing Up Hours Worked in a Week
  **Objective:** Practice adding hours worked each day in a week using Java.
````
    Story: Linda worked 4 hours on Monday, 6 hours on Tuesday, 5 hours on Wednesday, 7 hours on Thursday, and 3 hours on Friday. The program should calculate the sum and display the total, which is 25 hours.
````

- **Story 4:**  Adding Scores in a Game
**Objective:** Understand how to add scores in a game using Java.
````
    Story: Tom scored 150 points in level 1, 200 points in level 2, and 180 points in level 3. The program should add these scores and display the total, which is 530 points.
````
- **Story 5:**  Calculating Total Savings
**Objective:** Apply addition in calculating total savings using Java.
````
    Story: Emma saved \$20 in January, \$30 in February, and \$25 in March. The program should add these amounts and display the total savings, which is \$75.
````

- **Story 6:**  Adding Weights of Packages
**Objective:** Practice adding weights of packages using Java.
````
    Story: Alex has three packages weighing 10 kg, 15 kg, and 5 kg. The program should add the weights and display the total weight, which is 30 kg.
````
## Subtraction
- **Story 7:**  Subtracting Expenses from Budget
**Objective:** Understand how to subtract expenses from a budget using Java.
````
    Story: Emma has a budget of $50. She spends $10 on groceries, $15 on transport, and $5 on coffee. The program should calculate and display the remaining budget, which is $20.
````

- **Story 8:** Calculating Remaining Distance
**Objective:** Learn how to subtract distances using Java.
````
    Story: John is driving 100 miles and has traveled 40 miles. The program should subtract the distance traveled from the total distance and display the remaining distance, which is 60 miles.
````

- **Story 9:** Determining Remaining Work Hours
**Objective:** Practice subtracting hours worked from total required hours using Java.
````
    Story: Lisa needs to work 40 hours this week and has already worked 32 hours. The program should calculate and display the remaining hours, which is 8 hours.
````

- **Story 10:** Subtracting Scores in a Game
**Objective:** Understand how to subtract points lost from the total score using Java.
````
    Story: Tom starts with 500 points and loses 50 points in level 1, 30 points in level 2, and 20 points in level 3. The program should subtract the points lost from the initial score and display the remaining score, which is 400 points.
````

- **Story 11:** Calculating Remaining Savings After Purchases
**Objective:** Apply subtraction in calculating remaining savings using Java.
````
    Story: Sarah has \$200 in her savings account and spends \$50 on a bag and \$30 on shoes. The program should subtract the expenses from the total savings and display the remaining amount, which is \$120.
````

- **Story 12:** Subtracting Weights of Used Materials
**Objective:** Practice subtracting used material weights from the total available weight using Java.
````
    Story: Alex has 100 kg of construction materials and uses 30 kg for the foundation and 20 kg for the walls. The program should subtract the used weights from the total weight and display the remaining weight, which is 50 kg.
````

## Multiplication
- **Story 13:** Calculating Total Cost of Multiple Items
**Objective:** Understand how to multiply the cost of an item by the quantity purchased using Java.
````
    Story: Sarah buys apples for \$3 each and wants to purchase 5 apples. The program should calculate and display the total cost, which should be \$15.
````

- **Story 14:** Calculating Total Distance for Multiple Trips
**Objective:** Learn how to multiply the distance of a single trip by the number of trips using Java.
````
    Story: John travels 10 miles to work every day. He wants to know the total distance he travels in a week (5 days). The program should multiply the distance by the number of days and display the total distance, which is 50 miles.
````

- **Story 15:** Determining Weekly Earnings
**Objective:** Practice multiplying hourly wage by the number of hours worked using Java.
````
    Story: Lisa works part-time and earns \$15 per hour. She works 20 hours a week. The program should calculate and display the total earnings, which is \$300.
````

- **Story 16:** Calculating Points Earned in Multiple Games
**Objective:** Understand how to multiply points earned per game by the number of games played using Java.
````
    Story: Tom earns 50 points in each level of a video game. He plays 10 levels. The program should multiply the points per level by the number of levels and display the total points, which is 500 points.
````

- **Story 17:** Calculating Total Savings with Interest
**Objective:** Apply multiplication in calculating savings with interest using Java.
````
    Story: Sarah has \$200 in her savings account, and the account earns 5% interest annually. She wants to know the total amount after one year. The program should multiply the savings by the interest rate and add it to the initial savings, displaying the total amount, which is \$210.
````

- **Story 18:** Calculating Total Weight of Multiple Packages
**Objective:** Practice multiplying the weight of a single package by the number of packages using Java.

````
    Story: Alex needs to ship 10 packages, each weighing 5 kg. He wants to know the total weight of all packages. The program should multiply the weight per package by the number of packages and display the total weight, which is 50 kg.
````

## Division
- **Story 19:** Dividing Total Cost Among Friends
**Objective:** Understand how to divide a total cost among multiple people using Java.
````
    Story: Sarah and her 3 friends go out for dinner, and the total bill is \$80. They want to split the bill equally among themselves. The program should calculate and display how much each person has to pay, which should be \$20.
````

- **Story 20:** Calculating Average Distance Per Day
**Objective:** Learn how to divide the total distance by the number of days using Java.
````
    Story: John ran a total of 35 miles over 7 days. He wants to know the average distance he ran per day. The program should divide the total distance by the number of days and display the average distance, which is 5 miles per day.
````

- **Story 21:** Determining Hourly Wage
**Objective:** Practice dividing total earnings by the number of hours worked using Java.
````
    Story: Lisa earned \$300 after working 20 hours. She wants to know her hourly wage. The program should divide the total earnings by the number of hours and display the hourly wage, which is \$15.
````

- **Story 22:** Dividing Total Points Among Levels
**Objective:** Understand how to divide the total points by the number of levels using Java.
````
    Story: Tom earned a total of 500 points after playing 10 levels. He wants to know the average points earned per level. The program should divide the total points by the number of levels and display the average points, which is 50 points per level.
````

- **Story 23:** Calculating Monthly Savings
**Objective:** Apply division in calculating monthly savings using Java.
````
    Story: Sarah wants to save $600 in 6 months. She wants to know how much she needs to save each month. The program should divide the total savings goal by the number of months and display the monthly savings, which is $100.
````

- **Story 24:** Dividing Total Weight Among Boxes
**Objective:** Practice dividing the total weight by the number of boxes using Java.
````
    Story: Alex has 50 kg of materials and wants to pack them into 5 boxes equally. He wants to know the weight of each box. The program should divide the total weight by the number of boxes and display the weight per box, which is 10 kg.
````

## Modulo

- **Story 25:** Determining Remaining Amount After Full Payments
**Objective**: To understand how to use modulus to find the remaining amount after making full payments using Java.
````
    Story: Sarah has \$100 and each item she wants to buy costs \$7. She wants to know how much money she will have left after buying as many items as possible. The program should use the modulus operator to calculate and display the remaining amount, which should be \$2.
````

- **Story 26:** Calculating Remainder of Distance
**Objective**: To learn how to use modulus to find the remainder of a distance using Java.
````
    Story: John is traveling a total distance of 123 miles. His car needs to refuel every 50 miles. He wants to know how many miles he will travel after the last full refuel before reaching his destination. The program should use the modulus operator to calculate and display the remaining distance, which is 23 miles.
````

- **Story 27:** Determining Extra Hours After Full Weeks
**Objective**: To practice using modulus to find extra hours after full weeks using Java.
````
    Story: Lisa records the number of hours she has worked over several weeks. She has worked a total of 85 hours. She wants to know how many extra hours she has worked after accounting for full 40-hour weeks. The program should use the modulus operator to calculate and display the extra hours, which is 5 hours.
````

- **Story 28:** Calculating Points Left After Levels
**Objective**: To understand how to use modulus to find points left after completing levels using Java.
````
    Story: Tom has earned a total of 730 points in a video game. Each level requires 100 points to pass. He wants to know how many points he has left after passing as many levels as possible. The program should use the modulus operator to calculate and display the remaining points, which is 30 points.
````

- **Story 29:** Finding Remaining Savings After Annual Payments
**Objective**: To apply modulus in finding remaining savings after annual payments using Java.
````
    Story: Sarah has \$250 in her savings account and needs to make an annual payment of \$45. She wants to know how much money she will have left after making as many full payments as possible. The program should use the modulus operator to calculate and display the remaining savings, which is \$25.
````

- **Story 30:** Determining Leftover Materials After Packing
**Objective**: To practice using modulus to find leftover materials after packing using Java.
````
    Story: Alex has 92 kg of materials to be packed into boxes, each with a capacity of 15 kg. He wants to know how much material will be left unpacked after filling as many boxes as possible. The program should use the modulus operator to calculate and display the leftover materials, which is 2 kg.
````

## Random

- **Story 31:** Generating a Random Dice Roll
**Objective**: To understand how to generate a random number to simulate a dice roll using Java.
````
    Story: Sarah is creating a board game and needs to simulate the roll of a six-sided dice. She wants the program to generate a random number between 1 and 6 and display the result. For example, the program might output "You rolled a 4."
````

- **Story 32:** Generating Random Scores for a Quiz
**Objective**: To learn how to generate random scores for a quiz using Java.
````
    Story: John is creating a quiz application where each participant gets a random score between 0 and 100. He wants the program to generate a random score for a participant and display it. For instance, the program might output "Your quiz score is 85."
````

- **Story 33:** Randomly Assigning Tasks
**Objective**: To practice generating random numbers to assign tasks using Java.
````
    Story: Lisa manages a team and wants to assign tasks randomly. She has a list of 5 tasks and 5 team members. She wants the program to randomly assign one task to each member and display the assignments. For example, the program might output "Task 3 is assigned to Member 1."
````

- **Story 34:** Generating Random Game Events
**Objective**: To understand how to use random numbers to generate events in a game using Java.
````
    Story: Tom is developing a game where random events happen to the player. The events can be "find treasure," "meet a monster," or "nothing happens." He wants the program to randomly select one of these events and display it. For instance, the program might output "You meet a monster."
````

- **Story 30:** Randomly Selecting a Discount
**Objective**: To apply random number generation in selecting a discount using Java.
````
    Story: Sarah is running a promotion where customers can get a random discount of 10%, 20%, or 30% on their purchase. She wants the program to randomly select a discount percentage and display it. For example, the program might output "You get a 20% discount!"
````

- **Story 36:** Generating Random Passwords
**Objective**: To practice generating random strings for passwords using Java.
````
    Story: Alex needs to create random passwords for new users. Each password should be 8 characters long, consisting of random letters and numbers. He wants the program to generate and display a random password. For instance, the program might output "Your new password is A1B2C3D4."
````

- **Story 37:** Randomly Selecting a Restaurant
**Objective**: To use random number generation for making a decision using Java.
````
    Story: Emma and her friends can't decide where to eat and have a list of 5 favorite restaurants. She wants the program to randomly select a restaurant from the list and display the choice. For example, the program might output "Let's eat at Restaurant 4."
````

- **Story 38:** Randomly Generating Lottery Numbers
**Objective**: To understand how to generate a set of random numbers for a lottery using Java.
```` 
    Story: Jake is creating a lottery game where each ticket has 5 unique random numbers between 1 and 50. He wants the program to generate and display a set of lottery numbers. For instance, the program might output "Your lottery numbers are: 7, 14, 22, 35, 48."
````
## Compound

- **Story 39:** Calculating Total Cost with Tax
**Objective**: To understand how to calculate the total cost of an item including tax using Java.
````
Story: Sarah buys an item that costs \$50 and the sales tax rate is 8%. She wants to know the total cost after tax.

**Steps**:
1. Calculate the tax amount: 
   Tax = Cost × Tax Rate
2. Calculate the total cost: 
   Total Cost = Cost + Tax

The program should calculate and display the total cost after tax.
````

- **Story 40:** Calculating Average Speed
**Objective**: To learn how to calculate the average speed of a trip using Java.
````
    Story: John drives 150 miles in 3 hours and 30 minutes. He wants to calculate his average speed in miles per hour.

**Steps**:
1. Convert the time to hours: 
   Time = 3.5 hours
2. Calculate the average speed: 
   Average Speed = Distance / Time

The program should calculate and display the average speed.
````

- **Story 41:** Determining Total Savings After Annual Deposits
**Objective**: To practice calculating total savings after making annual deposits using Java.
````
    Story: Lisa deposits \$200 into her savings account every year for 5 years at 8% annual interest. She wants to know the total amount saved at the end of 5 years.

**Steps**:
1. Use the formula for compound interest: 
   A = P(1 + r)^t

The program should calculate and display the total savings.
````

### Story 42: Finding the Sum and Average of Three Numbers
**Objective**: To understand how to find the sum and average of multiple numbers using Java.

**Story**:
Tom has three test scores: 85, 90, and 78. He wants to find the sum and average of these scores.

**Steps**:
1. Calculate the sum: 
   Sum = Score1 + Score2 + Score3
2. Calculate the average: 
   Average = Sum / 3

The program should calculate and display both the sum and the average.

### Story 43: Converting Temperature from Celsius to Fahrenheit
**Objective**: To practice converting temperatures using Java.

**Story**:
Alex wants to convert a temperature of 25°C to Fahrenheit. The formula for the conversion is:

**Steps**:
1. Apply the conversion formula to calculate the temperature in Fahrenheit.

The program should calculate and display the temperature in Fahrenheit.