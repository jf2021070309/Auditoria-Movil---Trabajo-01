package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzie<T> implements Serializable, zzib {
    public final T zza;

    public zzie(T t) {
        this.zza = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzie) {
            T t = this.zza;
            T t2 = ((zzie) obj).zza;
            return t == t2 || t.equals(t2);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        String obj = this.zza.toString();
        return a.s(new StringBuilder(obj.length() + 22), "Suppliers.ofInstance(", obj, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        return this.zza;
    }
}
