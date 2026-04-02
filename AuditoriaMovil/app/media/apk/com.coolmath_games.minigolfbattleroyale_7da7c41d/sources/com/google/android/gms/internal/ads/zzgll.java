package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgll<T> implements zzgla<Set<T>> {
    private static final zzgla<Set<Object>> zza = zzglb.zza(Collections.emptySet());
    private final List<zzgln<T>> zzb;
    private final List<zzgln<Collection<T>>> zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgll(List list, List list2, zzglj zzgljVar) {
        this.zzb = list;
        this.zzc = list2;
    }

    public static <T> zzglk<T> zza(int i, int i2) {
        return new zzglk<>(i, i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgln
    /* renamed from: zzc */
    public final Set<T> zzb() {
        int size = this.zzb.size();
        ArrayList arrayList = new ArrayList(this.zzc.size());
        int size2 = this.zzc.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> zzb = this.zzc.get(i).zzb();
            size += zzb.size();
            arrayList.add(zzb);
        }
        HashSet zzb2 = zzgkx.zzb(size);
        int size3 = this.zzb.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T zzb3 = this.zzb.get(i2).zzb();
            if (zzb3 == null) {
                throw null;
            }
            zzb2.add(zzb3);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                if (obj != null) {
                    zzb2.add(obj);
                } else {
                    throw null;
                }
            }
        }
        return Collections.unmodifiableSet(zzb2);
    }
}
