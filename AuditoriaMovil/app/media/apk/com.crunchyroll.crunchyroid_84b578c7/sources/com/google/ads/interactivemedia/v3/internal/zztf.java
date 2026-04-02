package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztf extends zzth implements Serializable {
    static final zztf zza = new zztf();

    private zztf() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzth
    public final zzth zza() {
        return zztq.zza;
    }
}
