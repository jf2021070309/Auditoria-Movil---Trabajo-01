package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfqf<T> extends zzfpw<T> implements Serializable {
    final zzfpw<? super T> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfqf(zzfpw<? super T> zzfpwVar) {
        this.zza = zzfpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.zza.compare(t2, t);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqf) {
            return this.zza.equals(((zzfqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final <S extends T> zzfpw<S> zza() {
        return (zzfpw<? super T>) this.zza;
    }
}
