package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzaxj extends zzaxe {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(" ");
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int zza = zzaxi.zza(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(zza);
            bArr2 = allocate.array();
        } else {
            if (length >= 5) {
                bArr = new byte[length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int zza2 = zzaxi.zza(split[i2]);
                    bArr[i2] = (byte) ((zza2 >> 24) ^ (((zza2 & 255) ^ ((zza2 >> 8) & 255)) ^ ((zza2 >> 16) & 255)));
                }
            } else {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < split.length; i3++) {
                    int zza3 = zzaxi.zza(split[i3]);
                    int i4 = (zza3 >> 16) ^ ((char) zza3);
                    byte[] bArr3 = {(byte) i4, (byte) (i4 >> 8)};
                    int i5 = i3 + i3;
                    bArr[i5] = bArr3[0];
                    bArr[i5 + 1] = bArr3[1];
                }
            }
            bArr2 = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArr2);
            byte[] digest = this.zzb.digest();
            int length2 = digest.length;
            if (length2 <= 4) {
                i = length2;
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(digest, 0, bArr4, 0, i);
            return bArr4;
        }
    }
}
