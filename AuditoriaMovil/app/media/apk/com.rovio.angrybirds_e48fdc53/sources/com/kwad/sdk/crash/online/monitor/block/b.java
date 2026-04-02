package com.kwad.sdk.crash.online.monitor.block;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class b {
    private static List<String> aAO;
    private static List<String> aAP;
    private static int aAQ = 5;

    public static void a(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        aAO = new ArrayList();
        if (aVar.aBc == null || aVar.aBc.isEmpty()) {
            aAO.add("com.kwad");
            aAO.add("com.kwai");
            aAO.add("com.ksad");
            aAO.add("tkruntime");
            aAO.add("tachikoma");
            aAO.add("kuaishou");
        } else {
            aAO.addAll(aVar.aBc);
        }
        aAQ = aVar.aBh;
        aAP = new ArrayList();
        if (aVar.aBb != null && !aVar.aBb.isEmpty()) {
            aAP.addAll(aVar.aBb);
            return;
        }
        aAP.add("android.");
        aAP.add("androidx.");
        aAP.add("org.");
        aAP.add("java.");
    }

    private static boolean eA(String str) {
        List<String> list = aAP;
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean eB(String str) {
        List<String> list = aAO;
        if (list == null) {
            return false;
        }
        for (String str2 : list) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static String eC(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("\n");
        com.kwad.sdk.core.e.c.d("perfMonitor.Filter", "stacks after split:" + split.length);
        boolean z = false;
        int i = 0;
        for (String str2 : split) {
            if (z || !eA(str2)) {
                if (i >= aAQ) {
                    return "";
                }
                if (eB(str2)) {
                    return str;
                }
                i++;
                z = true;
            }
        }
        return "";
    }
}
