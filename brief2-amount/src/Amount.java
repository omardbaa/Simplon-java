import java.util.Scanner;

public class Amount {

	public static void main(String[] args) {

		String name, paymentType;
		double salary,
				hours, normalHours, maxHours,
				overTime, overTimePayPercent50,
				hourPayRate, minHourPayRate;
		char operationType;
		Scanner reader = new Scanner(System.in);

		System.out.println("****** SalaryCalculator ******");
		System.out.println("Enter your Name: ");
		name = reader.nextLine();
		System.out.println("Hi there, " + name + "!");

		do {
			System.out.println("\n\nChoose between monthly or weekly payment method:");
			System.out.println("1-Weekly.\n2-Monthly.\n0-Exit.");
			System.out.print("Enter type of the operation: ");
			operationType = reader.next().charAt(0);

			if (operationType == '0') {
				System.out.println("Exit!");
				reader.close();
				break;
			} else if (operationType == '1') {
				paymentType = "Weekly";
				minHourPayRate = 25;
				normalHours = 40;
				maxHours = 50;
			} else if (operationType == '2') {
				paymentType = "Monthly";
				minHourPayRate = 20;
				normalHours = 180;
				maxHours = 200;
			} else {
				System.out.println("Error opertaion doesnt exist!");
				continue;
			}

			while (true) {
				System.out.printf("Enter the number of %s hours worked: ", paymentType);
				hours = reader.nextDouble();
				if (hours <= maxHours)
					break;
				System.out.printf("The total number of %s hours must not exceed %s hours per week!\r\n", paymentType,
						maxHours);
			}

			do {
				System.out.printf("Enter %s Pay Rate Per Hour: ", paymentType);
				hourPayRate = reader.nextDouble();
				if (hourPayRate < minHourPayRate)
					System.out.printf("The %s pay rate per hour must not be less than %s DH per hour!\r\n", paymentType,
							minHourPayRate);
			} while (hourPayRate < minHourPayRate);

			salary = hours * hourPayRate;
			if (normalHours < hours) {
				overTime = hours - normalHours;
				overTimePayPercent50 = overTime * hourPayRate / 2;
				System.out.printf("%s dh (normalPay) + %s dh (the 50%% for your %s overtime hours).", salary,
						overTimePayPercent50, overTime);
				salary += overTime * hourPayRate / 2;
			}
			System.out.printf("\nYour Total %s Salary is %s DH.", paymentType, salary);

		} while (true);

		reader.close();

	}

}
