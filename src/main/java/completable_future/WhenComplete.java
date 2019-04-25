package completable_future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class WhenComplete {

    private Logger logger = LogManager.getLogger(WhenComplete.class);

    void testThird(){

        List<String> list = Arrays.asList("A","B","C","D");
        list.stream().map(s-> CompletableFuture.supplyAsync(() -> "Processing : " + s ))
                .map(f->f.whenComplete((result,error) -> logger.info(result+" Error : "+error))).count();

    }

}
