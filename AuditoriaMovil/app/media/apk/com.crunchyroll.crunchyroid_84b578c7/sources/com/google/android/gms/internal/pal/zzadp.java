package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzadp extends zzadt {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public /* synthetic */ zzadp(zzado zzadoVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzadm zzadmVar;
        List arrayList;
        List list = (List) zzafs.zzf(obj, j);
        if (list.isEmpty()) {
            if (list instanceof zzadn) {
                arrayList = new zzadm(i);
            } else if ((list instanceof zzaem) && (list instanceof zzadf)) {
                arrayList = ((zzadf) list).zzd(i);
            } else {
                arrayList = new ArrayList(i);
            }
            zzafs.zzs(obj, j, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i);
            arrayList2.addAll(list);
            zzafs.zzs(obj, j, arrayList2);
            zzadmVar = arrayList2;
        } else if (list instanceof zzafn) {
            zzadm zzadmVar2 = new zzadm(list.size() + i);
            zzadmVar2.addAll(zzadmVar2.size(), (zzafn) list);
            zzafs.zzs(obj, j, zzadmVar2);
            zzadmVar = zzadmVar2;
        } else if ((list instanceof zzaem) && (list instanceof zzadf)) {
            zzadf zzadfVar = (zzadf) list;
            if (!zzadfVar.zzc()) {
                zzadf zzd = zzadfVar.zzd(list.size() + i);
                zzafs.zzs(obj, j, zzd);
                return zzd;
            }
            return list;
        } else {
            return list;
        }
        return zzadmVar;
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzafs.zzf(obj, j);
        if (list instanceof zzadn) {
            unmodifiableList = ((zzadn) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzaem) && (list instanceof zzadf)) {
                zzadf zzadfVar = (zzadf) list;
                if (zzadfVar.zzc()) {
                    zzadfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzafs.zzs(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzafs.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzafs.zzs(obj, j, list);
    }

    private zzadp() {
        super(null);
    }
}
