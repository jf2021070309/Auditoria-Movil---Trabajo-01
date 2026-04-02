package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zzku extends zzkw {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzku() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzku(zzkt zzktVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkw
    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzmr.zzn(obj, j);
        if (list instanceof zzks) {
            unmodifiableList = ((zzks) list).zzi();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof zzlp) || !(list instanceof zzkk)) {
                unmodifiableList = Collections.unmodifiableList(list);
            } else {
                zzkk zzkkVar = (zzkk) list;
                if (zzkkVar.zza()) {
                    zzkkVar.zzb();
                    return;
                }
                return;
            }
        }
        zzmr.zzo(obj, j, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkw
    public final <E> void zzb(Object obj, Object obj2, long j) {
        ArrayList arrayList;
        List list = (List) zzmr.zzn(obj2, j);
        int size = list.size();
        List list2 = (List) zzmr.zzn(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzks) {
                list2 = new zzkr(size);
            } else if (!(list2 instanceof zzlp) || !(list2 instanceof zzkk)) {
                list2 = new ArrayList(size);
            } else {
                list2 = ((zzkk) list2).zze(size);
            }
            zzmr.zzo(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                zzmr.zzo(obj, j, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof zzmm) {
                zzkr zzkrVar = new zzkr(list2.size() + size);
                zzkrVar.addAll(zzkrVar.size(), (zzmm) list2);
                zzmr.zzo(obj, j, zzkrVar);
                arrayList = zzkrVar;
            } else if ((list2 instanceof zzlp) && (list2 instanceof zzkk)) {
                zzkk zzkkVar = (zzkk) list2;
                if (!zzkkVar.zza()) {
                    list2 = zzkkVar.zze(list2.size() + size);
                    zzmr.zzo(obj, j, list2);
                }
            }
            list2 = arrayList;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzmr.zzo(obj, j, list);
    }
}
