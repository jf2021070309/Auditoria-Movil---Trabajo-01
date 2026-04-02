package com.amazon.aps.iva.yk;

import com.crunchyroll.crunchyroid.R;
/* compiled from: PlaybackButtonUiModel.kt */
/* loaded from: classes2.dex */
public abstract class f {
    public final int a;
    public final int b;

    /* compiled from: PlaybackButtonUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f {
        public static final a c = new a();

        public a() {
            super(R.drawable.ic_pause, R.string.desc_playback_pause);
        }
    }

    /* compiled from: PlaybackButtonUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends f {
        public static final b c = new b();

        public b() {
            super(R.drawable.ic_play, R.string.desc_playback_play);
        }
    }

    /* compiled from: PlaybackButtonUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends f {
        public static final c c = new c();

        public c() {
            super(R.drawable.ic_replay, R.string.desc_playback_replay);
        }
    }

    public f(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
