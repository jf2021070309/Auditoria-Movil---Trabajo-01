package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzid<T> implements zzib<T> {
    @CheckForNull
    public volatile zzib<T> zza;
    public volatile boolean zzb;
    @CheckForNull
    public T zzc;

    public zzid(zzib<T> zzibVar) {
        Objects.requireNonNull(zzibVar);
        this.zza = zzibVar;
    }

    public final String toString() {
        Object obj = this.zza;
        if (obj == null) {
            String valueOf = String.valueOf(this.zzc);
            obj = a.s(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        }
        String obj2 = obj.toString();
        return a.s(new StringBuilder(obj2.length() + 19), "Suppliers.memoize(", obj2, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    zzib<T> zzibVar = this.zza;
                    zzibVar.getClass();
                    T zza = zzibVar.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    this.zza = null;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
