package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import okhttp3.internal.http2.Http2;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaz extends zzaet implements zzaga {
    private static final zzaz zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzaz zzazVar = new zzaz();
        zzb = zzazVar;
        zzaet.zzaM(zzaz.class, zzazVar);
    }

    private zzaz() {
    }

    public static zzay zza() {
        return (zzay) zzb.zzay();
    }

    public static /* synthetic */ void zzc(zzaz zzazVar, long j) {
        zzazVar.zzd |= 1;
        zzazVar.zze = j;
    }

    public static /* synthetic */ void zzd(zzaz zzazVar, long j) {
        zzazVar.zzd |= 2;
        zzazVar.zzf = j;
    }

    public static /* synthetic */ void zze(zzaz zzazVar, long j) {
        zzazVar.zzd |= 4;
        zzazVar.zzg = j;
    }

    public static /* synthetic */ void zzf(zzaz zzazVar, long j) {
        zzazVar.zzd |= 8;
        zzazVar.zzh = j;
    }

    public static /* synthetic */ void zzg(zzaz zzazVar) {
        zzazVar.zzd &= -9;
        zzazVar.zzh = -1L;
    }

    public static /* synthetic */ void zzh(zzaz zzazVar, long j) {
        zzazVar.zzd |= 16;
        zzazVar.zzi = j;
    }

    public static /* synthetic */ void zzi(zzaz zzazVar, long j) {
        zzazVar.zzd |= 32;
        zzazVar.zzj = j;
    }

    public static /* synthetic */ void zzk(zzaz zzazVar, long j) {
        zzazVar.zzd |= 128;
        zzazVar.zzl = j;
    }

    public static /* synthetic */ void zzl(zzaz zzazVar, long j) {
        zzazVar.zzd |= 256;
        zzazVar.zzm = j;
    }

    public static /* synthetic */ void zzm(zzaz zzazVar, long j) {
        zzazVar.zzd |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzazVar.zzn = j;
    }

    public static /* synthetic */ void zzn(zzaz zzazVar, long j) {
        zzazVar.zzd |= 2048;
        zzazVar.zzp = j;
    }

    public static /* synthetic */ void zzo(zzaz zzazVar, long j) {
        zzazVar.zzd |= 4096;
        zzazVar.zzq = j;
    }

    public static /* synthetic */ void zzp(zzaz zzazVar, long j) {
        zzazVar.zzd |= 8192;
        zzazVar.zzr = j;
    }

    public static /* synthetic */ void zzq(zzaz zzazVar, long j) {
        zzazVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzazVar.zzs = j;
    }

    public static /* synthetic */ void zzr(zzaz zzazVar, long j) {
        zzazVar.zzd |= 32768;
        zzazVar.zzt = j;
    }

    public static /* synthetic */ void zzs(zzaz zzazVar, long j) {
        zzazVar.zzd |= Cast.MAX_MESSAGE_LENGTH;
        zzazVar.zzu = j;
    }

    public static /* synthetic */ void zzt(zzaz zzazVar, long j) {
        zzazVar.zzd |= 131072;
        zzazVar.zzv = j;
    }

    public static /* synthetic */ void zzu(zzaz zzazVar, long j) {
        zzazVar.zzd |= 262144;
        zzazVar.zzw = j;
    }

    public static /* synthetic */ void zzv(zzaz zzazVar, int i) {
        zzazVar.zzk = i - 1;
        zzazVar.zzd |= 64;
    }

    public static /* synthetic */ void zzw(zzaz zzazVar, int i) {
        zzazVar.zzo = i - 1;
        zzazVar.zzd |= 1024;
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
                    return new zzay(null);
                }
                return new zzaz();
            }
            zzaex zzaexVar = zzbi.zza;
            return zzaet.zzaJ(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzaexVar, "zzl", "zzm", "zzn", "zzo", zzaexVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
        }
        return (byte) 1;
    }
}
