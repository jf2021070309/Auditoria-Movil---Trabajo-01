package com.amazon.aps.iva.vt;

import com.crunchyroll.crunchyroid.R;
/* compiled from: CommentsSortOption.kt */
/* loaded from: classes2.dex */
public abstract class q extends com.amazon.aps.iva.a70.b {

    /* compiled from: CommentsSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class a extends q {
        public static final a e = new a();

        public a() {
            super(R.string.commenting_comments_sport_menu_option_newest);
        }
    }

    /* compiled from: CommentsSortOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends q {
        public static final b e = new b();

        public b() {
            super(R.string.commenting_comments_sport_menu_option_popularity);
        }
    }

    public q(int i) {
        super(i, null, false, null, 14);
    }
}
