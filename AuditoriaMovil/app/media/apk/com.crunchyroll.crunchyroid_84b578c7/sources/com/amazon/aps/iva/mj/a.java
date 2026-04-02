package com.amazon.aps.iva.mj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: LayoutAdsTimelineBinding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final View c;
    public final View d;

    public /* synthetic */ a(ViewGroup viewGroup, View view, View view2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    public final ConstraintLayout a() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 1:
                return (ConstraintLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (RelativeLayout) viewGroup;
            case 1:
                return a();
            case 2:
                return a();
            default:
                return (LinearLayout) viewGroup;
        }
    }
}
