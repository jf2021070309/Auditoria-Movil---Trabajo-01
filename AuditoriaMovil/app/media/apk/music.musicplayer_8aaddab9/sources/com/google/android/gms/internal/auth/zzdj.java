package com.google.android.gms.internal.auth;

import e.a.d.a.a;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzdj<T> implements Serializable, zzdg {
    public final T zza;

    public zzdj(T t) {
        this.zza = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzdj) {
            T t = this.zza;
            T t2 = ((zzdj) obj).zza;
            return t == t2 || t.equals(t2);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return a.s(new StringBuilder(valueOf.length() + 22), "Suppliers.ofInstance(", valueOf, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdg
    public final T zza() {
        return this.zza;
    }
}
