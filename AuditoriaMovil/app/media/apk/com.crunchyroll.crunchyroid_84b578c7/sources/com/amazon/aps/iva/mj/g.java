package com.amazon.aps.iva.mj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.crunchyroll.player.presentation.controls.playbackbutton.PlaybackButton;
/* compiled from: PlayerControlsCenterBinding.java */
/* loaded from: classes.dex */
public final class g implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 0;
    public final ImageView b;
    public final ViewGroup c;
    public final View d;
    public final View e;

    public g(LinearLayout linearLayout, PlaybackButton playbackButton, ImageView imageView, ImageView imageView2) {
        this.c = linearLayout;
        this.d = playbackButton;
        this.b = imageView;
        this.e = imageView2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.c;
        switch (i) {
            case 0:
                return (LinearLayout) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public g(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.c = constraintLayout;
        this.b = imageView;
        this.d = textView;
        this.e = textView2;
    }
}
