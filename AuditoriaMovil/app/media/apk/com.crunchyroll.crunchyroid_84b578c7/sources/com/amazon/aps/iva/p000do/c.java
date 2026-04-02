package com.amazon.aps.iva.p000do;

import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.mj.h;
import com.ellation.toolbar.ToolbarDivider;
/* compiled from: ActivityUserMigrationWelcomeBinding.java */
/* renamed from: com.amazon.aps.iva.do.c  reason: invalid package */
/* loaded from: classes2.dex */
public final class c implements a {
    public final ConstraintLayout a;
    public final h b;
    public final d c;
    public final g d;
    public final TextView e;
    public final ScrollView f;
    public final TextView g;
    public final ToolbarDivider h;
    public final View i;
    public final f j;

    public c(ConstraintLayout constraintLayout, h hVar, d dVar, g gVar, TextView textView, ScrollView scrollView, TextView textView2, ToolbarDivider toolbarDivider, View view, f fVar) {
        this.a = constraintLayout;
        this.b = hVar;
        this.c = dVar;
        this.d = gVar;
        this.e = textView;
        this.f = scrollView;
        this.g = textView2;
        this.h = toolbarDivider;
        this.i = view;
        this.j = fVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
