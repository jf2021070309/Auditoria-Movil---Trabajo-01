package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19;

import android.text.TextUtils;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.AdSlot;
import com.bytedance.msdk.base.TTBaseAd;
import java.util.Map;
/* loaded from: classes.dex */
public class j0 {
    public static void a(TTBaseAd tTBaseAd, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_else10.k kVar, AdSlot adSlot, boolean z) {
        String message;
        if (tTBaseAd == null || !tTBaseAd.isMultiBiddingAd()) {
            return;
        }
        if (kVar == null) {
            tTBaseAd.setCpm(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        }
        String levelTag = tTBaseAd.getLevelTag();
        Map<String, String> r = kVar.r();
        if (TextUtils.isEmpty(levelTag)) {
            if (z) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, adSlot, tTBaseAd, (int) AdError.ERROR_CODE_NO_LEVEL_TAG, AdError.getMessage(AdError.ERROR_CODE_NO_LEVEL_TAG));
            }
            message = AdError.getMessage(AdError.ERROR_CODE_NO_LEVEL_TAG);
        } else if (r != null) {
            String str = r.get(levelTag);
            if (!TextUtils.isEmpty(str)) {
                try {
                    tTBaseAd.setCpm(Double.valueOf(str).doubleValue());
                    return;
                } catch (Exception e) {
                }
            } else if (z) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, adSlot, tTBaseAd, (int) AdError.ERROR_CODE_NO_MATCH_LEVEL_TAG, AdError.getMessage(AdError.ERROR_CODE_NO_MATCH_LEVEL_TAG));
            }
            tTBaseAd.setCpm(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
        } else {
            if (z) {
                bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.h.a(kVar, adSlot, tTBaseAd, (int) AdError.ERROR_CODE_NO_MATCH_LEVEL_TAG, AdError.getMessage(AdError.ERROR_CODE_NO_MATCH_LEVEL_TAG));
            }
            message = AdError.getMessage(AdError.ERROR_CODE_NO_MATCH_LEVEL_TAG);
        }
        tTBaseAd.setErrorMsg(message);
        tTBaseAd.setCpm(PangleAdapterUtils.CPM_DEFLAUT_VALUE);
    }
}
