package com.google.android.gms.internal.measurement;

import e.a.d.a.a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes2.dex */
public abstract class zzix implements Iterable<Byte>, Serializable {
    private static final Comparator<zzix> zza;
    public static final zzix zzb = new zziv(zzkf.zzd);
    private static final zziw zzd;
    private int zzc = 0;

    static {
        int i2 = zzij.zza;
        zzd = new zziw(null);
        zza = new zziq();
    }

    public static int zzj(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) < 0) {
            if (i2 >= 0) {
                if (i3 < i2) {
                    throw new IndexOutOfBoundsException(a.S(66, "Beginning index larger than ending index: ", i2, ", ", i3));
                }
                throw new IndexOutOfBoundsException(a.S(37, "End index: ", i3, " >= ", i4));
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i2);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        return i5;
    }

    public static zzix zzl(byte[] bArr, int i2, int i3) {
        zzj(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zziv(bArr2);
    }

    public static zzix zzm(String str) {
        return new zziv(str.getBytes(zzkf.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzd2 = zzd();
            i2 = zze(zzd2, 0, zzd2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzio(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzlz.zza(this) : zzlz.zza(zzf(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract int zze(int i2, int i3, int i4);

    public abstract zzix zzf(int i2, int i3);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzin zzinVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
