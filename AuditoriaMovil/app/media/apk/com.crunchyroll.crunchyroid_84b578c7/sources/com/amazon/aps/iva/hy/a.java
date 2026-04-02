package com.amazon.aps.iva.hy;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ContinueWatchingOverflowMenuProvider.kt */
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.a70.b {

    /* compiled from: ContinueWatchingOverflowMenuProvider.kt */
    /* renamed from: com.amazon.aps.iva.hy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0347a extends a {
        public static final C0347a e = new C0347a();

        public C0347a() {
            super(true, R.string.mark_as_watched_action);
        }
    }

    /* compiled from: ContinueWatchingOverflowMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b e = new b();

        public b() {
            super(true, R.string.card_popup_share);
        }
    }

    /* compiled from: ContinueWatchingOverflowMenuProvider.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public static final c e = new c();

        public c() {
            super(false, R.string.mark_as_watched_disabled_action);
        }
    }

    public a(boolean z, int i) {
        super(i, null, z, Integer.valueOf((int) R.color.cr_scarpa_flow), 2);
    }
}
