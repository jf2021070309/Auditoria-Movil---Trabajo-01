package com.google.android.gms.internal.ads;

import java.util.Map;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfpi {
    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public static <V> V zza(Map<?, V> map, @CheckForNull Object obj) {
        if (map != null) {
            try {
                return map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return null;
            }
        }
        throw null;
    }
}
