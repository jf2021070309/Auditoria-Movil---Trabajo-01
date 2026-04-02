package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztr extends zzth implements Serializable {
    final zzth zza;

    public zztr(zzth zzthVar) {
        this.zza = zzthVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztr) {
            return this.zza.equals(((zztr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth
    public final zzth zza() {
        return this.zza;
    }
}
