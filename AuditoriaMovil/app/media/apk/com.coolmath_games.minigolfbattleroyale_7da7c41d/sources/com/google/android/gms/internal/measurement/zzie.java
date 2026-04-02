package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
final class zzie<T> implements Serializable, zzib {
    @NullableDecl
    final T zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzie(@NullableDecl T t) {
        this.zza = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
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
        String valueOf = String.valueOf(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    public final T zza() {
        return this.zza;
    }
}
