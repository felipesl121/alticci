package cache;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.cache.Cache;
import io.quarkus.cache.CacheName;
import io.quarkus.cache.CaffeineCache;

import java.util.Set;

@ApplicationScoped
public class CacheKeysService {

    @CacheName("alticci-cache")
    Cache cache;

    public Set<Object> getAllCacheKeys() {
        return cache.as(CaffeineCache.class).keySet();
    }
}
