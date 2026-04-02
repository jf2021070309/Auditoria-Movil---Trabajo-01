package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {
    public static final int[] c = {16842964, 16843049};
    public f b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        Drawable drawable2;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable2 = com.amazon.aps.iva.l.a.a(context, resourceId2);
            } else {
                drawable2 = obtainStyledAttributes.getDrawable(0);
            }
            setBackgroundDrawable(drawable2);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            if (obtainStyledAttributes.hasValue(1) && (resourceId = obtainStyledAttributes.getResourceId(1, 0)) != 0) {
                drawable = com.amazon.aps.iva.l.a.a(context, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(1);
            }
            setDivider(drawable);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean b(h hVar) {
        return this.b.performItemAction(hVar, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void initialize(f fVar) {
        this.b = fVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b((h) getAdapter().getItem(i));
    }
}
