package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgbc extends zzgga<zzgbc, zzgaz> implements zzghj {
    private static final zzgbc zzf;
    private int zzb;
    private zzggj<zzgbb> zze = zzaE();

    static {
        zzgbc zzgbcVar = new zzgbc();
        zzf = zzgbcVar;
        zzgga.zzay(zzgbc.class, zzgbcVar);
    }

    private zzgbc() {
    }

    public static zzgbc zze(byte[] bArr, zzgfm zzgfmVar) throws zzggm {
        return (zzgbc) zzgga.zzaK(zzf, bArr, zzgfmVar);
    }

    public final int zza() {
        return this.zzb;
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
                    return new zzgaz(null);
                }
                return new zzgbc();
            }
            return zzaz(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", zzgbb.class});
        }
        return (byte) 1;
    }

    public final List<zzgbb> zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }
}
