package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfgl {
    private final String zza;
    private final String zzb;

    private zzfgl(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfgl zza(String str, String str2) {
        zzfhk.zzb(str, "Name is null or empty");
        zzfhk.zzb(str2, "Version is null or empty");
        return new zzfgl(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
