package com.google.android.gms.internal.cast_tv;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzds extends zzht implements zzjd {
    private static final zzds zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private zzcv zzh;
    private long zzi;

    static {
        zzds zzdsVar = new zzds();
        zzb = zzdsVar;
        zzht.zzA(zzds.class, zzdsVar);
    }

    private zzds() {
    }

    public static zzdr zza() {
        return (zzdr) zzb.zzq();
    }

    public static /* synthetic */ void zzc(zzds zzdsVar, String str) {
        zzdsVar.zzd |= 2;
        zzdsVar.zzf = str;
    }

    public static /* synthetic */ void zzd(zzds zzdsVar, boolean z) {
        zzdsVar.zzd |= 4;
        zzdsVar.zzg = z;
    }

    public static /* synthetic */ void zze(zzds zzdsVar, long j) {
        zzdsVar.zzd |= 16;
        zzdsVar.zzi = j;
    }

    public static /* synthetic */ void zzf(zzds zzdsVar, int i) {
        zzdsVar.zze = i - 1;
        zzdsVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzht
    public final Object zzi(int i, Object obj, Object obj2) {
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
                    return new zzdr(null);
                }
                return new zzds();
            }
            return zzht.zzx(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", zzdt.zza, "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
