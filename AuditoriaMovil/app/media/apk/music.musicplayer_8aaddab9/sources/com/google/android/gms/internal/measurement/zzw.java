package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzw extends zzai {
    public final Map<String, zzai> zza;
    private final zzj zzb;

    public zzw(zzj zzjVar) {
        super("require");
        this.zza = new HashMap();
        this.zzb = zzjVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List<zzap> list) {
        zzai zzaiVar;
        zzh.zzh("require", 1, list);
        String zzi = zzgVar.zzb(list.get(0)).zzi();
        if (this.zza.containsKey(zzi)) {
            return this.zza.get(zzi);
        }
        zzj zzjVar = this.zzb;
        if (zzjVar.zza.containsKey(zzi)) {
            try {
                zzaiVar = zzjVar.zza.get(zzi).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(zzi);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            zzaiVar = zzap.zzf;
        }
        if (zzaiVar instanceof zzai) {
            this.zza.put(zzi, (zzai) zzaiVar);
        }
        return zzaiVar;
    }
}
