package com.google.android.gms.internal.cast_tv;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzix {
    public static final int zza(int i, Object obj, Object obj2) {
        zziw zziwVar = (zziw) obj;
        zziv zzivVar = (zziv) obj2;
        int i2 = 0;
        if (!zziwVar.isEmpty()) {
            for (Map.Entry entry : zziwVar.entrySet()) {
                i2 += zzivVar.zza(i, entry.getKey(), entry.getValue());
            }
        }
        return i2;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zziw zziwVar = (zziw) obj;
        zziw zziwVar2 = (zziw) obj2;
        if (!zziwVar2.isEmpty()) {
            if (!zziwVar.zze()) {
                zziwVar = zziwVar.zzb();
            }
            zziwVar.zzd(zziwVar2);
        }
        return zziwVar;
    }
}
