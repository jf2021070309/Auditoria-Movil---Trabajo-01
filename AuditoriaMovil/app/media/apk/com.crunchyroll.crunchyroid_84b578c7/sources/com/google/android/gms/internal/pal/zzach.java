package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzach extends zzabo {
    private static final Logger zzb = Logger.getLogger(zzach.class.getName());
    private static final boolean zzc = zzafs.zzx();
    zzaci zza;

    private zzach() {
    }

    public /* synthetic */ zzach(zzacg zzacgVar) {
    }

    public static int zzA(int i) {
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

    public static int zzB(long j) {
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
            i += 2;
            j >>>= 14;
        }
        if ((j & (-16384)) != 0) {
            return i + 1;
        }
        return i;
    }

    public static zzach zzC(byte[] bArr) {
        return new zzace(bArr, 0, bArr.length);
    }

    public static int zzt(zzaby zzabyVar) {
        int zzd = zzabyVar.zzd();
        return zzA(zzd) + zzd;
    }

    @Deprecated
    public static int zzu(int i, zzaef zzaefVar, zzaer zzaerVar) {
        int zzA = zzA(i << 3);
        int i2 = zzA + zzA;
        zzabi zzabiVar = (zzabi) zzaefVar;
        int zzap = zzabiVar.zzap();
        if (zzap == -1) {
            zzap = zzaerVar.zza(zzabiVar);
            zzabiVar.zzar(zzap);
        }
        return i2 + zzap;
    }

    public static int zzv(int i) {
        if (i >= 0) {
            return zzA(i);
        }
        return 10;
    }

    public static int zzw(zzadl zzadlVar) {
        int zza = zzadlVar.zza();
        return zzA(zza) + zza;
    }

    public static int zzx(zzaef zzaefVar, zzaer zzaerVar) {
        zzabi zzabiVar = (zzabi) zzaefVar;
        int zzap = zzabiVar.zzap();
        if (zzap == -1) {
            zzap = zzaerVar.zza(zzabiVar);
            zzabiVar.zzar(zzap);
        }
        return zzA(zzap) + zzap;
    }

    public static int zzy(String str) {
        int length;
        try {
            length = zzafx.zzc(str);
        } catch (zzafw unused) {
            length = str.getBytes(zzadg.zzb).length;
        }
        return zzA(length) + length;
    }

    public static int zzz(int i) {
        return zzA(i << 3);
    }

    public final void zzD() {
        if (zza() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final void zzE(String str, zzafw zzafwVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzafwVar);
        byte[] bytes = str.getBytes(zzadg.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzacf(e);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzaby zzabyVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, String str) throws IOException;

    public abstract void zzo(int i, int i2) throws IOException;

    public abstract void zzp(int i, int i2) throws IOException;

    public abstract void zzq(int i) throws IOException;

    public abstract void zzr(int i, long j) throws IOException;

    public abstract void zzs(long j) throws IOException;
}
