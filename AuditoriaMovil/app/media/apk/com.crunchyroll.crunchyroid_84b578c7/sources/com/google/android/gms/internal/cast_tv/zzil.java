package com.google.android.gms.internal.cast_tv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzil extends zzip {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzil(zzik zzikVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.cast_tv.zzip
    public final void zza(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzko.zzf(obj, j);
        if (list instanceof zzij) {
            unmodifiableList = ((zzij) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzjj) && (list instanceof zzib)) {
                zzib zzibVar = (zzib) list;
                if (zzibVar.zzc()) {
                    zzibVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzko.zzs(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast_tv.zzip
    public final void zzb(Object obj, Object obj2, long j) {
        zzii zziiVar;
        List list = (List) zzko.zzf(obj2, j);
        int size = list.size();
        List list2 = (List) zzko.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzij) {
                list2 = new zzii(size);
            } else if ((list2 instanceof zzjj) && (list2 instanceof zzib)) {
                list2 = ((zzib) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzko.zzs(obj, j, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzko.zzs(obj, j, arrayList);
                zziiVar = arrayList;
            } else if (list2 instanceof zzkj) {
                zzii zziiVar2 = new zzii(list2.size() + size);
                zziiVar2.addAll(zziiVar2.size(), (zzkj) list2);
                zzko.zzs(obj, j, zziiVar2);
                zziiVar = zziiVar2;
            } else if ((list2 instanceof zzjj) && (list2 instanceof zzib)) {
                zzib zzibVar = (zzib) list2;
                if (!zzibVar.zzc()) {
                    list2 = zzibVar.zzd(list2.size() + size);
                    zzko.zzs(obj, j, list2);
                }
            }
            list2 = zziiVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzko.zzs(obj, j, list);
    }

    private zzil() {
        super(null);
    }
}
