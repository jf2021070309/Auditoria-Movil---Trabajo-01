package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbtw;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbud;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzcfz;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzchg;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzfrk;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfsm;
import com.google.android.gms.internal.ads.zzfsn;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcgz zzcgzVar, String str, Runnable runnable) {
        zzc(context, zzcgzVar, true, null, str, null, runnable);
    }

    public final void zzb(Context context, zzcgz zzcgzVar, String str, zzcfz zzcfzVar) {
        zzc(context, zzcgzVar, false, zzcfzVar, zzcfzVar != null ? zzcfzVar.zze() : null, str, null);
    }

    @VisibleForTesting
    public final void zzc(Context context, zzcgz zzcgzVar, boolean z, zzcfz zzcfzVar, String str, String str2, Runnable runnable) {
        PackageInfo packageInfo;
        if (zzt.zzj().elapsedRealtime() - this.zzb < 5000) {
            zzcgt.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzj().elapsedRealtime();
        if (zzcfzVar != null) {
            if (zzt.zzj().currentTimeMillis() - zzcfzVar.zzb() <= ((Long) zzbet.zzc().zzc(zzbjl.zzcx)).longValue() && zzcfzVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            zzcgt.zzi("Context not provided to fetch application settings");
        } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            zzcgt.zzi("App settings could not be fetched. Required parameters missing");
        } else {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            zzbug zzb = zzt.zzp().zzb(this.zza, zzcgzVar);
            zzbua<JSONObject> zzbuaVar = zzbud.zza;
            zzbtw zza = zzb.zza("google.afma.config.fetchAppSettings", zzbuaVar, zzbuaVar);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbjl.zzc()));
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfsm zzb2 = zza.zzb(jSONObject);
                zzfrk zzfrkVar = zzd.zza;
                zzfsn zzfsnVar = zzchg.zzf;
                zzfsm zzi = zzfsd.zzi(zzb2, zzfrkVar, zzfsnVar);
                if (runnable != null) {
                    zzb2.zze(runnable, zzfsnVar);
                }
                zzchj.zza(zzi, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e2) {
                zzcgt.zzg("Error requesting application settings", e2);
            }
        }
    }
}
