#include <iostream>
#include<string>
using namespace std;

class Student{
	private:
		string name;
		int rollNumber;
		float marks;
		char grade;

	public:
	char getGrade() const {
		return grade;
	}

	void setGrade(char grade) {
		this->grade = grade;
	}

	float getMarks() const {
		return marks;
	}

	void setMarks(float marks) {
		this->marks = marks;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string &name) {
		this->name = name;
	}

	int getRollNumber() const {
		return rollNumber;
	}

	void setRollNumber(int rollNumber) {
		this->rollNumber = rollNumber;
	}

	void calculateGrade(){
		if(marks >= 90){
			grade = 'A';
		}
		else if(marks >= 80){
			grade = 'B';
		}
		else if(marks >= 70){
			grade = 'C';
		}
		else if(marks >= 60){
			grade = 'D';
		}
		else{
			grade = 'F';
		}
		cout << "\nGrade calculated successfully.\n";
	}


	void display(){
		cout<<"\n Name : "<<name<<endl;
		cout<<"\n Roll number : "<<rollNumber<<endl;
		cout<<"\n Marks : "<<marks<<endl;
		cout<<"\n Grade : "<<grade<<endl;
	}
};



int main() {
	Student s;
	int choice;
	string name;
	int rollNumber;
	float marks;
	char grade;

	while(choice!=4){
		cout<<"\n Menu \n"<<endl;
		cout<<"1. Enter the details \n"<<endl;
		cout<<"2. Display the details \n"<<endl;
		cout<<"3. Calculate Grade \n"<<endl;
		cout<<"4. Exit the program \n"<<endl;
		cout<<"Enter your choice: ";
		cin>>choice;
		cin.ignore();

		switch(choice){
			case(1):
					cout<<"\n Enter name: ";
					getline(cin,name);
					cout<<"\n Enter Roll number: ";
					cin>>rollNumber;
					cout<<"\n Enter Marks: ";
					cin>>marks;
					s.setName(name);
					s.setRollNumber(rollNumber);
					s.setMarks(marks);
					break;

			case(2):
					s.display();
					break;

			case(3):
					s.calculateGrade();
					break;
			case(4):
					cout<<"Exiting the program....";
					break;
			default:
				cout<<"\n Enter valid choice";
		}

	}
	return 0;
}
