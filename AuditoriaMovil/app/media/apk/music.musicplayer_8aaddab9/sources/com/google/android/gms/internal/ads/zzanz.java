package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.a.d.a.a;
import java.util.Arrays;
@TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
/* loaded from: classes.dex */
public final class zzanz {
    public static final zzanz zza = new zzanz(new int[]{2}, 2);
    private final int[] zzb;
    private final int zzc;

    public zzanz(int[] iArr, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, 1);
        this.zzb = copyOf;
        Arrays.sort(copyOf);
        this.zzc = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzanz) && Arrays.equals(this.zzb, ((zzanz) obj).zzb);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzb) * 31) + 2;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zzb);
        return a.s(new StringBuilder(String.valueOf(arrays).length() + 67), "AudioCapabilities[maxChannelCount=2, supportedEncodings=", arrays, "]");
    }
}
