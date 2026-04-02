package com.amazon.aps.iva.on;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
/* compiled from: ActivitySortAndFilterBinding.java */
/* loaded from: classes2.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final DrawerLayout b;
    public final c c;

    public a(ConstraintLayout constraintLayout, DrawerLayout drawerLayout, c cVar) {
        this.a = constraintLayout;
        this.b = drawerLayout;
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
