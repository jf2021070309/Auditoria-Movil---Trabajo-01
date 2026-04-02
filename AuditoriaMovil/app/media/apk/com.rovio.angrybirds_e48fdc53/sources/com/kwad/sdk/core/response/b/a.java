package com.kwad.sdk.core.response.b;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.ai;
import com.kwad.sdk.utils.bc;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    public static String Cy() {
        return "继续下载";
    }

    public static long E(AdInfo adInfo) {
        return adInfo.adBaseInfo.creativeId;
    }

    public static String F(AdInfo adInfo) {
        return aN(adInfo).materialUrl;
    }

    public static int G(AdInfo adInfo) {
        return (aW(adInfo) == 2 ? aM(adInfo) : aN(adInfo)).videoDuration;
    }

    public static long H(AdInfo adInfo) {
        return (aW(adInfo) == 2 ? aM(adInfo) : aN(adInfo)).videoDuration * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String I(com.kwad.sdk.core.response.model.AdInfo r6) {
        /*
            int r0 = aW(r6)
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L35
            r3 = 2
            if (r0 == r3) goto L12
            if (r0 == r1) goto L12
            r2 = 8
            if (r0 == r2) goto L58
            goto L7b
        L12:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r0 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r0 = r0.materialFeatureList
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r0.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r4 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r4
            int r5 = r4.featureType
            if (r5 != r3) goto L1a
            java.lang.String r5 = r4.firstFrame
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L1a
            java.lang.String r6 = r4.firstFrame
            return r6
        L35:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r0 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r0 = r0.materialFeatureList
            java.util.Iterator r0 = r0.iterator()
        L3d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r0.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r3 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r3
            int r4 = r3.featureType
            if (r4 != r2) goto L3d
            java.lang.String r4 = r3.firstFrame
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3d
            java.lang.String r6 = r3.firstFrame
            return r6
        L58:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r6 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r6 = r6.materialFeatureList
            java.util.Iterator r6 = r6.iterator()
        L60:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r6.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r0
            int r2 = r0.featureType
            if (r2 != r1) goto L60
            java.lang.String r2 = r0.firstFrame
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L60
            java.lang.String r6 = r0.firstFrame
            return r6
        L7b:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.response.b.a.I(com.kwad.sdk.core.response.model.AdInfo):java.lang.String");
    }

    public static boolean J(AdInfo adInfo) {
        return adInfo.adConversionInfo.supportThirdDownload == 1;
    }

    public static int K(AdInfo adInfo) {
        return aN(adInfo).videoWidth;
    }

    public static int L(AdInfo adInfo) {
        return aN(adInfo).videoHeight;
    }

    public static boolean M(AdInfo adInfo) {
        return adInfo.adConversionInfo.smallAppJumpInfo == null || TextUtils.isEmpty(adInfo.adConversionInfo.smallAppJumpInfo.mediaSmallAppId);
    }

    public static boolean N(AdInfo adInfo) {
        return adInfo.adConversionInfo.webUriSourceType == 2;
    }

    public static boolean O(AdInfo adInfo) {
        AdInfo.AdMaterialInfo.MaterialFeature aN = aN(adInfo);
        return aN.videoWidth <= aN.videoHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String P(com.kwad.sdk.core.response.model.AdInfo r6) {
        /*
            int r0 = aW(r6)
            r1 = 3
            r2 = 1
            if (r0 == r2) goto L41
            r3 = 2
            if (r0 == r3) goto L13
            if (r0 == r1) goto L13
            r2 = 8
            if (r0 == r2) goto L64
            goto L87
        L13:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r0 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r0 = r0.materialFeatureList
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r0.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r4 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r4
            int r5 = r4.featureType
            if (r5 != r3) goto L1b
            java.lang.String r5 = r4.materialUrl
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L36
            java.lang.String r6 = r4.materialUrl
            return r6
        L36:
            java.lang.String r5 = r4.coverUrl
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L1b
            java.lang.String r6 = r4.coverUrl
            return r6
        L41:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r0 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r0 = r0.materialFeatureList
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r0.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r3 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r3
            int r4 = r3.featureType
            if (r4 != r2) goto L49
            java.lang.String r4 = r3.coverUrl
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L49
            java.lang.String r6 = r3.coverUrl
            return r6
        L64:
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo r6 = r6.adMaterialInfo
            java.util.List<com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature> r6 = r6.materialFeatureList
            java.util.Iterator r6 = r6.iterator()
        L6c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r0 = r6.next()
            com.kwad.sdk.core.response.model.AdInfo$AdMaterialInfo$MaterialFeature r0 = (com.kwad.sdk.core.response.model.AdInfo.AdMaterialInfo.MaterialFeature) r0
            int r2 = r0.featureType
            if (r2 != r1) goto L6c
            java.lang.String r2 = r0.coverUrl
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L6c
            java.lang.String r6 = r0.coverUrl
            return r6
        L87:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.response.b.a.P(com.kwad.sdk.core.response.model.AdInfo):java.lang.String");
    }

    public static String Q(AdInfo adInfo) {
        int aW = aW(adInfo);
        if (aW != 1) {
            if (aW != 2 && aW != 3) {
                return "";
            }
            for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : adInfo.adMaterialInfo.materialFeatureList) {
                if (materialFeature.featureType == 2 && !TextUtils.isEmpty(materialFeature.blurBackgroundUrl)) {
                    return materialFeature.blurBackgroundUrl;
                }
            }
        }
        return aQ(adInfo).blurBackgroundUrl;
    }

    private static int R(AdInfo adInfo) {
        return aN(adInfo).width;
    }

    private static int S(AdInfo adInfo) {
        return aN(adInfo).height;
    }

    public static long T(AdInfo adInfo) {
        return aN(adInfo).photoId;
    }

    public static String U(AdInfo adInfo) {
        return (adInfo == null || TextUtils.isEmpty(adInfo.adBaseInfo.openAppLabel)) ? "立即打开" : adInfo.adBaseInfo.openAppLabel;
    }

    public static long V(AdInfo adInfo) {
        return adInfo.adRewardInfo.rewardTime;
    }

    public static int W(AdInfo adInfo) {
        return adInfo.adRewardInfo.skipShowTime;
    }

    public static long X(AdInfo adInfo) {
        return adInfo.adRewardInfo.skipShowTime * 1000;
    }

    public static long Y(AdInfo adInfo) {
        return adInfo.adRewardInfo.rewardTime * 1000;
    }

    private static int Z(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo != null) {
            return adInfo.adStyleConfInfo.rewardSkipConfirmSwitch;
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo is null");
        return 1;
    }

    public static int aA(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoInteractInfo.dayMaxLimit;
    }

    public static int aB(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoInteractInfo.showTime;
    }

    public static int aC(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoInteractInfo.rewardTime;
    }

    public static int aD(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoTaskInfo.showTime;
    }

    public static int aE(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoTaskInfo.thresholdTime;
    }

    public static int aF(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoTaskInfo.taskType;
    }

    public static boolean aG(AdInfo adInfo) {
        return !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.rewardVideoTaskInfo.templateId);
    }

    public static boolean aH(AdInfo adInfo) {
        return adInfo.downloadSafeInfo.complianceInfo != null && ax(adInfo) && adInfo.downloadSafeInfo.complianceInfo.titleBarTextSwitch == 1;
    }

    public static int aI(AdInfo adInfo) {
        int i = adInfo.adBaseInfo.adOperationType;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int aJ(AdInfo adInfo) {
        return adInfo.adBaseInfo.ecpm;
    }

    public static String aK(AdInfo adInfo) {
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        return TextUtils.isEmpty(adInfo.adConversionInfo.h5Url) ? "" : ac.c(eVar == null ? null : eVar.getContext(), adInfo.adConversionInfo.h5Url, at(adInfo));
    }

    public static int aL(AdInfo adInfo) {
        return adInfo.adConversionInfo.h5Type;
    }

    public static AdInfo.AdMaterialInfo.MaterialFeature aM(AdInfo adInfo) {
        for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : adInfo.adMaterialInfo.materialFeatureList) {
            if (materialFeature != null && materialFeature.featureType == 2 && !TextUtils.isEmpty(materialFeature.materialUrl)) {
                return materialFeature;
            }
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "getImageMaterialFeature in null");
        return new AdInfo.AdMaterialInfo.MaterialFeature();
    }

    public static AdInfo.AdMaterialInfo.MaterialFeature aN(AdInfo adInfo) {
        for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : adInfo.adMaterialInfo.materialFeatureList) {
            if (materialFeature != null && materialFeature.featureType == 1 && !TextUtils.isEmpty(materialFeature.materialUrl)) {
                return materialFeature;
            }
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "getVideoMaterialFeature in null");
        return new AdInfo.AdMaterialInfo.MaterialFeature();
    }

    public static boolean aO(AdInfo adInfo) {
        AdInfo.AdMaterialInfo.MaterialFeature aN = aU(adInfo) ? aN(adInfo) : aM(adInfo);
        return aN.height > aN.width;
    }

    public static float aP(AdInfo adInfo) {
        AdInfo.AdMaterialInfo.MaterialFeature aN = aU(adInfo) ? aN(adInfo) : aM(adInfo);
        if (aN == null || aN.width == 0) {
            return -1.0f;
        }
        com.kwad.sdk.core.e.c.d("AdInfoHelper", "getMaterialRatio: height: " + aN.height + ", width: " + aN.width);
        return aN.height / aN.width;
    }

    private static AdInfo.AdMaterialInfo.MaterialFeature aQ(AdInfo adInfo) {
        List<AdInfo.AdMaterialInfo.MaterialFeature> list = adInfo.adMaterialInfo.materialFeatureList;
        AdInfo.AdMaterialInfo.MaterialFeature materialFeature = list.size() > 0 ? list.get(0) : null;
        return materialFeature == null ? new AdInfo.AdMaterialInfo.MaterialFeature() : materialFeature;
    }

    public static String aQ(AdTemplate adTemplate) {
        if (adTemplate == null || adTemplate.mAdScene == null || adTemplate.mAdScene.getAdStyle() != 2 || cv(d.ck(adTemplate)) || cw(d.ck(adTemplate))) {
            if (adTemplate == null) {
                return "立即安装";
            }
            AdInfo ck = d.ck(adTemplate);
            return TextUtils.isEmpty(ck.adBaseInfo.installAppLabel) ? "立即安装" : ck.adBaseInfo.installAppLabel;
        }
        return "安装获取奖励";
    }

    public static boolean aR(AdInfo adInfo) {
        AdInfo.AdMaterialInfo.MaterialFeature aN = aN(adInfo);
        return aN.height > aN.width;
    }

    @Deprecated
    public static boolean aR(AdTemplate adTemplate) {
        AdInfo ck = d.ck(adTemplate);
        AdMatrixInfo.MerchantLiveReservationInfo bP = b.bP(adTemplate);
        return (bP != null && !bP.isEmpty()) && ck.adStyleConfInfo.innerAdType == 2;
    }

    public static String aS(AdInfo adInfo) {
        return adInfo.adPreloadInfo.preloadId;
    }

    public static List<String> aT(AdInfo adInfo) {
        ArrayList arrayList = new ArrayList();
        int aW = aW(adInfo);
        if (aW == 2 || aW == 3) {
            for (AdInfo.AdMaterialInfo.MaterialFeature materialFeature : adInfo.adMaterialInfo.materialFeatureList) {
                if (materialFeature.featureType == 2 && !TextUtils.isEmpty(materialFeature.materialUrl)) {
                    arrayList.add(materialFeature.materialUrl);
                }
            }
            return arrayList;
        }
        return arrayList;
    }

    public static boolean aU(AdInfo adInfo) {
        return aW(adInfo) == 1;
    }

    public static boolean aV(AdInfo adInfo) {
        return aM(adInfo).featureType == 2;
    }

    public static int aW(AdInfo adInfo) {
        int i = adInfo.adMaterialInfo.materialType;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i != 5) {
                    return i != 8 ? 0 : 8;
                }
                return 3;
            }
        }
        return i2;
    }

    public static int aX(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.actionBarInfo.cardType;
    }

    public static String aY(AdInfo adInfo) {
        return adInfo.adBaseInfo.liveStreamId;
    }

    public static boolean aZ(AdInfo adInfo) {
        return adInfo.adMaterialInfo.materialType == 1;
    }

    public static boolean aa(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo.nativeAdInfo == null || adInfo.adStyleConfInfo.nativeAdInfo.shakeInfo == null) {
            com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo.nativeAdInfo is null");
            return false;
        }
        return adInfo.adStyleConfInfo.nativeAdInfo.shakeInfo.enableShake;
    }

    public static int ab(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo.nativeAdInfo != null) {
            return adInfo.adStyleConfInfo.nativeAdInfo.shakeInfo.acceleration;
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo.nativeAdInfo is null");
        return 2;
    }

    public static boolean ac(AdInfo adInfo) {
        return Z(adInfo) != 0;
    }

    public static long ad(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo != null) {
            return adInfo.adStyleConfInfo.fullScreenSkipShowTime * 1000;
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo is null");
        return PushUIConfig.dismissTime;
    }

    public static long ae(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo != null) {
            return adInfo.adStyleConfInfo.closeDelaySeconds * 1000;
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo is null");
        return 0L;
    }

    public static int af(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.adShowVideoH5Info.showPageType;
    }

    public static boolean ag(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.adShowVideoH5Info.videoAutoLoopAtH5;
    }

    public static boolean ah(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.adShowVideoH5Info.videoMutedAtH5;
    }

    public static boolean ai(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.adShowVideoH5Info.videoClickAtH5;
    }

    public static long aj(AdInfo adInfo) {
        if (adInfo.adStyleConfInfo != null) {
            return adInfo.adStyleConfInfo.playableCloseSeconds * 1000;
        }
        com.kwad.sdk.core.e.c.w("AdInfoHelper", "adInfo.adStyleConfInfo is null");
        return 0L;
    }

    public static boolean ak(AdInfo adInfo) {
        return !ax(adInfo) && al(adInfo);
    }

    public static boolean al(AdInfo adInfo) {
        if (adInfo.adRewardInfo.showLandingPage == 1) {
            return ((aG(adInfo) && aF(adInfo) == 1) || cA(adInfo)) ? false : true;
        }
        return false;
    }

    public static boolean am(AdInfo adInfo) {
        return (!(adInfo.fullScreenVideoInfo.showLandingPage == 1) || !(bc.isNullString(aK(adInfo)) ^ true) || ax(adInfo) || (bc.isNullString(cx(adInfo)) ^ true) || bv(adInfo)) ? false : true;
    }

    public static String an(AdInfo adInfo) {
        return adInfo.adBaseInfo.adDescription;
    }

    public static String ao(AdInfo adInfo) {
        return adInfo.adBaseInfo.appName;
    }

    public static String ap(AdInfo adInfo) {
        return adInfo.adBaseInfo.productName;
    }

    public static String aq(AdInfo adInfo) {
        if (adInfo == null || adInfo.adBaseInfo == null) {
            return null;
        }
        return adInfo.adBaseInfo.appPackageName;
    }

    public static String ar(AdInfo adInfo) {
        return adInfo.adBaseInfo.appDownloadCountDesc;
    }

    public static float as(AdInfo adInfo) {
        if (adInfo.adBaseInfo.appScore <= 0) {
            return 0.0f;
        }
        return adInfo.adBaseInfo.appScore / 10.0f;
    }

    public static boolean at(AdInfo adInfo) {
        return adInfo.adBaseInfo.enableClientProofreadTime;
    }

    public static float au(AdInfo adInfo) {
        float f = adInfo.adBaseInfo.appScore;
        if (f < 30.0f) {
            return 3.0f;
        }
        if (f < 35.0f) {
            return 3.5f;
        }
        if (f < 40.0f) {
            return 4.0f;
        }
        return f < 45.0f ? 4.5f : 5.0f;
    }

    public static String av(AdInfo adInfo) {
        return bc.isNullString(adInfo.adBaseInfo.adSourceDescription) ? "广告" : adInfo.adBaseInfo.adSourceDescription;
    }

    public static String aw(AdInfo adInfo) {
        if (adInfo == null) {
            return "立即下载";
        }
        String str = adInfo.adBaseInfo.adActionDescription;
        if (TextUtils.isEmpty(str)) {
            return ax(adInfo) ? "立即下载" : "查看详情";
        }
        return str;
    }

    public static boolean ax(AdInfo adInfo) {
        return aI(adInfo) == 1;
    }

    public static boolean ay(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.rewardVideoInteractSwitch && !TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.rewardVideoInteractInfo.templateId);
    }

    public static int az(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.rewardVideoInteractInfo.intervalShow;
    }

    public static boolean b(AdInfo adInfo, boolean z) {
        return ((z && ax(adInfo)) || adInfo.adBaseInfo.mABParams.showVideoAtH5 == 0 || bc.isNullString(aK(adInfo))) ? false : true;
    }

    private static boolean bA(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null || adInfo.adConversionInfo.playableStyleInfo == null) {
            return false;
        }
        int i = adInfo.adConversionInfo.playableStyleInfo.playableOrientation;
        return i == 0 || i == 1;
    }

    public static String bB(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null) {
            return null;
        }
        return adInfo.adConversionInfo.playableUrl;
    }

    public static String bC(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null) {
            return null;
        }
        return adInfo.adConversionInfo.callbackUrl;
    }

    public static String bD(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null) {
            return null;
        }
        return adInfo.adConversionInfo.callbackUrlInfo;
    }

    public static String bE(AdInfo adInfo) {
        if (adInfo == null || adInfo.serverExt == null) {
            return null;
        }
        return adInfo.serverExt;
    }

    public static boolean bF(AdInfo adInfo) {
        return adInfo.fullScreenVideoInfo.fullScreenEndCardSwitch;
    }

    public static boolean bG(AdInfo adInfo) {
        return adInfo.adRewardInfo.rewardVideoEndCardSwitch;
    }

    public static boolean bH(AdInfo adInfo) {
        return (adInfo == null || adInfo.adFeedInfo == null || adInfo.adFeedInfo.videoSoundType != 2) ? false : true;
    }

    public static boolean bI(AdInfo adInfo) {
        if (adInfo == null || adInfo.adFeedInfo == null) {
            return false;
        }
        return adInfo.adFeedInfo.videoAutoPlayType == 1 || adInfo.adFeedInfo.videoAutoPlayType == 0;
    }

    public static boolean bJ(AdInfo adInfo) {
        return (adInfo == null || adInfo.adFeedInfo == null || adInfo.adFeedInfo.videoAutoPlayType != 2) ? false : true;
    }

    public static boolean bK(AdInfo adInfo) {
        return (TextUtils.isEmpty(aK(adInfo)) || ax(adInfo) || adInfo.adStyleInfo.adBrowseInfo.enableAdBrowse != 1) ? false : true;
    }

    public static int bL(AdInfo adInfo) {
        if (adInfo == null) {
            return 0;
        }
        return adInfo.adStyleConfInfo.actionBarType;
    }

    public static int bM(AdInfo adInfo) {
        if (adInfo == null) {
            return 0;
        }
        return adInfo.adStyleConfInfo.endCardType;
    }

    public static int bN(AdInfo adInfo) {
        if (adInfo == null) {
            return 0;
        }
        return adInfo.adStyleConfInfo.confirmCardType;
    }

    public static String bO(AdInfo adInfo) {
        String ao = ax(adInfo) ? ao(adInfo) : ap(adInfo);
        if (TextUtils.isEmpty(ao)) {
            ao = adInfo.advertiserInfo.rawUserName;
        }
        return TextUtils.isEmpty(ao) ? "可爱的广告君" : ao;
    }

    public static String bP(AdInfo adInfo) {
        return adInfo.advertiserInfo.rawUserName;
    }

    public static String bQ(AdInfo adInfo) {
        String str = adInfo.adBaseInfo.appIconUrl;
        return (TextUtils.isEmpty(str) || !ax(adInfo)) ? adInfo.advertiserInfo.portraitUrl : str;
    }

    public static long bR(AdInfo adInfo) {
        return adInfo.advertiserInfo.userId;
    }

    public static String bS(AdInfo adInfo) {
        return (adInfo == null || adInfo.adSplashInfo == null || adInfo.adSplashInfo.skipTips == null || TextUtils.isEmpty(adInfo.adSplashInfo.skipTips)) ? "跳过" : adInfo.adSplashInfo.skipTips;
    }

    public static AdInfo.CutRuleInfo bT(AdInfo adInfo) {
        return adInfo.adSplashInfo.cutRuleInfo;
    }

    public static int bU(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashEndCardTKInfo.endCardShowSecond;
    }

    public static boolean bV(AdInfo adInfo) {
        return adInfo.adMatrixInfo.adDataV2.splashEndCardTKInfo.endCardShowCountDown;
    }

    public static int bW(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.retainWindowBasedAdShowCount;
    }

    public static int bX(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.retainWindowDailyShowCount;
    }

    public static int bY(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.retainWindowStyle;
    }

    public static int bZ(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.guideShowStyle;
    }

    public static boolean ba(AdInfo adInfo) {
        return adInfo.adConversionInfo.needDeeplinkReplaceAdapta;
    }

    public static boolean bb(AdInfo adInfo) {
        return adInfo.adConversionInfo.isSupportKeepPlaying;
    }

    public static long bc(AdInfo adInfo) {
        return adInfo.adConversionInfo.keepPlayingBackOffTime;
    }

    public static List<Integer> bd(AdInfo adInfo) {
        String str = adInfo.adBaseInfo.videoPlayedNS;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(",")) {
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt > 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                    }
                }
            } catch (Exception e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(3);
        }
        return arrayList;
    }

    private static int[] be(AdInfo adInfo) {
        String[] split;
        int[] iArr = {3, 3, 3};
        String str = adInfo.adBaseInfo.mABParams.drawActionBarTimes;
        if (TextUtils.isEmpty(str)) {
            return iArr;
        }
        try {
            split = str.split(",");
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        if (split.length < 3) {
            return iArr;
        }
        iArr[0] = Integer.parseInt(split[0]);
        iArr[1] = Integer.parseInt(split[1]);
        iArr[2] = Integer.parseInt(split[2]);
        return iArr;
    }

    public static int bf(AdInfo adInfo) {
        int[] be = be(adInfo);
        if (be[0] > 0) {
            return be[0];
        }
        return 3;
    }

    public static int bg(AdInfo adInfo) {
        int[] be = be(adInfo);
        return (be[1] > 0 ? be[1] : 3) + bf(adInfo);
    }

    public static int bh(AdInfo adInfo) {
        int[] be = be(adInfo);
        return (be[2] > 0 ? be[2] : 3) + bg(adInfo);
    }

    public static com.kwad.sdk.core.response.model.b bi(AdInfo adInfo) {
        boolean z;
        String I = I(adInfo);
        int K = K(adInfo);
        int L = L(adInfo);
        if (bc.isNullString(I) || bc.fK(I) || K == 0 || L == 0) {
            I = P(adInfo);
            K = R(adInfo);
            L = S(adInfo);
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        String str = I;
        com.kwad.sdk.core.e.c.d("AdInfoHelper", "frameUrl=" + str + " useCover=" + z2 + " isAd=true");
        return new com.kwad.sdk.core.response.model.b(str, K, L, true, z2);
    }

    public static String bj(AdInfo adInfo) {
        String str = adInfo.downloadSafeInfo.webPageTipbarText;
        return !TextUtils.isEmpty(str) ? str : "您访问的网站由第三方提供";
    }

    public static boolean bk(AdInfo adInfo) {
        return adInfo.downloadSafeInfo.secWindowPopSwitch;
    }

    public static boolean bl(AdInfo adInfo) {
        return adInfo.downloadSafeInfo.secWindowPopNoWifiSwitch;
    }

    public static int bm(AdInfo adInfo) {
        if (adInfo.downloadSafeInfo.complianceInfo == null) {
            return -1;
        }
        return adInfo.downloadSafeInfo.complianceInfo.materialJumpType;
    }

    public static boolean bn(AdInfo adInfo) {
        return adInfo.downloadSafeInfo.webPageTipbarSwitch;
    }

    public static int bo(AdInfo adInfo) {
        if (adInfo != null) {
            int i = adInfo.status;
            if (i == 0) {
                return 1;
            }
            if (1 == i || 2 == i || 3 == i || 4 == i) {
                return 2;
            }
            return 8 == i ? 3 : 0;
        }
        return 0;
    }

    public static String bp(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.adBaseInfo.corporationName;
        }
        return null;
    }

    public static String bq(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.downloadSafeInfo.permissionInfo;
        }
        return null;
    }

    public static String br(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.downloadSafeInfo.appPermissionInfoUrl;
        }
        return null;
    }

    public static String bs(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.downloadSafeInfo.appPrivacyUrl;
        }
        return null;
    }

    public static String bt(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.adBaseInfo.appVersion;
        }
        return null;
    }

    public static long bu(AdInfo adInfo) {
        if (adInfo != null) {
            return adInfo.adBaseInfo.packageSize;
        }
        return 0L;
    }

    public static boolean bv(AdInfo adInfo) {
        if (adInfo != null && adInfo.adConversionInfo != null) {
            boolean z = (adInfo.adConversionInfo.playableUrl == null || adInfo.adConversionInfo.playableStyleInfo == null || TextUtils.isEmpty(adInfo.adConversionInfo.playableUrl.trim())) ? false : true;
            if (by(adInfo) && z) {
                return true;
            }
        }
        return false;
    }

    public static long bw(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null) {
            return 0L;
        }
        return adInfo.adConversionInfo.h5DeeplinkLimitedTimeMs;
    }

    public static long bx(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null) {
            return 0L;
        }
        return adInfo.adConversionInfo.playableDeeplinkLimitedTimeMs;
    }

    public static boolean by(AdInfo adInfo) {
        return ai.IL() ? bA(adInfo) : bz(adInfo);
    }

    private static boolean bz(AdInfo adInfo) {
        if (adInfo == null || adInfo.adConversionInfo == null || adInfo.adConversionInfo.playableStyleInfo == null) {
            return false;
        }
        int i = adInfo.adConversionInfo.playableStyleInfo.playableOrientation;
        return i == 0 || i == 2;
    }

    public static boolean cA(AdInfo adInfo) {
        if (ax(adInfo)) {
            return false;
        }
        return adInfo.adBaseInfo.extraClickReward;
    }

    public static boolean cB(AdInfo adInfo) {
        return cA(adInfo) && Y(adInfo) < H(adInfo);
    }

    public static boolean cC(AdInfo adInfo) {
        if (TextUtils.isEmpty(adInfo.adMatrixInfo.adDataV2.pushTKInfo.templateId)) {
            com.kwad.sdk.core.e.c.d("AdInfoHelper", "isPushAdEnable pushTK TemplateId is empty");
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((java.lang.System.currentTimeMillis() - r2) > (r7 * 1000)) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean cD(com.kwad.sdk.core.response.model.AdInfo r9) {
        /*
            com.kwad.sdk.core.response.model.AdInfo$AdStyleConfInfo r0 = r9.adStyleConfInfo
            boolean r0 = r0.adPushSwitch
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r2 = com.kwad.sdk.utils.y.Ix()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 1
            if (r0 > 0) goto L15
        L13:
            r1 = r6
            goto L2d
        L15:
            com.kwad.sdk.core.response.model.AdInfo$AdStyleConfInfo r9 = r9.adStyleConfInfo
            int r9 = r9.adPushIntervalTime
            long r7 = (long) r9
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 > 0) goto L20
            r7 = 900(0x384, double:4.447E-321)
        L20:
            r4 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r4
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L2d
            goto L13
        L2d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "isPushAdEnable intervalEnable: "
            r9.<init>(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "AdInfoHelper"
            com.kwad.sdk.core.e.c.d(r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.response.b.a.cD(com.kwad.sdk.core.response.model.AdInfo):boolean");
    }

    public static int cE(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.adPushShowAfterTime * 1000;
    }

    public static boolean cF(AdInfo adInfo) {
        return (!cw(adInfo) || TextUtils.isEmpty(b.dE(adInfo)) || cG(adInfo)) ? false : true;
    }

    private static boolean cG(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.useNativeForOuterLiveAd;
    }

    public static long cH(AdInfo adInfo) {
        return adInfo.adRewardInfo.callBackStrategyInfo.callBackAdvanceMs;
    }

    public static boolean cI(AdInfo adInfo) {
        return adInfo.adRewardInfo.callBackStrategyInfo.serverCheckSwitch;
    }

    public static boolean cJ(AdInfo adInfo) {
        return adInfo.adRewardInfo.callBackStrategyInfo.rewardAdvanceSwitch;
    }

    public static int ca(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.guideShowTime;
    }

    public static String cb(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.retainWindowText;
    }

    public static boolean cc(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.cycleAggregateSwitch;
    }

    public static int cd(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.cycleAggregateStyle;
    }

    public static int ce(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.cycleAggregateInterval;
    }

    public static int cf(AdInfo adInfo) {
        return adInfo.adInsertScreenInfo.cycleAggregateDailyShowCount;
    }

    public static boolean cg(AdInfo adInfo) {
        return adInfo.adSplashInfo.skipType == 2 || adInfo.adSplashInfo.skipType == 3;
    }

    public static boolean ch(AdInfo adInfo) {
        if (ci(adInfo)) {
            return adInfo.adSplashInfo.skipType == 0 || adInfo.adSplashInfo.skipType == 2;
        }
        return false;
    }

    public static boolean ci(AdInfo adInfo) {
        return adInfo.adSplashInfo.skipSecond >= 0;
    }

    public static boolean cj(AdInfo adInfo) {
        return (adInfo == null || adInfo.adSplashInfo == null || adInfo.adSplashInfo.countdownShow != 1) ? false : true;
    }

    public static boolean ck(AdInfo adInfo) {
        return adInfo.adSplashInfo.impressionStatisticalChangeSwitch;
    }

    public static int cl(AdInfo adInfo) {
        double d = adInfo.adSplashInfo.impressionLimitSize;
        return ((int) ((d <= PangleAdapterUtils.CPM_DEFLAUT_VALUE || d > 1.0d) ? 0.699999988079071d : 0.699999988079071d)) * 100;
    }

    public static boolean cm(AdInfo adInfo) {
        if (adInfo == null || adInfo.downloadSafeInfo == null) {
            return false;
        }
        return adInfo.downloadSafeInfo.downloadPauseEnable;
    }

    public static String cn(AdInfo adInfo) {
        return adInfo.adBaseInfo.sdkExtraData;
    }

    @Deprecated
    public static boolean co(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.innerAdType == 3;
    }

    public static boolean cp(AdInfo adInfo) {
        return adInfo.advertiserInfo.followed;
    }

    @Deprecated
    public static boolean cq(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.innerAdType == 1;
    }

    public static String cr(AdInfo adInfo) {
        int i = adInfo.advertiserInfo.fansCount;
        if (i < 200 || i >= 10000) {
            if (i >= 10000) {
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                return decimalFormat.format(i / 10000.0d) + "w";
            }
            return null;
        }
        return String.valueOf(i);
    }

    public static String cs(AdInfo adInfo) {
        return adInfo.advertiserInfo.brief;
    }

    public static String ct(AdInfo adInfo) {
        return adInfo.advertiserInfo.portraitUrl;
    }

    @Deprecated
    public static boolean cu(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.innerAdType == 4 || adInfo.adStyleConfInfo.innerAdType == 5;
    }

    @Deprecated
    public static String cv(int i) {
        return l(i, "下载中  %s%%");
    }

    @Deprecated
    public static boolean cv(AdInfo adInfo) {
        return adInfo.adStyleConfInfo.innerAdType == 7;
    }

    public static String cw(int i) {
        return "继续下载 " + i + "%";
    }

    public static boolean cw(AdInfo adInfo) {
        return adInfo.adBaseInfo.universeLiveType == 1 && bR(adInfo) != 0;
    }

    public static String cx(AdInfo adInfo) {
        com.kwad.sdk.service.a.e eVar = (com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class);
        return ac.c(eVar == null ? null : eVar.getContext(), adInfo.adConversionInfo.deeplinkUrl, at(adInfo));
    }

    public static AdProductInfo cy(AdInfo adInfo) {
        return adInfo.adProductInfo;
    }

    public static String cz(AdInfo adInfo) {
        return adInfo.adConversionInfo.marketUrl;
    }

    public static SpannableString e(AdInfo adInfo, int i) {
        String format;
        int indexOf;
        String cr = cr(adInfo);
        if (cr == null || (indexOf = (format = String.format("已有%s粉丝关注了TA", cr)).indexOf(cr)) < 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(i), indexOf, cr.length() + indexOf, 18);
        return spannableString;
    }

    public static String l(int i, String str) {
        if (str == null) {
            str = "下载中  %s%%";
        }
        return String.format(str, Integer.valueOf(i));
    }
}
