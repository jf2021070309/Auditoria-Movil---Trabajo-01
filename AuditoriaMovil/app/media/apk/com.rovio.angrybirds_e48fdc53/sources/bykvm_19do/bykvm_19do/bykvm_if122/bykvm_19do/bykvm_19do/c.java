package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.ad.fullvideo.GMFullVideoAdListener;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.umeng.analytics.pro.o;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b {

    /* loaded from: classes.dex */
    class a implements RewardItem {
        final /* synthetic */ boolean a;
        final /* synthetic */ float b;
        final /* synthetic */ String c;

        a(c cVar, boolean z, float f, String str) {
            this.a = z;
            this.b = f;
            this.c = str;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public float getAmount() {
            return this.b;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public Map<String, Object> getCustomData() {
            return null;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public String getRewardName() {
            return this.c;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public boolean rewardVerify() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[MediationConstant.AdIsReadyStatus.values().length];
            a = iArr;
            try {
                iArr[MediationConstant.AdIsReadyStatus.AD_IS_READY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[MediationConstant.AdIsReadyStatus.ADN_NO_READY_API.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[MediationConstant.AdIsReadyStatus.AD_IS_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[MediationConstant.AdIsReadyStatus.AD_IS_NOT_READY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    public c(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        super(tTAbsAdLoaderAdapter);
    }

    private GMFullVideoAdListener b() {
        return (GMFullVideoAdListener) this.mTTAdatperCallback;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b
    public <T> T a(int i, ValueSet valueSet, Class<T> cls) {
        String str;
        if (i == 8143) {
            return (T) Double.valueOf(getCpm());
        }
        if (i != 8111) {
            int i2 = 0;
            if (i == 8129) {
                if (valueSet != null) {
                    setExpressAd(Boolean.valueOf(valueSet.booleanValue(8033, false)).booleanValue());
                }
            } else if (i == 1008) {
                if (b() != null) {
                    b().onFullVideoAdShow();
                }
            } else if (i == 1017) {
                if (b() != null) {
                    if (valueSet != null) {
                        i2 = valueSet.intValue(8014, 0);
                        str = valueSet.stringValue(8015);
                    } else {
                        str = "";
                    }
                    b().onFullVideoAdShowFail(new AdError(i2, str));
                }
            } else if (i == 1009) {
                if (b() != null) {
                    b().onFullVideoAdClick();
                }
            } else if (i == 1014) {
                if (b() != null) {
                    b().onFullVideoAdClosed();
                }
            } else if (i == 1026) {
                if (b() != null) {
                    b().onVideoComplete();
                }
            } else if (i == 1021) {
                if (b() != null) {
                    b().onVideoError();
                }
            } else if (i == 1037) {
                if (b() != null) {
                    b().onSkippedVideo();
                }
            } else if (i == 1018 && b() != null) {
                b().onRewardVerify(new a(this, valueSet.booleanValue(8017), valueSet.intValue(8018), valueSet.stringValue(8019)));
            }
        } else if (valueSet != null && (a() || isMultiBiddingAd())) {
            setCpm(valueSet.doubleValue(8016));
        }
        return null;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public boolean adnHasAdVideoCachedApi() {
        Boolean bool;
        Bridge bridge = this.a;
        return (bridge == null || (bool = (Boolean) bridge.call(o.a.B, null, Boolean.class)) == null) ? super.adnHasAdVideoCachedApi() : bool.booleanValue();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public String getReqId() {
        Bridge bridge = this.a;
        return bridge != null ? (String) bridge.call(8147, null, String.class) : super.getReqId();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMAdConstant.AdIsReadyStatus isReadyStatus() {
        Bridge bridge = this.a;
        if (bridge != null) {
            int i = b.a[((MediationConstant.AdIsReadyStatus) bridge.call(8121, null, MediationConstant.AdIsReadyStatus.class)).ordinal()];
            if (i == 1) {
                return GMAdConstant.AdIsReadyStatus.AD_IS_READY;
            }
            if (i == 2) {
                return GMAdConstant.AdIsReadyStatus.ADN_NO_READY_API;
            }
            if (i == 3) {
                return GMAdConstant.AdIsReadyStatus.AD_IS_EXPIRED;
            }
            if (i == 4) {
                return GMAdConstant.AdIsReadyStatus.AD_IS_NOT_READY;
            }
        }
        return super.isReadyStatus();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showAd(Activity activity, Map<TTAdConstant.GroMoreExtraKey, Object> map) {
        super.showAd(activity, map);
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20033, activity);
            create.add(8075, map);
            this.a.call(8113, create.build(), Void.class);
        }
    }
}
