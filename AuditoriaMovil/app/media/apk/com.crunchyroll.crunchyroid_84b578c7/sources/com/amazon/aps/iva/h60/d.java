package com.amazon.aps.iva.h60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
/* compiled from: LayoutWatchScreenSummaryBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final LinearLayout a;
    public final TextView b;
    public final FrameLayout c;
    public final OverflowButton d;
    public final CollapsibleTextView e;
    public final TextView f;
    public final ComposeView g;

    public d(LinearLayout linearLayout, TextView textView, FrameLayout frameLayout, OverflowButton overflowButton, CollapsibleTextView collapsibleTextView, TextView textView2, ComposeView composeView) {
        this.a = linearLayout;
        this.b = textView;
        this.c = frameLayout;
        this.d = overflowButton;
        this.e = collapsibleTextView;
        this.f = textView2;
        this.g = composeView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
