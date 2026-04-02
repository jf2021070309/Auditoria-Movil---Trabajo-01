package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzenh implements zzery<zzeni> {
    private final zzfsn zza;
    private final zzfar zzb;
    private final zzcgz zzc;
    private final zzcgi zzd;

    public zzenh(zzfsn zzfsnVar, zzfar zzfarVar, zzcgz zzcgzVar, zzcgi zzcgiVar) {
        this.zza = zzfsnVar;
        this.zzb = zzfarVar;
        this.zzc = zzcgzVar;
        this.zzd = zzcgiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeni> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeng
            private final zzenh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeni zzb() throws Exception {
        return new zzeni(this.zzb.zzj, this.zzc, this.zzd.zzj());
    }
}
