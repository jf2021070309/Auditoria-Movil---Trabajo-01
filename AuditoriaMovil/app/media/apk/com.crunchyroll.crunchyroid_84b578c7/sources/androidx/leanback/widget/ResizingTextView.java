package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import com.amazon.aps.iva.t3.k;
/* loaded from: classes.dex */
class ResizingTextView extends TextView {
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public boolean g;
    public int h;
    public float i;
    public int j;
    public int k;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        this.g = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.f, 16842884, 0);
        try {
            this.b = obtainStyledAttributes.getInt(1, 1);
            this.c = obtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.d = obtainStyledAttributes.getBoolean(0, false);
            this.e = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }
}
