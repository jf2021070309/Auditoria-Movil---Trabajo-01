package com.amazon.aps.iva.mj;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
/* compiled from: LayoutPlayerBufferingBinding.java */
/* loaded from: classes.dex */
public final class c implements com.amazon.aps.iva.d9.a {
    public final RelativeLayout a;
    public final ProgressBar b;

    public c(RelativeLayout relativeLayout, ProgressBar progressBar) {
        this.a = relativeLayout;
        this.b = progressBar;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
