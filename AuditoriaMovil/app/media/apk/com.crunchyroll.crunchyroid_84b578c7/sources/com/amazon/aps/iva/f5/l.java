package com.amazon.aps.iva.f5;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.f5.f;
import com.amazon.aps.iva.f5.k;
/* compiled from: ItemAlignmentFacetHelper.java */
/* loaded from: classes.dex */
public final class l {
    public static final Rect a = new Rect();

    public static int a(View view, k.a aVar, int i) {
        View view2;
        int i2;
        int i3;
        int height;
        int width;
        int width2;
        int width3;
        f.d dVar = (f.d) view.getLayoutParams();
        int i4 = aVar.a;
        if (i4 == 0 || (view2 = view.findViewById(i4)) == null) {
            view2 = view;
        }
        int i5 = aVar.b;
        Rect rect = a;
        if (i == 0) {
            if (view.getLayoutDirection() == 1) {
                if (view2 == view) {
                    dVar.getClass();
                    width2 = (view2.getWidth() - dVar.e) - dVar.g;
                } else {
                    width2 = view2.getWidth();
                }
                int i6 = width2 - i5;
                if (aVar.d) {
                    float f = aVar.c;
                    if (f == 0.0f) {
                        i6 -= view2.getPaddingRight();
                    } else if (f == 100.0f) {
                        i6 += view2.getPaddingLeft();
                    }
                }
                if (aVar.c != -1.0f) {
                    if (view2 == view) {
                        dVar.getClass();
                        width3 = (view2.getWidth() - dVar.e) - dVar.g;
                    } else {
                        width3 = view2.getWidth();
                    }
                    i6 -= (int) ((width3 * aVar.c) / 100.0f);
                }
                if (view != view2) {
                    rect.right = i6;
                    ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                    return rect.right + dVar.g;
                }
                return i6;
            }
            if (aVar.d) {
                float f2 = aVar.c;
                if (f2 == 0.0f) {
                    i5 += view2.getPaddingLeft();
                } else if (f2 == 100.0f) {
                    i5 -= view2.getPaddingRight();
                }
            }
            if (aVar.c != -1.0f) {
                if (view2 == view) {
                    dVar.getClass();
                    width = (view2.getWidth() - dVar.e) - dVar.g;
                } else {
                    width = view2.getWidth();
                }
                i5 += (int) ((width * aVar.c) / 100.0f);
            }
            int i7 = i5;
            if (view != view2) {
                rect.left = i7;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                i2 = rect.left;
                i3 = dVar.e;
            } else {
                return i7;
            }
        } else {
            if (aVar.d) {
                float f3 = aVar.c;
                if (f3 == 0.0f) {
                    i5 += view2.getPaddingTop();
                } else if (f3 == 100.0f) {
                    i5 -= view2.getPaddingBottom();
                }
            }
            if (aVar.c != -1.0f) {
                if (view2 == view) {
                    dVar.getClass();
                    height = (view2.getHeight() - dVar.f) - dVar.h;
                } else {
                    height = view2.getHeight();
                }
                i5 += (int) ((height * aVar.c) / 100.0f);
            }
            int i8 = i5;
            if (view != view2) {
                rect.top = i8;
                ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, rect);
                i2 = rect.top;
                i3 = dVar.f;
            } else {
                return i8;
            }
        }
        return i2 - i3;
    }
}
