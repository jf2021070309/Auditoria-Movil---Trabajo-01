package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.adapter.util.TTLogUtil;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.api.GMAdEcpmInfo;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMConfigUserInfoForSegment;
import com.bytedance.msdk.api.v2.GMNetworkPlatformConst;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class p {
    public static GMAdEcpmInfo a(AdSlot adSlot, TTBaseAd tTBaseAd, boolean z) {
        String multiCpm;
        if (tTBaseAd == null) {
            return null;
        }
        GMAdEcpmInfo gMAdEcpmInfo = new GMAdEcpmInfo();
        gMAdEcpmInfo.setAdNetworkPlatformId(tTBaseAd.getAdNetworkPlatformId());
        gMAdEcpmInfo.setAdNetworkPlatformName(tTBaseAd.getAdNetWorkName());
        gMAdEcpmInfo.setCustomAdNetworkPlatformName(tTBaseAd.getCustomAdNetWorkName());
        gMAdEcpmInfo.setAdNetworkRitId(tTBaseAd.getAdNetworkSlotId());
        gMAdEcpmInfo.setLevelTag(tTBaseAd.getLevelTag());
        if (z) {
            if (b() || (!tTBaseAd.isServerBiddingAd() && !tTBaseAd.isClientBiddingAd() && !tTBaseAd.isMultiBiddingAd())) {
                multiCpm = tTBaseAd.getNetWorkPlatFormCpm();
                gMAdEcpmInfo.setPreEcpm(multiCpm);
            }
            gMAdEcpmInfo.setPreEcpm(GMNetworkPlatformConst.AD_NETWORK_NO_PERMISSION);
        } else {
            if (a() || !tTBaseAd.isServerBiddingAd()) {
                multiCpm = tTBaseAd.getMultiCpm();
                gMAdEcpmInfo.setPreEcpm(multiCpm);
            }
            gMAdEcpmInfo.setPreEcpm(GMNetworkPlatformConst.AD_NETWORK_NO_PERMISSION);
        }
        gMAdEcpmInfo.setRequestId(tTBaseAd.getReqId());
        gMAdEcpmInfo.setReqBiddingType(tTBaseAd.getAdNetworkSlotType());
        gMAdEcpmInfo.setErrorMsg(tTBaseAd.getErrorMsg());
        gMAdEcpmInfo.setRitType(a(adSlot));
        gMAdEcpmInfo.setScenarioId(adSlot != null ? adSlot.getScenarioId() : null);
        gMAdEcpmInfo.setAbTestId(a(adSlot != null ? adSlot.getWaterfallABTest() : null));
        gMAdEcpmInfo.setSegmentId("" + adSlot.getSegmentId());
        GMConfigUserInfoForSegment f = bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.b.L().f();
        gMAdEcpmInfo.setChannel(f != null ? f.getChannel() : null);
        gMAdEcpmInfo.setSubChannel(f != null ? f.getSubChannel() : null);
        Map<String, String> customData = adSlot != null ? adSlot.getCustomData() : null;
        if (customData != null && !customData.isEmpty()) {
            gMAdEcpmInfo.setCustomData(customData);
        }
        return gMAdEcpmInfo;
    }

    private static String a(AdSlot adSlot) {
        if (adSlot != null) {
            int adType = adSlot.getAdType();
            if (adType == 1) {
                return GMAdConstant.RIT_TYPE_BANNER;
            }
            if (adType == 2) {
                return GMAdConstant.RIT_TYPE_INTERSTITIAL;
            }
            if (adType == 3) {
                return GMAdConstant.RIT_TYPE_SPLASH;
            }
            if (adType == 5) {
                return GMAdConstant.RIT_TYPE_FEED;
            }
            if (adType == 7) {
                return GMAdConstant.RIT_TYPE_REWARD_VIDEO;
            }
            if (adType == 8) {
                return GMAdConstant.RIT_TYPE_FULL_VIDEO;
            }
            if (adType == 9) {
                return GMAdConstant.RIT_TYPE_DRAW;
            }
        }
        return null;
    }

    public static String a(TTBaseAd tTBaseAd) {
        Map<String, Object> eventMap;
        if (tTBaseAd != null && (eventMap = tTBaseAd.getEventMap()) != null) {
            Object obj = eventMap.get("waterfall_abtest");
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str).optString("experiment_detail_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static boolean a() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().w();
    }

    public static boolean a(List<TTBaseAd> list, List<TTBaseAd> list2, List<TTBaseAd> list3, AdSlot adSlot, boolean z, AtomicBoolean atomicBoolean, String str, int i, List<bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k> list4, String str2) {
        bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(list, list2, list3, adSlot, str2);
        if (z) {
            return false;
        }
        if (list.size() > 0) {
            for (TTBaseAd tTBaseAd : list) {
                if (tTBaseAd != null) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(str, tTBaseAd.getAdNetworkSlotId()) + "isReady-》广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd.getAdNetworkPlatformId()) + ",是否已准备好？isReady()：" + tTBaseAd.isReady(str));
                    if (tTBaseAd.isReady(str) && !tTBaseAd.isHasShown()) {
                        break;
                    }
                }
            }
        }
        if (list3 != null && list3.size() > 0) {
            for (TTBaseAd tTBaseAd2 : list3) {
                if (tTBaseAd2 != null) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(str, tTBaseAd2.getAdNetworkSlotId()) + "isReady-》广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd2.getAdNetworkPlatformId()) + ",是否已准备好？isReady()：" + tTBaseAd2.isReady(str));
                    if (tTBaseAd2.isReady(str) && !tTBaseAd2.isHasShown()) {
                        break;
                    }
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (TTBaseAd tTBaseAd3 : list2) {
                if (tTBaseAd3 != null) {
                    Logger.d("TTMediationSDK", TTLogUtil.getTagThirdLevelById(str, tTBaseAd3.getAdNetworkSlotId()) + "isReady--->biding-->广告类型：" + com.bytedance.msdk.base.a.a(tTBaseAd3.getAdNetworkPlatformId()) + ",是否已准备好？isReady()：" + tTBaseAd3.isReady(str));
                    if (tTBaseAd3.isReady(str) && !tTBaseAd3.isHasShown()) {
                        break;
                    }
                }
            }
        }
        if (list4 == null || list4.size() <= 0) {
            return false;
        }
        for (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar : list4) {
            String d = kVar.d();
            if (kVar.a() && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().c(str, d, i) && bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_int108.bykvm_19do.a.a().a(d, adSlot, false) == 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean b() {
        return bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().v();
    }
}
