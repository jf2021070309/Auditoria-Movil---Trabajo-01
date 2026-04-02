package com.kwad.sdk.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
/* loaded from: classes3.dex */
public final class bm {
    public static boolean a(View view, int i, boolean z) {
        return view != null && b(view, i, z) && ct(view.getContext());
    }

    private static boolean b(View view, int i, boolean z) {
        if (view == null || view.getParent() == null) {
            return false;
        }
        Activity dt = com.kwad.sdk.m.l.dt(view.getContext());
        if ((dt == null || !dt.isFinishing()) && view.isShown() && view.getVisibility() == 0 && (!z || view.hasWindowFocus())) {
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                long height = rect.height() * rect.width();
                long height2 = view.getHeight() * view.getWidth();
                if (height2 > 0 && height * 100 >= i * height2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean ct(Context context) {
        return an.IM().ct(context);
    }

    public static boolean o(View view, int i) {
        return view != null && b(view, i, true) && view.hasWindowFocus() && ct(view.getContext());
    }
}
