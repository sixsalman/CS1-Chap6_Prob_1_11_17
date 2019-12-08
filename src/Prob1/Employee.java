package Prob1;

/**
 *  Author: Salman
 *
 *  This class serves as a blueprint for the container that hold information of each employee
 */
public class Employee {

    private String name; //employee's title
    private int idNumber; //employee's idNumber
    private String department; //employee's department
    private String position; //employee's position

    /**
     * This constructor gets and assigns assigns values to all its fields
     * @param name gets name of an employee
     * @param idNumber gets idNumber of an employee
     * @param department gets department of an employee
     * @param position gets position of an employee
     */
    public Employee (String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    /**
     * This constructor gets and assigns assigns values name and idNumber fields and assigns a blank String to others
     * @param name gets name of an employee
     * @param idNumber gets idNumber of an employee
     */
    public Employee (String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    /**
     * This no-arg constructor assigns blank values ("") to String fields and 0 to idNumber
     */
    public Employee (){
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    /**
     * Sets name
     * @param name gets name of an employee
     */
    public void setName (String name){
        this.name = name;
    }

    /**
     * Sets idNumber
     * @param idNumber gets idNumber of an employee
     */
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }

    /**
     * Sets department
     * @param department gets department of an employee
     */
    public void setDepartment (String department){
        this.department = department;
    }

    /**
     * Sets position
     * @param position gets position of an employee
     */
    public void setPosition (String position){
        this.position = position;
    }

    /**
     * Gets name
     * @return name of an employee
     */
    public String getName (){
        return name;
    }

    /**
     * Gets idNumber
     * @return idNumber of an employee
     */
    public int getIdNumber(){
        return idNumber;
    }

    /**
     * Gets department
     * @return department of an employee
     */
    public String getDepartment (){
        return department;
    }

    /**
     * Gets position
     * @return position of an employee
     */
    public String getPosition (){
        return position;
    }

    /**
     * Gives user all of an employee's information in a formatted manner
     * @return an employee's information in String format
     */
    public String toString() {
        return String.format("%-20s %-20d %-20s %-20s",name, idNumber, department, position);
    }

}
