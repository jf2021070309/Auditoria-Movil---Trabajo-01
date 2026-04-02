package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f5.m;
/* loaded from: classes.dex */
class GuidedActionItemContainer extends m {
    public final boolean b;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        if (!this.b && x.V(view, this)) {
            View focusSearch = super.focusSearch(view, i);
            if (x.V(focusSearch, this)) {
                return focusSearch;
            }
            return null;
        }
        return super.focusSearch(view, i);
    }
}
