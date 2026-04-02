package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzas extends zzacz implements zzaeg {
    private static final zzas zzb;
    private int zze;
    private String zzf = "";

    static {
        zzas zzasVar = new zzas();
        zzb = zzasVar;
        zzacz.zzaF(zzas.class, zzasVar);
    }

    private zzas() {
    }

    public static zzar zza() {
        return (zzar) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzas zzasVar, String str) {
        str.getClass();
        zzasVar.zze |= 1;
        zzasVar.zzf = str;
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
                    return new zzar(null);
                }
                return new zzas();
            }
            return zzacz.zzaE(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }
}
