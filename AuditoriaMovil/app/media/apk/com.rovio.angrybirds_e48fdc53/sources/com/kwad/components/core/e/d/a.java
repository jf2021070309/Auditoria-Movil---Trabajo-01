package com.kwad.components.core.e.d;

import android.content.Context;
import android.text.TextUtils;
import com.kwad.components.core.page.AdWebViewActivityProxy;
import com.kwad.components.core.page.AdWebViewVideoActivityProxy;
import com.kwad.components.core.webview.b.a.k;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class a {
    private static List<WeakReference<k.b>> JI;

    /* renamed from: com.kwad.components.core.e.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0197a {
        private boolean JJ;
        private boolean JK;
        private boolean JL;
        private b JM;
        private c JN;
        private boolean JO;
        private long JP;
        private boolean JQ;
        private boolean JR;
        private z.b JS;
        private JSONObject JT;
        private boolean JU = false;
        private boolean JV;
        private int JW;
        private int JX;
        private int JY;
        private Callable<String> JZ;
        private String Ka;
        private AdTemplate adTemplate;
        private final Context context;
        private int jG;
        private int jI;

        public C0197a(Context context) {
            this.context = context;
        }

        public final C0197a S(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
            return this;
        }

        public final C0197a a(b bVar) {
            this.JM = bVar;
            return this;
        }

        public final C0197a a(z.b bVar) {
            this.JS = bVar;
            return this;
        }

        public final C0197a a(Callable<String> callable) {
            this.JZ = callable;
            return this;
        }

        public final C0197a al(boolean z) {
            this.JO = z;
            return this;
        }

        public final C0197a am(int i) {
            this.JY = i;
            return this;
        }

        public final C0197a am(boolean z) {
            this.JQ = z;
            return this;
        }

        public final C0197a an(int i) {
            this.jI = i;
            return this;
        }

        public final C0197a an(String str) {
            this.Ka = str;
            return this;
        }

        public final C0197a an(boolean z) {
            this.JR = z;
            return this;
        }

        public final C0197a ao(int i) {
            this.jG = i;
            return this;
        }

        public final C0197a ao(boolean z) {
            this.JU = z;
            return this;
        }

        public final C0197a ap(int i) {
            this.JW = i;
            return this;
        }

        public final C0197a ap(boolean z) {
            this.JK = z;
            return this;
        }

        public final C0197a aq(int i) {
            this.JX = i;
            return this;
        }

        public final C0197a aq(boolean z) {
            this.JL = true;
            return this;
        }

        public final C0197a ar(boolean z) {
            this.JJ = z;
            return this;
        }

        public final C0197a as(boolean z) {
            this.JV = z;
            return this;
        }

        public final C0197a b(c cVar) {
            this.JN = cVar;
            return this;
        }

        public final int cW() {
            return this.jG;
        }

        public final int cZ() {
            return this.jI;
        }

        public final C0197a d(JSONObject jSONObject) {
            this.JT = jSONObject;
            return this;
        }

        public final AdTemplate getAdTemplate() {
            return this.adTemplate;
        }

        public final z.b getClientParams() {
            return this.JS;
        }

        public final Context getContext() {
            return this.context;
        }

        public final c hk() {
            return this.JN;
        }

        public final JSONObject hx() {
            return this.JT;
        }

        public final String nk() {
            return this.Ka;
        }

        public final Callable<String> nl() {
            return this.JZ;
        }

        public final b nm() {
            return this.JM;
        }

        public final int nn() {
            return this.JY;
        }

        public final boolean no() {
            return this.JO;
        }

        public final long np() {
            return this.JP;
        }

        public final boolean nq() {
            return this.JQ;
        }

        public final boolean nr() {
            return this.JR;
        }

        public final boolean ns() {
            return this.JU;
        }

        public final boolean nt() {
            return this.JK;
        }

        public final boolean nu() {
            return this.JL;
        }

        public final boolean nv() {
            return this.JJ;
        }

        public final boolean nw() {
            return this.JV;
        }

        public final int nx() {
            return this.JW;
        }

        public final int ny() {
            return this.JX;
        }

        public final C0197a s(long j) {
            this.JP = j;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void onAdClicked();
    }

    public static int a(Context context, AdTemplate adTemplate, b bVar, c cVar, boolean z, boolean z2, boolean z3) {
        adTemplate.converted = true;
        d.at(false);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
        C0197a S = new C0197a(context).S(adTemplate);
        int af = com.kwad.sdk.core.response.b.a.af(ck);
        if (!(z3 || S.ny() == 2 || S.ny() == 1) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aK(ck)) && !S.nu()) {
            if (af == 1) {
                boolean aZ = com.kwad.sdk.core.response.b.a.aZ(ck);
                bVar.onAdClicked();
                if (aZ) {
                    c(S.getContext(), adTemplate);
                } else {
                    a(S.getContext(), new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(adTemplate)).V(adTemplate).oE());
                }
                return 0;
            } else if (af == 2) {
                if (a(S, 1) != 1) {
                    boolean aZ2 = com.kwad.sdk.core.response.b.a.aZ(ck);
                    bVar.onAdClicked();
                    if (aZ2) {
                        c(S.getContext(), adTemplate);
                    } else {
                        a(S.getContext(), new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(adTemplate)).V(adTemplate).oE());
                    }
                    return 0;
                }
                d.at(true);
                bVar.onAdClicked();
                return 0;
            }
        }
        if (a(S, 1) != 1) {
            if (!com.kwad.sdk.core.response.b.a.ax(ck)) {
                bVar.onAdClicked();
                if (com.kwad.sdk.utils.d.f(context, com.kwad.sdk.core.response.b.a.cz(ck), com.kwad.sdk.core.response.b.a.aq(ck))) {
                    com.kwad.sdk.core.report.a.l(adTemplate, 0);
                } else {
                    a(context, new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(adTemplate)).V(adTemplate).oE());
                }
                return 0;
            } else if (cVar != null) {
                int m = cVar.m(new C0197a(context).al(z).S(adTemplate).am(z2).ao(false));
                if (ck.status != 2 && ck.status != 3) {
                    bVar.onAdClicked();
                }
                return m;
            } else {
                return 0;
            }
        }
        d.at(true);
        bVar.onAdClicked();
        return 0;
    }

    public static int a(C0197a c0197a) {
        d.at(false);
        BusinessType businessType = c0197a.adTemplate != null ? c0197a.adTemplate.getBusinessType() : null;
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(businessType, "adClick").report();
        if (c0197a.nv()) {
            a(c0197a.getContext(), c0197a.getAdTemplate(), c0197a.nm(), c0197a.hk(), c0197a.JO, c0197a.nq(), false);
            return 0;
        } else if (b(c0197a)) {
            return 0;
        } else {
            c0197a.getAdTemplate().converted = true;
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(c0197a.getAdTemplate());
            com.kwad.sdk.components.c.f(com.kwad.components.a.a.a.class);
            int af = com.kwad.sdk.core.response.b.a.af(ck);
            if (!(c0197a.ny() == 2 || c0197a.ny() == 1) && !TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aK(ck)) && !c0197a.nu()) {
                if (af == 1) {
                    boolean aZ = com.kwad.sdk.core.response.b.a.aZ(ck);
                    e(c0197a);
                    if (aZ) {
                        c(c0197a.getContext(), c0197a.getAdTemplate());
                    } else {
                        a(c0197a.getContext(), new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(c0197a.getAdTemplate())).V(c0197a.getAdTemplate()).oE());
                    }
                    return 0;
                } else if (af == 2) {
                    if (a(c0197a, 1) == 1) {
                        if (com.kwad.sdk.core.response.b.a.cv(ck)) {
                            com.kwad.sdk.core.report.a.n(c0197a.getAdTemplate(), (int) Math.ceil(((float) c0197a.np()) / 1000.0f));
                        }
                        d.at(true);
                        e(c0197a);
                        return 0;
                    }
                    boolean aZ2 = com.kwad.sdk.core.response.b.a.aZ(ck);
                    e(c0197a);
                    if (aZ2) {
                        c(c0197a.getContext(), c0197a.getAdTemplate());
                    } else {
                        a(c0197a.getContext(), new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(c0197a.getAdTemplate())).V(c0197a.getAdTemplate()).oE());
                    }
                    return 0;
                }
            }
            if (a(c0197a, 1) == 1) {
                if (com.kwad.sdk.core.response.b.a.cv(ck) || com.kwad.sdk.core.response.b.a.cw(ck)) {
                    com.kwad.sdk.core.report.a.n(c0197a.getAdTemplate(), (int) Math.ceil(((float) c0197a.np()) / 1000.0f));
                }
                d.at(true);
                e(c0197a);
                return 0;
            } else if (e.e(c0197a.getContext(), c0197a.getAdTemplate()) == 1) {
                e(c0197a);
                KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(businessType, "smallAppSuccess").report();
                return 0;
            } else if (c0197a.nt() && !com.kwad.sdk.core.response.b.a.ax(ck)) {
                e(c0197a);
                i(c0197a);
                return 0;
            } else if (!com.kwad.sdk.core.response.b.a.ax(ck)) {
                if (c0197a.getAdTemplate().isWebViewDownload) {
                    return h(c0197a);
                }
                boolean f = com.kwad.sdk.utils.d.f(c0197a.getContext(), com.kwad.sdk.core.response.b.a.cz(ck), com.kwad.sdk.core.response.b.a.aq(ck));
                e(c0197a);
                if (f) {
                    com.kwad.sdk.core.report.a.l(c0197a.getAdTemplate(), 0);
                    return 0;
                }
                a(c0197a.getContext(), new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(c0197a.getAdTemplate())).V(c0197a.getAdTemplate()).oE());
                return 0;
            } else {
                if (com.kwad.sdk.core.response.b.a.ax(ck)) {
                    if (c0197a.ny() == 2 || c0197a.ny() == 1) {
                        c0197a.ao(false);
                        e(c0197a);
                    } else {
                        e(c0197a);
                        if (!c(c0197a)) {
                            c0197a.ao(true);
                        }
                    }
                    return h(c0197a);
                }
                return 0;
            }
        }
    }

    private static int a(C0197a c0197a, int i) {
        AdTemplate adTemplate = c0197a.getAdTemplate();
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck((adTemplate == null || adTemplate.mAdScene == null) ? null : KSLoggerReporter.cs(adTemplate.mAdScene.getAdStyle()), "dplinkStart").report();
        boolean z = true;
        int b2 = d.b(c0197a, 1);
        String a = d.a(c0197a, adTemplate);
        if (!TextUtils.isEmpty(a) && !a.contains(" ")) {
            z = false;
        }
        if (z) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_convert").aO(adTemplate).T("dpLinkError", a).report();
        }
        return b2;
    }

    private static void a(Context context, AdWebViewActivityProxy.a aVar) {
        AdWebViewActivityProxy.launch(context, aVar);
    }

    public static void a(k.b bVar) {
        if (JI == null) {
            JI = new CopyOnWriteArrayList();
        }
        JI.add(new WeakReference<>(bVar));
    }

    public static void b(k.b bVar) {
        if (JI == null) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= JI.size()) {
                i = -1;
                break;
            }
            WeakReference<k.b> weakReference = JI.get(i);
            if (weakReference != null && weakReference.get() != null && bVar == weakReference.get()) {
                break;
            }
            i++;
        }
        if (i != -1) {
            JI.remove(i);
        }
    }

    private static boolean b(C0197a c0197a) {
        return com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(c0197a.getAdTemplate())) ? !c0197a.nw() && c.s(c0197a) == 3 : d(c0197a) == 1;
    }

    private static void c(Context context, AdTemplate adTemplate) {
        AdWebViewVideoActivityProxy.launch(context, adTemplate);
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(adTemplate.mAdScene != null ? KSLoggerReporter.cs(adTemplate.mAdScene.getAdStyle()) : null, "toVideoH5Web").report();
    }

    private static boolean c(C0197a c0197a) {
        AdTemplate adTemplate = c0197a.getAdTemplate();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (!c0197a.nt() || !com.kwad.sdk.core.response.b.a.b(ck, com.kwad.sdk.core.config.d.zn()) || TextUtils.isEmpty(com.kwad.sdk.core.response.b.a.aK(ck)) || AdWebViewVideoActivityProxy.showingAdWebViewVideoActivity || c0197a.hk().nG()) {
            return false;
        }
        c(c0197a.getContext(), adTemplate);
        return true;
    }

    private static int d(C0197a c0197a) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(c0197a.getAdTemplate());
        if (ck.unDownloadConf.unDownloadRegionConf != null) {
            int cW = c0197a.cW();
            return cW != 2 ? cW != 3 ? ck.unDownloadConf.unDownloadRegionConf.actionBarType : ck.unDownloadConf.unDownloadRegionConf.materialJumpType : ck.unDownloadConf.unDownloadRegionConf.describeBarType;
        }
        return 0;
    }

    private static void e(C0197a c0197a) {
        g(c0197a);
        f(c0197a);
        if (c0197a.nm() != null) {
            c0197a.nm().onAdClicked();
        }
    }

    private static void f(C0197a c0197a) {
        if (c0197a.nr()) {
            com.kwad.sdk.core.report.a.a(c0197a.adTemplate, c0197a.JS, c0197a.hx());
        }
    }

    private static void g(C0197a c0197a) {
        k.b bVar;
        List<WeakReference<k.b>> list = JI;
        if (list == null || list.isEmpty() || c0197a.adTemplate == null) {
            return;
        }
        for (WeakReference<k.b> weakReference : JI) {
            if (weakReference != null && (bVar = weakReference.get()) != null) {
                bVar.E(com.kwad.sdk.core.response.b.d.cu(c0197a.adTemplate));
            }
        }
    }

    private static int h(C0197a c0197a) {
        c hk = c0197a.hk();
        if (hk == null) {
            hk = new c(c0197a.adTemplate);
            c0197a.b(hk);
        }
        int m = hk.m(c0197a);
        AdTemplate adTemplate = c0197a.getAdTemplate();
        KSLoggerReporter.ReportClient.CORE_CONVERT.buildMethodCheck(adTemplate.getBusinessType(), "toDownload").report();
        String cn = com.kwad.sdk.core.response.b.d.cn(c0197a.getAdTemplate());
        boolean isEmpty = TextUtils.isEmpty(cn);
        if (!isEmpty) {
            isEmpty = cn.contains(" ");
        }
        if (!isEmpty) {
            isEmpty = cn.startsWith("http");
        }
        if (isEmpty) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_convert").aO(adTemplate).T("downloadUrlError", cn).report();
        }
        return m;
    }

    private static void i(C0197a c0197a) {
        AdTemplate adTemplate = c0197a.getAdTemplate();
        Context context = c0197a.getContext();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        if (com.kwad.sdk.utils.d.f(context, com.kwad.sdk.core.response.b.a.cz(ck), com.kwad.sdk.core.response.b.a.aq(ck))) {
            com.kwad.sdk.core.report.a.l(adTemplate, 0);
        } else if (!com.kwad.sdk.core.response.b.a.b(ck, com.kwad.sdk.core.config.d.zn()) || adTemplate.mAdWebVideoPageShowing) {
            a(context, new AdWebViewActivityProxy.a.C0206a().at(com.kwad.sdk.core.response.b.b.bq(c0197a.getAdTemplate())).V(c0197a.getAdTemplate()).oE());
        } else {
            c(context, adTemplate);
        }
    }
}
