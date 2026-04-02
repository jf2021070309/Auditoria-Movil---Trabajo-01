package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfpl extends zzfpp {
    final /* synthetic */ Comparator zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpl(Comparator comparator) {
        this.zza = comparator;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfpp
    public final <K, V> Map<K, Collection<V>> zza() {
        return new TreeMap(this.zza);
    }
}
