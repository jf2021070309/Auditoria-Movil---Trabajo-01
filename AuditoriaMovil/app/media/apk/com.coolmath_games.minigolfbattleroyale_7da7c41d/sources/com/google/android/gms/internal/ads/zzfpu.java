package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfpu extends zzfpw<Comparable<?>> implements Serializable {
    static final zzfpu zza = new zzfpu();

    private zzfpu() {
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable != null) {
            if (comparable2 != null) {
                return comparable.compareTo(comparable2);
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final <S extends Comparable> zzfpw<S> zza() {
        return zzfqe.zza;
    }
}
