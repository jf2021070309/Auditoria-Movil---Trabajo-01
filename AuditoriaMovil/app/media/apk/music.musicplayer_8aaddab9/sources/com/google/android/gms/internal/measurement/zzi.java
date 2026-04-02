package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzi {
    public static zzap zza(zzgt zzgtVar) {
        if (zzgtVar == null) {
            return zzap.zzf;
        }
        int zzj = zzgtVar.zzj() - 1;
        if (zzj == 1) {
            return zzgtVar.zzi() ? new zzat(zzgtVar.zzd()) : zzap.zzm;
        } else if (zzj == 2) {
            return zzgtVar.zzh() ? new zzah(Double.valueOf(zzgtVar.zza())) : new zzah(null);
        } else if (zzj == 3) {
            return zzgtVar.zzg() ? new zzaf(Boolean.valueOf(zzgtVar.zzf())) : new zzaf(null);
        } else if (zzj == 4) {
            List<zzgt> zze = zzgtVar.zze();
            ArrayList arrayList = new ArrayList();
            for (zzgt zzgtVar2 : zze) {
                arrayList.add(zza(zzgtVar2));
            }
            return new zzaq(zzgtVar.zzc(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static zzap zzb(Object obj) {
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
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                zzae zzaeVar = new zzae();
                for (Object obj2 : (List) obj) {
                    zzaeVar.zzq(zzaeVar.zzc(), zzb(obj2));
                }
                return zzaeVar;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        zzam zzamVar = new zzam();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            zzap zzb = zzb(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                zzamVar.zzr((String) obj3, zzb);
            }
        }
        return zzamVar;
    }
}
