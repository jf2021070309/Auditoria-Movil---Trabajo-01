package com.kwad.components.core.webview.b;

import android.text.TextUtils;
import com.kwad.sdk.core.report.KSLoggerReporter;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class j {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String b(String str, AdTemplate adTemplate) {
        char c;
        AdMatrixInfo.BaseMatrixTemplate baseMatrixTemplate;
        AdMatrixInfo.AdDataV2 adDataV2 = com.kwad.sdk.core.response.b.b.aS(adTemplate).adDataV2;
        switch (str.hashCode()) {
            case -1777431161:
                if (str.equals("ksad-video-top-bar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1589174862:
                if (str.equals("ksad-fullscreen-video-card")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1545218748:
                if (str.equals("ksad-video-task-card")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -261341611:
                if (str.equals("ksad-installed-activate-card")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -259656373:
                if (str.equals("ksad-video-bottom-card-v2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -206391259:
                if (str.equals("ksad-splash-play-card")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 44717817:
                if (str.equals("ksad-neo-video-card")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 144881219:
                if (str.equals("ksad-pre-landingpage-card")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 625896230:
                if (str.equals("ksad-splash-end-card")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 661927521:
                if (str.equals("ksad-live-video-card")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 787160939:
                if (str.equals("ksad-video-topfloor")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1188774735:
                if (str.equals("ksad-interstitial-card")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1339306036:
                if (str.equals("ksad-video-middle-card")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1528649430:
                if (str.equals("ksad-image-video-card")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 1619320353:
                if (str.equals("ksad-push-card")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 1649519421:
                if (str.equals("ksad-video-secondclick-card")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1651568242:
                if (str.equals("ksad-video-web-close-card")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1866270907:
                if (str.equals("ksad-video-playend-dialog-card")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1892692881:
                if (str.equals("ksad-video-confirm-card")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2001659187:
                if (str.equals("ksad-video-interact-card")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = "";
        switch (c) {
            case 0:
                baseMatrixTemplate = adDataV2.topBarTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 1:
                baseMatrixTemplate = adDataV2.middleTKCardInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 2:
                baseMatrixTemplate = adDataV2.actionBarTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 3:
                baseMatrixTemplate = adDataV2.confirmTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 4:
                baseMatrixTemplate = adDataV2.playendTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 5:
                baseMatrixTemplate = adDataV2.activityTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 6:
                str2 = adDataV2.interstitialCardInfo.templateId;
                break;
            case 7:
                str2 = adDataV2.rewardVideoInteractInfo.templateId;
                break;
            case '\b':
                str2 = adDataV2.rewardVideoTaskInfo.templateId;
                break;
            case '\t':
                str2 = adDataV2.mRewardWebTaskCloseInfo.templateId;
                break;
            case '\n':
                str2 = adDataV2.fullScreenInfo.templateId;
                break;
            case 11:
                str2 = adDataV2.splashPlayCardTKInfo.templateId;
                break;
            case '\f':
                str2 = adDataV2.splashEndCardTKInfo.templateId;
                break;
            case '\r':
                str2 = adDataV2.topFloorTKInfo.templateId;
                break;
            case 14:
                baseMatrixTemplate = adDataV2.neoTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 15:
                str2 = adDataV2.pushTKInfo.templateId;
                break;
            case 16:
                str2 = adDataV2.preLandingPageTKInfo.templateId;
                break;
            case 17:
                baseMatrixTemplate = adDataV2.videoImageTKInfo;
                str2 = baseMatrixTemplate.templateId;
                break;
            case 18:
                str = adDataV2.installedActivateInfo.templateId;
                break;
            case 19:
                str = adDataV2.videoLiveTKInfo.templateId;
                break;
        }
        if (TextUtils.isEmpty(str2)) {
            Iterator<AdMatrixInfo.MatrixTemplate> it = com.kwad.sdk.core.response.b.b.aS(adTemplate).styles.templateList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().templateId.equals(str)) {
                        str2 = str;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            KSLoggerReporter.ReportClient.RESPONE_MONITOR.buildNormalApmReporter().dx("response_biz_error_tk").aO(adTemplate).a(BusinessType.TACHIKOMA).T("TkTemplateIdLost", str).report();
            return str;
        }
        return str2;
    }
}
