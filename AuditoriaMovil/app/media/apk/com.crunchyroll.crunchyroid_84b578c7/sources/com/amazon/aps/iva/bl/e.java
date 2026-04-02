package com.amazon.aps.iva.bl;

import android.widget.SeekBar;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.player.presentation.controls.timeline.PlayerTimelineLayout;
/* compiled from: PlayerTimelineLayout.kt */
/* loaded from: classes2.dex */
public final class e implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ PlayerTimelineLayout b;

    public e(PlayerTimelineLayout playerTimelineLayout) {
        this.b = playerTimelineLayout;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        j.f(seekBar, "seekBar");
        f fVar = this.b.c;
        if (fVar != null) {
            fVar.getView().Ch(fVar.c.a(i));
        } else {
            j.m("presenter");
            throw null;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        j.f(seekBar, "seekBar");
        f fVar = this.b.c;
        if (fVar != null) {
            int progress = seekBar.getProgress();
            fVar.e = true;
            fVar.getView().ih();
            fVar.f = progress;
            return;
        }
        j.m("presenter");
        throw null;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        j.f(seekBar, "seekBar");
        f fVar = this.b.c;
        if (fVar != null) {
            int progress = seekBar.getProgress();
            fVar.e = false;
            fVar.getView().uh();
            fVar.d.e(fVar.f, progress);
            return;
        }
        j.m("presenter");
        throw null;
    }
}
