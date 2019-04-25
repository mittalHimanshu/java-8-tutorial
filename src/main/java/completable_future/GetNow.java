package completable_future;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

class GetNow {

    private Logger logger = LogManager.getLogger(GetNow.class);

    void testFourth(){

        List<String> list = Arrays.asList("A","B","C","D");
        list.stream().map(s-> CompletableFuture.supplyAsync(()->s+s))
                .map(f->f.getNow("Not Done")).forEach(s -> logger.info(s));

    }

}
