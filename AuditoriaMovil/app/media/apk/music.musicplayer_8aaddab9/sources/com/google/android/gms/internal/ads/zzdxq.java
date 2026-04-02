package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdxq implements zzdbf, zzddx, zzdcu {
    private final zzdyc zza;
    private final String zzb;
    private int zzc = 0;
    private zzdxp zzd = zzdxp.AD_REQUESTED;
    private zzdav zze;
    private zzbcz zzf;

    public zzdxq(zzdyc zzdycVar, zzfar zzfarVar) {
        this.zza = zzdycVar;
        this.zzb = zzfarVar.zzf;
    }

    private static JSONObject zze(zzdav zzdavVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdavVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzdavVar.zzc());
        jSONObject.put("responseId", zzdavVar.zzf());
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgG)).booleanValue()) {
            String zzd = zzdavVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                String valueOf = String.valueOf(zzd);
                zzcgt.zzd(valueOf.length() != 0 ? "Bidding data: ".concat(valueOf) : new String("Bidding data: "));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        JSONArray jSONArray = new JSONArray();
        List<zzbdp> zzg = zzdavVar.zzg();
        if (zzg != null) {
            for (zzbdp zzbdpVar : zzg) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", zzbdpVar.zza);
                jSONObject2.put("latencyMillis", zzbdpVar.zzb);
                zzbcz zzbczVar = zzbdpVar.zzc;
                jSONObject2.put("error", zzbczVar == null ? null : zzf(zzbczVar));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzf(zzbcz zzbczVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzbczVar.zzc);
        jSONObject.put("errorCode", zzbczVar.zza);
        jSONObject.put("errorDescription", zzbczVar.zzb);
        zzbcz zzbczVar2 = zzbczVar.zzd;
        jSONObject.put("underlyingError", zzbczVar2 == null ? null : zzf(zzbczVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zza(zzcxg zzcxgVar) {
        this.zze = zzcxgVar.zzm();
        this.zzd = zzdxp.AD_LOADED;
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzbD(zzbcz zzbczVar) {
        this.zzd = zzdxp.AD_LOAD_FAILED;
        this.zzf = zzbczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzbG(zzcbj zzcbjVar) {
        this.zza.zzj(this.zzb, this);
    }

    public final boolean zzc() {
        return this.zzd != zzdxp.AD_REQUESTED;
    }

    public final JSONObject zzd() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zzd);
        jSONObject.put("format", zzezz.zza(this.zzc));
        zzdav zzdavVar = this.zze;
        JSONObject jSONObject2 = null;
        if (zzdavVar != null) {
            jSONObject2 = zze(zzdavVar);
        } else {
            zzbcz zzbczVar = this.zzf;
            if (zzbczVar != null && (iBinder = zzbczVar.zze) != null) {
                zzdav zzdavVar2 = (zzdav) iBinder;
                jSONObject2 = zze(zzdavVar2);
                List<zzbdp> zzg = zzdavVar2.zzg();
                if (zzg != null && zzg.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzf(this.zzf));
                    jSONObject2.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzddx
    public final void zzq(zzfal zzfalVar) {
        if (zzfalVar.zzb.zza.isEmpty()) {
            return;
        }
        this.zzc = zzfalVar.zzb.zza.get(0).zzb;
    }
}
