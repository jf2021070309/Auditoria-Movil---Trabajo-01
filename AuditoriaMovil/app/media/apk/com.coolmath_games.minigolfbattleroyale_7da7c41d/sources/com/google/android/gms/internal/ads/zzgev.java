package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgev extends OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final ArrayList<zzgex> zzc = new ArrayList<>();
    private byte[] zze = new byte[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgev(int i) {
    }

    private final void zzc(int i) {
        this.zzc.add(new zzget(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[Math.max(this.zzb, Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzb()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.zzf == this.zze.length) {
            zzc(1);
        }
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        this.zzf = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized zzgex zza() {
        int i = this.zzf;
        byte[] bArr = this.zze;
        int length = bArr.length;
        if (i >= length) {
            this.zzc.add(new zzget(bArr));
            this.zze = zza;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(length, i));
            this.zzc.add(new zzget(bArr2));
        }
        this.zzd += this.zzf;
        this.zzf = 0;
        return zzgex.zzx(this.zzc);
    }

    public final synchronized int zzb() {
        return this.zzd + this.zzf;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i3 = this.zzf;
        int i4 = length - i3;
        if (i2 <= i4) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.zzf += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        zzc(i5);
        System.arraycopy(bArr, i + i4, this.zze, 0, i5);
        this.zzf = i5;
    }
}
