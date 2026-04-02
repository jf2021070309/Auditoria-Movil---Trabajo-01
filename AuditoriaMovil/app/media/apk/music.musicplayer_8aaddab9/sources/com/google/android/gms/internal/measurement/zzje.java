package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public abstract class zzje extends zzin {
    private static final Logger zzb = Logger.getLogger(zzje.class.getName());
    private static final boolean zzc = zzml.zzx();
    public zzjf zza;

    private zzje() {
    }

    public /* synthetic */ zzje(zzjb zzjbVar) {
    }

    public static int zzA(int i2) {
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

    public static int zzB(long j2) {
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

    public static zzje zzC(byte[] bArr) {
        return new zzjc(bArr, 0, bArr.length);
    }

    public static int zzt(zzix zzixVar) {
        int zzd = zzixVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i2, zzlc zzlcVar, zzln zzlnVar) {
        int zzA = zzA(i2 << 3);
        int i3 = zzA + zzA;
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        return i3 + zzbo;
    }

    public static int zzv(int i2) {
        if (i2 >= 0) {
            return zzA(i2);
        }
        return 10;
    }

    public static int zzw(zzkk zzkkVar) {
        int zza = zzkkVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzlc zzlcVar, zzln zzlnVar) {
        zzih zzihVar = (zzih) zzlcVar;
        int zzbo = zzihVar.zzbo();
        if (zzbo == -1) {
            zzbo = zzlnVar.zza(zzihVar);
            zzihVar.zzbr(zzbo);
        }
        return zzA(zzbo) + zzbo;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzmq.zzc(str);
        } catch (zzmp unused) {
            length = str.getBytes(zzkf.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i2) {
        return zzA(i2 << 3);
    }

    public final void zzD() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzE(String str, zzmp zzmpVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzmpVar);
        byte[] bytes = str.getBytes(zzkf.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (zzjd e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new zzjd(e3);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b2) throws IOException;

    public abstract void zzd(int i2, boolean z) throws IOException;

    public abstract void zze(int i2, zzix zzixVar) throws IOException;

    public abstract void zzf(int i2, int i3) throws IOException;

    public abstract void zzg(int i2) throws IOException;

    public abstract void zzh(int i2, long j2) throws IOException;

    public abstract void zzi(long j2) throws IOException;

    public abstract void zzj(int i2, int i3) throws IOException;

    public abstract void zzk(int i2) throws IOException;

    public abstract void zzl(byte[] bArr, int i2, int i3) throws IOException;

    public abstract void zzm(int i2, String str) throws IOException;

    public abstract void zzo(int i2, int i3) throws IOException;

    public abstract void zzp(int i2, int i3) throws IOException;

    public abstract void zzq(int i2) throws IOException;

    public abstract void zzr(int i2, long j2) throws IOException;

    public abstract void zzs(long j2) throws IOException;
}
