package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.base.TTBaseAd;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class b extends TTBaseAd implements Bridge {
    protected Bridge a;
    protected TTAbsAdLoaderAdapter b;

    public b(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        this.b = tTAbsAdLoaderAdapter;
    }

    public abstract <T> T a(int i, ValueSet valueSet, Class<T> cls);

    public boolean a() {
        TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter = this.b;
        if (tTAbsAdLoaderAdapter != null) {
            return tTAbsAdLoaderAdapter.isClientBidding();
        }
        return false;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void bidLoseNotify(Map<String, Object> map) {
        if (isClientBiddingAd()) {
            Object obj = map.get(MediationConstant.BIDDING_LOSE_REASON);
            int lossReason = GMAdConstant.BiddingLossReason.OTHER.getLossReason();
            if (obj instanceof GMAdConstant.BiddingLossReason) {
                lossReason = ((GMAdConstant.BiddingLossReason) obj).getLossReason();
            }
            map.put("bidding_lose_reason_NUM", Integer.valueOf(lossReason));
            if (this.a != null) {
                MediationValueSetBuilder create = MediationValueSetBuilder.create();
                create.add(8006, map);
                this.a.call(8144, create.build(), Void.class);
            }
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void bidWinNotify(Map<String, Object> map) {
        if (isClientBiddingAd() && this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8006, map);
            this.a.call(8142, create.build(), Void.class);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public final <T> T call(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 8128) {
            this.a = (Bridge) valueSet.objectValue(8035, Bridge.class);
        } else if (i == 8208) {
            String stringValue = valueSet.stringValue(8058);
            if (!TextUtils.isEmpty(stringValue)) {
                setLevelTag(stringValue);
            }
        } else if (i == 8209) {
            setImageMode(valueSet.intValue(8060));
        }
        return (T) a(i, valueSet, cls);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public long getAdId() {
        Bridge bridge = this.a;
        return bridge != null ? ((Long) bridge.call(8246, null, Long.class)).longValue() : super.getAdId();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public long getCreativeId() {
        Bridge bridge = this.a;
        return bridge != null ? ((Long) bridge.call(8245, null, Long.class)).longValue() : super.getCreativeId();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public Map<String, Object> getMediaExtraInfo() {
        Bridge bridge = this.a;
        if (bridge != null) {
            setMediaExtraInfo((Map) bridge.call(8239, null, Map.class));
        }
        return super.getMediaExtraInfo();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public boolean hasDestroyed() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return ((Boolean) bridge.call(8120, null, Boolean.class)).booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onDestroy() {
        super.onDestroy();
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(8109, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onPause() {
        super.onPause();
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(8149, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void onResume() {
        super.onResume();
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(8148, null, Void.class);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }
}
