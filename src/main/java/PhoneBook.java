import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private final Map<String, String> phoneToName = new HashMap<>();
    private final Map<String, String> nameToPhone = new HashMap<>();

    public int add(String name, String number) {
        if (nameToPhone.containsKey(name)) {
            return nameToPhone.size(); // не добавляем дубликаты
        }
        nameToPhone.put(name, number);
        phoneToName.put(number, name);
        return nameToPhone.size();
    }
}
