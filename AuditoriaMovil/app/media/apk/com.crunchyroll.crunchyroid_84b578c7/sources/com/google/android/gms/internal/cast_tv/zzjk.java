package com.google.android.gms.internal.cast_tv;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzjk {
    private static final zzjk zza = new zzjk();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzjo zzb = new zzit();

    private zzjk() {
    }

    public static zzjk zza() {
        return zza;
    }

    public final zzjn zzb(Class cls) {
        zzic.zzc(cls, "messageType");
        zzjn zzjnVar = (zzjn) this.zzc.get(cls);
        if (zzjnVar == null) {
            zzjnVar = this.zzb.zza(cls);
            zzic.zzc(cls, "messageType");
            zzic.zzc(zzjnVar, "schema");
            zzjn zzjnVar2 = (zzjn) this.zzc.putIfAbsent(cls, zzjnVar);
            if (zzjnVar2 != null) {
                return zzjnVar2;
            }
        }
        return zzjnVar;
    }
}
