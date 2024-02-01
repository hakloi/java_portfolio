
// 1) Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя
// StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: String str = 
//"{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
// Результат "select * from students where “name” = “Ivanov” and “country”=”Russia” …

public class App {
    public static void main(String[] args) throws Exception {
        // clean console
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // code begins
        String str1 = "{'name':'Ivanov', 'country':'Russia', 'city':'Moscow', 'age':'null'}";
        StringBuilder builder = new StringBuilder("select * from students where ");
        String str = changeBracket(str1);

        builder.append(str.substring(1, 7) + " = "
                        + str.substring(8, 16) + " and "
                        + str.substring(18, 27) + " = "
                        + str.substring(28, 36) + " and "
                        + str.substring(38, 44) + " = "
                        + str.substring(45, 53));

        // String res = builder.toString();
        System.out.print(builder);
    }

    public static String changeBracket(String str) {
        return str.replaceAll("'", "\"");
    }

}
