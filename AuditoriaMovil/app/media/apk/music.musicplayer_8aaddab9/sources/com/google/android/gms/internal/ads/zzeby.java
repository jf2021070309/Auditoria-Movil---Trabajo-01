package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class zzeby implements zzdfx, zzbcv, zzdbw, zzdbg {
    private final Context zza;
    private final zzfbe zzb;
    private final zzfal zzc;
    private final zzezz zzd;
    private final zzedq zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzbet.zzc().zzc(zzbjl.zzfc)).booleanValue();
    private final zzffc zzh;
    private final String zzi;

    public zzeby(Context context, zzfbe zzfbeVar, zzfal zzfalVar, zzezz zzezzVar, zzedq zzedqVar, zzffc zzffcVar, String str) {
        this.zza = context;
        this.zzb = zzfbeVar;
        this.zzc = zzfalVar;
        this.zzd = zzezzVar;
        this.zze = zzedqVar;
        this.zzh = zzffcVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) zzbet.zzc().zzc(zzbjl.zzaY);
                    com.google.android.gms.ads.internal.zzt.zzc();
                    String zzv = com.google.android.gms.ads.internal.util.zzs.zzv(this.zza);
                    boolean z = false;
                    if (str != null && zzv != null) {
                        try {
                            z = Pattern.matches(str, zzv);
                        } catch (RuntimeException e2) {
                            com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    private final zzffb zzh(String str) {
        zzffb zza = zzffb.zza(str);
        zza.zzg(this.zzc, null);
        zza.zzi(this.zzd);
        zza.zzc("request_id", this.zzi);
        if (!this.zzd.zzt.isEmpty()) {
            zza.zzc("ancn", this.zzd.zzt.get(0));
        }
        if (this.zzd.zzaf) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zza.zzc("device_connectivity", true != com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) ? "offline" : "online");
            zza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis()));
            zza.zzc("offline_ad", "1");
        }
        return zza;
    }

    private final void zzi(zzffb zzffbVar) {
        if (!this.zzd.zzaf) {
            this.zzh.zza(zzffbVar);
            return;
        }
        this.zze.zze(new zzeds(com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zzb(zzffbVar), 2));
    }

    @Override // com.google.android.gms.internal.ads.zzbcv
    public final void onAdClicked() {
        if (this.zzd.zzaf) {
            zzi(zzh("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zza(zzbcz zzbczVar) {
        zzbcz zzbczVar2;
        if (this.zzg) {
            int i2 = zzbczVar.zza;
            String str = zzbczVar.zzb;
            if (zzbczVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzbczVar2 = zzbczVar.zzd) != null && !zzbczVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zzbcz zzbczVar3 = zzbczVar.zzd;
                i2 = zzbczVar3.zza;
                str = zzbczVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzffb zzh = zzh("ifts");
            zzh.zzc("reason", "adapter");
            if (i2 >= 0) {
                zzh.zzc("arec", String.valueOf(i2));
            }
            if (zza != null) {
                zzh.zzc("areec", zza);
            }
            this.zzh.zza(zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzb(zzdkm zzdkmVar) {
        if (this.zzg) {
            zzffb zzh = zzh("ifts");
            zzh.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                zzh.zzc("msg", zzdkmVar.getMessage());
            }
            this.zzh.zza(zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzc() {
        if (zzf()) {
            this.zzh.zza(zzh("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbg
    public final void zzd() {
        if (this.zzg) {
            zzffc zzffcVar = this.zzh;
            zzffb zzh = zzh("ifts");
            zzh.zzc("reason", "blocked");
            zzffcVar.zza(zzh);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zze() {
        if (zzf()) {
            this.zzh.zza(zzh("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zzg() {
        if (zzf() || this.zzd.zzaf) {
            zzi(zzh(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
