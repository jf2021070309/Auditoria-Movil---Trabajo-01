package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzacf extends zzacz {
    private final long zzi;

    public zzacf(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, long j, int i, int i2) {
        super(zzabrVar, "bwYfemyqKvs+5mX5RaQoUxmdyIG97sQWktW0fw649v7l/u+oM9fVxJ1I47AdFZo9", "ue4Q/YADEXoviiBHZurTF9IPPlfQKRVJdzRZ56oggWM=", zzyjVar, i, 25);
        this.zzi = j;
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzf.invoke(null, new Object[0])).longValue();
        synchronized (this.zze) {
            this.zze.zzU(longValue);
            long j = this.zzi;
            if (j != 0) {
                this.zze.zzk(longValue - j);
                this.zze.zzn(this.zzi);
            }
        }
    }
}
