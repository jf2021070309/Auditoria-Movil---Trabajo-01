package gonemad.gmmp.audioengine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import e.a.d.a.a;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class AudioPlayer {
    private static final int AUDIOPLAYER_CHAPTER_CHANGED = 9;
    public static final int AUDIOPLAYER_CROSSFADE_COMPLETE = 8;
    public static final int AUDIOPLAYER_ERROR_AUDIOTRACK = 6;
    public static final int AUDIOPLAYER_ERROR_CROSSFADE = 10;
    public static final int AUDIOPLAYER_ERROR_DECODE = 5;
    public static final int AUDIOPLAYER_ERROR_OPEN = 7;
    public static final int AUDIOPLAYER_ERROR_READ = 4;
    public static final int AUDIOPLAYER_ERROR_UNKNOWN = 3;
    public static final int AUDIOPLAYER_MODIFICATION_DETECTED = 11;
    private static final int AUDIOPLAYER_NEXTSOURCE_PREPARED = 2;
    private static final int AUDIOPLAYER_PLAYBACK_COMPLETE = 0;
    public static final int AUDIOPLAYER_ROUTE_AUDIOTRACK = 0;
    public static final int AUDIOPLAYER_ROUTE_CALLBACK = 1;
    public static final int AUDIOPLAYER_ROUTE_WEBM_MULTICAST = 2;
    private static final int AUDIOPLAYER_SOURCE_PREPARED = 1;
    private static final String TAG = "AudioPlayer";
    private OnAudioProcessedListener m_AudioProcessedListener;
    private OnChapterChangedListener m_ChapterChangedListener;
    private OnCrossfadeCompleteListener m_CrossfadeCompleteListener;
    private OnErrorListener m_ErrorListener;
    private Handler m_EventHandler = new Handler() { // from class: gonemad.gmmp.audioengine.AudioPlayer.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (AudioPlayer.this.m_NativeContext == 0) {
                Log.w(AudioPlayer.TAG, "AudioPlayer destroyed with unhandled events");
                return;
            }
            switch (message.what) {
                case 0:
                    if (AudioPlayer.this.m_PlaybackCompleteListener != null) {
                        AudioPlayer.this.m_PlaybackCompleteListener.onPlaybackComplete(AudioPlayer.this);
                        return;
                    }
                    return;
                case 1:
                case 2:
                    if (AudioPlayer.this.m_PreparedListener != null) {
                        AudioPlayer.this.m_PreparedListener.onPrepared(AudioPlayer.this, message.what == 2);
                        return;
                    }
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 10:
                case 11:
                    if (AudioPlayer.this.m_ErrorListener != null) {
                        AudioPlayer.this.m_ErrorListener.onError(AudioPlayer.this, message.what);
                        return;
                    }
                    return;
                case 8:
                    if (AudioPlayer.this.m_CrossfadeCompleteListener != null) {
                        AudioPlayer.this.m_CrossfadeCompleteListener.onCrossfadeComplete(AudioPlayer.this);
                        return;
                    }
                    return;
                case 9:
                    if (AudioPlayer.this.m_ChapterChangedListener != null) {
                        AudioPlayer.this.m_ChapterChangedListener.onChapterChanged(AudioPlayer.this);
                        return;
                    }
                    return;
                default:
                    StringBuilder y = a.y("Unknown message type ");
                    y.append(message.what);
                    s1.c(y.toString());
                    return;
            }
        }
    };
    private long m_NativeContext;
    private OnPlaybackCompleteListener m_PlaybackCompleteListener;
    private OnPreparedListener m_PreparedListener;

    /* loaded from: classes2.dex */
    public interface OnAudioProcessedListener {
        void onAudioProcessed(byte[] bArr);
    }

    /* loaded from: classes2.dex */
    public interface OnChapterChangedListener {
        void onChapterChanged(AudioPlayer audioPlayer);
    }

    /* loaded from: classes2.dex */
    public interface OnCrossfadeCompleteListener {
        void onCrossfadeComplete(AudioPlayer audioPlayer);
    }

    /* loaded from: classes2.dex */
    public interface OnErrorListener {
        void onError(AudioPlayer audioPlayer, int i2);
    }

    /* loaded from: classes2.dex */
    public interface OnPlaybackCompleteListener {
        void onPlaybackComplete(AudioPlayer audioPlayer);
    }

    /* loaded from: classes2.dex */
    public interface OnPreparedListener {
        void onPrepared(AudioPlayer audioPlayer, boolean z);
    }

    public AudioPlayer() {
        nativeInit();
    }

    private native void nativeInit();

    private native void nativeShutdown();

    private void onAudioProcessed(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        OnAudioProcessedListener onAudioProcessedListener = this.m_AudioProcessedListener;
        if (onAudioProcessedListener != null) {
            onAudioProcessedListener.onAudioProcessed(bArr2);
        }
    }

    private boolean sendMessage(int i2) {
        return this.m_EventHandler.sendEmptyMessage(i2);
    }

    public native void forceCrossfade(int i2);

    public native double getCurrentPosition();

    public native double getDuration();

    public native boolean isGapless();

    public native boolean isPlaying();

    public native void pause();

    public native boolean prepare();

    public native boolean prepare(int i2, int[] iArr);

    public native void release();

    public native void reset();

    public native void seekTo(int i2);

    public native void setAudioRouting(int i2);

    public native void setAudioSessionId(int i2);

    public native void setAudioSource(String str, String str2);

    public native void setBufferSize(int i2, int i3);

    public native void setCrossfadeEnabled(boolean z, boolean z2);

    public native void setCrossfadeTime(int i2);

    public native void setDSPEnabled(boolean z);

    public native void setDSPPriority(int i2);

    public native void setDecodePriority(int i2);

    public native void setDecodingStrategy(int i2);

    public native void setForceMono(boolean z);

    public native void setNextAudioSource(String str, String str2);

    public native void setNextAudioSource(String str, String str2, int i2, int[] iArr);

    public void setOnAudioProcessedListener(OnAudioProcessedListener onAudioProcessedListener) {
        this.m_AudioProcessedListener = onAudioProcessedListener;
    }

    public void setOnChapterChangedListener(OnChapterChangedListener onChapterChangedListener) {
        this.m_ChapterChangedListener = onChapterChangedListener;
    }

    public void setOnCrossfadeCompleteListener(OnCrossfadeCompleteListener onCrossfadeCompleteListener) {
        this.m_CrossfadeCompleteListener = onCrossfadeCompleteListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.m_ErrorListener = onErrorListener;
    }

    public void setOnPlaybackCompleteListener(OnPlaybackCompleteListener onPlaybackCompleteListener) {
        this.m_PlaybackCompleteListener = onPlaybackCompleteListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.m_PreparedListener = onPreparedListener;
    }

    public native void setPlaybackPriority(int i2);

    public native void setPreloadTime(int i2);

    public native void setReplayGainEnabled(boolean z, boolean z2, float f2);

    public native void setSilenceRemovalEnabled(boolean z, short s);

    public native void setTempo(float f2);

    public native void setVolume(float f2, float f3);

    public native void start();

    public native void stop();
}
