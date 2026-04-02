package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
/* loaded from: classes.dex */
public class t {
    public static int a(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("network_ad_num_")) {
                return Integer.valueOf(str.substring(15)).intValue();
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public static String a(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            sb.append(iArr[i]);
            if (i != iArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
