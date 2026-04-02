package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgjq extends zzgga<zzgjq, zzgjn> implements zzghj {
    private static final zzgjq zzk;
    private int zzb;
    private zzgjp zze;
    private int zzi;
    private byte zzj = 2;
    private zzggj<zzgjm> zzf = zzaE();
    private zzgex zzg = zzgex.zzb;
    private zzgex zzh = zzgex.zzb;

    static {
        zzgjq zzgjqVar = new zzgjq();
        zzk = zzgjqVar;
        zzgga.zzay(zzgjq.class, zzgjqVar);
    }

    private zzgjq() {
    }

    public static zzgjn zza() {
        return zzk.zzas();
    }

    public static /* synthetic */ void zzd(zzgjq zzgjqVar, zzgjm zzgjmVar) {
        zzgjmVar.getClass();
        zzggj<zzgjm> zzggjVar = zzgjqVar.zzf;
        if (!zzggjVar.zza()) {
            zzgjqVar.zzf = zzgga.zzaF(zzggjVar);
        }
        zzgjqVar.zzf.add(zzgjmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzk;
                        }
                        this.zzj = obj == null ? (byte) 0 : (byte) 1;
                        return null;
                    }
                    return new zzgjn(null);
                }
                return new zzgjq();
            }
            return zzaz(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", zzgjm.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
