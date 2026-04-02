package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzmp extends zzaet implements zzaga {
    private static final zzmp zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private long zzi;

    static {
        zzmp zzmpVar = new zzmp();
        zzb = zzmpVar;
        zzaet.zzaM(zzmp.class, zzmpVar);
    }

    private zzmp() {
    }

    public static zzmo zzd() {
        return (zzmo) zzb.zzay();
    }

    public static zzmp zzf() {
        return zzb;
    }

    public static zzmp zzg(zzadr zzadrVar) throws zzafc {
        return (zzmp) zzaet.zzaB(zzb, zzadrVar);
    }

    public static zzmp zzh(zzadr zzadrVar, zzaef zzaefVar) throws zzafc {
        return (zzmp) zzaet.zzaC(zzb, zzadrVar, zzaefVar);
    }

    public static /* synthetic */ void zzl(zzmp zzmpVar, String str) {
        str.getClass();
        zzmpVar.zzd |= 1;
        zzmpVar.zze = str;
    }

    public static /* synthetic */ void zzm(zzmp zzmpVar, long j) {
        zzmpVar.zzd |= 16;
        zzmpVar.zzi = j;
    }

    public static /* synthetic */ void zzn(zzmp zzmpVar, String str) {
        str.getClass();
        zzmpVar.zzd |= 2;
        zzmpVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzmp zzmpVar, long j) {
        zzmpVar.zzd |= 4;
        zzmpVar.zzg = j;
    }

    public static /* synthetic */ void zzp(zzmp zzmpVar, long j) {
        zzmpVar.zzd |= 8;
        zzmpVar.zzh = j;
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final String zzi() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaet
    public final Object zzj(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzmo(null);
                }
                return new zzmp();
            }
            return zzaet.zzaJ(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final String zzk() {
        return this.zze;
    }
}
