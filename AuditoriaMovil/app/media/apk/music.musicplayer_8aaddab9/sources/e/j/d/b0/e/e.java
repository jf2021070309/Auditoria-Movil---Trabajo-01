package e.j.d.b0.e;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import h.o.c.j;
import java.util.List;
import n.a.a;
/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f8608b;

    public e(View view, View view2) {
        this.a = view;
        this.f8608b = view2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final View view = this.f8608b;
        final View view2 = this.a;
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: e.j.d.b0.e.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                List<Rect> boundingRects;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                View view4 = view;
                View view5 = view2;
                j.e(view4, "$buttonClose");
                view4.setOnApplyWindowInsetsListener(null);
                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    j.d(displayCutout.getBoundingRects(), "cutout.boundingRects");
                    float f2 = 0.0f;
                    if ((!boundingRects.isEmpty()) && displayCutout.getBoundingRects().get(0).intersects(view4.getLeft(), view4.getTop(), view4.getRight(), view4.getBottom())) {
                        if (displayCutout.getBoundingRects().get(0).left == 0) {
                            int width = view5.getWidth() - view4.getWidth();
                            ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            f2 = width - ((marginLayoutParams == null ? 0 : marginLayoutParams.leftMargin) * 2);
                        } else {
                            int width2 = view5.getWidth() - view4.getWidth();
                            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                            f2 = -(width2 - (((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) == null ? 0 : marginLayoutParams.leftMargin) * 2));
                        }
                    }
                    n.a.a.b("CUTOUT").g(j.i("cutout: ", displayCutout.getBoundingRects().get(0)), new Object[0]);
                    a.c b2 = n.a.a.b("CUTOUT");
                    StringBuilder y = e.a.d.a.a.y("close button: left: ");
                    y.append(view4.getLeft());
                    y.append(" right: ");
                    y.append(view4.getRight());
                    b2.g(y.toString(), new Object[0]);
                    n.a.a.b("CUTOUT").g(j.i("applied translation: ", Float.valueOf(f2)), new Object[0]);
                    view4.setTranslationX(f2);
                }
                return windowInsets;
            }
        });
        this.f8608b.requestApplyInsets();
    }
}
