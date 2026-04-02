package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzfq extends zzkd<zzfq, zzfp> implements zzlj {
    private static final zzfq zzg;
    private int zza;
    private String zze = "";
    private long zzf;

    static {
        zzfq zzfqVar = new zzfq();
        zzg = zzfqVar;
        zzkd.zzby(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return zzg.zzbt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        str.getClass();
        zzfqVar.zza |= 1;
        zzfqVar.zze = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzd(zzfq zzfqVar, long j) {
        zzfqVar.zza |= 2;
        zzfqVar.zzf = j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzkd
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzg;
                    }
                    return new zzfp(null);
                }
                return new zzfq();
            }
            return zzbz(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zza", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
