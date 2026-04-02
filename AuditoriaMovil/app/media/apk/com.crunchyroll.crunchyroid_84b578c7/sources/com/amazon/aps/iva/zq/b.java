package com.amazon.aps.iva.zq;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.gr.l;
import com.amazon.aps.iva.gr.p;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedList;
/* compiled from: GesturesListener.kt */
/* loaded from: classes2.dex */
public final class b implements GestureDetector.OnGestureListener {
    public static final String j = defpackage.e.e("We could not find a valid target for the ", com.amazon.aps.iva.sq.d.TAP.name(), " event.The DecorView was empty and either transparent or not clickable for this Activity.");
    public static final String k = com.amazon.aps.iva.e4.e.b("We could not find a valid target for the ", com.amazon.aps.iva.sq.d.SCROLL.name(), " or ", com.amazon.aps.iva.sq.d.SWIPE.name(), " event. The DecorView was empty and either transparent or not clickable for this Activity.");
    public final WeakReference<Window> b;
    public final p[] c;
    public final l d;
    public final int[] e;
    public com.amazon.aps.iva.sq.d f;
    public WeakReference<View> g;
    public float h;
    public float i;

    public b(WeakReference<Window> weakReference, p[] pVarArr, l lVar) {
        j.f(pVarArr, "attributesProviders");
        j.f(lVar, "interactionPredicate");
        this.b = weakReference;
        this.c = pVarArr;
        this.d = lVar;
        this.e = new int[2];
        this.g = new WeakReference<>(null);
    }

    public static void a(ViewGroup viewGroup, float f, float f2, LinkedList linkedList, int[] iArr) {
        int childCount = viewGroup.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            j.e(childAt, "child");
            childAt.getLocationInWindow(iArr);
            int i3 = iArr[0];
            boolean z = true;
            int i4 = iArr[1];
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            if (f < i3 || f > i3 + width || f2 < i4 || f2 > i4 + height) {
                z = false;
            }
            if (z) {
                linkedList.add(childAt);
            }
            i = i2;
        }
    }

    public final LinkedHashMap b(View view, String str, MotionEvent motionEvent) {
        String str2;
        LinkedHashMap V = i0.V(new com.amazon.aps.iva.kb0.j("action.target.classname", x.h0(view)), new com.amazon.aps.iva.kb0.j("action.target.resource_id", str));
        if (motionEvent != null) {
            float x = motionEvent.getX() - this.h;
            float y = motionEvent.getY() - this.i;
            if (Math.abs(x) > Math.abs(y)) {
                if (x > 0.0f) {
                    str2 = "right";
                } else {
                    str2 = "left";
                }
            } else if (y > 0.0f) {
                str2 = "down";
            } else {
                str2 = "up";
            }
            V.put("action.gesture.direction", str2);
        }
        p[] pVarArr = this.c;
        int length = pVarArr.length;
        int i = 0;
        while (i < length) {
            p pVar = pVarArr[i];
            i++;
            pVar.a(view, V);
        }
        return V;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        j.f(motionEvent, "e");
        this.g.clear();
        this.f = null;
        this.i = 0.0f;
        this.h = 0.0f;
        this.h = motionEvent.getX();
        this.i = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        j.f(motionEvent, "startDownEvent");
        j.f(motionEvent2, "endUpEvent");
        this.f = com.amazon.aps.iva.sq.d.SWIPE;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        j.f(motionEvent, "e");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[EDGE_INSN: B:42:0x00a3->B:39:0x00a3 ?: BREAK  , SYNTHETIC] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12) {
        /*
            r8 = this;
            java.lang.String r11 = "startDownEvent"
            com.amazon.aps.iva.yb0.j.f(r9, r11)
            java.lang.String r11 = "currentMoveEvent"
            com.amazon.aps.iva.yb0.j.f(r10, r11)
            com.amazon.aps.iva.sq.f r10 = com.amazon.aps.iva.sq.c.c
            java.lang.ref.WeakReference<android.view.Window> r11 = r8.b
            java.lang.Object r11 = r11.get()
            android.view.Window r11 = (android.view.Window) r11
            r12 = 0
            if (r11 != 0) goto L19
            r11 = r12
            goto L1d
        L19:
            android.view.View r11 = r11.getDecorView()
        L1d:
            r0 = 0
            if (r11 != 0) goto L21
            return r0
        L21:
            com.amazon.aps.iva.sq.d r1 = r8.f
            if (r1 != 0) goto Lc6
            float r1 = r9.getX()
            float r9 = r9.getY()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r2.add(r11)
            r11 = 1
            r3 = r11
        L37:
            boolean r4 = r2.isEmpty()
            r4 = r4 ^ r11
            if (r4 == 0) goto L99
            java.lang.Object r4 = r2.removeFirst()
            android.view.View r4 = (android.view.View) r4
            boolean r5 = r2.isEmpty()
            java.lang.String r6 = "view"
            if (r5 == 0) goto L60
            com.amazon.aps.iva.yb0.j.e(r4, r6)
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "androidx.compose.ui.platform.ComposeView"
            boolean r5 = com.amazon.aps.iva.oe0.m.h0(r5, r7, r0)
            if (r5 == 0) goto L60
            r3 = r0
        L60:
            com.amazon.aps.iva.yb0.j.e(r4, r6)
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L89
            java.lang.Class r5 = r4.getClass()
            java.lang.Class<com.amazon.aps.iva.p3.z> r6 = com.amazon.aps.iva.p3.z.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 != 0) goto L84
            java.lang.Class r5 = r4.getClass()
            java.lang.Class<android.widget.AbsListView> r6 = android.widget.AbsListView.class
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L82
            goto L84
        L82:
            r5 = r0
            goto L85
        L84:
            r5 = r11
        L85:
            if (r5 == 0) goto L89
            r5 = r11
            goto L8a
        L89:
            r5 = r0
        L8a:
            if (r5 == 0) goto L8d
            goto La3
        L8d:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L37
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int[] r5 = r8.e
            a(r4, r1, r9, r2, r5)
            goto L37
        L99:
            if (r3 == 0) goto La2
            com.amazon.aps.iva.iq.a r9 = com.amazon.aps.iva.dq.c.b
            java.lang.String r11 = com.amazon.aps.iva.zq.b.k
            com.amazon.aps.iva.iq.a.b(r9, r11)
        La2:
            r4 = r12
        La3:
            if (r4 == 0) goto Lc6
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r4)
            r8.g = r9
            int r9 = r4.getId()
            java.lang.String r9 = com.amazon.aps.iva.ab.x.e0(r9)
            java.util.LinkedHashMap r9 = r8.b(r4, r9, r12)
            com.amazon.aps.iva.sq.d r11 = com.amazon.aps.iva.sq.d.SCROLL
            com.amazon.aps.iva.gr.l r12 = r8.d
            com.amazon.aps.iva.ab.x.d0(r12, r4)
            java.lang.String r12 = ""
            r10.q(r11, r12, r9)
            r8.f = r11
        Lc6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.zq.b.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        j.f(motionEvent, "e");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View decorView;
        boolean z;
        j.f(motionEvent, "e");
        Window window = this.b.get();
        View view = null;
        if (window == null) {
            decorView = null;
        } else {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            LinkedList linkedList = new LinkedList();
            linkedList.addFirst(decorView);
            boolean z2 = true;
            while (!linkedList.isEmpty()) {
                View view2 = (View) linkedList.removeFirst();
                if (linkedList.isEmpty()) {
                    j.e(view2, "view");
                    if (m.h0(view2.getClass().getName(), "androidx.compose.ui.platform.ComposeView", false)) {
                        z2 = false;
                    }
                }
                j.e(view2, "view");
                if (view2.isClickable() && view2.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    view = view2;
                }
                if (view2 instanceof ViewGroup) {
                    a((ViewGroup) view2, x, y, linkedList, this.e);
                }
            }
            if (view == null && z2) {
                com.amazon.aps.iva.iq.a.b(com.amazon.aps.iva.dq.c.b, j);
            }
            if (view != null) {
                LinkedHashMap V = i0.V(new com.amazon.aps.iva.kb0.j("action.target.classname", x.h0(view)), new com.amazon.aps.iva.kb0.j("action.target.resource_id", x.e0(view.getId())));
                p[] pVarArr = this.c;
                int length = pVarArr.length;
                int i = 0;
                while (i < length) {
                    p pVar = pVarArr[i];
                    i++;
                    pVar.a(view, V);
                }
                com.amazon.aps.iva.sq.f fVar = com.amazon.aps.iva.sq.c.c;
                com.amazon.aps.iva.sq.d dVar = com.amazon.aps.iva.sq.d.TAP;
                x.d0(this.d, view);
                fVar.d(dVar, "", V);
            }
        }
        return false;
    }
}
