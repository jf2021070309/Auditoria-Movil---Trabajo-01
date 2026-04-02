package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
/* loaded from: classes4.dex */
public final class MapFactory<K, V> implements Factory<Map<K, V>> {
    private final Map<K, Provider<V>> a;

    private MapFactory(Map<K, Provider<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public static <K, V> MapFactory<K, V> create(Provider<Map<K, Provider<V>>> provider) {
        return new MapFactory<>(provider.get());
    }

    @Override // javax.inject.Provider
    public Map<K, V> get() {
        LinkedHashMap b = DaggerCollections.b(this.a.size());
        for (Map.Entry<K, Provider<V>> entry : this.a.entrySet()) {
            b.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(b);
    }
}
