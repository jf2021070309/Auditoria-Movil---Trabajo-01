package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.adview.AppLovinVideoView;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.R;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    private static final String TAG = "AppLovinMediaView";
    private final AppLovinNativeAdImpl ad;
    private final ImageView imageView;
    private final AtomicBoolean impressionTracked;
    private boolean isVideoMuted;
    private final com.applovin.impl.sdk.utils.a lifecycleCallbacksAdapter;
    private final v logger;
    private MediaPlayer mediaPlayer;
    private final m sdk;
    private final a videoUiEventHandler;
    private AppLovinVideoView videoView;

    /* loaded from: classes.dex */
    public class a implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {
        private a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            AppLovinMediaView.this.logger.b(AppLovinMediaView.TAG, "Video completed");
            if (AppLovinMediaView.this.videoView != null) {
                AppLovinMediaView.this.videoView.setVisibility(8);
            }
            AppLovinMediaView.this.imageView.setVisibility(0);
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
            String str = "Video view error (" + i2 + "," + i3 + ")";
            v vVar = AppLovinMediaView.this.logger;
            StringBuilder B = e.a.d.a.a.B("Encountered media error: ", str, " for ad: ");
            B.append(AppLovinMediaView.this.ad);
            vVar.e(AppLovinMediaView.TAG, B.toString());
            return true;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
            v vVar = AppLovinMediaView.this.logger;
            vVar.b(AppLovinMediaView.TAG, "MediaPlayer Info: (" + i2 + ", " + i3 + ")");
            return false;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            AppLovinMediaView.this.mediaPlayer = mediaPlayer;
            mediaPlayer.setOnInfoListener(AppLovinMediaView.this.videoUiEventHandler);
            mediaPlayer.setOnErrorListener(AppLovinMediaView.this.videoUiEventHandler);
            float f2 = !AppLovinMediaView.this.isVideoMuted ? 1 : 0;
            mediaPlayer.setVolume(f2, f2);
            v vVar = AppLovinMediaView.this.logger;
            StringBuilder y = e.a.d.a.a.y("MediaPlayer prepared: ");
            y.append(AppLovinMediaView.this.mediaPlayer);
            vVar.b(AppLovinMediaView.TAG, y.toString());
        }
    }

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, m mVar, Context context) {
        super(context);
        this.impressionTracked = new AtomicBoolean();
        a aVar = new a();
        this.videoUiEventHandler = aVar;
        com.applovin.impl.sdk.utils.a aVar2 = new com.applovin.impl.sdk.utils.a() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinMediaView.1
            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.pause();
                }
            }

            @Override // com.applovin.impl.sdk.utils.a, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (AppLovinMediaView.this.videoView != null) {
                    AppLovinMediaView.this.videoView.start();
                }
            }
        };
        this.lifecycleCallbacksAdapter = aVar2;
        setBackgroundColor(-16777216);
        this.ad = appLovinNativeAdImpl;
        this.sdk = mVar;
        this.logger = mVar.B();
        this.isVideoMuted = true;
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.a.a vastAd = appLovinNativeAdImpl.getVastAd();
        Uri g2 = vastAd != null ? vastAd.g() : null;
        if (mainImageUri == null && g2 == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnTouchListener(new AppLovinTouchToClickListener(mVar, com.applovin.impl.sdk.c.b.aS, context, appLovinNativeAdImpl.getClickHandler()));
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            imageView.setOnClickListener(appLovinNativeAdImpl.getClickHandler());
            imageView.setImageURI(mainImageUri);
        }
        if (g2 != null) {
            mVar.ae().a(aVar2);
            AppLovinVideoView appLovinVideoView = new AppLovinVideoView(context, mVar);
            this.videoView = appLovinVideoView;
            appLovinVideoView.setOnPreparedListener(aVar);
            this.videoView.setOnCompletionListener(aVar);
            this.videoView.setOnErrorListener(aVar);
            this.videoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            addView(this.videoView);
            this.videoView.setVideoURI(g2);
            imageView.setVisibility(8);
        } else {
            this.videoView = null;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        try {
            setOnTouchListener(null);
            this.sdk.ae().b(this.lifecycleCallbacksAdapter);
            AppLovinVideoView appLovinVideoView = this.videoView;
            if (appLovinVideoView != null) {
                appLovinVideoView.pause();
                this.videoView.stopPlayback();
                this.videoView.setOnPreparedListener(null);
                this.videoView.setOnCompletionListener(null);
                this.videoView.setOnErrorListener(null);
                this.videoView = null;
            }
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.mediaPlayer = null;
            }
            removeAllViews();
        } catch (Throwable th) {
            String str = "Encountered exception when destroying:" + th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.impressionTracked.compareAndSet(false, true)) {
            for (String str : this.ad.getImpressionUrls()) {
                this.sdk.X().dispatchPostbackAsync(str, null);
            }
            this.ad.getAdEventTracker().a(this);
            this.ad.getAdEventTracker().d();
        }
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AppLovinVideoView appLovinVideoView = this.videoView;
        if (appLovinVideoView != null) {
            appLovinVideoView.pause();
        }
        super.onDetachedFromWindow();
    }
}
