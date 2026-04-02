package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* loaded from: classes.dex */
public final class zzghq {
    private static final zzghq zza = new zzghq();
    private final ConcurrentMap<Class<?>, zzghz<?>> zzc = new ConcurrentHashMap();
    private final zzgia zzb = new zzgha();

    private zzghq() {
    }

    public static zzghq zza() {
        return zza;
    }

    public final <T> zzghz<T> zzb(Class<T> cls) {
        zzggk.zzb(cls, "messageType");
        zzghz<T> zzghzVar = (zzghz<T>) this.zzc.get(cls);
        if (zzghzVar == null) {
            zzghzVar = this.zzb.zza(cls);
            zzggk.zzb(cls, "messageType");
            zzggk.zzb(zzghzVar, "schema");
            zzghz putIfAbsent = this.zzc.putIfAbsent(cls, zzghzVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return zzghzVar;
    }
}
