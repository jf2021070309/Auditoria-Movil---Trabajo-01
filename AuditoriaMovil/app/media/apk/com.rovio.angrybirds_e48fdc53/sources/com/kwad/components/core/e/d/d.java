package com.kwad.components.core.e.d;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsConstants;
import com.kwad.components.core.e.d.a;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.report.z;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.utils.ak;
import com.kwad.sdk.utils.bj;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.concurrent.Callable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d extends com.kwad.sdk.core.download.a.b {
    private static boolean Kk = false;
    private static final b Kl = new b() { // from class: com.kwad.components.core.e.d.d.2
        long Ko;

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToBackground() {
            super.onBackToBackground();
            this.Ko = System.currentTimeMillis();
        }

        @Override // com.kwad.sdk.core.c.d, com.kwad.sdk.core.c.c
        public final void onBackToForeground() {
            super.onBackToForeground();
            if (this.Ko != 0) {
                com.kwad.sdk.core.report.a.k(getAdTemplate(), System.currentTimeMillis() - this.Ko);
            }
            com.kwad.sdk.core.c.b.AT();
            com.kwad.sdk.core.c.b.b((com.kwad.sdk.core.c.c) d.Kl);
            setAdTemplate(null);
            this.Ko = 0L;
        }
    };

    private static String a(a.C0197a c0197a, AdInfo adInfo, String str) {
        String str2;
        if (com.kwad.sdk.core.response.b.a.ba(adInfo)) {
            String str3 = null;
            Callable<String> nl = c0197a.nl();
            if (nl != null) {
                try {
                    str3 = nl.call();
                } catch (Exception e) {
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = c0197a.nk();
            }
            if (TextUtils.isEmpty(str3)) {
                return (str.contains("__itemId__") || str.contains("__simpleItemId__")) ? com.kwad.sdk.core.response.b.a.cx(adInfo) : str;
            }
            try {
                str2 = String.valueOf(com.kwad.components.core.e.b.a.ak(str3));
            } catch (Throwable th) {
                str2 = str3;
            }
            return str.replaceAll("__itemId__", str3).replaceAll("__simpleItemId__", str2);
        }
        return str;
    }

    public static String a(a.C0197a c0197a, AdTemplate adTemplate) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        for (AdInfo.AdConversionInfo.DeeplinkItemInfo deeplinkItemInfo : ck.adConversionInfo.deeplinkConf) {
            boolean contains = deeplinkItemInfo.areaConf.contains(Integer.valueOf(c0197a.cZ()));
            boolean contains2 = deeplinkItemInfo.sceneConf.contains(Integer.valueOf(c0197a.nn()));
            if ((contains && contains2) || ((contains && deeplinkItemInfo.sceneConf.size() == 0) || (contains2 && deeplinkItemInfo.areaConf.size() == 0))) {
                if (!TextUtils.isEmpty(deeplinkItemInfo.url)) {
                    return deeplinkItemInfo.url + ck.adConversionInfo.deeplinkExtra;
                }
            }
        }
        return com.kwad.sdk.core.response.b.a.cx(ck);
    }

    private static String a(String str, int i, String str2) {
        return TextUtils.isEmpty(str2) ? str : (i == 0 || i == 3) ? g(str, str2) : str;
    }

    private static String a(String str, Context context, SceneImpl sceneImpl) {
        if (sceneImpl != null) {
            int i = 0;
            if (!ak.ak(context, "com.smile.gifmaker") && ak.ak(context, "com.kuaishou.nebula")) {
                i = 3;
            }
            String backUrl = sceneImpl.getBackUrl();
            return a(str, i, TextUtils.isEmpty(backUrl) ? "" : backUrl);
        }
        return "";
    }

    private static String a(String str, a.C0197a c0197a, AdInfo adInfo) {
        AdTemplate adTemplate = c0197a.getAdTemplate();
        if (com.kwad.sdk.core.response.b.a.bb(adInfo)) {
            str = b(c0197a, adInfo, str);
        }
        if (com.kwad.sdk.core.response.b.a.cw(adInfo)) {
            str = a(c0197a, adInfo, str);
        }
        return ((com.kwad.sdk.core.response.b.a.co(adInfo) || com.kwad.sdk.core.response.b.a.cu(adInfo)) && adTemplate.mAdScene != null) ? a(str, c0197a.getContext(), adTemplate.mAdScene) : str;
    }

    private static JSONObject ap(String str) {
        try {
            return new JSONObject(Uri.parse(str).getQueryParameter("universeClientInfo"));
        } catch (Throwable th) {
            return null;
        }
    }

    public static void at(boolean z) {
        com.kwad.sdk.core.report.a.aqF = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void au(boolean z) {
        Kk = z;
    }

    public static int b(a.C0197a c0197a, int i) {
        Context context = c0197a.getContext();
        AdTemplate adTemplate = c0197a.getAdTemplate();
        if (adTemplate == null || context == null) {
            return 0;
        }
        b bVar = Kl;
        bVar.setAdTemplate(adTemplate);
        com.kwad.sdk.core.c.b.AT();
        com.kwad.sdk.core.c.b.a(bVar);
        String a = a(a(c0197a, adTemplate), c0197a, com.kwad.sdk.core.response.b.d.ck(adTemplate));
        com.kwad.sdk.core.report.a.aqE = ap(a);
        int i2 = i(context, a);
        BusinessType businessType = null;
        if (i2 == 1) {
            if (c0197a.getAdTemplate() != null && c0197a.getAdTemplate().mAdScene != null) {
                businessType = KSLoggerReporter.cs(c0197a.getAdTemplate().mAdScene.getAdStyle());
            }
            KSLoggerReporter.ReportClient.CONVERT_DPLINK.buildMethodCheck(businessType, "dplinkSuccess").report();
            com.kwad.sdk.core.report.a.a(adTemplate, "", i, c0197a.getClientParams());
            e(adTemplate, i);
        } else if (i2 == -1) {
            com.kwad.sdk.core.report.a.b(adTemplate, "", i, (z.b) null);
        }
        return i2;
    }

    private static String b(a.C0197a c0197a, AdInfo adInfo, String str) {
        long j = c0197a.getAdTemplate().getmCurPlayTime();
        if (j > 0) {
            j = Math.max(j - com.kwad.sdk.core.response.b.a.bc(adInfo), 0L);
        }
        return Uri.parse(str).buildUpon().appendQueryParameter("playStartTime", String.valueOf(j)).toString();
    }

    private static void e(final AdTemplate adTemplate, final int i) {
        if (nQ()) {
            return;
        }
        au(true);
        int zo = com.kwad.sdk.core.config.d.zo();
        com.kwad.sdk.core.config.d.zp();
        int abs = Math.abs(zo);
        if (abs > 0) {
            bj.a(new Runnable() { // from class: com.kwad.components.core.e.d.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    d.au(false);
                    com.kwad.sdk.core.c.b.AT();
                    if (com.kwad.sdk.core.c.b.isAppOnForeground()) {
                        return;
                    }
                    com.kwad.sdk.core.report.a.a(AdTemplate.this, "", i);
                    BusinessType businessType = null;
                    AdTemplate adTemplate2 = AdTemplate.this;
                    if (adTemplate2 != null && adTemplate2.mAdScene != null) {
                        businessType = KSLoggerReporter.cs(AdTemplate.this.mAdScene.getAdStyle());
                    }
                    KSLoggerReporter.ReportClient.CONVERT_DPLINK.buildMethodCheck(businessType, "trueDplinkSuccess").report();
                }
            }, null, abs * 1000);
        } else {
            au(false);
        }
    }

    private static String g(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("returnBack", "liveunion_" + KsAdSDKImpl.get().getAppId());
        if (TextUtils.isEmpty(str2)) {
            str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        return appendQueryParameter.appendQueryParameter("back_url", str2).toString();
    }

    private static boolean nQ() {
        return Kk;
    }
}
