package com.kwad.sdk.core.b.a;

import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.report.r;
import com.kwad.sdk.core.scene.URLPackage;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class gx implements com.kwad.sdk.core.d<com.kwad.sdk.core.report.r> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(com.kwad.sdk.core.report.r rVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        rVar.timestamp = jSONObject.optLong("timestamp");
        rVar.sessionId = jSONObject.optString("sessionId");
        if (rVar.sessionId == JSONObject.NULL) {
            rVar.sessionId = "";
        }
        rVar.Ib = jSONObject.optLong("seq");
        rVar.arv = jSONObject.optLong("listId");
        rVar.arw = jSONObject.optLong("actionType");
        rVar.US = jSONObject.optString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
        if (rVar.US == JSONObject.NULL) {
            rVar.US = "";
        }
        rVar.llsid = jSONObject.optLong("llsid");
        rVar.arx = jSONObject.optJSONObject("extra");
        rVar.ary = jSONObject.optJSONObject("impAdExtra");
        rVar.posId = jSONObject.optLong("posId");
        rVar.contentType = jSONObject.optInt("contentType");
        rVar.realShowType = jSONObject.optInt("realShowType");
        rVar.photoId = jSONObject.optLong("photoId");
        rVar.position = jSONObject.optLong("position");
        rVar.arz = jSONObject.optLong("serverPosition");
        rVar.arA = jSONObject.optLong("photoDuration");
        rVar.arB = jSONObject.optLong("effectivePlayDuration");
        rVar.Xl = jSONObject.optLong("playDuration");
        rVar.blockDuration = jSONObject.optLong("blockDuration");
        rVar.arC = jSONObject.optLong("intervalDuration");
        rVar.arD = jSONObject.optLong("allIntervalDuration");
        rVar.arE = jSONObject.optLong("flowSdk");
        rVar.arF = jSONObject.optLong("blockTimes");
        rVar.contentSourceType = jSONObject.optInt("contentSourceType", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.arG = jSONObject.optInt("adAggPageSource");
        rVar.entryPageSource = jSONObject.optString("entryPageSource");
        if (rVar.entryPageSource == JSONObject.NULL) {
            rVar.entryPageSource = "";
        }
        rVar.urlPackage = new URLPackage();
        rVar.urlPackage.parseJson(jSONObject.optJSONObject("urlPackage"));
        rVar.arH = new URLPackage();
        rVar.arH.parseJson(jSONObject.optJSONObject("referURLPackage"));
        rVar.Qs = jSONObject.optLong(URLPackage.KEY_AUTHOR_ID);
        rVar.arI = jSONObject.optString("photoSize");
        if (rVar.arI == JSONObject.NULL) {
            rVar.arI = "";
        }
        rVar.arJ = jSONObject.optJSONArray("appInstalled");
        rVar.arK = jSONObject.optJSONArray("appUninstalled");
        rVar.arL = new r.a();
        rVar.arL.parseJson(jSONObject.optJSONObject("clientExt"));
        rVar.arM = jSONObject.optInt("playerType");
        rVar.arN = jSONObject.optInt("uiType");
        rVar.arO = jSONObject.optInt("isLeftSlipStatus", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.UT = jSONObject.optInt("refreshType");
        rVar.arP = jSONObject.optInt("photoResponseType", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.arQ = jSONObject.optString("failUrl");
        if (rVar.arQ == JSONObject.NULL) {
            rVar.arQ = "";
        }
        rVar.errorMsg = jSONObject.optString("errorMsg");
        if (rVar.errorMsg == JSONObject.NULL) {
            rVar.errorMsg = "";
        }
        rVar.errorCode = jSONObject.optInt("errorCode", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.creativeId = jSONObject.optLong("creativeId");
        rVar.arT = jSONObject.optString("cacheFailedReason");
        if (rVar.arT == JSONObject.NULL) {
            rVar.arT = "";
        }
        rVar.arU = jSONObject.optJSONObject("appExt");
        rVar.arV = jSONObject.optJSONArray("appRunningInfoList");
        rVar.downloadDuration = jSONObject.optLong("downloadDuration");
        rVar.pageType = jSONObject.optInt("pageType", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.arW = jSONObject.optInt("speedLimitStatus");
        rVar.arX = jSONObject.optInt("speedLimitThreshold");
        rVar.arY = jSONObject.optInt("currentRealDownloadSpeed");
        rVar.asa = jSONObject.optJSONArray("sdkPlatform");
        rVar.asb = jSONObject.optBoolean("isKsUnion");
        rVar.asc = jSONObject.optString("trackMethodName");
        if (rVar.asc == JSONObject.NULL) {
            rVar.asc = "";
        }
        rVar.asd = jSONObject.optInt("viewModeType", new Integer(AppEventsConstants.EVENT_PARAM_VALUE_NO).intValue());
        rVar.clickTime = jSONObject.optLong("clickTime");
        rVar.asf = jSONObject.optLong("frameRenderTime");
        rVar.asg = jSONObject.optInt("playerEnterAction");
        rVar.ash = jSONObject.optString("requestUrl");
        if (rVar.ash == JSONObject.NULL) {
            rVar.ash = "";
        }
        rVar.asi = jSONObject.optLong("requestTotalTime");
        rVar.asj = jSONObject.optLong("requestResponseTime");
        rVar.ask = jSONObject.optLong("requestParseDataTime");
        rVar.asl = jSONObject.optLong("requestCallbackTime");
        rVar.asm = jSONObject.optString("requestFailReason");
        if (rVar.asm == JSONObject.NULL) {
            rVar.asm = "";
        }
        rVar.Pt = jSONObject.optString("pageName");
        if (rVar.Pt == JSONObject.NULL) {
            rVar.Pt = "";
        }
        rVar.PA = jSONObject.optLong("pageCreateTime");
        rVar.PB = jSONObject.optLong("pageResumeTime");
        rVar.asn = jSONObject.optInt("trackUrlType");
        rVar.aso = jSONObject.optJSONArray("trackUrlList");
        rVar.Pz = jSONObject.optLong("pageLaunchTime");
        rVar.asr = jSONObject.optJSONArray("appAuthorityInfoList");
        rVar.ass = jSONObject.optString("tkVersion");
        if (rVar.ass == JSONObject.NULL) {
            rVar.ass = "";
        }
        rVar.ast = jSONObject.optString("jsVersion");
        if (rVar.ast == JSONObject.NULL) {
            rVar.ast = "";
        }
        rVar.asu = jSONObject.optString("jsFileName");
        if (rVar.asu == JSONObject.NULL) {
            rVar.asu = "";
        }
        rVar.asv = jSONObject.optString("jsErrorMsg");
        if (rVar.asv == JSONObject.NULL) {
            rVar.asv = "";
        }
        rVar.asw = jSONObject.optString("jsConfig");
        if (rVar.asw == JSONObject.NULL) {
            rVar.asw = "";
        }
        rVar.asx = jSONObject.optInt("adBizType");
        rVar.asy = jSONObject.optString("customKey");
        if (rVar.asy == JSONObject.NULL) {
            rVar.asy = "";
        }
        rVar.asz = jSONObject.optString("customValue");
        if (rVar.asz == JSONObject.NULL) {
            rVar.asz = "";
        }
        rVar.trace = jSONObject.optString("trace");
        if (rVar.trace == JSONObject.NULL) {
            rVar.trace = "";
        }
        rVar.asA = jSONObject.optInt("filterCode");
        rVar.asB = jSONObject.optInt("sdkVersionCode");
        rVar.sdkVersion = jSONObject.optString("sdkVersion");
        if (rVar.sdkVersion == JSONObject.NULL) {
            rVar.sdkVersion = "";
        }
        rVar.Um = jSONObject.optString("sdkApiVersion");
        if (rVar.Um == JSONObject.NULL) {
            rVar.Um = "";
        }
        rVar.Uo = jSONObject.optInt("sdkType");
        rVar.asC = jSONObject.optLong("appUseDuration");
        rVar.asD = jSONObject.optLong("appStartType");
        rVar.anz = jSONObject.optLong("sequenceNumber");
        rVar.HY = jSONObject.optString("appColdStart");
        if (rVar.HY == JSONObject.NULL) {
            rVar.HY = "";
        }
        rVar.HZ = jSONObject.optString("appStart");
        if (rVar.HZ == JSONObject.NULL) {
            rVar.HZ = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(com.kwad.sdk.core.report.r rVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (rVar.timestamp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "timestamp", rVar.timestamp);
        }
        if (rVar.sessionId != null && !rVar.sessionId.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sessionId", rVar.sessionId);
        }
        if (rVar.Ib != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "seq", rVar.Ib);
        }
        if (rVar.arv != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "listId", rVar.arv);
        }
        if (rVar.arw != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "actionType", rVar.arw);
        }
        if (rVar.US != null && !rVar.US.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, rVar.US);
        }
        if (rVar.llsid != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "llsid", rVar.llsid);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "extra", rVar.arx);
        com.kwad.sdk.utils.t.putValue(jSONObject, "impAdExtra", rVar.ary);
        if (rVar.posId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "posId", rVar.posId);
        }
        if (rVar.contentType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "contentType", rVar.contentType);
        }
        if (rVar.realShowType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "realShowType", rVar.realShowType);
        }
        if (rVar.photoId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoId", rVar.photoId);
        }
        if (rVar.position != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "position", rVar.position);
        }
        if (rVar.arz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverPosition", rVar.arz);
        }
        if (rVar.arA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoDuration", rVar.arA);
        }
        if (rVar.arB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "effectivePlayDuration", rVar.arB);
        }
        if (rVar.Xl != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playDuration", rVar.Xl);
        }
        if (rVar.blockDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockDuration", rVar.blockDuration);
        }
        if (rVar.arC != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "intervalDuration", rVar.arC);
        }
        if (rVar.arD != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "allIntervalDuration", rVar.arD);
        }
        if (rVar.arE != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "flowSdk", rVar.arE);
        }
        if (rVar.arF != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "blockTimes", rVar.arF);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "contentSourceType", rVar.contentSourceType);
        if (rVar.arG != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAggPageSource", rVar.arG);
        }
        if (rVar.entryPageSource != null && !rVar.entryPageSource.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "entryPageSource", rVar.entryPageSource);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "urlPackage", rVar.urlPackage);
        com.kwad.sdk.utils.t.a(jSONObject, "referURLPackage", rVar.arH);
        if (rVar.Qs != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, URLPackage.KEY_AUTHOR_ID, rVar.Qs);
        }
        if (rVar.arI != null && !rVar.arI.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoSize", rVar.arI);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appInstalled", rVar.arJ);
        com.kwad.sdk.utils.t.putValue(jSONObject, "appUninstalled", rVar.arK);
        com.kwad.sdk.utils.t.a(jSONObject, "clientExt", rVar.arL);
        if (rVar.arM != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playerType", rVar.arM);
        }
        if (rVar.arN != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "uiType", rVar.arN);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "isLeftSlipStatus", rVar.arO);
        if (rVar.UT != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "refreshType", rVar.UT);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "photoResponseType", rVar.arP);
        if (rVar.arQ != null && !rVar.arQ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "failUrl", rVar.arQ);
        }
        if (rVar.errorMsg != null && !rVar.errorMsg.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "errorMsg", rVar.errorMsg);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "errorCode", rVar.errorCode);
        if (rVar.creativeId != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "creativeId", rVar.creativeId);
        }
        if (rVar.arT != null && !rVar.arT.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cacheFailedReason", rVar.arT);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appExt", rVar.arU);
        com.kwad.sdk.utils.t.putValue(jSONObject, "appRunningInfoList", rVar.arV);
        if (rVar.downloadDuration != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadDuration", rVar.downloadDuration);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "pageType", rVar.pageType);
        if (rVar.arW != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speedLimitStatus", rVar.arW);
        }
        if (rVar.arX != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "speedLimitThreshold", rVar.arX);
        }
        if (rVar.arY != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "currentRealDownloadSpeed", rVar.arY);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "sdkPlatform", rVar.asa);
        if (rVar.asb) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isKsUnion", rVar.asb);
        }
        if (rVar.asc != null && !rVar.asc.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trackMethodName", rVar.asc);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "viewModeType", rVar.asd);
        if (rVar.clickTime != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clickTime", rVar.clickTime);
        }
        if (rVar.asf != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "frameRenderTime", rVar.asf);
        }
        if (rVar.asg != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playerEnterAction", rVar.asg);
        }
        if (rVar.ash != null && !rVar.ash.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestUrl", rVar.ash);
        }
        if (rVar.asi != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestTotalTime", rVar.asi);
        }
        if (rVar.asj != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestResponseTime", rVar.asj);
        }
        if (rVar.ask != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestParseDataTime", rVar.ask);
        }
        if (rVar.asl != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestCallbackTime", rVar.asl);
        }
        if (rVar.asm != null && !rVar.asm.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "requestFailReason", rVar.asm);
        }
        if (rVar.Pt != null && !rVar.Pt.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageName", rVar.Pt);
        }
        if (rVar.PA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageCreateTime", rVar.PA);
        }
        if (rVar.PB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageResumeTime", rVar.PB);
        }
        if (rVar.asn != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trackUrlType", rVar.asn);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "trackUrlList", rVar.aso);
        if (rVar.Pz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "pageLaunchTime", rVar.Pz);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "appAuthorityInfoList", rVar.asr);
        if (rVar.ass != null && !rVar.ass.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "tkVersion", rVar.ass);
        }
        if (rVar.ast != null && !rVar.ast.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsVersion", rVar.ast);
        }
        if (rVar.asu != null && !rVar.asu.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsFileName", rVar.asu);
        }
        if (rVar.asv != null && !rVar.asv.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsErrorMsg", rVar.asv);
        }
        if (rVar.asw != null && !rVar.asw.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "jsConfig", rVar.asw);
        }
        if (rVar.asx != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adBizType", rVar.asx);
        }
        if (rVar.asy != null && !rVar.asy.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "customKey", rVar.asy);
        }
        if (rVar.asz != null && !rVar.asz.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "customValue", rVar.asz);
        }
        if (rVar.trace != null && !rVar.trace.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "trace", rVar.trace);
        }
        if (rVar.asA != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "filterCode", rVar.asA);
        }
        if (rVar.asB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkVersionCode", rVar.asB);
        }
        if (rVar.sdkVersion != null && !rVar.sdkVersion.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkVersion", rVar.sdkVersion);
        }
        if (rVar.Um != null && !rVar.Um.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkApiVersion", rVar.Um);
        }
        if (rVar.Uo != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sdkType", rVar.Uo);
        }
        if (rVar.asC != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appUseDuration", rVar.asC);
        }
        if (rVar.asD != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStartType", rVar.asD);
        }
        if (rVar.anz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "sequenceNumber", rVar.anz);
        }
        if (rVar.HY != null && !rVar.HY.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appColdStart", rVar.HY);
        }
        if (rVar.HZ != null && !rVar.HZ.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStart", rVar.HZ);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(com.kwad.sdk.core.report.r rVar, JSONObject jSONObject) {
        a2(rVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(com.kwad.sdk.core.report.r rVar, JSONObject jSONObject) {
        return b2(rVar, jSONObject);
    }
}
