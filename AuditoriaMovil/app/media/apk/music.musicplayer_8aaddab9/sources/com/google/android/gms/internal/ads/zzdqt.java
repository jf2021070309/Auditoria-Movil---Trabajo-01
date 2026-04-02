package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzdqt implements zzbpr<Object> {
    private final zzbnl zza;
    private final zzdrh zzb;
    private final zzgku<zzdqp> zzc;

    public zzdqt(zzdmx zzdmxVar, zzdmm zzdmmVar, zzdrh zzdrhVar, zzgku<zzdqp> zzgkuVar) {
        this.zza = zzdmxVar.zzg(zzdmmVar.zzQ());
        this.zzb = zzdrhVar;
        this.zzc = zzgkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zza.zze(this.zzc.zzb(), str);
        } catch (RemoteException e2) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            zzcgt.zzj(sb.toString(), e2);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zze("/nativeAdCustomClick", this);
    }
}
