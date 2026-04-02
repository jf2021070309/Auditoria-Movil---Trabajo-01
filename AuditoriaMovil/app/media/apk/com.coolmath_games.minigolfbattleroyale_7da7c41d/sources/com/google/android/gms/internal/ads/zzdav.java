package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdav extends zzbgy {
    private final String zza;
    private final String zzb;
    private final List<zzbdp> zzc;
    private final long zzd;
    private final String zze;

    public zzdav(zzezz zzezzVar, String str, zzeeh zzeehVar, zzfac zzfacVar) {
        String str2 = null;
        this.zzb = zzezzVar == null ? null : zzezzVar.zzX;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str2 = zzezzVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str2 != null ? str2 : str;
        this.zzc = zzeehVar.zze();
        this.zzd = com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000;
        this.zze = (!((Boolean) zzbet.zzc().zzc(zzbjl.zzgG)).booleanValue() || zzfacVar == null || TextUtils.isEmpty(zzfacVar.zzh)) ? "" : zzfacVar.zzh;
    }

    public final long zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final String zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgz
    public final List<zzbdp> zzg() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfX)).booleanValue()) {
            return this.zzc;
        }
        return null;
    }
}
