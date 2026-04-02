package com.kwad.sdk.core.b.a;

import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdMatrixInfo;
import com.kwad.sdk.core.response.model.AdProductInfo;
import com.kwad.sdk.core.response.model.AdStyleInfo;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class r implements com.kwad.sdk.core.d<AdInfo> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(AdInfo adInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        adInfo.adBaseInfo = new AdInfo.AdBaseInfo();
        adInfo.adBaseInfo.parseJson(jSONObject.optJSONObject("adBaseInfo"));
        adInfo.advertiserInfo = new AdInfo.AdvertiserInfo();
        adInfo.advertiserInfo.parseJson(jSONObject.optJSONObject("advertiserInfo"));
        adInfo.adConversionInfo = new AdInfo.AdConversionInfo();
        adInfo.adConversionInfo.parseJson(jSONObject.optJSONObject("adConversionInfo"));
        adInfo.adMaterialInfo = new AdInfo.AdMaterialInfo();
        adInfo.adMaterialInfo.parseJson(jSONObject.optJSONObject("adMaterialInfo"));
        adInfo.adTrackInfoList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("adTrackInfo");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                AdInfo.AdTrackInfo adTrackInfo = new AdInfo.AdTrackInfo();
                adTrackInfo.parseJson(optJSONArray.optJSONObject(i));
                adInfo.adTrackInfoList.add(adTrackInfo);
            }
        }
        adInfo.downloadSafeInfo = new AdInfo.DownloadSafeInfo();
        adInfo.downloadSafeInfo.parseJson(jSONObject.optJSONObject("downloadSafeInfo"));
        adInfo.unDownloadConf = new AdInfo.UnDownloadConf();
        adInfo.unDownloadConf.parseJson(jSONObject.optJSONObject("unDownloadConf"));
        adInfo.status = jSONObject.optInt("status");
        adInfo.progress = jSONObject.optInt("progress");
        adInfo.soFarBytes = jSONObject.optLong("soFarBytes");
        adInfo.totalBytes = jSONObject.optLong(DBDefinition.TOTAL_BYTES);
        adInfo.downloadFilePath = jSONObject.optString("downloadFilePath");
        if (adInfo.downloadFilePath == JSONObject.NULL) {
            adInfo.downloadFilePath = "";
        }
        adInfo.downloadId = jSONObject.optString("downloadId");
        if (adInfo.downloadId == JSONObject.NULL) {
            adInfo.downloadId = "";
        }
        adInfo.adPreloadInfo = new AdInfo.AdPreloadInfo();
        adInfo.adPreloadInfo.parseJson(jSONObject.optJSONObject("adPreloadInfo"));
        adInfo.adSplashInfo = new AdInfo.AdSplashInfo();
        adInfo.adSplashInfo.parseJson(jSONObject.optJSONObject("adSplashInfo"));
        adInfo.adStyleInfo = new AdStyleInfo();
        adInfo.adStyleInfo.parseJson(jSONObject.optJSONObject("adStyleInfo"));
        adInfo.adStyleInfo2 = new AdStyleInfo();
        adInfo.adStyleInfo2.parseJson(jSONObject.optJSONObject("adStyleInfo2"));
        adInfo.adAggregateInfo = new AdInfo.AdAggregateInfo();
        adInfo.adAggregateInfo.parseJson(jSONObject.optJSONObject("adAggregateInfo"));
        adInfo.adRewardInfo = new AdInfo.AdRewardInfo();
        adInfo.adRewardInfo.parseJson(jSONObject.optJSONObject("adRewardInfo"));
        adInfo.serverExt = jSONObject.optString("serverExt");
        if (adInfo.serverExt == JSONObject.NULL) {
            adInfo.serverExt = "";
        }
        adInfo.adStyleConfInfo = new AdInfo.AdStyleConfInfo();
        adInfo.adStyleConfInfo.parseJson(jSONObject.optJSONObject("adStyleConfInfo"));
        adInfo.fullScreenVideoInfo = new AdInfo.FullScreenVideoInfo();
        adInfo.fullScreenVideoInfo.parseJson(jSONObject.optJSONObject("fullScreenVideoInfo"));
        adInfo.adFeedInfo = new AdInfo.AdFeedInfo();
        adInfo.adFeedInfo.parseJson(jSONObject.optJSONObject("adFeedInfo"));
        adInfo.adInsertScreenInfo = new AdInfo.AdInsertScreenInfo();
        adInfo.adInsertScreenInfo.parseJson(jSONObject.optJSONObject("adInsertScreenInfo"));
        adInfo.adProductInfo = new AdProductInfo();
        adInfo.adProductInfo.parseJson(jSONObject.optJSONObject("adProductInfo"));
        adInfo.ocpcActionType = jSONObject.optInt("ocpcActionType");
        adInfo.adMatrixInfo = new AdMatrixInfo();
        adInfo.adMatrixInfo.parseJson(jSONObject.optJSONObject("adMatrixInfo"));
        adInfo.trace = jSONObject.optString("trace");
        if (adInfo.trace == JSONObject.NULL) {
            adInfo.trace = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(AdInfo adInfo, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adBaseInfo", adInfo.adBaseInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "advertiserInfo", adInfo.advertiserInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adConversionInfo", adInfo.adConversionInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adMaterialInfo", adInfo.adMaterialInfo);
        com.kwad.sdk.utils.t.putValue(jSONObject, "adTrackInfo", adInfo.adTrackInfoList);
        com.kwad.sdk.utils.t.a(jSONObject, "downloadSafeInfo", adInfo.downloadSafeInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "unDownloadConf", adInfo.unDownloadConf);
        if (adInfo.status != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "status", adInfo.status);
        }
        if (adInfo.progress != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "progress", adInfo.progress);
        }
        if (adInfo.soFarBytes != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "soFarBytes", adInfo.soFarBytes);
        }
        if (adInfo.totalBytes != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, DBDefinition.TOTAL_BYTES, adInfo.totalBytes);
        }
        if (adInfo.downloadFilePath != null && !adInfo.downloadFilePath.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadFilePath", adInfo.downloadFilePath);
        }
        if (adInfo.downloadId != null && !adInfo.downloadId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadId", adInfo.downloadId);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adPreloadInfo", adInfo.adPreloadInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adSplashInfo", adInfo.adSplashInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adStyleInfo", adInfo.adStyleInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adStyleInfo2", adInfo.adStyleInfo2);
        com.kwad.sdk.utils.t.a(jSONObject, "adAggregateInfo", adInfo.adAggregateInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adRewardInfo", adInfo.adRewardInfo);
        if (adInfo.serverExt != null && !adInfo.serverExt.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverExt", adInfo.serverExt);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adStyleConfInfo", adInfo.adStyleConfInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "fullScreenVideoInfo", adInfo.fullScreenVideoInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adFeedInfo", adInfo.adFeedInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adInsertScreenInfo", adInfo.adInsertScreenInfo);
        com.kwad.sdk.utils.t.a(jSONObject, "adProductInfo", adInfo.adProductInfo);
        if (adInfo.ocpcActionType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "ocpcActionType", adInfo.ocpcActionType);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "adMatrixInfo", adInfo.adMatrixInfo);
        if (adInfo.trace != null && !adInfo.trace.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trace", adInfo.trace);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(AdInfo adInfo, JSONObject jSONObject) {
        a2(adInfo, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(AdInfo adInfo, JSONObject jSONObject) {
        return b2(adInfo, jSONObject);
    }
}
