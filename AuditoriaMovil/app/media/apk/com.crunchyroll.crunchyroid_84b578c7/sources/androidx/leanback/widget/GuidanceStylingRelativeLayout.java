package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
class GuidanceStylingRelativeLayout extends RelativeLayout {
    public final float b;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(com.amazon.aps.iva.d5.a.a);
        float f = obtainStyledAttributes.getFloat(45, 40.0f);
        obtainStyledAttributes.recycle();
        this.b = f;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = getRootView().findViewById(R.id.guidance_title);
        View findViewById2 = getRootView().findViewById(R.id.guidance_breadcrumb);
        View findViewById3 = getRootView().findViewById(R.id.guidance_description);
        ImageView imageView = (ImageView) getRootView().findViewById(R.id.guidance_icon);
        int measuredHeight = (int) ((getMeasuredHeight() * this.b) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView != null && imageView.getParent() == this && imageView.getDrawable() != null) {
            imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
        }
    }
}
