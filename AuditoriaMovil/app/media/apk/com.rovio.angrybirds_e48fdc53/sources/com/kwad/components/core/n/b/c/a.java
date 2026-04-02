package com.kwad.components.core.n.b.c;

import android.content.Context;
import android.view.Surface;
import com.kwad.components.core.video.DetailVideoView;
import com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener;
import com.kwad.components.offline.api.core.video.IKsMediaPlayer;
import com.kwad.components.offline.api.core.video.IKsMediaPlayerView;
import com.kwad.components.offline.api.core.video.IMediaPlayer;
import com.kwad.components.offline.api.core.video.listener.OfflineVideoPlayStateListener;
import com.kwad.components.offline.api.core.video.listener.ReleaseCallback;
import com.kwad.components.offline.api.core.video.listener.VideoMuteStateChangeListener;
import com.kwad.components.offline.api.core.video.mdoel.KsPlayerLogParams;
import com.kwad.components.offline.api.core.video.mdoel.PlayVideoInfo;
import com.kwad.sdk.utils.ao;
import com.kwad.sdk.utils.bj;
/* loaded from: classes.dex */
final class a implements IKsMediaPlayer {
    private com.kwad.components.core.video.b LY;
    private c LZ;
    private VideoMuteStateChangeListener Ma;
    private boolean Mb;
    private Context mContext;
    private DetailVideoView mDetailVideoView;
    private boolean yh;
    private OfflineOnAudioConflictListener yk;
    private boolean nA = true;
    private int Mc = -1;

    static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.yh = true;
        return true;
    }

    private OfflineOnAudioConflictListener ot() {
        if (this.yk == null) {
            this.yk = new OfflineOnAudioConflictListener() { // from class: com.kwad.components.core.n.b.c.a.2
                @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
                public final void onAudioBeOccupied() {
                    a.a(a.this, true);
                    bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.n.b.c.a.2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.this.LY.setAudioEnabled(false);
                            if (a.this.Ma != null) {
                                a.this.Ma.onMuteStateChanged(true);
                            }
                        }
                    });
                }

                @Override // com.kwad.components.offline.api.core.api.OfflineOnAudioConflictListener
                public final void onAudioBeReleased() {
                }
            };
        }
        return this.yk;
    }

    public final a a(com.kwad.components.core.video.b bVar) {
        ao.checkNotNull(bVar);
        this.LY = bVar;
        return this;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void addOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.LY.a(d.a(getMediaPlayer(), onInfoListener));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void addOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.LY.a(d.a(getMediaPlayer(), onPreparedListener));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void clear() {
        this.LY.clear();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getBufferPercentage() {
        return this.LY.getBufferPercentage();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final String getCurrentPlayingUrl() {
        return this.LY.getCurrentPlayingUrl();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getCurrentPosition() {
        return this.LY.getCurrentPosition();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getDuration() {
        return this.LY.getDuration();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getMaxVolume() {
        return 0;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final IMediaPlayer getMediaPlayer() {
        com.kwad.sdk.core.video.a.c qF = this.LY.qF();
        if (qF == null) {
            return null;
        }
        c cVar = this.LZ;
        if (cVar == null || cVar.ov() != qF) {
            this.LZ = new c().b(qF);
        }
        return this.LZ;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getMediaPlayerType() {
        return this.LY.getMediaPlayerType();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final long getPlayDuration() {
        return this.LY.getPlayDuration();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final String getStateString(int i) {
        return com.kwad.components.core.video.b.getStateString(i);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVideoHeight() {
        return this.LY.getVideoHeight();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVideoWidth() {
        return this.LY.getVideoWidth();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final int getVolume() {
        return 0;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void initMediaPlayer(PlayVideoInfo playVideoInfo, IKsMediaPlayerView iKsMediaPlayerView) {
        if (!(iKsMediaPlayerView instanceof b)) {
            com.kwad.sdk.core.e.c.e("KsMediaPlayer", "videoView not instanceof KsMediaPlayerView");
            return;
        }
        DetailVideoView ou = ((b) iKsMediaPlayerView).ou();
        this.mDetailVideoView = ou;
        this.mContext = ou.getContext().getApplicationContext();
        this.LY.a(d.a(playVideoInfo), this.mDetailVideoView);
        int i = this.Mc;
        if (i != -1) {
            setVideoAdaptStrategy(i);
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void initMediaPlayer(PlayVideoInfo playVideoInfo, boolean z, boolean z2, IKsMediaPlayerView iKsMediaPlayerView) {
        if (iKsMediaPlayerView instanceof b) {
            this.LY.a(d.a(playVideoInfo), z, z2, ((b) iKsMediaPlayerView).ou());
        } else {
            com.kwad.sdk.core.e.c.e("KsMediaPlayer", "videoView not instanceof KsMediaPlayerView");
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPlaying() {
        return this.LY.isPlaying();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPrepared() {
        return this.LY.isPrepared();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean isPreparing() {
        return this.LY.isPreparing();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void notifyOnInfoListener(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (iMediaPlayer instanceof c) {
            this.LY.a(((c) iMediaPlayer).ov(), i, i2);
        } else {
            com.kwad.sdk.core.e.c.e("KsMediaPlayer", "videoView not instanceof KsMediaPlayerView");
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void onPlayStateChanged(int i) {
        this.LY.onPlayStateChanged(i);
    }

    public final com.kwad.components.core.video.b os() {
        return this.LY;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final boolean pause() {
        return this.LY.pause();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void prepareAsync() {
        this.LY.prepareAsync();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void registerVideoMuteStateListener(VideoMuteStateChangeListener videoMuteStateChangeListener) {
        this.Ma = videoMuteStateChangeListener;
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void registerVideoPlayStateListener(OfflineVideoPlayStateListener offlineVideoPlayStateListener) {
        this.LY.c(d.a(offlineVideoPlayStateListener));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release() {
        this.LY.release();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release(ReleaseCallback releaseCallback) {
        this.LY.a(d.a(releaseCallback));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void release(ReleaseCallback releaseCallback, boolean z) {
        this.LY.a(d.a(releaseCallback), z);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void releaseSync() {
        this.LY.releaseSync();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void removeInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.LY.b(d.a(getMediaPlayer(), onInfoListener));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void resetAndPlay(PlayVideoInfo playVideoInfo) {
        com.kwad.components.core.video.b bVar = this.LY;
        d.a(playVideoInfo);
        bVar.qI();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void restart() {
        this.LY.restart();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void resume() {
        this.LY.resume();
        if (this.nA || (this.Mb && this.yh)) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(this.Mb);
            if (this.Mb && this.yh) {
                this.yh = false;
                setAudioEnabled(true);
                this.nA = true;
            } else if (com.kwad.components.core.t.a.ak(this.mContext).qj()) {
                this.nA = false;
                setAudioEnabled(false);
            }
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void seekTo(long j) {
        this.LY.seekTo(j);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setAudioEnabled(final boolean z) {
        if (z) {
            com.kwad.components.core.t.a.ak(this.mContext).aI(true);
        }
        if (z == this.nA) {
            com.kwad.sdk.core.video.a.a.a.dI("autoVoice");
            return;
        }
        this.nA = z;
        bj.runOnUiThread(new Runnable() { // from class: com.kwad.components.core.n.b.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.LY.setAudioEnabled(z);
                if (a.this.Ma != null) {
                    a.this.Ma.onMuteStateChanged(!z);
                }
            }
        });
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setDataSource(PlayVideoInfo playVideoInfo) {
        this.LY.a(d.a(playVideoInfo));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setForceGetAudioFocus(boolean z) {
        this.Mb = z;
        Context context = this.mContext;
        if (context != null) {
            com.kwad.components.core.t.a.ak(context).a(ot());
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setRadius(float f, float f2, float f3, float f4) {
        this.LY.setRadius(f, f2, f3, f4);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setSpeed(float f) {
        this.LY.setSpeed(f);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setSurface(Surface surface) {
        this.LY.setSurface(surface);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setVideoAdaptStrategy(int i) {
        this.Mc = i;
        DetailVideoView detailVideoView = this.mDetailVideoView;
        if (detailVideoView != null) {
            detailVideoView.f(true, i);
        }
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void setVolume(float f, float f2) {
        this.LY.setVolume(f, f2);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void start() {
        this.LY.start();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void start(long j) {
        this.LY.start(j);
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void stopAndPrepareAsync() {
        this.LY.stopAndPrepareAsync();
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void unRegisterVideoPlayStateListener(OfflineVideoPlayStateListener offlineVideoPlayStateListener) {
        this.LY.d(d.a(offlineVideoPlayStateListener));
    }

    @Override // com.kwad.components.offline.api.core.video.IKsMediaPlayer
    public final void updateKsPlayLogParam(KsPlayerLogParams ksPlayerLogParams) {
        this.LY.a(d.a(ksPlayerLogParams));
    }
}
