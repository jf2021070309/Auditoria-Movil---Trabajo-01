package com.vungle.warren.ui.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdRequest;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.VungleNativeAd;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ExternalRouter;
import com.vungle.warren.utility.HandlerScheduler;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class VungleNativeView extends WebView implements WebAdContract.WebAdView, VungleNativeAd {
    private static final String TAG = VungleNativeView.class.getName();
    private BroadcastReceiver broadcastReceiver;
    private final AdConfig config;
    private boolean destroyed;
    private AtomicReference<Boolean> isAdVisible;
    private final AdContract.AdvertisementPresenter.EventListener listener;
    private WebAdContract.WebAdPresenter presenter;
    PresentationFactory presenterFactory;
    private final AdRequest request;

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public boolean hasWebView() {
        return true;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void refreshDialogIfVisible() {
    }

    @Override // com.vungle.warren.VungleNativeAd
    public View renderNativeView() {
        return this;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setImmersiveMode() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setOrientation(int i) {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(WebAdContract.WebAdPresenter webAdPresenter) {
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void updateWindow() {
    }

    @Override // android.webkit.WebView
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Resuming Flex");
        setAdVisibility(true);
    }

    @Override // android.webkit.WebView
    public void onPause() {
        super.onPause();
        setAdVisibility(false);
    }

    public VungleNativeView(Context context, AdRequest adRequest, AdConfig adConfig, PresentationFactory presentationFactory, AdContract.AdvertisementPresenter.EventListener eventListener) {
        super(context);
        this.isAdVisible = new AtomicReference<>();
        this.listener = eventListener;
        this.request = adRequest;
        this.config = adConfig;
        this.presenterFactory = presentationFactory;
        setLayerType(2, null);
        setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepare() {
        WebSettingsUtils.applyDefault(this);
        addJavascriptInterface(new JavascriptBridge(this.presenter), "Android");
        getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    @Override // com.vungle.warren.VungleNativeAd
    public void finishDisplayingAd() {
        finishDisplayingAdInternal(true);
    }

    public void finishDisplayingAdInternal(boolean z) {
        if (this.presenter != null) {
            this.presenter.detach((z ? 4 : 0) | 2);
        } else {
            PresentationFactory presentationFactory = this.presenterFactory;
            if (presentationFactory != null) {
                presentationFactory.destroy();
                this.presenterFactory = null;
                this.listener.onError(new VungleException(25), this.request.getPlacementId());
            }
        }
        destroyAdView(0L);
    }

    @Override // com.vungle.warren.VungleNativeAd
    public void setAdVisibility(boolean z) {
        WebAdContract.WebAdPresenter webAdPresenter = this.presenter;
        if (webAdPresenter != null) {
            webAdPresenter.setAdVisibility(z);
        } else {
            this.isAdVisible.set(Boolean.valueOf(z));
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        loadUrl(str);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public String getWebsiteUrl() {
        return getUrl();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
        WebAdContract.WebAdPresenter webAdPresenter = this.presenter;
        if (webAdPresenter != null) {
            if (webAdPresenter.handleExit()) {
                finishDisplayingAdInternal(false);
                return;
            }
            return;
        }
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null) {
            presentationFactory.destroy();
            this.presenterFactory = null;
            this.listener.onError(new VungleException(25), this.request.getPlacementId());
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void destroyAdView(long j) {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        this.presenter = null;
        this.presenterFactory = null;
        removeJavascriptInterface("Android");
        setWebChromeClient(null);
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.ui.view.VungleNativeView.1
            @Override // java.lang.Runnable
            public void run() {
                VungleNativeView.this.stopLoading();
                VungleNativeView.this.setWebViewClient(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    VungleNativeView.this.setWebViewRenderProcessClient(null);
                }
                VungleNativeView.this.loadUrl("about:blank");
            }
        };
        if (j <= 0) {
            runnable.run();
        } else {
            new HandlerScheduler().schedule(runnable, j);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showCloseButton() {
        throw new UnsupportedOperationException("VungleNativeView does not implement a close button");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void open(String str, ActivityManager.LeftApplicationCallback leftApplicationCallback) {
        String str2 = TAG;
        Log.d(str2, "Opening " + str);
        if (ExternalRouter.launch(str, getContext(), leftApplicationCallback)) {
            return;
        }
        String str3 = TAG;
        Log.e(str3, "Cannot open url " + str);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("VungleNativeView does not implement a dialog.");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void resumeWeb() {
        onResume();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void pauseWeb() {
        onPause();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void removeWebView() {
        ViewParent parent = getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(this);
        }
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void setVisibility(boolean z) {
        setVisibility(z ? 0 : 4);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null && this.presenter == null) {
            presentationFactory.getNativeViewPresentation(this.request, this.config, new CloseDelegate() { // from class: com.vungle.warren.ui.view.VungleNativeView.2
                @Override // com.vungle.warren.ui.CloseDelegate
                public void close() {
                    VungleNativeView.this.finishDisplayingAdInternal(false);
                }
            }, new PresentationFactory.ViewCallback() { // from class: com.vungle.warren.ui.view.VungleNativeView.3
                @Override // com.vungle.warren.PresentationFactory.ViewCallback
                public void onResult(Pair<WebAdContract.WebAdPresenter, VungleWebClient> pair, VungleException vungleException) {
                    VungleNativeView.this.presenterFactory = null;
                    if (vungleException != null) {
                        if (VungleNativeView.this.listener != null) {
                            VungleNativeView.this.listener.onError(vungleException, VungleNativeView.this.request.getPlacementId());
                            return;
                        }
                        return;
                    }
                    VungleNativeView.this.presenter = (WebAdContract.WebAdPresenter) pair.first;
                    VungleNativeView.this.setWebViewClient((VungleWebClient) pair.second);
                    VungleNativeView.this.presenter.setEventListener(VungleNativeView.this.listener);
                    VungleNativeView.this.presenter.attach(VungleNativeView.this, null);
                    VungleNativeView.this.prepare();
                    if (VungleNativeView.this.isAdVisible.get() != null) {
                        VungleNativeView vungleNativeView = VungleNativeView.this;
                        vungleNativeView.setAdVisibility(((Boolean) vungleNativeView.isAdVisible.get()).booleanValue());
                    }
                    ViewGroup.LayoutParams layoutParams = VungleNativeView.this.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = -1;
                        layoutParams.width = -1;
                    }
                }
            });
        }
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.vungle.warren.ui.view.VungleNativeView.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra(AdContract.AdvertisementBus.COMMAND);
                if (AdContract.AdvertisementBus.STOP_ALL.equalsIgnoreCase(stringExtra)) {
                    VungleNativeView.this.finishDisplayingAdInternal(false);
                    return;
                }
                VungleLogger.warn(VungleNativeView.class.getSimpleName() + "#onAttachedToWindow", String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
            }
        };
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.broadcastReceiver, new IntentFilter(AdContract.AdvertisementBus.ACTION));
        resumeWeb();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        setAdVisibility(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.broadcastReceiver);
        super.onDetachedFromWindow();
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null) {
            presentationFactory.destroy();
        }
        pauseWeb();
    }
}
