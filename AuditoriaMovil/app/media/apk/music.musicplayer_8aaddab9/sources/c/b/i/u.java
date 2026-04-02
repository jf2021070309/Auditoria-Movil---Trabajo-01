package c.b.i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class u extends SeekBar {
    public final v a;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        v0.a(this, getContext());
        v vVar = new v(this);
        this.a = vVar;
        vVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        v vVar = this.a;
        Drawable drawable = vVar.f1249e;
        if (drawable != null && drawable.isStateful() && drawable.setState(vVar.f1248d.getDrawableState())) {
            vVar.f1248d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.f1249e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.a.d(canvas);
    }
}
