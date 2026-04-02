package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaic {
    public static boolean zza(Object[] objArr, Object obj) {
        if (objArr != null) {
            if (obj == null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        return true;
                    }
                }
            } else {
                for (Object obj3 : objArr) {
                    if (obj.equals(obj3)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
