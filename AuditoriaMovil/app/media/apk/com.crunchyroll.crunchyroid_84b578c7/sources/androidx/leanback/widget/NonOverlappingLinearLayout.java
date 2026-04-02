package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class NonOverlappingLinearLayout extends LinearLayout {
    public boolean b;
    public boolean c;
    public final ArrayList<ArrayList<View>> d;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = false;
        this.d = new ArrayList<>();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void focusableViewAvailable(View view) {
        int i;
        if (this.c) {
            for (View view2 = view; view2 != this && view2 != null; view2 = (View) view2.getParent()) {
                if (view2.getParent() == this) {
                    i = indexOfChild(view2);
                    break;
                }
            }
            i = -1;
            if (i != -1) {
                this.d.get(i).add(view);
                return;
            }
            return;
        }
        super.focusableViewAvailable(view);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        ArrayList<ArrayList<View>> arrayList = this.d;
        ?? r1 = 0;
        int i5 = 0;
        try {
            if (this.b && getOrientation() == 0 && getLayoutDirection() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.c = z2;
            if (z2) {
                while (arrayList.size() > getChildCount()) {
                    arrayList.remove(arrayList.size() - 1);
                }
                while (arrayList.size() < getChildCount()) {
                    arrayList.add(new ArrayList<>());
                }
            }
            super.onLayout(z, i, i2, i3, i4);
            if (this.c) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    for (int i7 = 0; i7 < arrayList.get(i6).size(); i7++) {
                        super.focusableViewAvailable(arrayList.get(i6).get(i7));
                    }
                }
            }
        } finally {
            if (this.c) {
                this.c = false;
                while (r1 < arrayList.size()) {
                    arrayList.get(r1).clear();
                    r1++;
                }
            }
        }
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.b = z;
    }
}
