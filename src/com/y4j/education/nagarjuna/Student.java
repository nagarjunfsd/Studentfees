package com.y4j.education.nagarjuna;

public class Student {	
	
		 String fName;
		 String lName;
		 String FullName;
		 String Email;
		 long Mobile;
		 char Section;
		 char Gender;
		 byte Age;
		 long TotalFees;
		
		

		Student(String fName,String lName, String Email, byte Age, long Mobile, char Section, char Gender, long TotalFees){
				this.fName = fName;
				this.lName = lName;
				this.Email = Email;
				this.Age = Age;
				this.Section = Section;
			    this.Gender = Gender;
				this.Mobile = Mobile;
				this.TotalFees = TotalFees;
		}
				
		
		 String getFullName(String fName,String lName) {
			String FullName = fName + " "+lName;
		    return FullName;
		 }		
		 int getageInMonths(int Age ) {
			 int ageInMonths = Age * 12;
			 return ageInMonths;
		 }		 
			
		float calculateMonthlyFeesPaid(long TotalFees) {
			float MonthlyFeesPaid = (float)TotalFees / 12;
			return MonthlyFeesPaid;
		}
		
		void studentDetails() {
			System.out.println("Student Details ");
			System.out.println("Full Name:" +this.getFullName(this.fName, this.lName));
			System.out.println("Section:" +this.Section);
		    System.out.println("Gender:" +this.Gender);
			System.out.println("Email:" +this.Email);
			System.out.println("Age in Months:" +this.getageInMonths(this.Age));
			System.out.println("Phone Number;" +this.Mobile);			
			System.out.println("Fees Paid per Month:" +this.calculateMonthlyFeesPaid(this.TotalFees));
			
			
		}
		
	}


