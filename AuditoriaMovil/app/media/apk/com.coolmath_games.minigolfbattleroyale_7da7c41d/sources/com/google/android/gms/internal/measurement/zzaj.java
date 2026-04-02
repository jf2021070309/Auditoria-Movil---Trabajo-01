package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List<zzap> list) {
        if (zzalVar.zzj(zzapVar.zzc())) {
            zzap zzk = zzalVar.zzk(zzapVar.zzc());
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzapVar.zzc()));
        } else if ("hasOwnProperty".equals(zzapVar.zzc())) {
            zzh.zza("hasOwnProperty", 1, list);
            return zzalVar.zzj(zzgVar.zza(list.get(0)).zzc()) ? zzap.zzk : zzap.zzl;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", zzapVar.zzc()));
        }
    }

    public static Iterator<zzap> zzb(Map<String, zzap> map) {
        return new zzak(map.keySet().iterator());
    }
}
