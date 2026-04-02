package com.qq.e.comm.managers.plugin;

import com.facebook.appevents.AppEventsConstants;
import com.kuaishou.weapon.p0.t;
/* loaded from: classes3.dex */
class d {
    private static final String[] a = {AppEventsConstants.EVENT_PARAM_VALUE_NO, "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", t.l, "c", t.t, "e", "f"};

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i : bArr) {
            if (i < 0) {
                i += 256;
            }
            StringBuilder sb = new StringBuilder();
            String[] strArr = a;
            sb.append(strArr[i / 16]);
            sb.append(strArr[i % 16]);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }
}
