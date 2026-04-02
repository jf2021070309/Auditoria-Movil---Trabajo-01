package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
/* loaded from: classes.dex */
public final class zzdxx {
    private final zzdxk zza;
    private final zzdtc zzb;
    private final Object zzc = new Object();
    private final List<zzdxw> zzd = new ArrayList();
    private boolean zze;

    public zzdxx(zzdxk zzdxkVar, zzdtc zzdtcVar) {
        this.zza = zzdxkVar;
        this.zzb = zzdtcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List<zzbrl> list) {
        String zzbyaVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            for (zzbrl zzbrlVar : list) {
                List<zzdxw> list2 = this.zzd;
                String str = zzbrlVar.zza;
                zzdtb zzc = this.zzb.zzc(str);
                if (zzc == null) {
                    zzbyaVar = "";
                } else {
                    zzbya zzbyaVar2 = zzc.zzb;
                    zzbyaVar = zzbyaVar2 == null ? "" : zzbyaVar2.toString();
                }
                String str2 = zzbyaVar;
                list2.add(new zzdxw(str, str2, zzbrlVar.zzb ? 1 : 0, zzbrlVar.zzd, zzbrlVar.zzc));
            }
            this.zze = true;
        }
    }

    public final void zza() {
        this.zza.zzh(new zzdxv(this));
    }

    public final JSONArray zzb() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (!this.zza.zzm()) {
                    zza();
                    return jSONArray;
                }
                zzd(this.zza.zzj());
            }
            for (zzdxw zzdxwVar : this.zzd) {
                jSONArray.put(zzdxwVar.zza());
            }
            return jSONArray;
        }
    }
}
