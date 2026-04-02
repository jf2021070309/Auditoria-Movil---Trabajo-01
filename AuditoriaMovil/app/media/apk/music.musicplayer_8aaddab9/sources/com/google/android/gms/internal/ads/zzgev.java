package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class zzgev extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList<zzgex> zzc = new ArrayList<>();
    private byte[] zze = new byte[128];

    public zzgev(int i2) {
    }

    private final void zzc(int i2) {
        this.zzc.add(new zzget(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i2, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i2) {
        if (this.zzf == this.zze.length) {
            zzc(1);
        }
        byte[] bArr = this.zze;
        int i3 = this.zzf;
        this.zzf = i3 + 1;
        bArr[i3] = (byte) i2;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i4 = this.zzf;
        int i5 = length - i4;
        if (i3 <= i5) {
            System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.zzf += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i4, i5);
        int i6 = i3 - i5;
        zzc(i6);
        System.arraycopy(bArr, i2 + i5, this.zze, 0, i6);
        this.zzf = i6;
    }

    public final synchronized zzgex zza() {
        int i2 = this.zzf;
        byte[] bArr = this.zze;
        int length = bArr.length;
        if (i2 >= length) {
            this.zzc.add(new zzget(bArr));
            this.zze = zza;
        } else if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i2));
            this.zzc.add(new zzget(bArr2));
        }
        this.zzd += this.zzf;
        this.zzf = 0;
        return zzgex.zzx(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }
}
