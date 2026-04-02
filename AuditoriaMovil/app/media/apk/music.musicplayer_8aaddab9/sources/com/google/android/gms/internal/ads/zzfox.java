package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfox {
    @CheckForNull
    public static <T> T zza(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    public static void zzb(Iterator<?> it) {
        Objects.requireNonNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
