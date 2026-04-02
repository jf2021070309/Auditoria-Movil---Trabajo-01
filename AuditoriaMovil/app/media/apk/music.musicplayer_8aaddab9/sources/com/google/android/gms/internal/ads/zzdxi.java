package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class zzdxi implements zzfrz<String> {
    public final /* synthetic */ zzdxk zza;

    public zzdxi(zzdxk zzdxkVar) {
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        long j2;
        zzchl zzchlVar;
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            zzdxk zzdxkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdxkVar.zzu("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j2));
            zzchlVar = this.zza.zze;
            zzchlVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@Nullable String str) {
        long j2;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            zzdxk zzdxkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            j2 = this.zza.zzd;
            zzdxkVar.zzu("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j2));
            executor = this.zza.zzi;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzdxh
                private final zzdxi zza;
                private final String zzb;

                {
                    this.zza = this;
                    this.zzb = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzdxi zzdxiVar = this.zza;
                    zzdxk.zzk(zzdxiVar.zza, this.zzb);
                }
            });
        }
    }
}
