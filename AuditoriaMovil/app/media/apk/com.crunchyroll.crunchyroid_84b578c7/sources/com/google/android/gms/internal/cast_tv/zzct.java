package com.google.android.gms.internal.cast_tv;

import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzct extends zzht implements zzjd {
    private static final zzct zzb;
    private int zzd;
    private zziw zze = zziw.zza();
    private int zzf;

    static {
        zzct zzctVar = new zzct();
        zzb = zzctVar;
        zzht.zzA(zzct.class, zzctVar);
    }

    private zzct() {
    }

    public static zzct zzc(byte[] bArr, zzhh zzhhVar) throws zzie {
        return (zzct) zzht.zzt(zzb, bArr, zzhhVar);
    }

    public final zzco zza() {
        zzco zzb2 = zzco.zzb(this.zzf);
        if (zzb2 == null) {
            return zzco.UNKNOWN;
        }
        return zzb2;
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zze);
    }

    public final boolean zze() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzht
    public final Object zzi(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzcr(null);
                }
                return new zzct();
            }
            return zzht.zzx(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဌ\u0000", new Object[]{"zzd", "zze", zzcs.zza, "zzf", zzcn.zza});
        }
        return (byte) 1;
    }
}
