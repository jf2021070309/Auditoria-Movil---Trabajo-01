package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.segment.analytics.internal.Utils;
import java.util.Collection;
import java.util.Map;
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
/* loaded from: classes3.dex */
abstract class ArrayListMultimapGwtSerializationDependencies<K, V> extends AbstractListMultimap<K, V> {
    public ArrayListMultimapGwtSerializationDependencies(Map<K, Collection<V>> map) {
        super(map);
    }
}
