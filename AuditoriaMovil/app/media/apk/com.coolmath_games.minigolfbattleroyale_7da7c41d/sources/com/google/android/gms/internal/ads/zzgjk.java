package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzgjk zzgjkVar, String str) {
        zzgjkVar.zzb |= 1;
        zzgjkVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzgjj(null);
                }
                return new zzgjk();
            }
            return zzaz(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }
}
