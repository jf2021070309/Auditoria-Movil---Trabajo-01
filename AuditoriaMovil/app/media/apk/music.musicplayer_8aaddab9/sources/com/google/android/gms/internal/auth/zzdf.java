package com.google.android.gms.internal.auth;

import e.a.d.a.a;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzdf<T> extends zzde<T> {
    private final T zza;

    public zzdf(T t) {
        this.zza = t;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzdf) {
            return this.zza.equals(((zzdf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        return a.s(new StringBuilder(valueOf.length() + 13), "Optional.of(", valueOf, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzde
    public final T zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzde
    public final boolean zzb() {
        return true;
    }
}
