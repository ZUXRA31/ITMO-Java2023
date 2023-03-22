package Task6.Task1_2;

public class Client extends Human implements Information {
    private String bankName;
    public Client(String name, String lastname, String bankName){
        super(name,lastname);
        this.bankName = bankName;
    }
    @Override
    public void showInfo(){
        System.out.println("Имя клиента: " + getName() + "\n Фамилия клиента: " + getLastname() + "\nНазвание банка: " + bankName );
    }
}
