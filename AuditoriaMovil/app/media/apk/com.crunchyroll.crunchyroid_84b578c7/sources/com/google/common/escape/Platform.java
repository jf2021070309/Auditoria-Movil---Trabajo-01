package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.segment.analytics.internal.Utils;
@GwtCompatible(emulated = Utils.DEFAULT_COLLECT_DEVICE_ID)
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() { // from class: com.google.common.escape.Platform.1
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }
}
