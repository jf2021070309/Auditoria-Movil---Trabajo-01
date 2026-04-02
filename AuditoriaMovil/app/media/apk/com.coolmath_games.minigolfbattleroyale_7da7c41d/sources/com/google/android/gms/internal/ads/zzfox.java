package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfox {
    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public static <T> T zza(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Iterator<?> it) {
        if (it != null) {
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
            return;
        }
        throw null;
    }
}
