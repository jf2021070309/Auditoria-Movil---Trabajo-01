package com.kwad.sdk.core.response.b;

import android.text.TextUtils;
import com.facebook.ads.AudienceNetworkActivity;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.response.model.FeedSlideConf;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b {
    private static Random auH = new Random();

    public static AdMatrixInfo aS(AdTemplate adTemplate) {
        return d.cc(adTemplate) ? d.ck(adTemplate).adMatrixInfo : new AdMatrixInfo();
    }

    private static AdMatrixInfo.AdDataV2 aT(AdTemplate adTemplate) {
        return d.ck(adTemplate).adMatrixInfo.adDataV2;
    }

    public static FeedSlideConf aU(AdTemplate adTemplate) {
        JSONArray optJSONArray;
        AdMatrixInfo.TemplateData f = f(adTemplate, br(adTemplate).templateId);
        try {
            JSONObject optJSONObject = new JSONObject(f != null ? f.data : "").optJSONObject("slideInfo");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("angle")) != null && optJSONArray.length() > 1) {
                FeedSlideConf feedSlideConf = new FeedSlideConf();
                feedSlideConf.minRange = ((Integer) optJSONArray.get(0)).intValue();
                feedSlideConf.maxRange = ((Integer) optJSONArray.get(1)).intValue();
                return feedSlideConf;
            }
            return null;
        } catch (Throwable th) {
        }
        return null;
    }

    public static boolean aV(AdTemplate adTemplate) {
        return h(adTemplate, aW(adTemplate).templateId);
    }

    private static AdMatrixInfo.InterstitialCardInfo aW(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.interstitialCardInfo;
    }

    public static String aX(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, aS(adTemplate).adDataV2.splashActionBarInfo.templateId);
        return d != null ? d.templateUrl : "";
    }

    private static AdMatrixInfo.ActionBarInfoNew aY(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.actionBarInfo;
    }

    public static String aZ(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        int ce = d.ce(adTemplate);
        boolean z = ce == 3 || ce == 2;
        if (a.cw(ck)) {
            return "";
        }
        if (z && a.aR(adTemplate)) {
            AdMatrixInfo.MatrixTemplate d = d(adTemplate, bP(adTemplate).templateId);
            return d != null ? d.templateUrl : "";
        }
        AdMatrixInfo.MatrixTemplate d2 = d(adTemplate, aY(adTemplate).templateId);
        return d2 != null ? d2.templateUrl : "";
    }

    public static boolean bA(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(bu(adTemplate));
    }

    public static boolean bB(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(bv(adTemplate));
    }

    private static AdMatrixInfo.InterstitialCardInfo bC(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.interstitialCardInfo;
    }

    public static float bD(AdTemplate adTemplate) {
        int i;
        try {
            i = d.ck(adTemplate).adMatrixInfo.adDataV2.interstitialCardInfo.interactionInfo.shakeInfo.acceleration;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            i = 7;
        }
        if (i > 0) {
            return i;
        }
        return 7.0f;
    }

    public static boolean bE(AdTemplate adTemplate) {
        try {
            return d.ck(adTemplate).adMatrixInfo.adDataV2.interstitialCardInfo.renderType == 1;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return false;
        }
    }

    public static int bF(AdTemplate adTemplate) {
        return d.ck(adTemplate).adMatrixInfo.adDataV2.interstitialCardInfo.renderType;
    }

    public static String bG(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bC(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static float bH(AdTemplate adTemplate) {
        int i;
        try {
            i = d.ck(adTemplate).adMatrixInfo.adDataV2.splashInfo.interactionInfo.shakeInfo.acceleration;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            i = 7;
        }
        return i;
    }

    public static AdMatrixInfo.RotateInfo bI(AdTemplate adTemplate) {
        try {
            return d.ck(adTemplate).adMatrixInfo.adDataV2.splashInfo.interactionInfo.rotateInfo;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return null;
        }
    }

    private static AdMatrixInfo.BaseMatrixTemplate bJ(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.complianceCardInfo;
    }

    public static String bK(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bJ(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static boolean bL(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(bK(adTemplate));
    }

    private static AdMatrixInfo.BaseMatrixTemplate bM(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.downloadConfirmCardInfo;
    }

    public static String bN(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bM(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static boolean bO(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(bN(adTemplate));
    }

    public static AdMatrixInfo.MerchantLiveReservationInfo bP(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.merchantLiveReservationInfo;
    }

    public static AdMatrixInfo.FullScreenInfo bQ(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.fullScreenInfo;
    }

    public static boolean bR(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        if (g(ck) || d.cx(adTemplate)) {
            return false;
        }
        return !(aY(adTemplate).cardType == 4) && d.ck(adTemplate).adStyleInfo2.playDetailInfo.detailCommonInfo.rewardInteractionType <= 0 && ck.adMatrixInfo.adDataV2.fullScreenInfo.interactionInfo.interactiveStyle == 2;
    }

    public static boolean bS(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        if (g(ck) || d.cx(adTemplate)) {
            return false;
        }
        return ((aY(adTemplate).cardType == 4) || d.ck(adTemplate).adStyleInfo2.playDetailInfo.detailWebCardInfo.cardType == 4 || ck.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.interactiveStyle != 2) ? false : true;
    }

    public static AdMatrixInfo.PreLandingPageTKInfo bT(AdTemplate adTemplate) {
        return d.ck(adTemplate).adMatrixInfo.adDataV2.preLandingPageTKInfo;
    }

    public static boolean bU(AdTemplate adTemplate) {
        return aT(adTemplate).installedActivateInfo.cardSwitch;
    }

    public static long bV(AdTemplate adTemplate) {
        long j = aT(adTemplate).installedActivateInfo.showTime;
        if (j > 0) {
            return j;
        }
        return 0L;
    }

    public static long ba(AdTemplate adTemplate) {
        return aY(adTemplate).maxTimeOut;
    }

    public static boolean bb(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(aZ(adTemplate));
    }

    private static AdMatrixInfo.AggregationCardInfo bc(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.aggregationCardInfo;
    }

    public static String bd(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bc(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static long be(AdTemplate adTemplate) {
        return g(adTemplate, bc(adTemplate).templateId);
    }

    public static long bf(AdTemplate adTemplate) {
        return bc(adTemplate).changeTime * 1000;
    }

    public static int bg(AdTemplate adTemplate) {
        return bc(adTemplate).maxTimesPerDay;
    }

    public static long bh(AdTemplate adTemplate) {
        return bc(adTemplate).intervalTime;
    }

    public static boolean bi(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        return !a.ax(ck) && a.al(ck);
    }

    public static boolean bj(AdTemplate adTemplate) {
        if (!TextUtils.isEmpty(bd(adTemplate)) && be(adTemplate) > 0) {
            return ai.IL();
        }
        return false;
    }

    private static AdMatrixInfo.BaseMatrixTemplate bk(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.halfCardInfo;
    }

    public static String bl(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bk(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    private static AdMatrixInfo.EndCardInfo bm(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.endCardInfo;
    }

    public static String bn(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bm(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static boolean bo(AdTemplate adTemplate) {
        return !TextUtils.isEmpty(bn(adTemplate));
    }

    private static String bp(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, d.ck(adTemplate).adMatrixInfo.adDataV2.activityMiddlePageInfo.templateId);
        return d != null ? d.templateUrl : "";
    }

    public static String bq(AdTemplate adTemplate) {
        return (adTemplate.mIsForceJumpLandingPage || !cP(d.ck(adTemplate))) ? a.aK(d.ck(adTemplate)) : bp(adTemplate);
    }

    private static AdMatrixInfo.FeedInfo br(AdTemplate adTemplate) {
        boolean bs = bs(adTemplate);
        AdMatrixInfo.AdDataV2 adDataV2 = aS(adTemplate).adDataV2;
        return bs ? adDataV2.adUnionFeedLiveTemplateInfo : adDataV2.feedInfo;
    }

    private static boolean bs(AdTemplate adTemplate) {
        return a.cw(d.ck(adTemplate));
    }

    private static AdMatrixInfo.FeedInfo bt(AdTemplate adTemplate) {
        return aS(adTemplate).adDataV2.adUnionFeedLiveMediaInfo;
    }

    public static String bu(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, br(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static String bv(AdTemplate adTemplate) {
        AdMatrixInfo.MatrixTemplate d = d(adTemplate, bt(adTemplate).templateId);
        return d != null ? d.templateUrl : "";
    }

    public static boolean bw(AdTemplate adTemplate) {
        return br(adTemplate).interactionInfo.interactiveStyle == 2;
    }

    public static boolean bx(AdTemplate adTemplate) {
        return br(adTemplate).interactionInfo.shakeInfo.clickDisabled;
    }

    public static int by(AdTemplate adTemplate) {
        AdMatrixInfo.AdInteractionInfo adInteractionInfo = br(adTemplate).interactionInfo;
        if (adInteractionInfo == null || adInteractionInfo.shakeInfo == null) {
            return 0;
        }
        return adInteractionInfo.shakeInfo.acceleration;
    }

    public static double bz(AdTemplate adTemplate) {
        return d.ck(adTemplate).adStyleInfo.feedAdInfo.heightRatio;
    }

    public static boolean cK(AdInfo adInfo) {
        return !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.splashEndCardTKInfo.templateId);
    }

    public static boolean cL(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashEndCardTKInfo.endCardFullScreenClick;
    }

    public static boolean cM(AdInfo adInfo) {
        return !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.topFloorTKInfo.templateId);
    }

    public static boolean cN(AdInfo adInfo) {
        return !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.splashPlayCardTKInfo.templateId);
    }

    public static boolean cO(AdInfo adInfo) {
        if (cP(adInfo)) {
            return adInfo.adMatrixInfo.adDataV2.activityMiddlePageInfo.showHeaderBar;
        }
        return true;
    }

    public static boolean cP(AdInfo adInfo) {
        return !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.activityMiddlePageInfo.templateId);
    }

    public static AdMatrixInfo.DownloadTexts cQ(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.rotateInfo.downloadTexts;
    }

    public static AdMatrixInfo.DownloadTexts cR(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.slideInfo.downloadTexts;
    }

    public static String cS(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.rotateInfo.title;
    }

    public static long cT(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.tkDefaultTimeout;
    }

    public static String cU(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.rotateInfo.subTitle;
    }

    public static AdMatrixInfo.DownloadTexts cV(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.splashActionBarInfo.downloadTexts;
    }

    public static String cW(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.splashActionBarInfo.title;
    }

    public static boolean cX(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.interstitialCardInfo.interactionInfo.interactiveStyle == 2;
    }

    public static String cY(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.interstitialCardInfo.cycleAggregateInfo.cutIconUrl;
    }

    public static String cZ(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.interstitialCardInfo.cycleAggregateInfo.refreshIconUrl;
    }

    private static AdMatrixInfo.MatrixTemplate d(AdTemplate adTemplate, String str) {
        for (AdMatrixInfo.MatrixTemplate matrixTemplate : aS(adTemplate).styles.templateList) {
            if (bc.isEquals(str, matrixTemplate.templateId)) {
                return matrixTemplate;
            }
        }
        KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_tk").aO(adTemplate).a(BusinessType.TACHIKOMA).T("TkTemplateDataLost", str).report();
        return null;
    }

    public static boolean dA(AdInfo adInfo) {
        for (AdMatrixInfo.MatrixTag matrixTag : adInfo.adMatrixInfo.tag) {
            if ("playEndClose".equals(matrixTag.type)) {
                return matrixTag.isHide;
            }
        }
        return false;
    }

    public static boolean dB(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.neoTKInfo.renderType == 1;
    }

    public static boolean dC(AdInfo adInfo) {
        return (a.bv(adInfo) || TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.preLandingPageTKInfo.templateId)) ? false : true;
    }

    public static int dD(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.preLandingPageTKInfo.preLandingPageShowType;
    }

    public static boolean dD(String str) {
        try {
            return ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).bQ(str);
        } catch (Exception e) {
            return false;
        }
    }

    public static String dE(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.videoLiveTKInfo.templateId;
    }

    public static boolean dF(AdInfo adInfo) {
        return a.aV(adInfo) && !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.videoImageTKInfo.templateId);
    }

    public static String da(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.interstitialCardInfo.cycleAggregateInfo.convertIconUrl;
    }

    public static int db(AdInfo adInfo) {
        try {
            int i = adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.shakeInfo.componentIndex;
            if (i != 2) {
                return 1;
            }
            return i;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            return 1;
        }
    }

    public static boolean dc(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.isMediaDisable && adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 4;
    }

    public static boolean dd(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 2;
    }

    public static int de(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle;
    }

    public static int df(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactivityDefaultStyle;
    }

    public static boolean dg(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactivityDefaultStyle == 2;
    }

    public static boolean dh(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 1;
    }

    public static boolean di(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactivityDefaultStyle == 1;
    }

    public static boolean dj(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 3;
    }

    public static boolean dk(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 10;
    }

    public static boolean dl(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactivityDefaultStyle == 3;
    }

    public static boolean dm(AdInfo adInfo) {
        try {
            if (adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle != 4) {
                return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 9;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean dn(AdInfo adInfo) {
        try {
            return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 0;
        } catch (Exception e) {
            return false;
        }
    }

    /* renamed from: do  reason: not valid java name */
    public static boolean m19do(AdInfo adInfo) {
        try {
            return adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.interactiveStyle == 4;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean dp(AdInfo adInfo) {
        try {
            return !adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.shakeInfo.clickDisabled;
        } catch (Exception e) {
            return false;
        }
    }

    public static long dq(AdInfo adInfo) {
        try {
            long j = adInfo.adMatrixInfo.adDataV2.splashInfo.interactionInfo.switchDefaultTime;
            if (j <= 0) {
                return 1500L;
            }
            return j;
        } catch (Exception e) {
            return 1500L;
        }
    }

    public static boolean dr(AdInfo adInfo) {
        try {
            return !adInfo.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.shakeInfo.clickDisabled;
        } catch (Exception e) {
            return false;
        }
    }

    public static float ds(AdInfo adInfo) {
        int i;
        try {
            i = adInfo.adMatrixInfo.adDataV2.fullScreenInfo.interactionInfo.shakeInfo.acceleration;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            i = 7;
        }
        return i;
    }

    public static float dt(AdInfo adInfo) {
        int i;
        try {
            i = adInfo.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.shakeInfo.acceleration;
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
            i = 7;
        }
        return i;
    }

    public static String du(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.fullScreenInfo.interactionInfo.shakeInfo.title;
    }

    public static String dv(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.shakeInfo.title;
    }

    public static String dw(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.fullScreenInfo.interactionInfo.shakeInfo.subtitle;
    }

    public static String dx(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.shakeInfo.subtitle;
    }

    public static AdMatrixInfo.DownloadTexts dy(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.fullScreenInfo.interactionInfo.splashActionBarInfo.downloadTexts;
    }

    public static AdMatrixInfo.DownloadTexts dz(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.neoVideoInfo.interactionInfo.splashActionBarInfo.downloadTexts;
    }

    public static AdMatrixInfo.MatrixTemplate e(AdTemplate adTemplate, String str) {
        return d(adTemplate, str);
    }

    private static AdMatrixInfo.TemplateData f(AdTemplate adTemplate, String str) {
        for (AdMatrixInfo.TemplateData templateData : aS(adTemplate).adDataV2.templateDataList) {
            if (bc.isEquals(str, templateData.templateId)) {
                return templateData;
            }
        }
        return null;
    }

    private static long g(AdTemplate adTemplate, String str) {
        AdMatrixInfo.TemplateData f = f(adTemplate, str);
        if (f != null) {
            return f.templateDelayTime;
        }
        return 0L;
    }

    public static boolean g(AdInfo adInfo) {
        return (!adInfo.adRewardInfo.recommendAggregateSwitch || a.cA(adInfo) || a.bv(adInfo)) ? false : true;
    }

    private static boolean h(AdTemplate adTemplate, String str) {
        AdMatrixInfo.TemplateData f = f(adTemplate, str);
        try {
            JSONObject optJSONObject = new JSONObject(f != null ? f.data : "").optJSONObject("autoCallAppInfo");
            if (optJSONObject != null) {
                return !TextUtils.isEmpty(optJSONObject.optString(AudienceNetworkActivity.AD_TITLE));
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }
}
