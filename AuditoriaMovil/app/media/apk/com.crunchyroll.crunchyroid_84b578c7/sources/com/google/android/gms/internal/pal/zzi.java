package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzi extends zzacz implements zzaeg {
    private static final zzi zzb;
    private int zze;
    private zzk zzf;
    private zzp zzg;

    static {
        zzi zziVar = new zzi();
        zzb = zziVar;
        zzacz.zzaF(zzi.class, zziVar);
    }

    private zzi() {
    }

    public static zzi zzc(byte[] bArr, zzacm zzacmVar) throws zzadi {
        return (zzi) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    @Override // com.google.android.gms.internal.pal.zzacz
    public final Object zzb(int i, Object obj, Object obj2) {
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
                    return new zzh(null);
                }
                return new zzi();
            }
            return zzacz.zzaE(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzk zzd() {
        zzk zzkVar = this.zzf;
        if (zzkVar == null) {
            return zzk.zzc();
        }
        return zzkVar;
    }

    public final zzp zze() {
        zzp zzpVar = this.zzg;
        if (zzpVar == null) {
            return zzp.zzc();
        }
        return zzpVar;
    }

    public final boolean zzf() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }
}
