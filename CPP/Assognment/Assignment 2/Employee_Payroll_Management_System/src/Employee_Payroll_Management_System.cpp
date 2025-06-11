#include <iostream>
#include<string>
#include<vector>
using namespace std;

class Employee{
private:
	int empID;
	string empName;
	double empSalary;
	double grossSalary;
public:
	Employee(int id, const string &name, double salary) {
	        empID = id;
	        empName = name;
	        empSalary = salary;
	        grossSalary = 0.0;
	    }
	int getEmpId() const {
		return empID;
	}

	void setEmpId(int empId) {
		empID = empId;
	}

	const string& getEmpName() const {
		return empName;
	}

	void setEmpName(const string &empName) {
		this->empName = empName;
	}

	double getEmpSalary() const {
		return empSalary;
	}

	void setEmpSalary(double empSalary) {
		this->empSalary = empSalary;
	}

	double getGrossSalary() const {
		return grossSalary;
	}

	void setGrossSalary(double grossSalary) {
		this->grossSalary = grossSalary;
	}

	void calculateGrossSalary(){

		if(empSalary<=5000){
			grossSalary=empSalary+(empSalary*(0.10));
		}
		else if(empSalary<=10000){
			grossSalary=empSalary+(empSalary*(0.15));
		}
		else{
			grossSalary=empSalary+(empSalary*(0.20));
		}
		cout << "Gross Salary for Employee ID " << empID << ": " << grossSalary << endl;
	}

	void displayEmployeeDetails(){
		cout<<"Employee Id: "<<empID<<endl;
		cout<<"Employee Name: "<<empName<<endl;
		cout<<"Employee Salary: "<<empSalary<<endl;
		cout<<"Employee gross salary: "<<grossSalary<<endl;
	}

};
Employee* findEmployeeById(vector<Employee> &employees,int id){
		for(auto &emp :employees){
			 if (emp.getEmpId() == id)
			            return &emp;
		}
		return nullptr;
	}
int main() {
	vector<Employee> employees;
	int choice;

	while(choice!=5){
		cout << "\n--- Employee Payroll Management System ---\n";
		cout << "1. Add New Employee\n";
		cout << "2. Calculate Gross Salary\n";
		cout << "3. Display Employee Details\n";
		cout << "4. Update Employee Information\n";
		cout << "5. Exit\n";
		cout << "Enter your choice: ";
		cin >> choice;

		switch (choice) {
		case 1: {
			int id;
		    string name;
		    double salary;
		    cout << "Enter Employee ID: ";
		    cin >> id;

		    if (findEmployeeById(employees, id) != nullptr) {
		    	cout << "Employee ID already exists!\n";
		    	break;
		    }
		    cout << "Enter Employee Name: ";
		    cin.ignore();
		    getline(cin, name);
		    cout << "Enter Employee Salary: ";
		    cin >> salary;

		    employees.push_back(Employee(id, name, salary));
		    cout << "Employee added successfully.\n";
		    break;
		}

		case 2: {
			int id;
		    cout << "Enter Employee ID to calculate gross salary: ";
		    cin >> id;
		    Employee* emp = findEmployeeById(employees, id);
		    if (emp)
		    	emp->calculateGrossSalary();
		    else
		    	cout << "Employee not found.\n";
		    break;
		}

		case 3: {
			int id;
		    cout << "Enter Employee ID to display details: ";
		    cin >> id;
		    Employee* emp = findEmployeeById(employees, id);
		    if (emp)
		    	emp->displayEmployeeDetails();
		    else
		    	cout << "Employee not found.\n";
		    break;
		}

		case 4: {
			int id;
			cout << "Enter Employee ID to update: ";
			cin >> id;
			Employee* emp = findEmployeeById(employees, id);
			if (emp) {
				string newName;
				double newSalary;
				cout << "Enter new name: ";
				cin.ignore();
				getline(cin, newName);
				cout << "Enter new salary: ";
				cin >> newSalary;
				emp->setEmpName(newName);
				emp->setEmpSalary(newSalary);
				cout << "Employee information updated.\n";
			} else {
				cout << "Employee not found.\n";
			}
			break;
		}

		case 5:
			cout << "Exiting program...\n";
			break;

		default:
			cout << "Invalid choice. Try again!\n";
		}
	}
	return 0;
}
