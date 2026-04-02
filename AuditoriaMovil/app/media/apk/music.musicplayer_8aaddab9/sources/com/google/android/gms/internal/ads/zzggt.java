package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzggt extends zzggw {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzggt() {
        super(null);
    }

    public /* synthetic */ zzggt(zzggv zzggvVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zzf(Object obj, long j2, int i2) {
        zzggr zzggrVar;
        List<L> list = (List) zzgiy.zzn(obj, j2);
        if (list.isEmpty()) {
            List<L> zzggrVar2 = list instanceof zzggs ? new zzggr(i2) : ((list instanceof zzghp) && (list instanceof zzggj)) ? ((zzggj) list).zze(i2) : new ArrayList<>(i2);
            zzgiy.zzo(obj, j2, zzggrVar2);
            return zzggrVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i2);
            arrayList.addAll(list);
            zzgiy.zzo(obj, j2, arrayList);
            zzggrVar = arrayList;
        } else if (!(list instanceof zzgit)) {
            if ((list instanceof zzghp) && (list instanceof zzggj)) {
                zzggj zzggjVar = (zzggj) list;
                if (zzggjVar.zza()) {
                    return list;
                }
                zzggj zze = zzggjVar.zze(list.size() + i2);
                zzgiy.zzo(obj, j2, zze);
                return zze;
            }
            return list;
        } else {
            zzggr zzggrVar3 = new zzggr(list.size() + i2);
            zzggrVar3.addAll(zzggrVar3.size(), (zzgit) list);
            zzgiy.zzo(obj, j2, zzggrVar3);
            zzggrVar = zzggrVar3;
        }
        return zzggrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final <L> List<L> zza(Object obj, long j2) {
        return zzf(obj, j2, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final void zzb(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzgiy.zzn(obj, j2);
        if (list instanceof zzggs) {
            unmodifiableList = ((zzggs) list).zzi();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzghp) && (list instanceof zzggj)) {
                zzggj zzggjVar = (zzggj) list;
                if (zzggjVar.zza()) {
                    zzggjVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgiy.zzo(obj, j2, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.zzggw
    public final <E> void zzc(Object obj, Object obj2, long j2) {
        List list = (List) zzgiy.zzn(obj2, j2);
        List zzf = zzf(obj, j2, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgiy.zzo(obj, j2, list);
    }
}
