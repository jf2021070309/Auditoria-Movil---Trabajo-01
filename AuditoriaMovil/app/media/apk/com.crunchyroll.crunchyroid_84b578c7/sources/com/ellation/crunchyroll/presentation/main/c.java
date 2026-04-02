package com.ellation.crunchyroll.presentation.main;

import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BottomNavigationTabItemLayout.kt */
/* loaded from: classes2.dex */
public abstract class c {
    public final String b;
    public final int a = R.string.bottom_navigation_tab_account;
    public final int c = R.drawable.selector_bottom_navigation_settings;
    public final int d = R.drawable.avatar_placeholder;

    /* compiled from: BottomNavigationTabItemLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(str);
            j.f(str, "avatarUrl");
        }
    }

    public c(String str) {
        this.b = str;
    }
}
