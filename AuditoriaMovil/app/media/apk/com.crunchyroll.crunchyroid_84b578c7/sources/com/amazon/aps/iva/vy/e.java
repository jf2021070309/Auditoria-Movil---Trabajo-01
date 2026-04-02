package com.amazon.aps.iva.vy;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
/* compiled from: WatchMusicSummaryBinding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final CollapsibleTextView d;
    public final LinearLayout e;
    public final ComposeView f;
    public final OverflowButton g;
    public final TextView h;
    public final TextView i;

    public e(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CollapsibleTextView collapsibleTextView, LinearLayout linearLayout, ComposeView composeView, OverflowButton overflowButton, TextView textView3, TextView textView4) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = collapsibleTextView;
        this.e = linearLayout;
        this.f = composeView;
        this.g = overflowButton;
        this.h = textView3;
        this.i = textView4;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
