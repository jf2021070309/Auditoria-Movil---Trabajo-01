package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfpi {
    @CheckForNull
    public static <V> V zza(Map<?, V> map, @CheckForNull Object obj) {
        Objects.requireNonNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }
}
