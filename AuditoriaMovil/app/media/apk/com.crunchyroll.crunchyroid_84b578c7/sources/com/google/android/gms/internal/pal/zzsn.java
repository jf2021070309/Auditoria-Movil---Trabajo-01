package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzsn extends zzacz implements zzaeg {
    private static final zzsn zzb;
    private zzsq zze;
    private int zzf;

    static {
        zzsn zzsnVar = new zzsn();
        zzb = zzsnVar;
        zzacz.zzaF(zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    public static zzsm zzc() {
        return (zzsm) zzb.zzau();
    }

    public static zzsn zze(zzaby zzabyVar, zzacm zzacmVar) throws zzadi {
        return (zzsn) zzacz.zzaw(zzb, zzabyVar, zzacmVar);
    }

    public static /* synthetic */ void zzg(zzsn zzsnVar, zzsq zzsqVar) {
        zzsqVar.getClass();
        zzsnVar.zze = zzsqVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzsm(null);
                }
                return new zzsn();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzsq zzf() {
        zzsq zzsqVar = this.zze;
        if (zzsqVar == null) {
            return zzsq.zze();
        }
        return zzsqVar;
    }
}
