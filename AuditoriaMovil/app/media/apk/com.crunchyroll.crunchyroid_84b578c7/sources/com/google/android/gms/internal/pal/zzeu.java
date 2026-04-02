package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzeu extends zzfg {
    public zzeu(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2) {
        super(zzduVar, "vkfQoQl1Rxr7/uvSSRcOrQI31A6S/KAPW33nf5P0hYbuVy6BLjHzjUB4OEnneXoS", "SfaCE2ReDSQ3+KDKcvA6SSrX7nuWYsM/FN3ZFmlH0dA=", zzrVar, i, 3);
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzdc zzdcVar = new zzdc((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) zzfv.zzc().zzb(zzgk.zzck)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzj(zzdcVar.zza);
            this.zze.zzC(zzdcVar.zzb);
        }
    }
}
