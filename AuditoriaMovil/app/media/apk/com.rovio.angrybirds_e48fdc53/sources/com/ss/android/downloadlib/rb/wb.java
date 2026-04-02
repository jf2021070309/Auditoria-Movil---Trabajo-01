package com.ss.android.downloadlib.rb;

import android.text.TextUtils;
import com.ss.android.downloadlib.activity.TTDelegateActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class wb {
    private static Map<String, dr> dr = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes3.dex */
    public interface dr {
        void dr();

        void dr(String str);
    }

    public static void dr(String[] strArr, dr drVar) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        dr(valueOf, drVar);
        TTDelegateActivity.dr(valueOf, strArr);
    }

    public static void dr(String str) {
        dr o;
        if (TextUtils.isEmpty(str) || (o = o(str)) == null) {
            return;
        }
        o.dr();
    }

    public static void dr(String str, String str2) {
        dr o;
        if (TextUtils.isEmpty(str) || (o = o(str)) == null) {
            return;
        }
        o.dr(str2);
    }

    private static void dr(String str, dr drVar) {
        if (TextUtils.isEmpty(str) || drVar == null) {
            return;
        }
        dr.put(str, drVar);
    }

    private static dr o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return dr.remove(str);
    }

    public static boolean ge(String str) {
        return com.ss.android.downloadlib.addownload.wb.q().dr(com.ss.android.downloadlib.addownload.wb.getContext(), str);
    }
}
