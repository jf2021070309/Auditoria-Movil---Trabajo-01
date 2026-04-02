package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
abstract class zzwk {
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    public final boolean zzb(byte[] bArr, int i, int i2) {
        if (zza(0, bArr, 0, i2) != 0) {
            return false;
        }
        return true;
    }
}
