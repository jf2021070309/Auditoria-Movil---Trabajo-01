package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.j0.j0;
import com.amazon.aps.iva.q.c0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzadr implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzadr zzb = new zzado(zzafa.zzd);
    private static final zzadq zzd;
    private int zzc = 0;

    static {
        int i = zzadd.zza;
        zzd = new zzadq(null);
        zza = new zzadj();
    }

    private static zzadr zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzadr) it.next();
            }
            int i2 = i >>> 1;
            zzadr zzc = zzc(it, i2);
            zzadr zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzagr.zzz(zzc, zzc2);
            }
            throw new IllegalArgumentException(j0.e("ByteString would be too long: ", zzc.zzd(), "+", zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzp(int i, int i2, int i3) {
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

    public static zzadr zzs(byte[] bArr, int i, int i2) {
        zzp(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzado(bArr2);
    }

    public static zzadr zzt(InputStream inputStream) throws IOException {
        zzadr zzs;
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            if (i2 == 0) {
                zzs = null;
            } else {
                zzs = zzs(bArr, 0, i2);
            }
            if (zzs == null) {
                break;
            }
            arrayList.add(zzs);
            i = Math.min(i + i, 8192);
        }
        int size = arrayList.size();
        if (size == 0) {
            return zzb;
        }
        return zzc(arrayList.iterator(), size);
    }

    public static void zzv(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(c0.a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(j0.e("Index > length: ", i, ", ", i2));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzahh.zza(this);
        } else {
            concat = zzahh.zza(zzk(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzadr zzk(int i, int i2);

    public abstract zzadv zzl();

    public abstract String zzm(Charset charset);

    public abstract void zzn(zzadh zzadhVar) throws IOException;

    public abstract boolean zzo();

    public final int zzq() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzr */
    public zzadm iterator() {
        return new zzadi(this);
    }

    public final String zzu(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzm(charset);
    }

    @Deprecated
    public final void zzw(byte[] bArr, int i, int i2, int i3) {
        zzp(0, i3, zzd());
        zzp(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final byte[] zzx() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzafa.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
