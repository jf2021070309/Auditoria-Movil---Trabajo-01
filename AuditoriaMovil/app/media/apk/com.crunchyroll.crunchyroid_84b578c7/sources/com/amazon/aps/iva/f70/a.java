package com.amazon.aps.iva.f70;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.collapsibletoolbar.CollapsibleToolbarLayout;
/* compiled from: DialogMediaDetailsBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final View a;
    public final ImageView b;
    public final TextView c;
    public final CollapsibleToolbarLayout d;
    public final ScrollView e;
    public final View f;
    public final TextView g;
    public final CollapsibleTextView h;
    public final LinearLayout i;
    public final Toolbar j;

    public a(View view, ImageView imageView, TextView textView, CollapsibleToolbarLayout collapsibleToolbarLayout, ScrollView scrollView, View view2, TextView textView2, CollapsibleTextView collapsibleTextView, LinearLayout linearLayout, Toolbar toolbar) {
        this.a = view;
        this.b = imageView;
        this.c = textView;
        this.d = collapsibleToolbarLayout;
        this.e = scrollView;
        this.f = view2;
        this.g = textView2;
        this.h = collapsibleTextView;
        this.i = linearLayout;
        this.j = toolbar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
