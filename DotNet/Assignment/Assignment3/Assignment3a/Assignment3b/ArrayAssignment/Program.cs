namespace ArrayAssignment
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter number of batches: ");
            int batches = int.Parse(Console.ReadLine());

            int[][] marks = new int[batches][];

            for (int i = 0; i < batches; i++)
            {
                Console.Write($"Enter number of students in batch {i + 1}: ");
                int students = int.Parse(Console.ReadLine());

                marks[i] = new int[students];

                Console.WriteLine($"Enter marks for batch {i + 1}:");
                for (int j = 0; j < students; j++)
                {
                    Console.Write($"  Student {j + 1}: ");
                    marks[i][j] = int.Parse(Console.ReadLine());
                }
            }

            // Display the marks
            Console.WriteLine("\nDisplaying all marks:");
            for (int i = 0; i < marks.Length; i++)
            {
                Console.Write($"Batch {i + 1}: ");
                for (int j = 0; j < marks[i].Length; j++)
                {
                    Console.Write(marks[i][j] + " ");
                }
                Console.WriteLine();
            }
        }

    }

}
