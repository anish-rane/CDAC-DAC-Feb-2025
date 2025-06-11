#include <iostream>
using namespace std;

class TollBooth{
private:
	int totalVehicles;
	double totalRevenue;

public:
	double getTotalRevenue() const {
		return totalRevenue;
	}

	void setTotalRevenue(double totalRevenue) {
		this->totalRevenue = totalRevenue;
	}

	int getTotalVehicles() const {
		return totalVehicles;
	}

	void setTotalVehicles(int totalVehicles) {
		this->totalVehicles = totalVehicles;
	}

	 TollBooth() {
		 totalVehicles = 0;
	     totalRevenue = 0.0;
	 }

	void reset(){
		totalVehicles=0;
		totalRevenue=0.0;
		cout<<"Data reset "<<endl;
	}

	void vehiclePayingToll(int vehicleType, double tollAmount){
		totalVehicles++;
		totalRevenue+=tollAmount;
		cout<<"Data recorded successfully. Total Revenue collected:"<<totalRevenue<<endl;
	}

};
int main() {
	TollBooth t;
	int totalVehicles;
	double totalRevenue;
	int choice;
	const double cartoll=2.0;
	const double trucktoll=5.0;
	const double bustoll=10.0;

	while(choice!=7){
		cout<< "\n !!! Menu !!! \n" << endl;
		cout<<"1. Add a standard car and collect toll \n";
		cout<<"2. Add a truck and collect toll \n";
		cout<<"3. Add a bus and collect toll \n";
		cout<<"4. Display total cars passed \n";
		cout<<"5. Display total revenue collected \n";
		cout<<"6. Reset booth statistics \n";
		cout<<"7. Exit \n";
		cout<<"Enter the choice: ";
		cin>>choice;

		switch(choice){
		case(1):
				t.vehiclePayingToll(1, cartoll);
				break;
		case(2):
				t.vehiclePayingToll(2, trucktoll);
				break;
		case(3):
				t.vehiclePayingToll(3, bustoll);
				break;
		case(4):
				cout<<"Total Vehicles passed: "<<t.getTotalVehicles()<<endl;
				break;
		case(5):
				cout<<"Total revenue collected: "<<t.getTotalRevenue()<<endl;
				break;
		case(6):
				t.reset();
				break;
		case(7):
				cout<<"\n Exiting...."<<endl;
				break;
		default:
			cout<<"\n Invalid choice. Try again!!!!"<<endl;
		}
	}
	return 0;
}
