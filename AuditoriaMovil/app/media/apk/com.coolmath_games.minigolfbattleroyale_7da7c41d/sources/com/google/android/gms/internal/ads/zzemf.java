package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzemf implements zzely<zzcxg> {
    private final zzfap zza;
    private final zzcoj zzb;
    private final Context zzc;
    private final zzelv zzd;
    private zzcxu zze;

    public zzemf(zzcoj zzcojVar, Context context, zzelv zzelvVar, zzfap zzfapVar) {
        this.zzb = zzcojVar;
        this.zzc = context;
        this.zzd = zzelvVar;
        this.zza = zzfapVar;
        zzfapVar.zzJ(zzelvVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zza(zzbdg zzbdgVar, String str, zzelw zzelwVar, zzelx<? super zzcxg> zzelxVar) throws RemoteException {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc) && zzbdgVar.zzs == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Failed to load the ad because app ID is missing.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzema
                private final zzemf zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzf();
                }
            });
            return false;
        } else if (str == null) {
            com.google.android.gms.ads.internal.util.zze.zzf("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zze().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzemb
                private final zzemf zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze();
                }
            });
            return false;
        } else {
            zzfbh.zzb(this.zzc, zzbdgVar.zzf);
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzbdgVar.zzf) {
                this.zzb.zzz().zzc(true);
            }
            int i = ((zzelz) zzelwVar).zza;
            zzfap zzfapVar = this.zza;
            zzfapVar.zzr(zzbdgVar);
            zzfapVar.zzB(i);
            zzfar zzL = zzfapVar.zzL();
            if (zzL.zzn != null) {
                this.zzd.zzc().zzp(zzL.zzn);
            }
            zzdla zzr = this.zzb.zzr();
            zzdam zzdamVar = new zzdam();
            zzdamVar.zze(this.zzc);
            zzdamVar.zzf(zzL);
            zzr.zzd(zzdamVar.zzh());
            zzdgn zzdgnVar = new zzdgn();
            zzdgnVar.zzt(this.zzd.zzc(), this.zzb.zze());
            zzr.zze(zzdgnVar.zzC());
            zzr.zzc(this.zzd.zzb());
            zzr.zzb(new zzcve(null));
            zzdlb zza = zzr.zza();
            this.zzb.zzy().zza(1);
            zzfsn zzfsnVar = zzchg.zza;
            zzgli.zzb(zzfsnVar);
            ScheduledExecutorService zzf = this.zzb.zzf();
            zzcyj<zzcxn> zzR = zza.zzR();
            zzcxu zzcxuVar = new zzcxu(zzfsnVar, zzf, zzR.zzd(zzR.zzc()));
            this.zze = zzcxuVar;
            zzcxuVar.zza(new zzeme(this, zzelxVar, zza));
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzely
    public final boolean zzb() {
        zzcxu zzcxuVar = this.zze;
        return zzcxuVar != null && zzcxuVar.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzd.zze().zzbD(zzfbm.zzd(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zze().zzbD(zzfbm.zzd(4, null, null));
    }
}
