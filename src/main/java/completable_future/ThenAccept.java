package completable_future;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ThenAccept {


    List<String> testSecond(){
        List<String> list = Arrays.asList("A","B","C","D");
        List<String> finalList = new ArrayList<>();
        list.stream().map(data->CompletableFuture.supplyAsync(()->"Processing : "+data))
                .map(compFuture->compFuture.thenAccept(finalList::add))
                .map(CompletableFuture::join)
                .count();
        return finalList;
    }

}
