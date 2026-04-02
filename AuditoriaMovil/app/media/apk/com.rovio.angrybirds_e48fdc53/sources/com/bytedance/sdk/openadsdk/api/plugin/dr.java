package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CSJAdError;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.common.CommonListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.facebook.internal.NativeProtocol;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class dr implements TTAdManager {
    static final dr dr = new dr();
    private volatile TTAdManager ge;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.api.plugin.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0098dr<T> {
        void dr(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface ge<T> {
        void dr(InterfaceC0098dr<T> interfaceC0098dr);
    }

    /* loaded from: classes.dex */
    private interface o<T> extends InterfaceC0098dr<T> {
        void dr();
    }

    dr() {
    }

    public void dr(TTAdManager tTAdManager) {
        this.ge = tTAdManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.api.plugin.dr$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements ge<TTAdNative> {
        TTAdNative dr;
        final /* synthetic */ WeakReference ge;

        AnonymousClass1(WeakReference weakReference) {
            this.ge = weakReference;
        }

        @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.ge
        public void dr(final InterfaceC0098dr<TTAdNative> interfaceC0098dr) {
            TTAdNative tTAdNative = this.dr;
            if (tTAdNative == null) {
                dr.this.call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                    public void dr(TTAdManager tTAdManager) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.dr = tTAdManager.createAdNative((Context) anonymousClass1.ge.get());
                        interfaceC0098dr.dr(AnonymousClass1.this.dr);
                    }
                });
            } else {
                interfaceC0098dr.dr(tTAdNative);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public TTAdNative createAdNative(Context context) {
        return new g(new AnonymousClass1(new WeakReference(context)));
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void register(final Object obj) {
        final Bundle bundle;
        if (obj instanceof TTPluginListener) {
            TTPluginListener tTPluginListener = (TTPluginListener) obj;
            bundle = bn.dr(TTAppContextHolder.getContext()).dr(tTPluginListener.packageName(), tTPluginListener.config());
        } else {
            bundle = obj;
        }
        call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.2
            @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
            public void dr(TTAdManager tTAdManager) {
                tTAdManager.register(bundle);
                if (obj instanceof TTPluginListener) {
                    bn.dr(TTAppContextHolder.getContext()).dr((TTPluginListener) obj);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void unregister(final Object obj) {
        call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.3
            @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
            public void dr(TTAdManager tTAdManager) {
                tTAdManager.unregister(obj);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public <T> T getExtra(final Class<T> cls, final Bundle bundle) {
        if (this.ge != null) {
            return (T) this.ge.getExtra(cls, bundle);
        }
        if (cls == Bundle.class && bundle != null && bundle.getInt(NativeProtocol.WEB_DIALOG_ACTION, 0) == 1) {
            call(new o<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.4
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.o
                public void dr() {
                    com.bytedance.sdk.openadsdk.api.plugin.g.dr(bundle);
                }

                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdManager tTAdManager) {
                    tTAdManager.getExtra(cls, bundle);
                }
            });
            return null;
        }
        call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.5
            @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
            public void dr(TTAdManager tTAdManager) {
                tTAdManager.getExtra(cls, bundle);
            }
        });
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void requestPermissionIfNecessary(final Context context) {
        call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.6
            @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
            public void dr(TTAdManager tTAdManager) {
                tTAdManager.requestPermissionIfNecessary(context);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public boolean tryShowInstallDialogWhenExit(Activity activity, ExitInstallListener exitInstallListener) {
        return this.ge != null && this.ge.tryShowInstallDialogWhenExit(activity, exitInstallListener);
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getSDKVersion() {
        return "5.3.0.5";
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getPluginVersion() {
        return this.ge != null ? this.ge.getPluginVersion() : "";
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getBiddingToken(AdSlot adSlot) {
        if (this.ge != null) {
            return this.ge.getBiddingToken(adSlot);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public String getBiddingToken(AdSlot adSlot, boolean z, int i) {
        if (this.ge != null) {
            return this.ge.getBiddingToken(adSlot, z, i);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public void setThemeStatus(final int i) {
        call(new InterfaceC0098dr<TTAdManager>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.7
            @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
            public void dr(TTAdManager tTAdManager) {
                dr.this.ge.setThemeStatus(i);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTAdManager
    public int getThemeStatus() {
        if (this.ge != null) {
            return this.ge.getThemeStatus();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void call(final InterfaceC0098dr<TTAdManager> interfaceC0098dr) {
        if (this.ge != null) {
            try {
                interfaceC0098dr.dr(this.ge);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.api.ge.g("PluginDefaultAdManager", "Unexpected manager call error: " + th.getMessage());
                bn.dr(th);
            }
        } else if (rb.dr != null) {
            rb.dr.submit(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (dr.this.ge != null) {
                            interfaceC0098dr.dr(dr.this.ge);
                            return;
                        }
                        InterfaceC0098dr interfaceC0098dr2 = interfaceC0098dr;
                        if (interfaceC0098dr2 instanceof o) {
                            ((o) interfaceC0098dr2).dr();
                        }
                        com.bytedance.sdk.openadsdk.api.ge.g("PluginDefaultAdManager", "Not ready, no manager");
                    } catch (Throwable th2) {
                        com.bytedance.sdk.openadsdk.api.ge.g("PluginDefaultAdManager", "Unexpected manager call error: " + th2.getMessage());
                        bn.dr(th2);
                    }
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.api.ge.g("PluginDefaultAdManager", "Not ready, no executor");
        }
    }

    /* loaded from: classes.dex */
    private static final class g implements TTAdNative {
        private ge<TTAdNative> dr;

        public g(ge<TTAdNative> geVar) {
            this.dr = geVar;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFeedAd(final AdSlot adSlot, final TTAdNative.FeedAdListener feedAdListener) {
            dr(feedAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.1
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadFeedAd(adSlot, feedAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadStream(final AdSlot adSlot, final TTAdNative.FeedAdListener feedAdListener) {
            dr(feedAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.5
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadStream(adSlot, feedAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadDrawFeedAd(final AdSlot adSlot, final TTAdNative.DrawFeedAdListener drawFeedAdListener) {
            dr(drawFeedAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.6
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadDrawFeedAd(adSlot, drawFeedAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeAd(final AdSlot adSlot, final TTAdNative.NativeAdListener nativeAdListener) {
            dr(nativeAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.7
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadNativeAd(adSlot, nativeAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(final AdSlot adSlot, final TTAdNative.SplashAdListener splashAdListener, final int i) {
            dr(splashAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.8
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadSplashAd(adSlot, splashAdListener, i);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(final AdSlot adSlot, final TTAdNative.CSJSplashAdListener cSJSplashAdListener, final int i) {
            dr(cSJSplashAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.9
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadSplashAd(adSlot, cSJSplashAdListener, i);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadSplashAd(final AdSlot adSlot, final TTAdNative.SplashAdListener splashAdListener) {
            dr(splashAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.10
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadSplashAd(adSlot, splashAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadRewardVideoAd(final AdSlot adSlot, final TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
            dr(rewardVideoAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.11
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadRewardVideoAd(adSlot, rewardVideoAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadFullScreenVideoAd(final AdSlot adSlot, final TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
            dr(fullScreenVideoAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.12
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadFullScreenVideoAd(adSlot, fullScreenVideoAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadNativeExpressAd(final AdSlot adSlot, final TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            dr(nativeExpressAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.2
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadNativeExpressAd(adSlot, nativeExpressAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadExpressDrawFeedAd(final AdSlot adSlot, final TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            dr(nativeExpressAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.3
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadExpressDrawFeedAd(adSlot, nativeExpressAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadBannerExpressAd(final AdSlot adSlot, final TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
            dr(nativeExpressAdListener, new InterfaceC0098dr<TTAdNative>() { // from class: com.bytedance.sdk.openadsdk.api.plugin.dr.g.4
                @Override // com.bytedance.sdk.openadsdk.api.plugin.dr.InterfaceC0098dr
                public void dr(TTAdNative tTAdNative) {
                    tTAdNative.loadBannerExpressAd(adSlot, nativeExpressAdListener);
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdNative
        public void loadInteractionExpressAd(AdSlot adSlot, TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        }

        private final void dr(CommonListener commonListener, InterfaceC0098dr<TTAdNative> interfaceC0098dr) {
            try {
                this.dr.dr(interfaceC0098dr);
            } catch (Throwable th) {
                if (commonListener != null) {
                    commonListener.onError(4202, "Load ad failed: " + th.getMessage());
                }
            }
        }

        private final void dr(TTAdNative.CSJSplashAdListener cSJSplashAdListener, InterfaceC0098dr<TTAdNative> interfaceC0098dr) {
            try {
                this.dr.dr(interfaceC0098dr);
            } catch (Throwable th) {
                if (cSJSplashAdListener != null) {
                    cSJSplashAdListener.onSplashLoadFail(new CSJAdError(4202, "Load ad failed: " + th.getMessage()));
                }
            }
        }
    }
}
