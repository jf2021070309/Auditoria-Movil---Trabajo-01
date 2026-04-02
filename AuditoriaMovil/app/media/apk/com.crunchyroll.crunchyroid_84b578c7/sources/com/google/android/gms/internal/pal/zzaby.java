package com.google.android.gms.internal.pal;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public abstract class zzaby implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzaby zzb = new zzabv(zzadg.zzd);
    private static final zzabx zzd;
    private int zzc = 0;

    static {
        int i = zzabk.zza;
        zzd = new zzabx(null);
        zza = new zzabq();
    }

    public static int zzl(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(j0.e("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(j0.e("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(a.d("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static zzaby zzn(byte[] bArr) {
        return zzo(bArr, 0, bArr.length);
    }

    public static zzaby zzo(byte[] bArr, int i, int i2) {
        zzl(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzabv(bArr2);
    }

    public static zzaby zzp(String str) {
        return new zzabv(str.getBytes(zzadg.zzb));
    }

    public static zzaby zzq(byte[] bArr) {
        return new zzabv(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzabp(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzafg.zza(this);
        } else {
            concat = zzafg.zza(zzg(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzaby zzg(int i, int i2);

    public abstract zzacc zzh();

    public abstract String zzi(Charset charset);

    public abstract void zzj(zzabo zzaboVar) throws IOException;

    public abstract boolean zzk();

    public final int zzm() {
        return this.zzc;
    }

    public final String zzr(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzi(charset);
    }

    public final boolean zzs() {
        if (zzd() == 0) {
            return true;
        }
        return false;
    }

    public final byte[] zzt() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzadg.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
