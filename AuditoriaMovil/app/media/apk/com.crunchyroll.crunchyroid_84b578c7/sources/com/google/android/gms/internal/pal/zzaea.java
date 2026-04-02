package com.google.android.gms.internal.pal;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaea {
    public static final int zza(int i, Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        zzady zzadyVar = (zzady) obj2;
        if (!zzadzVar.isEmpty()) {
            Iterator it = zzadzVar.entrySet().iterator();
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
        if (!((zzadz) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        zzadz zzadzVar2 = (zzadz) obj2;
        if (!zzadzVar2.isEmpty()) {
            if (!zzadzVar.zze()) {
                zzadzVar = zzadzVar.zzb();
            }
            zzadzVar.zzd(zzadzVar2);
        }
        return zzadzVar;
    }
}
