package Task6.Task1_2;

public class BankWorker extends Human implements Information{
    private String bankName;
    public BankWorker(String name, String lastname, String bankName){
        super(name,lastname);
        this.bankName = bankName;
    }
    @Override
    public void showInfo(){
        System.out.println("Имя работника: " + getName() + "\n Фамилия работника: " + getLastname() + "\nНазвание банка: " + bankName );
    }
}
