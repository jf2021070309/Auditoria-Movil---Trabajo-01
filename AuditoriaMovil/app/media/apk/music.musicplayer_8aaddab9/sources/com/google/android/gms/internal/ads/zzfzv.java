package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfzv extends zzgga<zzfzv, zzfzu> implements zzghj {
    private static final zzfzv zzg;
    private int zzb;
    private zzfzy zze;
    private zzgex zzf = zzgex.zzb;

    static {
        zzfzv zzfzvVar = new zzfzv();
        zzg = zzfzvVar;
        zzgga.zzay(zzfzv.class, zzfzvVar);
    }

    private zzfzv() {
    }

    public static zzfzv zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfzv) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfzu zzf() {
        return zzg.zzas();
    }

    public static /* synthetic */ void zzi(zzfzv zzfzvVar, zzfzy zzfzyVar) {
        zzfzyVar.getClass();
        zzfzvVar.zze = zzfzyVar;
    }

    public final int zza() {
        return this.zzb;
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
                        return zzg;
                    }
                    return new zzfzu(null);
                }
                return new zzfzv();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfzy zzc() {
        zzfzy zzfzyVar = this.zze;
        return zzfzyVar == null ? zzfzy.zzh() : zzfzyVar;
    }

    public final zzgex zzd() {
        return this.zzf;
    }
}
