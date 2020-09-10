package day1;
public class CurrentAccount extends Account{
    String tinno;
    public CurrentAccount(String aname,String ano,String bname,String tinno)
    {
       super(aname,ano,bname);
        this.tinno=tinno; 
    }
    public void display()
    {
        super.display();
        System.out.println("TIN Number:"+this.tinno);
    }
}
