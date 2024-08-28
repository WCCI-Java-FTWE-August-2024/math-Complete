package wcci.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MathProblems {

  // Story 1: Adding Prices of Grocery Items
  public double Story1(double[] param) {
    double result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 2: Calculating Total Distance Traveled
  public int Story2(int[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 3: Summing Up Hours Worked in a Week
  public int Story3(int[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 4: Adding Scores in a Game
  public int Story4(int[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 5: Calculating Total Savings
  public float Story5(float[] param) {
    float result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 6: Adding Weights of Packages
  public float Story6(float[] param) {
    float result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return result;
  }

  // Story 7: Subtracting Expenses from Budget
  public double Story7(double budget, double[] param) {
    double result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return (budget - result);
  }

  // Story 8: Calculating Remaining Distance
  public int Story8(int totalMiles, int milesDriven) {
    return totalMiles - milesDriven;
  }

  // Story 9: Determining Remaining Work Hours
  public int Story9(int hoursNeeded, int hoursWorked) {
    return hoursNeeded - hoursWorked;
  }

  // Story 10: Subtracting Scores in a Game
  public int Story10(int startValue, int[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return startValue - result;
  }
  // Story 11: Calculating Remaining Savings After Purchases

  public double Story11(double startValue, double[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return startValue - result;
  }

  // Story 12: Subtracting Weights of Used Materials
  public int Story12(int startValue, int[] param) {
    int result = 0;
    for (int x = 0; x < param.length; x++) {
      result += param[x];
    }
    return startValue - result;
  }

  // Story 13: Calculating Total Cost of Multiple Items
  public double Story13(double first, int second) {
    return first * second;
  }

  // Story 14: Calculating Total Distance for Multiple Trips
  public int Story14(int milesEachday, int numberOfDays) {
    return milesEachday * numberOfDays;
  }

  // Story 15: Determining Weekly Earnings
  public double Story15(double payRate, int hours) {
    return payRate * hours;
  }

  // Story 16: Calculating Points Earned in Multiple Games
  public int Story16(int points, int levels) {
    return points * levels;
  }

  // Story 17: Calculating Total Savings with Interest
  public double Story17(double principle, int interest) {
    return (principle * .05) + principle;
  }

  // Story 18: Calculating Total Weight of Multiple Packages
  public int Story18(int weight, int packageCount) {
    return weight * packageCount;
  }
  // Story 19: Dividing Total Cost Among Friends

  public double Story19(double bill, int people) {
    return bill / people;
  }

  // Story 20: Calculating Average Distance Per Day
  public int Story20(int miles, int days) {
    return miles / days;
  }

  // Story 21: Determining Hourly Wage
  public double Story21(double wages, int hours) {
    return wages / hours;
  }

  // Story 22: Calculating Points Per Level
  public int Story22(int points, int levels) {
    return points / levels;
  }

  // Story 23: Calculating Interest Per Year
  public double Story23(double interest, int years) {
    return interest / years;
  }
  // Story 24: Determining Weight Per Package

  public int Story24(int weight, int packages) {
    return weight / packages;
  }

  // Story 25: Determining Remaining Amount After Full Payments
  public double Story25(double totalAmount, double eachItem) {
    return (totalAmount % eachItem);
  }

  // Story 26: Calculating Remainder of Distance
  public int Story26(int totalMiles, int milesPerDay) {
    return (totalMiles % milesPerDay);
  }
  // Story 27: Determining Extra Hours After Full Weeks

  public int Story27(int totalHours, int hoursPerWeek) {
    return (totalHours % hoursPerWeek);
  }
  // Story 28: Calculating Points Left After Levels

  public int Story28(int totalPoints, int pointsPerPass) {
    return totalPoints % pointsPerPass;
  }

  // Story 29: Finding Remaining Savings After Annual Payments
  public double Story29(double savingAmount, double paymentAmount) {
    return savingAmount % paymentAmount;
  }

  // Story 30: Determining Leftover Materials After Packing
  public int Story30(int totalWeight, int packageCapacity) {
    return totalWeight % packageCapacity;
  }

  // Story 31: Generating a Random Dice Roll
  public int Story31() {
    Random random = new Random();
    return random.nextInt(6) + 1;
  }

  // Story 32: Generating Random Scores for a Quiz
  public int Story32() {
    Random random = new Random();
    return random.nextInt(101);
  }

  // Story 33: Randomly Assigning Tasks
  public Map<String, String> Story33(List<String> tasks, List<String> teamMembers) {
    // Shuffle the tasks
    List<String> shuffledTasks = new ArrayList<>(tasks);
    Collections.shuffle(shuffledTasks);

    // Assign tasks to team members
    Map<String, String> assignments = new HashMap<>();
    for (int i = 0; i < teamMembers.size(); i++) {
      assignments.put(teamMembers.get(i), shuffledTasks.get(i));
    }
    return assignments;
  }

  // Story 34: Generating Random Game Events
  public String Story34(List<String> eventList) {
    Random random = new Random();
    return eventList.get(random.nextInt(eventList.size()) + 1);
  }

  // Story 35: Randomly Selecting a Discount
  public int Story35() {
    Random random = new Random();
    return (random.nextInt(3) + 1) * 10;
  }

  // Story 36: Generating Random Passwords
  public String Story36(int passwordLength) {
    String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random random = new Random();
    StringBuilder sb = new StringBuilder(passwordLength);
    for (int i = 0; i < passwordLength; i++) {
      int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
      sb.append(ALPHA_NUMERIC_STRING.charAt(index));
    }
    return sb.toString();
  }

  // Story 37: Randomly Selecting a Restaurant
  public String Story37(List<String> param) {
    Random random = new Random();
    return param.get(random.nextInt(param.size()));
  }

  // Story 38: Randomly Generating Lottery Numbers
  public int[] Story38(int numCount) {
    Random random = new Random();
    ArrayList<Integer> numbers = new ArrayList<>();
    for (int x = 1; x <= 50; x++) {
      numbers.add(x);
    }
    int[] result = new int[numCount];
    for(int x = 0;x<numCount;x++){
      int index =  random.nextInt(numbers.size());
      result[x] = numbers.get(index);
      numbers.remove(index);
    }
    return result;
  }

  // Story 39: Calculating Total Cost with Tax
  public double Story39(double amount, double tax) {
    return (amount * (tax / 100)) + amount;
  }
//Story 40: Calculating Average Speed
public long Story40(int distance, int hours, int mins) {
    return Math.round(distance/(hours +(mins/60d)));
}
//Story 41: Determining Total Savings After Annual Deposits

public double Story41(double principal, int annual_rate,int years) {
return principal * (1 + (annual_rate/100d)) * years;
}
//Story 42: Finding the Sum and Average of Three Numbers
public int[] Story42(int one, int two, int three) {
   int[] value = new int[]{(one + two + three),(one + two + three)/3};
   return value;
}
//Story 43: Converting Temperature from Celsius to Fahrenheit
public double Story43(int temperature) {
  return ((temperature*(9/5d))+32);
}

}
