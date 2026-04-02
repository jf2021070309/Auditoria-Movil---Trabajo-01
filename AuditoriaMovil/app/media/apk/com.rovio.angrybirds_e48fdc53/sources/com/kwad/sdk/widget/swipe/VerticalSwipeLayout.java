package com.kwad.sdk.widget.swipe;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.kwad.sdk.core.e.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class VerticalSwipeLayout extends FrameLayout {
    private int aMA;
    private com.kwad.sdk.widget.swipe.a aMB;
    private List<a> aMC;
    private int aMz;
    private float fx;
    private float fy;

    /* loaded from: classes3.dex */
    public interface a {
        void ea();

        void eb();
    }

    public VerticalSwipeLayout(Context context) {
        super(context);
        this.aMA = 0;
        this.aMC = new ArrayList();
        init(context);
    }

    public VerticalSwipeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aMA = 0;
        this.aMC = new ArrayList();
        init(context);
    }

    public VerticalSwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aMA = 0;
        this.aMC = new ArrayList();
        init(context);
    }

    private synchronized void KK() {
        for (a aVar : this.aMC) {
            aVar.eb();
        }
    }

    private synchronized void KL() {
        for (a aVar : this.aMC) {
            aVar.ea();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean c(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            java.lang.String r1 = "VerticalSwipeLayout"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L58
            if (r0 == r2) goto L53
            r4 = 2
            if (r0 == r4) goto L16
            r9 = 3
            if (r0 == r9) goto L13
            goto L79
        L13:
            r8.aMA = r3
            goto L79
        L16:
            float r0 = r9.getX()
            float r5 = r8.fx
            float r0 = r0 - r5
            float r5 = java.lang.Math.abs(r0)
            float r9 = r9.getY()
            float r6 = r8.fy
            float r9 = r9 - r6
            float r6 = java.lang.Math.abs(r9)
            int r7 = r8.aMz
            float r7 = (float) r7
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L41
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L41
            r5 = 0
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L3f
            r8.aMA = r2
            goto L41
        L3f:
            r8.aMA = r4
        L41:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "onInterceptTouchEvent ACTION_MOVE mDragState="
            r9.<init>(r4)
            int r4 = r8.aMA
            r9.append(r4)
            java.lang.String r4 = "--dx="
            r9.append(r4)
            goto L6f
        L53:
            r8.aMA = r3
            java.lang.String r9 = "onInterceptTouchEvent ACTION_UP"
            goto L76
        L58:
            float r0 = r9.getX()
            r8.fx = r0
            float r9 = r9.getY()
            r8.fy = r9
            r8.aMA = r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "onInterceptTouchEvent ACTION_DOWN mInitialMotionX="
            r9.<init>(r0)
            float r0 = r8.fx
        L6f:
            r9.append(r0)
            java.lang.String r9 = r9.toString()
        L76:
            com.kwad.sdk.core.e.c.d(r1, r9)
        L79:
            int r9 = r8.aMA
            if (r9 == 0) goto L7e
            return r2
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.widget.swipe.VerticalSwipeLayout.c(android.view.MotionEvent):boolean");
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
    private boolean d(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            java.lang.String r2 = "VerticalSwipeLayout"
            r3 = 1
            if (r0 == 0) goto L86
            r4 = 2
            if (r0 == r3) goto L59
            if (r0 == r4) goto L18
            r9 = 3
            if (r0 == r9) goto L14
            goto L99
        L14:
            r8.aMA = r1
            goto L99
        L18:
            float r0 = r9.getX()
            float r5 = r8.fx
            float r0 = r0 - r5
            float r5 = java.lang.Math.abs(r0)
            float r9 = r9.getY()
            float r6 = r8.fy
            float r9 = r9 - r6
            float r6 = java.lang.Math.abs(r9)
            int r7 = r8.aMA
            if (r7 != 0) goto L47
            int r7 = r8.aMz
            float r7 = (float) r7
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L47
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L47
            r5 = 0
            int r9 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r9 <= 0) goto L45
            r8.aMA = r3
            goto L47
        L45:
            r8.aMA = r4
        L47:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "onTouchEvent ACTION_MOVE mDragState="
            r9.<init>(r4)
            int r4 = r8.aMA
            r9.append(r4)
            java.lang.String r4 = "--dx="
            r9.append(r4)
            goto L8f
        L59:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "onTouchEvent ACTION_UP mDragState="
            r9.<init>(r0)
            int r0 = r8.aMA
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.kwad.sdk.core.e.c.d(r2, r9)
            java.util.List<com.kwad.sdk.widget.swipe.VerticalSwipeLayout$a> r9 = r8.aMC
            if (r9 == 0) goto L14
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L14
            int r9 = r8.aMA
            if (r9 == 0) goto L14
            if (r9 != r3) goto L80
            r8.KL()
            goto L14
        L80:
            if (r9 != r4) goto L14
            r8.KK()
            goto L14
        L86:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "onTouchEvent ACTION_DOWN mInitialMotionX="
            r9.<init>(r0)
            float r0 = r8.fx
        L8f:
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.kwad.sdk.core.e.c.d(r2, r9)
        L99:
            int r9 = r8.aMA
            if (r9 == 0) goto L9e
            return r3
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kwad.sdk.widget.swipe.VerticalSwipeLayout.d(android.view.MotionEvent):boolean");
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
            c.d("VerticalSwipeLayout", "onInterceptTouchEvent true");
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
            c.d("VerticalSwipeLayout", "handlerTouchEvent true");
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
