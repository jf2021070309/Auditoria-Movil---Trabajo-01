package com.google.android.gms.internal.pal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzaen {
    private static final zzaen zza = new zzaen();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzaes zzb = new zzadx();

    private zzaen() {
    }

    public static zzaen zza() {
        return zza;
    }

    public final zzaer zzb(Class cls) {
        zzadg.zzf(cls, "messageType");
        zzaer zzaerVar = (zzaer) this.zzc.get(cls);
        if (zzaerVar == null) {
            zzaerVar = this.zzb.zza(cls);
            zzadg.zzf(cls, "messageType");
            zzadg.zzf(zzaerVar, "schema");
            zzaer zzaerVar2 = (zzaer) this.zzc.putIfAbsent(cls, zzaerVar);
            if (zzaerVar2 != null) {
                return zzaerVar2;
            }
        }
        return zzaerVar;
    }
}
