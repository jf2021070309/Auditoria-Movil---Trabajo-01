package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzafu {
    public static final int zza(int i, Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        zzafs zzafsVar = (zzafs) obj2;
        if (!zzaftVar.isEmpty()) {
            Iterator it = zzaftVar.entrySet().iterator();
            if (!it.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        if (!((zzaft) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaft zzaftVar = (zzaft) obj;
        zzaft zzaftVar2 = (zzaft) obj2;
        if (!zzaftVar2.isEmpty()) {
            if (!zzaftVar.zze()) {
                zzaftVar = zzaftVar.zzb();
            }
            zzaftVar.zzd(zzaftVar2);
        }
        return zzaftVar;
    }
}
