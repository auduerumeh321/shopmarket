package za.co.shoprite.person;

import za.co.shoprite.people.Customer;

import za.co.shoprite.transaction.Payment;

import java.util.Scanner;

abstract class Person{
private String name;
private int age;
private String dateOfBirth;

private Scanner scan;

public void setName(String name){
this .name=name;

}

public String getName(){

return name;
}

public void setAge(int age){
this .age=age;
}
public int getAge(){
return age;
}   



public void setDatebirth(String dateOfBirth);
this.dateofbirth=dateOfbirth;
}
public String setDateOfbirth();
return dateofBith;
}

abstract double  displayCash();

public double displayCash(){

}


}
 
