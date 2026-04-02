package com.google.android.gms.internal.ads;

import java.io.Serializable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfqe extends zzfpw<Comparable<?>> implements Serializable {
    static final zzfqe zza = new zzfqe();

    private zzfqe() {
    }

    @Override // com.google.android.gms.internal.ads.zzfpw, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        if (comparable != null) {
            if (comparable == comparable2) {
                return 0;
            }
            return comparable2.compareTo(comparable);
        }
        throw null;
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfpw
    public final <S extends Comparable> zzfpw<S> zza() {
        return zzfpu.zza;
    }
}
