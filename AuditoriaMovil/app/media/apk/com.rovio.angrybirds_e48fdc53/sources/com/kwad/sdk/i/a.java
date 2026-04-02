package com.kwad.sdk.i;

import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.g;
import com.kwad.sdk.utils.t;
import com.kwad.sdk.utils.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class a {
    private static List<String> aCX;
    private static volatile boolean aCY;

    /* renamed from: com.kwad.sdk.i.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0267a extends com.kwad.sdk.core.response.a.a {
        public long aCZ;
        public long aDa;
        public long aDb;
        public String aDc;
        public String aDd;
        public String aDe;
        public String sdkVersion;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {
        private String aDc;
        private String aDd;
        private String aDe;
        private String sdkVersion;

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String a(b bVar) {
            return "exit&" + bVar.aDc + "&" + bVar.aDd + "&" + bVar.aDe + "&" + bVar.sdkVersion;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String c(String str, String str2, String str3, String str4) {
            return str + "&" + str2 + "&" + str3 + "&" + str4 + "&" + KsAdSDKImpl.get().getSDKVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b eZ(String str) {
            String[] split = str.split("&");
            b bVar = new b();
            bVar.aDc = split[1];
            bVar.aDd = split[2];
            bVar.aDe = split[3];
            bVar.sdkVersion = split[4];
            return bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void FZ() {
        synchronized (a.class) {
            List<C0267a> Gb = Gb();
            if (!Gb.isEmpty()) {
                c.d("DynamicRunMonitor", "monitorInfoList:" + Gb);
                JSONObject jSONObject = new JSONObject();
                t.putValue(jSONObject, "monitor_info_list", Gb);
                KSLoggerReporter.s(jSONObject);
            }
            aCY = true;
            Ga();
        }
    }

    private static void Ga() {
        List<String> list = aCX;
        if (list == null) {
            return;
        }
        for (String str : list) {
            eX(str);
        }
        aCX.clear();
    }

    private static synchronized List<C0267a> Gb() {
        synchronized (a.class) {
            ArrayList arrayList = new ArrayList();
            Map<String, ?> ai = y.ai(ServiceProvider.getContext(), "dynamic_monitor_info");
            if (ai == null) {
                return arrayList;
            }
            for (String str : ai.keySet()) {
                if (str.startsWith("enter")) {
                    Object obj = ai.get(str);
                    long longValue = obj instanceof Long ? ((Long) obj).longValue() : 0L;
                    b eZ = b.eZ(str);
                    String a = b.a(eZ);
                    Object obj2 = ai.get(a);
                    long longValue2 = longValue - (obj2 instanceof Long ? ((Long) obj2).longValue() : 0L);
                    long j = longValue2 > 0 ? longValue2 : 0L;
                    C0267a c0267a = new C0267a();
                    c0267a.aCZ = longValue;
                    c0267a.aDa = j;
                    c0267a.aDb = longValue2;
                    c0267a.aDc = eZ.aDc;
                    c0267a.aDd = eZ.aDd;
                    c0267a.aDe = eZ.aDe;
                    c0267a.sdkVersion = eZ.sdkVersion;
                    arrayList.add(c0267a);
                    y.ao("dynamic_monitor_info", str);
                    y.ao("dynamic_monitor_info", a);
                }
            }
            return arrayList;
        }
    }

    public static void ae(String str, String str2) {
        g(str, str2, "other");
    }

    public static void af(String str, String str2) {
        h(str, str2, "other");
    }

    private static synchronized void b(String str, String str2, String str3, String str4) {
        String c;
        synchronized (a.class) {
            try {
                c = b.c(str, str2, str3, str4);
            } catch (Throwable th) {
                com.kwad.components.core.d.a.b(th);
            }
            if (aCY) {
                eX(c);
            } else {
                eY(c);
            }
        }
    }

    private static synchronized void eX(String str) {
        synchronized (a.class) {
            long b2 = y.b("dynamic_monitor_info", str, 0L);
            c.d("DynamicRunMonitor", "increaseLocalCount: " + str + "--lastCount:" + b2);
            y.a("dynamic_monitor_info", str, b2 + 1);
        }
    }

    private static void eY(String str) {
        if (aCX == null) {
            aCX = new CopyOnWriteArrayList();
        }
        c.d("DynamicRunMonitor", "saveToCache: " + str);
        aCX.add(str);
    }

    public static void g(String str, String str2, String str3) {
        b("enter", str, str2, str3);
    }

    public static void h(String str, String str2, String str3) {
        b("exit", str, str2, str3);
    }

    public static void report() {
        g.schedule(new aw() { // from class: com.kwad.sdk.i.a.1
            @Override // com.kwad.sdk.utils.aw
            public final void doTask() {
                a.FZ();
            }
        }, 1L, TimeUnit.SECONDS);
    }
}
