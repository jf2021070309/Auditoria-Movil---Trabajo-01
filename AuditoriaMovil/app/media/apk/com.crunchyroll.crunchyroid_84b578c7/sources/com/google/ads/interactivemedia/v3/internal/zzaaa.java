package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaaa extends zzxi {
    private static final zzxj zza = new zzzy(zzxf.DOUBLE);
    private final zzwm zzb;
    private final zzxg zzc;

    public /* synthetic */ zzaaa(zzwm zzwmVar, zzxg zzxgVar, zzzz zzzzVar) {
        this.zzb = zzwmVar;
        this.zzc = zzxgVar;
    }

    public static zzxj zza(zzxg zzxgVar) {
        if (zzxgVar == zzxf.DOUBLE) {
            return zza;
        }
        return new zzzy(zzxgVar);
    }

    private final Object zzb(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 5) {
            if (i2 != 6) {
                if (i2 != 7) {
                    if (i2 == 8) {
                        zzacvVar.zzn();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(zzacw.zza(i)));
                }
                return Boolean.valueOf(zzacvVar.zzs());
            }
            return this.zzc.zza(zzacvVar);
        }
        return zzacvVar.zzi();
    }

    private static final Object zzc(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                return null;
            }
            zzacvVar.zzk();
            return new zzyy();
        }
        zzacvVar.zzj();
        return new ArrayList();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        String str;
        Object obj;
        int zzt = zzacvVar.zzt();
        Object zzc = zzc(zzacvVar, zzt);
        if (zzc == null) {
            return zzb(zzacvVar, zzt);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzacvVar.zzq()) {
                if (zzc instanceof Map) {
                    str = zzacvVar.zzh();
                } else {
                    str = null;
                }
                int zzt2 = zzacvVar.zzt();
                Object zzc2 = zzc(zzacvVar, zzt2);
                if (zzc2 == null) {
                    obj = zzb(zzacvVar, zzt2);
                } else {
                    obj = zzc2;
                }
                if (zzc instanceof List) {
                    ((List) zzc).add(obj);
                } else {
                    ((Map) zzc).put(str, obj);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    zzc = obj;
                }
            } else {
                if (zzc instanceof List) {
                    zzacvVar.zzl();
                } else {
                    zzacvVar.zzm();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        if (obj == null) {
            zzacxVar.zzf();
            return;
        }
        zzxi zza2 = this.zzb.zza(zzact.zza(obj.getClass()));
        if (zza2 instanceof zzaaa) {
            zzacxVar.zzb();
            zzacxVar.zzd();
            return;
        }
        zza2.write(zzacxVar, obj);
    }
}
