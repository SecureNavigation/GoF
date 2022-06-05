package GoF.additional.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author UbiP Lab Laptop 02
 * @Date 2022/5/31 20:18
 * @Version 1.0
 */
public class CriteriaDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("A","Male","Single"));
        persons.add(new Person("B","Male","Married"));
        persons.add(new Person("C","FeMale","Married"));
        persons.add(new Person("D","FeMale","Single"));
        persons.add(new Person("E","Male","Single"));
        persons.add(new Person("F","Male","Single"));

        CriteriaMale male = new CriteriaMale();
        CriteriaFemale female = new CriteriaFemale();
        CriteriaSingle single = new CriteriaSingle();
        AndCriteria singleMale = new AndCriteria(single, male);
        OrCriteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("FeMales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("Single Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("Single or FeMales: ");
        printPersons(singleOrFemale.meetCriteria(persons));

    }

    /*
    Males:
Person: [ Name: A, Gender : Male, Marital Status : Single ]
Person: [ Name: B, Gender : Male, Marital Status : Married ]
Person: [ Name: E, Gender : Male, Marital Status : Single ]
Person: [ Name: F, Gender : Male, Marital Status : Single ]
FeMales:
Person: [ Name: C, Gender : FeMale, Marital Status : Married ]
Person: [ Name: D, Gender : FeMale, Marital Status : Single ]
Single Males:
Person: [ Name: A, Gender : Male, Marital Status : Single ]
Person: [ Name: E, Gender : Male, Marital Status : Single ]
Person: [ Name: F, Gender : Male, Marital Status : Single ]
Single or FeMales:
Person: [ Name: A, Gender : Male, Marital Status : Single ]
Person: [ Name: D, Gender : FeMale, Marital Status : Single ]
Person: [ Name: E, Gender : Male, Marital Status : Single ]
Person: [ Name: F, Gender : Male, Marital Status : Single ]
Person: [ Name: C, Gender : FeMale, Marital Status : Married ]
     */


    public static void printPersons(List<Person> persons){
        for (Person person:persons){
            System.out.println("Person: [ Name: "+person.getName() + ", Gender : "+person.getGender() +", Marital Status : "+person.getMaritalStatus()+" ]");
        }
    }
}
