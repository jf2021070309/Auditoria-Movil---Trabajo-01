package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzlq {
    private static final zzlq zza = new zzlq();
    private final ConcurrentMap<Class<?>, zzlt<?>> zzc = new ConcurrentHashMap();
    private final zzlu zzb = new zzla();

    private zzlq() {
    }

    public static zzlq zza() {
        return zza;
    }

    public final <T> zzlt<T> zzb(Class<T> cls) {
        zzkl.zzb(cls, "messageType");
        zzlt<T> zzltVar = (zzlt<T>) this.zzc.get(cls);
        if (zzltVar == null) {
            zzltVar = this.zzb.zza(cls);
            zzkl.zzb(cls, "messageType");
            zzkl.zzb(zzltVar, "schema");
            zzlt putIfAbsent = this.zzc.putIfAbsent(cls, zzltVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzltVar;
    }
}
