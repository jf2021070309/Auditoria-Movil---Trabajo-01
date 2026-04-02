package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzafj extends zzafn {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzafj(zzafi zzafiVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzafg zzafgVar;
        List arrayList;
        List list = (List) zzaht.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzafh) {
                arrayList = new zzafg(i);
            } else if ((list instanceof zzagg) && (list instanceof zzaez)) {
                arrayList = ((zzaez) list).zzd(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzaht.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzaht.zzs(obj, j, arrayList2);
            zzafgVar = arrayList2;
        } else if (list instanceof zzaho) {
            zzafg zzafgVar2 = new zzafg(list.size() + i);
            zzafgVar2.addAll(zzafgVar2.size(), (zzaho) list);
            zzaht.zzs(obj, j, zzafgVar2);
            zzafgVar = zzafgVar2;
        } else if ((list instanceof zzagg) && (list instanceof zzaez)) {
            zzaez zzaezVar = (zzaez) list;
            if (!zzaezVar.zzc()) {
                zzaez zzd = zzaezVar.zzd(list.size() + i);
                zzaht.zzs(obj, j, zzd);
                return zzd;
            }
            return list;
        } else {
            return list;
        }
        return zzafgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzaht.zzf(obj, j);
        if (list instanceof zzafh) {
            unmodifiableList = ((zzafh) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzagg) && (list instanceof zzaez)) {
                zzaez zzaezVar = (zzaez) list;
                if (zzaezVar.zzc()) {
                    zzaezVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzaht.zzs(obj, j, unmodifiableList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzaht.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzaht.zzs(obj, j, list);
    }

    private zzafj() {
        super(null);
    }
}
