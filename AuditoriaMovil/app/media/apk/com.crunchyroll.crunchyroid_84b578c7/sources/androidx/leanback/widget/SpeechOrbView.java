package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.leanback.widget.SearchOrbView;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class SpeechOrbView extends SearchOrbView {
    public final float t;
    public SearchOrbView.c u;
    public SearchOrbView.c v;
    public int w;
    public boolean x;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.w = 0;
        this.x = false;
        Resources resources = context.getResources();
        this.t = resources.getFraction(R.fraction.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.v = new SearchOrbView.c(resources.getColor(R.color.lb_speech_orb_not_recording), resources.getColor(R.color.lb_speech_orb_not_recording_pulsed), resources.getColor(R.color.lb_speech_orb_not_recording_icon));
        this.u = new SearchOrbView.c(resources.getColor(R.color.lb_speech_orb_recording), resources.getColor(R.color.lb_speech_orb_recording), 0);
        c();
    }

    public final void c() {
        setOrbColors(this.v);
        setOrbIcon(getResources().getDrawable(R.drawable.lb_ic_search_mic_out));
        a(hasFocus());
        View view = this.d;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        this.x = false;
    }

    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return R.layout.lb_speech_orb;
    }

    public void setListeningOrbColors(SearchOrbView.c cVar) {
        this.u = cVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.c cVar) {
        this.v = cVar;
    }

    public void setSoundLevel(int i) {
        if (!this.x) {
            return;
        }
        int i2 = this.w;
        if (i > i2) {
            this.w = ((i - i2) / 2) + i2;
        } else {
            this.w = (int) (i2 * 0.7f);
        }
        float focusedZoom = (((this.t - getFocusedZoom()) * this.w) / 100.0f) + 1.0f;
        View view = this.d;
        view.setScaleX(focusedZoom);
        view.setScaleY(focusedZoom);
    }
}
