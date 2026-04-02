package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzdtc {
    private final Map<String, zzdtb> zza = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(String str, zzfbi zzfbiVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtb(str, zzfbiVar.zzz(), zzfbiVar.zzA()));
        } catch (zzfaw unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzb(String str, zzbxn zzbxnVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdtb(str, zzbxnVar.zzf(), zzbxnVar.zzg()));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final synchronized zzdtb zzc(String str) {
        return this.zza.get(str);
    }

    @Nullable
    public final zzdtb zzd(List<String> list) {
        for (String str : list) {
            zzdtb zzc = zzc(str);
            if (zzc != null) {
                return zzc;
            }
        }
        return null;
    }
}
