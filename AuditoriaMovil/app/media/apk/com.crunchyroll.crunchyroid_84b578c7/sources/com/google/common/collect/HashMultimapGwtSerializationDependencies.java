package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.segment.analytics.internal.Utils;
import java.util.Collection;
import java.util.Map;
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
/* loaded from: classes3.dex */
abstract class HashMultimapGwtSerializationDependencies<K, V> extends AbstractSetMultimap<K, V> {
    public HashMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
