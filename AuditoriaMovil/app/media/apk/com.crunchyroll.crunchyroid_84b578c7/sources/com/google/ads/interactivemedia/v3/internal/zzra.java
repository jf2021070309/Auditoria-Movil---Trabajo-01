package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzra implements zzxj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        zzqy zzqyVar = (zzqy) zzc.getAnnotation(zzqy.class);
        if (zzqyVar != null && zzc != zzqyVar.zza()) {
            return zzwmVar.zza(zzact.zza(zzqyVar.zza()));
        }
        return null;
    }
}
