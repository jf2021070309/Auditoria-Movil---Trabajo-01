package com.amazon.aps.iva.gi;

import com.crunchyroll.crunchyroid.R;
/* compiled from: MusicCardMenuItem.kt */
/* loaded from: classes.dex */
public abstract class d extends com.amazon.aps.iva.a70.b {

    /* compiled from: MusicCardMenuItem.kt */
    /* loaded from: classes.dex */
    public static final class a extends d {
        public static final a e = new a();

        public a() {
            super(R.string.card_popup_play_concerts);
        }
    }

    /* compiled from: MusicCardMenuItem.kt */
    /* loaded from: classes.dex */
    public static final class b extends d {
        public static final b e = new b();

        public b() {
            super(R.string.card_popup_play_music_videos);
        }
    }

    /* compiled from: MusicCardMenuItem.kt */
    /* loaded from: classes.dex */
    public static final class c extends d {
        public static final c e = new c();

        public c() {
            super(R.string.card_popup_share);
        }
    }

    /* compiled from: MusicCardMenuItem.kt */
    /* renamed from: com.amazon.aps.iva.gi.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0307d extends d {
        public static final C0307d e = new C0307d();

        public C0307d() {
            super(R.string.card_popup_view_artist);
        }
    }

    public d(int i) {
        super(i, null, false, null, 14);
    }
}
