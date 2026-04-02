package com.amazon.aps.iva.c8;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.crunchyroll.crunchyroid.R;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ t c;

    public /* synthetic */ o(t tVar, int i) {
        this.b = i;
        this.c = tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3 = this.b;
        t tVar = this.c;
        switch (i3) {
            case 0:
                tVar.n.start();
                return;
            default:
                ViewGroup viewGroup = tVar.e;
                if (viewGroup != null) {
                    if (tVar.A) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                    viewGroup.setVisibility(i2);
                }
                View view = tVar.j;
                if (view != null) {
                    int dimensionPixelSize = tVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (tVar.A) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof androidx.media3.ui.b) {
                        androidx.media3.ui.b bVar = (androidx.media3.ui.b) view;
                        boolean z = tVar.A;
                        Rect rect = bVar.b;
                        ValueAnimator valueAnimator = bVar.F;
                        if (z) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            bVar.H = true;
                            bVar.G = 0.0f;
                            bVar.invalidate(rect);
                        } else {
                            int i4 = tVar.z;
                            if (i4 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.H = false;
                                bVar.G = 0.0f;
                                bVar.invalidate(rect);
                            } else if (i4 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                bVar.H = false;
                                bVar.G = 1.0f;
                                bVar.invalidate(bVar.b);
                            }
                        }
                    }
                }
                Iterator it = tVar.y.iterator();
                while (it.hasNext()) {
                    View view2 = (View) it.next();
                    if (tVar.A && t.j(view2)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    view2.setVisibility(i);
                }
                return;
        }
    }
}
