package com.google.android.gms.internal.ads;
/* loaded from: classes.dex */
public final class zzgjm extends zzgga<zzgjm, zzgjl> implements zzghj {
    private static final zzgjm zzh;
    private int zzb;
    private zzgex zze;
    private zzgex zzf;
    private byte zzg = 2;

    static {
        zzgjm zzgjmVar = new zzgjm();
        zzh = zzgjmVar;
        zzgga.zzay(zzgjm.class, zzgjmVar);
    }

    private zzgjm() {
        zzgex zzgexVar = zzgex.zzb;
        this.zze = zzgexVar;
        this.zzf = zzgexVar;
    }

    public static zzgjl zza() {
        return zzh.zzas();
    }

    public static /* synthetic */ zzgjm zzc() {
        return zzh;
    }

    public static /* synthetic */ void zzd(zzgjm zzgjmVar, zzgex zzgexVar) {
        zzgjmVar.zzb |= 1;
        zzgjmVar.zze = zzgexVar;
    }

    public static /* synthetic */ void zze(zzgjm zzgjmVar, zzgex zzgexVar) {
        zzgjmVar.zzb |= 2;
        zzgjmVar.zzf = zzgexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgga
    public final Object zzb(int i2, Object obj, Object obj2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzh;
                    }
                    return new zzgjl(null);
                }
                return new zzgjm();
            }
            return zzgga.zzaz(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
