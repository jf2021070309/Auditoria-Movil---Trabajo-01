package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzgm {
    private final String zza;
    private final Object zzb;

    public zzgm(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
    }

    public static zzgm zza(String str, boolean z) {
        return new zzgm(str, Boolean.valueOf(z), 1);
    }

    public final Object zzb() {
        zzgp zza = zzgr.zza();
        if (zza == null) {
            if (zzgr.zzb() != null) {
                zzgr.zzb().zza();
            }
            return this.zzb;
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
