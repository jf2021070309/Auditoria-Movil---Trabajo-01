package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzggt extends zzggw {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzggt() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzggt(zzggv zzggvVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zzf(Object obj, long j, int i) {
        zzggr zzggrVar;
        List<L> arrayList;
        List<L> list = (List) zzgiy.zzn(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzggs) {
                arrayList = new zzggr(i);
            } else if (!(list instanceof zzghp) || !(list instanceof zzggj)) {
                arrayList = new ArrayList<>(i);
            } else {
                arrayList = ((zzggj) list).zze(i);
            }
            zzgiy.zzo(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzgiy.zzo(obj, j, arrayList2);
            zzggrVar = arrayList2;
        } else if (list instanceof zzgit) {
            zzggr zzggrVar2 = new zzggr(list.size() + i);
            zzggrVar2.addAll(zzggrVar2.size(), (zzgit) list);
            zzgiy.zzo(obj, j, zzggrVar2);
            zzggrVar = zzggrVar2;
        } else if ((list instanceof zzghp) && (list instanceof zzggj)) {
            zzggj zzggjVar = (zzggj) list;
            if (zzggjVar.zza()) {
                return list;
            }
            zzggj zze = zzggjVar.zze(list.size() + i);
            zzgiy.zzo(obj, j, zze);
            return zze;
        } else {
            return list;
        }
        return zzggrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final <L> List<L> zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzgiy.zzn(obj, j);
        if (list instanceof zzggs) {
            unmodifiableList = ((zzggs) list).zzi();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzghp) || !(list instanceof zzggj)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzggj zzggjVar = (zzggj) list;
                if (zzggjVar.zza()) {
                    zzggjVar.zzb();
                    return;
                }
                return;
            }
        }
        zzgiy.zzo(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzggw
    public final <E> void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzgiy.zzn(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgiy.zzo(obj, j, list);
    }
}
