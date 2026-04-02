package com.rovio.fusion;

import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
/* loaded from: classes2.dex */
public class AudioOutput implements AudioTrack.OnPlaybackPositionUpdateListener {
    private static final String TAG = "fusion.AudioOutput";
    private static final boolean VERBOSE_LOGGING = false;
    private HandlerThread a;
    private AudioTrack b;
    private int c;
    private int d;
    private long e;
    private byte[] f;
    private boolean g = false;
    private int h;
    private int i;
    private int j;
    private int k;

    public native void nativeMixData(long j, byte[] bArr, int i);

    public AudioOutput(long j, int i, int i2, int i3, int i4) {
        this.h = i;
        this.i = i2 == 1 ? 4 : 12;
        this.j = i3 == 8 ? 3 : 2;
        this.k = i4;
        int minBufferSize = AudioTrack.getMinBufferSize(this.h, this.i, this.j);
        if (this.k < minBufferSize) {
            this.k = minBufferSize;
        }
        this.e = j;
        this.c = (i3 / 8) * i2;
        this.d = this.k / this.c;
        this.f = new byte[this.k];
    }

    public boolean startOutput() {
        synchronized (this) {
            if (this.a == null) {
                AudioTrack audioTrack = new AudioTrack(3, this.h, this.i, this.j, this.k, 1);
                if (audioTrack.getState() == 0) {
                    return false;
                }
                this.a = new HandlerThread("AudioThread");
                this.a.start();
                this.b = audioTrack;
                this.b.setPlaybackPositionUpdateListener(this, new Handler(this.a.getLooper()));
                this.b.setPositionNotificationPeriod(this.d / 8);
                this.b.play();
                nativeMixData(this.e, this.f, this.f.length);
                this.b.write(this.f, 0, this.f.length);
                requestExclusiveAudio(this.g);
            }
            return true;
        }
    }

    public void requestExclusiveAudio(boolean z) {
        this.g = z;
        AudioManager audioManager = (AudioManager) Globals.getActivity().getSystemService("audio");
        if (audioManager != null) {
            if (this.g) {
                if (audioManager.requestAudioFocus(null, 3, 1) == 1) {
                }
            } else {
                audioManager.abandonAudioFocus(null);
            }
        }
    }

    public void stopOutput() {
        synchronized (this) {
            if (this.a != null) {
                this.b.stop();
                this.b.flush();
                this.b.setPlaybackPositionUpdateListener(null);
                this.b.release();
                this.b = null;
                this.a.quit();
                this.a = null;
            }
        }
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onMarkerReached(AudioTrack audioTrack) {
    }

    @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
    public void onPeriodicNotification(AudioTrack audioTrack) {
        synchronized (this) {
            if (this.b != null) {
                int positionNotificationPeriod = this.b.getPositionNotificationPeriod() * this.c;
                if (positionNotificationPeriod > this.f.length) {
                    positionNotificationPeriod = this.f.length;
                }
                nativeMixData(this.e, this.f, positionNotificationPeriod);
                this.b.write(this.f, 0, positionNotificationPeriod);
            }
        }
    }
}
