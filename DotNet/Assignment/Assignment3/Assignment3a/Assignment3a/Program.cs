using System.Diagnostics.CodeAnalysis;

namespace Assignment3a
{
    internal class Program
    {
        static void Main(string[] args)
        {
            CEO ceo = new CEO("Amol",1,2000);
            Console.WriteLine($"CEO salary: {ceo.CalNetSalary()}");
            Manager m = new Manager("Ankur", 2, "HR", 20000);
            Console.WriteLine($"Manager salary: {m.CalNetSalary()}");
            GenralManager g = new GenralManager("Anirudh",2,"Sales",10000);
            Console.WriteLine($"Genral Manager salary: {g.CalNetSalary()}");
        }
    }
    interface IDbFunctions {
        void Insert();
        void Update();
        void Delete();
    }
    abstract class Employee: IDbFunctions {
        public string? name;
        static int empNo=1;
        short deptNo;
        public decimal basic;
        public string? Name { 
            get { return name; } 
            set {
                if (value != "")
                {
                    name = value;
                }
                else {
                    throw new ArgumentException("Invalid Input!!!");
                }      
            }
        }
        public int Empno { 
            get { return empNo; }
            set {
                if (value > 0)
                {
                    empNo = value;
                }
                else {
                    Console.WriteLine("Something went wrong");
                }
            }
        }
        public short DeptNo { 
            get { return deptNo; }
            set {
                if (value > 0) {
                    deptNo = value;
                }
                else {
                    throw new ArgumentException("Invalid Input!!! DeptNo cannot be negative");
                }
            }
        }
        public abstract decimal Basic { get; set; }
        public abstract decimal CalNetSalary();

        public virtual void Insert() {
            Console.WriteLine("Empolyee inserted");
        }
        public virtual void Update()
        {
            Console.WriteLine("Empolyee Updated");
        }
        public virtual void Delete()
        {
            Console.WriteLine("Empolyee Delete");
        }

        public Employee(string name, short deptNo) {
            Empno = empNo++;
            Name= name;
            DeptNo= deptNo;

        }

    }
    class Manager : Employee
    {
        private new  decimal basic;
        string? designation;
        public string? Designation
        {
            get { return designation; }
            set {
                if (value != "")
                {
                    designation = value;
                }
                else {
                    throw new ArgumentNullException("Invalid ");
                }
            }
        }
        public override decimal Basic { get { return basic; }
            set {
                if (value < 1000000 && value > 100)
                {
                    basic = value;
                }
                else {
                    Console.WriteLine("Invalid Input!!!!");
                }
            } 
        }
        public Manager(string name,short deptNo,string designation,decimal basic ):base(name,deptNo) { 
            Designation = designation;
            Basic = basic;
        }

        public override decimal CalNetSalary()
        {
            return Basic + 5000;
        }
    }
    class GenralManager : Manager {
        string? perks;

        public GenralManager(string name, short deptNo, string designation, decimal basic) : base(name, deptNo, designation, basic)
        {
            Perks = perks;
        }

        public string? Perks
        {
            get; set;
        }
    }
    class CEO : Employee {

        public override decimal Basic
        {   
            get { return base.basic; }
            set {
                if (value > 100 && value < 1000000) {
                    basic = value;
                }
                else {
                    throw new NotImplementedException();
                }
            }
            
        }
        public override decimal CalNetSalary()
        {

            return Basic + 1000;
        }
        public CEO(string name,short deptNo,decimal basic):base(name,deptNo) {
            Basic=basic;

        }
        public override void Insert()
        {
            Console.WriteLine("CEO inserted");
        }
        public override void Update()
        {
            Console.WriteLine("CEO Updated");
        }
        public override void Delete()
        {
            Console.WriteLine("CEO Delete");
        }
    }
}
