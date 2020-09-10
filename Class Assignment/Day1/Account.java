package day1;

public class Account {
    String aname;
    String ano;
    String bname;
    public Account(String aname,String ano,String bname)
    {
        this.aname=aname;
        this.ano=ano;
        this.bname=bname;
    }
    public void display()
    {
        System.out.println("Account Name:"+this.aname);
        System.out.println("Account Number:"+this.ano);
        System.out.println("Bank Name:"+this.bname);
        
    }
}
