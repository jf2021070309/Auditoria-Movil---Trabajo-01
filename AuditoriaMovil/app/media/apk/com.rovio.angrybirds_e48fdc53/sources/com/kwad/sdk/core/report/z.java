package com.kwad.sdk.core.report;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ab;
import com.kwad.sdk.utils.ac;
import com.kwad.sdk.utils.bc;
import com.qq.e.comm.pi.IBidding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z extends com.kwad.sdk.core.network.b {
    int asN;
    private final b asO;
    private final JSONObject asP;
    private final AdTemplate mAdTemplate;

    /* loaded from: classes.dex */
    public static class a extends com.kwad.sdk.core.response.a.a {
        public String asR;
        public int asS;
        public int asT;
        public int asU;
        public JSONObject asV;
        public int asW;
        public int asX;
        public AdTrackLog asY;
        public String templateId;
        public int asQ = -1;
        public long duration = -1;
        public int showLiveStatus = -1;
        public int showLiveStyle = -1;

        @Override // com.kwad.sdk.core.response.a.a
        public void afterToJson(JSONObject jSONObject) {
            super.afterToJson(jSONObject);
            int i = this.asQ;
            if (i != -1) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "shield_reason", i);
            }
            long j = this.duration;
            if (j != -1) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "duration", j);
            }
            int i2 = this.showLiveStatus;
            if (i2 != -1) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "show_live_status", i2);
            }
            int i3 = this.showLiveStyle;
            if (i3 != -1) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "show_live_style", i3);
            }
            AdTrackLog adTrackLog = this.asY;
            if (adTrackLog != null) {
                com.kwad.sdk.utils.t.putValue(jSONObject, "ad_track_log", adTrackLog.toJson().toString());
            }
            JSONObject jSONObject2 = this.asV;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.asV.get(next));
                    }
                } catch (Throwable th) {
                }
            }
        }

        public final AdTrackLog c(AdTemplate adTemplate, String str, String str2) {
            com.kwad.sdk.service.a.f fVar;
            if (adTemplate == null || (fVar = (com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)) == null || !fVar.xM()) {
                return null;
            }
            AdTrackLog adTrackLog = new AdTrackLog(str, str2);
            this.asY = adTrackLog;
            adTrackLog.bindABParams(adTemplate);
            return this.asY;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.kwad.sdk.core.response.a.a {
        public long Ko;
        public String US;
        public String adnName;
        public int adnType;
        public int arG;
        public int asZ;
        public a atA;
        public int atB;
        public int atC;
        public String atF;
        public int atH;
        public int atI;
        public int atJ;
        public String atM;
        public int ata;
        public int atb;
        public int atc;
        public String atd;
        public int atj;
        public String atk;
        public int atl;
        public int atm;
        public String ato;
        public int atp;
        public String atq;
        public String atr;
        public int ats;
        public int att;
        public long atu;
        public long atv;
        public int atz;
        public int downloadSource;
        public int jI;
        public ac.a jK;
        public double jL;
        public long vC;
        public long ate = -1;
        public int atf = -1;
        public long atg = -1;
        public int ath = -1;
        public int ati = 0;
        public String atn = "";
        public int atw = -1;
        public int atx = -1;
        public int aty = 0;
        public int atD = -1;
        public int atE = -1;
        public int atG = -1;
        public int adxResult = -1;
        public int atK = -1;
        public int atL = 0;

        public final void a(k kVar) {
            if (kVar != null) {
                this.atM = kVar.Cb();
            }
        }

        public final void cu(int i) {
            if (i == 0) {
                this.atI = 1;
            } else if (i == 1) {
                this.atI = 2;
            } else if (i != 2) {
            } else {
                this.atI = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(AdTemplate adTemplate, int i, b bVar, JSONObject jSONObject) {
        this.mAdTemplate = adTemplate;
        this.asN = i;
        this.asO = bVar;
        this.asP = jSONObject;
    }

    private void D(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("clientTimestamp", System.currentTimeMillis());
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
        putBody("extData", jSONObject.toString());
    }

    private void a(String str, b bVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (bVar.atD >= 0) {
            putBody("adOrder", bVar.atD);
        }
        if (bVar.atE >= 0) {
            putBody("adInterstitialSource", bVar.atE);
        }
        if (!TextUtils.isEmpty(bVar.atd)) {
            putBody("adRenderArea", bVar.atd);
        }
        putBody("adxResult", bVar.adxResult);
        if (bVar.atI != 0) {
            putBody("fingerSwipeType", bVar.atI);
        }
        if (bVar.atJ != 0) {
            putBody("fingerSwipeDistance", bVar.atJ);
        }
        if (bVar.atx != -1) {
            putBody("installStatus", bVar.atx);
        }
        if (bVar.atA != null) {
            putBody("clientExtData", bVar.atA.toJson().toString());
        }
        if (bVar.atM != null) {
            putBody("clientPkFailAdInfo", bVar.atM);
        }
        if (bVar.atK != -1) {
            putBody("triggerType", bVar.atK);
        }
        if (bVar.ati != 0) {
            putBody("photoSizeStyle", bVar.ati);
        }
    }

    private void a(String str, AdTemplate adTemplate, b bVar) {
        if (TextUtils.isEmpty(str) || adTemplate == null) {
            return;
        }
        if (adTemplate.mInitVoiceStatus != 0) {
            putBody("initVoiceStatus", adTemplate.mInitVoiceStatus);
        }
        putBody("ecpmType", this.mAdTemplate.mBidEcpm == 0 ? 2 : 1);
        if (bVar == null) {
            return;
        }
        if (bVar.arG != 0) {
            putBody("adAggPageSource", bVar.arG);
        }
        if (TextUtils.isEmpty(bVar.US)) {
            return;
        }
        putBody(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, bVar.US);
    }

    private void b(String str, b bVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (bVar.jI != 0) {
            putBody("itemClickType", bVar.jI);
        }
        if (!TextUtils.isEmpty(bVar.US)) {
            putBody(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, bVar.US);
        }
        if (bVar.arG != 0) {
            putBody("adAggPageSource", bVar.arG);
        }
        if (bVar.atD >= 0) {
            putBody("adOrder", bVar.atD);
        }
        if (bVar.atE >= 0) {
            putBody("adInterstitialSource", bVar.atE);
        }
        if (bVar.atK != -1) {
            putBody("triggerType", bVar.atK);
        }
        if (bVar.atL != 0) {
            putBody("cardCloseType", bVar.atL);
        }
        putBody("adxResult", bVar.adxResult);
        if (bVar.jL > PangleAdapterUtils.CPM_DEFLAUT_VALUE) {
            putBody("splashShakeAcceleration", bVar.jL);
        }
        if (!TextUtils.isEmpty(bVar.atF)) {
            putBody("splashInteractionRotateAngle", bVar.atF);
        }
        if (bVar.atI != 0) {
            putBody("fingerSwipeType", bVar.atI);
        }
        if (bVar.atJ != 0) {
            putBody("fingerSwipeDistance", bVar.atJ);
        }
        if (bVar.vC > 0) {
            putBody("playedDuration", bVar.vC);
        }
        if (bVar.atC > 0) {
            putBody("playedRate", bVar.atC);
        }
        if (bVar.atM != null) {
            putBody("clientPkFailAdInfo", bVar.atM);
        }
        if (bVar.ath != -1) {
            putBody("retainCodeType", bVar.ath);
        }
        if (bVar.atA != null) {
            putBody("clientExtData", bVar.atA.toJson().toString());
        }
        if (bVar.ati != 0) {
            putBody("photoSizeStyle", bVar.ati);
        }
    }

    private void c(String str, b bVar) {
        if (bVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (bVar.atb != 0) {
            putBody("itemCloseType", bVar.atb);
        }
        if (bVar.asZ > 0) {
            putBody("photoPlaySecond", bVar.asZ);
        }
        if (bVar.ata != 0) {
            putBody("awardReceiveStage", bVar.ata);
        }
        if (bVar.atc != 0) {
            putBody("elementType", bVar.atc);
        }
        if (!TextUtils.isEmpty(bVar.US)) {
            putBody(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, bVar.US);
        }
        if (bVar.atA != null) {
            putBody("clientExtData", bVar.atA.toJson().toString());
        }
        if (bVar.atj > 0) {
            putBody("deeplinkType", bVar.atj);
        }
        if (!TextUtils.isEmpty(bVar.atk)) {
            putBody("deeplinkAppName", bVar.atk);
        }
        if (bVar.atl != 0) {
            putBody("deeplinkFailedReason", bVar.atl);
        }
        if (bVar.downloadSource > 0) {
            putBody("downloadSource", bVar.downloadSource);
        }
        if (bVar.atL != 0) {
            putBody("cardCloseType", bVar.atL);
        }
        if (bVar.atm > 0) {
            putBody("isPackageChanged", bVar.atm);
        }
        putBody("installedFrom", bVar.atn);
        putBody("isChangedEndcard", bVar.atp);
        if (bVar.arG != 0) {
            putBody("adAggPageSource", bVar.arG);
        }
        if (bVar.ato != null) {
            putBody("downloadFailedReason", bVar.ato);
        }
        if (!bc.isNullString(bVar.atr)) {
            putBody("installedPackageName", bVar.atr);
        }
        if (!bc.isNullString(bVar.atq)) {
            putBody("serverPackageName", bVar.atq);
        }
        if (bVar.att > 0) {
            putBody("closeButtonClickTime", bVar.att);
        }
        if (bVar.ats > 0) {
            putBody("closeButtonImpressionTime", bVar.ats);
        }
        if (bVar.aty >= 0) {
            putBody("downloadStatus", bVar.aty);
        }
        if (bVar.atu > 0) {
            putBody("landingPageLoadedDuration", bVar.atu);
        }
        if (bVar.Ko > 0) {
            putBody("leaveTime", bVar.Ko);
        }
        if (bVar.atv > 0) {
            putBody("adItemClickBackDuration", bVar.atv);
        }
        if (bVar.ath != -1) {
            putBody("retainCodeType", bVar.ath);
        }
        if (bVar.ate > -1) {
            putBody(IBidding.HIGHEST_LOSS_PRICE, bVar.ate);
        }
        if (bVar.atf >= 0) {
            putBody("impFailReason", bVar.atf);
        }
        if (bVar.atg > -1) {
            putBody("winEcpm", bVar.atg);
        }
        if (bVar.adnType > 0) {
            putBody("adnType", bVar.adnType);
        }
        if (!TextUtils.isEmpty(bVar.adnName)) {
            putBody("adnName", bVar.adnName);
        }
        putBody("downloadCardType", bVar.atz);
        putBody("landingPageType", bVar.atB);
        if (bVar.atE >= 0) {
            putBody("adInterstitialSource", bVar.atE);
        }
        if (bVar.atG > 0) {
            putBody("downloadInstallType", bVar.atG);
        }
        if (bVar.atI != 0) {
            putBody("fingerSwipeType", bVar.atI);
        }
        if (bVar.atJ != 0) {
            putBody("fingerSwipeDistance", bVar.atJ);
        }
        if (bVar.atH > 0) {
            putBody("businessSceneType", bVar.atH);
        }
        if (bVar.vC > 0) {
            putBody("playedDuration", bVar.vC);
        }
        if (bVar.atC > 0) {
            putBody("playedRate", bVar.atC);
        }
        if (bVar.atw != -1) {
            putBody("appStorePageType", bVar.atw);
        }
        if (bVar.atK != -1) {
            putBody("triggerType", bVar.atK);
        }
        if (bVar.ati != 0) {
            putBody("photoSizeStyle", bVar.ati);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> Co() {
        ac.a aVar;
        AdInfo.AdTrackInfo adTrackInfo;
        b bVar;
        ArrayList arrayList = new ArrayList();
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        if (!ck.adTrackInfoList.isEmpty()) {
            Iterator<AdInfo.AdTrackInfo> it = ck.adTrackInfoList.iterator();
            while (true) {
                aVar = null;
                if (!it.hasNext()) {
                    adTrackInfo = null;
                    break;
                }
                adTrackInfo = it.next();
                if (adTrackInfo.type == this.asN && adTrackInfo.urls != null) {
                    break;
                }
            }
            if (adTrackInfo != null) {
                if (adTrackInfo.type == 2 && (bVar = this.asO) != null) {
                    aVar = bVar.jK;
                }
                for (String str : adTrackInfo.urls) {
                    arrayList.add(ab.a(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext(), str, aVar, com.kwad.sdk.core.response.b.a.at(ck)));
                }
            }
        }
        return arrayList;
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseBody() {
    }

    @Override // com.kwad.sdk.core.network.b
    public final void buildBaseHeader() {
    }

    public final int getActionType() {
        return this.asN;
    }

    public final AdTemplate getAdTemplate() {
        return this.mAdTemplate;
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final JSONObject getBody() {
        return this.mBodyParams;
    }

    @Override // com.kwad.sdk.core.network.b, com.kwad.sdk.core.network.g
    public final String getUrl() {
        String replaceFirst;
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        int i = this.asN;
        if (i == 1) {
            replaceFirst = ck.adBaseInfo.showUrl.replaceFirst("__PR__", (this.mAdTemplate.mBidEcpm == 0 && ((com.kwad.sdk.service.a.f) ServiceProvider.get(com.kwad.sdk.service.a.f.class)).xB()) ? String.valueOf(com.kwad.sdk.core.response.b.a.aJ(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate))) : String.valueOf(this.mAdTemplate.mBidEcpm)).replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
            a(replaceFirst, this.asO);
        } else {
            AdInfo.AdBaseInfo adBaseInfo = ck.adBaseInfo;
            if (i != 2) {
                replaceFirst = adBaseInfo.convUrl.replaceFirst("__ACTION__", String.valueOf(this.asN)).replaceFirst("__PR__", String.valueOf(this.mAdTemplate.mBidEcpm)).replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
                c(replaceFirst, this.asO);
                D(this.asP);
                return replaceFirst;
            }
            String str = adBaseInfo.clickUrl;
            if (this.asO != null) {
                ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext();
                str = ac.a(str, this.asO.jK);
            }
            replaceFirst = ac.aj(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext(), str).replaceFirst("__PR__", String.valueOf(this.mAdTemplate.mBidEcpm)).replaceFirst("__TYPE__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerType)).replaceFirst("__BEHAVIOR__", String.valueOf(this.mAdTemplate.mVideoPlayerStatus.mVideoPlayerBehavior));
            b(replaceFirst, this.asO);
        }
        a(replaceFirst, this.mAdTemplate, this.asO);
        D(this.asP);
        return replaceFirst;
    }
}
