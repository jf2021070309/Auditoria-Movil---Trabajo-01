package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdActivity;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcgf {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzi = new Object();
    int zzg = 0;
    int zzh = 0;

    public zzcgf(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (zzbld.zza.zze().booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzc(zzbdg zzbdgVar, long j) {
        synchronized (this.zzi) {
            long zzr = this.zzj.zzr();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzr > ((Long) zzbet.zzc().zzc(zzbjl.zzaE)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzt();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            Bundle bundle = zzbdgVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i = this.zzd + 1;
            this.zzd = i;
            if (i == 0) {
                this.zze = 0L;
                this.zzj.zzu(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzj.zzv();
            }
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final Bundle zzf(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzi) {
            bundle = new Bundle();
            bundle.putString(SDKAnalyticsEvents.PARAMETER_SESSION_ID, this.zzj.zzC() ? "" : this.zzf);
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzcbx.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, Constants.PLATFORM);
            boolean z = false;
            if (identifier == 0) {
                com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zzi("Fail to fetch AdActivity theme");
                    com.google.android.gms.ads.internal.util.zze.zzh("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }
}
