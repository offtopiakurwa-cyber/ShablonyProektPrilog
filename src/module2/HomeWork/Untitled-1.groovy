//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа DRY:
//1 задание
enum Log {
    ERROR, WARNING, INFO
}

class Logger {

    public void log(Log level, String message) {
        System.out.println(level + ": " + message);
    }
}

//2 задание
class AppCnfg {
    public static final String CONNECTION_STRING =
            "Server=myServer;Database=myDb;User Id=myUser;Password=myPass;";
}

class DatabaseService {

    public void connect() {
        String connectionString = AppCnfg.CONNECTION_STRING;
        // Логика подключения к БД
    }
}


class LoggingService {

    public void log(String message) {
        String connectionString = AppCnfg.CONNECTION_STRING;
        // Логика записи лога в БД
    }
}

//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа KISS:
//3 задание
public void processNumbers(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        return;
    }

    for (int number : numbers) {
        if (number > 0) {
            System.out.println(number);
        }
    }
}

//4 задание
public void printPositiveNumbers(int[] numbers) {
    for (int number : numbers) {
        if (number > 0) {
            System.out.println(number);
        }
    }
}

//5задание
public int divide(int a, int b) {
    if (b == 0) {
        return 0;
    }

    return a / b;
}

//Произведите корректную (правильную) по вашему мнению реализацию с применением принципа YAGNI:
//6 задане
public class User {
    private String name;
    private String email;
    private String adr; //adres

    public User(String name, String email, String adr) {
        this.name = name;
        this.email = email;
        this.adr = adr;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getadr() {
        return adr;
    }
}


//7задание
class FileReader {

    public String readFile(String filePath) {
        //логика чтения файла
        return "file content";
    }
}

enum ReportType {
    PDF, EXCEL, HTML //8аздание
}

class ReportGenerator {

    public void generateReport(ReportType type) {
        // Генерация отчета в нужном формате
    }
}