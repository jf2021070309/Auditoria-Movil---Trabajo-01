package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.GMAdDislike;
import com.bytedance.msdk.api.v2.GMDislikeCallback;
import com.bytedance.msdk.api.v2.ad.GMAdAppDownloadListener;
import com.bytedance.msdk.api.v2.ad.GMShakeViewListener;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawAdListener;
import com.bytedance.msdk.api.v2.ad.draw.GMDrawExpressAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeExpressAdListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMVideoListener;
import com.bytedance.msdk.api.v2.ad.nativeAd.GMViewBinder;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.IMediationCustomizeVideo;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationValueUtil;
import com.umeng.analytics.pro.o;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class e extends bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b {
    private GMDislikeCallback c;

    /* loaded from: classes.dex */
    class a extends GMNativeCustomVideoReporter {
        final /* synthetic */ IMediationCustomizeVideo a;

        a(e eVar, IMediationCustomizeVideo iMediationCustomizeVideo) {
            this.a = iMediationCustomizeVideo;
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoAutoStart() {
            this.a.reportVideoAutoStart();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoBreak(long j) {
            this.a.reportVideoBreak(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoContinue(long j) {
            this.a.reportVideoContinue(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoError(long j, int i, int i2) {
            this.a.reportVideoError(j, i, i2);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoFinish() {
            this.a.reportVideoFinish();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoPause(long j) {
            this.a.reportVideoPause(j);
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoStart() {
            this.a.reportVideoStart();
        }

        @Override // com.bytedance.msdk.api.v2.ad.nativeAd.GMNativeCustomVideoReporter
        public void reportVideoStartError(int i, int i2) {
            this.a.reportVideoStartError(i, i2);
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

    public e(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        super(tTAbsAdLoaderAdapter);
    }

    private void a(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, GMViewBinder gMViewBinder) {
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

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b
    public <T> T a(int i, ValueSet valueSet, Class<T> cls) {
        boolean isExpressAd;
        GMDrawAdListener gMDrawAdListener;
        GMDrawAdListener gMDrawAdListener2;
        if (i == 8130) {
            if (getAdType() == 5) {
                GMNativeAdListener gMNativeAdListener = this.mTTNativeAdListener;
                if (gMNativeAdListener != null) {
                    gMNativeAdListener.onAdClick();
                }
            } else if (getAdType() == 9 && (gMDrawAdListener2 = this.mGMDrawAdListener) != null) {
                gMDrawAdListener2.onAdClick();
            }
        } else if (i == 8113) {
            if (getAdType() == 5) {
                GMNativeAdListener gMNativeAdListener2 = this.mTTNativeAdListener;
                if (gMNativeAdListener2 != null) {
                    gMNativeAdListener2.onAdShow();
                }
            } else if (getAdType() == 9 && (gMDrawAdListener = this.mGMDrawAdListener) != null) {
                gMDrawAdListener.onAdShow();
            }
        } else if (i == 8131) {
            if (this.b != null) {
                this.b.nativeDislikeClick(this, valueSet.stringValue(8036), (Map) valueSet.objectValue(8037, Map.class));
            }
        } else if (i == 8132) {
            if (this.c != null) {
                this.c.onSelected(valueSet.intValue(8038), valueSet.stringValue(8039));
            }
        } else if (i == 8133) {
            float floatValue = valueSet.floatValue(8040);
            float floatValue2 = valueSet.floatValue(8041);
            if (getAdType() == 5) {
                GMNativeAdListener gMNativeAdListener3 = this.mTTNativeAdListener;
                if (gMNativeAdListener3 instanceof GMNativeExpressAdListener) {
                    ((GMNativeExpressAdListener) gMNativeAdListener3).onRenderSuccess(floatValue, floatValue2);
                }
            } else if (getAdType() == 9) {
                GMDrawAdListener gMDrawAdListener3 = this.mGMDrawAdListener;
                if (gMDrawAdListener3 instanceof GMDrawExpressAdListener) {
                    ((GMDrawExpressAdListener) gMDrawAdListener3).onRenderSuccess(floatValue, floatValue2);
                }
            }
        } else if (i == 8134) {
            int intValue = valueSet.intValue(8014);
            String stringValue = valueSet.stringValue(8015);
            View view = (View) valueSet.objectValue(8042, View.class);
            if (getAdType() == 5) {
                GMNativeAdListener gMNativeAdListener4 = this.mTTNativeAdListener;
                if (gMNativeAdListener4 instanceof GMNativeExpressAdListener) {
                    ((GMNativeExpressAdListener) gMNativeAdListener4).onRenderFail(view, stringValue, intValue);
                }
            } else if (getAdType() == 9) {
                GMDrawAdListener gMDrawAdListener4 = this.mGMDrawAdListener;
                if (gMDrawAdListener4 instanceof GMDrawExpressAdListener) {
                    ((GMDrawExpressAdListener) gMDrawAdListener4).onRenderFail(view, stringValue, intValue);
                }
            }
        } else if (i == 8140) {
            String stringValue2 = valueSet.stringValue(8045);
            String stringValue3 = valueSet.stringValue(8046);
            int intValue2 = valueSet.intValue(8047);
            String stringValue4 = valueSet.stringValue(8048);
            String stringValue5 = valueSet.stringValue(8049);
            String stringValue6 = valueSet.stringValue(8050);
            int intValue3 = valueSet.intValue(8051);
            int intValue4 = valueSet.intValue(8052);
            String stringValue7 = valueSet.stringValue(8054);
            boolean booleanValue = valueSet.booleanValue(8055);
            String stringValue8 = valueSet.stringValue(8056);
            String stringValue9 = valueSet.stringValue(8057);
            Object objectValue = valueSet.objectValue(8036, Object.class);
            String stringValue10 = valueSet.stringValue(8058);
            double doubleValue = valueSet.doubleValue(8016);
            boolean booleanValue2 = valueSet.booleanValue(8033);
            int intValue5 = valueSet.intValue(8060);
            String stringValue11 = valueSet.stringValue(8061);
            String stringValue12 = valueSet.stringValue(8061);
            long longValue = valueSet.longValue(8078);
            String stringValue13 = valueSet.stringValue(8079);
            Map<String, String> map = (Map) valueSet.objectValue(8427, Map.class);
            String stringValue14 = valueSet.stringValue(8080);
            String stringValue15 = valueSet.stringValue(8081);
            double doubleValue2 = valueSet.doubleValue(8082);
            int intValue6 = valueSet.intValue(8059);
            setTitle(stringValue2);
            setAdDescription(stringValue3);
            setAppSize(intValue2);
            setIconUrl(stringValue4);
            setSource(stringValue5);
            setImageUrl(stringValue6);
            setImageHeight(intValue3);
            setImageWidth(intValue4);
            setImages((List) valueSet.objectValue(8053, List.class));
            setPackageName(stringValue7);
            setIsAppDownload(booleanValue);
            setAppName(stringValue8);
            setAuthorName(stringValue9);
            if (TextUtils.equals(getAdNetWorkName(), "baidu")) {
                putExtraMsg("baidu_dislike_info", objectValue);
            }
            setLevelTag(stringValue10);
            setCpm(doubleValue);
            setExpressAd(booleanValue2);
            setImageMode(intValue5);
            setActionText(stringValue11);
            setStore(stringValue12);
            setPackageSizeBytes(longValue);
            setPermissionsUrl(stringValue13);
            setPermissionsMap(map);
            setPrivacyAgreement(stringValue14);
            setVersionName(stringValue15);
            setRating(doubleValue2);
            setInteractionType(intValue6);
        } else if (i == 8143) {
            return (T) Double.valueOf(getCpm());
        } else {
            if (i == 8145) {
                GMVideoListener gMVideoListener = this.mTTVideoListener;
                if (gMVideoListener != null) {
                    gMVideoListener.onVideoStart();
                }
            } else if (i == 8146) {
                GMVideoListener gMVideoListener2 = this.mTTVideoListener;
                if (gMVideoListener2 != null) {
                    gMVideoListener2.onVideoPause();
                }
            } else if (i == 8118) {
                GMVideoListener gMVideoListener3 = this.mTTVideoListener;
                if (gMVideoListener3 != null) {
                    gMVideoListener3.onVideoCompleted();
                }
            } else if (i == 8117) {
                int intValue7 = valueSet.intValue(8014);
                String stringValue16 = valueSet.stringValue(8015);
                GMVideoListener gMVideoListener4 = this.mTTVideoListener;
                if (gMVideoListener4 != null) {
                    gMVideoListener4.onVideoError(new AdError(intValue7, stringValue16));
                }
            } else if (i == 8150) {
                GMVideoListener gMVideoListener5 = this.mTTVideoListener;
                if (gMVideoListener5 != null) {
                    gMVideoListener5.onVideoResume();
                }
            } else if (i == 1025) {
                if (this.mTTVideoListener != null) {
                    this.mTTVideoListener.onProgressUpdate(valueSet.longValue(8072), valueSet.longValue(8073));
                }
            } else if (i == 8152) {
                GMAdAppDownloadListener gMAdAppDownloadListener = this.mTTAdAppDownloadListener;
                if (gMAdAppDownloadListener != null) {
                    gMAdAppDownloadListener.onIdle();
                }
            } else if (i == 8153) {
                GMAdAppDownloadListener gMAdAppDownloadListener2 = this.mTTAdAppDownloadListener;
                if (gMAdAppDownloadListener2 != null) {
                    gMAdAppDownloadListener2.onDownloadStarted();
                }
            } else if (i == 8187) {
                if (this.mTTAdAppDownloadListener != null) {
                    this.mTTAdAppDownloadListener.onDownloadProgress(valueSet.longValue(8062), valueSet.intValue(8063), valueSet.intValue(8064), valueSet.intValue(8065));
                }
            } else if (i == 8155) {
                if (this.mTTAdAppDownloadListener != null) {
                    this.mTTAdAppDownloadListener.onDownloadFinished(valueSet.longValue(8062), valueSet.stringValue(8066), valueSet.stringValue(8056));
                }
            } else if (i == 8156) {
                if (this.mTTAdAppDownloadListener != null) {
                    this.mTTAdAppDownloadListener.onInstalled(valueSet.stringValue(8066), valueSet.stringValue(8056));
                }
            } else if (i == 8157) {
                if (this.mTTAdAppDownloadListener != null) {
                    this.mTTAdAppDownloadListener.onDownloadFailed(valueSet.longValue(8062), valueSet.intValue(8063), valueSet.stringValue(8066), valueSet.stringValue(8056));
                }
            } else if (i != 8158) {
                if (i == 8160) {
                    isExpressAd = isUseCustomVideo();
                } else if (i == 6069) {
                    return (T) Integer.valueOf(getImageMode());
                } else {
                    if (i == 8185) {
                        this.c.onShow();
                    } else if (i == 8184) {
                        this.c.onCancel();
                    } else if (i == 8196) {
                        isExpressAd = isExpressAd();
                    } else if (i == 8197) {
                        GMShakeViewListener gMShakeViewListener = this.gmShakeViewListener;
                        if (gMShakeViewListener != null) {
                            gMShakeViewListener.onDismissed();
                        }
                    } else if (i == 8227) {
                        if (valueSet != null) {
                            putExtraMsg((Map) valueSet.objectValue(8075, Map.class));
                        }
                    } else if (i == 6107 && this.gmVideoRewardListener != null) {
                        this.gmVideoRewardListener.onFeedRewardCountDown(valueSet.intValue(20055));
                    }
                }
                return (T) Boolean.valueOf(isExpressAd);
            } else if (this.mTTAdAppDownloadListener != null) {
                this.mTTAdAppDownloadListener.onDownloadPaused(valueSet.longValue(8062), valueSet.intValue(8063), valueSet.stringValue(8066), valueSet.stringValue(8056));
            }
        }
        return (T) MediationValueUtil.checkClassType(cls);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void cancelDownload() {
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(6093, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void dislikeClick(String str, Map<String, Object> map) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8036, str);
            create.add(8075, map);
            this.a.call(8194, create.build(), Integer.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public View getAdView() {
        Bridge bridge = this.a;
        return bridge != null ? (View) bridge.call(6081, null, View.class) : super.getAdView();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMAdDislike getDislikeDialog(Activity activity, Map<String, Object> map) {
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20033, activity);
            create.add(8075, map);
            return (GMAdDislike) this.a.call(6072, create.build(), GMAdDislike.class);
        }
        return super.getDislikeDialog(activity, map);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public int getDownloadStatus() {
        Bridge bridge = this.a;
        return bridge != null ? ((Integer) bridge.call(o.a.q, null, Integer.class)).intValue() : super.getDownloadStatus();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMNativeCustomVideoReporter getGMNativeCustomVideoReporter() {
        IMediationCustomizeVideo iMediationCustomizeVideo = (IMediationCustomizeVideo) this.a.call(8164, null, IMediationCustomizeVideo.class);
        if (iMediationCustomizeVideo != null) {
            return new a(this, iMediationCustomizeVideo);
        }
        return null;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public String getReqId() {
        Bridge bridge = this.a;
        return bridge != null ? (String) bridge.call(8147, null, String.class) : super.getReqId();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public int getVideoHeight() {
        Bridge bridge = this.a;
        return bridge != null ? ((Integer) bridge.call(8162, null, Integer.class)).intValue() : super.getVideoWidth();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public String getVideoUrl() {
        Bridge bridge = this.a;
        return bridge != null ? (String) bridge.call(8163, null, String.class) : super.getVideoUrl();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public int getVideoWidth() {
        Bridge bridge = this.a;
        return bridge != null ? ((Integer) bridge.call(8161, null, Integer.class)).intValue() : super.getVideoWidth();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public boolean hasDislike() {
        Bridge bridge = this.a;
        return bridge != null ? ((Boolean) bridge.call(8135, null, Boolean.class)).booleanValue() : super.hasDislike();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMAdConstant.AdIsReadyStatus isReadyStatus() {
        Bridge bridge = this.a;
        if (bridge != null && bridge.values() != null && this.a.values().keys() != null && this.a.values().keys().contains(8121)) {
            int i = b.a[((MediationConstant.AdIsReadyStatus) this.a.call(8121, null, MediationConstant.AdIsReadyStatus.class)).ordinal()];
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
    public void pauseAppDownload() {
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(8191, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void registerViewForInteraction(Activity activity, ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, GMViewBinder gMViewBinder) {
        super.registerViewForInteraction(activity, viewGroup, list, list2, list3, gMViewBinder);
        a(activity, viewGroup, list, list2, list3, gMViewBinder);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void registerViewForInteraction(ViewGroup viewGroup, List<View> list, List<View> list2, GMViewBinder gMViewBinder) {
        super.registerViewForInteraction(viewGroup, list, list2, gMViewBinder);
        a(null, viewGroup, list, list2, null, gMViewBinder);
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void render() {
        super.render();
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(6083, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void resumeAppDownload() {
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(8192, null, Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void setDislikeCallback(Activity activity, GMDislikeCallback gMDislikeCallback) {
        this.c = gMDislikeCallback;
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20033, activity);
            this.a.call(6085, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void unregisterView() {
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(o.a.s, null, Void.class);
        }
    }
}
