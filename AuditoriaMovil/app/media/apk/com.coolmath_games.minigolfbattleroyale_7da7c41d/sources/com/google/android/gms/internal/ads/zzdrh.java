package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdrh {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcmx zzc;
    private final Context zzd;
    private final zzdvi zze;
    private final zzffc zzf;
    private final Executor zzg;
    private final zzaas zzh;
    private final zzcgz zzi;
    private final zzedq zzk;
    private final zzffu zzl;
    private zzfsm<zzcml> zzm;
    private final zzdrb zza = new zzdrb(null);
    private final zzbqf zzj = new zzbqf();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrh(zzdrf zzdrfVar) {
        this.zzd = zzdrf.zzc(zzdrfVar);
        this.zzg = zzdrf.zzg(zzdrfVar);
        this.zzh = zzdrf.zzh(zzdrfVar);
        this.zzi = zzdrf.zzi(zzdrfVar);
        this.zzb = zzdrf.zza(zzdrfVar);
        this.zzc = zzdrf.zzb(zzdrfVar);
        this.zzk = zzdrf.zzf(zzdrfVar);
        this.zzl = zzdrf.zzj(zzdrfVar);
        this.zze = zzdrf.zzd(zzdrfVar);
        this.zzf = zzdrf.zze(zzdrfVar);
    }

    public final synchronized void zzb() {
        zzfsm<zzcml> zzj = zzfsd.zzj(zzcmx.zzb(this.zzd, this.zzi, (String) zzbet.zzc().zzc(zzbjl.zzci), this.zzh, this.zzb), new zzfln(this) { // from class: com.google.android.gms.internal.ads.zzdqu
            private final zzdrh zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzfln
            public final Object apply(Object obj) {
                zzcml zzcmlVar = (zzcml) obj;
                this.zza.zzk(zzcmlVar);
                return zzcmlVar;
            }
        }, this.zzg);
        this.zzm = zzj;
        zzchj.zza(zzj, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzc() {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return;
        }
        zzfsd.zzp(zzfsmVar, new zzdqw(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized zzfsm<JSONObject> zzd(final String str, final JSONObject jSONObject) {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return zzfsd.zza(null);
        }
        return zzfsd.zzi(zzfsmVar, new zzfrk(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzdqv
            private final zzdrh zza;
            private final String zzb;
            private final JSONObject zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
                this.zzc = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzfrk
            public final zzfsm zza(Object obj) {
                return this.zza.zzj(this.zzb, this.zzc, (zzcml) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(String str, zzbpr<Object> zzbprVar) {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return;
        }
        zzfsd.zzp(zzfsmVar, new zzdqx(this, str, zzbprVar), this.zzg);
    }

    public final synchronized void zzf(String str, zzbpr<Object> zzbprVar) {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return;
        }
        zzfsd.zzp(zzfsmVar, new zzdqy(this, str, zzbprVar), this.zzg);
    }

    public final synchronized void zzg(String str, Map<String, ?> map) {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return;
        }
        zzfsd.zzp(zzfsmVar, new zzdqz(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh(zzezz zzezzVar, zzfac zzfacVar) {
        zzfsm<zzcml> zzfsmVar = this.zzm;
        if (zzfsmVar == null) {
            return;
        }
        zzfsd.zzp(zzfsmVar, new zzdra(this, zzezzVar, zzfacVar), this.zzg);
    }

    public final <T> void zzi(WeakReference<T> weakReference, String str, zzbpr<T> zzbprVar) {
        zze(str, new zzdrg(this, weakReference, str, zzbprVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfsm zzj(String str, JSONObject jSONObject, zzcml zzcmlVar) throws Exception {
        return this.zzj.zzc(zzcmlVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcml zzk(zzcml zzcmlVar) {
        zzcmlVar.zzab("/result", this.zzj);
        zzcnz zzR = zzcmlVar.zzR();
        zzdrb zzdrbVar = this.zza;
        zzR.zzL(null, zzdrbVar, zzdrbVar, zzdrbVar, zzdrbVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null);
        return zzcmlVar;
    }
}
