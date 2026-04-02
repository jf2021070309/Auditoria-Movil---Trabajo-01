package com.kwad.sdk.core.video.a;

import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.TimedText;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.kwad.sdk.service.ServiceProvider;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class b extends com.kwad.sdk.core.video.a.a {
    private final MediaPlayer avM;
    private final a avN;
    private String avO;
    private MediaDataSource avP;
    private final Object avQ;
    private boolean avR;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnTimedTextListener, MediaPlayer.OnVideoSizeChangedListener {
        final WeakReference<b> mWeakMediaPlayer;

        a(b bVar) {
            this.mWeakMediaPlayer = new WeakReference<>(bVar);
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.notifyOnBufferingUpdate(i);
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.notifyOnCompletion();
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            b bVar = this.mWeakMediaPlayer.get();
            return bVar != null && bVar.notifyOnError(i, i2);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            b bVar = this.mWeakMediaPlayer.get();
            return bVar != null && bVar.notifyOnInfo(i, i2);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public final void onPrepared(MediaPlayer mediaPlayer) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.notifyOnPrepared();
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.notifyOnSeekComplete();
            }
        }

        @Override // android.media.MediaPlayer.OnTimedTextListener
        public final void onTimedText(MediaPlayer mediaPlayer, TimedText timedText) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.b(timedText);
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            b bVar = this.mWeakMediaPlayer.get();
            if (bVar != null) {
                bVar.u(i, i2);
            }
        }
    }

    public b() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.avQ = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.avM = mediaPlayer;
        }
        mediaPlayer.setAudioStreamType(3);
        this.avN = new a(this);
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
        this.avM.setOnPreparedListener(this.avN);
        this.avM.setOnBufferingUpdateListener(this.avN);
        this.avM.setOnCompletionListener(this.avN);
        this.avM.setOnSeekCompleteListener(this.avN);
        this.avM.setOnVideoSizeChangedListener(this.avN);
        this.avM.setOnErrorListener(this.avN);
        this.avM.setOnInfoListener(this.avN);
        this.avM.setOnTimedTextListener(this.avN);
    }

    private void Dn() {
        this.avM.setOnPreparedListener(null);
        this.avM.setOnBufferingUpdateListener(null);
        this.avM.setOnCompletionListener(null);
        this.avM.setOnSeekCompleteListener(null);
        this.avM.setOnVideoSizeChangedListener(null);
        this.avM.setOnErrorListener(null);
        this.avM.setOnInfoListener(null);
        this.avM.setOnTimedTextListener(null);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void a(com.kwad.sdk.contentalliance.a.a.b bVar) {
        if (!bVar.isNoCache) {
            setDataSource(bVar.videoUrl);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(DownloadUtils.CONTENT_TYPE, "video/mp4");
        hashMap.put(DownloadUtils.ACCEPT_RANGES, "bytes");
        hashMap.put("Status", "206");
        hashMap.put("Cache-control", "no-cache");
        setDataSource(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext(), Uri.parse(bVar.videoUrl), hashMap);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getAudioSessionId() {
        return this.avM.getAudioSessionId();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final String getCurrentPlayingUrl() {
        return "";
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final long getCurrentPosition() {
        try {
            return this.avM.getCurrentPosition();
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
            return this.avM.getDuration();
        } catch (IllegalStateException e) {
            return 0L;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getMediaPlayerType() {
        return 1;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoHeight() {
        return this.avM.getVideoHeight();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final int getVideoWidth() {
        return this.avM.getVideoWidth();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isLooping() {
        return this.avM.isLooping();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean isPlaying() {
        try {
            return this.avM.isPlaying();
        } catch (IllegalStateException e) {
            return false;
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void pause() {
        this.avM.pause();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final boolean prepareAsync() {
        this.avM.prepareAsync();
        return true;
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void release() {
        try {
            this.avR = true;
            this.avM.release();
            Dl();
            resetListeners();
            Dn();
        } catch (Throwable th) {
            com.kwad.sdk.core.e.c.printStackTrace(th);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void reset() {
        try {
            this.avM.reset();
        } catch (IllegalStateException e) {
        }
        Dl();
        resetListeners();
        Dm();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void seekTo(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.avM.seekTo((int) j, 3);
        } else {
            this.avM.seekTo((int) j);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setAudioStreamType(int i) {
        this.avM.setAudioStreamType(i);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri) {
        this.avM.setDataSource(context, uri);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.avM.setDataSource(context, uri, map);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(FileDescriptor fileDescriptor) {
        this.avM.setDataSource(fileDescriptor);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDataSource(String str) {
        this.avO = str;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.avM.setDataSource(str);
        } else {
            this.avM.setDataSource(parse.getPath());
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setDisplay(SurfaceHolder surfaceHolder) {
        synchronized (this.avQ) {
            if (!this.avR) {
                this.avM.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setLooping(boolean z) {
        this.avM.setLooping(z);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setScreenOnWhilePlaying(boolean z) {
        this.avM.setScreenOnWhilePlaying(z);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSpeed(float f) {
        if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams = this.avM.getPlaybackParams();
            if (playbackParams == null) {
                playbackParams = new PlaybackParams();
            }
            playbackParams.setSpeed(f);
            this.avM.setPlaybackParams(playbackParams);
        }
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setSurface(Surface surface) {
        this.avM.setSurface(surface);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void setVolume(float f, float f2) {
        this.avM.setVolume(f, f2);
        f(f);
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void start() {
        this.avM.start();
    }

    @Override // com.kwad.sdk.core.video.a.c
    public final void stop() {
        this.avM.stop();
    }
}
