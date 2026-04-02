package com.vungle.warren;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.Placement;
import com.vungle.warren.persistence.FutureResult;
import com.vungle.warren.persistence.Repository;
import com.vungle.warren.utility.Executors;
import com.vungle.warren.utility.TimeoutProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class Banners {
    private static final String TAG = Banners.class.getSimpleName();

    public static boolean canPlayAd(String str, AdConfig.AdSize adSize) {
        return canPlayAd(str, null, adSize);
    }

    public static boolean canPlayAd(final String str, final String str2, final AdConfig.AdSize adSize) {
        if (!AdConfig.AdSize.isBannerAdSize(adSize)) {
            Log.e(TAG, "Invalid Ad Size. Cannot check loaded status of non banner size placements.");
            return false;
        }
        final Context appContext = Vungle.appContext();
        if (appContext == null) {
            Log.e(TAG, "Context is null");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            Log.e(TAG, "PlacementId is null");
            return false;
        } else {
            ServiceLocator serviceLocator = ServiceLocator.getInstance(appContext);
            return Boolean.TRUE.equals(new FutureResult(((Executors) serviceLocator.getService(Executors.class)).getApiExecutor().submit(new Callable<Boolean>() { // from class: com.vungle.warren.Banners.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public Boolean call() {
                    Advertisement advertisement;
                    AdConfig.AdSize adSize2;
                    boolean z = false;
                    if (!Vungle.isInitialized()) {
                        Log.e(Banners.TAG, "Vungle is not initialized");
                        return false;
                    }
                    Repository repository = (Repository) ServiceLocator.getInstance(appContext).getService(Repository.class);
                    AdRequest adRequest = new AdRequest(str, AdMarkup.fromString(str2));
                    Placement placement = (Placement) repository.load(str, Placement.class).get();
                    if (placement == null) {
                        return false;
                    }
                    if ((placement.isMultipleHBPEnabled() && adRequest.getEventId() == null) || (advertisement = repository.findValidAdvertisementForPlacement(str, adRequest.getEventId()).get()) == null) {
                        return false;
                    }
                    AdConfig.AdSize adSize3 = placement.getAdSize();
                    AdConfig.AdSize adSize4 = advertisement.getAdConfig().getAdSize();
                    boolean z2 = true;
                    if (adSize == AdConfig.AdSize.VUNGLE_MREC && AdConfig.AdSize.isDefaultAdSize(adSize3) && AdConfig.AdSize.isDefaultAdSize(adSize4) && placement.getPlacementAdType() == 3) {
                        z = true;
                    }
                    if (!placement.isMultipleHBPEnabled() || !AdConfig.AdSize.isNonMrecBannerAdSize(adSize3) || !AdConfig.AdSize.isNonMrecBannerAdSize(adSize4)) {
                        z2 = z;
                    }
                    if (!z2 && ((adSize2 = adSize) != adSize3 || adSize2 != adSize4)) {
                        return false;
                    }
                    return Boolean.valueOf(Vungle.canPlayAd(advertisement));
                }
            })).get(((TimeoutProvider) serviceLocator.getService(TimeoutProvider.class)).getTimeout(), TimeUnit.MILLISECONDS));
        }
    }

    @Deprecated
    public static VungleBanner getBanner(String str, AdConfig.AdSize adSize, PlayAdCallback playAdCallback) {
        return getBanner(str, new BannerAdConfig(adSize), playAdCallback);
    }

    public static VungleBanner getBanner(String str, BannerAdConfig bannerAdConfig, PlayAdCallback playAdCallback) {
        return getBanner(str, null, bannerAdConfig, playAdCallback);
    }

    public static VungleBanner getBanner(final String str, final String str2, BannerAdConfig bannerAdConfig, PlayAdCallback playAdCallback) {
        VungleLogger.debug("VungleBanner#getBanner", "getBanner call invoked");
        Context appContext = Vungle.appContext();
        if (appContext == null) {
            Log.e(TAG, "Vungle is not initialized, returned VungleNativeAd = null");
            onPlaybackError(str, playAdCallback, 9);
            return null;
        }
        final AdConfig.AdSize adSize = bannerAdConfig.getAdSize();
        final ServiceLocator serviceLocator = ServiceLocator.getInstance(appContext);
        Executors executors = (Executors) serviceLocator.getService(Executors.class);
        TimeoutProvider timeoutProvider = (TimeoutProvider) serviceLocator.getService(TimeoutProvider.class);
        VungleSettings vungleSettings = ((RuntimeValues) ServiceLocator.getInstance(appContext).getService(RuntimeValues.class)).settings.get();
        final PlayAdCallbackWrapper playAdCallbackWrapper = new PlayAdCallbackWrapper(executors.getUIExecutor(), playAdCallback);
        Pair pair = (Pair) new FutureResult(executors.getBackgroundExecutor().submit(new Callable<Pair<Boolean, Placement>>() { // from class: com.vungle.warren.Banners.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Pair<Boolean, Placement> call() throws Exception {
                if (!Vungle.isInitialized()) {
                    Log.e(Banners.TAG, "Vungle is not initialized.");
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 9);
                    return new Pair<>(false, null);
                } else if (TextUtils.isEmpty(str)) {
                    Banners.onPlaybackError(str, playAdCallbackWrapper, 13);
                    return new Pair<>(false, null);
                } else {
                    Placement placement = (Placement) ((Repository) serviceLocator.getService(Repository.class)).load(str, Placement.class).get();
                    if (placement == null) {
                        Banners.onPlaybackError(str, playAdCallbackWrapper, 13);
                        return new Pair<>(false, null);
                    } else if (!AdConfig.AdSize.isBannerAdSize(adSize)) {
                        Banners.onPlaybackError(str, playAdCallbackWrapper, 30);
                        return new Pair<>(false, placement);
                    } else if (!Banners.canPlayAd(str, str2, adSize)) {
                        Banners.onPlaybackError(str, playAdCallbackWrapper, 10);
                        return new Pair<>(false, placement);
                    } else {
                        return new Pair<>(true, placement);
                    }
                }
            }
        })).get(timeoutProvider.getTimeout(), TimeUnit.MILLISECONDS);
        if (pair == null) {
            onPlaybackError(str, playAdCallback, 13);
            return null;
        } else if (((Boolean) pair.first).booleanValue()) {
            return new VungleBanner(appContext, str, AdMarkup.fromString(str2), (vungleSettings == null || !vungleSettings.getBannerRefreshDisabled()) ? adSize != AdConfig.AdSize.VUNGLE_MREC ? ((Placement) pair.second).getAdRefreshDuration() : 0 : 0, bannerAdConfig, playAdCallback);
        } else {
            return null;
        }
    }

    public static void loadBanner(String str, BannerAdConfig bannerAdConfig, LoadAdCallback loadAdCallback) {
        loadBanner(str, null, bannerAdConfig, loadAdCallback);
    }

    @Deprecated
    public static void loadBanner(String str, AdConfig.AdSize adSize, LoadAdCallback loadAdCallback) {
        if (adSize == null) {
            onLoadError(str, loadAdCallback, 28);
        } else {
            loadBanner(str, new BannerAdConfig(adSize), loadAdCallback);
        }
    }

    public static void loadBanner(String str, String str2, BannerAdConfig bannerAdConfig, LoadAdCallback loadAdCallback) {
        VungleLogger.debug("Banners#loadBanner", "loadBanner API call invoked");
        if (Vungle.appContext() == null || !Vungle.isInitialized()) {
            onLoadError(str, loadAdCallback, 9);
            return;
        }
        AdConfig adConfig = new AdConfig(bannerAdConfig);
        if (!AdConfig.AdSize.isBannerAdSize(adConfig.getAdSize())) {
            onLoadError(str, loadAdCallback, 30);
        } else {
            Vungle.loadAdInternal(str, AdMarkup.fromString(str2), adConfig, loadAdCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onPlaybackError(String str, PlayAdCallback playAdCallback, int i) {
        VungleException vungleException = new VungleException(i);
        if (playAdCallback != null) {
            playAdCallback.onError(str, vungleException);
        }
        VungleLogger.error("Banners#onPlaybackError", "Banner play error: " + vungleException.getLocalizedMessage());
    }

    private static void onLoadError(String str, LoadAdCallback loadAdCallback, int i) {
        VungleException vungleException = new VungleException(i);
        if (loadAdCallback != null) {
            loadAdCallback.onError(str, vungleException);
        }
        VungleLogger.error("Banners#onLoadError", "Banner load error: " + vungleException.getLocalizedMessage());
    }
}
