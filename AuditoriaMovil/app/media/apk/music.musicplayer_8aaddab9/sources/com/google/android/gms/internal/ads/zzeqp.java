package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzeqp implements zzery<zzeqq> {
    private final String zza;
    private final String zzb;

    public zzeqp(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqq> zza() {
        return zzfsd.zza(new zzeqq(this.zza, this.zzb));
    }
}
