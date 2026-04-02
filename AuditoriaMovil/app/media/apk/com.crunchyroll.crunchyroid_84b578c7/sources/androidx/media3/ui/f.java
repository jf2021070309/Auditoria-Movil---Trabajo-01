package androidx.media3.ui;

import androidx.media3.ui.c;
/* compiled from: TimeBar.java */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: TimeBar.java */
    /* loaded from: classes.dex */
    public interface a {
        void G(long j);

        void I(long j);

        void K(long j, boolean z);
    }

    void a(c.b bVar);

    void b(long[] jArr, boolean[] zArr, int i);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
