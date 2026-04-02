package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class zzacd extends zzacz {
    public zzacd(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3) {
        super(zzabrVar, "BEk7ZnZgUEtCcnEVmnqrsudDaU91B7wv3jOIcYFOdixfCZNd4CeUtXw9CNec1bEk", "yo4aeX8SQAYiyb+wCfW6Y7Ut6lHDx7k9wp/IaZ/McDY=", zzyjVar, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzd(-1L);
        this.zze.zze(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzc());
        synchronized (this.zze) {
            this.zze.zzd(iArr[0]);
            this.zze.zze(iArr[1]);
            int i2 = iArr[2];
            if (i2 != Integer.MIN_VALUE) {
                this.zze.zzM(i2);
            }
        }
    }
}
