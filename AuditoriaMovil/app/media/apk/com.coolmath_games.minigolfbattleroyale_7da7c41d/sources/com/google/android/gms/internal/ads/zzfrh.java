package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfrh extends zzfre {
    private zzfrh() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfrh(zzfrf zzfrfVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzb(zzfri<?> zzfriVar) {
        int i;
        int i2;
        synchronized (zzfriVar) {
            i = ((zzfri) zzfriVar).remaining;
            i2 = i - 1;
            ((zzfri) zzfriVar).remaining = i2;
        }
        return i2;
    }
}
