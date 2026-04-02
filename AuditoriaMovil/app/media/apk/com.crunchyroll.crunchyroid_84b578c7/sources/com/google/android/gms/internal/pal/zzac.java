package com.google.android.gms.internal.pal;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import okhttp3.internal.http2.Http2;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzac extends zzacz implements zzaeg {
    private static final zzac zzb;
    private int zze;
    private long zzu;
    private long zzv;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzac zzacVar = new zzac();
        zzb = zzacVar;
        zzacz.zzaF(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzab zza() {
        return (zzab) zzb.zzau();
    }

    public static /* synthetic */ void zzd(zzac zzacVar, long j) {
        zzacVar.zze |= 1;
        zzacVar.zzf = j;
    }

    public static /* synthetic */ void zze(zzac zzacVar, long j) {
        zzacVar.zze |= 2;
        zzacVar.zzg = j;
    }

    public static /* synthetic */ void zzf(zzac zzacVar, long j) {
        zzacVar.zze |= 4;
        zzacVar.zzh = j;
    }

    public static /* synthetic */ void zzg(zzac zzacVar, long j) {
        zzacVar.zze |= 8;
        zzacVar.zzi = j;
    }

    public static /* synthetic */ void zzh(zzac zzacVar) {
        zzacVar.zze &= -9;
        zzacVar.zzi = -1L;
    }

    public static /* synthetic */ void zzi(zzac zzacVar, long j) {
        zzacVar.zze |= 16;
        zzacVar.zzj = j;
    }

    public static /* synthetic */ void zzj(zzac zzacVar, long j) {
        zzacVar.zze |= 32;
        zzacVar.zzk = j;
    }

    public static /* synthetic */ void zzk(zzac zzacVar, long j) {
        zzacVar.zze |= 128;
        zzacVar.zzm = j;
    }

    public static /* synthetic */ void zzl(zzac zzacVar, long j) {
        zzacVar.zze |= 256;
        zzacVar.zzn = j;
    }

    public static /* synthetic */ void zzm(zzac zzacVar, long j) {
        zzacVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzacVar.zzo = j;
    }

    public static /* synthetic */ void zzn(zzac zzacVar, long j) {
        zzacVar.zze |= 2048;
        zzacVar.zzq = j;
    }

    public static /* synthetic */ void zzo(zzac zzacVar, long j) {
        zzacVar.zze |= 4096;
        zzacVar.zzr = j;
    }

    public static /* synthetic */ void zzp(zzac zzacVar, long j) {
        zzacVar.zze |= 8192;
        zzacVar.zzs = j;
    }

    public static /* synthetic */ void zzq(zzac zzacVar, long j) {
        zzacVar.zze |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzacVar.zzt = j;
    }

    public static /* synthetic */ void zzr(zzac zzacVar, long j) {
        zzacVar.zze |= 32768;
        zzacVar.zzu = j;
    }

    public static /* synthetic */ void zzs(zzac zzacVar, long j) {
        zzacVar.zze |= Cast.MAX_MESSAGE_LENGTH;
        zzacVar.zzv = j;
    }

    public static /* synthetic */ void zzt(zzac zzacVar, long j) {
        zzacVar.zze |= 131072;
        zzacVar.zzw = j;
    }

    public static /* synthetic */ void zzu(zzac zzacVar, long j) {
        zzacVar.zze |= 262144;
        zzacVar.zzx = j;
    }

    public static /* synthetic */ void zzv(zzac zzacVar, int i) {
        zzacVar.zzl = i - 1;
        zzacVar.zze |= 64;
    }

    public static /* synthetic */ void zzw(zzac zzacVar, int i) {
        zzacVar.zzp = i - 1;
        zzacVar.zze |= 1024;
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
                    return new zzab(null);
                }
                return new zzac();
            }
            zzadd zzaddVar = zzan.zza;
            return zzacz.zzaE(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzaddVar, "zzm", "zzn", "zzo", "zzp", zzaddVar, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        return (byte) 1;
    }
}
