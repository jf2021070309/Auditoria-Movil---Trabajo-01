package com.google.android.gms.internal.ads;
@Deprecated
/* loaded from: classes.dex */
public final class zzgax extends zzgga<zzgax, zzgaw> implements zzghj {
    private static final zzgax zzi;
    private int zzf;
    private boolean zzg;
    private String zzb = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgax zzgaxVar = new zzgax();
        zzi = zzgaxVar;
        zzgga.zzay(zzgax.class, zzgaxVar);
    }

    private zzgax() {
    }

    public final String zza() {
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
                        return zzi;
                    }
                    return new zzgaw(null);
                }
                return new zzgax();
            }
            return zzgga.zzaz(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final String zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }
}
