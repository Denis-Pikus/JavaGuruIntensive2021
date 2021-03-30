package dpdev.romanCalculator.menu;

import dpdev.romanCalculator.service.Calculate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
    String expression = "";
    Logger log = LoggerFactory.getLogger(Menu.class);
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //private Scanner sc = new Scanner(System.in);

    public void run() throws IOException {
        while (true) {
            printHelp();
            String choice = reader.readLine();
            switch (choice) {
                case "0":
                    reader.close();
                    return;
                case "1":
                    log.info("Enter mathematics expression like \"3 + 5\" or \"II + IV\"");
                    expression = reader.readLine();
                    String s = Calculate.calculate(expression);
                    log.info("{} = {}", expression, s);
                    break;
            }
        }
    }

    private void printHelp() {
        System.out.println("1 - calculate expression");
        System.out.println("0 - exit");
    }
}
