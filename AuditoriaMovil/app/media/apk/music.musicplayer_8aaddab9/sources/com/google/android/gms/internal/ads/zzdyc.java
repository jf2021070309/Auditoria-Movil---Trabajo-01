package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzdyc implements zzdyk, zzdxn {
    private final zzdyj zza;
    private final zzdyl zzb;
    private final zzdxo zzc;
    private final zzdxx zzd;
    private final zzdxm zze;
    private final String zzf;
    private boolean zzl;
    private int zzm;
    private boolean zzn;
    private String zzh = "{}";
    private String zzi = "";
    private long zzj = Long.MAX_VALUE;
    private zzdxy zzk = zzdxy.NONE;
    private zzdyb zzo = zzdyb.UNKNOWN;
    private final Map<String, List<zzdxq>> zzg = new HashMap();

    public zzdyc(zzdyj zzdyjVar, zzdyl zzdylVar, zzdxo zzdxoVar, Context context, zzcgz zzcgzVar, zzdxx zzdxxVar) {
        this.zza = zzdyjVar;
        this.zzb = zzdylVar;
        this.zzc = zzdxoVar;
        this.zze = new zzdxm(context);
        this.zzf = zzcgzVar.zza;
        this.zzd = zzdxxVar;
        com.google.android.gms.ads.internal.zzt.zzm().zza(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:18:0x0036, B:14:0x002b, B:16:0x0031), top: B:26:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzo(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzl     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.zzl = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.ads.zzbjd<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.zzbjl.zzgE     // Catch: java.lang.Throwable -> L3d
            com.google.android.gms.internal.ads.zzbjj r0 = com.google.android.gms.internal.ads.zzbet.zzc()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.zzc(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            com.google.android.gms.ads.internal.util.zzaz r2 = com.google.android.gms.ads.internal.zzt.zzm()     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.zzk()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.zzs()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.zzn()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.zzt()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.zzu()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyc.zzo(boolean, boolean):void");
    }

    private final synchronized void zzp(zzdxy zzdxyVar, boolean z) {
        if (this.zzk == zzdxyVar) {
            return;
        }
        if (zzn()) {
            zzt();
        }
        this.zzk = zzdxyVar;
        if (zzn()) {
            zzs();
        }
        if (z) {
            zzu();
        }
    }

    private final synchronized JSONObject zzq() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<zzdxq>> entry : this.zzg.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzdxq zzdxqVar : entry.getValue()) {
                if (zzdxqVar.zzc()) {
                    jSONArray.put(zzdxqVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzr() {
        this.zzn = true;
        this.zzd.zza();
        this.zza.zzg(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        zzv(com.google.android.gms.ads.internal.zzt.zzg().zzp().zzG());
    }

    private final synchronized void zzs() {
        zzdxy zzdxyVar = zzdxy.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzb();
        }
    }

    private final synchronized void zzt() {
        zzdxy zzdxyVar = zzdxy.NONE;
        int ordinal = this.zzk.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else if (ordinal != 2) {
        } else {
            this.zzc.zzc();
        }
    }

    private final void zzu() {
        com.google.android.gms.ads.internal.zzt.zzg().zzp().zzH(zzh());
    }

    private final synchronized void zzv(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzo(jSONObject.optBoolean("isTestMode", false), false);
            zzp(zzdxy.zza(jSONObject.optString("gesture", "NONE")), false);
            this.zzh = jSONObject.optString("networkExtras", "{}");
            this.zzj = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final void zza() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzg().zzp().zzI()) {
                zzr();
                return;
            }
            String zzG = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzG();
            if (TextUtils.isEmpty(zzG)) {
                return;
            }
            try {
                if (new JSONObject(zzG).optBoolean("isTestMode", false)) {
                    zzr();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzn
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzr()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzl
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzs()
            return
        L15:
            boolean r2 = r1.zzn()
            if (r2 != 0) goto L1e
            r1.zzt()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdyc.zzb(boolean):void");
    }

    public final void zzc(boolean z) {
        if (!this.zzn && z) {
            zzr();
        }
        zzo(z, true);
    }

    public final synchronized boolean zzd() {
        return this.zzl;
    }

    public final void zze(zzdxy zzdxyVar) {
        zzp(zzdxyVar, true);
    }

    public final zzdxy zzf() {
        return this.zzk;
    }

    public final synchronized String zzg() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzn()) {
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
                this.zzj = Long.MAX_VALUE;
                return "";
            } else if (this.zzh.equals("{}")) {
                return "";
            } else {
                return this.zzh;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzl);
            jSONObject.put("gesture", this.zzk);
            if (this.zzj > com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzh);
                jSONObject.put("networkExtrasExpirationSecs", this.zzj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j2) {
        this.zzh = str;
        this.zzj = j2;
        zzu();
    }

    public final synchronized void zzj(String str, zzdxq zzdxqVar) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue() && zzn()) {
            if (this.zzm >= ((Integer) zzbet.zzc().zzc(zzbjl.zzgr)).intValue()) {
                zzcgt.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzg.containsKey(str)) {
                this.zzg.put(str, new ArrayList());
            }
            this.zzm++;
            this.zzg.get(str).add(zzdxqVar);
        }
    }

    public final synchronized void zzk(zzbgq zzbgqVar, zzdyb zzdybVar) {
        if (!zzn()) {
            try {
                zzbgqVar.zze(zzfbm.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzcgt.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgp)).booleanValue()) {
            this.zzo = zzdybVar;
            this.zza.zzh(zzbgqVar, new zzbps(this));
            return;
        }
        try {
            zzbgqVar.zze(zzfbm.zzd(1, null, null));
            return;
        } catch (RemoteException unused2) {
            zzcgt.zzi("Ad inspector had an internal error.");
            return;
        }
    }

    public final synchronized void zzl(String str) {
        this.zzi = str;
    }

    public final synchronized JSONObject zzm() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.zzf);
            jSONObject.put("adapters", this.zzd.zzb());
            if (this.zzj < com.google.android.gms.ads.internal.zzt.zzj().currentTimeMillis() / 1000) {
                this.zzh = "{}";
            }
            jSONObject.put("networkExtras", this.zzh);
            jSONObject.put("adSlots", zzq());
            jSONObject.put("appInfo", this.zze.zza());
            String zzd = com.google.android.gms.ads.internal.zzt.zzg().zzp().zzn().zzd();
            if (!TextUtils.isEmpty(zzd)) {
                jSONObject.put("cld", new JSONObject(zzd));
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgF)).booleanValue() && !TextUtils.isEmpty(this.zzi)) {
                String valueOf = String.valueOf(this.zzi);
                zzcgt.zzd(valueOf.length() != 0 ? "Policy violation data: ".concat(valueOf) : new String("Policy violation data: "));
                jSONObject.put("policyViolations", new JSONObject(this.zzi));
            }
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
                jSONObject.put("openAction", this.zzo);
                jSONObject.put("gesture", this.zzk);
            }
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.zzt.zzg().zzl(e2, "Inspector.toJson");
            zzcgt.zzj("Ad inspector encountered an error", e2);
        }
        return jSONObject;
    }

    public final synchronized boolean zzn() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzgE)).booleanValue()) {
            return this.zzl || com.google.android.gms.ads.internal.zzt.zzm().zzk();
        }
        return this.zzl;
    }
}
