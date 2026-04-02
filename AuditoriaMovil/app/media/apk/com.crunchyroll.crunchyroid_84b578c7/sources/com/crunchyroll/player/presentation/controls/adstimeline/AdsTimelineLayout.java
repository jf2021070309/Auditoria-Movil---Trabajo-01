package com.crunchyroll.player.presentation.controls.adstimeline;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.mj.a;
import com.amazon.aps.iva.wk.f;
import com.amazon.aps.iva.wk.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: AdsTimelineLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/adstimeline/AdsTimelineLayout;", "Landroid/widget/RelativeLayout;", "Lcom/amazon/aps/iva/wk/g;", "", "durationMs", "Lcom/amazon/aps/iva/kb0/q;", "setProgressBarVideoDuration", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AdsTimelineLayout extends RelativeLayout implements g {
    public final a b;
    public f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsTimelineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_ads_timeline, (ViewGroup) this, false);
        addView(inflate);
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        ProgressBar progressBar = (ProgressBar) z.u(R.id.ads_progress_bar, inflate);
        if (progressBar != null) {
            this.b = new a(relativeLayout, relativeLayout, progressBar, 0);
            ea(0L);
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.ads_progress_bar)));
    }

    @Override // com.amazon.aps.iva.wk.g
    public final void E9() {
        RelativeLayout relativeLayout = (RelativeLayout) this.b.b;
        j.e(relativeLayout, "binding.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.wk.g
    public final void ea(long j) {
        ((ProgressBar) this.b.d).setProgress((int) j);
    }

    @Override // com.amazon.aps.iva.wk.g
    public final void f8() {
        RelativeLayout relativeLayout = (RelativeLayout) this.b.b;
        j.e(relativeLayout, "binding.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.wk.g
    public final void n() {
        t0.h(this, null, null, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.seek_bar_margin_bottom)), 7);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        f fVar = this.c;
        if (fVar != null) {
            fVar.onConfigurationChanged(configuration);
        } else {
            j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.wk.g
    public void setProgressBarVideoDuration(long j) {
        ((ProgressBar) this.b.d).setMax((int) j);
    }
}
