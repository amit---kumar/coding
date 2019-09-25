package com.amit.skill.interview2.designpattern.Prototype;

/**
 * Created by amitkumar on 28/5/18.
 */

/**
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and
 * you have a similar object already existing. So this pattern provides a mechanism to copy the original object to a new
 * object and then modify it according to our needs. This pattern uses java cloning to copy the object.

 Prototype design pattern mandates that the Object which you are copying should provide the copying feature.
 It should not be done by any other class. However whether to use shallow or deep copy of the Object properties depends
 on the requirements and it’s a design decision
 * **/
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list){
        this.empList=list;
    }
    public void loadData(){
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }

}