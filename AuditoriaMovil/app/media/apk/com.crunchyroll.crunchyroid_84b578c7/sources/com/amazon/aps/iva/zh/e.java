package com.amazon.aps.iva.zh;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ArtistCtaUiModel.kt */
/* loaded from: classes.dex */
public abstract class e {
    public final int a;

    /* compiled from: ArtistCtaUiModel.kt */
    /* loaded from: classes.dex */
    public static final class a extends e {
        public static final a b = new a();

        public a() {
            super(R.string.artist_cta_play_concerts);
        }
    }

    /* compiled from: ArtistCtaUiModel.kt */
    /* loaded from: classes.dex */
    public static final class b extends e {
        public static final b b = new b();

        public b() {
            super(R.string.artist_cta_play_music_videos);
        }
    }

    public e(int i) {
        this.a = i;
    }
}
