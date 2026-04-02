package com.amazon.aps.iva.mm;

import com.crunchyroll.crunchyroid.R;
/* compiled from: ScreenVariant.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final int a;
    public final int b = R.string.multiple_profiles_edit_name_msg;
    public final int c;

    /* compiled from: ScreenVariant.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a d = new a();

        public a() {
            super(R.string.multiple_profiles_add_profile, R.string.multiple_profiles_create_user_name_hint);
        }
    }

    /* compiled from: ScreenVariant.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b d = new b();

        public b() {
            super(R.string.multiple_profiles_edit_profile, R.string.multiple_profiles_edit_user_name_hint);
        }
    }

    public c(int i, int i2) {
        this.a = i;
        this.c = i2;
    }
}
