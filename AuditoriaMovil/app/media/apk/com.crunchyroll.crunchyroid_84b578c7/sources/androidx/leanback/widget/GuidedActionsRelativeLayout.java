package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
class GuidedActionsRelativeLayout extends RelativeLayout {
    public final float b;
    public boolean c;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(com.amazon.aps.iva.d5.a.a);
        float f = obtainStyledAttributes.getFloat(45, 40.0f);
        obtainStyledAttributes.recycle();
        this.b = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.c) {
                this.c = true;
            }
            if (this.c) {
                marginLayoutParams.topMargin = (int) ((this.b * size) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
