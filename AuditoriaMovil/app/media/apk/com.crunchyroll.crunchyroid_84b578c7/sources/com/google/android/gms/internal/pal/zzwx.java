package com.google.android.gms.internal.pal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzwx extends zzacz implements zzaeg {
    private static final zzwx zzb;
    private String zze = "";
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwx zzwxVar = new zzwx();
        zzb = zzwxVar;
        zzacz.zzaF(zzwx.class, zzwxVar);
    }

    private zzwx() {
    }

    public static zzwx zzc() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zzww(null);
                }
                return new zzwx();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzvw.class});
        }
        return (byte) 1;
    }

    public final List zzd() {
        return this.zzf;
    }
}
