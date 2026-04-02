package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgao extends zzgga<zzgao, zzgan> implements zzghj {
    private static final zzgao zzf;
    private int zzb;
    private int zze;

    static {
        zzgao zzgaoVar = new zzgao();
        zzf = zzgaoVar;
        zzgga.zzay(zzgao.class, zzgaoVar);
    }

    private zzgao() {
    }

    public static zzgan zzc() {
        return zzf.zzas();
    }

    public static zzgao zzd() {
        return zzf;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgan(null);
                }
                return new zzgao();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int zzb = zzgaf.zzb(this.zzb);
        if (zzb == 0) {
            return 1;
        }
        return zzb;
    }
}
