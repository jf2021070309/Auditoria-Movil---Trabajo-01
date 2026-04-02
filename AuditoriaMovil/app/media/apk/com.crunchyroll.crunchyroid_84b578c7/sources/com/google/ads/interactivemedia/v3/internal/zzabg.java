package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabg extends zzxi {
    private static final zzwr zzb(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        zzacvVar.zzn();
                        return zzwt.zza;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(zzacw.zza(i)));
                }
                return new zzww(Boolean.valueOf(zzacvVar.zzs()));
            }
            return new zzww(new zzyq(zzacvVar.zzi()));
        }
        return new zzww(zzacvVar.zzi());
    }

    private static final zzwr zzc(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                return null;
            }
            zzacvVar.zzk();
            return new zzwu();
        }
        zzacvVar.zzj();
        return new zzwp();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        String str;
        zzwr zzwrVar;
        int zzt = zzacvVar.zzt();
        zzwr zzc = zzc(zzacvVar, zzt);
        if (zzc == null) {
            return zzb(zzacvVar, zzt);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzacvVar.zzq()) {
                if (zzc instanceof zzwu) {
                    str = zzacvVar.zzh();
                } else {
                    str = null;
                }
                int zzt2 = zzacvVar.zzt();
                zzwr zzc2 = zzc(zzacvVar, zzt2);
                if (zzc2 == null) {
                    zzwrVar = zzb(zzacvVar, zzt2);
                } else {
                    zzwrVar = zzc2;
                }
                if (zzc instanceof zzwp) {
                    ((zzwp) zzc).zza(zzwrVar);
                } else {
                    ((zzwu) zzc).zzb(str, zzwrVar);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    zzc = zzwrVar;
                }
            } else {
                if (zzc instanceof zzwp) {
                    zzacvVar.zzl();
                } else {
                    zzacvVar.zzm();
                }
                if (!arrayDeque.isEmpty()) {
                    zzc = (zzwr) arrayDeque.removeLast();
                } else {
                    return zzc;
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    /* renamed from: zza */
    public final void write(zzacx zzacxVar, zzwr zzwrVar) throws IOException {
        if (zzwrVar != null && !(zzwrVar instanceof zzwt)) {
            if (zzwrVar instanceof zzww) {
                zzww zzwwVar = (zzww) zzwrVar;
                if (zzwwVar.zzf()) {
                    zzacxVar.zzj(zzwwVar.zza());
                    return;
                } else if (zzwwVar.zze()) {
                    zzacxVar.zzl(zzwwVar.zzd());
                    return;
                } else {
                    zzacxVar.zzk(zzwwVar.zzb());
                    return;
                }
            } else if (zzwrVar instanceof zzwp) {
                zzacxVar.zza();
                Iterator it = ((zzwp) zzwrVar).iterator();
                while (it.hasNext()) {
                    write(zzacxVar, (zzwr) it.next());
                }
                zzacxVar.zzc();
                return;
            } else if (zzwrVar instanceof zzwu) {
                zzacxVar.zzb();
                for (Map.Entry entry : ((zzwu) zzwrVar).zza()) {
                    zzacxVar.zze((String) entry.getKey());
                    write(zzacxVar, (zzwr) entry.getValue());
                }
                zzacxVar.zzd();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzwrVar.getClass())));
            }
        }
        zzacxVar.zzf();
    }
}
