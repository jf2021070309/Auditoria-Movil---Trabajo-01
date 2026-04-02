package e.j.d.b0.d;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.zipoapps.premiumhelper.ui.relaunch.RelaunchPremiumActivity;
import java.util.List;
import n.a.a;
/* loaded from: classes2.dex */
public final class t implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RelaunchPremiumActivity f8604b;

    public t(View view, RelaunchPremiumActivity relaunchPremiumActivity) {
        this.a = view;
        this.f8604b = relaunchPremiumActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        final RelaunchPremiumActivity relaunchPremiumActivity = this.f8604b;
        View view = relaunchPremiumActivity.f4921h;
        if (view == null) {
            h.o.c.j.k("buttonClose");
            throw null;
        }
        final View view2 = this.a;
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: e.j.d.b0.d.c
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view3, WindowInsets windowInsets) {
                List<Rect> boundingRects;
                ViewGroup.MarginLayoutParams marginLayoutParams;
                RelaunchPremiumActivity relaunchPremiumActivity2 = RelaunchPremiumActivity.this;
                View view4 = view2;
                h.o.c.j.e(relaunchPremiumActivity2, "this$0");
                View view5 = relaunchPremiumActivity2.f4921h;
                if (view5 == null) {
                    h.o.c.j.k("buttonClose");
                    throw null;
                }
                view5.setOnApplyWindowInsetsListener(null);
                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                if (displayCutout != null) {
                    View view6 = relaunchPremiumActivity2.f4921h;
                    if (view6 == null) {
                        h.o.c.j.k("buttonClose");
                        throw null;
                    }
                    h.o.c.j.d(displayCutout.getBoundingRects(), "cutout.boundingRects");
                    float f2 = 0.0f;
                    if (!boundingRects.isEmpty()) {
                        Rect rect = displayCutout.getBoundingRects().get(0);
                        View view7 = relaunchPremiumActivity2.f4921h;
                        if (view7 == null) {
                            h.o.c.j.k("buttonClose");
                            throw null;
                        }
                        int left = view7.getLeft();
                        View view8 = relaunchPremiumActivity2.f4921h;
                        if (view8 == null) {
                            h.o.c.j.k("buttonClose");
                            throw null;
                        }
                        int top = view8.getTop();
                        View view9 = relaunchPremiumActivity2.f4921h;
                        if (view9 == null) {
                            h.o.c.j.k("buttonClose");
                            throw null;
                        }
                        int right = view9.getRight();
                        View view10 = relaunchPremiumActivity2.f4921h;
                        if (view10 == null) {
                            h.o.c.j.k("buttonClose");
                            throw null;
                        } else if (rect.intersects(left, top, right, view10.getBottom())) {
                            if (displayCutout.getBoundingRects().get(0).left == 0) {
                                int width = view4.getWidth();
                                View view11 = relaunchPremiumActivity2.f4921h;
                                if (view11 == null) {
                                    h.o.c.j.k("buttonClose");
                                    throw null;
                                }
                                int width2 = width - view11.getWidth();
                                View view12 = relaunchPremiumActivity2.f4921h;
                                if (view12 == null) {
                                    h.o.c.j.k("buttonClose");
                                    throw null;
                                }
                                ViewGroup.LayoutParams layoutParams = view12.getLayoutParams();
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                                f2 = width2 - ((marginLayoutParams2 == null ? 0 : marginLayoutParams2.leftMargin) * 2);
                            } else {
                                int width3 = view4.getWidth();
                                View view13 = relaunchPremiumActivity2.f4921h;
                                if (view13 == null) {
                                    h.o.c.j.k("buttonClose");
                                    throw null;
                                }
                                int width4 = width3 - view13.getWidth();
                                View view14 = relaunchPremiumActivity2.f4921h;
                                if (view14 == null) {
                                    h.o.c.j.k("buttonClose");
                                    throw null;
                                }
                                ViewGroup.LayoutParams layoutParams2 = view14.getLayoutParams();
                                f2 = -(width4 - (((layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null) == null ? 0 : marginLayoutParams.leftMargin) * 2));
                            }
                        }
                    }
                    n.a.a.b("CUTOUT").g(h.o.c.j.i("cutout: ", displayCutout.getBoundingRects().get(0)), new Object[0]);
                    a.c b2 = n.a.a.b("CUTOUT");
                    StringBuilder y = e.a.d.a.a.y("close button: left: ");
                    View view15 = relaunchPremiumActivity2.f4921h;
                    if (view15 == null) {
                        h.o.c.j.k("buttonClose");
                        throw null;
                    }
                    y.append(view15.getLeft());
                    y.append(" right: ");
                    View view16 = relaunchPremiumActivity2.f4921h;
                    if (view16 == null) {
                        h.o.c.j.k("buttonClose");
                        throw null;
                    }
                    y.append(view16.getRight());
                    b2.g(y.toString(), new Object[0]);
                    n.a.a.b("CUTOUT").g(h.o.c.j.i("applied translation: ", Float.valueOf(f2)), new Object[0]);
                    view6.setTranslationX(f2);
                }
                return windowInsets;
            }
        });
        View view3 = this.f8604b.f4921h;
        if (view3 != null) {
            view3.requestApplyInsets();
        } else {
            h.o.c.j.k("buttonClose");
            throw null;
        }
    }
}
