package com.amazon.aps.iva.pa0;

import com.amazon.aps.iva.b30.j;
import com.amazon.aps.iva.oa0.f1;
import java.util.HashMap;
/* compiled from: SLGoogleReferrer.java */
/* loaded from: classes4.dex */
public final class c {
    public static HashMap a;

    static {
        new j(c.class.getSimpleName());
    }

    public static void a(String str, String str2, long j, long j2, String str3, long j3, long j4) {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put("referrer", str);
        a.put("referrer_source", str2);
        a.put("clickTimestampSeconds", Long.valueOf(j));
        a.put("installBeginTimestampSeconds", Long.valueOf(j2));
        HashMap hashMap2 = a;
        int i = f1.b;
        hashMap2.put("current_device_time", Long.valueOf(System.currentTimeMillis()));
        a.put("installVersion", str3);
        a.put("clickTimestampServerSeconds", Long.valueOf(j3));
        a.put("installBeginTimestampServerSeconds", Long.valueOf(j4));
    }
}
