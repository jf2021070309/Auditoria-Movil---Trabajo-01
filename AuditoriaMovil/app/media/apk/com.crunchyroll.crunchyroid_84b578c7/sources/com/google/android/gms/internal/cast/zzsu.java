package com.google.android.gms.internal.cast;

import com.amazon.aps.iva.j0.j0;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzsu implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzsu zzb = new zzsr(zzty.zzd);
    private static final zzst zzd;
    private int zzc = 0;

    static {
        int i = zzsj.zza;
        zzd = new zzst(null);
        zza = new zzsm();
    }

    public static int zzj(int i, int i2, int i3) {
        if (((i3 - i2) | i2) >= 0) {
            return i2;
        }
        throw new IndexOutOfBoundsException(j0.e("End index: ", i2, " >= ", i3));
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
        return new zzsl(this);
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = zzvx.zza(this);
        } else {
            concat = zzvx.zza(zzf(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzsu zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zzsk zzskVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return zzg(charset);
    }
}
