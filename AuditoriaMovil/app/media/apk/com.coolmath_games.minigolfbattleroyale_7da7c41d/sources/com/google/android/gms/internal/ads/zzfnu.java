package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnu<T> extends zzfpw<T> implements Serializable {
    final Comparator<T> zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnu(Comparator<T> comparator) {
        if (comparator == null) {
            throw null;
        }
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.Comparator
    public final int compare(T t, T t2) {
        return this.zza.compare(t, t2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnu) {
            return this.zza.equals(((zzfnu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
