import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lab10_680074 {

    record SalesOrder(String item, double price, int qty, String category) {
    }

    static List<SalesOrder> salesOrders = new ArrayList<>(List.of(
            new SalesOrder("Laptop Pro", 45000.0, 2, "Tech"),
            new SalesOrder("Mechanical Keyboard", 3500.0, 10, "Tech"),
            new SalesOrder("Wireless Mouse", 850.0, 25, "Tech"),
            new SalesOrder("Monitor 27 inch", 12000.0, 4, "Tech"),
            new SalesOrder("USB-C Hub", 1200.0, 15, "Tech"),
            new SalesOrder("Webcam 4K", 4500.0, 3, "Tech"),

            new SalesOrder("Leather Jacket", 5500.0, 2, "Cloth"),
            new SalesOrder("Cotton T-Shirt", 450.0, 50, "Cloth"),
            new SalesOrder("Denim Jeans", 1800.0, 15, "Cloth"),
            new SalesOrder("Wool Scarf", 800.0, 5, "Cloth"),
            new SalesOrder("Running Shoes", 3200.0, 8, "Cloth"),

            new SalesOrder("Organic Apple", 35.0, 120, "Fruit"),
            new SalesOrder("Golden Banana", 15.0, 200, "Fruit"),
            new SalesOrder("Imported Grapes", 150.0, 40, "Fruit"),
            new SalesOrder("Durian Monthong", 500.0, 10, "Fruit"),
            new SalesOrder("Sweet Mango", 60.0, 60, "Fruit"),

            new SalesOrder("Office Chair", 7500.0, 3, "Home"),
            new SalesOrder("Standing Desk", 15000.0, 2, "Home"),
            new SalesOrder("Table Lamp", 1200.0, 12, "Home"),
            new SalesOrder("Air Purifier", 9800.0, 5, "Home")));

    record WeatherLog(String city, double temp, double humidity, String date) {
    }

    static List<WeatherLog> weatherLogs = new ArrayList<>(List.of(
            new WeatherLog("Bangkok", 32.5, 88.0, "2024-03-01"),
            new WeatherLog("Bangkok", 35.2, 82.0, "2024-03-02"),
            new WeatherLog("Bangkok", 34.0, 85.0, "2024-03-03"),
            new WeatherLog("Bangkok", 31.8, 92.0, "2024-03-04"),

            new WeatherLog("Tokyo", 8.5, 45.0, "2024-03-01"),
            new WeatherLog("Tokyo", 10.2, 40.0, "2024-03-02"),
            new WeatherLog("Tokyo", 12.0, 38.0, "2024-03-03"),
            new WeatherLog("Tokyo", 5.5, 50.0, "2024-03-04"),

            new WeatherLog("London", 12.0, 90.0, "2024-03-01"),
            new WeatherLog("London", 11.5, 85.0, "2024-03-02"),
            new WeatherLog("London", 9.0, 95.0, "2024-03-03"),
            new WeatherLog("London", 14.2, 80.0, "2024-03-04"),

            new WeatherLog("Moscow", -12.5, 30.0, "2024-03-01"),
            new WeatherLog("Moscow", -15.0, 25.0, "2024-03-02"),
            new WeatherLog("Moscow", -10.2, 35.0, "2024-03-03"),
            new WeatherLog("Moscow", -5.0, 40.0, "2024-03-04"),

            new WeatherLog("Dubai", 42.0, 15.0, "2024-03-01"),
            new WeatherLog("Dubai", 45.5, 12.0, "2024-03-02"),
            new WeatherLog("Dubai", 43.8, 18.0, "2024-03-03"),
            new WeatherLog("Dubai", 40.0, 20.0, "2024-03-04")

    ));

    public static void main(String[] args) {
        //q1();
        //q2();
        //q3();
        //q4();
        //q5();
        //q6();
        //q7();
        //q8();
        //q9();
        //q10();
        //q11();
        //q12();
        //q13();
        //q14();
        //q15();
        //q16();
        //q17();
        //q18();
        //q19();
        q20();
    }

    static void q1() {
        //List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> input = new ArrayList<>(Arrays.asList(0, 1, 5, 7, 8, 10, 20));
        input.stream()
            .filter(n -> n % 2 == 0)  
            .forEach(n -> System.out.print(n + " ")); 
    }

    static void q2() {
        //String input = "Java Stream API is very powerful";
        String input = "This lab is too difficult. Please help me.";
        Arrays.stream(input.split("\\W+"))
            .filter(word -> word.length() > 5)
            .forEach(word -> System.out.print(word + " "));
    }

    static void q3() {
        List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark", "Bob"));
        String result = 
            input.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)))
                .entrySet()
                .stream()
                .map(name -> name.getKey() + " : " + name.getValue())
                .collect(Collectors.joining(" , "));

                System.out.println(result);
    }

    static void q4() {
        List<String> input = new ArrayList<>(
                Arrays.asList("Apple", "Banana", "Orange", "Jeff", "Bill", "Mark", "Bob"));
        //int a = 3;
        //int b = 2;

        int a = 1;
        int b = 4;
        String result = 
            input.stream()
                .skip(a)
                .limit(b)
                .collect(Collectors.joining(" "));

                System.out.println(result);

    }

    static void q5() {
        // List<String> input = new ArrayList<>(List.of("Apple", "Orange",
        // "Apple","Banana", "Orange"));

        List<String> input = new ArrayList<>(
                List.of("Milk", "Orange", "Apple", "Banana", "Orange", "Water", "Coke", "Apple",
                        "Milk"));
        input.stream()
             .distinct()
             .sorted()
             .forEach(item -> System.out.print(item + " "));
    }

    static void q6() {
        // List<String> เช่น [Jeff, Bill, Mark]
        List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark"));
        String result = input.stream()
            .collect(Collectors.joining(" , "));
            System.out.print(result);
    }   

    static void q7() {

        // List<String> input = new ArrayList<>(Arrays.asList("Jeff", "Bill", "Mark"));
        List<String> input = new ArrayList<>(Arrays.asList("Java", "Stream", "API"));
        input.stream()
             .map(String::length)
             .forEach(i -> System.out.print(i + " "));
    }

    static void q8() {
        List<List<Integer>> input = new ArrayList<>(List.of(
                List.of(1, 2),
                List.of(2, 3),
                List.of(4, 5)));
        System.out.println(
            input.stream()
            .flatMap(List :: stream)
            .distinct()
            .toList()
        );
    }

    static void q9() {
        List<Double> input = new ArrayList<>(Arrays.asList(1.5, 2.5, 5.0));
        System.out.println(
            input.stream()
            .mapToDouble(Double :: doubleValue)
            .average()
            .orElse(0.0)
        );
    }

    static void q10() {
        //String input = "abcd";
        String input = "aawerxvxcfgasdlfxnsrpwemsvk";
        char result = (char) Math.round(input.chars().average().orElse(0.0));
        System.out.print(result);
    }

    static void q11() {
        salesOrders.stream()
            .collect(Collectors.groupingBy(SalesOrder :: category, Collectors.summingDouble(s -> s.price() * s.qty())))
            .forEach((category, total) -> System.out.println(category + " : " + total));
    }

    static void q12() {
        salesOrders.stream()
            .sorted((o1,o2) -> Double.compare(o2.price() * o2.qty(), o1.price() * o1.qty()))
            .limit(3)
            .forEach(order -> System.out.println(order.item() + " : " + order.price() * order.qty()));
    }

    static void q13() {
        salesOrders.forEach(product -> System.out.println(product.item() + " : " + product.price() * 0.85));
    }

    static void q14() {
        Map<String, Double> input = new HashMap<>();
        input.put("Home", 0.15);
        input.put("Tech", 0.20);
        input.put("Cloth", 0.10);
        input.put("Fruit", 0.05);

        salesOrders.forEach(product -> System.out.println(product.item() + " : " + product.price() * (1 - input.get(product.category()))));
    }

    static void q15() {
        DoubleSummaryStatistics stats = salesOrders.stream()
            .mapToDouble(o -> o.price() * o.qty())
            .summaryStatistics();
            System.out.printf("Min: %.2f Max: %.2f Average: %.2f Sum: %.2f",
                                stats.getMin(), 
                                stats.getMax(), 
                                stats.getAverage(), 
                                stats.getSum());
    }

    static void q16() {
        System.out.println(
            weatherLogs.stream()
                .mapToDouble(WeatherLog :: temp)
                .average()
                .orElse(0.0)
        );
    }

    static void q17() {
            weatherLogs.stream()
            .collect(Collectors.groupingBy(WeatherLog :: city, Collectors.averagingDouble(WeatherLog :: temp)))
            .forEach((key,value) -> System.out.println(key + " : " + value));
    }

    static void q18() {
        weatherLogs.stream()
            .collect(Collectors.groupingBy(WeatherLog :: city, Collectors.summarizingDouble(WeatherLog :: temp)))
            .forEach((key,value) -> System.out.printf("%s: %.2f %.2f %.2f\n", key, value.getMax(), value.getMin(), value.getMax() - value.getMin()));
    }

    static void q19() {
        weatherLogs.stream()
            .map(log -> {
            String status = log.temp() > 30 ? "Hot" : (log.temp() < 12 ? "Cold" : "Normal");
            return "Date: " + log.date() + " | City: " + log.city() + " | Status: " + status;
        })
            .forEach(System.out::println);
    }

    static void q20() {
        weatherLogs.stream()
            .collect(Collectors.groupingBy(WeatherLog :: city, Collectors.filtering(log -> log.humidity() > 60, Collectors.counting())))
            .forEach((city,cout) -> System.out.println(city + " : " + cout));
    }

}