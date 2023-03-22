package Task3;

/*
●	поля: количество этажей, год постройки, наименование;
●	метод для установки всех значений;
●	метод для вывода всех значений;
●	метод, возвращающий количество лет с момента постройки.

 */
public class House {
    private int countFloor;
    private int yearOfBuild;
    private String name;

    public void set(int countFloor, int yearOfBuild, String name) {
        this.countFloor = countFloor;
        this.yearOfBuild = yearOfBuild;
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Количество этажей: " + countFloor + ";\nГод постройки: " + yearOfBuild + ";\nНаименование: " + name);
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }
}


class JavaProgram3 {
    public static void main(String[] args) {
        House house = new House();
        House house1 = new House();
        house.set(5, 1999, "Здание");
        house.set(8, 2015, "Лахта");
        house.showInfo();
        house1.showInfo();
    }
}