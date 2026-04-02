package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.work.WorkRequest;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbts {
    private final Context zzb;
    private final String zzc;
    private final zzcgz zzd;
    private final com.google.android.gms.ads.internal.util.zzbe<zzbsn> zze;
    private final com.google.android.gms.ads.internal.util.zzbe<zzbsn> zzf;
    private zzbtr zzg;
    private final Object zza = new Object();
    private int zzh = 1;

    public zzbts(Context context, zzcgz zzcgzVar, String str, com.google.android.gms.ads.internal.util.zzbe<zzbsn> zzbeVar, com.google.android.gms.ads.internal.util.zzbe<zzbsn> zzbeVar2) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcgzVar;
        this.zze = zzbeVar;
        this.zzf = zzbeVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbtr zzf(zzaas zzaasVar) {
        final zzbtr zzbtrVar = new zzbtr(this.zzf);
        zzchg.zze.execute(new Runnable(this, null, zzbtrVar) { // from class: com.google.android.gms.internal.ads.zzbsx
            private final zzbts zza;
            private final zzbtr zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzbtrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(null, this.zzb);
            }
        });
        zzbtrVar.zzf(new zzbth(this, zzbtrVar), new zzbti(this, zzbtrVar));
        return zzbtrVar;
    }

    public final zzbtm zzg(zzaas zzaasVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbtr zzbtrVar = this.zzg;
                if (zzbtrVar != null && this.zzh == 0) {
                    zzbtrVar.zzf(new zzchp(this) { // from class: com.google.android.gms.internal.ads.zzbsy
                        private final zzbts zza;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzchp
                        public final void zza(Object obj) {
                            this.zza.zzh((zzbsn) obj);
                        }
                    }, zzbsz.zza);
                }
            }
            zzbtr zzbtrVar2 = this.zzg;
            if (zzbtrVar2 != null && zzbtrVar2.zzi() != -1) {
                int i = this.zzh;
                if (i == 0) {
                    return this.zzg.zza();
                } else if (i != 1) {
                    return this.zzg.zza();
                } else {
                    this.zzh = 2;
                    zzf(null);
                    return this.zzg.zza();
                }
            }
            this.zzh = 2;
            zzbtr zzf = zzf(null);
            this.zzg = zzf;
            return zzf.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(zzbsn zzbsnVar) {
        if (zzbsnVar.zzj()) {
            this.zzh = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzaas zzaasVar, final zzbtr zzbtrVar) {
        try {
            final zzbsv zzbsvVar = new zzbsv(this.zzb, this.zzd, null, null);
            zzbsvVar.zzh(new zzbsm(this, zzbtrVar, zzbsvVar) { // from class: com.google.android.gms.internal.ads.zzbta
                private final zzbts zza;
                private final zzbtr zzb;
                private final zzbsn zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzbtrVar;
                    this.zzc = zzbsvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbsm
                public final void zza() {
                    final zzbts zzbtsVar = this.zza;
                    final zzbtr zzbtrVar2 = this.zzb;
                    final zzbsn zzbsnVar = this.zzc;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable(zzbtsVar, zzbtrVar2, zzbsnVar) { // from class: com.google.android.gms.internal.ads.zzbtb
                        private final zzbts zza;
                        private final zzbtr zzb;
                        private final zzbsn zzc;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzbtsVar;
                            this.zzb = zzbtrVar2;
                            this.zzc = zzbsnVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzj(this.zzb, this.zzc);
                        }
                    }, WorkRequest.MIN_BACKOFF_MILLIS);
                }
            });
            zzbsvVar.zzl("/jsLoaded", new zzbtd(this, zzbtrVar, zzbsvVar));
            com.google.android.gms.ads.internal.util.zzcd zzcdVar = new com.google.android.gms.ads.internal.util.zzcd();
            zzbte zzbteVar = new zzbte(this, null, zzbsvVar, zzcdVar);
            zzcdVar.zzb(zzbteVar);
            zzbsvVar.zzl("/requestReload", zzbteVar);
            if (this.zzc.endsWith(".js")) {
                zzbsvVar.zzc(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzbsvVar.zzg(this.zzc);
            } else {
                zzbsvVar.zzf(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbtg(this, zzbtrVar, zzbsvVar), 60000L);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzg().zzk(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbtrVar.zzh();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzbtr zzbtrVar, zzbsn zzbsnVar) {
        synchronized (this.zza) {
            if (zzbtrVar.zzi() != -1 && zzbtrVar.zzi() != 1) {
                zzbtrVar.zzh();
                zzchg.zze.execute(zzbtc.zza(zzbsnVar));
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
