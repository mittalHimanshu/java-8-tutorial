package completable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

class Join {


    List<Integer> testOne(){

        List<Integer> list = Arrays.asList(10,20,30,40);
        return list.stream()
                .map(data -> CompletableFuture.supplyAsync(() -> getNumber(data)))
                .map(comFuture -> comFuture.thenApply(n -> n*n))
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

    }

    private int getNumber(int a){
        return a*a;
    }

}
