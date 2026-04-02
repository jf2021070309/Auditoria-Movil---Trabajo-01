package com.vungle.warren.ui.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.contract.LocalAdContract;
import com.vungle.warren.ui.presenter.LocalAdPresenter;
import com.vungle.warren.ui.view.FullAdWidget;
import java.io.File;
/* loaded from: classes2.dex */
public class LocalAdView extends BaseAdView<LocalAdPresenter> implements LocalAdContract.LocalView, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    private FullAdWidget.OnItemClickListener clickListener;
    private boolean ctaClickAreaEnabled;
    private Handler handler;
    private MediaPlayer mediaPlayer;
    private boolean muted;
    private LocalAdContract.LocalPresenter presenter;
    private Runnable reportProgress;

    public LocalAdView(Context context, FullAdWidget fullAdWidget, OrientationDelegate orientationDelegate, CloseDelegate closeDelegate) {
        super(context, fullAdWidget, orientationDelegate, closeDelegate);
        this.muted = false;
        this.ctaClickAreaEnabled = false;
        this.handler = new Handler(Looper.getMainLooper());
        this.clickListener = new FullAdWidget.OnItemClickListener() { // from class: com.vungle.warren.ui.view.LocalAdView.1
            @Override // com.vungle.warren.ui.view.FullAdWidget.OnItemClickListener
            public void onItemClicked(int i) {
                if (i == 1) {
                    LocalAdView.this.presenter.handleExit();
                } else if (i == 2) {
                    LocalAdView.this.presenter.onDownload();
                } else if (i == 3) {
                    if (LocalAdView.this.mediaPlayer != null) {
                        LocalAdView.this.muteAudio();
                        LocalAdView.this.presenter.onMute(LocalAdView.this.muted);
                        LocalAdView.this.view.setMuted(LocalAdView.this.muted);
                    }
                } else if (i != 4) {
                    if (i == 5 && LocalAdView.this.ctaClickAreaEnabled) {
                        LocalAdView.this.presenter.onDownload();
                    }
                } else {
                    LocalAdView.this.presenter.onPrivacy();
                }
            }
        };
        attachListeners();
    }

    private void attachListeners() {
        this.view.setOnItemClickListener(this.clickListener);
        this.view.setOnPreparedListener(this);
        this.view.setOnErrorListener(this);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void showCTAOverlay(boolean z, boolean z2) {
        this.ctaClickAreaEnabled = z2;
        this.view.setCtaEnabled(z && z2);
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void playVideo(File file, boolean z, int i) {
        this.muted = this.muted || z;
        if (file != null) {
            setupPlayerProgressBar();
            this.view.playVideo(Uri.fromFile(file), i);
            this.view.setMuted(this.muted);
            boolean z2 = this.muted;
            if (z2) {
                this.presenter.onMute(z2);
            }
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public void pauseVideo() {
        this.view.pausePlayback();
        Runnable runnable = this.reportProgress;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
        }
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public boolean isVideoPlaying() {
        return this.view.isVideoPlaying();
    }

    @Override // com.vungle.warren.ui.contract.LocalAdContract.LocalView
    public int getVideoPosition() {
        return this.view.getCurrentVideoPosition();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(LocalAdPresenter localAdPresenter) {
        this.presenter = localAdPresenter;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        this.view.stopPlayback();
        this.view.showWebsite(str);
        this.handler.removeCallbacks(this.reportProgress);
        this.mediaPlayer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void muteAudio() {
        if (this.mediaPlayer == null) {
            return;
        }
        this.muted = !this.muted;
        switchMuteState();
    }

    private void switchMuteState() {
        if (this.mediaPlayer != null) {
            try {
                float f = this.muted ? 0.0f : 1.0f;
                this.mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e) {
                Log.i(this.TAG, "Exception On Mute/Unmute", e);
            }
        }
    }

    private void setupPlayerProgressBar() {
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.ui.view.LocalAdView.2
            float duration = -2.0f;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (LocalAdView.this.view.isVideoPlaying()) {
                        int currentVideoPosition = LocalAdView.this.view.getCurrentVideoPosition();
                        int videoDuration = LocalAdView.this.view.getVideoDuration();
                        if (videoDuration > 0) {
                            if (this.duration == -2.0f) {
                                this.duration = videoDuration;
                            }
                            LocalAdView.this.presenter.onProgressUpdate(currentVideoPosition, this.duration);
                            LocalAdView.this.view.setProgress(currentVideoPosition, this.duration);
                        }
                    }
                    LocalAdView.this.handler.postDelayed(this, 1000L);
                } catch (IllegalStateException unused) {
                    Log.v(LocalAdView.this.TAG, "IllegalStateException while reporting progress indicates activity was killed via SIGKILL.");
                }
            }
        };
        this.reportProgress = runnable;
        this.handler.post(runnable);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(30);
        if (i == 1) {
            sb.append("MEDIA_ERROR_UNKNOWN");
        } else if (i == 100) {
            sb.append("MEDIA_ERROR_SERVER_DIED");
        } else {
            sb.append("UNKNOWN");
        }
        sb.append(':');
        if (i2 == -1010) {
            sb.append("MEDIA_ERROR_UNSUPPORTED");
        } else if (i2 == -1007) {
            sb.append("MEDIA_ERROR_MALFORMED");
        } else if (i2 == -1004) {
            sb.append("MEDIA_ERROR_IO");
        } else if (i2 == -110) {
            sb.append("MEDIA_ERROR_TIMED_OUT");
        } else if (i2 == 200) {
            sb.append("MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
        } else {
            sb.append("MEDIA_ERROR_SYSTEM");
        }
        this.presenter.onMediaError(sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        switchMuteState();
        this.view.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.vungle.warren.ui.view.LocalAdView.3
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                Log.d(LocalAdView.this.TAG, "mediaplayer onCompletion");
                if (LocalAdView.this.reportProgress != null) {
                    LocalAdView.this.handler.removeCallbacks(LocalAdView.this.reportProgress);
                }
                LocalAdView.this.presenter.onProgressUpdate(mediaPlayer2.getDuration(), mediaPlayer2.getDuration());
            }
        });
        this.presenter.onVideoStart(getVideoPosition(), mediaPlayer.getDuration());
        setupPlayerProgressBar();
    }

    @Override // com.vungle.warren.ui.view.BaseAdView, com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
        super.close();
        this.handler.removeCallbacksAndMessages(null);
    }
}
