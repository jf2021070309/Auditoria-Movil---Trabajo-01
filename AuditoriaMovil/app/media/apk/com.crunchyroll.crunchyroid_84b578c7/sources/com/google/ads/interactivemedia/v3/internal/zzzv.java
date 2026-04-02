package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzzv implements zzxj {
    private final zzyl zza;

    public zzzv(zzyl zzylVar, boolean z) {
        this.zza = zzylVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        zzxi zzxiVar;
        Type zzd = zzactVar.zzd();
        Class zzc = zzactVar.zzc();
        if (!Map.class.isAssignableFrom(zzc)) {
            return null;
        }
        Type[] zzh = zzxr.zzh(zzd, zzc);
        Type type = zzh[0];
        if (type != Boolean.TYPE && type != Boolean.class) {
            zzxiVar = zzwmVar.zza(zzact.zzb(type));
        } else {
            zzxiVar = zzaby.zzf;
        }
        zzxi zza = zzwmVar.zza(zzact.zzb(zzh[1]));
        zzyz zza2 = this.zza.zza(zzactVar);
        return new zzzu(this, zzwmVar, zzh[0], zzxiVar, zzh[1], zza, zza2);
    }
}
