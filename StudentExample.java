public class StudentExample
{
public static void main(String[]args)
{
Student[] students=new Student[3];
Student s=new Student();
s.id=10;
s.name="Archana";
s.marks=85;
students[0]=s;
Student s1=new Student();
s1.id=15;
s1.name="Akhila";
s1.marks=95;
students[1]=s1;
Student s2=new Student();
s2.id=18;
s2.name="Rama";
s2.marks=75;
students[2]=s2;
for(int i=0;i<students.length;i++)
{
Student 1=students[i;
System.out.println(1.id+""+1.name);
}
for(Student 1:students)
{
System.out.println(1.id+""+1.name);
}
}
}