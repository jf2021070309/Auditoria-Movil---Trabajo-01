package com.amazon.aps.iva.f70;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ellation.crunchyroll.playableasset.durationlabel.PlayableAssetDurationLabelLayout;
/* compiled from: LayoutPlayableAssetCardBinding.java */
/* loaded from: classes2.dex */
public final class d implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final ComposeView b;
    public final PlayableAssetDurationLabelLayout c;
    public final ProgressBar d;
    public final ComposeView e;
    public final ImageView f;
    public final TextView g;

    public d(ConstraintLayout constraintLayout, ComposeView composeView, PlayableAssetDurationLabelLayout playableAssetDurationLabelLayout, FrameLayout frameLayout, ProgressBar progressBar, FrameLayout frameLayout2, ComposeView composeView2, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = composeView;
        this.c = playableAssetDurationLabelLayout;
        this.d = progressBar;
        this.e = composeView2;
        this.f = imageView;
        this.g = textView;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
