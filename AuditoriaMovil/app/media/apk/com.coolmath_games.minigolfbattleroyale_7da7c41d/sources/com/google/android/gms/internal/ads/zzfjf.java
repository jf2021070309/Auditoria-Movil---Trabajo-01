package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfjf extends zzgga<zzfjf, zzfje> implements zzghj {
    private static final zzggg<Integer, Object> zzf = new zzfjc();
    private static final zzfjf zzj;
    private int zzb;
    private zzggf zze = zzaB();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfjf zzfjfVar = new zzfjf();
        zzj = zzfjfVar;
        zzgga.zzay(zzfjf.class, zzfjfVar);
    }

    private zzfjf() {
    }

    public static zzfje zza() {
        return zzj.zzas();
    }

    public static /* synthetic */ void zzd(zzfjf zzfjfVar, String str) {
        str.getClass();
        zzfjfVar.zzb |= 1;
        zzfjfVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfjf zzfjfVar, int i) {
        zzggf zzggfVar = zzfjfVar.zze;
        if (!zzggfVar.zza()) {
            zzfjfVar.zze = zzgga.zzaC(zzggfVar);
        }
        zzfjfVar.zze.zzh(2);
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
                        return zzj;
                    }
                    return new zzfje(null);
                }
                return new zzfjf();
            }
            return zzaz(zzj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzb", "zze", zzfjd.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
