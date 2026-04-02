package c.b.i;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
/* loaded from: classes.dex */
public class p extends PopupWindow {
    public static final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1213b;

    static {
        a = Build.VERSION.SDK_INT < 21;
    }

    public p(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.r, i2, i3);
        if (obtainStyledAttributes.hasValue(2)) {
            boolean z = obtainStyledAttributes.getBoolean(2, false);
            if (a) {
                this.f1213b = z;
            } else {
                c.i.a.f0(this, z);
            }
        }
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : c.b.d.a.a.b(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (a && this.f1213b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (a && this.f1213b) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (a && this.f1213b) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
