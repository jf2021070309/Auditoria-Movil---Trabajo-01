package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzvt extends zzacz implements zzaeg {
    private static final zzvt zzb;
    private String zze = "";
    private zzaby zzf = zzaby.zzb;
    private int zzg;

    static {
        zzvt zzvtVar = new zzvt();
        zzb = zzvtVar;
        zzacz.zzaF(zzvt.class, zzvtVar);
    }

    private zzvt() {
    }

    public static zzvs zza() {
        return (zzvs) zzb.zzau();
    }

    public static /* synthetic */ zzvt zzc() {
        return zzb;
    }

    public static zzvt zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzg(zzvt zzvtVar, String str) {
        str.getClass();
        zzvtVar.zze = str;
    }

    public static /* synthetic */ void zzh(zzvt zzvtVar, zzaby zzabyVar) {
        zzvtVar.zzf = zzabyVar;
    }

    public static /* synthetic */ void zzj(zzvt zzvtVar, int i) {
        zzvtVar.zzg = zzwu.zza(i);
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
                    return new zzvs(null);
                }
                return new zzvt();
            }
            return zzacz.zzaE(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzaby zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final int zzi() {
        int zzb2 = zzwu.zzb(this.zzg);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }
}
