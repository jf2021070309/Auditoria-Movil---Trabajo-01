package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class zzgfh extends zzgem {
    private static final Logger zzb = Logger.getLogger(zzgfh.class.getName());
    private static final boolean zzc = zzgiy.zza();
    public zzgfi zza;

    private zzgfh() {
    }

    public /* synthetic */ zzgfh(zzgff zzgffVar) {
    }

    public static int zzA(zzggq zzggqVar) {
        int zza = zzggqVar.zza();
        return zzx(zza) + zza;
    }

    public static int zzB(zzgex zzgexVar) {
        int zzc2 = zzgexVar.zzc();
        return zzx(zzc2) + zzc2;
    }

    public static int zzC(zzghi zzghiVar, zzghz zzghzVar) {
        zzgeg zzgegVar = (zzgeg) zzghiVar;
        int zzap = zzgegVar.zzap();
        if (zzap == -1) {
            zzap = zzghzVar.zze(zzgegVar);
            zzgegVar.zzaq(zzap);
        }
        return zzx(zzap) + zzap;
    }

    @Deprecated
    public static int zzF(int i2, zzghi zzghiVar, zzghz zzghzVar) {
        int zzx = zzx(i2 << 3);
        int i3 = zzx + zzx;
        zzgeg zzgegVar = (zzgeg) zzghiVar;
        int zzap = zzgegVar.zzap();
        if (zzap == -1) {
            zzap = zzghzVar.zze(zzgegVar);
            zzgegVar.zzaq(zzap);
        }
        return i3 + zzap;
    }

    public static zzgfh zzu(byte[] bArr) {
        return new zzgfe(bArr, 0, bArr.length);
    }

    public static int zzv(int i2) {
        return zzx(i2 << 3);
    }

    public static int zzw(int i2) {
        if (i2 >= 0) {
            return zzx(i2);
        }
        return 10;
    }

    public static int zzx(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzy(long j2) {
        int i2;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            j2 >>>= 28;
            i2 = 6;
        } else {
            i2 = 2;
        }
        if (((-2097152) & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i2 + 1 : i2;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzgjd.zzg(str);
        } catch (zzgjc unused) {
            length = str.getBytes(zzggk.zza).length;
        }
        return zzx(length) + length;
    }

    public final void zzD() {
        if (zzs() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzgjc zzgjcVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzgjcVar);
        byte[] bytes = str.getBytes(zzggk.zza);
        try {
            int length = bytes.length;
            zzl(length);
            zzq(bytes, 0, length);
        } catch (zzgfg e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzgfg(e3);
        }
    }

    public abstract void zza(int i2, int i3) throws IOException;

    public abstract void zzb(int i2, int i3) throws IOException;

    public abstract void zzc(int i2, int i3) throws IOException;

    public abstract void zzd(int i2, int i3) throws IOException;

    public abstract void zze(int i2, long j2) throws IOException;

    public abstract void zzf(int i2, long j2) throws IOException;

    public abstract void zzg(int i2, boolean z) throws IOException;

    public abstract void zzh(int i2, String str) throws IOException;

    public abstract void zzi(int i2, zzgex zzgexVar) throws IOException;

    public abstract void zzj(byte b2) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzl(int i2) throws IOException;

    public abstract void zzm(int i2) throws IOException;

    public abstract void zzn(long j2) throws IOException;

    public abstract void zzo(long j2) throws IOException;

    public abstract void zzq(byte[] bArr, int i2, int i3) throws IOException;

    public abstract int zzs();
}
