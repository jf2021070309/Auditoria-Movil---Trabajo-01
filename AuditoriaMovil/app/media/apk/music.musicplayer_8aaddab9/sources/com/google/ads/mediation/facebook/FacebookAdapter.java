package com.google.ads.mediation.facebook;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookInitializer;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
@Keep
/* loaded from: classes.dex */
public final class FacebookAdapter extends FacebookMediationAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    public static final String KEY_ID = "id";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    private static final int MAX_STAR_RATING = 5;
    private boolean isNativeBanner;
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private InterstitialAd mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsImpressionRecorded;
    private MediaView mMediaView;
    private NativeAd mNativeAd;
    private NativeBannerAd mNativeBannerAd;
    private MediationNativeListener mNativeListener;
    private FrameLayout mWrappedAdView;
    private AtomicBoolean showInterstitialCalled = new AtomicBoolean();
    private AtomicBoolean didInterstitialAdClose = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class BannerListener implements AdListener {
        private BannerListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            MediationBannerListener unused = FacebookAdapter.this.mBannerListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            FacebookAdapter.this.mBannerListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mBannerListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            MediationBannerListener unused = FacebookAdapter.this.mBannerListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }

    /* loaded from: classes.dex */
    public class FacebookAdapterNativeAdImage extends NativeAd.Image {
        private Drawable mDrawable;
        private Uri mUri;

        public FacebookAdapterNativeAdImage(FacebookAdapter facebookAdapter) {
        }

        public FacebookAdapterNativeAdImage(FacebookAdapter facebookAdapter, Drawable drawable) {
            this.mDrawable = drawable;
        }

        public FacebookAdapterNativeAdImage(FacebookAdapter facebookAdapter, Uri uri) {
            this.mUri = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.mDrawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.mUri;
        }

        public void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
        }
    }

    /* loaded from: classes.dex */
    public class InterstitialListener implements InterstitialAdExtendedListener {
        private InterstitialListener() {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            MediationInterstitialListener unused = FacebookAdapter.this.mInterstitialListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            FacebookAdapter.this.mInterstitialListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            MediationInterstitialListener unused = FacebookAdapter.this.mInterstitialListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            Log.w(FacebookMediationAdapter.TAG, FacebookMediationAdapter.getAdError(adError).getMessage());
            if (!FacebookAdapter.this.showInterstitialCalled.get()) {
                FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdExtendedListener
        public void onInterstitialActivityDestroyed() {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDismissed(Ad ad) {
            if (FacebookAdapter.this.didInterstitialAdClose.getAndSet(true)) {
                return;
            }
            FacebookAdapter.this.mInterstitialListener.onAdClosed(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.InterstitialAdListener
        public void onInterstitialDisplayed(Ad ad) {
            FacebookAdapter.this.mInterstitialListener.onAdOpened(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdCompleted() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerFailed() {
        }

        @Override // com.facebook.ads.RewardedAdListener
        public void onRewardedAdServerSucceeded() {
        }
    }

    /* loaded from: classes.dex */
    public interface NativeAdMapperListener {
        void onMappingFailed(com.google.android.gms.ads.AdError adError);

        void onMappingSuccess();
    }

    /* loaded from: classes.dex */
    public class NativeBannerListener implements AdListener, NativeAdListener {
        private WeakReference<Context> mContext;
        private NativeBannerAd mNativeBannerAd;

        private NativeBannerListener(Context context, NativeBannerAd nativeBannerAd) {
            this.mContext = new WeakReference<>(context);
            this.mNativeBannerAd = nativeBannerAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            MediationNativeListener unused = FacebookAdapter.this.mNativeListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.mNativeBannerAd) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new com.google.android.gms.ads.AdError(106, "Ad loaded is not a native banner ad.", "com.google.ads.mediation.facebook"));
                return;
            }
            Context context = this.mContext.get();
            if (context == null) {
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, new com.google.android.gms.ads.AdError(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Failed to create ad options view. Context is null.", "com.google.ads.mediation.facebook"));
                return;
            }
            final UnifiedAdMapper unifiedAdMapper = new UnifiedAdMapper(this.mNativeBannerAd);
            unifiedAdMapper.mapUnifiedNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.NativeBannerListener.1
                @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                public void onMappingFailed(com.google.android.gms.ads.AdError adError) {
                    Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                    FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                }

                @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                public void onMappingSuccess() {
                    MediationNativeListener unused = FacebookAdapter.this.mNativeListener;
                    FacebookAdapter facebookAdapter = FacebookAdapter.this;
                    UnifiedAdMapper unifiedAdMapper2 = unifiedAdMapper;
                }
            });
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (FacebookAdapter.this.mIsImpressionRecorded) {
                String str = FacebookMediationAdapter.TAG;
                return;
            }
            FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
            FacebookAdapter.this.mIsImpressionRecorded = true;
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }
    }

    /* loaded from: classes.dex */
    public class NativeListener implements AdListener, NativeAdListener {
        private WeakReference<Context> mContext;
        private com.facebook.ads.NativeAd mNativeAd;

        private NativeListener(Context context, com.facebook.ads.NativeAd nativeAd) {
            this.mContext = new WeakReference<>(context);
            this.mNativeAd = nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            MediationNativeListener unused = FacebookAdapter.this.mNativeListener;
            FacebookAdapter facebookAdapter = FacebookAdapter.this;
            FacebookAdapter.this.mNativeListener.onAdOpened(FacebookAdapter.this);
            FacebookAdapter.this.mNativeListener.onAdLeftApplication(FacebookAdapter.this);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.mNativeAd) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, "Ad loaded is not a native ad.", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                return;
            }
            Context context = this.mContext.get();
            if (context != null) {
                final UnifiedAdMapper unifiedAdMapper = new UnifiedAdMapper(this.mNativeAd);
                unifiedAdMapper.mapUnifiedNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.NativeListener.1
                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingFailed(com.google.android.gms.ads.AdError adError2) {
                        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
                    }

                    @Override // com.google.ads.mediation.facebook.FacebookAdapter.NativeAdMapperListener
                    public void onMappingSuccess() {
                        MediationNativeListener unused = FacebookAdapter.this.mNativeListener;
                        FacebookAdapter facebookAdapter = FacebookAdapter.this;
                        UnifiedAdMapper unifiedAdMapper2 = unifiedAdMapper;
                    }
                });
                return;
            }
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Failed to create ad options view. Context is null", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            if (!TextUtils.isEmpty(adError.getErrorMessage())) {
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            }
            FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError.getErrorCode());
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
            if (FacebookAdapter.this.mIsImpressionRecorded) {
                String str = FacebookMediationAdapter.TAG;
                return;
            }
            FacebookAdapter.this.mNativeListener.onAdImpression(FacebookAdapter.this);
            FacebookAdapter.this.mIsImpressionRecorded = true;
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }
    }

    /* loaded from: classes.dex */
    public class UnifiedAdMapper extends UnifiedNativeAdMapper {
        private com.facebook.ads.NativeAd mNativeAd;
        private NativeBannerAd mNativeBannerAd;

        public UnifiedAdMapper(com.facebook.ads.NativeAd nativeAd) {
            this.mNativeAd = nativeAd;
        }

        public UnifiedAdMapper(NativeBannerAd nativeBannerAd) {
            this.mNativeBannerAd = nativeBannerAd;
        }

        private boolean containsRequiredFieldsForNativeBannerAd(NativeBannerAd nativeBannerAd) {
            return (nativeBannerAd.getAdHeadline() == null || nativeBannerAd.getAdBodyText() == null || nativeBannerAd.getAdIcon() == null || nativeBannerAd.getAdCallToAction() == null) ? false : true;
        }

        private boolean containsRequiredFieldsForUnifiedNativeAd(com.facebook.ads.NativeAd nativeAd) {
            return (nativeAd.getAdHeadline() == null || nativeAd.getAdCoverImage() == null || nativeAd.getAdBodyText() == null || nativeAd.getAdIcon() == null || nativeAd.getAdCallToAction() == null || FacebookAdapter.this.mMediaView == null) ? false : true;
        }

        private Double getRating(NativeAdBase.Rating rating) {
            if (rating == null) {
                return null;
            }
            return Double.valueOf((rating.getValue() * 5.0d) / rating.getScale());
        }

        public void mapUnifiedNativeAd(Context context, NativeAdMapperListener nativeAdMapperListener) {
            if (FacebookAdapter.this.isNativeBanner) {
                if (!containsRequiredFieldsForNativeBannerAd(this.mNativeBannerAd)) {
                    com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                    Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                    nativeAdMapperListener.onMappingFailed(adError);
                    return;
                }
                setHeadline(this.mNativeBannerAd.getAdHeadline());
                setBody(this.mNativeBannerAd.getAdBodyText());
                if (this.mNativeBannerAd.getPreloadedIconViewDrawable() != null) {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this, this.mNativeBannerAd.getPreloadedIconViewDrawable()));
                } else if (this.mNativeBannerAd.getAdIcon() == null) {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this));
                } else {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this, Uri.parse(this.mNativeBannerAd.getAdIcon().getUrl())));
                }
                setCallToAction(this.mNativeBannerAd.getAdCallToAction());
                setAdvertiser(this.mNativeBannerAd.getAdvertiserName());
                Bundle bundle = new Bundle();
                bundle.putCharSequence(FacebookAdapter.KEY_ID, this.mNativeBannerAd.getId());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeBannerAd.getAdSocialContext());
                setExtras(bundle);
            } else if (!containsRequiredFieldsForUnifiedNativeAd(this.mNativeAd)) {
                com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(108, "Ad from Facebook doesn't have all assets required for the Native Banner Ad format.", "com.google.ads.mediation.facebook");
                Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                nativeAdMapperListener.onMappingFailed(adError2);
                return;
            } else {
                setHeadline(this.mNativeAd.getAdHeadline());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FacebookAdapterNativeAdImage(FacebookAdapter.this, Uri.parse(this.mNativeAd.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(this.mNativeAd.getAdBodyText());
                if (this.mNativeAd.getPreloadedIconViewDrawable() != null) {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this, this.mNativeAd.getPreloadedIconViewDrawable()));
                } else if (this.mNativeAd.getAdIcon() == null) {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this));
                } else {
                    setIcon(new FacebookAdapterNativeAdImage(FacebookAdapter.this, Uri.parse(this.mNativeAd.getAdIcon().getUrl())));
                }
                setCallToAction(this.mNativeAd.getAdCallToAction());
                setAdvertiser(this.mNativeAd.getAdvertiserName());
                FacebookAdapter.this.mMediaView.setListener(new MediaViewListener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.UnifiedAdMapper.1
                    @Override // com.facebook.ads.MediaViewListener
                    public void onComplete(MediaView mediaView) {
                        if (FacebookAdapter.this.mNativeListener != null) {
                            FacebookAdapter.this.mNativeListener.onVideoEnd(FacebookAdapter.this);
                        }
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onEnterFullscreen(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onExitFullscreen(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onFullscreenBackground(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onFullscreenForeground(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onPause(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onPlay(MediaView mediaView) {
                    }

                    @Override // com.facebook.ads.MediaViewListener
                    public void onVolumeChange(MediaView mediaView, float f2) {
                    }
                });
                setMediaView(FacebookAdapter.this.mMediaView);
                setHasVideoContent(true);
                Double rating = getRating(this.mNativeAd.getAdStarRating());
                if (rating != null) {
                    setStarRating(rating);
                }
                Bundle bundle2 = new Bundle();
                bundle2.putCharSequence(FacebookAdapter.KEY_ID, this.mNativeAd.getId());
                bundle2.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeAd.getAdSocialContext());
                setExtras(bundle2);
            }
            NativeAdLayout nativeAdLayout = new NativeAdLayout(context);
            setAdChoicesContent(FacebookAdapter.this.isNativeBanner ? new AdOptionsView(context, this.mNativeBannerAd, nativeAdLayout) : new AdOptionsView(context, this.mNativeAd, nativeAdLayout));
            nativeAdMapperListener.onMappingSuccess();
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            ArrayList arrayList = new ArrayList();
            View view2 = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    view2 = entry.getValue();
                }
            }
            if (!FacebookAdapter.this.isNativeBanner) {
                if (view2 instanceof ImageView) {
                    this.mNativeAd.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, (ImageView) view2, arrayList);
                    return;
                }
                Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView.Calling registerViewForInteraction() without a reference to the icon view.");
                this.mNativeAd.registerViewForInteraction(view, FacebookAdapter.this.mMediaView, arrayList);
            } else if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
            } else if (view2 instanceof ImageView) {
                this.mNativeBannerAd.registerViewForInteraction(view, (ImageView) view2);
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
            }
        }

        @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
        public void untrackView(View view) {
            NativeBannerAd nativeBannerAd;
            if (!FacebookAdapter.this.isNativeBanner || (nativeBannerAd = this.mNativeBannerAd) == null) {
                com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
                if (nativeAd != null) {
                    nativeAd.unregisterView();
                }
            } else {
                nativeBannerAd.unregisterView();
            }
            super.untrackView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
                AdSettings.setMixedAudience(true);
            } else if (mediationAdRequest.taggedForChildDirectedTreatment() == 0) {
                AdSettings.setMixedAudience(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadInterstitial(Context context, String str, MediationAdRequest mediationAdRequest) {
        this.mInterstitialAd = new InterstitialAd(context, str);
        buildAdRequest(mediationAdRequest);
        this.mInterstitialAd.buildLoadAdConfig().withAdListener(new InterstitialListener()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndLoadNativeAd(Context context, String str, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle) {
        if (bundle != null) {
            this.isNativeBanner = bundle.getBoolean(FacebookExtras.NATIVE_BANNER);
        }
        if (this.isNativeBanner) {
            this.mNativeBannerAd = new NativeBannerAd(context, str);
            buildAdRequest(nativeMediationAdRequest);
            this.mNativeBannerAd.buildLoadAdConfig().withAdListener(new NativeBannerListener(context, this.mNativeBannerAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build();
            return;
        }
        this.mMediaView = new MediaView(context);
        this.mNativeAd = new com.facebook.ads.NativeAd(context, str);
        buildAdRequest(nativeMediationAdRequest);
        this.mNativeAd.buildLoadAdConfig().withAdListener(new NativeListener(context, this.mNativeAd)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build();
    }

    private AdSize getAdSize(Context context, com.google.android.gms.ads.AdSize adSize) {
        int width = adSize.getWidth();
        if (width < 0) {
            width = Math.round(adSize.getWidthInPixels(context) / context.getResources().getDisplayMetrics().density);
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(0, new com.google.android.gms.ads.AdSize(width, 50));
        arrayList.add(1, new com.google.android.gms.ads.AdSize(width, 90));
        arrayList.add(2, new com.google.android.gms.ads.AdSize(width, 250));
        String valueOf = String.valueOf(arrayList.toString());
        if (valueOf.length() != 0) {
            "Potential ad sizes: ".concat(valueOf);
        } else {
            new String("Potential ad sizes: ");
        }
        com.google.android.gms.ads.AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            return null;
        }
        String valueOf2 = String.valueOf(findClosestSize.toString());
        if (valueOf2.length() != 0) {
            "Found closest ad size: ".concat(valueOf2);
        } else {
            new String("Found closest ad size: ");
        }
        int height = findClosestSize.getHeight();
        AdSize adSize2 = AdSize.BANNER_HEIGHT_50;
        if (height == adSize2.getHeight()) {
            return adSize2;
        }
        AdSize adSize3 = AdSize.BANNER_HEIGHT_90;
        if (height == adSize3.getHeight()) {
            return adSize3;
        }
        AdSize adSize4 = AdSize.RECTANGLE_HEIGHT_250;
        if (height == adSize4.getHeight()) {
            return adSize4;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mWrappedAdView;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.destroy();
        }
        InterstitialAd interstitialAd = this.mInterstitialAd;
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        com.facebook.ads.NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
            this.mNativeAd.destroy();
        }
        MediaView mediaView = this.mMediaView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        NativeBannerAd nativeBannerAd = this.mNativeBannerAd;
        if (nativeBannerAd != null) {
            nativeBannerAd.unregisterView();
            this.mNativeBannerAd.destroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(final Context context, MediationBannerListener mediationBannerListener, Bundle bundle, final com.google.android.gms.ads.AdSize adSize, final MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mBannerListener = mediationBannerListener;
        final String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            this.mBannerListener.onAdFailedToLoad(this, adError);
            return;
        }
        final AdSize adSize2 = getAdSize(context, adSize);
        if (adSize2 != null) {
            FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.1
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError2) {
                    if (FacebookAdapter.this.mBannerListener != null) {
                        FacebookAdapter.this.mBannerListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
                    }
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    FacebookAdapter.this.mAdView = new AdView(context, placementID, adSize2);
                    FacebookAdapter.this.buildAdRequest(mediationAdRequest);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(adSize.getWidthInPixels(context), -2);
                    FacebookAdapter.this.mWrappedAdView = new FrameLayout(context);
                    FacebookAdapter.this.mAdView.setLayoutParams(layoutParams);
                    FacebookAdapter.this.mWrappedAdView.addView(FacebookAdapter.this.mAdView);
                    AdView unused = FacebookAdapter.this.mAdView;
                    FacebookAdapter.this.mAdView.buildLoadAdConfig().withAdListener(new BannerListener()).build();
                }
            });
            return;
        }
        com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, "There is no matching Facebook ad size for Google ad size.", "com.google.ads.mediation.facebook");
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.mBannerListener.onAdFailedToLoad(this, adError2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(final Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, final MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mInterstitialListener = mediationInterstitialListener;
        final String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (!TextUtils.isEmpty(placementID)) {
            FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.2
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError) {
                    if (FacebookAdapter.this.mInterstitialListener != null) {
                        FacebookAdapter.this.mInterstitialListener.onAdFailedToLoad(FacebookAdapter.this, adError);
                    }
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    FacebookAdapter.this.createAndLoadInterstitial(context, placementID, mediationAdRequest);
                }
            });
            return;
        }
        this.mInterstitialListener.onAdFailedToLoad(this, new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook"));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(final Context context, MediationNativeListener mediationNativeListener, Bundle bundle, final NativeMediationAdRequest nativeMediationAdRequest, final Bundle bundle2) {
        this.mNativeListener = mediationNativeListener;
        final String placementID = FacebookMediationAdapter.getPlacementID(bundle);
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError);
        } else if (nativeMediationAdRequest.isUnifiedNativeAdRequested()) {
            FacebookInitializer.getInstance().initialize(context, placementID, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookAdapter.3
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(com.google.android.gms.ads.AdError adError2) {
                    Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                    if (FacebookAdapter.this.mNativeListener != null) {
                        FacebookAdapter.this.mNativeListener.onAdFailedToLoad(FacebookAdapter.this, adError2);
                    }
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    FacebookAdapter.this.createAndLoadNativeAd(context, placementID, nativeMediationAdRequest, bundle2);
                }
            });
        } else {
            com.google.android.gms.ads.AdError adError2 = new com.google.android.gms.ads.AdError(105, "Unified Native Ads should be requested.", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.mNativeListener.onAdFailedToLoad(this, adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.showInterstitialCalled.set(true);
        if (this.mInterstitialAd.show()) {
            return;
        }
        Log.w(FacebookMediationAdapter.TAG, new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook").getMessage());
        MediationInterstitialListener mediationInterstitialListener = this.mInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdOpened(this);
            this.mInterstitialListener.onAdClosed(this);
        }
    }
}
