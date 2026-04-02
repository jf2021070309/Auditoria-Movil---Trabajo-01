package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes3.dex */
final class NullnessCasts {
    private NullnessCasts() {
    }

    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }

    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(T t) {
        return t;
    }
}
