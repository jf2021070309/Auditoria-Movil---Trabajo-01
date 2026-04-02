package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgjk extends zzgga<zzgjk, zzgjj> implements zzghj {
    private static final zzgjk zzf;
    private int zzb;
    private String zze = "";

    static {
        zzgjk zzgjkVar = new zzgjk();
        zzf = zzgjkVar;
        zzgga.zzay(zzgjk.class, zzgjkVar);
    }

    private zzgjk() {
    }

    public static zzgjj zza() {
        return zzf.zzas();
    }

    public static /* synthetic */ void zzd(zzgjk zzgjkVar, String str) {
        zzgjkVar.zzb |= 1;
        zzgjkVar.zze = str;
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
                    return new zzgjj(null);
                }
                return new zzgjk();
            }
            return zzgga.zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
