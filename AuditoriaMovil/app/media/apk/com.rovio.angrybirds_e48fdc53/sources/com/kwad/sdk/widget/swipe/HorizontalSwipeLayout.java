package com.kwad.sdk.widget.swipe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.kwad.sdk.core.e.c;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public class HorizontalSwipeLayout extends FrameLayout {
    private int aMA;
    private com.kwad.sdk.widget.swipe.a aMB;
    private List<a> aMC;
    private int aMz;
    private float fx;
    private float fy;

    /* loaded from: classes3.dex */
    public interface a {
        void dE();

        void dF();
    }

    public HorizontalSwipeLayout(Context context) {
        super(context);
        this.aMA = 0;
        this.aMC = new CopyOnWriteArrayList();
        init(context);
    }

    public HorizontalSwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aMA = 0;
        this.aMC = new CopyOnWriteArrayList();
        init(context);
    }

    public HorizontalSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aMA = 0;
        this.aMC = new CopyOnWriteArrayList();
        init(context);
    }

    private synchronized void KG() {
        for (a aVar : this.aMC) {
            aVar.dF();
        }
    }

    private synchronized void KH() {
        for (a aVar : this.aMC) {
            aVar.dE();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            java.lang.String r1 = "HorizontalSwipeLayout"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L58
            if (r0 == r2) goto L53
            r4 = 2
            if (r0 == r4) goto L16
            r8 = 3
            if (r0 == r8) goto L13
            goto L79
        L13:
            r7.aMA = r3
            goto L79
        L16:
            float r0 = r8.getX()
            float r5 = r7.fx
            float r0 = r0 - r5
            float r5 = java.lang.Math.abs(r0)
            float r8 = r8.getY()
            float r6 = r7.fy
            float r8 = r8 - r6
            float r8 = java.lang.Math.abs(r8)
            int r6 = r7.aMz
            float r6 = (float) r6
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L41
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L41
            r8 = 0
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L3f
            r7.aMA = r2
            goto L41
        L3f:
            r7.aMA = r4
        L41:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "onInterceptTouchEvent ACTION_MOVE mDragState="
            r8.<init>(r4)
            int r4 = r7.aMA
            r8.append(r4)
            java.lang.String r4 = "--dx="
            r8.append(r4)
            goto L6f
        L53:
            r7.aMA = r3
            java.lang.String r8 = "onInterceptTouchEvent ACTION_UP"
            goto L76
        L58:
            float r0 = r8.getX()
            r7.fx = r0
            float r8 = r8.getY()
            r7.fy = r8
            r7.aMA = r3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "onInterceptTouchEvent ACTION_DOWN mInitialMotionX="
            r8.<init>(r0)
            float r0 = r7.fx
        L6f:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
        L76:
            com.kwad.sdk.core.e.c.d(r1, r8)
        L79:
            int r8 = r7.aMA
            if (r8 == 0) goto L7e
            return r2
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.widget.swipe.HorizontalSwipeLayout.c(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r0 != 3) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean d(android.view.MotionEvent r8) {
        /*
            r7 = this;
            int r0 = r8.getAction()
            r1 = 0
            java.lang.String r2 = "HorizontalSwipeLayout"
            r3 = 1
            if (r0 == 0) goto L86
            r4 = 2
            if (r0 == r3) goto L59
            if (r0 == r4) goto L18
            r8 = 3
            if (r0 == r8) goto L14
            goto L99
        L14:
            r7.aMA = r1
            goto L99
        L18:
            float r0 = r8.getX()
            float r5 = r7.fx
            float r0 = r0 - r5
            float r5 = java.lang.Math.abs(r0)
            float r8 = r8.getY()
            float r6 = r7.fy
            float r8 = r8 - r6
            float r8 = java.lang.Math.abs(r8)
            int r6 = r7.aMA
            if (r6 != 0) goto L47
            int r6 = r7.aMz
            float r6 = (float) r6
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L47
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 <= 0) goto L47
            r8 = 0
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 <= 0) goto L45
            r7.aMA = r3
            goto L47
        L45:
            r7.aMA = r4
        L47:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "onTouchEvent ACTION_MOVE mDragState="
            r8.<init>(r4)
            int r4 = r7.aMA
            r8.append(r4)
            java.lang.String r4 = "--dx="
            r8.append(r4)
            goto L8f
        L59:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "onTouchEvent ACTION_UP mDragState="
            r8.<init>(r0)
            int r0 = r7.aMA
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.kwad.sdk.core.e.c.d(r2, r8)
            java.util.List<com.kwad.sdk.widget.swipe.HorizontalSwipeLayout$a> r8 = r7.aMC
            if (r8 == 0) goto L14
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L14
            int r8 = r7.aMA
            if (r8 == 0) goto L14
            if (r8 != r3) goto L80
            r7.KH()
            goto L14
        L80:
            if (r8 != r4) goto L14
            r7.KG()
            goto L14
        L86:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "onTouchEvent ACTION_DOWN mInitialMotionX="
            r8.<init>(r0)
            float r0 = r7.fx
        L8f:
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.kwad.sdk.core.e.c.d(r2, r8)
        L99:
            int r8 = r7.aMA
            if (r8 == 0) goto L9e
            return r3
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.widget.swipe.HorizontalSwipeLayout.d(android.view.MotionEvent):boolean");
    }

    private void init(Context context) {
        this.aMz = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public final synchronized void a(a aVar) {
        this.aMC.add(aVar);
    }

    public final synchronized void b(a aVar) {
        this.aMC.remove(aVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        List<a> list = this.aMC;
        if (list != null && !list.isEmpty()) {
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                parent = getParent();
            } else if (action == 1 || action == 3) {
                parent = getParent();
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public synchronized List<a> getOnSwipedListeners() {
        return this.aMC;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.kwad.sdk.widget.swipe.a aVar = this.aMB;
        if (aVar != null && aVar.b(this, motionEvent)) {
            c.d("HorizontalSwipeLayout", "onInterceptTouchEvent true");
            return true;
        }
        List<a> list = this.aMC;
        if (list == null || list.isEmpty() || !c(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.kwad.sdk.widget.swipe.a aVar = this.aMB;
        if (aVar != null && aVar.c(this, motionEvent)) {
            c.d("HorizontalSwipeLayout", "handlerTouchEvent true");
            return true;
        }
        List<a> list = this.aMC;
        if (list == null || list.isEmpty() || !d(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setTouchDetector(com.kwad.sdk.widget.swipe.a aVar) {
        this.aMB = aVar;
    }
}
