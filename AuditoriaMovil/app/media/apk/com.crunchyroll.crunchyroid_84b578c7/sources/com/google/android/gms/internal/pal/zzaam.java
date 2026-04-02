package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzaam extends zzzg {
    private static final zzyy zze(zzabc zzabcVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        zzabcVar.zzi();
                        return zzza.zza;
                    }
                    zzabd.zza(i);
                    throw new IllegalStateException("Unexpected token: ".concat(zzabd.zza(i)));
                }
                return new zzzd(Boolean.valueOf(zzabcVar.zzk()));
            }
            return new zzzd(new zzzj(zzabcVar.zzd()));
        }
        return new zzzd(zzabcVar.zzd());
    }

    private static final zzyy zzf(zzabc zzabcVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                return null;
            }
            zzabcVar.zzf();
            return new zzzb();
        }
        zzabcVar.zze();
        return new zzyx();
    }

    @Override // com.google.android.gms.internal.pal.zzzg
    public final /* bridge */ /* synthetic */ Object zza(zzabc zzabcVar) throws IOException {
        String str;
        zzyy zzyyVar;
        int zzl = zzabcVar.zzl();
        zzyy zzf = zzf(zzabcVar, zzl);
        if (zzf == null) {
            return zze(zzabcVar, zzl);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzabcVar.zzj()) {
                if (zzf instanceof zzzb) {
                    str = zzabcVar.zzc();
                } else {
                    str = null;
                }
                int zzl2 = zzabcVar.zzl();
                zzyy zzf2 = zzf(zzabcVar, zzl2);
                if (zzf2 == null) {
                    zzyyVar = zze(zzabcVar, zzl2);
                } else {
                    zzyyVar = zzf2;
                }
                if (zzf instanceof zzyx) {
                    ((zzyx) zzf).zze(zzyyVar);
                } else {
                    ((zzzb) zzf).zzh(str, zzyyVar);
                }
                if (zzf2 != null) {
                    arrayDeque.addLast(zzf);
                    zzf = zzyyVar;
                }
            } else {
                if (zzf instanceof zzyx) {
                    zzabcVar.zzg();
                } else {
                    zzabcVar.zzh();
                }
                if (!arrayDeque.isEmpty()) {
                    zzf = (zzyy) arrayDeque.removeLast();
                } else {
                    return zzf;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.pal.zzzg
    /* renamed from: zzd */
    public final void zzb(zzabe zzabeVar, zzyy zzyyVar) throws IOException {
        if (zzyyVar != null && !(zzyyVar instanceof zzza)) {
            if (zzyyVar instanceof zzzd) {
                zzzd zzzdVar = (zzzd) zzyyVar;
                if (zzzdVar.zzg()) {
                    zzabeVar.zzg(zzzdVar.zzb());
                    return;
                } else if (zzzdVar.zze()) {
                    zzabeVar.zzi(zzzdVar.zzc());
                    return;
                } else {
                    zzabeVar.zzh(zzzdVar.zzd());
                    return;
                }
            } else if (zzyyVar instanceof zzyx) {
                zzabeVar.zza();
                Iterator it = ((zzyx) zzyyVar).iterator();
                while (it.hasNext()) {
                    zzb(zzabeVar, (zzyy) it.next());
                }
                zzabeVar.zzc();
                return;
            } else if (zzyyVar instanceof zzzb) {
                zzabeVar.zzb();
                for (Map.Entry entry : zzyyVar.zzf().zzg()) {
                    zzabeVar.zze((String) entry.getKey());
                    zzb(zzabeVar, (zzyy) entry.getValue());
                }
                zzabeVar.zzd();
                return;
            } else {
                Class<?> cls = zzyyVar.getClass();
                cls.toString();
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(cls)));
            }
        }
        zzabeVar.zzf();
    }
}
