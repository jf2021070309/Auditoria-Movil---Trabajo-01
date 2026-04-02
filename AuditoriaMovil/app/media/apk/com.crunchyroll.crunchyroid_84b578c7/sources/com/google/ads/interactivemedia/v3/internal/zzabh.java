package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabh implements zzxj {
    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (Enum.class.isAssignableFrom(zzc) && zzc != Enum.class) {
            if (!zzc.isEnum()) {
                zzc = zzc.getSuperclass();
            }
            return new zzabx(zzc);
        }
        return null;
    }
}
