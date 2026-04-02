package com.kwad.sdk.core.report;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.components.offline.api.core.api.ILoggerReporter;
import com.kwad.sdk.commercial.model.HybridLoadMsg;
import com.kwad.sdk.commercial.model.WebViewCommercialMsg;
import com.kwad.sdk.commercial.model.WebViewLoadMsg;
import com.kwad.sdk.core.report.p;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.utils.aw;
import com.kwad.sdk.utils.bk;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import com.kwai.adclient.kscommerciallogger.model.SubBusinessType;
import com.kwai.adclient.kscommerciallogger.model.c;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class KSLoggerReporter {
    private static boolean ark;
    private static volatile boolean arl;
    private static List<com.kwai.adclient.kscommerciallogger.model.c> arm;
    private static a arn;
    private static float ari = -1.0f;
    private static double arj = -1.0d;
    private static final AtomicBoolean sHasInit = new AtomicBoolean();

    /* loaded from: classes.dex */
    public enum ReportClient {
        CORE_CONVERT(ILoggerReporter.Category.APM_LOG, "ad_convert_method_call"),
        CONVERT_H5WEB(ILoggerReporter.Category.APM_LOG, "ad_h5convert_method"),
        CONVERT_DPLINK(ILoggerReporter.Category.APM_LOG, "ad_dplink_convert_method"),
        RESPONE_MONITOR(new b.a() { // from class: com.kwad.sdk.core.report.KSLoggerReporter.ReportClient.1
            @Override // com.kwad.sdk.core.report.KSLoggerReporter.b.a
            public final void a(b bVar) {
                bVar.dw(ILoggerReporter.Category.ERROR_LOG).dy("response_biz_error");
            }
        });
        
        private String mCategory;
        private String mEventId;
        private b.a mSubIniter;

        ReportClient(b.a aVar) {
            this.mSubIniter = aVar;
        }

        ReportClient(String str, String str2) {
            this.mCategory = str;
            this.mEventId = str2;
        }

        public final b buildMethodCheck(BusinessType businessType, String str) {
            return new b(this.mCategory, this.mEventId, businessType).c("method_name", str);
        }

        public final b buildNormalApmReporter() {
            return new b(this.mSubIniter);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void j(String str, String str2, boolean z);

        boolean xk();

        JSONObject xl();
    }

    /* loaded from: classes.dex */
    public static class b {
        private JSONObject arp = new JSONObject();
        private BusinessType arq;
        private a arr;
        private String mCategory;
        private String mEventId;
        private String mTag;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            void a(b bVar);
        }

        b(a aVar) {
            this.arr = aVar;
        }

        b(String str, String str2, BusinessType businessType) {
            this.arq = businessType;
            this.mCategory = str;
            this.mEventId = str2;
        }

        public final b T(String str, String str2) {
            c("error_name", str);
            c("error_data", str2);
            return this;
        }

        public final b a(BusinessType businessType) {
            this.arq = businessType;
            return this;
        }

        public final b aO(AdTemplate adTemplate) {
            long cu = com.kwad.sdk.core.response.b.d.cu(adTemplate);
            long ch = com.kwad.sdk.core.response.b.d.ch(adTemplate);
            if (adTemplate.mAdScene != null) {
                this.arq = KSLoggerReporter.cs(adTemplate.mAdScene.getAdStyle());
            }
            c("creative_id", Long.valueOf(cu));
            c("llsid", Long.valueOf(ch));
            return this;
        }

        public final b be(boolean z) {
            return c("is_api_native", Boolean.TRUE);
        }

        public final b c(String str, Object obj) {
            com.kwad.sdk.utils.u.a(this.arp, str, obj);
            return this;
        }

        public final b ct(int i) {
            return c("ad_num", Integer.valueOf(i));
        }

        public final b dw(String str) {
            this.mCategory = str;
            return this;
        }

        public final b dx(String str) {
            this.mEventId = str;
            return this;
        }

        public final b dy(String str) {
            this.mTag = str;
            return this;
        }

        public final void report() {
            try {
                a aVar = this.arr;
                if (aVar != null) {
                    aVar.a(this);
                }
                KSLoggerReporter.a(new p.a().dz(this.mCategory).b(this.arq).dB(this.mTag).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA(this.mEventId).C(this.arp).Cc());
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
    }

    public static void A(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "ad_image_load_perf", jSONObject);
    }

    public static void B(JSONObject jSONObject) {
        a(new p.a().dz(ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).dB("ad_thread_monitor").a(com.kwai.adclient.kscommerciallogger.model.d.aNO).dA("ad_thread_monitor").C(jSONObject).Cc());
    }

    private static f a(String str, String str2, JSONObject jSONObject, String str3) {
        f fVar = new f();
        try {
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(th);
        }
        if (jSONObject.has("ratio")) {
            fVar.aqX = jSONObject.getDouble("ratio");
            return fVar;
        } else if (jSONObject.has("ratio_count") && jSONObject.getDouble("ratio_count") > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            fVar.aqX = 1.0d / jSONObject.getDouble("ratio_count");
            return fVar;
        } else {
            JSONObject xl = arn.xl();
            if (xl == null) {
                if (com.kwad.framework.a.a.mp.booleanValue()) {
                    throw new Exception("reportConf未初始化 eventId:" + str2);
                }
                return fVar;
            }
            JSONObject optJSONObject = xl.optJSONObject(dv(str2));
            if (optJSONObject != null) {
                fVar.a(str, optJSONObject, str3);
                return fVar;
            } else if (com.kwad.framework.a.a.mp.booleanValue()) {
                throw new Exception("EventSamplingKey未包含 eventId " + str2);
            } else {
                return fVar;
            }
        }
    }

    private static String a(String str, f fVar) {
        return (!str.equals(ILoggerReporter.Category.APM_LOG) || arj >= fVar.aqY) ? str : ILoggerReporter.Category.ERROR_LOG;
    }

    private static JSONObject a(JSONObject jSONObject, f fVar) {
        try {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ratio", fVar.aqX);
            if (fVar.aqX > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "ratio_count", 1.0d / fVar.aqX);
            }
            com.kwad.sdk.utils.t.putValue(jSONObject, "debug_mode", com.kwad.framework.a.a.mp.booleanValue() ? 1 : 0);
            com.kwad.sdk.utils.t.putValue(jSONObject, "convert_ratio", fVar.aqY);
            if (fVar.aqY > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "convert_ratio_count", 1.0d / fVar.aqY);
            }
            return jSONObject;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
            return jSONObject;
        }
    }

    public static synchronized void a(final a aVar) {
        synchronized (KSLoggerReporter.class) {
            if (ark) {
                return;
            }
            ark = true;
            arn = aVar;
            com.kwad.sdk.utils.g.execute(new aw() { // from class: com.kwad.sdk.core.report.KSLoggerReporter.1
                @Override // com.kwad.sdk.utils.aw
                public final void doTask() {
                    KSLoggerReporter.b(a.this);
                    KSLoggerReporter.sHasInit.set(true);
                    KSLoggerReporter.mG();
                }
            });
        }
    }

    public static void a(m mVar, String str) {
        a(new p.a().dz(ILoggerReporter.Category.ERROR_LOG).dA("ad_union_error_log").dB(str).C(mVar.toJson()).Cc());
    }

    public static synchronized void a(p pVar) {
        synchronized (KSLoggerReporter.class) {
            if (TextUtils.isEmpty(pVar.tag)) {
                pVar.tag = pVar.eventId;
            }
            a(pVar.category, pVar.biz, pVar.ars, pVar.art, pVar.eventId, pVar.tag, pVar.suffixRatio, pVar.msg);
        }
    }

    private static synchronized void a(com.kwai.adclient.kscommerciallogger.model.c cVar) {
        synchronized (KSLoggerReporter.class) {
            if (arm == null) {
                arm = new CopyOnWriteArrayList();
            }
            arm.add(cVar);
        }
    }

    public static void a(String str, HybridLoadMsg hybridLoadMsg) {
        a(str, BusinessType.WEB_CACHE, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "union_web_cache_download_event", hybridLoadMsg.toJson());
    }

    public static void a(String str, WebViewCommercialMsg webViewCommercialMsg) {
        if (webViewCommercialMsg.rate >= PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(webViewCommercialMsg.msg, "ratio", webViewCommercialMsg.rate);
        }
        a(str, webViewCommercialMsg.biz, webViewCommercialMsg.subBiz, webViewCommercialMsg.type, webViewCommercialMsg.eventId, webViewCommercialMsg.suffixRatio, webViewCommercialMsg.msg);
    }

    public static void a(String str, WebViewLoadMsg webViewLoadMsg) {
        a(str, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "union_webview_load_event", webViewLoadMsg.toJson());
    }

    @Deprecated
    private static synchronized void a(String str, BusinessType businessType, SubBusinessType subBusinessType, com.kwai.adclient.kscommerciallogger.model.d dVar, String str2, String str3, String str4, JSONObject jSONObject) {
        synchronized (KSLoggerReporter.class) {
            f a2 = a(str, str2, jSONObject, str4);
            if (ari == -1.0f) {
                ari = new Random().nextFloat();
            }
            if (arj == -1.0d) {
                arj = new Random().nextFloat();
            }
            if (ari > a2.aqX) {
                return;
            }
            if (bk.at(BuildConfig.VERSION_NAME, a2.aqZ)) {
                com.kwai.adclient.kscommerciallogger.model.c Lg = (ILoggerReporter.Category.ERROR_LOG.equals(a(str, a2)) ? c.a.Le() : c.a.Lf()).c(businessType).b(subBusinessType).ga(str3).b(dVar).gb(str2).R(a(jSONObject, a2)).Lg();
                if (sHasInit.get()) {
                    b(Lg);
                } else {
                    a(Lg);
                }
            }
        }
    }

    @Deprecated
    private static synchronized void a(String str, BusinessType businessType, SubBusinessType subBusinessType, com.kwai.adclient.kscommerciallogger.model.d dVar, String str2, String str3, JSONObject jSONObject) {
        synchronized (KSLoggerReporter.class) {
            a(str, businessType, subBusinessType, dVar, str2, str2, str3, jSONObject);
        }
    }

    @Deprecated
    public static synchronized void a(String str, BusinessType businessType, SubBusinessType subBusinessType, com.kwai.adclient.kscommerciallogger.model.d dVar, String str2, JSONObject jSONObject) {
        synchronized (KSLoggerReporter.class) {
            a(str, businessType, subBusinessType, dVar, str2, "", jSONObject);
        }
    }

    public static void a(String str, com.kwai.adclient.kscommerciallogger.model.d dVar, JSONObject jSONObject) {
        a(str, BusinessType.AD_SDK_INIT, SubBusinessType.OTHER, dVar, ILoggerReporter.Category.ERROR_LOG.equals(str) ? "ad_sdk_init_error_performance" : "ad_sdk_init_performance", jSONObject);
    }

    public static void a(boolean z, JSONObject jSONObject) {
        a(ILoggerReporter.Category.ERROR_LOG, z ? BusinessType.AD_REWARD : BusinessType.AD_FULLSCREEN, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNB, z ? "ad_sdk_reward_download_error" : "ad_sdk_fullscreen_download_error", jSONObject);
    }

    public static void a(boolean z, JSONObject jSONObject, com.kwai.adclient.kscommerciallogger.model.d dVar) {
        a(ILoggerReporter.Category.APM_LOG, z ? BusinessType.AD_REWARD : BusinessType.AD_FULLSCREEN, SubBusinessType.OTHER, dVar, z ? "ad_sdk_reward_load" : "ad_sdk_fullscreen_load", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final a aVar) {
        boolean xk = aVar.xk();
        arl = xk;
        if (xk) {
            com.kwai.adclient.kscommerciallogger.a.KU().a(new com.kwai.adclient.kscommerciallogger.a.a() { // from class: com.kwad.sdk.core.report.KSLoggerReporter.2
                @Override // com.kwai.adclient.kscommerciallogger.a.a
                public final void P(String str, String str2) {
                    com.kwad.sdk.core.e.c.w(str, str2);
                }

                @Override // com.kwai.adclient.kscommerciallogger.a.a
                public final void Q(String str, String str2) {
                    com.kwad.sdk.core.e.c.e(str, str2);
                }
            }, new com.kwai.adclient.kscommerciallogger.a.b() { // from class: com.kwad.sdk.core.report.KSLoggerReporter.3
                private void S(String str, String str2) {
                    a.this.j(str, str2, false);
                }

                @Override // com.kwai.adclient.kscommerciallogger.a.b
                public final void R(String str, String str2) {
                    S(str, str2);
                }
            }, null, com.kwad.framework.a.a.mp.booleanValue(), com.kwad.framework.a.a.mp.booleanValue());
        }
    }

    public static void b(com.kwad.sdk.utils.b.a aVar) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "ad_union_kv_fail_rate", aVar.toJson());
    }

    private static void b(com.kwai.adclient.kscommerciallogger.model.c cVar) {
        if (arl) {
            com.kwai.adclient.kscommerciallogger.a.KU().c(cVar);
        }
    }

    public static void b(String str, HybridLoadMsg hybridLoadMsg) {
        a(str, BusinessType.WEB_CACHE, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "union_web_cache_load_event", hybridLoadMsg.toJson());
    }

    public static void b(boolean z, JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, z ? BusinessType.AD_REWARD : BusinessType.AD_FULLSCREEN, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNe, z ? "ad_sdk_reward_page_show" : "ad_sdk_fullscreen_page_show", jSONObject);
    }

    public static void c(com.kwad.sdk.core.network.j jVar) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "ad_perf_monitor_net_error", jVar.toJson());
    }

    public static void c(com.kwad.sdk.core.network.k kVar) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "ad_perf_monitor_net_success", kVar.toJson());
    }

    public static void c(boolean z, JSONObject jSONObject) {
        a(ILoggerReporter.Category.ERROR_LOG, z ? BusinessType.AD_REWARD : BusinessType.AD_FULLSCREEN, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNH, z ? "ad_sdk_reward_play_error" : "ad_sdk_fullscreen_play_error", jSONObject);
    }

    public static BusinessType cs(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 13) {
                            if (i != 10000) {
                                return null;
                            }
                            return BusinessType.AD_NATIVE;
                        }
                        return BusinessType.AD_INTERSTITIAL;
                    }
                    return BusinessType.AD_SPLASH;
                }
                return BusinessType.AD_FULLSCREEN;
            }
            return BusinessType.AD_REWARD;
        }
        return BusinessType.AD_FEED;
    }

    private static String dv(String str) {
        String str2;
        try {
            String[] split = str.split("_");
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (String str3 : split) {
                if (z) {
                    str2 = Character.toUpperCase(str3.charAt(0)) + str3.substring(1);
                } else {
                    str2 = Character.toLowerCase(str3.charAt(0)) + str3.substring(1);
                    z = true;
                }
                sb.append(str2);
            }
            sb.append("ReportRate");
            return new String(sb);
        } catch (Throwable th) {
            return "";
        }
    }

    public static void j(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_REWARD, SubBusinessType.OTHER, new com.kwai.adclient.kscommerciallogger.model.b("RESULT_CHECK_REWARD"), "ad_sdk_reward_check_result", jSONObject);
    }

    public static void k(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_WEBVIEW, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_webview_track", jSONObject);
    }

    public static void l(JSONObject jSONObject) {
        a(ILoggerReporter.Category.ERROR_LOG, BusinessType.AD_REWARD, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNO, "ad_sdk_reward_performance", jSONObject);
    }

    public static void m(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_SPLASH, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_splash_load", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void mG() {
        synchronized (KSLoggerReporter.class) {
            List<com.kwai.adclient.kscommerciallogger.model.c> list = arm;
            if (list == null) {
                return;
            }
            for (com.kwai.adclient.kscommerciallogger.model.c cVar : list) {
                b(cVar);
            }
            arm.clear();
            arm = null;
        }
    }

    public static void n(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_SPLASH, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_splash_preload", jSONObject);
    }

    public static void o(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_SPLASH, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNn, "ad_sdk_splash_single_cache", jSONObject);
    }

    public static void p(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_SPLASH, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNn, "ad_sdk_splash_cache", jSONObject);
    }

    public static void q(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_SPLASH, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_splash_show", jSONObject);
    }

    public static void r(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("load_status");
        a(new p.a().dz((optInt == 3 || optInt == 4 || optInt == 7) ? ILoggerReporter.Category.ERROR_LOG : ILoggerReporter.Category.APM_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA("ad_sdk_dynamic_update").C(jSONObject).Cc());
    }

    public static void s(JSONObject jSONObject) {
        a(new p.a().dz(ILoggerReporter.Category.ERROR_LOG).b(BusinessType.OTHER).a(SubBusinessType.OTHER).a(com.kwai.adclient.kscommerciallogger.model.a.aNo).dA("ad_sdk_dynamic_run").C(jSONObject).Cc());
    }

    public static void t(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_interstitial_load", jSONObject);
    }

    public static void u(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.a.aNo, "ad_sdk_interstitial_play", jSONObject);
    }

    public static void v(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNB, "ad_sdk_interstitial_download_error", "1", jSONObject);
    }

    public static void w(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNB, "ad_sdk_interstitial_download_error", jSONObject);
    }

    public static void x(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNH, "ad_sdk_interstitial_play_error", "1", jSONObject);
    }

    public static void y(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.AD_INTERSTITIAL, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.b.aNH, "ad_sdk_interstitial_play_error", jSONObject);
    }

    public static void z(JSONObject jSONObject) {
        a(ILoggerReporter.Category.APM_LOG, BusinessType.OTHER, SubBusinessType.OTHER, com.kwai.adclient.kscommerciallogger.model.d.aNO, "ad_sdk_block_info", jSONObject);
    }
}
