package com.google.android.gms.internal.auth;

import e.a.d.a.a;
import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzdh<T> implements Serializable, zzdg {
    public final zzdg<T> zza;
    public volatile transient boolean zzb;
    @CheckForNull
    public transient T zzc;

    public zzdh(zzdg<T> zzdgVar) {
        Objects.requireNonNull(zzdgVar);
        this.zza = zzdgVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            String valueOf = String.valueOf(this.zzc);
            obj = a.s(new StringBuilder(valueOf.length() + 25), "<supplier that returned ", valueOf, ">");
        } else {
            obj = this.zza;
        }
        String valueOf2 = String.valueOf(obj);
        return a.s(new StringBuilder(valueOf2.length() + 19), "Suppliers.memoize(", valueOf2, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdg
    public final T zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    T zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
