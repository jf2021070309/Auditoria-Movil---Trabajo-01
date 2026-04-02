package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes.dex */
public final class zzglm<T> implements zzgln<T> {
    private static final Object zza = new Object();
    private volatile zzgln<T> zzb;
    private volatile Object zzc = zza;

    private zzglm(zzgln<T> zzglnVar) {
        this.zzb = zzglnVar;
    }

    public static <P extends zzgln<T>, T> zzgln<T> zza(P p) {
        if ((p instanceof zzglm) || (p instanceof zzgkz)) {
            return p;
        }
        Objects.requireNonNull(p);
        return new zzglm(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        T t = (T) this.zzc;
        if (t == zza) {
            zzgln<T> zzglnVar = this.zzb;
            if (zzglnVar == null) {
                return (T) this.zzc;
            }
            T zzb = zzglnVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return t;
    }
}
