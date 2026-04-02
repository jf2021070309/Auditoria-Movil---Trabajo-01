package com.google.android.gms.internal.pal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzadr extends zzadt {
    public /* synthetic */ zzadr(zzadq zzadqVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final List zza(Object obj, long j) {
        int i;
        zzadf zzadfVar = (zzadf) zzafs.zzf(obj, j);
        if (!zzadfVar.zzc()) {
            int size = zzadfVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzadf zzd = zzadfVar.zzd(i);
            zzafs.zzs(obj, j, zzd);
            return zzd;
        }
        return zzadfVar;
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzb(Object obj, long j) {
        ((zzadf) zzafs.zzf(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.pal.zzadt
    public final void zzc(Object obj, Object obj2, long j) {
        zzadf zzadfVar = (zzadf) zzafs.zzf(obj, j);
        zzadf zzadfVar2 = (zzadf) zzafs.zzf(obj2, j);
        int size = zzadfVar.size();
        int size2 = zzadfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzadfVar.zzc()) {
                zzadfVar = zzadfVar.zzd(size2 + size);
            }
            zzadfVar.addAll(zzadfVar2);
        }
        if (size > 0) {
            zzadfVar2 = zzadfVar;
        }
        zzafs.zzs(obj, j, zzadfVar2);
    }

    private zzadr() {
        super(null);
    }
}
