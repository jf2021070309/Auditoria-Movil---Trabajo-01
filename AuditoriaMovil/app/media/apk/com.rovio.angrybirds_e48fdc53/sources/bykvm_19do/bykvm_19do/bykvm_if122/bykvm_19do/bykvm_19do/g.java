package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.ViewGroup;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.msdk.adapter.TTAbsAdLoaderAdapter;
import com.bytedance.msdk.adapter.listener.ITTAdapterSplashAdListener;
import com.bytedance.msdk.adapter.listener.ITTAdatperCallback;
import com.bytedance.msdk.api.AdError;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.msdk.api.v2.ad.splash.GMSplashAdListener;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
/* loaded from: classes.dex */
public class g extends b {
    private ITTAdatperCallback c;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
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

    public g(TTAbsAdLoaderAdapter tTAbsAdLoaderAdapter) {
        super(tTAbsAdLoaderAdapter);
    }

    private ITTAdapterSplashAdListener b() {
        return (ITTAdapterSplashAdListener) this.mTTAdatperCallback;
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_19do.b
    public <T> T a(int i, ValueSet valueSet, Class<T> cls) {
        GMSplashAdListener b;
        GMSplashAdListener b2;
        GMSplashAdListener b3;
        String str;
        GMSplashAdListener b4;
        if (i == 8143) {
            return (T) Double.valueOf(getCpm());
        }
        int i2 = 0;
        if (i == 1009) {
            if (valueSet != null ? valueSet.booleanValue(20040, false) : false) {
                ITTAdatperCallback iTTAdatperCallback = this.c;
                if (iTTAdatperCallback instanceof GMSplashAdListener) {
                    b4 = (GMSplashAdListener) iTTAdatperCallback;
                    b4.onAdClicked();
                }
            } else if (b() != null) {
                b4 = b();
                b4.onAdClicked();
            }
        } else if (i == 1017) {
            if (b() != null) {
                if (valueSet != null) {
                    i2 = valueSet.intValue(8014, 0);
                    str = valueSet.stringValue(8015);
                } else {
                    str = "";
                }
                b().onAdShowFail(new AdError(i2, str));
            }
        } else if (i == 1011) {
            if (valueSet != null ? valueSet.booleanValue(20040, false) : false) {
                ITTAdatperCallback iTTAdatperCallback2 = this.c;
                if (iTTAdatperCallback2 instanceof GMSplashAdListener) {
                    b3 = (GMSplashAdListener) iTTAdatperCallback2;
                    b3.onAdDismiss();
                }
            } else if (b() != null) {
                b3 = b();
                b3.onAdDismiss();
            }
        } else if (i == 1008) {
            if (valueSet != null ? valueSet.booleanValue(20040, false) : false) {
                ITTAdatperCallback iTTAdatperCallback3 = this.c;
                if (iTTAdatperCallback3 instanceof GMSplashAdListener) {
                    b2 = (GMSplashAdListener) iTTAdatperCallback3;
                    b2.onAdShow();
                }
            } else if (b() != null) {
                b2 = b();
                b2.onAdShow();
            }
        } else if (i == 1019) {
            if (valueSet != null ? valueSet.booleanValue(20040, false) : false) {
                ITTAdatperCallback iTTAdatperCallback4 = this.c;
                if (iTTAdatperCallback4 instanceof GMSplashAdListener) {
                    b = (GMSplashAdListener) iTTAdatperCallback4;
                    b.onAdSkip();
                }
            } else if (b() != null) {
                b = b();
                b.onAdSkip();
            }
        } else if (i == 1074) {
            if (b() != null) {
                return (T) b().getActivity();
            }
        } else if (i == 1073) {
            if (b() != null && valueSet != null) {
                b().setSupportSplashClickEye(valueSet.booleanValue(8428));
            }
        } else if (i == 1072) {
            if (b() != null) {
                b().onSplashClickEyeClose();
            }
        } else if (i == 1071) {
            if (b() != null) {
                b().onSplashEyeReady();
            }
        } else if (i == 6159) {
            if (b() != null) {
                b().onSplashClickEyeClick();
            }
        } else if (i == 1051) {
            if (b() != null) {
                b().onMinWindowStart();
            }
        } else if (i == 1052) {
            if (b() != null) {
                b().onMinWindowPlayFinish();
            }
        } else if (i == 6156) {
            if (b() != null) {
                b().onSplashCardClick();
            }
        } else if (i == 8111) {
            setCpm(valueSet.doubleValue(8016));
        }
        return null;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public String getReqId() {
        Bridge bridge = this.a;
        return bridge != null ? (String) bridge.call(8147, null, String.class) : super.getReqId();
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public Bitmap getSplashBitMap() {
        Bridge bridge = this.a;
        if (bridge != null) {
            return (Bitmap) bridge.call(6163, null, Bitmap.class);
        }
        return null;
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public GMAdConstant.AdIsReadyStatus isReadyStatus() {
        Bridge bridge = this.a;
        if (bridge != null) {
            int i = a.a[((MediationConstant.AdIsReadyStatus) bridge.call(8121, null, MediationConstant.AdIsReadyStatus.class)).ordinal()];
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
    public void showMinWindow(Rect rect, ITTAdatperCallback iTTAdatperCallback) {
        super.showMinWindow(rect, iTTAdatperCallback);
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20067, rect);
            this.a.call(6161, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showSplashAd(ViewGroup viewGroup) {
        super.showSplashAd(viewGroup);
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20060, viewGroup);
            this.a.call(6152, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showSplashCardView(ViewGroup viewGroup, Activity activity) {
        super.showSplashCardView(viewGroup, activity);
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20060, viewGroup);
            create.add(20033, activity);
            this.a.call(6154, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void showSplashClickEyeView(ViewGroup viewGroup) {
        super.showSplashClickEyeView(viewGroup);
        if (this.a != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(20060, viewGroup);
            this.a.call(6153, create.build(), Void.class);
        }
    }

    @Override // com.bytedance.msdk.base.TTBaseAd
    public void splashMinWindowAnimationFinish() {
        super.splashMinWindowAnimationFinish();
        Bridge bridge = this.a;
        if (bridge != null) {
            bridge.call(6162, null, Void.class);
        }
    }
}
