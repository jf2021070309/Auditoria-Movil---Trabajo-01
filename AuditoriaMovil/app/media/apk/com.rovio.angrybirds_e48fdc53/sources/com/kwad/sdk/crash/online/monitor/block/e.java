package com.kwad.sdk.crash.online.monitor.block;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.crash.online.monitor.block.BlockEvent;
import com.kwad.sdk.crash.online.monitor.block.report.BlockReportAction;
import com.kwad.sdk.crash.report.h;
import com.kwad.sdk.crash.report.request.b;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class e {
    private static boolean BO() {
        int EZ = EZ();
        Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
        if (context == null) {
            return false;
        }
        long size = com.kwad.sdk.crash.online.monitor.block.report.a.by(context).size();
        com.kwad.sdk.core.e.c.d("perfMonitor.Reporter", "size:" + size + " limit:" + EZ);
        return size >= ((long) EZ);
    }

    private static int EZ() {
        com.kwad.sdk.crash.online.monitor.a.a EX = d.EX();
        if (EX != null) {
            return EX.aBi;
        }
        return 20;
    }

    static /* synthetic */ boolean Fa() {
        return BO();
    }

    public static void a(String str, long j, long j2, String str2, String str3, boolean z) {
        try {
            h(b(str, j, j2, str2, str3), false);
        } catch (Throwable th) {
        }
    }

    private static String b(String str, long j, long j2, String str2, String str3) {
        try {
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.w("perfMonitor.Reporter", Log.getStackTraceString(e));
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        str = eH(b.eC(str));
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (j2 == 0) {
            j2 = 2000;
        }
        return c(str, j, j2, str2, str3).toJson().toString();
    }

    private static BlockEvent c(String str, long j, long j2, String str2, String str3) {
        BlockEvent blockEvent = new BlockEvent();
        blockEvent.blockDuration = j2;
        blockEvent.currentActivity = str2;
        blockEvent.processName = str3;
        BlockEvent.a aVar = new BlockEvent.a();
        aVar.aAM = str;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        aVar.aAK = j;
        aVar.repeatCount = (int) (j2 / blockEvent.blockLoopInterval);
        blockEvent.stackTraceSample.add(aVar);
        return blockEvent;
    }

    private static String eE(String str) {
        String eF = eF(b.eC(str));
        return !TextUtils.isEmpty(eF) ? c(eF, 0L, 2000L, "", "").toJson().toString() : "";
    }

    private static String eF(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            if (str.contains("at ")) {
                str = str.substring(str.indexOf("at "));
            }
            String replaceAll = eG(str.replaceAll("at ", "")).replaceAll("\\)", "\\)\n");
            if (replaceAll.contains("\n")) {
                replaceAll = replaceAll.replaceAll("\n", "\n\tat ");
            }
            String replaceAll2 = (replaceAll + "_").replaceAll("\n\tat _", "\n");
            return "\n\tat " + replaceAll2;
        } catch (Exception e) {
            Log.e("perfMonitor.Reporter", Log.getStackTraceString(e));
            return str;
        }
    }

    private static String eG(String str) {
        return str != null ? Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("") : "";
    }

    private static String eH(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            boolean startsWith = str.startsWith(" \n");
            com.kwad.sdk.core.e.c.d("perfMonitor.Reporter", "oldVersion:" + startsWith);
            if (startsWith) {
                if (str.contains("at ")) {
                    str = str.substring(str.indexOf("at "));
                }
                str = str.replaceAll(":", "\\.") + "\n";
            }
            String replaceAll = str.replaceAll("at ", "").replaceAll(" ", "");
            if (replaceAll.contains("\n")) {
                replaceAll = replaceAll.replaceAll("\n", "\n\tat ");
            }
            return "\n\tat " + (replaceAll + "_").replaceAll("\n\tat _", "\n");
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.w("perfMonitor.Reporter", Log.getStackTraceString(e));
            return str;
        }
    }

    public static void eI(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.kwad.sdk.core.e.c.d("perfMonitor.Reporter", "reportPrinterName:" + str);
        if (d.EY()) {
            c cVar = new c();
            cVar.aAT = str;
            cVar.aAV = a.EW();
            KSLoggerReporter.z(cVar.toJson());
        }
    }

    public static void eJ(String str) {
        try {
            c cVar = new c();
            cVar.errorMsg = str;
            cVar.aAV = a.EW();
            KSLoggerReporter.z(cVar.toJson());
        } catch (Exception e) {
        }
        com.kwad.sdk.core.e.c.w("perfMonitor.Reporter", str);
    }

    public static void g(String str, boolean z) {
        String eE = eE(str);
        if (TextUtils.isEmpty(eE)) {
            return;
        }
        h(eE, false);
    }

    private static void h(final String str, final boolean z) {
        g.execute(new aw() { // from class: com.kwad.sdk.crash.online.monitor.block.e.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (z || e.xR() == 1) {
                    com.kwad.sdk.core.e.c.d("perfMonitor.Reporter", "report now :" + str);
                    h.ab("perf-block", str);
                    return;
                }
                BlockReportAction blockReportAction = new BlockReportAction(str);
                com.kwad.sdk.core.e.c.d("perfMonitor.Reporter", "write to db :" + blockReportAction.toJson().toString());
                final Context context = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
                if (context == null) {
                    return;
                }
                com.kwad.sdk.crash.online.monitor.block.report.a.by(context).j(blockReportAction);
                if (e.Fa()) {
                    final List<com.kwad.sdk.core.report.g> BW = com.kwad.sdk.crash.online.monitor.block.report.a.by(context).BW();
                    ArrayList arrayList = new ArrayList();
                    Iterator<com.kwad.sdk.core.report.g> it = BW.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BlockReportAction) it.next()).msg);
                    }
                    h.a("perf-block", arrayList, new b.a() { // from class: com.kwad.sdk.crash.online.monitor.block.e.1.1
                        @Override // com.kwad.sdk.crash.report.request.b.a
                        public final void onError(int i, String str2) {
                            com.kwad.sdk.core.e.c.w("perfMonitor.Reporter", "errorCode:" + i + " errorMsg:" + str2);
                        }

                        @Override // com.kwad.sdk.crash.report.request.b.a
                        public final void onSuccess() {
                            com.kwad.sdk.crash.online.monitor.block.report.a.by(context).t(BW);
                        }
                    });
                }
            }
        });
    }

    static /* synthetic */ int xR() {
        return EZ();
    }
}
