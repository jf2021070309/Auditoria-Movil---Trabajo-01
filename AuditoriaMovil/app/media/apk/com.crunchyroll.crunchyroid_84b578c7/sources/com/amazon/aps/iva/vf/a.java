package com.amazon.aps.iva.vf;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.crunchyroll.contentrating.controls.RatingControlsLayout;
/* compiled from: LayoutContentRatingBinding.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a;
    public final ViewGroup b;
    public final ViewGroup c;

    public /* synthetic */ a(ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = viewGroup2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (RatingControlsLayout) viewGroup;
            default:
                return (RelativeLayout) viewGroup;
        }
    }
}
