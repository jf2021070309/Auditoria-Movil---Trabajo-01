package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzgby extends zzgga<zzgby, zzgbx> implements zzghj {
    private static final zzgby zzf;
    private String zzb = "";
    private zzggj<zzgax> zze = zzaE();

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
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzf;
                    }
                    return new zzgbx(null);
                }
                return new zzgby();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzgax.class});
        }
        return (byte) 1;
    }
}
