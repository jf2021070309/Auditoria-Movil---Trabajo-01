package com.google.android.gms.internal.pal;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzwb extends zzacz implements zzaeg {
    private static final zzwb zzb;
    private int zze;
    private zzadf zzf = zzacz.zzaz();

    static {
        zzwb zzwbVar = new zzwb();
        zzb = zzwbVar;
        zzacz.zzaF(zzwb.class, zzwbVar);
    }

    private zzwb() {
    }

    public static zzvy zzd() {
        return (zzvy) zzb.zzau();
    }

    public static zzwb zzf(byte[] bArr, zzacm zzacmVar) throws zzadi {
        return (zzwb) zzacz.zzax(zzb, bArr, zzacmVar);
    }

    public static /* synthetic */ void zzi(zzwb zzwbVar, zzwa zzwaVar) {
        zzwaVar.getClass();
        zzadf zzadfVar = zzwbVar.zzf;
        if (!zzadfVar.zzc()) {
            zzwbVar.zzf = zzacz.zzaA(zzadfVar);
        }
        zzwbVar.zzf.add(zzwaVar);
    }

    public final int zza() {
        return this.zzf.size();
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
                    return new zzvy(null);
                }
                return new zzwb();
            }
            return zzacz.zzaE(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzwa.class});
        }
        return (byte) 1;
    }

    public final int zzc() {
        return this.zze;
    }

    public final List zzg() {
        return this.zzf;
    }
}
