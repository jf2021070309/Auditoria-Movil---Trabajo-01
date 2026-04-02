package com.google.android.datatransport.runtime.dagger.internal;

import com.amazon.aps.iva.jb0.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class AbstractMapFactory<K, V, V2> implements Factory<Map<K, V2>> {
    private final Map<K, a<V>> contributingMap;

    /* loaded from: classes2.dex */
    public static abstract class Builder<K, V, V2> {
        final LinkedHashMap<K, a<V>> map;

        public Builder(int i) {
            this.map = DaggerCollections.newLinkedHashMapWithExpectedSize(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder<K, V, V2> put(K k, a<V> aVar) {
            this.map.put(Preconditions.checkNotNull(k, "key"), Preconditions.checkNotNull(aVar, "provider"));
            return this;
        }

        public Builder<K, V, V2> putAll(a<Map<K, V2>> aVar) {
            if (aVar instanceof DelegateFactory) {
                return putAll(((DelegateFactory) aVar).getDelegate());
            }
            this.map.putAll(((AbstractMapFactory) aVar).contributingMap);
            return this;
        }
    }

    public AbstractMapFactory(Map<K, a<V>> map) {
        this.contributingMap = Collections.unmodifiableMap(map);
    }

    public final Map<K, a<V>> contributingMap() {
        return this.contributingMap;
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, com.amazon.aps.iva.jb0.a
    public abstract /* synthetic */ Object get();
}
