package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdut implements zzdfx, zzbcv, zzdbw, zzdbg {
    private final Context zza;
    private final zzfbe zzb;
    private final zzdvi zzc;
    private final zzfal zzd;
    private final zzezz zze;
    private final zzedq zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzbet.zzc().zzc(zzbjl.zzfc)).booleanValue();

    public zzdut(Context context, zzfbe zzfbeVar, zzdvi zzdviVar, zzfal zzfalVar, zzezz zzezzVar, zzedq zzedqVar) {
        this.zza = context;
        this.zzb = zzfbeVar;
        this.zzc = zzdviVar;
        this.zzd = zzfalVar;
        this.zze = zzezzVar;
        this.zzf = zzedqVar;
    }

    private final boolean zzf() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) zzbet.zzc().zzc(zzbjl.zzaY);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String zzv = com.google.android.gms.ads.internal.util.zzs.zzv(this.zza);
                    boolean z = false;
                    if (str != null && zzv != null) {
                        try {
                            z = Pattern.matches(str, zzv);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzk(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    private final zzdvh zzh(String str) {
        zzdvh zzd = this.zzc.zzd();
        zzd.zzb(this.zzd.zzb.zzb);
        zzd.zzc(this.zze);
        zzd.zzd("action", str);
        if (!this.zze.zzt.isEmpty()) {
            zzd.zzd("ancn", this.zze.zzt.get(0));
        }
        if (this.zze.zzaf) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzd.zzd("device_connectivity", true != com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) ? "offline" : "online");
            zzd.zzd("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            zzd.zzd("offline_ad", "1");
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfl)).booleanValue()) {
            boolean zza = com.google.android.gms.ads.nonagon.signalgeneration.zze.zza(this.zzd);
            zzd.zzd("scar", String.valueOf(zza));
            if (zza) {
                String zzb = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzb(this.zzd);
                if (!TextUtils.isEmpty(zzb)) {
                    zzd.zzd("ragent", zzb);
                }
                String zzc = com.google.android.gms.ads.nonagon.signalgeneration.zze.zzc(this.zzd);
                if (!TextUtils.isEmpty(zzc)) {
                    zzd.zzd("rtype", zzc);
                }
            }
        }
        return zzd;
    }

    private final void zzi(zzdvh zzdvhVar) {
        if (this.zze.zzaf) {
            this.zzf.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdvhVar.zzf(), 2));
            return;
        }
        zzdvhVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        if (this.zze.zzaf) {
            zzi(zzh("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza(zzbcz zzbczVar) {
        zzbcz zzbczVar2;
        if (this.zzh) {
            zzdvh zzh = zzh("ifts");
            zzh.zzd(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            int i = zzbczVar.zza;
            String str = zzbczVar.zzb;
            if (zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzbczVar2 = zzbczVar.zzd) != null && !zzbczVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzbcz zzbczVar3 = zzbczVar.zzd;
                i = zzbczVar3.zza;
                str = zzbczVar3.zzb;
            }
            if (i >= 0) {
                zzh.zzd("arec", String.valueOf(i));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzh.zzd("areec", zza);
            }
            zzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzb(zzdkm zzdkmVar) {
        if (this.zzh) {
            zzdvh zzh = zzh("ifts");
            zzh.zzd(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                zzh.zzd(NotificationCompat.CATEGORY_MESSAGE, zzdkmVar.getMessage());
            }
            zzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzc() {
        if (zzf()) {
            zzh("adapter_impression").zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzd() {
        if (this.zzh) {
            zzdvh zzh = zzh("ifts");
            zzh.zzd(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzh.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zze() {
        if (zzf()) {
            zzh("adapter_shown").zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (zzf() || this.zze.zzaf) {
            zzi(zzh("impression"));
        }
    }
}
