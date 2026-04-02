package com.amazon.aps.iva.n40;

import com.crunchyroll.crunchyroid.R;
/* compiled from: SyncToolbarUiModel.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final int a;
    public final int b;
    public final int c;

    /* compiled from: SyncToolbarUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a d = new a();

        public a() {
            super(R.string.show_page_synced_videos, R.plurals.syncing_toolbar_completed_videos, R.dimen.synced_toolbar_padding_bottom_movies);
        }
    }

    /* compiled from: SyncToolbarUiModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b d = new b();

        public b() {
            super(R.string.show_page_synced_episodes, R.plurals.syncing_toolbar_completed_episodes, R.dimen.synced_toolbar_padding_bottom_series);
        }
    }

    public c(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
