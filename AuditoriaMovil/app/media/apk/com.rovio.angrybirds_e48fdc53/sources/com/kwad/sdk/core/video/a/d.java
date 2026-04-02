package com.kwad.sdk.core.video.a;

import android.content.Context;
import android.media.MediaDataSource;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.kwad.sdk.m.l;
import com.kwad.sdk.service.ServiceProvider;
import com.kwai.video.ksvodplayerkit.IKSVodPlayer;
import com.kwai.video.ksvodplayerkit.KSVodPlayerWrapper;
import com.kwai.video.ksvodplayerkit.KSVodVideoContext;
import com.kwai.video.player.IKwaiMediaPlayer;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.dex */
public final class d extends com.kwad.sdk.core.video.a.a {
    private static volatile boolean avW = false;
    private static final Queue<d> avX = new ConcurrentLinkedQueue();
    private com.kwad.sdk.contentalliance.a.a.b Sb;
    private String avO;
    private MediaDataSource avP;
    private final Object avQ;
    private boolean avR;
    private final KSVodPlayerWrapper avS;
    private final a avT;
    private boolean avU;
    private boolean avV;
    private boolean avY;
    private int mSarDen;
    private int mSarNum;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements IKSVodPlayer.OnBufferingUpdateListener, IKSVodPlayer.OnErrorListener, IKSVodPlayer.OnEventListener, IKSVodPlayer.OnPreparedListener, IKSVodPlayer.OnVideoSizeChangedListener, IKSVodPlayer.OnVodPlayerReleaseListener {
        final WeakReference<d> mWeakMediaPlayer;

        a(d dVar) {
            this.mWeakMediaPlayer = new WeakReference<>(dVar);
        }

        private d Dq() {
            return this.mWeakMediaPlayer.get();
        }

        public final void onBufferingUpdate(int i) {
            d Dq = Dq();
            if (Dq != null) {
                Dq.notifyOnBufferingUpdate(i);
            }
        }

        public final void onError(int i, int i2) {
            d Dq = Dq();
            if (Dq != null) {
                d.a(Dq, false);
                Dq.notifyOnError(i, i2);
            }
        }

        public final void onEvent(int i, int i2) {
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "onEvent, what: " + i);
            d Dq = Dq();
            if (Dq != null) {
                if (i == 10100) {
                    Dq.notifyOnSeekComplete();
                } else if (i == 10101) {
                    Dq.notifyOnCompletion();
                } else {
                    if (i == 10209) {
                        Dq.Dp();
                    }
                    Dq.notifyOnInfo(i, i2);
                }
            }
        }

        public final void onPlayerRelease() {
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "onPlayerRelease");
        }

        public final void onPrepared() {
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "onPrepared");
            d Dq = Dq();
            if (Dq != null) {
                Dq.notifyOnPrepared();
            }
        }

        public final void onVideoSizeChanged(int i, int i2, int i3, int i4) {
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "onVideoSizeChanged width: " + i + ", height: " + i2 + ", sarNum:" + i3 + ", sarDen:" + i4);
            d Dq = Dq();
            if (Dq != null) {
                Dq.u(i, i2);
                Dq.mSarNum = i3;
                Dq.mSarDen = i4;
            }
        }
    }

    public d() {
        Object obj = new Object();
        this.avQ = obj;
        this.avV = false;
        this.avY = true;
        synchronized (obj) {
            this.avS = new KSVodPlayerWrapper(l.KR());
        }
        this.avT = new a(this);
        Dm();
        setLooping(false);
    }

    private void Dl() {
        MediaDataSource mediaDataSource = this.avP;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.avP = null;
        }
    }

    private void Dm() {
        this.avS.setOnPreparedListener(this.avT);
        this.avS.setBufferingUpdateListener(this.avT);
        this.avS.setOnEventListener(this.avT);
        this.avS.setVideoSizeChangedListener(this.avT);
        this.avS.setOnErrorListener(this.avT);
    }

    private void Dn() {
        this.avS.setOnPreparedListener((IKSVodPlayer.OnPreparedListener) null);
        this.avS.setBufferingUpdateListener((IKSVodPlayer.OnBufferingUpdateListener) null);
        this.avS.setOnEventListener((IKSVodPlayer.OnEventListener) null);
        this.avS.setVideoSizeChangedListener((IKSVodPlayer.OnVideoSizeChangedListener) null);
        this.avS.setOnErrorListener((IKSVodPlayer.OnErrorListener) null);
    }

    private void Do() {
        if (this.avV) {
            return;
        }
        try {
            int prepareAsync = this.avS.prepareAsync();
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "realPrepare: ret: " + prepareAsync);
        } catch (IllegalStateException e) {
            com.kwad.sdk.core.e.c.e("KwaiMediaPlayer", "realPrepare failed", e);
        }
        this.avV = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Dp() {
        Queue<d> queue;
        Iterator<d> it = avX.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = 0;
                break;
            } else if (it.next() == this) {
                break;
            } else {
                i2++;
            }
        }
        com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "preloadNextPlayer next player index: " + i2);
        int i3 = i2 + 1;
        if (i3 < avX.size()) {
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "----------------preloadNextPlayer prepare next player----------------");
            while (true) {
                queue = avX;
                if (i >= i3) {
                    break;
                }
                queue.poll();
                i++;
            }
            d poll = queue.poll();
            queue.clear();
            if (poll != null) {
                poll.prepareAsync();
            } else {
                com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "----------------preloadNextPlayer prepareAsync next player is null----------------");
            }
        }
    }

    static /* synthetic */ boolean a(d dVar, boolean z) {
        dVar.avV = false;
        return false;
    }

    private void setDataSource(String str, Map<String, String> map) {
        this.avO = str;
        this.avS.setDataSource(str, (Map) null);
    }

    public final void a(com.kwad.sdk.contentalliance.a.a.a aVar) {
        if (this.avS == null || aVar == null) {
            return;
        }
        KSVodVideoContext kSVodVideoContext = new KSVodVideoContext();
        kSVodVideoContext.mVideoId = String.valueOf(aVar.photoId);
        kSVodVideoContext.mClickTime = aVar.clickTime;
        kSVodVideoContext.mExtra = aVar.yO();
        this.avS.updateVideoContext(kSVodVideoContext);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar) {
        this.Sb = bVar;
        a(bVar.akf);
        f fVar = (f) ServiceProvider.get(f.class);
        setDataSource((TextUtils.isEmpty(bVar.manifest) || fVar == null || !fVar.sG()) ? bVar.videoUrl : bVar.manifest, (Map<String, String>) null);
    }

    public final void bf(boolean z) {
        this.avY = z;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getAudioSessionId() {
        return this.avS.getKwaiMediaPlayer().getAudioSessionId();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final String getCurrentPlayingUrl() {
        KSVodPlayerWrapper kSVodPlayerWrapper = this.avS;
        return kSVodPlayerWrapper == null ? "" : kSVodPlayerWrapper.getCurrentPlayUrl();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getCurrentPosition() {
        try {
            return this.avS.getCurrentPosition();
        } catch (IllegalStateException e) {
            return 0L;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final String getDataSource() {
        return this.avO;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getDuration() {
        try {
            return this.avS.getDuration();
        } catch (IllegalStateException e) {
            return 0L;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getMediaPlayerType() {
        return 2;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoHeight() {
        return this.avS.getKwaiMediaPlayer().getVideoHeight();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoWidth() {
        return this.avS.getKwaiMediaPlayer().getVideoWidth();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isLooping() {
        return this.avU;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isPlaying() {
        try {
            return this.avS.isPlaying();
        } catch (IllegalStateException e) {
            return false;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void pause() {
        this.avS.pause();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean prepareAsync() {
        if (!this.avY) {
            Do();
            return true;
        }
        Queue<d> queue = avX;
        if (!queue.contains(this)) {
            queue.offer(this);
        }
        if (queue.size() == 1) {
            Do();
            com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "prepareAsync first");
            return true;
        }
        return false;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void release() {
        Queue<d> queue = avX;
        boolean remove = queue.remove(this);
        com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "release remote player ret: " + remove + ", player list size: " + queue.size());
        this.avR = true;
        this.avS.releaseAsync(new IKSVodPlayer.OnVodPlayerReleaseListener() { // from class: com.kwad.sdk.core.video.a.d.1
            public final void onPlayerRelease() {
                com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "onPlayerRelease");
            }
        });
        Dl();
        resetListeners();
        Dn();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void reset() {
        this.avV = false;
        try {
            IKwaiMediaPlayer kwaiMediaPlayer = this.avS.getKwaiMediaPlayer();
            if (kwaiMediaPlayer != null) {
                kwaiMediaPlayer.reset();
            }
        } catch (IllegalStateException e) {
        }
        Dl();
        resetListeners();
        Dm();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void seekTo(long j) {
        this.avS.seekTo((int) j);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setAudioStreamType(int i) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri, Map<String, String> map) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(FileDescriptor fileDescriptor) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(String str) {
        setDataSource(str, (Map<String, String>) null);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.avQ) {
            if (!this.avR) {
                this.avS.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setLooping(boolean z) {
        this.avU = z;
        this.avS.setLooping(z);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSpeed(float f) {
        this.avS.setSpeed(f);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSurface(Surface surface) {
        this.avS.setSurface(surface);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setVolume(float f, float f2) {
        this.avS.setVolume(f, f2);
        f(f);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void start() {
        com.kwad.sdk.core.e.c.i("KwaiMediaPlayer", "start");
        Do();
        this.avS.start();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void stop() {
        this.avS.stop();
    }
}
