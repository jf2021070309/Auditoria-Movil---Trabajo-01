package com.kwad.sdk.ip.direct;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.kwad.sdk.core.NetworkMonitor;
import com.kwad.sdk.core.response.model.HttpDnsInfo;
import com.kwad.sdk.h;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.service.a.e;
import com.kwad.sdk.service.a.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
public final class a {
    private static volatile boolean aCp;
    private static c aCx;
    private static HandlerThread aCy;
    private static Handler aCz;
    private static int aCo = -1;
    private static List<HttpDnsInfo.IpInfo> aCq = new ArrayList();
    private static List<HttpDnsInfo.IpInfo> aCr = new ArrayList();
    private static List<HttpDnsInfo.IpInfo> aCs = new ArrayList();
    private static List<c> aCt = new ArrayList();
    private static List<c> aCu = new ArrayList();
    private static PriorityBlockingQueue<c> aCv = new PriorityBlockingQueue<>();
    private static AtomicInteger aCw = new AtomicInteger(0);
    private static volatile boolean aCA = false;
    private static float aCB = -1.0f;
    private static float aCC = -1.0f;
    private static float aCD = -1.0f;
    private static int aCE = 0;
    private static volatile boolean aCF = false;
    private static volatile boolean aCG = false;
    private static NetworkMonitor.a aCH = new NetworkMonitor.a() { // from class: com.kwad.sdk.ip.direct.a.1
        @Override // com.kwad.sdk.core.NetworkMonitor.a
        public final void a(NetworkMonitor.NetworkState networkState) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "*********onNetworkChange");
            if (!a.aCG) {
                a.access$002(true);
                return;
            }
            a.access$102(true);
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "*********onNetworkChange sHasNetChanged true");
        }
    };
    private static Runnable aCI = new Runnable() { // from class: com.kwad.sdk.ip.direct.a.3
        @Override // java.lang.Runnable
        public final void run() {
            a.FH();
        }
    };

    private static void C(List<HttpDnsInfo.IpInfo> list) {
        b(list, aCt);
        if (aCt.isEmpty()) {
            return;
        }
        float f = 0.0f;
        for (c cVar : aCt) {
            f += cVar.FY();
        }
        aCB = f / aCt.size();
    }

    private static void D(List<HttpDnsInfo.IpInfo> list) {
        b(list, aCu);
        if (aCu.isEmpty()) {
            return;
        }
        int i = 0;
        float f = 0.0f;
        for (c cVar : aCu) {
            i += cVar.getWeight();
            f += cVar.getWeight() * cVar.FY();
        }
        if (i != 0) {
            aCC = f / i;
        }
    }

    private static void FC() {
        Handler handler;
        if (aCA || (handler = aCz) == null) {
            return;
        }
        handler.obtainMessage(1).sendToTarget();
    }

    public static String FD() {
        c cVar = aCx;
        return cVar != null ? cVar.getIp() : "";
    }

    public static float FE() {
        return aCB;
    }

    public static float FF() {
        return aCC;
    }

    public static float FG() {
        return aCD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FH() {
        FM();
        List<HttpDnsInfo.IpInfo> list = aCq;
        List<HttpDnsInfo.IpInfo> list2 = aCr;
        clear();
        if (aCA) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "is picking return");
            return;
        }
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "start pick");
        aCA = true;
        C(list);
        D(list2);
        if (aCt.isEmpty() && aCu.isEmpty()) {
            f fVar = (f) ServiceProvider.get(f.class);
            if (fVar == null) {
                aCA = false;
                return;
            } else if (!fVar.xE()) {
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "isIpPreferEnable:false");
                aCA = false;
                return;
            } else {
                FK();
            }
        }
        aCA = false;
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "end pick");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void FI() {
        if (FJ()) {
            return;
        }
        FL();
    }

    private static boolean FJ() {
        List<c> list = aCt;
        List<c> list2 = aCu;
        if (!list.isEmpty()) {
            aCx = list.get(new Random().nextInt(list.size()));
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from recommend:" + aCx);
            aCE = 1;
            return true;
        }
        int i = 0;
        if (list2.isEmpty()) {
            return false;
        }
        Random random = new Random();
        int i2 = 0;
        for (c cVar : list2) {
            i2 += cVar.getWeight();
        }
        int nextInt = random.nextInt(i2);
        int i3 = 0;
        while (true) {
            if (i3 >= list2.size()) {
                break;
            }
            nextInt -= list2.get(i3).getWeight();
            if (nextInt < 0) {
                i = i3;
                break;
            }
            i3++;
        }
        aCx = list2.get(i);
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from backUp:" + aCx);
        aCE = 2;
        return true;
    }

    private static void FK() {
        List<HttpDnsInfo.IpInfo> list = aCs;
        if (list.isEmpty()) {
            return;
        }
        for (HttpDnsInfo.IpInfo ipInfo : list) {
            if (ipInfo != null && !TextUtils.isEmpty(ipInfo.ip)) {
                c f = b.f(ipInfo.ip, aCo);
                if (f.isSuccess()) {
                    aCv.offer(f);
                }
            }
        }
        c peek = aCv.peek();
        if (peek != null) {
            aCD = peek.FY();
        }
    }

    private static void FL() {
        if (aCv.isEmpty()) {
            return;
        }
        c peek = aCv.peek();
        if (peek.FY() < aCo) {
            aCx = peek;
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set from Other:" + aCx);
            aCE = 3;
        }
    }

    private static void FM() {
        if (aCo == -1) {
            f fVar = (f) ServiceProvider.get(f.class);
            if (fVar != null) {
                aCo = fVar.xF();
            } else {
                aCo = 200;
            }
        }
    }

    private static boolean FN() {
        if (aCF) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sHasNetChanged direct can not use");
            return false;
        }
        int i = aCw.get();
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "value:" + i);
        return i <= 3;
    }

    private static void FO() {
        aCw.getAndIncrement();
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "addFailedTimes:" + aCw.intValue());
    }

    public static void FP() {
        c cVar;
        Handler handler;
        if (!aCp || (cVar = aCx) == null || TextUtils.isEmpty(cVar.getIp()) || (handler = aCz) == null) {
            return;
        }
        handler.obtainMessage(2).sendToTarget();
    }

    public static void FQ() {
        FO();
        FR();
        FS();
        aCE = 0;
        FI();
        FH();
    }

    private static void FR() {
        HttpDnsInfo.IpInfo ipInfo;
        HttpDnsInfo.IpInfo ipInfo2;
        c cVar = aCx;
        String ip = cVar == null ? "" : cVar.getIp();
        if (TextUtils.isEmpty(ip)) {
            return;
        }
        Iterator<HttpDnsInfo.IpInfo> it = aCq.iterator();
        while (true) {
            ipInfo = null;
            if (!it.hasNext()) {
                ipInfo2 = null;
                break;
            }
            ipInfo2 = it.next();
            if (ipInfo2 != null && TextUtils.equals(ip, ipInfo2.ip)) {
                break;
            }
        }
        if (ipInfo2 != null) {
            aCq.remove(ipInfo2);
            ipInfo2 = null;
        }
        Iterator<HttpDnsInfo.IpInfo> it2 = aCr.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            HttpDnsInfo.IpInfo next = it2.next();
            if (next != null && TextUtils.equals(ip, next.ip)) {
                ipInfo2 = next;
                break;
            }
        }
        if (ipInfo2 != null) {
            aCr.remove(ipInfo2);
        } else {
            ipInfo = ipInfo2;
        }
        Iterator<HttpDnsInfo.IpInfo> it3 = aCs.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            HttpDnsInfo.IpInfo next2 = it3.next();
            if (next2 != null && TextUtils.equals(ip, next2.ip)) {
                ipInfo = next2;
                break;
            }
        }
        if (ipInfo != null) {
            aCs.remove(ipInfo);
        }
    }

    private static void FS() {
        c cVar;
        if (aCx == null) {
            return;
        }
        List<c> list = aCt;
        if (list != null && !list.isEmpty() && aCt.contains(aCx)) {
            aCt.remove(aCx);
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sRecommendEntityList remove:" + aCx);
        }
        List<c> list2 = aCu;
        if (list2 != null && !list2.isEmpty()) {
            if (aCu.contains(aCx)) {
                aCu.remove(aCx);
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sBackUpIpEntityList remove:" + aCx);
            }
            Iterator<c> it = aCu.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                if (cVar != null && TextUtils.equals(cVar.getIp(), aCx.getIp())) {
                    com.kwad.sdk.core.e.c.d("IpDirect_Helper", "set removeEntity:" + cVar.getIp());
                    break;
                }
            }
            if (cVar != null) {
                aCu.remove(cVar);
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", "sBackUpIpEntityList remove removeEntity:" + cVar);
            }
        }
        c peek = aCv.peek();
        if (peek != null && peek == aCx) {
            aCv.poll();
        }
        aCx = null;
    }

    public static void a(HttpDnsInfo httpDnsInfo) {
        if (httpDnsInfo == null) {
            return;
        }
        f fVar = (f) ServiceProvider.get(f.class);
        if (fVar == null) {
            com.kwad.sdk.core.e.c.w("IpDirect_Helper", "sdkConfigProvider == null");
            return;
        }
        boolean xD = fVar.xD();
        aCp = xD;
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", "isEnable:" + xD);
        if (xD) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", httpDnsInfo.toString());
            aCq = httpDnsInfo.recommendList;
            aCr = httpDnsInfo.backUpList;
            aCs = httpDnsInfo.otherList;
            if (aCq.isEmpty() && aCr.isEmpty() && aCs.isEmpty()) {
                com.kwad.sdk.core.e.c.w("IpDirect_Helper", "HttpDnsInfo is empty");
                return;
            }
            init();
            FC();
        }
    }

    static /* synthetic */ boolean access$002(boolean z) {
        aCG = true;
        return true;
    }

    static /* synthetic */ boolean access$102(boolean z) {
        aCF = true;
        return true;
    }

    private static void b(List<HttpDnsInfo.IpInfo> list, List<c> list2) {
        if (list == null) {
            return;
        }
        for (HttpDnsInfo.IpInfo ipInfo : list) {
            if (ipInfo != null && !TextUtils.isEmpty(ipInfo.ip)) {
                com.kwad.sdk.core.e.c.d("IpDirect_Helper", ipInfo.toString());
                c f = b.f(ipInfo.ip, aCo);
                f.cF(ipInfo.weight);
                if (f.isSuccess() && f.FY() < aCo) {
                    list2.add(f);
                }
            }
        }
    }

    private static void clear() {
        aCt.clear();
        aCu.clear();
        aCv.clear();
    }

    public static String eV(String str) {
        String str2;
        if (!aCp) {
            str2 = "getIpByHost return by sIpDirectEnable false";
        } else if (eW(str)) {
            str2 = "isHostInvalid:false ：" + str;
        } else if (FN()) {
            String FD = FD();
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "getIpByHost ip:" + FD);
            return FD;
        } else {
            str2 = "canUseIpDirect:false";
        }
        com.kwad.sdk.core.e.c.d("IpDirect_Helper", str2);
        return "";
    }

    private static boolean eW(String str) {
        boolean z = !TextUtils.equals("https://" + str, h.wY());
        if (z) {
            com.kwad.sdk.core.e.c.d("IpDirect_Helper", "非核心域名 current host:" + h.wY() + "try direct host:https://" + str);
        }
        return z;
    }

    public static int getType() {
        return aCE;
    }

    private static void init() {
        if (aCy != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("IpDirectHelper");
        aCy = handlerThread;
        handlerThread.start();
        aCz = new Handler(aCy.getLooper()) { // from class: com.kwad.sdk.ip.direct.a.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i == 1) {
                    a.FH();
                    a.FI();
                } else if (i != 2) {
                } else {
                    a.FQ();
                }
            }
        };
        e eVar = (e) ServiceProvider.get(e.class);
        if (eVar != null) {
            NetworkMonitor.getInstance().a(eVar.getContext(), aCH);
        }
    }
}
