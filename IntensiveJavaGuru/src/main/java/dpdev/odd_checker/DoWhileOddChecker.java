package dpdev.odd_checker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoWhileOddChecker {
    private int border;
    private Logger log = LoggerFactory.getLogger(ForOddChecker.class);

    public void doWhileOddChecker(int border){
        int i = 0;
        do {
            if (i % 2 != 0) {
                log.info("{}", i);
            }
            i++;
        }
        while (i < 50);
    }
}
