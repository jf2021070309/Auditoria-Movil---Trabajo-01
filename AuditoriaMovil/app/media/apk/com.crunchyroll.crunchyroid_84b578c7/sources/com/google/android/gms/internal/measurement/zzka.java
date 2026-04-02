package com.google.android.gms.internal.measurement;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes3.dex */
public abstract class zzka implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzka zzb = new zzjx(zzlj.zzd);
    private static final zzjz zzd;
    private int zzc = 0;

    static {
        int i = zzjm.zza;
        zzd = new zzjz(null);
        zza = new zzjs();
    }

    public static int zzj(int i, int i2, int i3) {
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

    public static zzka zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzjx(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zze(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzjr(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzni.zza(this);
        } else {
            concat = zzni.zza(zzf(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzka zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzjq zzjqVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzm(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzg(charset);
    }
}
