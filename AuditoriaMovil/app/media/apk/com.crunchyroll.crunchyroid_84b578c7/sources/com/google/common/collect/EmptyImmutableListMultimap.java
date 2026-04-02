package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.segment.analytics.internal.Utils;
/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = Utils.DEFAULT_COLLECT_DEVICE_ID)
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {
    static final EmptyImmutableListMultimap INSTANCE = new EmptyImmutableListMultimap();
    private static final long serialVersionUID = 0;

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.of(), 0);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
