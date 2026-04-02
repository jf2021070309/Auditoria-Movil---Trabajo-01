package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdxi implements zzfrz<String> {
    final /* synthetic */ zzdxk zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxi(zzdxk zzdxkVar) {
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(Throwable th) {
        long j;
        zzchl zzchlVar;
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            zzdxk zzdxkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            j = this.zza.zzd;
            zzdxkVar.zzu("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzchlVar = this.zza.zze;
            zzchlVar.zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final /* bridge */ /* synthetic */ void zzb(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            zzdxk.zza(this.zza, true);
            zzdxk zzdxkVar = this.zza;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime();
            j = this.zza.zzd;
            zzdxkVar.zzu("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zza.zzi;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzdxh
                private final zzdxi zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
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
