package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfrh extends zzfre {
    private zzfrh() {
        super(null);
    }

    public /* synthetic */ zzfrh(zzfrf zzfrfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final void zza(zzfri<?> zzfriVar, @CheckForNull Set<Throwable> set, Set<Throwable> set2) {
        Set set3;
        synchronized (zzfriVar) {
            set3 = ((zzfri) zzfriVar).seenExceptions;
            if (set3 == null) {
                ((zzfri) zzfriVar).seenExceptions = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb(zzfri<?> zzfriVar) {
        int i2;
        int i3;
        synchronized (zzfriVar) {
            i2 = ((zzfri) zzfriVar).remaining;
            i3 = i2 - 1;
            ((zzfri) zzfriVar).remaining = i3;
        }
        return i3;
    }
}
