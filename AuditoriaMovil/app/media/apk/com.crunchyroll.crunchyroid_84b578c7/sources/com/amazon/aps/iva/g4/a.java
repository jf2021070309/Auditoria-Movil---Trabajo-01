package com.amazon.aps.iva.g4;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;
/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z2 = true;
        if (windowInsets.getSystemWindowInsetTop() > 0) {
            z = true;
        } else {
            z = false;
        }
        drawerLayout.y = windowInsets;
        drawerLayout.z = z;
        if (z || drawerLayout.getBackground() != null) {
            z2 = false;
        }
        drawerLayout.setWillNotDraw(z2);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
