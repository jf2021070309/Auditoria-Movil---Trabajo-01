package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzkx {
    public static final int zza(int i2, Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        zzkv zzkvVar = (zzkv) obj2;
        if (zzkwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzkwVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        zzkw zzkwVar2 = (zzkw) obj2;
        if (!zzkwVar2.isEmpty()) {
            if (!zzkwVar.zze()) {
                zzkwVar = zzkwVar.zzb();
            }
            zzkwVar.zzd(zzkwVar2);
        }
        return zzkwVar;
    }
}
