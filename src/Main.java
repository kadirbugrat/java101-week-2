public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("John Doe", "12345", "Physics");
        Teacher teacher2 = new Teacher("Jane Smith", "67890", "Chemistry");
        Teacher teacher3 = new Teacher("Michael Johnson", "54321", "Math");

        course physics = new course("Physics", "PHY101", "PHY", 0.20);
        physics.addTeacher(teacher1);

        course chemistry = new course("Chemistry", "CHE101", "CHE", 0.30);
        chemistry.addTeacher(teacher2);

        course math = new course("Math", "MAT101", "MAT", 0.15);
        math.addTeacher(teacher3);

        student student1 = new student("Ali", 123, physics, chemistry, math);
        student1.addBulkExamNote(0, 0, 0);
        student1.addOralNotes(80, 80, 80);
        student1.calcAvarage();
        student1.printNote();
        student1.isPass();

        student student2 = new student("Veli", 456, physics, chemistry, math);
        student2.addBulkExamNote(50, 50, 50);
        student2.addOralNotes(100, 100, 100);
        student2.calcAvarage();
        student2.printNote();
        student2.isPass();
    }
}