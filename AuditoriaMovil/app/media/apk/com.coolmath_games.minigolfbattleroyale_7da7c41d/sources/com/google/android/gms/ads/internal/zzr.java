package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbkp;
import com.google.android.gms.internal.ads.zzcgz;
import com.google.android.gms.internal.ads.zzerv;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzr {
    private final Context zza;
    private final String zzb;
    private final Map<String, String> zzc = new TreeMap();
    private String zzd;
    private String zze;
    private final String zzf;

    public zzr(Context context, String str) {
        String concat;
        this.zza = context.getApplicationContext();
        this.zzb = str;
        String packageName = context.getPackageName();
        try {
            String str2 = Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            concat = sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to get package version name for reporting", e);
            concat = String.valueOf(packageName).concat("-missing");
        }
        this.zzf = concat;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final Map<String, String> zze() {
        return this.zzc;
    }

    public final void zzf(zzbdg zzbdgVar, zzcgz zzcgzVar) {
        this.zzd = zzbdgVar.zzj.zza;
        Bundle bundle = zzbdgVar.zzm;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String zze = zzbkp.zzc.zze();
        for (String str : bundle2.keySet()) {
            if (zze.equals(str)) {
                this.zze = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.zzc.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.zzc.put("SDKVersion", zzcgzVar.zza);
        if (zzbkp.zza.zze().booleanValue()) {
            try {
                Bundle zzb = zzerv.zzb(this.zza, new JSONArray(zzbkp.zzb.zze()));
                for (String str2 : zzb.keySet()) {
                    this.zzc.put(str2, zzb.get(str2).toString());
                }
            } catch (JSONException e) {
                com.google.android.gms.ads.internal.util.zze.zzg("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }
}
