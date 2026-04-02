package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.ad.banner.GMBannerAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import java.util.List;
/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class C0031a {
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

    public a(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        super(tTAbsAdLoaderAdapter);
    }

    private GMBannerAdListener b() {
        return (GMBannerAdListener) this.mTTAdatperCallback;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b
    public <T> T a(int i, ValueSet valueSet, Class<T> cls) {
        if (i == 1008) {
            if (this.mTTAdatperCallback instanceof GMBannerAdListener) {
                b().onAdShow();
                return null;
            }
            return null;
        } else if (i == 1009) {
            if (this.mTTAdatperCallback instanceof GMBannerAdListener) {
                b().onAdClicked();
                return null;
            }
            return null;
        } else if (i == 1014) {
            if (this.mTTAdatperCallback instanceof GMBannerAdListener) {
                b().onAdClosed();
                return null;
            }
            return null;
        } else if (i == 1016) {
            if (this.mTTAdatperCallback instanceof GMBannerAdListener) {
                b().onAdLeftApplication();
                return null;
            }
            return null;
        } else if (i == 8111) {
            setCpm(valueSet.doubleValue(8016));
            return null;
        } else if (i != 8140) {
            if (i != 8207) {
                return null;
            }
            setLevelTag(valueSet.stringValue(8058));
            return null;
        } else {
            String stringValue = valueSet.stringValue(8045);
            String stringValue2 = valueSet.stringValue(8046);
            int intValue = valueSet.intValue(8047);
            String stringValue3 = valueSet.stringValue(8048);
            String stringValue4 = valueSet.stringValue(8049);
            String stringValue5 = valueSet.stringValue(8050);
            int intValue2 = valueSet.intValue(8051);
            int intValue3 = valueSet.intValue(8052);
            String stringValue6 = valueSet.stringValue(8054);
            boolean booleanValue = valueSet.booleanValue(8055);
            String stringValue7 = valueSet.stringValue(8056);
            String stringValue8 = valueSet.stringValue(8057);
            Object objectValue = valueSet.objectValue(8036, Object.class);
            String stringValue9 = valueSet.stringValue(8058);
            double doubleValue = valueSet.doubleValue(8016);
            boolean booleanValue2 = valueSet.booleanValue(8033);
            int intValue4 = valueSet.intValue(8060);
            String stringValue10 = valueSet.stringValue(8061);
            String stringValue11 = valueSet.stringValue(8061);
            long longValue = valueSet.longValue(8078);
            String stringValue12 = valueSet.stringValue(8079);
            String stringValue13 = valueSet.stringValue(8080);
            String stringValue14 = valueSet.stringValue(8081);
            double doubleValue2 = valueSet.doubleValue(8082);
            int intValue5 = valueSet.intValue(8059);
            setTitle(stringValue);
            setAdDescription(stringValue2);
            setAppSize(intValue);
            setIconUrl(stringValue3);
            setSource(stringValue4);
            setImageUrl(stringValue5);
            setImageHeight(intValue2);
            setImageWidth(intValue3);
            setImages((List) valueSet.objectValue(8053, List.class));
            setPackageName(stringValue6);
            setIsAppDownload(booleanValue);
            setAppName(stringValue7);
            setAuthorName(stringValue8);
            if (TextUtils.equals(getAdNetWorkName(), "baidu")) {
                putExtraMsg("baidu_dislike_info", objectValue);
            }
            setLevelTag(stringValue9);
            setCpm(doubleValue);
            setExpressAd(booleanValue2);
            setImageMode(intValue4);
            setInteractionType(intValue5);
            setActionText(stringValue10);
            setStore(stringValue11);
            setPackageSizeBytes(longValue);
            setPermissionsUrl(stringValue12);
            setPrivacyAgreement(stringValue13);
            setVersionName(stringValue14);
            setRating(doubleValue2);
            return null;
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public View getAdView() {
        Bridge bridge = this.a;
        return bridge != null ? (View) bridge.call(6081, null, View.class) : super.getAdView();
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
            int i = C0031a.a[((MediationConstant.AdIsReadyStatus) bridge.call(8121, null, MediationConstant.AdIsReadyStatus.class)).ordinal()];
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
    public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, GMViewBinder gMViewBinder) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20033, activity);
            create.add(8067, viewGroup);
            create.add(8068, list);
            create.add(8069, list2);
            create.add(8070, list3);
            create.add(8071, GMViewBinder.gmToCSJMViewBinder(gMViewBinder));
            this.a.call(8159, create.build(), Void.class);
        }
    }
}
