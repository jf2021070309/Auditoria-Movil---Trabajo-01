package com.google.android.gms.internal.ads;

import java.util.Objects;
/* loaded from: classes.dex */
public final class zzgkz<T> implements zzgln, zzgku {
    private static final Object zza = new Object();
    private volatile zzgln<T> zzb;
    private volatile Object zzc = zza;

    private zzgkz(zzgln<T> zzglnVar) {
        this.zzb = zzglnVar;
    }

    public static <P extends zzgln<T>, T> zzgln<T> zza(P p) {
        Objects.requireNonNull(p);
        return p instanceof zzgkz ? p : new zzgkz(p);
    }

    public static <P extends zzgln<T>, T> zzgku<T> zzc(P p) {
        if (p instanceof zzgku) {
            return (zzgku) p;
        }
        Objects.requireNonNull(p);
        return new zzgkz(p);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        T t = (T) this.zzc;
        Object obj = zza;
        if (t == obj) {
            synchronized (this) {
                t = this.zzc;
                if (t == obj) {
                    t = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzc = t;
                    this.zzb = null;
                }
            }
        }
        return t;
    }
}
