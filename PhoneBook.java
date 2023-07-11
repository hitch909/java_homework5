import java.util.*;

public class PhoneBook {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, List<String>> data = new HashMap<>();
        HashMap<String, List<String>> dataNext = new HashMap<>();

        while (true) {
            System.out.println("введите: 1 - добавление абонента,  2 - вывод данных.");
            int action = scan.nextInt();
            if (action == 1) {
                dataNext.putAll(enterData(data));
            }
            if (action == 2) {
                for (Map.Entry entry : dataNext.entrySet()) {
                    System.out.println(entry);
                }
                scan.close();
                break;
            }
        }
    }

    public static HashMap<String, List<String>> enterData(HashMap<String, List<String>> data) {
        System.out.print("введите фамилию абонента:   ");
        String surname = scan.next();
        System.out.print("введите номер абонента:   ");
        String phoneNumber = scan.next();
        List<String> number = new ArrayList<>();

        number.add(phoneNumber);
        data.put(surname, number);

        return data;
    }
}
