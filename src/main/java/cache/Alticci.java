package cache;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.math.BigInteger;

@ApplicationScoped
public class Alticci {

    @Inject
    private CacheKeysService cacheKeysService;

    public Alticci() {
    }

    public BigInteger getNthAlticci(int nth){
        return this.recursiveGetNthAlticciSequenceNumber(nth);
    }

    @CacheResult(cacheName = "alticci-cache")
    public BigInteger recursiveGetNthAlticciSequenceNumber(int nth){
        if (nth < 0){
            return BigInteger.ONE;
        }

        if (nth == 0)
        {
            return BigInteger.ZERO;
        }

        if(nth == 1 || nth == 2)
        {
            return BigInteger.ONE;
        }
        return recursiveGetNthAlticciSequenceNumber(nth-3).add(recursiveGetNthAlticciSequenceNumber(nth-2));
    }
}
