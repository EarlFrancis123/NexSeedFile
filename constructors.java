public class constructors {
     public static void main(String [] args){

        person person1 = new person("Earl","Francis", "IT");
        System.out.println("My Name is" + person1.fname + person1.lname + "and my job is" + person1.job);

        person person3 = new person("Jungie", "Gerez", "Programer");
        System.out.println("My Name is" + person3.fname + person3.lname + "and my job is" + person3.job);
        person2 Person2 = new person2("","", "");
        Person2.setFname("John");

        System.out.println(Person2.getFname());
        
    }
}