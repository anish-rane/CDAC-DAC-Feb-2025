namespace Assignment2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee o1 = new Employee();
            Employee o2 = new Employee();
            Employee o3 = new Employee();
            Console.WriteLine(o1.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o3.EmpNo);

            Console.WriteLine(o3.EmpNo);
            Console.WriteLine(o2.EmpNo);
            Console.WriteLine(o1.EmpNo);

            Employee o4 = new Employee("Amol", 123465, 10);
            Employee o5 = new Employee("Amol", 123465);
            Employee o6 = new Employee("Amol");
            Employee o7 = new Employee();
            Employee o8 = new Employee("123",1,-100);

            Console.WriteLine($"Net Salary of {o4.Name} is {o4.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o5.Name} is {o5.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o6.Name} is {o6.GetNetSalary()}");
            Console.WriteLine($"Net Salary of {o7.Name} is {o7.GetNetSalary()}");
        }

    }
    class Employee
    {
        string name;
        int empno;
        decimal basic;
        short deptNo;
        static int setemp = 1;

        public string Name { 
            get { return name; } 
            
            set {
                if (!string.IsNullOrEmpty(value))
                {
                    name = value;
                }
                else {
                    Console.WriteLine("Invalid input!!!!");
                }
            }        
        }
        public int EmpNo { get { return empno; } private set { empno = value; } }
        public decimal Basic { 
            get { return basic; } 
            set {
                if (value >= 100 && value <= 10000000)
                {
                    basic = value;
                }
                else {
                    Console.WriteLine("Invalid input!!!! base should be in range of 100-10000000");
                }
            } 
        }
        public short DeptNo
        {
            get { return deptNo; }
            set {
                if (value > 0)
                {
                    deptNo = value;
                }
                else {
                    Console.WriteLine("Invalide input!!!! deptNo cannot be negative");
                }
            }
        }
        public Employee(string Name = "Default", decimal Basic = 10000, short DeptNo = 1)
        {
            this.EmpNo = setemp++; 
            this.Name = Name;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }
        public decimal GetNetSalary() {
            decimal decrement = Basic * 0.2M;
            return Basic - decrement;
        }

    }

}
