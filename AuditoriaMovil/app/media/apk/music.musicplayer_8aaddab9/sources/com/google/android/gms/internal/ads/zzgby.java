package com.google.android.gms.internal.ads;

import java.util.List;
@Deprecated
/* loaded from: classes.dex */
public final class zzgby extends zzgga<zzgby, zzgbx> implements zzghj {
    private static final zzgby zzf;
    private String zzb = "";
    private zzggj<zzgax> zze = zzgga.zzaE();

    static {
        zzgby zzgbyVar = new zzgby();
        zzf = zzgbyVar;
        zzgga.zzay(zzgby.class, zzgbyVar);
    }

    private zzgby() {
    }

    public static zzgby zzc() {
        return zzf;
    }

    public final List<zzgax> zza() {
        return this.zze;
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
                    return new zzgbx(null);
                }
                return new zzgby();
            }
            return zzgga.zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzgax.class});
        }
        return (byte) 1;
    }
}
