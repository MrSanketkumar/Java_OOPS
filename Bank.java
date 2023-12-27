public class Bank {
    private String accName;
    private double bal;

    public Bank(String accName, double bal){
        this.accName =accName;
        this.bal=bal;
    }

    public void withdraw_amt(double amt){

        if (amt <= bal)
        {
            bal-=amt;
            System.out.println(amt +" is amount withdraw successfully and Balance is  :"+bal);
            
        } else {
            System.out.println("Some Error Occurs !!!!");
        }
        
    }
    public void credit_amt(double amt){

        if (amt >0 ) {
            bal=bal+amt;
            System.out.println(amt+" is Added Successfully Now Balance is "+bal);
        } else {
            System.out.println("Some error Occurs");
        }
        
    }

    public void display_info(){
        System.out.println("Account Holder Name is :"+accName +" U have : "+bal);

    }
    
    public static void main(String[] args) {
        Bank obj = new Bank("Sanket", 1000);
        obj.display_info();
        
        obj.credit_amt(200);
        obj.withdraw_amt(1000);
        obj.display_info();
    }

}
