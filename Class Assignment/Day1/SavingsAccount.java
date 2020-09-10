package day1;
public class SavingsAccount extends Account{
    String oname;
     public SavingsAccount(String aname,String ano,String bname,String oname)
    {
       super(aname,ano,bname);
        this.oname=oname; 
    }
    public void display()
    {
        super.display();
        System.out.println("Organisation Name:"+this.oname);
    }
}
