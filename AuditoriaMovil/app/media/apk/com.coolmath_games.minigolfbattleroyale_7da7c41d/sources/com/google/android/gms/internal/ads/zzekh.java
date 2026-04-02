package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzekh extends zzbxp {
    private final String zza;
    private final zzbxn zzb;
    private final zzchl<JSONObject> zzc;
    private final JSONObject zzd;
    private boolean zze;

    public zzekh(String str, zzbxn zzbxnVar, zzchl<JSONObject> zzchlVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zze = false;
        this.zzc = zzchlVar;
        this.zza = str;
        this.zzb = zzbxnVar;
        try {
            jSONObject.put("adapter_version", zzbxnVar.zzf().toString());
            this.zzd.put("sdk_version", this.zzb.zzg().toString());
            this.zzd.put("name", this.zza);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public final synchronized void zzb() {
        if (this.zze) {
            return;
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zzf(String str) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final synchronized void zzg(zzbcz zzbczVar) throws RemoteException {
        if (this.zze) {
            return;
        }
        try {
            this.zzd.put("signal_error", zzbczVar.zzb);
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zze = true;
    }
}
