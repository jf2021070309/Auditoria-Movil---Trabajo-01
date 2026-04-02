package com.crunchyroll.player.presentation.controls.timeline;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.amazon.aps.iva.bl.f;
import com.amazon.aps.iva.bl.g;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.xd.c;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.seekbar.EasySeekSeekBar;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: PlayerTimelineLayout.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/timeline/PlayerTimelineLayout;", "Landroid/widget/RelativeLayout;", "Lcom/amazon/aps/iva/bl/g;", "", "durationMs", "Lcom/amazon/aps/iva/kb0/q;", "setSeekBarVideoDuration", "", "duration", "setVideoDurationText", "bufferedPositionMs", "setBufferPosition", "currentPositionMs", "setSeekPosition", "Lcom/ellation/widgets/seekbar/EasySeekSeekBar;", "getSeekBar", "()Lcom/ellation/widgets/seekbar/EasySeekSeekBar;", "seekBar", "getPositionMs", "()J", "positionMs", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayerTimelineLayout extends RelativeLayout implements g {
    public final c b;
    public f c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerTimelineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_player_timeline, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.current_time;
        TextView textView = (TextView) z.u(R.id.current_time, inflate);
        if (textView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) inflate;
            i = R.id.seek_bar;
            EasySeekSeekBar easySeekSeekBar = (EasySeekSeekBar) z.u(R.id.seek_bar, inflate);
            if (easySeekSeekBar != null) {
                i = R.id.video_duration;
                TextView textView2 = (TextView) z.u(R.id.video_duration, inflate);
                if (textView2 != null) {
                    this.b = new c(relativeLayout, textView, relativeLayout, easySeekSeekBar, textView2);
                    le(0, null);
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void Ch(String str) {
        j.f(str, "time");
        ((TextView) this.b.c).setText(str);
    }

    public final void G() {
        boolean z;
        if (getContext().getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        c cVar = this.b;
        if (z) {
            View view = cVar.e;
            ((EasySeekSeekBar) view).setThumbOffset(((EasySeekSeekBar) view).getThumb().getIntrinsicWidth() / 2);
            return;
        }
        ((EasySeekSeekBar) cVar.e).setThumbOffset(0);
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void S4() {
        RelativeLayout relativeLayout = (RelativeLayout) this.b.b;
        j.e(relativeLayout, "binding.root");
        relativeLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void c2() {
        RelativeLayout relativeLayout = (RelativeLayout) this.b.b;
        j.e(relativeLayout, "binding.root");
        relativeLayout.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    public long getPositionMs() {
        return ((EasySeekSeekBar) this.b.e).getProgress();
    }

    public final EasySeekSeekBar getSeekBar() {
        EasySeekSeekBar easySeekSeekBar = (EasySeekSeekBar) this.b.e;
        j.e(easySeekSeekBar, "binding.seekBar");
        return easySeekSeekBar;
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void ih() {
        ((EasySeekSeekBar) this.b.e).setThumb(a.getDrawable(getContext(), R.drawable.seek_bar_thumb_pressed));
        G();
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void le(int i, ArrayList arrayList) {
        c cVar = this.b;
        Context context = ((EasySeekSeekBar) cVar.e).getContext();
        j.e(context, "binding.seekBar.context");
        ((EasySeekSeekBar) cVar.e).setProgressDrawable(new com.amazon.aps.iva.zk.a(context, arrayList, i));
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void n() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.seek_bar_margin_horizontal);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.seek_bar_duration_margin_horizontal);
        t0.h(this, null, null, null, Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.seek_bar_margin_bottom)), 7);
        c cVar = this.b;
        EasySeekSeekBar easySeekSeekBar = (EasySeekSeekBar) cVar.e;
        j.e(easySeekSeekBar, "binding.seekBar");
        t0.i(easySeekSeekBar, Integer.valueOf(dimensionPixelSize), 0, Integer.valueOf(dimensionPixelSize), 0);
        TextView textView = (TextView) cVar.c;
        j.e(textView, "binding.currentTime");
        t0.g(textView, Integer.valueOf(dimensionPixelSize2), null, 2);
        TextView textView2 = (TextView) cVar.f;
        j.e(textView2, "binding.videoDuration");
        t0.g(textView2, null, Integer.valueOf(dimensionPixelSize2), 1);
        G();
        View view = cVar.e;
        ((EasySeekSeekBar) view).setFingerOffset(getResources().getDimension(R.dimen.player_timeline_finger_offset));
        EasySeekSeekBar easySeekSeekBar2 = (EasySeekSeekBar) view;
        Drawable progressDrawable = easySeekSeekBar2.getProgressDrawable();
        j.d(progressDrawable, "null cannot be cast to non-null type com.crunchyroll.player.presentation.controls.progress.ProgressDrawable");
        com.amazon.aps.iva.zk.a aVar = (com.amazon.aps.iva.zk.a) progressDrawable;
        easySeekSeekBar2.setProgressDrawable(new com.amazon.aps.iva.zk.a(aVar.b, aVar.c, aVar.d));
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.c;
        if (fVar != null) {
            fVar.onDestroy();
        } else {
            j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.bl.g
    public void setBufferPosition(long j) {
        ((EasySeekSeekBar) this.b.e).setSecondaryProgress((int) j);
    }

    @Override // com.amazon.aps.iva.bl.g
    public void setSeekBarVideoDuration(long j) {
        ((EasySeekSeekBar) this.b.e).setMax((int) j);
    }

    @Override // com.amazon.aps.iva.bl.g
    public void setSeekPosition(long j) {
        ((EasySeekSeekBar) this.b.e).setProgress((int) j);
    }

    @Override // com.amazon.aps.iva.bl.g
    public void setVideoDurationText(String str) {
        j.f(str, "duration");
        ((TextView) this.b.f).setText(str);
    }

    @Override // com.amazon.aps.iva.bl.g
    public final void uh() {
        ((EasySeekSeekBar) this.b.e).setThumb(a.getDrawable(getContext(), R.drawable.seek_bar_thumb));
        G();
    }
}
