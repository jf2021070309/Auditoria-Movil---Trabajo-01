package com.amazon.aps.iva.v60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.toolbar.ToolbarDivider;
/* compiled from: ActivityCancellationRescueBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final com.amazon.aps.iva.pu.k b;
    public final i c;
    public final FrameLayout d;
    public final ScrollView e;
    public final com.amazon.aps.iva.on.e f;
    public final Toolbar g;
    public final ToolbarDivider h;

    public a(ConstraintLayout constraintLayout, com.amazon.aps.iva.pu.k kVar, i iVar, FrameLayout frameLayout, ScrollView scrollView, com.amazon.aps.iva.on.e eVar, Toolbar toolbar, ToolbarDivider toolbarDivider) {
        this.a = constraintLayout;
        this.b = kVar;
        this.c = iVar;
        this.d = frameLayout;
        this.e = scrollView;
        this.f = eVar;
        this.g = toolbar;
        this.h = toolbarDivider;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
