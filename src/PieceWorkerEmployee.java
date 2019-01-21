/*Modify the payroll system of Figs. 10.4–10.9 to include an additional Employee subclass PieceWorker
that represents an employee whose pay is based on the number of pieces of merchandise produced. 
Class PieceWorker should contain private instance variables wage (to store the employee’s wage per piece) 
and pieces (to store the number of pieces produced). Provide a concrete implementation of method earnings in 
class PieceWorker that calculates the employee’s earnings by multiplying the number of pieces produced by the 
wage per piece. Create an array of Employee variables to store references to objects of each concrete class 
in the new Employee hierarchy. For each Employee, display its String representation and earnings.*/

public class PieceWorkerEmployee extends Employee
{

  private double wage;
  private int pieces;
  
  //constructor
  public PieceWorkerEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int pieces) {
    super(firstName, lastName, socialSecurityNumber);
    
    if (wage < 0.0)
      throw new IllegalArgumentException("Wage must be >= 0.0");
    
    this.setWage(wage);
    this.setPieces(pieces);
  }

  //getters
  public double getWage()
  {
    return wage;
  }
  
  public int getPieces()
  {
    return pieces;
  }
  
  //setters

  public void setWage(double wage)
  {
    if (wage < 0.0) // validate wage
      throw new IllegalArgumentException("Employee's wage must be >= 0.0");
      
    this.wage = wage;
  }
  
  
  public void setPieces(int pieces)
  {
    if (pieces < 0.0) // validate pieces
      throw new IllegalArgumentException("Pieces must be >= 0.0");
    
    this.pieces = pieces;
  }

  //calculate earnings of employee by multiplying the pieces by the wage; override abstract method earnings in Employee
  @Override 
  public double earnings()
  {
    return getWage() * getPieces();
  }
  
  //return String representation of PieceWorker object
  @Override
  public String toString()
  {
    return String.format("piece worker employee: %s%n%s: $%,.2f; %s: %d",
    super.toString(), "wage per piece", getWage(),
    "pieces", getPieces());
  }
  
}
