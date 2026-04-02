package com.amazon.aps.iva.l3;

import android.os.Build;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.i0;
import java.util.HashMap;
/* compiled from: DevicePerformance.kt */
/* loaded from: classes.dex */
public final class a {
    public static final HashMap<String, Integer> b = i0.T(new j("robolectric-BrandX/ProductX/Device30:11", 30), new j("robolectric-BrandX/ProductX/Device31:12", 31), new j("OPPO/CPH2025EEA/OP4BA2L1:12", 30), new j("OPPO/CPH2207EEA/OP4F0BL1:12", 30), new j("OPPO/PENM00/OP4EC1:11", 30), new j("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), new j("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), new j("Xiaomi/umi_global/umi:11", 30), new j("realme/RMX2085/RMX2085L1:11", 30), new j("samsung/c1qsqw/c1q:12", 30), new j("samsung/o1quew/o1q:12", 30), new j("samsung/r0quew/r0q:12", 30), new j("samsung/r0sxxx/r0s:12", 30));
    public final int a;

    public a() {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = Build.VERSION.MEDIA_PERFORMANCE_CLASS;
        } else {
            i = 0;
        }
        i = i < 30 ? 0 : i;
        if (i <= 0) {
            String str = Build.BRAND;
            String str2 = Build.PRODUCT;
            String str3 = Build.DEVICE;
            String str4 = Build.VERSION.RELEASE;
            Integer num = b.get(str + '/' + ((Object) str2) + '/' + ((Object) str3) + ':' + ((Object) str4));
            int intValue = (num == null ? 0 : num).intValue();
            i = intValue >= 30 ? intValue : 0;
        }
        this.a = i;
    }
}
