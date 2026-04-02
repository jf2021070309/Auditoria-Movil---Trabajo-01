package com.amazon.aps.iva.c6;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.amazon.aps.iva.t5.g0;
import com.google.android.gms.cast.framework.media.NotificationOptions;
/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes.dex */
public final class l {
    public final a a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    /* compiled from: AudioTimestampPoller.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final AudioTrack a;
        public final AudioTimestamp b = new AudioTimestamp();
        public long c;
        public long d;
        public long e;

        public a(AudioTrack audioTrack) {
            this.a = audioTrack;
        }
    }

    public l(AudioTrack audioTrack) {
        if (g0.a >= 19) {
            this.a = new a(audioTrack);
            a();
            return;
        }
        this.a = null;
        b(3);
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.d = 10000000L;
                return;
            }
            this.d = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
            return;
        }
        this.e = 0L;
        this.f = -1L;
        this.c = System.nanoTime() / 1000;
        this.d = NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
    }
}
