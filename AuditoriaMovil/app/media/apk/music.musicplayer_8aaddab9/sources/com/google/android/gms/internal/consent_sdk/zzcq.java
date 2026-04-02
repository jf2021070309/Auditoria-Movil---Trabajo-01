package com.google.android.gms.internal.consent_sdk;
/* loaded from: classes.dex */
public final class zzcq<T> implements zzct<T> {
    private static final Object zza = new Object();
    private volatile zzct<T> zzb;
    private volatile Object zzc = zza;

    private zzcq(zzct<T> zzctVar) {
        this.zzb = zzctVar;
    }

    public static <P extends zzct<T>, T> zzct<T> zza(P p) {
        zzcu.zza(p);
        return p instanceof zzcq ? p : new zzcq(p);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzct
    public final T zza() {
        T t = (T) this.zzc;
        Object obj = zza;
        if (t == obj) {
            synchronized (this) {
                t = this.zzc;
                if (t == obj) {
                    t = this.zzb.zza();
                    Object obj2 = this.zzc;
                    if (((obj2 == obj || (obj2 instanceof zzcr)) ? false : true) && obj2 != t) {
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
