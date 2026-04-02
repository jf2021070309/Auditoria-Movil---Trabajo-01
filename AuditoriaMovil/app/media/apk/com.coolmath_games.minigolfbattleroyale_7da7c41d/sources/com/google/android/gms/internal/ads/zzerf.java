package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzerf implements zzery<zzerg> {
    private final String zza;
    private final zzfsn zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfar zze;
    private final zzcoj zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzerf(zzfsn zzfsnVar, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfar zzfarVar, zzcoj zzcojVar) {
        this.zzb = zzfsnVar;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfarVar;
        this.zzf = zzcojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerg> zza() {
        if (!((Boolean) zzbet.zzc().zzc(zzbjl.zzfm)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(zzerb.zza);
        }
        return zzfsd.zze(new zzfrj(this) { // from class: com.google.android.gms.internal.ads.zzerc
            private final zzerf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfrj
            public final zzfsm zza() {
                return this.zza.zzb();
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ zzfsm zzb() {
        String str = this.zza;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfn)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        com.google.android.gms.ads.nonagon.signalgeneration.zzf zzu = this.zzf.zzu();
        zzdam zzdamVar = new zzdam();
        zzdamVar.zze(this.zzd);
        zzfap zzfapVar = new zzfap();
        zzfapVar.zzw("adUnitId");
        zzfapVar.zzr(this.zze.zzd);
        zzfapVar.zzt(new zzbdl());
        zzdamVar.zzf(zzfapVar.zzL());
        zzu.zzc(zzdamVar.zzh());
        com.google.android.gms.ads.nonagon.signalgeneration.zzx zzxVar = new com.google.android.gms.ads.nonagon.signalgeneration.zzx();
        zzxVar.zzb(str);
        zzu.zzb(zzxVar.zzc());
        new zzdgn();
        return zzfsd.zzf(zzfsd.zzj((zzfru) zzfsd.zzh(zzfru.zzw((zzfsm) zzu.zza().zza()), ((Long) zzbet.zzc().zzc(zzbjl.zzfo)).longValue(), TimeUnit.MILLISECONDS, this.zzc), zzerd.zza, this.zzb), Exception.class, zzere.zza, this.zzb);
    }
}
