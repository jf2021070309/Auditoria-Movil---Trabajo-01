package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgjq extends zzgga<zzgjq, zzgjn> implements zzghj {
    private static final zzgjq zzk;
    private int zzb;
    private zzgjp zze;
    private zzgex zzg;
    private zzgex zzh;
    private int zzi;
    private byte zzj = 2;
    private zzggj<zzgjm> zzf = zzgga.zzaE();

    static {
        zzgjq zzgjqVar = new zzgjq();
        zzk = zzgjqVar;
        zzgga.zzay(zzgjq.class, zzgjqVar);
    }

    private zzgjq() {
        zzgex zzgexVar = zzgex.zzb;
        this.zzg = zzgexVar;
        this.zzh = zzgexVar;
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
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzk;
                    }
                    return new zzgjn(null);
                }
                return new zzgjq();
            }
            return zzgga.zzaz(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzb", "zze", "zzf", zzgjm.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
