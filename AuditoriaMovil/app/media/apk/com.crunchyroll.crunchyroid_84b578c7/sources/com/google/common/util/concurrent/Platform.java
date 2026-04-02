package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.segment.analytics.internal.Utils;
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
/* loaded from: classes3.dex */
final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable th, Class<? extends Throwable> cls) {
        return cls.isInstance(th);
    }
}
