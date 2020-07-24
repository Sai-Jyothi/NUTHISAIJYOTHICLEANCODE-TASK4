package com.epam_task_cost.Clean_Code;
import java.util.*;

public class InterestCalculator {
		public double simpleInterest(double principal,double rate,double timeInYears) {
			return principal*rate*timeInYears/100;
		}
		public double compoundInterest(double principal,double rate,double timeInYears, int noOfTimesInterestCompoundedInYear) {
			return principal*(Math.pow(1+(rate/noOfTimesInterestCompoundedInYear),noOfTimesInterestCompoundedInYear*timeInYears));
		}

	}