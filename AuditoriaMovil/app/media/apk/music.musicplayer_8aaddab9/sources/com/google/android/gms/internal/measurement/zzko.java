package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class zzko extends zzkq {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzko() {
        super(null);
    }

    public /* synthetic */ zzko(zzkn zzknVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final void zza(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzml.zzf(obj, j2);
        if (list instanceof zzkm) {
            unmodifiableList = ((zzkm) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzlj) && (list instanceof zzke)) {
                zzke zzkeVar = (zzke) list;
                if (zzkeVar.zzc()) {
                    zzkeVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzml.zzs(obj, j2, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq
    public final <E> void zzb(Object obj, Object obj2, long j2) {
        ArrayList arrayList;
        List list = (List) zzml.zzf(obj2, j2);
        int size = list.size();
        List list2 = (List) zzml.zzf(obj, j2);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzkm ? new zzkl(size) : ((list2 instanceof zzlj) && (list2 instanceof zzke)) ? ((zzke) list2).zzd(size) : new ArrayList(size);
            zzml.zzs(obj, j2, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                zzml.zzs(obj, j2, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof zzmg) {
                zzkl zzklVar = new zzkl(list2.size() + size);
                zzklVar.addAll(zzklVar.size(), (zzmg) list2);
                zzml.zzs(obj, j2, zzklVar);
                arrayList = zzklVar;
            } else if ((list2 instanceof zzlj) && (list2 instanceof zzke)) {
                zzke zzkeVar = (zzke) list2;
                if (!zzkeVar.zzc()) {
                    list2 = zzkeVar.zzd(list2.size() + size);
                    zzml.zzs(obj, j2, list2);
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
        zzml.zzs(obj, j2, list);
    }
}
