package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
abstract class zzes {
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    public final boolean zzb(byte[] bArr, int i, int i2) {
        if (zza(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }
}
