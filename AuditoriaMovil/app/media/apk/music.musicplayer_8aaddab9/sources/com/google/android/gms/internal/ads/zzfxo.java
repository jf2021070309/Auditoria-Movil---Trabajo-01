package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzfxo extends zzgga<zzfxo, zzfxn> implements zzghj {
    private static final zzfxo zzg;
    private int zzb;
    private zzfxu zze;
    private zzgai zzf;

    static {
        zzfxo zzfxoVar = new zzfxo();
        zzg = zzfxoVar;
        zzgga.zzay(zzfxo.class, zzfxoVar);
    }

    private zzfxo() {
    }

    public static zzfxo zze(zzgex zzgexVar, zzgfm zzgfmVar) throws zzggm {
        return (zzfxo) zzgga.zzaI(zzg, zzgexVar, zzgfmVar);
    }

    public static zzfxn zzf() {
        return zzg.zzas();
    }

    public static /* synthetic */ void zzi(zzfxo zzfxoVar, zzfxu zzfxuVar) {
        zzfxuVar.getClass();
        zzfxoVar.zze = zzfxuVar;
    }

    public static /* synthetic */ void zzj(zzfxo zzfxoVar, zzgai zzgaiVar) {
        zzgaiVar.getClass();
        zzfxoVar.zzf = zzgaiVar;
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
                    return new zzfxn(null);
                }
                return new zzfxo();
            }
            return zzgga.zzaz(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzfxu zzc() {
        zzfxu zzfxuVar = this.zze;
        return zzfxuVar == null ? zzfxu.zzg() : zzfxuVar;
    }

    public final zzgai zzd() {
        zzgai zzgaiVar = this.zzf;
        return zzgaiVar == null ? zzgai.zzg() : zzgaiVar;
    }
}
