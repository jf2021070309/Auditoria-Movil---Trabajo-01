package com.amazon.aps.iva.q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.crunchyroll.crunchyroid.R;
/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public class x extends SeekBar {
    public final y b;

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.b;
        Drawable drawable = yVar.e;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = yVar.d;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.b.d(canvas);
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.seekBarStyle);
        y0.a(getContext(), this);
        y yVar = new y(this);
        this.b = yVar;
        yVar.a(attributeSet, R.attr.seekBarStyle);
    }
}
