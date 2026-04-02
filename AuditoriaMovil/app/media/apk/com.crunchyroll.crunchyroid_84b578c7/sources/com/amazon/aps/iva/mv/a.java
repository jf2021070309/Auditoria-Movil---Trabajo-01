package com.amazon.aps.iva.mv;

import com.crunchyroll.crunchyroid.R;
/* compiled from: CrunchylistActionOption.kt */
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.a70.b {

    /* compiled from: CrunchylistActionOption.kt */
    /* renamed from: com.amazon.aps.iva.mv.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0523a extends a {
        public static final C0523a e = new C0523a();

        public C0523a() {
            super(R.string.crunchylists_action_delete, R.color.cr_red_orange);
        }
    }

    /* compiled from: CrunchylistActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b e = new b();

        public b() {
            super(R.string.crunchylists_action_rename, R.color.color_white);
        }
    }

    public a(int i, int i2) {
        super(i, Integer.valueOf(i2), false, null, 12);
    }
}
