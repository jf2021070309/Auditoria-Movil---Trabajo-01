package com.bytedance.msdk.adapter.pangle;

import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMMediationAdSdk;
import com.bytedance.msdk.api.v2.slot.GMAdSlotBase;
import com.bytedance.msdk.api.v2.slot.GMAdSlotDraw;
import com.bytedance.msdk.api.v2.slot.GMAdSlotNative;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class PangleAdapterUtils {
    public static final double CPM_DEFLAUT_VALUE = 0.0d;
    public static final String MEDIA_EXTRA_COUPON = "coupon";
    public static final String MEDIA_EXTRA_LIVE_ROOM = "live_room";
    public static final String MEDIA_EXTRA_PRODUCT = "product";
    public static final String VERSION_00 = "0.0";
    public static final String VERSION_5100 = "5.1.0.0";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.msdk.adapter.pangle.PangleAdapterUtils$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[GMAdConstant.GroMoreRitScenes.values().length];
            b = iArr;
            try {
                iArr[GMAdConstant.GroMoreRitScenes.CUSTOMIZE_SCENES.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_OPEN_BONUS.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_SVIP_BONUS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_GET_PROPS.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_TRY_PROPS.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_GET_BONUS.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.HOME_GIFT_BONUS.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.GAME_START_BONUS.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.GAME_REDUCE_WAITING.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.GAME_MORE_KLLKRTUNITIES.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.GAME_FINISH_REWARDS.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                b[GMAdConstant.GroMoreRitScenes.GAME_GIFT_BONUS.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            int[] iArr2 = new int[TTAdConstant.GroMoreRitScenes.values().length];
            a = iArr2;
            try {
                iArr2[TTAdConstant.GroMoreRitScenes.CUSTOMIZE_SCENES.ordinal()] = 1;
            } catch (NoSuchFieldError e13) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_OPEN_BONUS.ordinal()] = 2;
            } catch (NoSuchFieldError e14) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_SVIP_BONUS.ordinal()] = 3;
            } catch (NoSuchFieldError e15) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_GET_PROPS.ordinal()] = 4;
            } catch (NoSuchFieldError e16) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_TRY_PROPS.ordinal()] = 5;
            } catch (NoSuchFieldError e17) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_GET_BONUS.ordinal()] = 6;
            } catch (NoSuchFieldError e18) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.HOME_GIFT_BONUS.ordinal()] = 7;
            } catch (NoSuchFieldError e19) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.GAME_START_BONUS.ordinal()] = 8;
            } catch (NoSuchFieldError e20) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.GAME_REDUCE_WAITING.ordinal()] = 9;
            } catch (NoSuchFieldError e21) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.GAME_MORE_KLLKRTUNITIES.ordinal()] = 10;
            } catch (NoSuchFieldError e22) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.GAME_FINISH_REWARDS.ordinal()] = 11;
            } catch (NoSuchFieldError e23) {
            }
            try {
                a[TTAdConstant.GroMoreRitScenes.GAME_GIFT_BONUS.ordinal()] = 12;
            } catch (NoSuchFieldError e24) {
            }
        }
    }

    private static AdSlot.Builder a(com.bytedance.msdk.api.AdSlot adSlot, GMAdSlotBase gMAdSlotBase, String str, String str2, String str3, String str4, boolean z) {
        int adCount;
        AdSlot.Builder adCount2 = new AdSlot.Builder().setCodeId(str).setAdCount(1);
        if (adSlot != null) {
            Map<String, Object> extraObject = adSlot.getReuestParam().getExtraObject();
            int[] iArr = null;
            if (extraObject != null) {
                try {
                    iArr = (int[]) extraObject.get("pangle_vid");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            adCount2.setAdloadSeq(adSlot.getAdloadSeq()).setPrimeRit(adSlot.getAdUnitId()).setSupportDeepLink(adSlot.isSupportDeepLink());
            if (iArr != null && iArr.length > 0) {
                adCount2.setExternalABVid(iArr);
            }
            if (gMAdSlotBase != null) {
                if (gMAdSlotBase instanceof GMAdSlotNative) {
                    adCount = ((GMAdSlotNative) gMAdSlotBase).getRequestCount();
                } else if (gMAdSlotBase instanceof GMAdSlotDraw) {
                    adCount = ((GMAdSlotDraw) gMAdSlotBase).getAdCount();
                }
                adCount2.setAdCount(adCount);
            } else if (5 == adSlot.getAdType() || 9 == adSlot.getAdType()) {
                adCount = adSlot.getAdCount();
                adCount2.setAdCount(adCount);
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            adCount2.withBid(str4);
        }
        a(adCount2, str2, str3, z);
        return adCount2;
    }

    private static TTAdConstant.RitScenes a(TTAdConstant.GroMoreRitScenes groMoreRitScenes) {
        if (groMoreRitScenes == null) {
            return null;
        }
        switch (AnonymousClass1.a[groMoreRitScenes.ordinal()]) {
            case 1:
                return TTAdConstant.RitScenes.CUSTOMIZE_SCENES;
            case 2:
                return TTAdConstant.RitScenes.HOME_OPEN_BONUS;
            case 3:
                return TTAdConstant.RitScenes.HOME_SVIP_BONUS;
            case 4:
                return TTAdConstant.RitScenes.HOME_GET_PROPS;
            case 5:
                return TTAdConstant.RitScenes.HOME_TRY_PROPS;
            case 6:
                return TTAdConstant.RitScenes.HOME_GET_BONUS;
            case 7:
                return TTAdConstant.RitScenes.HOME_GIFT_BONUS;
            case 8:
                return TTAdConstant.RitScenes.GAME_START_BONUS;
            case 9:
                return TTAdConstant.RitScenes.GAME_REDUCE_WAITING;
            case 10:
                return TTAdConstant.RitScenes.GAME_MORE_KLLKRTUNITIES;
            case 11:
                return TTAdConstant.RitScenes.GAME_FINISH_REWARDS;
            case 12:
                return TTAdConstant.RitScenes.GAME_GIFT_BONUS;
            default:
                return null;
        }
    }

    private static TTAdConstant.RitScenes a(GMAdConstant.GroMoreRitScenes groMoreRitScenes) {
        if (groMoreRitScenes == null) {
            return null;
        }
        switch (AnonymousClass1.b[groMoreRitScenes.ordinal()]) {
            case 1:
                return TTAdConstant.RitScenes.CUSTOMIZE_SCENES;
            case 2:
                return TTAdConstant.RitScenes.HOME_OPEN_BONUS;
            case 3:
                return TTAdConstant.RitScenes.HOME_SVIP_BONUS;
            case 4:
                return TTAdConstant.RitScenes.HOME_GET_PROPS;
            case 5:
                return TTAdConstant.RitScenes.HOME_TRY_PROPS;
            case 6:
                return TTAdConstant.RitScenes.HOME_GET_BONUS;
            case 7:
                return TTAdConstant.RitScenes.HOME_GIFT_BONUS;
            case 8:
                return TTAdConstant.RitScenes.GAME_START_BONUS;
            case 9:
                return TTAdConstant.RitScenes.GAME_REDUCE_WAITING;
            case 10:
                return TTAdConstant.RitScenes.GAME_MORE_KLLKRTUNITIES;
            case 11:
                return TTAdConstant.RitScenes.GAME_FINISH_REWARDS;
            case 12:
                return TTAdConstant.RitScenes.GAME_GIFT_BONUS;
            default:
                return null;
        }
    }

    private static Map<String, String> a() {
        return GMMediationAdSdk.getPangleExtraData();
    }

    static JSONArray a(String str) {
        JSONArray jSONArray;
        try {
            jSONArray = TextUtils.isEmpty(str) ? new JSONArray() : new JSONArray(str);
        } catch (Exception e) {
            e.printStackTrace();
            jSONArray = null;
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    private static void a(AdSlot.Builder builder, String str, String str2, boolean z) {
        JSONArray pangleDataAndExtraData = getPangleDataAndExtraData();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", "mediation_sdk_version");
            jSONObject.putOpt("value", "4.2.0.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("name", "mediation_req_type");
            jSONObject2.putOpt("value", "1");
            JSONObject jSONObject3 = null;
            if (!TextUtils.isEmpty(str)) {
                jSONObject3 = new JSONObject();
                jSONObject3.putOpt("name", "waterfall_abtest");
                jSONObject3.putOpt("value", str);
            }
            pangleDataAndExtraData.put(jSONObject2);
            pangleDataAndExtraData.put(jSONObject);
            if (jSONObject3 != null) {
                pangleDataAndExtraData.put(jSONObject3);
            }
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("name", "m_req_id");
                jSONObject4.putOpt("value", str2);
                pangleDataAndExtraData.put(jSONObject4);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!z) {
            setPanglePreviewParam(builder);
        }
        TTAdSdk.updatePaid(GMMediationAdSdk.getPanglePaid());
        if (builder != null) {
            builder.setUserData(pangleDataAndExtraData.toString());
        }
    }

    private static String b() {
        try {
            return TTAdSdk.getAdManager().getSDKVersion();
        } catch (Throwable th) {
            return "0.0";
        }
    }

    public static AdSlot.Builder buildPangleAdSlot(com.bytedance.msdk.api.AdSlot adSlot, String str, String str2, String str3, String str4, boolean z) {
        return a(adSlot, null, str, str2, str3, str4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.openadsdk.AdSlot.Builder buildPangleAdSlot(com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet r2, java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = new com.bytedance.sdk.openadsdk.AdSlot$Builder
            r0.<init>()
            com.bytedance.sdk.openadsdk.AdSlot$Builder r3 = r0.setCodeId(r3)
            r0 = 1
            com.bytedance.sdk.openadsdk.AdSlot$Builder r3 = r3.setAdCount(r0)
            java.util.Map r0 = r2.getParams()
            if (r0 == 0) goto L21
            java.lang.String r1 = "pangle_vid"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1d
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L1d
            goto L22
        L1d:
            r0 = move-exception
            r0.printStackTrace()
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L2a
            int r1 = r0.length
            if (r1 <= 0) goto L2a
            r3.setExternalABVid(r0)
        L2a:
            int r0 = r2.getAdloadSeq()
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r3.setAdloadSeq(r0)
            java.lang.String r1 = r2.getRitId()
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setPrimeRit(r1)
            boolean r1 = r2.isSupportDeepLink()
            com.bytedance.sdk.openadsdk.AdSlot$Builder r0 = r0.setSupportDeepLink(r1)
            int r1 = r2.getAdCount()
            r0.setAdCount(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L52
            r3.withBid(r4)
        L52:
            java.lang.String r4 = r2.getWaterfallABTest()
            java.lang.String r2 = r2.getClientReqId()
            a(r3, r4, r2, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.msdk.adapter.pangle.PangleAdapterUtils.buildPangleAdSlot(com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationAdSlotValueSet, java.lang.String, java.lang.String, boolean):com.bytedance.sdk.openadsdk.AdSlot$Builder");
    }

    public static boolean currentSdkVerGreaterThanOrEqual(String str) {
        String b = b();
        return (TextUtils.isEmpty(b) || TextUtils.isEmpty(str) || b.compareTo(str) < 0) ? false : true;
    }

    public static int dp2px(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static long getAdId(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.get("ad_id") != null) {
                    return ((Long) map.get("ad_id")).longValue();
                }
                return 0L;
            } catch (Throwable th) {
                th.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static long getCreativeId(Map<String, Object> map) {
        if (map != null) {
            try {
                if (map.get("creative_id") != null) {
                    return ((Long) map.get("creative_id")).longValue();
                }
                return 0L;
            } catch (Throwable th) {
                th.printStackTrace();
                return 0L;
            }
        }
        return 0L;
    }

    public static String getCustomRitScenes(Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get(TTAdConstant.GroMoreExtraKey.CUSTOMIZE_RIT_SCENES);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static String getPangleData() {
        return GMMediationAdSdk.getPangleData();
    }

    public static JSONArray getPangleDataAndExtraData() {
        JSONArray a = a(getPangleData());
        try {
            Map<String, String> a2 = a();
            if (a2 != null && a2.size() > 0) {
                for (String str : a2.keySet()) {
                    String str2 = a2.get(str);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.putOpt("name", str);
                        jSONObject.putOpt("value", str2);
                        a.put(jSONObject);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public static String getReqId(Map<String, Object> map) {
        if (map == null || map.get("request_id") == null) {
            return null;
        }
        return (String) map.get("request_id");
    }

    public static TTAdConstant.RitScenes getRitScenes(Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        if (map == null) {
            return null;
        }
        Object obj = map.get(TTAdConstant.GroMoreExtraKey.RIT_SCENES);
        if (obj instanceof TTAdConstant.GroMoreRitScenes) {
            return a((TTAdConstant.GroMoreRitScenes) obj);
        }
        if (obj instanceof GMAdConstant.GroMoreRitScenes) {
            return a((GMAdConstant.GroMoreRitScenes) obj);
        }
        return null;
    }

    public static double getValue(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof Float) && !(obj instanceof Double)) {
            try {
                return obj instanceof String ? Double.valueOf((String) obj).doubleValue() : CPM_DEFLAUT_VALUE;
            } catch (Exception e) {
                return CPM_DEFLAUT_VALUE;
            }
        }
        return ((Double) obj).doubleValue();
    }

    public static boolean isExpressNativeAutoHeight(MediationAdSlotValueSet mediationAdSlotValueSet) {
        Map<String, Object> params = mediationAdSlotValueSet.getParams();
        if (params == null) {
            return false;
        }
        Object obj = params.get(MediationConstant.BANNER_AUTO_HEIGHT);
        try {
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        } catch (Throwable th) {
        }
        return false;
    }

    public static void printPrivacyLog(MediationInitConfig mediationInitConfig) {
    }

    public static void setPangleData(String str) {
        GMMediationAdSdk.setPangleData(str);
    }

    public static void setPanglePreviewParam(AdSlot.Builder builder) {
        if (builder != null && GMMediationAdSdk.isTestDemo()) {
            try {
                String valueFromPPeInfo = GMMediationAdSdk.getValueFromPPeInfo("tt_pangle_preview_ad_id");
                String valueFromPPeInfo2 = GMMediationAdSdk.getValueFromPPeInfo("tt_pangle_preview_creative_id");
                String valueFromPPeInfo3 = GMMediationAdSdk.getValueFromPPeInfo("tt_pangle_preview_ext");
                if (TextUtils.isEmpty(valueFromPPeInfo) || TextUtils.isEmpty(valueFromPPeInfo2) || TextUtils.isEmpty(valueFromPPeInfo3)) {
                    return;
                }
                builder.setAdId(valueFromPPeInfo).setCreativeId(valueFromPPeInfo2).setExt(valueFromPPeInfo3);
            } catch (Throwable th) {
            }
        }
    }

    public static String updateJsonArrayStr(String str, String str2, String str3) {
        JSONArray jSONArray;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if (TextUtils.isEmpty(str)) {
                    jSONArray = new JSONArray();
                } else {
                    try {
                        jSONArray = new JSONArray(str);
                    } catch (JSONException e) {
                        jSONArray = new JSONArray();
                    }
                }
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null && str2.equals(optJSONObject.getString("name"))) {
                            optJSONObject.put("value", str3);
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (!z) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", str2);
                    jSONObject.put("value", str3);
                    jSONArray.put(jSONObject);
                }
                return jSONArray.toString();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return str;
    }
}
