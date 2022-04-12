public class constructors {
     public static void main(String [] args){
        person person1 = new person("Earl","Francis", "IT");

        System.out.println("My Name is" + person1.fname + person1.lname + "and my job is" + person1.job);

        person person2 = new person("Jungie", "Gerez", "Programer");
        System.out.println("My Name is" + person2.fname + person2.lname + "and my job is" + person2.job);
        
    }
}