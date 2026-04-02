package com.google.android.gms.internal.auth;

import java.util.List;
/* loaded from: classes.dex */
public final class zzhi extends zzeq<zzhi, zzhh> implements zzfr {
    private static final zzhi zzb;
    private zzeu<String> zzd = zzeq.zzd();

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzeq.zzi(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    public static zzhi zzl(byte[] bArr) throws zzew {
        return (zzhi) zzeq.zzb(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.auth.zzeq
    public final Object zzj(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzhh(null);
                }
                return new zzhi();
            }
            return zzeq.zzg(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final List<String> zzm() {
        return this.zzd;
    }
}
