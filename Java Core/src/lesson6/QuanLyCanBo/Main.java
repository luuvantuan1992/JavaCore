package lesson6.QuanLyCanBo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ManagerOfficer managerOfficer = new ManagerOfficer();
		while (true) {
			System.out.println("Application Manager Officer");
			System.out.println("Enter 1: To insert officer");
			System.out.println("Enter 2: To search officer by name: ");
			System.out.println("Enter 3: To show information officers");
			System.out.println("Enter 4: Delete Officer by ID Card People: ");
			System.out.println("Enter 5: To exit:");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println("Enter a: to insert Enginner");
				System.out.println("Enter b: to insert Worker");
				System.out.println("Enter c: to insert Staff");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Date of Birth: ");
					String dateofBirth = scanner.nextLine();
					System.out.print("Enter gender: ");
					String gender = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter ID Card People: ");
					String idCardPeople = scanner.nextLine();
					System.out.print("Enter branch: ");
					String branch = scanner.nextLine();
					System.out.print("Enter degree: ");
					String degree = scanner.nextLine();
					Officer engineer = new Engineer(name, dateofBirth, gender, address, idCardPeople, branch, degree);
					managerOfficer.addOfficer(engineer);
					System.out.println(engineer.toString());
					break;

				}
				case "b": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Date of Birth: ");
					String dateofBirth = scanner.nextLine();
					System.out.print("Enter gender: ");
					String gender = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter ID Card People: ");
					String idCardPeople = scanner.nextLine();
					System.out.print("Enter level: ");
					int level = scanner.nextInt();
					Officer worker = new Worker(name, dateofBirth, gender, address, idCardPeople, level);
					managerOfficer.addOfficer(worker);
					System.out.println(worker.toString());
					scanner.nextLine();
					break;
				}
				case "c": {
					System.out.print("Enter name: ");
					String name = scanner.nextLine();
					System.out.print("Enter Date of Birth: ");
					String dateofBirth = scanner.nextLine();
					System.out.print("Enter gender: ");
					String gender = scanner.nextLine();
					System.out.println("Enter address: ");
					String address = scanner.nextLine();
					System.out.print("Enter ID Card People: ");
					String idCardPeople = scanner.nextLine();
					System.out.print("Enter task: ");
					String task = scanner.nextLine();
					Officer staff = new Staff(name, dateofBirth, gender, address, idCardPeople, task);
					managerOfficer.addOfficer(staff);
					System.out.println(staff.toString());
					break;
				}
				default:
					System.out.println("Invalid");
					break;
				}
				break;
			}
			case "2": {
				System.out.print("Enter name to search: ");
				String name = scanner.nextLine();
				managerOfficer.searchOfficerByName(name).forEach(officer -> {
					System.out.println(officer.toString());
				});
				break;
			}
			case "3": {
				managerOfficer.showListInforOfficer();
				break;
			}
			case "4": {
				System.out.print("Enter ID Card People To Delete  ");
				String idCardPeople = scanner.nextLine();
				System.out.println(managerOfficer.deleteOfficerByIDCardPeople(idCardPeople) ? "True" : "Fail");
			}
				break;
			case "5": {
				return;
			}
			default:
				System.out.println("Invalid");
				continue;
			}

		}
	}

}
