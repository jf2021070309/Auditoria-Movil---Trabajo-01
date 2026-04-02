package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
public final class CollectPreconditions {
    public static void checkEntryNotNull(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            throw new NullPointerException(com.amazon.aps.iva.d90.a.b(valueOf.length() + 26, "null value in entry: ", valueOf, "=null"));
        }
        String valueOf2 = String.valueOf(obj2);
        throw new NullPointerException(com.amazon.aps.iva.d90.b.a(valueOf2.length() + 24, "null key in entry: null=", valueOf2));
    }

    @CanIgnoreReturnValue
    public static int checkNonnegative(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 40));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkPositive(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 38));
        sb.append(str);
        sb.append(" must be positive but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void checkRemove(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }

    @CanIgnoreReturnValue
    public static long checkNonnegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(e.a(str, 49));
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }
}
