package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
/* loaded from: classes2.dex */
class z {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;

    z() {
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x015d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float a(android.view.View r8, android.content.Context r9, boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.z.a(android.view.View, android.content.Context, boolean, boolean, boolean):float");
    }

    static float a(View view, Rect rect, float f, boolean z) {
        View view2;
        boolean z2;
        float f2;
        float f3;
        float f4;
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();
        ArrayList arrayList = new ArrayList();
        linkedList3.add(rect);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        View rootView = view.getRootView();
        try {
            view2 = ((Activity) view.getContext()).findViewById(16908290);
        } catch (Exception e) {
            view2 = null;
        }
        while (viewGroup != null && viewGroup.getParent() != rootView) {
            if (viewGroup.getVisibility() == 0 && a(viewGroup) != 0.0f) {
                if (view2 == null || !z || viewGroup == view2 || (viewGroup.getLayoutParams().height != 0 && viewGroup.getLayoutParams().width != 0)) {
                    linkedList.addFirst(viewGroup);
                    viewGroup = (ViewGroup) viewGroup.getParent();
                } else {
                    return f;
                }
            } else {
                return f;
            }
        }
        if (viewGroup != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                View view3 = (View) it.next();
                ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                if (viewGroup2 != null) {
                    if (!"viewpager".equalsIgnoreCase(viewGroup2.getClass().getSimpleName()) && (r0 = viewGroup2.indexOfChild(view3)) < viewGroup2.getChildCount() - 1) {
                        while (true) {
                            int indexOfChild = indexOfChild + 1;
                            if (indexOfChild < viewGroup2.getChildCount()) {
                                View childAt = viewGroup2.getChildAt(indexOfChild);
                                if (!c(childAt)) {
                                    if (childAt.getVisibility() == 0 && a(childAt) != 0.0f) {
                                        linkedList4.addFirst(childAt);
                                    }
                                } else {
                                    ArrayList<View> b2 = b(childAt);
                                    if (b2 != null) {
                                        linkedList4.addAll(0, b2);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return f;
                }
            }
            Iterator it2 = linkedList4.iterator();
            float f5 = 0.0f;
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    f2 = f5;
                    break;
                }
                View view4 = (View) it2.next();
                if (f5 >= f) {
                    z2 = false;
                    f2 = f5;
                    break;
                }
                if (view4 != null) {
                    if (view4.getTag() != null && ((String) view4.getTag()).contains("BTN_CLOSE")) {
                    }
                }
                Rect rect2 = new Rect();
                if (view4.getGlobalVisibleRect(rect2)) {
                    if (z) {
                        rect2.top++;
                    }
                    if (rect2.intersect(rect)) {
                        linkedList2.add(rect2);
                        f4 = rect2.width() * rect2.height();
                        if (f4 >= f) {
                            f2 = f4;
                            z2 = true;
                            break;
                        }
                    } else {
                        f4 = f5;
                    }
                    f5 = f4;
                } else {
                    continue;
                }
            }
            if (!z2) {
                if (!linkedList2.isEmpty()) {
                    if (linkedList2.size() == 1) {
                        return f2;
                    }
                    Iterator it3 = linkedList2.iterator();
                    while (it3.hasNext()) {
                        Rect rect3 = (Rect) it3.next();
                        arrayList.clear();
                        arrayList.addAll(linkedList3);
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < arrayList.size()) {
                                Rect rect4 = (Rect) arrayList.get(i2);
                                if (rect3.intersect(rect4)) {
                                    linkedList3.remove(arrayList.get(i2));
                                    for (int i3 = 1; i3 < 9; i3++) {
                                        Rect a2 = a(rect4, rect3, i3);
                                        if (a2.height() > 0 && a2.width() > 0) {
                                            linkedList3.add(a2);
                                        }
                                    }
                                }
                                i = i2 + 1;
                            }
                        }
                    }
                    if (!linkedList3.isEmpty()) {
                        float f6 = 0.0f;
                        Iterator it4 = linkedList3.iterator();
                        while (true) {
                            f3 = f6;
                            if (!it4.hasNext()) {
                                break;
                            }
                            Rect rect5 = (Rect) it4.next();
                            f6 = (rect5.height() * rect5.width()) + f3;
                        }
                        if (f3 < f) {
                            return f - f3;
                        }
                    }
                }
                return f2;
            }
            return f;
        }
        return f;
    }

    static Rect a(Rect rect, Rect rect2, int i) {
        Rect rect3 = new Rect();
        switch (i) {
            case 1:
                rect3.set(rect.left, rect.top, rect2.left, rect2.top);
                break;
            case 2:
                rect3.set(rect2.left, rect.top, rect2.right, rect2.top);
                break;
            case 3:
                rect3.set(rect2.right, rect.top, rect.right, rect2.top);
                break;
            case 4:
                rect3.set(rect2.right, rect2.top, rect.right, rect2.bottom);
                break;
            case 5:
                rect3.set(rect2.right, rect2.bottom, rect.right, rect.bottom);
                break;
            case 6:
                rect3.set(rect2.left, rect2.bottom, rect2.right, rect.bottom);
                break;
            case 7:
                rect3.set(rect.left, rect2.bottom, rect2.left, rect.bottom);
                break;
            case 8:
                rect3.set(rect.left, rect2.top, rect2.left, rect2.bottom);
                break;
        }
        return rect3;
    }

    static float a(View view) {
        if (view == null) {
            return 0.0f;
        }
        if (a() < 11) {
            return 1.0f;
        }
        return view.getAlpha();
    }

    private static ArrayList<View> b(View view) {
        if (view instanceof ViewGroup) {
            if (view.getVisibility() != 0 || a(view) == 0.0f) {
                return null;
            }
            LinkedList linkedList = new LinkedList();
            ArrayList<View> arrayList = new ArrayList<>();
            linkedList.add((ViewGroup) view);
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                ViewGroup viewGroup = (ViewGroup) listIterator.next();
                listIterator.remove();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0 && a(childAt) != 0.0f) {
                        if (childAt instanceof ViewGroup) {
                            if (c(childAt)) {
                                listIterator.add((ViewGroup) childAt);
                                listIterator.previous();
                            } else {
                                arrayList.add(childAt);
                            }
                        } else if (!c(childAt)) {
                            arrayList.add(childAt);
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        return null;
    }

    private static boolean c(View view) {
        if (view == null) {
            return false;
        }
        return view.getBackground() == null || (a() > 18 && view.getBackground().getAlpha() == 0);
    }

    public static int a(Context context) {
        int i;
        int height;
        if (context == null) {
            i = -1;
        } else {
            i = context.getResources().getConfiguration().orientation;
        }
        if (i == 2 && a > 0) {
            return a;
        }
        if (i == 1 && c > 0) {
            return c;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
            if (a() >= 13) {
                height = a.a(windowManager);
            } else {
                height = windowManager.getDefaultDisplay().getHeight();
            }
            if (i == 2) {
                a = height;
                return height;
            } else if (i == 1) {
                c = height;
                return height;
            } else {
                return height;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int b(Context context) {
        int i;
        int width;
        if (context == null) {
            i = -1;
        } else {
            i = context.getResources().getConfiguration().orientation;
        }
        if (i == 2 && b > 0) {
            return b;
        }
        if (i == 1 && d > 0) {
            return d;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
            if (a() >= 13) {
                width = b.a(windowManager);
            } else {
                width = windowManager.getDefaultDisplay().getWidth();
            }
            if (i == 2) {
                b = width;
                return width;
            } else if (i == 1) {
                d = width;
                return width;
            } else {
                return width;
            }
        } catch (Exception e) {
            return 0;
        }
    }

    public static int a() {
        return Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b {
        private b() {
        }

        public static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.x;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a {
        private a() {
        }

        public static int a(WindowManager windowManager) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            return point.y;
        }
    }
}
