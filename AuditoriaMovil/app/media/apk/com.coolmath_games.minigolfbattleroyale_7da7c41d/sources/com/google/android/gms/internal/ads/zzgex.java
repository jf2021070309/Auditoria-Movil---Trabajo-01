package com.google.android.gms.internal.ads;

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
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgex implements Iterable<Byte>, Serializable {
    public static final zzgex zzb = new zzget(zzggk.zzc);
    private static final Comparator<zzgex> zzc;
    private static final zzgew zzd;
    private int zza = 0;

    static {
        int i = zzgei.zza;
        zzd = new zzgew(null);
        zzc = new zzgeo();
    }

    public static zzgev zzB() {
        return new zzgev(128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzD(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    public static zzgex zzs(byte[] bArr, int i, int i2) {
        zzE(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzget(bArr2);
    }

    public static zzgex zzt(byte[] bArr) {
        return zzs(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgex zzu(byte[] bArr) {
        return new zzget(bArr);
    }

    public static zzgex zzv(String str) {
        return new zzget(str.getBytes(zzggk.zza));
    }

    public static zzgex zzw(InputStream inputStream) throws IOException {
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
            zzgex zzs = i2 == 0 ? null : zzs(bArr, 0, i2);
            if (zzs != null) {
                arrayList.add(zzs);
                i = Math.min(i + i, 8192);
            } else {
                return zzx(arrayList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgex zzx(Iterable<zzgex> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzd(iterable.iterator(), size);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zza;
        if (i == 0) {
            int zzc2 = zzc();
            i = zzo(zzc2, 0, zzc2);
            if (i == 0) {
                i = 1;
            }
            this.zza = i;
        }
        return i;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzC() {
        return this.zza;
    }

    public abstract byte zza(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzb(int i);

    public abstract int zzc();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzg();

    public abstract zzgex zzi(int i, int i2);

    public abstract ByteBuffer zzj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(zzgem zzgemVar) throws IOException;

    protected abstract String zzl(Charset charset);

    public abstract boolean zzm();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzn(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzo(int i, int i2, int i3);

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
    public final void zzy(byte[] bArr, int i, int i2, int i3) {
        zzE(0, i3, zzc());
        zzE(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
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

    private static zzgex zzd(Iterator<zzgex> it, int i) {
        if (i > 0) {
            if (i == 1) {
                return it.next();
            }
            int i2 = i >>> 1;
            zzgex zzd2 = zzd(it, i2);
            zzgex zzd3 = zzd(it, i - i2);
            if (Integer.MAX_VALUE - zzd2.zzc() < zzd3.zzc()) {
                int zzc2 = zzd2.zzc();
                int zzc3 = zzd3.zzc();
                StringBuilder sb = new StringBuilder(53);
                sb.append("ByteString would be too long: ");
                sb.append(zzc2);
                sb.append("+");
                sb.append(zzc3);
                throw new IllegalArgumentException(sb.toString());
            }
            return zzghy.zzF(zzd2, zzd3);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzE(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }
}
