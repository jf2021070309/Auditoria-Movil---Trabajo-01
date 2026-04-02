package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzi {
    public static zzap zza(Object obj) {
        if (obj == null) {
            return zzap.zzg;
        }
        if (obj instanceof String) {
            return new zzat((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static zzap zzb(zzgt zzgtVar) {
        if (zzgtVar == null) {
            return zzap.zzf;
        }
        zzgs zzgsVar = zzgs.UNKNOWN;
        int ordinal = zzgtVar.zza().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (zzgtVar.zzd()) {
                    return new zzat(zzgtVar.zze());
                }
                return zzap.zzm;
            } else if (ordinal == 2) {
                if (zzgtVar.zzh()) {
                    return new zzah(Double.valueOf(zzgtVar.zzi()));
                }
                return new zzah(null);
            } else if (ordinal == 3) {
                if (zzgtVar.zzf()) {
                    return new zzaf(Boolean.valueOf(zzgtVar.zzg()));
                }
                return new zzaf(null);
            } else if (ordinal == 4) {
                List<zzgt> zzb = zzgtVar.zzb();
                ArrayList arrayList = new ArrayList();
                for (zzgt zzgtVar2 : zzb) {
                    arrayList.add(zzb(zzgtVar2));
                }
                return new zzaq(zzgtVar.zzc(), arrayList);
            } else {
                String valueOf = String.valueOf(zzgtVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                sb.append("Invalid entity: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
    }
}
