package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzdvp {
    protected final String zza = zzbkt.zzb.zze();
    protected final Map<String, String> zzb = new HashMap();
    protected final Executor zzc;
    protected final zzcgy zzd;
    protected final boolean zze;
    private final zzffm zzf;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdvp(Executor executor, zzcgy zzcgyVar, zzffm zzffmVar) {
        this.zzc = executor;
        this.zzd = zzcgyVar;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbl)).booleanValue()) {
            this.zze = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbp)).booleanValue();
        } else {
            this.zze = ((double) zzber.zze().nextFloat()) <= zzbkt.zza.zze().doubleValue();
        }
        this.zzf = zzffmVar;
    }

    public final void zzb(Map<String, String> map) {
        final String zza = this.zzf.zza(map);
        if (this.zze) {
            this.zzc.execute(new Runnable(this, zza) { // from class: com.google.android.gms.internal.ads.zzdvo
                private final zzdvp zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zza;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdvp zzdvpVar = this.zza;
                    zzdvpVar.zzd.zza(this.zzb);
                }
            });
        }
        com.google.android.gms.ads.internal.util.zze.zza(zza);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzc(Map<String, String> map) {
        return this.zzf.zza(map);
    }
}
