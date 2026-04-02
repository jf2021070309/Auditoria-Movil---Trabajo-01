package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.app.Activity;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.TTAdConstant;
import com.bytedance.msdk.api.reward.RewardItem;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.ad.reward.GMRewardedAdListener;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.umeng.analytics.pro.o;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b {

    /* loaded from: classes.dex */
    class a implements RewardItem {
        final /* synthetic */ boolean a;
        final /* synthetic */ float b;
        final /* synthetic */ String c;
        final /* synthetic */ Map d;

        a(f fVar, boolean z, float f, String str, Map map) {
            this.a = z;
            this.b = f;
            this.c = str;
            this.d = map;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public float getAmount() {
            return this.b;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public Map<String, Object> getCustomData() {
            return this.d;
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
    class b implements RewardItem {
        final /* synthetic */ boolean a;
        final /* synthetic */ float b;
        final /* synthetic */ String c;
        final /* synthetic */ Map d;

        b(f fVar, boolean z, float f, String str, Map map) {
            this.a = z;
            this.b = f;
            this.c = str;
            this.d = map;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public float getAmount() {
            return this.b;
        }

        @Override // com.bytedance.msdk.api.reward.RewardItem
        public Map<String, Object> getCustomData() {
            return this.d;
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
    static /* synthetic */ class c {
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

    public f(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        super(tTAbsAdLoaderAdapter);
    }

    private GMRewardedAdListener b() {
        return (GMRewardedAdListener) this.mTTAdatperCallback;
    }

    private GMRewardedAdListener c() {
        return (GMRewardedAdListener) this.mTTAdatperRewardPlayAgainCallback;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b
    public <T> T a(int i, ValueSet valueSet, Class<T> cls) {
        GMRewardedAdListener c2;
        RewardItem bVar;
        GMRewardedAdListener c3;
        GMRewardedAdListener c4;
        GMRewardedAdListener c5;
        GMRewardedAdListener c6;
        GMRewardedAdListener c7;
        GMRewardedAdListener c8;
        String str;
        if (i == 8115) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c8 = b();
                c8.onRewardClick();
            }
        } else if (i == 8116) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c7 = b();
                c7.onRewardedAdClosed();
            }
        } else if (i == 8117) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c6 = b();
                c6.onVideoError();
            }
        } else if (i == 8118) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c5 = b();
                c5.onVideoComplete();
            }
        } else if (i == 8119) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c4 = b();
                c4.onSkippedVideo();
            }
        } else if (i == 8230) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                c3 = b();
                c3.onRewardedAdShow();
            }
        } else if (i == 8231) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                boolean booleanValue = valueSet.booleanValue(8017);
                float intValue = valueSet.intValue(8018);
                String stringValue = valueSet.stringValue(8019);
                Map map = (Map) valueSet.objectValue(8020, Map.class);
                HashMap hashMap = new HashMap();
                if (map != null) {
                    hashMap.putAll(map);
                }
                c2 = b();
                bVar = new a(this, booleanValue, intValue, stringValue, hashMap);
                c2.onRewardVerify(bVar);
            }
        } else if (i == 1017) {
            if (this.mTTAdatperCallback instanceof GMRewardedAdListener) {
                int i2 = 0;
                if (valueSet != null) {
                    i2 = valueSet.intValue(8014, 0);
                    str = valueSet.stringValue(8015);
                } else {
                    str = "";
                }
                b().onRewardedAdShowFail(new AdError(i2, str));
            }
        } else if (i == 8232) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c8 = c();
                c8.onRewardClick();
            }
        } else if (i == 8233) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c7 = c();
                c7.onRewardedAdClosed();
            }
        } else if (i == 8234) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c6 = c();
                c6.onVideoError();
            }
        } else if (i == 8235) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c5 = c();
                c5.onVideoComplete();
            }
        } else if (i == 8236) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c4 = c();
                c4.onSkippedVideo();
            }
        } else if (i == 8237) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                c3 = c();
                c3.onRewardedAdShow();
            }
        } else if (i == 8238) {
            if (this.mTTAdatperRewardPlayAgainCallback instanceof GMRewardedAdListener) {
                boolean booleanValue2 = valueSet.booleanValue(8017);
                float intValue2 = valueSet.intValue(8018);
                String stringValue2 = valueSet.stringValue(8019);
                Map map2 = (Map) valueSet.objectValue(8020, Map.class);
                HashMap hashMap2 = new HashMap();
                if (map2 != null) {
                    hashMap2.putAll(map2);
                }
                c2 = c();
                bVar = new b(this, booleanValue2, intValue2, stringValue2, hashMap2);
                c2.onRewardVerify(bVar);
            }
        } else if (i == 8111) {
            setCpm(valueSet.doubleValue(8016));
        }
        return (T) MediationValueUtil.checkClassType(cls);
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
            int i = c.a[((MediationConstant.AdIsReadyStatus) bridge.call(8121, null, MediationConstant.AdIsReadyStatus.class)).ordinal()];
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
