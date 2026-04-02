package com.kwad.sdk.core.b.a;

import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.report.z;
import com.qq.e.comm.pi.IBidding;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class bl implements com.kwad.sdk.core.d<z.b> {
    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static void a2(z.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        bVar.asZ = jSONObject.optInt("photoPlaySecond");
        bVar.ata = jSONObject.optInt("awardReceiveStage");
        bVar.jI = jSONObject.optInt("itemClickType");
        bVar.atb = jSONObject.optInt("itemCloseType");
        bVar.atc = jSONObject.optInt("elementType");
        bVar.atd = jSONObject.optString("adRenderArea");
        if (bVar.atd == JSONObject.NULL) {
            bVar.atd = "";
        }
        bVar.ate = jSONObject.optLong(IBidding.HIGHEST_LOSS_PRICE);
        bVar.atf = jSONObject.optInt("impFailReason");
        bVar.atg = jSONObject.optLong("winEcpm");
        bVar.adnType = jSONObject.optInt("adnType");
        bVar.adnName = jSONObject.optString("adnName");
        if (bVar.adnName == JSONObject.NULL) {
            bVar.adnName = "";
        }
        bVar.ath = jSONObject.optInt("retainCodeType");
        bVar.ati = jSONObject.optInt("photoSizeStyle");
        bVar.US = jSONObject.optString(MessengerShareContentUtility.ATTACHMENT_PAYLOAD);
        if (bVar.US == JSONObject.NULL) {
            bVar.US = "";
        }
        bVar.atj = jSONObject.optInt("deeplinkType");
        bVar.atk = jSONObject.optString("deeplinkAppName");
        if (bVar.atk == JSONObject.NULL) {
            bVar.atk = "";
        }
        bVar.atl = jSONObject.optInt("deeplinkFailedReason");
        bVar.downloadSource = jSONObject.optInt("downloadSource");
        bVar.atm = jSONObject.optInt("isPackageChanged");
        bVar.atn = jSONObject.optString("installedFrom");
        if (bVar.atn == JSONObject.NULL) {
            bVar.atn = "";
        }
        bVar.ato = jSONObject.optString("downloadFailedReason");
        if (bVar.ato == JSONObject.NULL) {
            bVar.ato = "";
        }
        bVar.atp = jSONObject.optInt("isChangedEndcard");
        bVar.arG = jSONObject.optInt("adAggPageSource");
        bVar.atq = jSONObject.optString("serverPackageName");
        if (bVar.atq == JSONObject.NULL) {
            bVar.atq = "";
        }
        bVar.atr = jSONObject.optString("installedPackageName");
        if (bVar.atr == JSONObject.NULL) {
            bVar.atr = "";
        }
        bVar.ats = jSONObject.optInt("closeButtonImpressionTime");
        bVar.att = jSONObject.optInt("closeButtonClickTime");
        bVar.atu = jSONObject.optLong("landingPageLoadedDuration");
        bVar.Ko = jSONObject.optLong("leaveTime");
        bVar.atv = jSONObject.optLong("adItemClickBackDuration");
        bVar.atw = jSONObject.optInt("appStorePageType");
        bVar.atx = jSONObject.optInt("installStatus");
        bVar.aty = jSONObject.optInt("downloadStatus");
        bVar.atz = jSONObject.optInt("downloadCardType");
        bVar.atA = new z.a();
        bVar.atA.parseJson(jSONObject.optJSONObject("clientExtData"));
        bVar.atB = jSONObject.optInt("landingPageType");
        bVar.vC = jSONObject.optLong("playedDuration");
        bVar.atC = jSONObject.optInt("playedRate");
        bVar.atD = jSONObject.optInt("adOrder");
        bVar.atE = jSONObject.optInt("adInterstitialSource");
        bVar.jL = jSONObject.optDouble("splashShakeAcceleration");
        bVar.atF = jSONObject.optString("splashInteractionRotateAngle");
        if (bVar.atF == JSONObject.NULL) {
            bVar.atF = "";
        }
        bVar.atG = jSONObject.optInt("downloadInstallType");
        bVar.atH = jSONObject.optInt("businessSceneType");
        bVar.adxResult = jSONObject.optInt("adxResult");
        bVar.atI = jSONObject.optInt("fingerSwipeType");
        bVar.atJ = jSONObject.optInt("fingerSwipeDistance");
        bVar.atK = jSONObject.optInt("triggerType");
        bVar.atL = jSONObject.optInt("cardCloseType");
        bVar.atM = jSONObject.optString("clientPkFailAdInfo");
        if (bVar.atM == JSONObject.NULL) {
            bVar.atM = "";
        }
    }

    /* renamed from: b  reason: avoid collision after fix types in other method */
    private static JSONObject b2(z.b bVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (bVar.asZ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoPlaySecond", bVar.asZ);
        }
        if (bVar.ata != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "awardReceiveStage", bVar.ata);
        }
        if (bVar.jI != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemClickType", bVar.jI);
        }
        if (bVar.atb != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "itemCloseType", bVar.atb);
        }
        if (bVar.atc != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "elementType", bVar.atc);
        }
        if (bVar.atd != null && !bVar.atd.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adRenderArea", bVar.atd);
        }
        if (bVar.ate != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, IBidding.HIGHEST_LOSS_PRICE, bVar.ate);
        }
        if (bVar.atf != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "impFailReason", bVar.atf);
        }
        if (bVar.atg != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "winEcpm", bVar.atg);
        }
        if (bVar.adnType != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adnType", bVar.adnType);
        }
        if (bVar.adnName != null && !bVar.adnName.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adnName", bVar.adnName);
        }
        if (bVar.ath != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "retainCodeType", bVar.ath);
        }
        if (bVar.ati != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "photoSizeStyle", bVar.ati);
        }
        if (bVar.US != null && !bVar.US.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, MessengerShareContentUtility.ATTACHMENT_PAYLOAD, bVar.US);
        }
        if (bVar.atj != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkType", bVar.atj);
        }
        if (bVar.atk != null && !bVar.atk.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkAppName", bVar.atk);
        }
        if (bVar.atl != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "deeplinkFailedReason", bVar.atl);
        }
        if (bVar.downloadSource != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadSource", bVar.downloadSource);
        }
        if (bVar.atm != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isPackageChanged", bVar.atm);
        }
        if (bVar.atn != null && !bVar.atn.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installedFrom", bVar.atn);
        }
        if (bVar.ato != null && !bVar.ato.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadFailedReason", bVar.ato);
        }
        if (bVar.atp != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "isChangedEndcard", bVar.atp);
        }
        if (bVar.arG != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adAggPageSource", bVar.arG);
        }
        if (bVar.atq != null && !bVar.atq.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "serverPackageName", bVar.atq);
        }
        if (bVar.atr != null && !bVar.atr.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installedPackageName", bVar.atr);
        }
        if (bVar.ats != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeButtonImpressionTime", bVar.ats);
        }
        if (bVar.att != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "closeButtonClickTime", bVar.att);
        }
        if (bVar.atu != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "landingPageLoadedDuration", bVar.atu);
        }
        if (bVar.Ko != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "leaveTime", bVar.Ko);
        }
        if (bVar.atv != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adItemClickBackDuration", bVar.atv);
        }
        if (bVar.atw != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "appStorePageType", bVar.atw);
        }
        if (bVar.atx != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "installStatus", bVar.atx);
        }
        if (bVar.aty != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadStatus", bVar.aty);
        }
        if (bVar.atz != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadCardType", bVar.atz);
        }
        com.kwad.sdk.utils.t.a(jSONObject, "clientExtData", bVar.atA);
        if (bVar.atB != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "landingPageType", bVar.atB);
        }
        if (bVar.vC != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playedDuration", bVar.vC);
        }
        if (bVar.atC != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "playedRate", bVar.atC);
        }
        if (bVar.atD != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adOrder", bVar.atD);
        }
        if (bVar.atE != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adInterstitialSource", bVar.atE);
        }
        if (bVar.jL != PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "splashShakeAcceleration", bVar.jL);
        }
        if (bVar.atF != null && !bVar.atF.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "splashInteractionRotateAngle", bVar.atF);
        }
        if (bVar.atG != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "downloadInstallType", bVar.atG);
        }
        if (bVar.atH != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "businessSceneType", bVar.atH);
        }
        if (bVar.adxResult != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adxResult", bVar.adxResult);
        }
        if (bVar.atI != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fingerSwipeType", bVar.atI);
        }
        if (bVar.atJ != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "fingerSwipeDistance", bVar.atJ);
        }
        if (bVar.atK != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "triggerType", bVar.atK);
        }
        if (bVar.atL != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "cardCloseType", bVar.atL);
        }
        if (bVar.atM != null && !bVar.atM.equals("")) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "clientPkFailAdInfo", bVar.atM);
        }
        return jSONObject;
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ void a(z.b bVar, JSONObject jSONObject) {
        a2(bVar, jSONObject);
    }

    @Override // com.kwad.sdk.core.d
    public final /* bridge */ /* synthetic */ JSONObject b(z.b bVar, JSONObject jSONObject) {
        return b2(bVar, jSONObject);
    }
}
