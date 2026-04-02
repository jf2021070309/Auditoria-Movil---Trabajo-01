package com.kwad.sdk.core.report;

import com.facebook.internal.ServerProtocol;
import com.kwad.components.offline.api.BuildConfig;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.scene.URLPackage;
import com.kwad.sdk.internal.api.SceneImpl;
import com.kwad.sdk.service.ServiceProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class r extends g {
    public String HY;
    public String HZ;
    public long Ib;
    public long PA;
    public long PB;
    public String Pt;
    public long Pz;
    public long Qs;
    public String US;
    public int UT;
    public String Um;
    public int Uo;
    public long Xl;
    public transient SceneImpl adScene;
    public int adStyle;
    public long anz;
    public long arA;
    public long arB;
    public long arC;
    public long arD;
    public long arE;
    public long arF;
    public int arG;
    public URLPackage arH;
    public String arI;
    public JSONArray arJ;
    public JSONArray arK;
    public a arL;
    public int arM;
    public int arN;
    public int arO;
    public int arP;
    public String arQ;
    public int arR;
    public int arS;
    public String arT;
    public JSONObject arU;
    public JSONArray arV;
    public int arW;
    public int arX;
    public int arY;
    public long arZ;
    public long arv;
    public long arw;
    public JSONObject arx;
    public JSONObject ary;
    public long arz;
    public int asA;
    public int asB;
    public long asC;
    public long asD;
    public String asE;
    public JSONArray asa;
    public boolean asb;
    public String asc;
    public int asd;
    public int ase;
    public long asf;
    public int asg;
    public String ash;
    public long asi;
    public long asj;
    public long ask;
    public long asl;
    public String asm;
    public int asn;
    public JSONArray aso;
    public long asp;
    public long asq;
    public JSONArray asr;
    public String ass;
    public String ast;
    public String asu;
    public String asv;
    public String asw;
    public int asx;
    public String asy;
    public String asz;
    public long blockDuration;
    public long clickTime;
    public int contentSourceType;
    public int contentType;
    public long creativeId;
    public long downloadDuration;
    public String entryPageSource;
    public int errorCode;
    public String errorMsg;
    public long llsid;
    public transient AdTemplate mAdTemplate;
    public int pageType;
    public long photoId;
    public long posId;
    public long position;
    public int realShowType;
    public String sdkVersion;
    public String sessionId;
    public long timestamp;
    public String trace;
    public URLPackage urlPackage;

    /* loaded from: classes.dex */
    public static final class a extends com.kwad.sdk.core.response.a.a {
        public int asF;
        public int asG;

        public static a Cf() {
            a aVar = new a();
            aVar.asF = b.asF;
            aVar.asG = b.asG;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static int asF;
        public static int asG;
    }

    public r(long j) {
        this.adStyle = -1;
        this.contentType = 0;
        this.realShowType = 0;
        this.arE = -1L;
        this.arG = 0;
        this.arZ = 0L;
        this.asd = 0;
        this.ase = -1;
        this.asx = 0;
        this.asB = BuildConfig.VERSION_CODE;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.Um = ServiceProvider.get(com.kwad.sdk.service.a.e.class) == null ? "" : ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.Uo = 1;
        this.asE = "";
        this.arw = j;
    }

    public r(long j, AdTemplate adTemplate) {
        this.adStyle = -1;
        this.contentType = 0;
        this.realShowType = 0;
        this.arE = -1L;
        this.arG = 0;
        this.arZ = 0L;
        this.asd = 0;
        this.ase = -1;
        this.asx = 0;
        this.asB = BuildConfig.VERSION_CODE;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.Um = ServiceProvider.get(com.kwad.sdk.service.a.e.class) == null ? "" : ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.Uo = 1;
        this.asE = "";
        this.arw = j;
        this.mAdTemplate = adTemplate;
    }

    public r(long j, AdTemplate adTemplate, String str) {
        this.adStyle = -1;
        this.contentType = 0;
        this.realShowType = 0;
        this.arE = -1L;
        this.arG = 0;
        this.arZ = 0L;
        this.asd = 0;
        this.ase = -1;
        this.asx = 0;
        this.asB = BuildConfig.VERSION_CODE;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.Um = ServiceProvider.get(com.kwad.sdk.service.a.e.class) == null ? "" : ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.Uo = 1;
        this.asE = "";
        this.arw = j;
        this.mAdTemplate = adTemplate;
        this.US = str;
    }

    public r(String str) {
        this(str, true);
    }

    public r(String str, boolean z) {
        this.adStyle = -1;
        this.contentType = 0;
        this.realShowType = 0;
        this.arE = -1L;
        this.arG = 0;
        this.arZ = 0L;
        this.asd = 0;
        this.ase = -1;
        this.asx = 0;
        this.asB = BuildConfig.VERSION_CODE;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.Um = ServiceProvider.get(com.kwad.sdk.service.a.e.class) == null ? "" : ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.Uo = 1;
        this.asE = "";
        if (!z) {
            this.asE = str;
            return;
        }
        try {
            parseJson(new JSONObject(str));
        } catch (JSONException e) {
            com.kwad.sdk.core.e.c.printStackTrace(e);
        }
    }

    public r(JSONObject jSONObject) {
        this.adStyle = -1;
        this.contentType = 0;
        this.realShowType = 0;
        this.arE = -1L;
        this.arG = 0;
        this.arZ = 0L;
        this.asd = 0;
        this.ase = -1;
        this.asx = 0;
        this.asB = BuildConfig.VERSION_CODE;
        this.sdkVersion = BuildConfig.VERSION_NAME;
        this.Um = ServiceProvider.get(com.kwad.sdk.service.a.e.class) == null ? "" : ((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getApiVersion();
        this.Uo = 1;
        this.asE = "";
        parseJson(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void aP(com.kwad.sdk.core.response.model.AdTemplate r4) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.core.report.r.aP(com.kwad.sdk.core.response.model.AdTemplate):void");
    }

    public final r Cd() {
        aP(this.mAdTemplate);
        return this;
    }

    public final void Ce() {
        com.kwad.sdk.service.a.h hVar = (com.kwad.sdk.service.a.h) ServiceProvider.get(com.kwad.sdk.service.a.h.class);
        this.arW = hVar.pO() ? 1 : 0;
        this.arX = hVar.pP();
        this.arY = hVar.pQ();
    }

    @Override // com.kwad.sdk.core.report.g, com.kwad.sdk.core.response.a.a
    public void afterParseJson(JSONObject jSONObject) {
        super.afterParseJson(jSONObject);
        if (jSONObject == null) {
            return;
        }
        this.arN = 3;
        this.adStyle = jSONObject.optInt("adStyle", -1);
        this.arS = jSONObject.optInt("num");
        this.arR = jSONObject.optInt(ServerProtocol.DIALOG_PARAM_STATE);
        this.arZ = jSONObject.optLong("timeSpend");
        this.asp = jSONObject.optLong("loadingDuration");
        this.asq = jSONObject.optLong("loadingDurationLimt");
        this.ase = jSONObject.optInt("playerTypeInfo", -1);
        if (jSONObject.has("actionId")) {
            this.actionId = jSONObject.optString("actionId");
        }
    }

    @Override // com.kwad.sdk.core.report.g, com.kwad.sdk.core.response.a.a
    public void afterToJson(JSONObject jSONObject) {
        super.afterToJson(jSONObject);
        com.kwad.sdk.utils.t.putValue(jSONObject, "actionId", this.actionId);
        int i = this.adStyle;
        if (i > 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "adStyle", i);
        }
        int i2 = this.arS;
        if (i2 > 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "num", i2);
        }
        int i3 = this.arR;
        if (i3 != 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, ServerProtocol.DIALOG_PARAM_STATE, i3);
        }
        long j = this.arZ;
        if (j > 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "timeSpend", j);
        }
        long j2 = this.asp;
        if (j2 > 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "loadingDuration", j2);
        }
        long j3 = this.asq;
        if (j3 > 0) {
            com.kwad.sdk.utils.t.putValue(jSONObject, "loadingDurationLimt", j3);
        }
        com.kwad.sdk.utils.t.putValue(jSONObject, "playerTypeInfo", this.ase);
    }
}
