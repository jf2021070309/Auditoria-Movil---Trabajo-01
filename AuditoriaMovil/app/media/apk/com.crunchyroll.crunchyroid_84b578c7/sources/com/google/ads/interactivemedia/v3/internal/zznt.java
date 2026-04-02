package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zznt {
    private final String zza;
    private final Object zzb;

    public zznt(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zznt zza(String str, boolean z) {
        return new zznt(str, Boolean.valueOf(z), 1);
    }

    public final Object zzb() {
        zznw zza = zzny.zza();
        if (zza == null) {
            if (zzny.zzb() != null) {
                zzny.zzb().zza();
            }
            return this.zzb;
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
