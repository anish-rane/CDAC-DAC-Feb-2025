#include <iostream>
#include<string>
using namespace std;

class BankAccount{
private:
	int accountNumber;
	string accountHolderName;
	double balance;

public:
	const string& getAccountHolderName() const {
		return accountHolderName;
	}

	void setAccountHolderName(const string &accountHolderName) {
		this->accountHolderName = accountHolderName;
	}

	int getAccountNumber() const {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this->accountNumber = accountNumber;
	}

	double getBalance() const {
		return balance;
	}

	void setBalance(double balance) {
		this->balance = balance;
	}

	void deposit(double amount){
		if(amount>0){
			balance+=amount;
			cout<<"\n Amount deposited successfully"<<endl;
		}
		else{
			cout<<"\n Invalid input.Amount cannot be negative. Please try again"<<endl;
		}
	}

	void withdraw(double amount){
		if(amount<0){
			cout<<"\n Invalid input.Amount cannot be negative. Please try again"<<endl;
		}
		else{
			if(amount<=balance){
				balance-=amount;
				cout<<"\n Amount withdraw successfully"<<endl;
			}
			else{
				cout<<"\n Insufficient balance."<<endl;
			}

		}
	}
	void displayAccountDetails(){
		cout<<"Account Number: "<<accountNumber<<endl;
		cout<<"Account Holder Name: "<<accountHolderName<<endl;
		cout<<"Balance: "<<balance<<endl;
	}
};

int main() {
	BankAccount b;
	int accountNumber;
	string accountHolderName;
	double balance;
	int amount;
	int choice;

	cout<<"Enter account number: ";
	cin>>accountNumber;
	cin.ignore();
	cout<<"Enter account holder name: ";
	getline(cin,accountHolderName);
	b.setBalance(0.0);
	b.setAccountNumber(accountNumber);
	b.setAccountHolderName(accountHolderName);

	while(choice!=4){
		cout<<"\n Menu \n";
		cout<<"1. Deposit money. \n";
		cout<<"2. Withdraw money. \n";
		cout<<"3. Display account details. \n";
		cout<<"4. Exit \n";
		cout<<"Enter your choice: ";
		cin>>choice;

		switch(choice){
		case(1):
				cout<<"\n Enter the amount: ";
				cin>>amount;
				b.deposit(amount);
				break;
		case(2):
				cout<<"\n Enter the amount: ";
				cin>>amount;
				b.withdraw(amount);
				break;
		case(3):
				b.displayAccountDetails();
				break;
		case(4):
				cout<<"Exiting...."<<endl;
				break;
		default:
			cout<<"Invalid choice. try again!.."<<endl;
		}
	}

	return 0;
}
