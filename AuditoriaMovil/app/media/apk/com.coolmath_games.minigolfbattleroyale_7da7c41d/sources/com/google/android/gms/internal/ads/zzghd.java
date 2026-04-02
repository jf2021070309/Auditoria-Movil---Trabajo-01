package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzghd {
    public static final int zza(int i, Object obj, Object obj2) {
        zzghc zzghcVar = (zzghc) obj;
        zzghb zzghbVar = (zzghb) obj2;
        if (zzghcVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzghcVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzghc) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzghc zzghcVar = (zzghc) obj;
        zzghc zzghcVar2 = (zzghc) obj2;
        if (!zzghcVar2.isEmpty()) {
            if (!zzghcVar.zze()) {
                zzghcVar = zzghcVar.zzc();
            }
            zzghcVar.zzb(zzghcVar2);
        }
        return zzghcVar;
    }
}
