package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzact {
    private final Class zza;
    private final Type zzb;
    private final int zzc;

    public zzact() {
        Type genericSuperclass = zzact.class.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            if (genericSuperclass == zzact.class) {
                throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
            }
        } else {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == zzact.class) {
                this.zzb = zzxr.zzc(parameterizedType.getActualTypeArguments()[0]);
                throw null;
            }
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static zzact zza(Class cls) {
        return new zzact(cls);
    }

    public static zzact zzb(Type type) {
        return new zzact(type);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof zzact) && zzxr.zzg(this.zzb, ((zzact) obj).zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzc;
    }

    public final String toString() {
        return zzxr.zzb(this.zzb);
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Type zzd() {
        return this.zzb;
    }

    private zzact(Type type) {
        type.getClass();
        Type zzc = zzxr.zzc(type);
        this.zzb = zzc;
        this.zza = zzxr.zza(zzc);
        this.zzc = zzc.hashCode();
    }
}
