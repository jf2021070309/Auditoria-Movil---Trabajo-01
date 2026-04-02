package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzest implements zzery<zzesu> {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcfw zzd;

    public zzest(zzcfw zzcfwVar, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcfwVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesu> zza() {
        return zzfsd.zzg(zzfsd.zzj(zzfsd.zza(this.zzb), zzesr.zza, this.zza), Throwable.class, new zzfrk(this) { // from class: com.google.android.gms.internal.ads.zzess
            private final zzest zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzb((Throwable) obj);
            }
        }, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzb(Throwable th) throws Exception {
        return zzfsd.zza(new zzesu(this.zzb));
    }
}
