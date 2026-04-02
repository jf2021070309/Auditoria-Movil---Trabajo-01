package com.amazon.aps.iva.mj;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.crunchyroll.player.presentation.controls.adstimeline.AdsTimelineLayout;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
import com.crunchyroll.trickscrubbing.TrickScrubbingLayout;
/* compiled from: PlayerControlsLayoutBinding.java */
/* loaded from: classes.dex */
public final class h implements com.amazon.aps.iva.d9.a {
    public final /* synthetic */ int a = 1;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final Object e;
    public final Object f;
    public final View g;
    public final View h;
    public final View i;

    public h(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, com.amazon.aps.iva.p000do.e eVar, TextView textView5, TextView textView6, TextView textView7) {
        this.b = linearLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView4;
        this.f = eVar;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                return (RelativeLayout) viewGroup;
            default:
                return (LinearLayout) viewGroup;
        }
    }

    public h(RelativeLayout relativeLayout, AdsTimelineLayout adsTimelineLayout, g gVar, View view, RelativeLayout relativeLayout2, TrickScrubbingLayout trickScrubbingLayout, ComposeView composeView, PlayerTimelineLayout playerTimelineLayout, RelativeLayout relativeLayout3) {
        this.b = relativeLayout;
        this.e = gVar;
        this.f = view;
        this.c = relativeLayout2;
        this.g = trickScrubbingLayout;
        this.h = composeView;
        this.i = playerTimelineLayout;
        this.d = relativeLayout3;
    }
}
