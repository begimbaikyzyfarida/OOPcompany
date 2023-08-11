public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tunuk", "Zhumabekova", "06.08.2007");
        Person person2 = new Person("Bilal", "Akylbekov", "23.12.2004");

        Group group1 = new Group("Group A", "19.10.2020","Tunuk","Aiak");
        Group group2 = new Group("Group B", "19.09.2003","Bilal","jhg");

        Group[] groupsArray = {group1,group2};
        company company = new company("Kyrgyz", "Kyrgyzstan", "19.09.2020", "Bilal Akylbekov",  groupsArray ,"Farida" );

        System.out.println("Company Information:");
        System.out.println(company);

        System.out.println("\nGroup 1 Information:");
        System.out.println(group1);
        System.out.println("\nGroup 2 Information:");
        System.out.println(group2);

        System.out.println("\nPerson 1 Information:");
        System.out.println(person1);
        System.out.println("\nPerson 2 Information:");
        System.out.println(person2);
    }
}
