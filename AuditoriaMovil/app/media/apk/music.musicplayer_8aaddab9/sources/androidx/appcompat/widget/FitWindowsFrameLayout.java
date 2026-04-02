package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c.b.c.q;
import c.b.i.g0;
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements g0 {
    public g0.a a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.a;
        if (aVar != null) {
            rect.top = ((q) aVar).a.Y(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // c.b.i.g0
    public void setOnFitSystemWindowsListener(g0.a aVar) {
        this.a = aVar;
    }
}
