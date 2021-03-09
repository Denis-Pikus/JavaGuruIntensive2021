package dpdev.odd_checker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhileOddChecker {
    private int border;
    private Logger log = LoggerFactory.getLogger(ForOddChecker.class);

    public void whileOddChecker(int border){
        int i = 0;
        while (i < 50) {
            if (i % 2 != 0) {
                log.info("{}", i);
            }
            i++;
        }
    }
}
