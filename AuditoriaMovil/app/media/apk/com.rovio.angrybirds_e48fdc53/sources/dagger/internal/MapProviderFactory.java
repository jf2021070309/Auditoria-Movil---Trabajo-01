package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class MapProviderFactory<K, V> implements Factory<Map<K, Provider<V>>> {
    private static final MapProviderFactory<Object, Object> a = new MapProviderFactory<>(Collections.emptyMap());
    private final Map<K, Provider<V>> b;

    public static <K, V> Builder<K, V> builder(int i) {
        return new Builder<>(i);
    }

    public static <K, V> MapProviderFactory<K, V> empty() {
        return (MapProviderFactory<K, V>) a;
    }

    private MapProviderFactory(Map<K, Provider<V>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // javax.inject.Provider
    public Map<K, Provider<V>> get() {
        return this.b;
    }

    /* loaded from: classes4.dex */
    public static final class Builder<K, V> {
        private final LinkedHashMap<K, Provider<V>> a;

        private Builder(int i) {
            this.a = DaggerCollections.b(i);
        }

        public MapProviderFactory<K, V> build() {
            return new MapProviderFactory<>(this.a);
        }

        public Builder<K, V> put(K k, Provider<V> provider) {
            if (k == null) {
                throw new NullPointerException("The key is null");
            }
            if (provider == null) {
                throw new NullPointerException("The provider of the value is null");
            }
            this.a.put(k, provider);
            return this;
        }
    }
}
