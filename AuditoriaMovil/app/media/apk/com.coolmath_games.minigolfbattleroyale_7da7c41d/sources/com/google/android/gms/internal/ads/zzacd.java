package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzacd extends zzacz {
    public zzacd(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i, int i2) {
        super(zzabrVar, "BEk7ZnZgUEtCcnEVmnqrsudDaU91B7wv3jOIcYFOdixfCZNd4CeUtXw9CNec1bEk", "yo4aeX8SQAYiyb+wCfW6Y7Ut6lHDx7k9wp/IaZ/McDY=", zzyjVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzd(-1L);
        this.zze.zze(-1L);
        int[] iArr = (int[]) this.zzf.invoke(null, this.zzb.zzc());
        synchronized (this.zze) {
            this.zze.zzd(iArr[0]);
            this.zze.zze(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zze.zzM(i);
            }
        }
    }
}
