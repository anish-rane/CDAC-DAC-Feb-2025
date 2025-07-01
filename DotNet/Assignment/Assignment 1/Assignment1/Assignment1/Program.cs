namespace Assignment1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();

            Console.WriteLine($"Net Salary of {o1.Name}: {o1.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o2.Name}: {o2.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o3.Name}: {o3.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o4.Name}: {o4.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o5.Name}: {o5.GetNetSalary()}");
        }
    }
    public class Employee {
        private string name;
        private int empNo;
        private decimal basic;
        private short deptNo;


        public string Name
        {
            set { name = value; }
            get {return name;}
        }
        public int EmpNo { 
            set {
                if (value > 0) { empNo = value; }
            }
            get { return empNo;}
        }
        public decimal Basic
        {
            set
            {
                if (value > 0 && value <=2500000) {
                basic = value;
                }
            }
            get { return basic; }
        }
        public short DeptNo {
            set
            {
                if (value > 0) { 
                deptNo = value;
                } 
            }
            get { return deptNo;}
        }
        public Employee() { }

        public Employee(int EmpNo)
        {
            this.Name = Name;
        }
        public Employee(int EmpNo, string Name)
        {
            this.Name = Name;
            this.EmpNo = EmpNo;
        }
        public Employee(int EmpNo, string Name, decimal Basic)
        {
            this.Name = Name;
            this.EmpNo = EmpNo;
            this.Basic = Basic;
        }
        public Employee(int EmpNo, string Name,decimal Basic,short DeptNo) {
            this.Name = Name;
            this.EmpNo = EmpNo;
            this.Basic = Basic;
            this.DeptNo = DeptNo; 
        }
        public decimal GetNetSalary()
        {
            decimal deductions = Basic * 0.2M;
            return Basic - deductions;
        }

    }
}
