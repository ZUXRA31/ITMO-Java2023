package Task9;
import java.util.*;

public class Main {

    public static List<String> noDuplicate(List<String> text){
        Set<String> changedText = new HashSet<>(text);
        return new ArrayList<>(changedText);
    }

    public static void fillArrays(List<Integer> list, List<Integer> linkedList){
        Random random = new Random();
        for(int i = 0; i <1000000;i++) {
            list.add(random.nextInt(9));
            linkedList.add(random.nextInt(9));
        }
    }

    public static void choiceList(List<Integer> list){
        Random random = new Random();
        for(int i = 0; i<100000; i++){
            list.get(random.nextInt(1000000));
        }
    }

    public static void pointsInfo(String name, Map<User, Integer> points){
        for (User user: points.keySet()) {
            if(user.getName().equals(name)) {
                System.out.println("У " + name + " " + points.get(user) + " очков");
                return;
            }
        }
        System.out.println("Такого пользователя нет");
    }

    public static void main(String[] args) {
        System.out.println("2 задание: ");
        Random random = new Random();
        List<String> collectionsWord = new ArrayList<>();
        collectionsWord.add("Да");
        collectionsWord.add("Ну");
        collectionsWord.add("Да");
        System.out.println(noDuplicate(collectionsWord));

        System.out.println("3 задание: ");
        List<Integer> list = new ArrayList<>();
        List<Integer> linked = new LinkedList<>();
        fillArrays(list,linked);
        long start = System.currentTimeMillis();
        choiceList(list);
        System.out.println("Время выборки ArrayList: " + (System.currentTimeMillis() - start) / 1000 + " с.");
        start = System.currentTimeMillis();
        choiceList(linked);
        System.out.println("Время выборки LinkedList: " + (System.currentTimeMillis() - start) / 1000 + " с.");
        // LinkedList медленнее, так как сложность выполнения get() == O(n)
        // Структура LinkedList состоит из двусвязного списка блоков, с ссылками на начало и конец, поэтому приходиться
        // проходить какое-то количество элементов до нужного
        System.out.println("4 задание: ");
        User user1 = new User("Влад");
        User user2 = new User("Юра");
        User user3 = new User("Александр");

        Map<User,Integer> points = new HashMap<>();
        points.put(user1, 100);
        points.put(user2, 20);
        points.put(user3, 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        pointsInfo(scanner.next(),points);
    }
}