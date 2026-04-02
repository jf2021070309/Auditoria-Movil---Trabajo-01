package com.facebook.ads.internal.r;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
/* loaded from: classes2.dex */
class d {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Float a(View view) {
        Activity a = com.facebook.ads.internal.q.a.a.a();
        if (a == null) {
            return null;
        }
        View findViewById = a.findViewById(16908290);
        if (findViewById == null) {
            findViewById = a.getWindow().getDecorView().findViewById(16908290);
        }
        if (findViewById == null || view == null || view.getId() == -1) {
            return null;
        }
        return findViewById.findViewById(view.getId()) == null ? Float.valueOf(-1.0f) : a(findViewById, view);
    }

    static Float a(View view, View view2) {
        if (view == null || view2 == null) {
            return null;
        }
        if (view2.getVisibility() != 0) {
            return Float.valueOf(0.0f);
        }
        List<View> b = b(view, view2);
        if (b.isEmpty()) {
            return Float.valueOf(1.0f);
        }
        Rect rect = new Rect();
        if (!view2.getGlobalVisibleRect(rect)) {
            return Float.valueOf(0.0f);
        }
        int height = rect.height() * rect.width();
        HashSet hashSet = new HashSet();
        hashSet.add(rect);
        HashSet<Rect> hashSet2 = hashSet;
        for (View view3 : b) {
            Rect rect2 = new Rect();
            if (view3.getGlobalVisibleRect(rect2)) {
                HashSet hashSet3 = new HashSet();
                for (Rect rect3 : hashSet2) {
                    hashSet3.addAll(a(rect3, rect2));
                }
                hashSet2 = hashSet3;
            }
        }
        int i = 0;
        Iterator it = hashSet2.iterator();
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return Float.valueOf(i2 / height);
            }
            Rect rect4 = (Rect) it.next();
            i = (rect4.height() * rect4.width()) + i2;
        }
    }

    static Set<Rect> a(Rect rect, Rect rect2) {
        HashSet<Rect> hashSet = new HashSet();
        if (!rect2.intersect(rect)) {
            hashSet.add(rect);
            return hashSet;
        }
        hashSet.add(new Rect(rect.left, rect.top, rect2.left, rect.bottom));
        hashSet.add(new Rect(rect2.left, rect.top, rect2.right, rect2.top));
        hashSet.add(new Rect(rect2.right, rect.top, rect.right, rect.bottom));
        hashSet.add(new Rect(rect2.left, rect2.bottom, rect2.right, rect.bottom));
        HashSet hashSet2 = new HashSet();
        for (Rect rect3 : hashSet) {
            if (rect3.width() > 0 && rect3.height() > 0) {
                hashSet2.add(rect3);
            }
        }
        return hashSet2;
    }

    private static List<View> b(View view, View view2) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        stack.push(view);
        boolean z = false;
        while (!stack.empty()) {
            View view3 = (View) stack.pop();
            if (view3.getVisibility() == 0) {
                if (view3 == view2) {
                    z = true;
                } else if (view3 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view3;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        stack.push(viewGroup.getChildAt(childCount));
                    }
                } else if (z || (Build.VERSION.SDK_INT >= 21 && view3.getZ() > view2.getZ())) {
                    linkedList.add(view3);
                }
            }
        }
        return linkedList;
    }
}
