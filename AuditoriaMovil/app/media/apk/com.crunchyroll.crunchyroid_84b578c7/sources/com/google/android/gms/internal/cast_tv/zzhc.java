package com.google.android.gms.internal.cast_tv;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public abstract class zzhc extends zzgj {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzhc.class.getName());
    private static final boolean zzd = zzko.zzx();
    zzhd zza;

    private zzhc() {
    }

    public /* synthetic */ zzhc(zzhb zzhbVar) {
    }

    public static zzhc zzA(byte[] bArr, int i, int i2) {
        return new zzgz(bArr, 0, i2);
    }

    @Deprecated
    public static int zzu(int i, zzjc zzjcVar, zzjn zzjnVar) {
        int zzk = ((zzgc) zzjcVar).zzk(zzjnVar);
        int zzy = zzy(i << 3);
        return zzy + zzy + zzk;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzy(i);
        }
        return 10;
    }

    public static int zzw(zzjc zzjcVar, zzjn zzjnVar) {
        int zzk = ((zzgc) zzjcVar).zzk(zzjnVar);
        return zzy(zzk) + zzk;
    }

    public static int zzx(String str) {
        int length;
        try {
            length = zzkt.zzc(str);
        } catch (zzks unused) {
            length = str.getBytes(zzic.zzb).length;
        }
        return zzy(length) + length;
    }

    public static int zzy(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        if ((i & (-268435456)) == 0) {
            return 4;
        }
        return 5;
    }

    public static int zzz(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public final void zzB() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void zzC(String str, zzks zzksVar) throws IOException {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzksVar);
        byte[] bytes = str.getBytes(zzic.zzb);
        try {
            int length = bytes.length;
            zzr(length);
            zzm(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzha(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzgu zzguVar) throws IOException;

    public abstract void zzf(zzgu zzguVar) throws IOException;

    public abstract void zzg(int i, int i2) throws IOException;

    public abstract void zzh(int i) throws IOException;

    public abstract void zzi(int i, long j) throws IOException;

    public abstract void zzj(long j) throws IOException;

    public abstract void zzk(int i, int i2) throws IOException;

    public abstract void zzl(int i) throws IOException;

    public abstract void zzm(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzn(int i, String str) throws IOException;

    public abstract void zzo(String str) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i, int i2) throws IOException;

    public abstract void zzr(int i) throws IOException;

    public abstract void zzs(int i, long j) throws IOException;

    public abstract void zzt(long j) throws IOException;
}
