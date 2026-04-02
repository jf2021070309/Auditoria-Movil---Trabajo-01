package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.google.android.gms.nearby.messages.Strategy;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.model.l;
import com.ironsource.mediationsdk.model.p;
import com.ironsource.mediationsdk.model.q;
import com.vungle.warren.model.ReportDBAdapter;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class k {
    public com.ironsource.mediationsdk.model.n a;
    public com.ironsource.mediationsdk.model.o b;
    private String bt;
    private String bu;
    private Context bv;
    public com.ironsource.mediationsdk.model.h c;
    public JSONObject d;
    private final String e = "error";
    private final int f = 3;
    private final int g = 2;
    private final int h = 60;
    private final int i = 10000;
    private final int j = 5000;
    private final int k = Strategy.TTL_SECONDS_DEFAULT;
    private final int l = 3;
    private final int m = 3;
    private final int n = 3;
    private final int o = 2;
    private final int p = 15;
    private final long q = WorkRequest.MIN_BACKOFF_MILLIS;
    private final int r = 0;
    private final boolean s = false;
    private final int t = 30000;
    private final int u = -1;
    private final int v = 5000;
    private final int w = 1;
    private final String x = "providerOrder";
    private final String y = "providerSettings";
    private final String z = "configurations";
    private final String A = IronSourceConstants.EVENTS_GENERIC_PARAMS;
    private final String B = "adUnits";
    private final String C = "providerLoadName";
    private final String D = "application";
    private final String E = "rewardedVideo";
    private final String F = IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE;
    private final String G = "offerwall";
    private final String H = "banner";
    private final String I = "integration";
    private final String J = "loggers";
    private final String K = "segment";
    private final String L = "events";
    private final String M = "crashReporter";
    private final String N = "token";
    private final String O = "external";
    private final String P = "mediationTypes";
    private final String Q = "providerDefaultInstance";
    private final String R = "settings";
    private final String S = "maxNumOfAdaptersToLoadOnStart";
    private final String T = "advancedLoading";
    private final String U = "adapterTimeOutInSeconds";
    private final String V = "atim";
    private final String W = "bannerInterval";
    private final String X = "loadRVInterval";
    private final String Y = "expiredDurationInMinutes";
    private final String Z = "server";
    private final String aa = "publisher";
    private final String ab = "console";
    private final String ac = "sendUltraEvents";
    private final String ad = "sendEventsToggle";
    private final String ae = "eventsCompression";
    private final String af = "serverEventsURL";
    private final String ag = "serverEventsType";
    private final String ah = "backupThreshold";
    private final String ai = "maxNumberOfEvents";
    private final String aj = "maxEventsPerBatch";
    private final String ak = "optOut";
    private final String al = "optIn";
    private final String am = "triggerEvents";
    private final String an = "nonConnectivityEvents";
    private final String ao = "pixel";
    private final String ap = "pixelEventsUrl";
    private final String aq = "pixelEventsEnabled";
    private final String ar = "placements";
    private final String as = ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID;
    private final String at = "placementName";
    private final String au = "delivery";
    private final String av = "isDefault";
    private final String aw = "capping";
    private final String ax = "pacing";
    private final String ay = "enabled";
    private final String az = "maxImpressions";
    private final String aA = "numOfSeconds";
    private final String aB = "unit";
    private final String aC = "virtualItemName";
    private final String aD = "virtualItemCount";
    private final String aE = "backFill";
    private final String aF = "premium";
    private final String aG = "uuidEnabled";
    private final String aH = "abt";
    private final String aI = "delayLoadFailure";
    private final String aJ = "keysToInclude";
    private final String aK = "reporterURL";
    private final String aL = "reporterKeyword";
    private final String aM = "includeANR";
    private final String aN = "timeout";
    private final String aO = "setIgnoreDebugger";
    private final String aP = "adSourceName";
    private final String aQ = "spId";
    private final String aR = "mpis";
    private final String aS = "auction";
    private final String aT = "auctionData";
    private final String aU = "auctioneerURL";
    private final String aV = IronSourceConstants.EVENTS_PROGRAMMATIC;
    private final String aW = "objectPerWaterfall";
    private final String aX = "minTimeBeforeFirstAuction";
    private final String aY = "timeToWaitBeforeAuction";
    private final String aZ = "timeToWaitBeforeLoad";
    private final String ba = "auctionRetryInterval";
    private final String bb = "isAuctionOnShowStart";
    private final String bc = "isLoadWhileShow";
    private final String bd = IronSourceConstants.AUCTION_TRIALS;
    private final String be = "auctionTimeout";
    private final String bf = "auctionSavedHistory";
    private final String bg = "disableLoadWhileShowSupportFor";
    private final String bh = "timeToDeleteOldWaterfallAfterAuction";
    private final String bi = "compressAuctionRequest";
    private final String bj = "compressAuctionResponse";
    private final String bk = "encryptionVersion";
    private final String bl = "shouldSendBannerBURLFromImpression";
    private final String bm = "optInKeys";
    private final String bn = "tokenGenericParams";
    private final String bo = "oneToken";
    private final String bp = "compressToken";
    private final String bq = "isExternalArmEventsEnabled";
    private final String br = "externalArmEventsUrl";
    private final String bs = "compressExternalToken";

    public k(Context context, String str, String str2, String str3) {
        this.bv = context;
        try {
            this.d = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            g();
            h();
            f();
            this.bt = TextUtils.isEmpty(str) ? "" : str;
            this.bu = TextUtils.isEmpty(str2) ? "" : str2;
        } catch (JSONException e) {
            e.printStackTrace();
            d();
        }
    }

    public k(k kVar) {
        try {
            this.bv = kVar.bv;
            this.d = new JSONObject(kVar.d.toString());
            this.bt = kVar.bt;
            this.bu = kVar.bu;
            this.a = kVar.a;
            this.b = kVar.b;
            this.c = kVar.c;
        } catch (Exception unused) {
            d();
        }
    }

    private static int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    private static com.ironsource.mediationsdk.model.l a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.model.m mVar = null;
        if (jSONObject == null) {
            return null;
        }
        l.a aVar = new l.a();
        boolean z = true;
        aVar.a = jSONObject.optBoolean("delivery", true);
        JSONObject optJSONObject = jSONObject.optJSONObject("capping");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("unit");
            if (!TextUtils.isEmpty(optString)) {
                if (com.ironsource.mediationsdk.model.m.PER_DAY.toString().equals(optString)) {
                    mVar = com.ironsource.mediationsdk.model.m.PER_DAY;
                } else if (com.ironsource.mediationsdk.model.m.PER_HOUR.toString().equals(optString)) {
                    mVar = com.ironsource.mediationsdk.model.m.PER_HOUR;
                }
            }
            int optInt = optJSONObject.optInt("maxImpressions", 0);
            aVar.a(optJSONObject.optBoolean("enabled", false) && optInt > 0, mVar, optInt);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("pacing");
        if (optJSONObject2 != null) {
            int optInt2 = optJSONObject2.optInt("numOfSeconds", 0);
            if (!optJSONObject2.optBoolean("enabled", false) || optInt2 <= 0) {
                z = false;
            }
            aVar.a(z, optInt2);
        }
        return aVar.a();
    }

    private static int[] a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int[] iArr = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr[i] = optJSONArray.optInt(i);
            }
            return iArr;
        }
        return null;
    }

    private static JSONObject b(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private void d() {
        this.d = new JSONObject();
        this.bt = "";
        this.bu = "";
        this.a = new com.ironsource.mediationsdk.model.n();
        this.b = com.ironsource.mediationsdk.model.o.a();
        this.c = new com.ironsource.mediationsdk.model.h();
    }

    private boolean e() {
        JSONArray names = b(this.d, "providerOrder").names();
        if (names == null) {
            return true;
        }
        JSONObject b = b(b(this.d, "configurations"), "adUnits");
        for (int i = 0; i < names.length(); i++) {
            JSONArray optJSONArray = b(b, names.optString(i)).optJSONArray("placements");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return false;
            }
        }
        return true;
    }

    private void f() {
        try {
            JSONObject b = b(this.d, "providerOrder");
            JSONArray optJSONArray = b.optJSONArray("rewardedVideo");
            JSONArray optJSONArray2 = b.optJSONArray(IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            JSONArray optJSONArray3 = b.optJSONArray("banner");
            this.a = new com.ironsource.mediationsdk.model.n();
            if (optJSONArray != null && this.c != null && this.c.a != null) {
                String str = this.c.a.f;
                String str2 = this.c.a.g;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (optString.equals(str)) {
                        this.a.b = str;
                    } else {
                        if (optString.equals(str2)) {
                            this.a.c = str2;
                        }
                        com.ironsource.mediationsdk.model.n nVar = this.a;
                        if (!TextUtils.isEmpty(optString)) {
                            nVar.a.add(optString);
                        }
                        NetworkSettings a = com.ironsource.mediationsdk.model.o.a().a(optString);
                        if (a != null) {
                            a.setRewardedVideoPriority(i);
                        }
                    }
                }
            }
            if (optJSONArray2 != null && this.c != null && this.c.b != null) {
                String str3 = this.c.b.g;
                String str4 = this.c.b.h;
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    String optString2 = optJSONArray2.optString(i2);
                    if (optString2.equals(str3)) {
                        this.a.f = str3;
                    } else {
                        if (optString2.equals(str4)) {
                            this.a.g = str4;
                        }
                        com.ironsource.mediationsdk.model.n nVar2 = this.a;
                        if (!TextUtils.isEmpty(optString2)) {
                            nVar2.d.add(optString2);
                        }
                        NetworkSettings a2 = com.ironsource.mediationsdk.model.o.a().a(optString2);
                        if (a2 != null) {
                            a2.setInterstitialPriority(i2);
                        }
                    }
                }
            }
            if (optJSONArray3 != null) {
                for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                    String optString3 = optJSONArray3.optString(i3);
                    com.ironsource.mediationsdk.model.n nVar3 = this.a;
                    if (!TextUtils.isEmpty(optString3)) {
                        nVar3.e.add(optString3);
                    }
                    NetworkSettings a3 = com.ironsource.mediationsdk.model.o.a().a(optString3);
                    if (a3 != null) {
                        a3.setBannerPriority(i3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:3:0x0004, B:4:0x0016, B:6:0x001c, B:8:0x0029, B:10:0x007d, B:11:0x00af, B:13:0x00bd, B:15:0x00cd, B:21:0x00e2, B:23:0x0148, B:22:0x0132, B:26:0x0156), top: B:31:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0132 A[Catch: Exception -> 0x015c, TryCatch #0 {Exception -> 0x015c, blocks: (B:3:0x0004, B:4:0x0016, B:6:0x001c, B:8:0x0029, B:10:0x007d, B:11:0x00af, B:13:0x00bd, B:15:0x00cd, B:21:0x00e2, B:23:0x0148, B:22:0x0132, B:26:0x0156), top: B:31:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.k.g():void");
    }

    private void h() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String str2;
        int i;
        boolean z;
        String str3;
        String str4;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        String str5;
        String str6;
        String str7;
        String str8;
        b bVar;
        k kVar;
        p pVar;
        Placement placement;
        String str9;
        String str10;
        String str11;
        String str12;
        JSONObject jSONObject3;
        com.ironsource.mediationsdk.model.i iVar;
        String str13;
        String str14;
        JSONObject jSONObject4;
        String str15;
        String str16;
        JSONObject jSONObject5;
        com.ironsource.mediationsdk.model.f fVar;
        String str17;
        String str18;
        com.ironsource.mediationsdk.model.j jVar;
        boolean z2;
        q qVar;
        JSONObject b;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        com.ironsource.mediationsdk.model.k kVar2;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        int[] iArr12;
        JSONObject jSONObject6;
        b bVar2;
        JSONObject jSONObject7;
        JSONArray jSONArray;
        String str19;
        com.ironsource.mediationsdk.model.g gVar;
        int i2;
        boolean z3;
        int[] iArr13;
        int[] iArr14;
        int[] iArr15;
        int[] iArr16;
        JSONObject jSONObject8;
        b bVar3;
        JSONArray jSONArray2;
        JSONObject jSONObject9;
        String str20;
        InterstitialPlacement interstitialPlacement;
        try {
            JSONObject b2 = b(this.d, "configurations");
            JSONObject b3 = b(b2, "adUnits");
            JSONObject b4 = b(b2, "application");
            JSONObject b5 = b(b3, "rewardedVideo");
            JSONObject b6 = b(b3, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
            JSONObject b7 = b(b3, "offerwall");
            JSONObject b8 = b(b3, "banner");
            JSONObject b9 = b(b4, "events");
            JSONObject b10 = b(b4, "loggers");
            JSONObject b11 = b(b4, "token");
            JSONObject b12 = b(b4, "segment");
            JSONObject b13 = b(b4, "auction");
            JSONObject b14 = b(b4, "crashReporter");
            JSONObject b15 = b(b4, "settings");
            JSONObject b16 = b(b4, "external");
            JSONObject b17 = b(b9, "pixel");
            if (b4 != null) {
                jSONObject = b12;
                jSONObject2 = b14;
                IronSourceUtils.saveBooleanToSharedPrefs(this.bv, "uuidEnabled", b4.optBoolean("uuidEnabled", true));
            } else {
                jSONObject = b12;
                jSONObject2 = b14;
            }
            if (b9 != null) {
                String optString = b9.optString("abt");
                if (!TextUtils.isEmpty(optString)) {
                    com.ironsource.mediationsdk.a.d.e().p = optString;
                    com.ironsource.mediationsdk.a.h.e().p = optString;
                }
            }
            JSONObject jSONObject10 = b13;
            String str21 = "triggerEvents";
            String str22 = "";
            String str23 = "optIn";
            if (b5 != null) {
                try {
                    JSONArray optJSONArray = b5.optJSONArray("placements");
                    str = "placements";
                    JSONObject b18 = b(b5, "events");
                    str2 = "events";
                    JSONArray jSONArray3 = optJSONArray;
                    int a = a(b5, b4, "maxNumOfAdaptersToLoadOnStart", 2);
                    int a2 = a(b5, b4, "advancedLoading", 0);
                    if (a2 > 0) {
                        i = a2;
                        z = true;
                    } else {
                        i = a;
                        z = false;
                    }
                    int a3 = a(b5, b4, "adapterTimeOutInSeconds", 60);
                    int a4 = a(b5, b4, "loadRVInterval", Strategy.TTL_SECONDS_DEFAULT);
                    int a5 = a(b5, b4, "expiredDurationInMinutes", -1);
                    int a6 = a(b5, b4, "delayLoadFailure", 3);
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(b18, b9);
                    boolean optBoolean = mergeJsons.optBoolean("sendUltraEvents", false);
                    boolean optBoolean2 = mergeJsons.optBoolean("sendEventsToggle", false);
                    boolean optBoolean3 = mergeJsons.optBoolean("eventsCompression", false);
                    String optString2 = mergeJsons.optString("serverEventsURL", "");
                    String optString3 = mergeJsons.optString("serverEventsType", "");
                    int optInt = mergeJsons.optInt("backupThreshold", -1);
                    int optInt2 = mergeJsons.optInt("maxNumberOfEvents", -1);
                    int optInt3 = mergeJsons.optInt("maxEventsPerBatch", 5000);
                    JSONArray optJSONArray2 = mergeJsons.optJSONArray("optOut");
                    if (optJSONArray2 != null) {
                        int[] iArr17 = new int[optJSONArray2.length()];
                        str3 = "optOut";
                        str4 = "maxEventsPerBatch";
                        for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                            iArr17[i3] = optJSONArray2.optInt(i3);
                        }
                        iArr = iArr17;
                    } else {
                        str3 = "optOut";
                        str4 = "maxEventsPerBatch";
                        iArr = null;
                    }
                    JSONArray optJSONArray3 = mergeJsons.optJSONArray(str23);
                    if (optJSONArray3 != null) {
                        int[] iArr18 = new int[optJSONArray3.length()];
                        str23 = str23;
                        for (int i4 = 0; i4 < optJSONArray3.length(); i4++) {
                            iArr18[i4] = optJSONArray3.optInt(i4);
                        }
                        iArr2 = iArr18;
                    } else {
                        str23 = str23;
                        iArr2 = null;
                    }
                    JSONArray optJSONArray4 = mergeJsons.optJSONArray(str21);
                    if (optJSONArray4 != null) {
                        int[] iArr19 = new int[optJSONArray4.length()];
                        str21 = str21;
                        for (int i5 = 0; i5 < optJSONArray4.length(); i5++) {
                            iArr19[i5] = optJSONArray4.optInt(i5);
                        }
                        iArr3 = iArr19;
                    } else {
                        str21 = str21;
                        iArr3 = null;
                    }
                    JSONArray optJSONArray5 = mergeJsons.optJSONArray("nonConnectivityEvents");
                    if (optJSONArray5 != null) {
                        int[] iArr20 = new int[optJSONArray5.length()];
                        for (int i6 = 0; i6 < optJSONArray5.length(); i6++) {
                            iArr20[i6] = optJSONArray5.optInt(i6);
                        }
                        iArr4 = iArr20;
                    } else {
                        iArr4 = null;
                    }
                    com.ironsource.mediationsdk.model.c cVar = new com.ironsource.mediationsdk.model.c(optBoolean, optBoolean2, optBoolean3, optString2, optString3, optInt, optInt2, optInt3, iArr, iArr2, iArr3, iArr4);
                    if (jSONObject10 != null) {
                        JSONObject b19 = b(jSONObject10, "rewardedVideo");
                        String optString4 = jSONObject10.optString("auctionData", "");
                        String optString5 = jSONObject10.optString("auctioneerURL", "");
                        int optInt4 = jSONObject10.optInt(IronSourceConstants.AUCTION_TRIALS, 2);
                        long optLong = jSONObject10.optLong("auctionTimeout", WorkRequest.MIN_BACKOFF_MILLIS);
                        int optInt5 = jSONObject10.optInt("auctionSavedHistory", 15);
                        boolean optBoolean4 = jSONObject10.optBoolean("compressAuctionRequest", false);
                        boolean optBoolean5 = jSONObject10.optBoolean("compressAuctionResponse", false);
                        int optInt6 = jSONObject10.optInt("encryptionVersion", 1);
                        jSONObject10 = jSONObject10;
                        str8 = "maxNumberOfEvents";
                        str7 = "backupThreshold";
                        str5 = "serverEventsType";
                        str6 = "serverEventsURL";
                        b bVar4 = new b(optString4, optString5, optInt4, optInt5, optLong, b19.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), b19.optInt("minTimeBeforeFirstAuction", 2000), b19.optInt("auctionRetryInterval", 30000), b19.optInt("timeToWaitBeforeAuction", 5000), b19.optInt("timeToWaitBeforeLoad", 50), b19.optBoolean("isAuctionOnShowStart", false), b19.optBoolean("isLoadWhileShow", false), b19.optInt("timeToDeleteOldWaterfallAfterAuction", 30000), optBoolean4, optBoolean5, b19.optBoolean("objectPerWaterfall", false), optInt6, false);
                        JSONArray optJSONArray6 = b19.optJSONArray("disableLoadWhileShowSupportFor");
                        if (optJSONArray6 != null) {
                            for (int i7 = 0; i7 < optJSONArray6.length(); i7++) {
                                String optString6 = optJSONArray6.optString(i7);
                                if (!TextUtils.isEmpty(optString6)) {
                                    bVar4.o.add(optString6);
                                }
                            }
                        }
                        bVar = bVar4;
                    } else {
                        str5 = "serverEventsType";
                        str6 = "serverEventsURL";
                        str7 = "backupThreshold";
                        str8 = "maxNumberOfEvents";
                        bVar = new b();
                    }
                    p pVar2 = new p(i, z, a3, a4, a5, cVar, bVar, a6);
                    if (jSONArray3 != null) {
                        int i8 = 0;
                        while (i8 < jSONArray3.length()) {
                            JSONArray jSONArray4 = jSONArray3;
                            JSONObject optJSONObject = jSONArray4.optJSONObject(i8);
                            if (optJSONObject != null) {
                                int optInt7 = optJSONObject.optInt(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, -1);
                                String optString7 = optJSONObject.optString("placementName", "");
                                boolean optBoolean6 = optJSONObject.optBoolean("isDefault", false);
                                String optString8 = optJSONObject.optString("virtualItemName", "");
                                int optInt8 = optJSONObject.optInt("virtualItemCount", -1);
                                com.ironsource.mediationsdk.model.l a7 = a(optJSONObject);
                                if (optInt7 >= 0 && !TextUtils.isEmpty(optString7) && !TextUtils.isEmpty(optString8) && optInt8 > 0) {
                                    placement = new Placement(optInt7, optString7, optBoolean6, optString8, optInt8, a7);
                                    if (a7 != null) {
                                        try {
                                            c.a(this.bv, placement);
                                        } catch (Exception e) {
                                            e = e;
                                            e.printStackTrace();
                                            return;
                                        }
                                    }
                                    if (placement != null && placement != null) {
                                        pVar2.a.add(placement);
                                        if (pVar2.k != null && placement.getPlacementId() != 0) {
                                        }
                                        pVar2.k = placement;
                                    }
                                    i8++;
                                    jSONArray3 = jSONArray4;
                                }
                            }
                            placement = null;
                            if (placement != null) {
                                pVar2.a.add(placement);
                                if (pVar2.k != null) {
                                }
                                pVar2.k = placement;
                            }
                            i8++;
                            jSONArray3 = jSONArray4;
                        }
                    }
                    kVar = this;
                    String optString9 = b5.optString("backFill");
                    if (!TextUtils.isEmpty(optString9)) {
                        pVar2.f = optString9;
                    }
                    String optString10 = b5.optString("premium");
                    if (!TextUtils.isEmpty(optString10)) {
                        pVar2.g = optString10;
                    }
                    pVar = pVar2;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return;
                }
            } else {
                str3 = "optOut";
                str2 = "events";
                str6 = "serverEventsURL";
                str7 = "backupThreshold";
                str = "placements";
                str4 = "maxEventsPerBatch";
                str8 = "maxNumberOfEvents";
                str5 = "serverEventsType";
                kVar = this;
                pVar = null;
            }
            if (b6 != null) {
                str10 = str;
                JSONArray optJSONArray7 = b6.optJSONArray(str10);
                str11 = str2;
                JSONObject b20 = b(b6, str11);
                int a8 = a(b6, b4, "maxNumOfAdaptersToLoadOnStart", 2);
                int a9 = a(b6, b4, "advancedLoading", 0);
                if (a9 > 0) {
                    i2 = a9;
                    z3 = true;
                } else {
                    i2 = a8;
                    z3 = false;
                }
                int a10 = a(b6, b4, "adapterTimeOutInSeconds", 60);
                int a11 = a(b6, b4, "delayLoadFailure", 3);
                JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(b20, b9);
                boolean optBoolean7 = mergeJsons2.optBoolean("sendEventsToggle", false);
                boolean optBoolean8 = mergeJsons2.optBoolean("eventsCompression", false);
                String str24 = str6;
                String optString11 = mergeJsons2.optString(str24, "");
                String optString12 = mergeJsons2.optString(str5, "");
                String str25 = str7;
                int optInt9 = mergeJsons2.optInt(str25, -1);
                str7 = str25;
                String str26 = str8;
                int optInt10 = mergeJsons2.optInt(str26, -1);
                str8 = str26;
                String str27 = str4;
                int optInt11 = mergeJsons2.optInt(str27, 5000);
                str4 = str27;
                String str28 = str3;
                JSONArray optJSONArray8 = mergeJsons2.optJSONArray(str28);
                if (optJSONArray8 != null) {
                    str3 = str28;
                    int[] iArr21 = new int[optJSONArray8.length()];
                    str6 = str24;
                    str9 = str5;
                    for (int i9 = 0; i9 < optJSONArray8.length(); i9++) {
                        iArr21[i9] = optJSONArray8.optInt(i9);
                    }
                    iArr13 = iArr21;
                } else {
                    str6 = str24;
                    str9 = str5;
                    str3 = str28;
                    iArr13 = null;
                }
                String str29 = str23;
                JSONArray optJSONArray9 = mergeJsons2.optJSONArray(str29);
                if (optJSONArray9 != null) {
                    int[] iArr22 = new int[optJSONArray9.length()];
                    str23 = str29;
                    for (int i10 = 0; i10 < optJSONArray9.length(); i10++) {
                        iArr22[i10] = optJSONArray9.optInt(i10);
                    }
                    iArr14 = iArr22;
                } else {
                    str23 = str29;
                    iArr14 = null;
                }
                String str30 = str21;
                JSONArray optJSONArray10 = mergeJsons2.optJSONArray(str30);
                if (optJSONArray10 != null) {
                    int[] iArr23 = new int[optJSONArray10.length()];
                    str21 = str30;
                    for (int i11 = 0; i11 < optJSONArray10.length(); i11++) {
                        iArr23[i11] = optJSONArray10.optInt(i11);
                    }
                    iArr15 = iArr23;
                } else {
                    str21 = str30;
                    iArr15 = null;
                }
                JSONArray optJSONArray11 = mergeJsons2.optJSONArray("nonConnectivityEvents");
                if (optJSONArray11 != null) {
                    int[] iArr24 = new int[optJSONArray11.length()];
                    for (int i12 = 0; i12 < optJSONArray11.length(); i12++) {
                        iArr24[i12] = optJSONArray11.optInt(i12);
                    }
                    iArr16 = iArr24;
                } else {
                    iArr16 = null;
                }
                com.ironsource.mediationsdk.model.c cVar2 = new com.ironsource.mediationsdk.model.c(false, optBoolean7, optBoolean8, optString11, optString12, optInt9, optInt10, optInt11, iArr13, iArr14, iArr15, iArr16);
                if (jSONObject10 != null) {
                    jSONObject8 = jSONObject10;
                    JSONObject b21 = b(jSONObject8, IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE);
                    bVar3 = new b(jSONObject8.optString("auctionData", ""), jSONObject8.optString("auctioneerURL", ""), jSONObject8.optInt(IronSourceConstants.AUCTION_TRIALS, 2), jSONObject8.optInt("auctionSavedHistory", 15), jSONObject8.optLong("auctionTimeout", WorkRequest.MIN_BACKOFF_MILLIS), b21.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), b21.optInt("minTimeBeforeFirstAuction", 2000), 0L, 0L, 0L, true, true, 0, jSONObject8.optBoolean("compressAuctionRequest", false), jSONObject8.optBoolean("compressAuctionResponse", false), b21.optBoolean("objectPerWaterfall", false), jSONObject8.optInt("encryptionVersion", 1), false);
                } else {
                    jSONObject8 = jSONObject10;
                    bVar3 = new b();
                }
                com.ironsource.mediationsdk.model.i iVar2 = new com.ironsource.mediationsdk.model.i(i2, z3, a10, cVar2, bVar3, a11);
                if (optJSONArray7 != null) {
                    int i13 = 0;
                    while (i13 < optJSONArray7.length()) {
                        JSONObject optJSONObject2 = optJSONArray7.optJSONObject(i13);
                        if (optJSONObject2 != null) {
                            jSONArray2 = optJSONArray7;
                            int optInt12 = optJSONObject2.optInt(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, -1);
                            String optString13 = optJSONObject2.optString("placementName", str22);
                            jSONObject9 = jSONObject8;
                            str20 = str22;
                            boolean optBoolean9 = optJSONObject2.optBoolean("isDefault", false);
                            com.ironsource.mediationsdk.model.l a12 = a(optJSONObject2);
                            if (optInt12 >= 0 && !TextUtils.isEmpty(optString13)) {
                                interstitialPlacement = new InterstitialPlacement(optInt12, optString13, optBoolean9, a12);
                                if (a12 != null) {
                                    c.a(kVar.bv, interstitialPlacement);
                                }
                                if (interstitialPlacement != null && interstitialPlacement != null) {
                                    iVar2.a.add(interstitialPlacement);
                                    if (iVar2.j != null && interstitialPlacement.getPlacementId() != 0) {
                                    }
                                    iVar2.j = interstitialPlacement;
                                }
                                i13++;
                                optJSONArray7 = jSONArray2;
                                jSONObject8 = jSONObject9;
                                str22 = str20;
                            }
                        } else {
                            jSONArray2 = optJSONArray7;
                            jSONObject9 = jSONObject8;
                            str20 = str22;
                        }
                        interstitialPlacement = null;
                        if (interstitialPlacement != null) {
                            iVar2.a.add(interstitialPlacement);
                            if (iVar2.j != null) {
                            }
                            iVar2.j = interstitialPlacement;
                        }
                        i13++;
                        optJSONArray7 = jSONArray2;
                        jSONObject8 = jSONObject9;
                        str22 = str20;
                    }
                }
                jSONObject3 = jSONObject8;
                str12 = str22;
                String optString14 = b6.optString("backFill");
                if (!TextUtils.isEmpty(optString14)) {
                    iVar2.g = optString14;
                }
                String optString15 = b6.optString("premium");
                if (!TextUtils.isEmpty(optString15)) {
                    iVar2.h = optString15;
                }
                iVar = iVar2;
            } else {
                str9 = str5;
                str10 = str;
                str11 = str2;
                str12 = "";
                jSONObject3 = jSONObject10;
                iVar = null;
            }
            if (b8 != null) {
                JSONArray optJSONArray12 = b8.optJSONArray(str10);
                JSONObject b22 = b(b8, str11);
                int a13 = a(b8, b4, "maxNumOfAdaptersToLoadOnStart", 1);
                long optLong2 = b8.has("atim") ? b8.optLong("atim", 0L) : b4.has("atim") ? b4.optLong("atim", 0L) : 0L;
                long j = optLong2 == 0 ? WorkRequest.MIN_BACKOFF_MILLIS : optLong2;
                int a14 = a(b8, b4, "delayLoadFailure", 3);
                int a15 = a(b8, b4, "bannerInterval", 60);
                JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(b22, b9);
                boolean optBoolean10 = mergeJsons3.optBoolean("sendEventsToggle", false);
                boolean optBoolean11 = mergeJsons3.optBoolean("eventsCompression", false);
                str15 = str12;
                str16 = str6;
                String optString16 = mergeJsons3.optString(str16, str15);
                str14 = str9;
                String optString17 = mergeJsons3.optString(str14, str15);
                String str31 = str7;
                int optInt13 = mergeJsons3.optInt(str31, -1);
                String str32 = str8;
                int optInt14 = mergeJsons3.optInt(str32, -1);
                jSONObject5 = b4;
                String str33 = str4;
                int optInt15 = mergeJsons3.optInt(str33, 5000);
                str13 = str10;
                String str34 = str3;
                JSONArray optJSONArray13 = mergeJsons3.optJSONArray(str34);
                if (optJSONArray13 != null) {
                    str3 = str34;
                    int[] iArr25 = new int[optJSONArray13.length()];
                    str4 = str33;
                    str8 = str32;
                    for (int i14 = 0; i14 < optJSONArray13.length(); i14++) {
                        iArr25[i14] = optJSONArray13.optInt(i14);
                    }
                    iArr9 = iArr25;
                } else {
                    str3 = str34;
                    str4 = str33;
                    str8 = str32;
                    iArr9 = null;
                }
                String str35 = str23;
                JSONArray optJSONArray14 = mergeJsons3.optJSONArray(str35);
                if (optJSONArray14 != null) {
                    int[] iArr26 = new int[optJSONArray14.length()];
                    str23 = str35;
                    for (int i15 = 0; i15 < optJSONArray14.length(); i15++) {
                        iArr26[i15] = optJSONArray14.optInt(i15);
                    }
                    iArr10 = iArr26;
                } else {
                    str23 = str35;
                    iArr10 = null;
                }
                String str36 = str21;
                JSONArray optJSONArray15 = mergeJsons3.optJSONArray(str36);
                if (optJSONArray15 != null) {
                    int[] iArr27 = new int[optJSONArray15.length()];
                    str21 = str36;
                    for (int i16 = 0; i16 < optJSONArray15.length(); i16++) {
                        iArr27[i16] = optJSONArray15.optInt(i16);
                    }
                    iArr11 = iArr27;
                } else {
                    str21 = str36;
                    iArr11 = null;
                }
                JSONArray optJSONArray16 = mergeJsons3.optJSONArray("nonConnectivityEvents");
                if (optJSONArray16 != null) {
                    int[] iArr28 = new int[optJSONArray16.length()];
                    for (int i17 = 0; i17 < optJSONArray16.length(); i17++) {
                        iArr28[i17] = optJSONArray16.optInt(i17);
                    }
                    iArr12 = iArr28;
                } else {
                    iArr12 = null;
                }
                com.ironsource.mediationsdk.model.c cVar3 = new com.ironsource.mediationsdk.model.c(false, optBoolean10, optBoolean11, optString16, optString17, optInt13, optInt14, optInt15, iArr9, iArr10, iArr11, iArr12);
                if (jSONObject3 != null) {
                    jSONObject6 = jSONObject3;
                    JSONObject b23 = b(jSONObject6, "banner");
                    bVar2 = b23 != null ? new b(jSONObject6.optString("auctionData", str15), jSONObject6.optString("auctioneerURL", str15), jSONObject6.optInt(IronSourceConstants.AUCTION_TRIALS, 2), jSONObject6.optInt("auctionSavedHistory", 15), jSONObject6.optLong("auctionTimeout", WorkRequest.MIN_BACKOFF_MILLIS), b23.optBoolean(IronSourceConstants.EVENTS_PROGRAMMATIC, false), b23.optInt("minTimeBeforeFirstAuction", 2000), 0L, 0L, 0L, true, true, 0, jSONObject6.optBoolean("compressAuctionRequest", false), jSONObject6.optBoolean("compressAuctionResponse", false), false, jSONObject6.optInt("encryptionVersion", 1), b23.optBoolean("shouldSendBannerBURLFromImpression", true)) : new b();
                } else {
                    jSONObject6 = jSONObject3;
                    bVar2 = new b();
                }
                com.ironsource.mediationsdk.model.f fVar2 = new com.ironsource.mediationsdk.model.f(a13, j, cVar3, a15, bVar2, a14);
                if (optJSONArray12 != null) {
                    int i18 = 0;
                    while (i18 < optJSONArray12.length()) {
                        JSONObject optJSONObject3 = optJSONArray12.optJSONObject(i18);
                        if (optJSONObject3 != null) {
                            jSONArray = optJSONArray12;
                            int optInt16 = optJSONObject3.optInt(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, -1);
                            String optString18 = optJSONObject3.optString("placementName", str15);
                            jSONObject7 = jSONObject6;
                            str19 = str31;
                            boolean optBoolean12 = optJSONObject3.optBoolean("isDefault", false);
                            com.ironsource.mediationsdk.model.l a16 = a(optJSONObject3);
                            if (optInt16 >= 0 && !TextUtils.isEmpty(optString18)) {
                                gVar = new com.ironsource.mediationsdk.model.g(optInt16, optString18, optBoolean12, a16);
                                if (a16 != null) {
                                    c.a(kVar.bv, gVar);
                                }
                                if (gVar != null && gVar != null) {
                                    fVar2.c.add(gVar);
                                    if (fVar2.d != null && gVar.getPlacementId() != 0) {
                                    }
                                    fVar2.d = gVar;
                                }
                                i18++;
                                optJSONArray12 = jSONArray;
                                jSONObject6 = jSONObject7;
                                str31 = str19;
                            }
                        } else {
                            jSONObject7 = jSONObject6;
                            jSONArray = optJSONArray12;
                            str19 = str31;
                        }
                        gVar = null;
                        if (gVar != null) {
                            fVar2.c.add(gVar);
                            if (fVar2.d != null) {
                            }
                            fVar2.d = gVar;
                        }
                        i18++;
                        optJSONArray12 = jSONArray;
                        jSONObject6 = jSONObject7;
                        str31 = str19;
                    }
                }
                jSONObject4 = jSONObject6;
                str7 = str31;
                fVar = fVar2;
            } else {
                str13 = str10;
                str14 = str9;
                jSONObject4 = jSONObject3;
                str15 = str12;
                str16 = str6;
                jSONObject5 = b4;
                fVar = null;
            }
            if (b7 != null) {
                JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(b(b7, str11), b9);
                boolean optBoolean13 = mergeJsons4.optBoolean("sendEventsToggle", false);
                boolean optBoolean14 = mergeJsons4.optBoolean("eventsCompression", false);
                String optString19 = mergeJsons4.optString(str16, str15);
                String optString20 = mergeJsons4.optString(str14, str15);
                int optInt17 = mergeJsons4.optInt(str7, -1);
                int optInt18 = mergeJsons4.optInt(str8, -1);
                int optInt19 = mergeJsons4.optInt(str4, 5000);
                str18 = str3;
                JSONArray optJSONArray17 = mergeJsons4.optJSONArray(str18);
                if (optJSONArray17 != null) {
                    int[] iArr29 = new int[optJSONArray17.length()];
                    for (int i19 = 0; i19 < optJSONArray17.length(); i19++) {
                        iArr29[i19] = optJSONArray17.optInt(i19);
                    }
                    iArr5 = iArr29;
                } else {
                    iArr5 = null;
                }
                str17 = str23;
                JSONArray optJSONArray18 = mergeJsons4.optJSONArray(str17);
                if (optJSONArray18 != null) {
                    int[] iArr30 = new int[optJSONArray18.length()];
                    for (int i20 = 0; i20 < optJSONArray18.length(); i20++) {
                        iArr30[i20] = optJSONArray18.optInt(i20);
                    }
                    iArr6 = iArr30;
                } else {
                    iArr6 = null;
                }
                JSONArray optJSONArray19 = mergeJsons4.optJSONArray(str21);
                if (optJSONArray19 != null) {
                    int[] iArr31 = new int[optJSONArray19.length()];
                    for (int i21 = 0; i21 < optJSONArray19.length(); i21++) {
                        iArr31[i21] = optJSONArray19.optInt(i21);
                    }
                    iArr7 = iArr31;
                } else {
                    iArr7 = null;
                }
                JSONArray optJSONArray20 = mergeJsons4.optJSONArray("nonConnectivityEvents");
                if (optJSONArray20 != null) {
                    int[] iArr32 = new int[optJSONArray20.length()];
                    for (int i22 = 0; i22 < optJSONArray20.length(); i22++) {
                        iArr32[i22] = optJSONArray20.optInt(i22);
                    }
                    iArr8 = iArr32;
                } else {
                    iArr8 = null;
                }
                com.ironsource.mediationsdk.model.j jVar2 = new com.ironsource.mediationsdk.model.j(new com.ironsource.mediationsdk.model.c(false, optBoolean13, optBoolean14, optString19, optString20, optInt17, optInt18, optInt19, iArr5, iArr6, iArr7, iArr8));
                jVar2.d = b7;
                JSONArray optJSONArray21 = b7.optJSONArray(str13);
                if (optJSONArray21 != null) {
                    for (int i23 = 0; i23 < optJSONArray21.length(); i23++) {
                        JSONObject optJSONObject4 = optJSONArray21.optJSONObject(i23);
                        if (optJSONObject4 != null) {
                            int optInt20 = optJSONObject4.optInt(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, -1);
                            String optString21 = optJSONObject4.optString("placementName", str15);
                            boolean optBoolean15 = optJSONObject4.optBoolean("isDefault", false);
                            if (optInt20 >= 0 && !TextUtils.isEmpty(optString21)) {
                                kVar2 = new com.ironsource.mediationsdk.model.k(optInt20, optString21, optBoolean15);
                                if (kVar2 != null && kVar2 != null) {
                                    jVar2.a.add(kVar2);
                                    if (jVar2.b != null && kVar2.a != 0) {
                                    }
                                    jVar2.b = kVar2;
                                }
                            }
                        }
                        kVar2 = null;
                        if (kVar2 != null) {
                            jVar2.a.add(kVar2);
                            if (jVar2.b != null) {
                            }
                            jVar2.b = kVar2;
                        }
                    }
                }
                jVar = jVar2;
            } else {
                str17 = str23;
                str18 = str3;
                jVar = null;
            }
            o oVar = new o();
            if (b11 != null) {
                JSONArray optJSONArray22 = b11.optJSONArray("optInKeys");
                if (optJSONArray22 != null) {
                    for (int i24 = 0; i24 < optJSONArray22.length(); i24++) {
                        String optString22 = optJSONArray22.optString(i24);
                        if (!TextUtils.isEmpty(optString22)) {
                            oVar.a.add(optString22);
                        }
                    }
                }
                JSONObject optJSONObject5 = b11.optJSONObject("tokenGenericParams");
                if (optJSONObject5 != null) {
                    oVar.b = optJSONObject5;
                }
                oVar.c = b11.optBoolean("oneToken", false);
                oVar.d = b11.optBoolean("compressToken", true);
            }
            j jVar3 = new j();
            if (b17 != null) {
                String optString23 = b17.optString("pixelEventsUrl", "https://outcome-ssp.supersonicads.com/mediation?adUnit=3");
                z2 = b17.optBoolean("pixelEventsEnabled", true);
                Intrinsics.checkNotNullParameter(optString23, "<set-?>");
                jVar3.b = optString23;
            } else {
                z2 = true;
            }
            jVar3.a = z2;
            if (z2) {
                jVar3.d = a(b9, str18);
                jVar3.e = a(b9, str17);
                jVar3.c = b9.optBoolean("eventsCompression", false);
            }
            com.ironsource.mediationsdk.model.e eVar = new com.ironsource.mediationsdk.model.e(b10.optInt("server", 3), b10.optInt("publisher", 3), b10.optInt("console", 3));
            com.ironsource.sdk.g.d dVar = new com.ironsource.sdk.g.d();
            if (jSONObject2 != null) {
                JSONObject jSONObject11 = jSONObject2;
                dVar.a(jSONObject11.optBoolean("enabled", false));
                dVar.b(jSONObject11.optString("reporterURL", str15));
                dVar.c(jSONObject11.optString("reporterKeyword", str15));
                dVar.b(jSONObject11.optBoolean("includeANR", false));
                dVar.a(jSONObject11.optInt("timeout", 5000));
                dVar.c(jSONObject11.optBoolean("setIgnoreDebugger", false));
                JSONArray optJSONArray23 = jSONObject11.optJSONArray("keysToInclude");
                if (optJSONArray23 != null) {
                    for (int i25 = 0; i25 < optJSONArray23.length(); i25++) {
                        dVar.a(optJSONArray23.optString(i25));
                    }
                }
            }
            if (jSONObject != null) {
                JSONObject jSONObject12 = jSONObject;
                qVar = new q(jSONObject12.optString("name", str15), jSONObject12.optString("id", "-1"), jSONObject12.optJSONObject("custom"));
            } else {
                qVar = null;
            }
            a aVar = b15 != null ? new a(b15.optBoolean("isExternalArmEventsEnabled", true), b15.optString("externalArmEventsUrl", "https://outcome-arm-ext-med-ext.sonic-us.supersonicads.com/aemData"), b15.optBoolean("sid", true)) : new a();
            com.ironsource.mediationsdk.model.d dVar2 = new com.ironsource.mediationsdk.model.d();
            if (b16 != null) {
                JSONObject optJSONObject6 = b16.optJSONObject("mediationTypes");
                Map hashMap = new HashMap();
                if (optJSONObject6 != null) {
                    hashMap = IronSourceUtils.parseJsonToStringMap(optJSONObject6);
                }
                b16.optBoolean("compressExternalToken", false);
                dVar2 = new com.ironsource.mediationsdk.model.d(hashMap);
            }
            kVar.c = new com.ironsource.mediationsdk.model.h(pVar, iVar, jVar, fVar, new com.ironsource.sdk.f.a(eVar, qVar, oVar, jSONObject5.optBoolean("integration", false), dVar, aVar, dVar2, jVar3, jSONObject4 != null ? new com.ironsource.mediationsdk.model.b(jSONObject4.optString("auctionData")) : new com.ironsource.mediationsdk.model.b()));
            JSONObject b24 = b(b9, IronSourceConstants.EVENTS_GENERIC_PARAMS);
            if (b24 != null && (b = b(b24, str11)) != null) {
                b24.remove(str11);
                Map<String, String> parseJsonToStringMap = IronSourceUtils.parseJsonToStringMap(b);
                com.ironsource.mediationsdk.a.h.e().b(parseJsonToStringMap);
                com.ironsource.mediationsdk.a.d.e().b(parseJsonToStringMap);
            }
            if (b24 != null) {
                Map<String, String> parseJsonToStringMap2 = IronSourceUtils.parseJsonToStringMap(b24);
                com.ironsource.mediationsdk.a.h.e().a(parseJsonToStringMap2);
                com.ironsource.mediationsdk.a.d.e().a(parseJsonToStringMap2);
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean a() {
        return (((((this.d != null) && !this.d.has("error")) && this.a != null) && this.b != null) && this.c != null) && e();
    }

    public final String b() {
        try {
            return this.a.b;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVBackFillProvider", e);
            return null;
        }
    }

    public final String c() {
        try {
            return this.a.c;
        } catch (Exception e) {
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "getRVPremiumProvider", e);
            return null;
        }
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.bt);
            jSONObject.put(DataKeys.USER_ID, this.bu);
            jSONObject.put("response", this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
