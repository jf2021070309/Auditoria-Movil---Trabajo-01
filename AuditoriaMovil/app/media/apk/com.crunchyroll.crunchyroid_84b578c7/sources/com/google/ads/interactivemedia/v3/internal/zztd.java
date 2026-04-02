package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztd {
    public static Object zza(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public static HashMap zzb(int i) {
        int i2;
        if (i < 3) {
            zzrv.zza(i, "expectedSize");
            i2 = i + 1;
        } else if (i < 1073741824) {
            i2 = (int) Math.ceil(i / 0.75d);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        return new HashMap(i2);
    }
}
