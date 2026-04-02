package com.kwad.sdk.crash.online.monitor.block;

import android.os.Looper;
import android.util.Printer;
import com.kwad.sdk.utils.s;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private static volatile boolean aAE;
    private static String aAF;
    private static List<String> aAG;
    private static List<String> aAH;
    private static volatile boolean aAI;
    private static volatile boolean aAJ;

    public static boolean EV() {
        if (aAE) {
            return false;
        }
        try {
            return ((Printer) s.f(Looper.getMainLooper(), "mLogging")) != null;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("perfMonitor.MonitorDetector", "hasBlockMonitor ", e);
            aAE = true;
            return false;
        }
    }

    public static boolean EW() {
        if (aAJ) {
            return aAI;
        }
        try {
            String str = new String(com.kwad.sdk.core.a.c.AK().decode("Y29tLnRlbmNlbnQubWF0cml4Lk1hdHJpeA=="));
            com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "hasMatrix after:" + str);
            if (Class.forName(str) != null) {
                return true;
            }
        } catch (ClassNotFoundException e) {
        }
        aAI = false;
        aAJ = true;
        return aAI;
    }

    public static void a(com.kwad.sdk.crash.online.monitor.a.a aVar) {
        aAG = aVar.aBd;
        aAH = aVar.aBe;
    }

    private static boolean a(List<String> list, boolean z) {
        if (aAE) {
            return false;
        }
        try {
            Printer printer = (Printer) s.f(Looper.getMainLooper(), "mLogging");
            if (printer != null) {
                aAF = printer.getClass().getName();
                com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "originPrinter name:" + printer.getClass().getName());
                if (z) {
                    e.eI(aAF);
                }
                for (String str : list) {
                    String str2 = new String(com.kwad.sdk.core.a.c.AK().decode(str));
                    com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer after:" + str2);
                    if (printer.getClass().getName().contains(str2)) {
                        com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer monitor");
                        return true;
                    }
                }
            } else {
                com.kwad.sdk.core.e.c.d("perfMonitor.MonitorDetector", "printer not hook");
            }
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.e("perfMonitor.MonitorDetector", "hasBlockMonitor ", e);
            aAE = true;
        }
        return false;
    }

    public static boolean bq(boolean z) {
        List<String> list = aAG;
        return (list == null || list.isEmpty()) ? f("Y29tLnRlbmNlbnQubWF0cml4LnRyYWNlLmNvcmUuTG9vcGVyTW9uaXRvcg==", true) : a(aAG, true);
    }

    public static boolean br(boolean z) {
        List<String> list = aAH;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return a(aAH, false);
    }

    private static boolean f(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return a(arrayList, z);
    }
}
