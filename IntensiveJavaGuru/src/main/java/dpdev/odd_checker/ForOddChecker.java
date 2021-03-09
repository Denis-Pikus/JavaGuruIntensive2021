package dpdev.odd_checker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForOddChecker {
    private int border;
    private Logger log = LoggerFactory.getLogger(ForOddChecker.class);

    public void forOddChecker(int border){
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                log.info("{}", i);
            }
        }
    }
}
