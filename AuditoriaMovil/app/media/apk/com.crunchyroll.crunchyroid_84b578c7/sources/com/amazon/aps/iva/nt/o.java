package com.amazon.aps.iva.nt;

import com.crunchyroll.crunchyroid.R;
/* compiled from: PopupCardMenuItems.kt */
/* loaded from: classes2.dex */
public abstract class o extends com.amazon.aps.iva.a70.b {

    /* compiled from: PopupCardMenuItems.kt */
    /* loaded from: classes2.dex */
    public static final class a extends o {
        public static final a e = new a();

        public a() {
            super(R.string.card_popup_add_to_watchlist);
        }
    }

    /* compiled from: PopupCardMenuItems.kt */
    /* loaded from: classes2.dex */
    public static final class b extends o {
        public static final b e = new b();

        public b() {
            super(R.string.card_popup_remove_from_watchlist);
        }
    }

    public o(int i) {
        super(i, null, false, null, 14);
    }
}
