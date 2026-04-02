package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzel extends zzfg {
    private final long zzi;

    public zzel(zzdu zzduVar, String str, String str2, zzr zzrVar, long j, int i, int i2) {
        super(zzduVar, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", zzrVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzt(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzU(longValue - j);
                this.zze.zzV(this.zzi);
            }
        }
    }
}
