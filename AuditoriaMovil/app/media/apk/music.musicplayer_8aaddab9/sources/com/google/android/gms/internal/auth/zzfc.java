package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class zzfc extends zzfe {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzfc() {
        super(null);
    }

    public /* synthetic */ zzfc(zzfb zzfbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final void zza(Object obj, long j2) {
        Object unmodifiableList;
        List list = (List) zzgz.zzf(obj, j2);
        if (list instanceof zzfa) {
            unmodifiableList = ((zzfa) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzfx) && (list instanceof zzeu)) {
                zzeu zzeuVar = (zzeu) list;
                if (zzeuVar.zzc()) {
                    zzeuVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgz.zzp(obj, j2, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final <E> void zzb(Object obj, Object obj2, long j2) {
        ArrayList arrayList;
        List list = (List) zzgz.zzf(obj2, j2);
        int size = list.size();
        List list2 = (List) zzgz.zzf(obj, j2);
        if (list2.isEmpty()) {
            list2 = list2 instanceof zzfa ? new zzez(size) : ((list2 instanceof zzfx) && (list2 instanceof zzeu)) ? ((zzeu) list2).zzd(size) : new ArrayList(size);
            zzgz.zzp(obj, j2, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList2 = new ArrayList(list2.size() + size);
                arrayList2.addAll(list2);
                zzgz.zzp(obj, j2, arrayList2);
                arrayList = arrayList2;
            } else if (list2 instanceof zzgu) {
                zzez zzezVar = new zzez(list2.size() + size);
                zzezVar.addAll(zzezVar.size(), (zzgu) list2);
                zzgz.zzp(obj, j2, zzezVar);
                arrayList = zzezVar;
            } else if ((list2 instanceof zzfx) && (list2 instanceof zzeu)) {
                zzeu zzeuVar = (zzeu) list2;
                if (!zzeuVar.zzc()) {
                    list2 = zzeuVar.zzd(list2.size() + size);
                    zzgz.zzp(obj, j2, list2);
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
        zzgz.zzp(obj, j2, list);
    }
}
