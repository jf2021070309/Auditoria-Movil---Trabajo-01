package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgkz<T> implements zzgln, zzgku {
    private static final Object zza = new Object();
    private volatile zzgln<T> zzb;
    private volatile Object zzc = zza;

    private zzgkz(zzgln<T> zzglnVar) {
        this.zzb = zzglnVar;
    }

    public static <P extends zzgln<T>, T> zzgln<T> zza(P p) {
        if (p != null) {
            return p instanceof zzgkz ? p : new zzgkz(p);
        }
        throw null;
    }

    public static <P extends zzgln<T>, T> zzgku<T> zzc(P p) {
        if (p instanceof zzgku) {
            return (zzgku) p;
        }
        if (p != null) {
            return new zzgkz(p);
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    public final T zzb() {
        T t = (T) this.zzc;
        if (t == zza) {
            synchronized (this) {
                t = this.zzc;
                if (t == zza) {
                    t = this.zzb.zzb();
                    Object obj = this.zzc;
                    if (obj != zza && obj != t) {
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
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
