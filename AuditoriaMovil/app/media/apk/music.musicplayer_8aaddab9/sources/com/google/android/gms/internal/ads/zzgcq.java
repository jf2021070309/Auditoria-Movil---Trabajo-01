package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public abstract class zzgcq implements zzgdl {
    private static final int[] zzb = zzi(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    public int[] zza;
    private final int zzc;

    public zzgcq(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzi(bArr);
        this.zzc = i2;
    }

    public static void zzf(int[] iArr, int[] iArr2) {
        int[] iArr3 = zzb;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void zzg(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            zzh(iArr, 0, 4, 8, 12);
            zzh(iArr, 1, 5, 9, 13);
            zzh(iArr, 2, 6, 10, 14);
            zzh(iArr, 3, 7, 11, 15);
            zzh(iArr, 0, 5, 10, 15);
            zzh(iArr, 1, 6, 11, 12);
            zzh(iArr, 2, 7, 8, 13);
            zzh(iArr, 3, 4, 9, 14);
        }
    }

    public static void zzh(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> (-16)) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> (-12)) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> (-8)) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> (-7)) | (i16 << 7);
    }

    public static int[] zzi(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= Integer.MAX_VALUE - zzc()) {
            ByteBuffer allocate = ByteBuffer.allocate(zzc() + length);
            zzd(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public abstract int[] zzb(int[] iArr, int i2);

    public abstract int zzc();

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - zzc() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] zza = zzgds.zza(zzc());
        byteBuffer.put(zza);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i2 = (remaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer zze = zze(zza, this.zzc + i3);
            if (i3 == i2 - 1) {
                zzgco.zzc(byteBuffer, wrap, zze, remaining % 64);
            } else {
                zzgco.zzc(byteBuffer, wrap, zze, 64);
            }
        }
    }

    public final ByteBuffer zze(byte[] bArr, int i2) {
        int[] zzb2 = zzb(zzi(bArr), i2);
        int[] iArr = (int[]) zzb2.clone();
        zzg(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            zzb2[i3] = zzb2[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb2, 0, 16);
        return order;
    }
}
