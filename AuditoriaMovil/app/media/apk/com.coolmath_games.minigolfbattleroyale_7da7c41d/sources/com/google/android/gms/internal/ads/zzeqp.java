package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeqp implements zzery<zzeqq> {
    private final String zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqp(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeqq> zza() {
        return zzfsd.zza(new zzeqq(this.zza, this.zzb));
    }
}
