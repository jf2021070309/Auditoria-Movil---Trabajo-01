package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcks extends com.google.android.gms.ads.internal.util.zzb {
    final zzcjb zza;
    final zzcla zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcks(zzcjb zzcjbVar, zzcla zzclaVar, String str, String[] strArr) {
        this.zza = zzcjbVar;
        this.zzb = zzclaVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzc(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zze(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzckr(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfsm<?> zzc() {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzbo)).booleanValue() || !(this.zzb instanceof zzclj)) {
            return super.zzc();
        }
        return zzchg.zze.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzckq
            private final zzcks zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zze();
            }
        });
    }

    public final String zzd() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zze() throws Exception {
        return Boolean.valueOf(this.zzb.zzf(this.zzc, this.zzd, this));
    }
}
