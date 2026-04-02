package com.amazon.aps.iva.g00;

import com.crunchyroll.crunchyroid.R;
/* compiled from: PlayableAssetItemActionOption.kt */
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.a70.b {

    /* compiled from: PlayableAssetItemActionOption.kt */
    /* renamed from: com.amazon.aps.iva.g00.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0284a extends a {
        public static final C0284a e = new C0284a();

        public C0284a() {
            super(true, R.string.mark_as_watched_action);
        }
    }

    /* compiled from: PlayableAssetItemActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b e = new b();

        public b() {
            super(true, R.string.card_popup_share);
        }
    }

    /* compiled from: PlayableAssetItemActionOption.kt */
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
