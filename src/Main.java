import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Country country1 = new Country("Kyrgyzstan", "Sadyr Japarov", 7000000);
        Country country2 = new Country("America", "John Bayden", 331000000);
        Country country3 = new Country("France", "Emmanyuel Makron", 65000000);
        Country[] countrys = {country1, country2, country3};
        for (Country c : countrys) {
            System.out.println("Respublicasy: "+c.getName()+"\n"+
                               "Presidenti: "+c.getPresident()+"\n"+
                               "Kalky: "+c.getPopulation()+"\n");
        }

        City city1 = new City("New York", "Budget",6000000);
        City city2 = new City("Tashkent", "Kok Kyshlokta", 450000);
        City city3 = new City("Bishkek", "Vostok 5te", 25000);
        City[] citys = {city1, city2, city3};
        for (City s: citys) {
            System.out.println("Jashagan shaary: "+s.getName()+"\n"+
                               "Jashagan rayonu: "+s.getLife()+"\n"+
                               "Kalky: "+s.getPopulation()+"\n");
        }

        Address address1 = new Address("Sverdlovskiy","Mendeleeva 101a", "Bishkek");
        Address address2 = new Address("Gaz", "Shanhay", "Batken");
        Address address3 = new Address("Buzhum", "Yntymak", "Batken");
        Address[] addresses = {address1, address2, address3};
        for (Address a:addresses) {
            System.out.println("Rayonu: "+a.getName()+"\n"+
                               "Kochosu: "+a.getStreet()+"\n"+
                               "Shaary: "+a.getCity()+"\n");
        }

        Person person1 = new Person("Dilmurat", "Achylbek uulu", "Zemleustroitel");
        Person person2 = new Person("Muhriddin", "Erzhigitov", "Sportsmen");
        Person person3 = new Person("Ruslan", "Manasbek uulu", "Programmer");
        Person[] persons = {person1, person2, person3};
        for (Person p: persons) {
            System.out.println("Aty: "+p.getFirstName()+"\n"+
                               "Familyasy: "+p.getLastName()+"\n"+
                               "Professiasy: "+p.getProfessional()+"\n");
        }






















        // TODO 3 burchtuktun ayanty:
/*       Ttriangle ttriangle = new Ttriangle(5,10);
        System.out.println("Уч бурчтуктун квадраты: " + ttriangle.kvadraty());*/

     //TODO tapshyrma studentter:
/*     Student student1 = new Student("Матмуса",LocalDate.of(2001, 10,12),"Kyrgyz",99670756 );
     Student student2 = new Student("Абдымомун",LocalDate.of(2005, 07, 15),"Kyrgyz",07074535 );
     Student student3 = new Student("Aдилет",LocalDate.of(2001, 01, 03),"Kyrgyz",050544545 );
     Student student4 = new Student("Эржигит",LocalDate.of(2004, 02, 17),"Kyrgyz",0552134566 );
     Student student5 = new Student("Kaныкей",LocalDate.of(2006, 11, 22),"Kyrgyz",022363666 );

     Student[] students = {student1,student2,student3,student4,student5};
        for (Student a:students) {
            System.out.println("Менин атым "+a.getName()+ "\n"+
                               "Туулган жылым: "+a.getDateOfBrith()+ "\n"+
                               "Улутум: "+a.getNationality()+ "\n"+
                               "номерим: "+a.getPhoneNumber()+ "\n");
        }*/

        //TODO telefon name:
//        Phone phone = new Phone(256,3200);
//        phone.setBrand("Redmi");
//        phone.setVersion("11T max");
//        phone.setScreen(16);

 //       System.out.println("My phone memory: "+phone.getMemory()+ "\n"+
 //                          "Akchasy: "+phone.getPrice()+ "\n"+
 //                          "Brendi: "+phone.getBrand()+ "\n"+
 //                          "Versiasy: "+phone.getVersion()+ "\n"+
 //                          "Ekrany: "+phone.getScreen());

/*        Phone phone1 = new Phone(122,4500);
        Phone phone2 = new Phone(232, 5000);
        Phone phone3 = new Phone(244, 80000);
        Phone phone4 = new Phone(111, 27000);


        Personn personn1 = new Personn("Бек",21,"Сушист",70000,phone);
        Personn personn2 = new Personn("Maрат",20,"Грузчик",65000,phone1);
        Personn personn3 = new Personn("Жоха",24,"Повар",75000,phone2);
        Personn personn4 = new Personn("Мыктыбек",20,"Стройка",55000,phone3);
        Personn personn5 = new Personn("Айбек",20,"Яндекс такси",45000,phone4);

        Personn [] persons = {personn1, personn2, personn3, personn4, personn5};
        for (Personn a: persons) {
            System.out.println("Менин атым: " + a.getName() + "\n" +
                    "жашым: " + a.getAge() + "\n" +
                    "жумушум: " + a.getWork() + "\n" +
                    "айлыгым: " + a.getSalary() + "\n" +
                    "телефонум: " + a.getPhone() + "\n");

            
        }if(phone.getPrice() > phone.getPrice()){
                System.out.println("opopopo"+phone.getPrice());
]
        }*/

    }
}