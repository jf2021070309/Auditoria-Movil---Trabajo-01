package com.kwad.sdk.core.report;

import android.text.TextUtils;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ai;
import java.io.Serializable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AdTrackLog extends com.kwad.sdk.core.response.a.a implements Serializable {
    public static final int NEGATIVE_RESULT = 2;
    public static final int POSITIVE_RESULT = 1;
    private static int sLiveSupportMode = 2;
    private static final long serialVersionUID = 6629369763953107007L;
    public int adLiveComponentReady;
    public int adLiveSwitch;
    public int adTkLiveSwitch;
    public String apiSdkVersion;
    public int isPlugin;
    public int preLandingPageShowType;
    public int preLandingPageSwitch;
    public int rewardAdvanceSwitch;
    public int rewardDetailCallPositionY;
    public int rewardDetailStatusBarHeight;
    public String sceneId;
    public int screenOrientation;
    public int serverCheckSwitch;
    public String templateId;

    private AdTrackLog() {
    }

    public AdTrackLog(String str, String str2) {
        this.templateId = str;
        this.sceneId = str2;
    }

    public static AdTrackLog createFromJson(String str) {
        try {
            AdTrackLog adTrackLog = new AdTrackLog();
            adTrackLog.parseJson(new JSONObject(str));
            return adTrackLog;
        } catch (Exception e) {
            return null;
        }
    }

    private int toReportInt(boolean z) {
        return z ? 1 : 2;
    }

    public void bindABParams(AdTemplate adTemplate) {
        if (adTemplate == null) {
            return;
        }
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        this.adLiveComponentReady = toReportInt(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).oi());
        this.adLiveSwitch = toReportInt(com.kwad.sdk.core.response.b.a.cw(ck));
        this.adTkLiveSwitch = toReportInt(TextUtils.isEmpty(com.kwad.sdk.core.response.b.b.dE(ck)));
        if (sLiveSupportMode == 2 && ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).oi()) {
            sLiveSupportMode = 1;
        }
        this.adLiveComponentReady = sLiveSupportMode;
        this.serverCheckSwitch = toReportInt(com.kwad.sdk.core.response.b.a.cI(ck));
        this.rewardAdvanceSwitch = toReportInt(com.kwad.sdk.core.response.b.a.cJ(ck));
        this.preLandingPageSwitch = toReportInt(com.kwad.sdk.core.response.b.b.dC(ck));
        this.preLandingPageShowType = com.kwad.sdk.core.response.b.b.dD(ck);
        this.apiSdkVersion = ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.isPlugin = toReportInt(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getIsExternal());
        this.screenOrientation = toReportInt(ai.IL());
    }
}
