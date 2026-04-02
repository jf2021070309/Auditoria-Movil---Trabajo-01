package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzia<T> extends zzhz<T> {
    private final T zza;

    public zzia(T t) {
        this.zza = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzia) {
            return this.zza.equals(((zzia) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return a.s(new StringBuilder(obj.length() + 13), "Optional.of(", obj, ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final T zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final boolean zzb() {
        return true;
    }
}
