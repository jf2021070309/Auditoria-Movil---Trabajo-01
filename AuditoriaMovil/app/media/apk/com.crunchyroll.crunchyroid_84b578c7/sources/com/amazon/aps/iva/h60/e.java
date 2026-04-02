package com.amazon.aps.iva.h60;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.crunchyroll.player.presentation.playerview.PlayerViewLayout;
import com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsLayout;
import com.crunchyroll.watchscreen.screen.loading.WatchScreenLoadingLayout;
import com.crunchyroll.watchscreen.screen.summary.WatchScreenSummaryLayout;
/* compiled from: WatchScreenLayoutBinding.java */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.d9.a {
    public final ConstraintLayout a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final Guideline d;
    public final PlayerViewLayout e;
    public final NestedScrollView f;
    public final ConstraintLayout g;

    public e(ConstraintLayout constraintLayout, WatchScreenAssetsLayout watchScreenAssetsLayout, FrameLayout frameLayout, FrameLayout frameLayout2, Guideline guideline, PlayerViewLayout playerViewLayout, NestedScrollView nestedScrollView, WatchScreenSummaryLayout watchScreenSummaryLayout, FrameLayout frameLayout3, ConstraintLayout constraintLayout2, WatchScreenLoadingLayout watchScreenLoadingLayout) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = guideline;
        this.e = playerViewLayout;
        this.f = nestedScrollView;
        this.g = constraintLayout2;
    }

    @Override // com.amazon.aps.iva.d9.a
    public final View getRoot() {
        return this.a;
    }
}
