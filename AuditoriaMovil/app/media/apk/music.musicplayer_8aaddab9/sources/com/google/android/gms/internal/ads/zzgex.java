package com.google.android.gms.internal.ads;

import ch.qos.logback.core.rolling.helper.Compressor;
import e.a.d.a.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import org.slf4j.Marker;
/* loaded from: classes.dex */
public abstract class zzgex implements Iterable<Byte>, Serializable {
    public static final zzgex zzb = new zzget(zzggk.zzc);
    private static final Comparator<zzgex> zzc;
    private static final zzgew zzd;
    private int zza = 0;

    static {
        int i2 = zzgei.zza;
        zzd = new zzgew(null);
        zzc = new zzgeo();
    }

    public static zzgev zzB() {
        return new zzgev(128);
    }

    public static void zzD(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 >= 0) {
                throw new ArrayIndexOutOfBoundsException(a.S(40, "Index > length: ", i2, ", ", i3));
            }
            throw new ArrayIndexOutOfBoundsException(a.R(22, "Index < 0: ", i2));
        }
    }

    public static int zzE(int i2, int i3, int i4) {
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

    private static zzgex zzd(Iterator<zzgex> it, int i2) {
        if (i2 > 0) {
            if (i2 == 1) {
                return it.next();
            }
            int i3 = i2 >>> 1;
            zzgex zzd2 = zzd(it, i3);
            zzgex zzd3 = zzd(it, i2 - i3);
            if (Integer.MAX_VALUE - zzd2.zzc() >= zzd3.zzc()) {
                return zzghy.zzF(zzd2, zzd3);
            }
            throw new IllegalArgumentException(a.S(53, "ByteString would be too long: ", zzd2.zzc(), Marker.ANY_NON_NULL_MARKER, zzd3.zzc()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i2)));
    }

    public static zzgex zzs(byte[] bArr, int i2, int i3) {
        zzE(i2, i2 + i3, bArr.length);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new zzget(bArr2);
    }

    public static zzgex zzt(byte[] bArr) {
        return zzs(bArr, 0, bArr.length);
    }

    public static zzgex zzu(byte[] bArr) {
        return new zzget(bArr);
    }

    public static zzgex zzv(String str) {
        return new zzget(str.getBytes(zzggk.zza));
    }

    public static zzgex zzw(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i2 = 256;
        while (true) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i3, i2 - i3);
                if (read == -1) {
                    break;
                }
                i3 += read;
            }
            zzgex zzs = i3 == 0 ? null : zzs(bArr, 0, i3);
            if (zzs == null) {
                return zzx(arrayList);
            }
            arrayList.add(zzs);
            i2 = Math.min(i2 + i2, (int) Compressor.BUFFER_SIZE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgex zzx(Iterable<zzgex> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzd(iterable.iterator(), size);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int zzc2 = zzc();
            i2 = zzo(zzc2, 0, zzc2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zza = i2;
        }
        return i2;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzc());
        objArr[2] = zzc() <= 50 ? zzgim.zza(this) : zzgim.zza(zzi(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzc() == 0 ? "" : zzl(charset);
    }

    public final int zzC() {
        return this.zza;
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzc();

    public abstract void zze(byte[] bArr, int i2, int i3, int i4);

    public abstract int zzf();

    public abstract boolean zzg();

    public abstract zzgex zzi(int i2, int i3);

    public abstract ByteBuffer zzj();

    public abstract void zzk(zzgem zzgemVar) throws IOException;

    public abstract String zzl(Charset charset);

    public abstract boolean zzm();

    public abstract int zzn(int i2, int i3, int i4);

    public abstract int zzo(int i2, int i3, int i4);

    public abstract zzgfc zzp();

    @Override // java.lang.Iterable
    /* renamed from: zzq */
    public zzger iterator() {
        return new zzgen(this);
    }

    public final boolean zzr() {
        return zzc() == 0;
    }

    @Deprecated
    public final void zzy(byte[] bArr, int i2, int i3, int i4) {
        zzE(0, i4, zzc());
        zzE(i3, i3 + i4, bArr.length);
        if (i4 > 0) {
            zze(bArr, 0, i3, i4);
        }
    }

    public final byte[] zzz() {
        int zzc2 = zzc();
        if (zzc2 == 0) {
            return zzggk.zzc;
        }
        byte[] bArr = new byte[zzc2];
        zze(bArr, 0, 0, zzc2);
        return bArr;
    }
}
