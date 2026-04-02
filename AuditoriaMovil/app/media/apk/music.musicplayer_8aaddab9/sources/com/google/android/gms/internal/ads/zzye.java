package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzye extends zzgga<zzye, zzyd> implements zzghj {
    private static final zzye zzf;
    private int zzb;
    private int zze = 2;

    static {
        zzye zzyeVar = new zzye();
        zzf = zzyeVar;
        zzgga.zzay(zzye.class, zzyeVar);
    }

    private zzye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            return null;
                        }
                        return zzf;
                    }
                    return new zzyd(null);
                }
                return new zzye();
            }
            return zzgga.zzaz(zzf, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzb", "zze", zzyf.zza});
        }
        return (byte) 1;
    }
}
