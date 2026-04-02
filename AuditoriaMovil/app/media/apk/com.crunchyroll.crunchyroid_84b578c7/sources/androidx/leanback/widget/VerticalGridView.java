package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.amazon.aps.iva.f5.b;
import com.amazon.aps.iva.f5.f;
/* loaded from: classes.dex */
public class VerticalGridView extends b {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }

    public void setNumColumns(int i) {
        f fVar = this.b;
        if (i >= 0) {
            fVar.E = i;
            requestLayout();
            return;
        }
        fVar.getClass();
        throw new IllegalArgumentException();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.b.setOrientation(1);
        b1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.d5.a.i);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(int i) {
        this.b.G(i);
        requestLayout();
    }
}
