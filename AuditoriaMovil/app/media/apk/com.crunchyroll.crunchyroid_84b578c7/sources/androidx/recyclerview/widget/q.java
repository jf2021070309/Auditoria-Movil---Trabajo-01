package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e4.t0;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: ItemTouchHelper.java */
/* loaded from: classes.dex */
public final class q extends RecyclerView.o implements RecyclerView.r {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final d m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public com.amazon.aps.iva.p3.e x;
    public e y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public RecyclerView.f0 c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final a s = new a();
    public View w = null;
    public final b z = new b();

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
            if (r11 < 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
            if (r11 > 0) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class b implements RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void c(boolean z) {
            if (!z) {
                return;
            }
            q.this.p(null, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void d(MotionEvent motionEvent) {
            q qVar = q.this;
            qVar.x.a(motionEvent);
            VelocityTracker velocityTracker = qVar.t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (qVar.l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(qVar.l);
            if (findPointerIndex >= 0) {
                qVar.h(actionMasked, findPointerIndex, motionEvent);
            }
            RecyclerView.f0 f0Var = qVar.c;
            if (f0Var == null) {
                return;
            }
            int i = 0;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == qVar.l) {
                                if (actionIndex == 0) {
                                    i = 1;
                                }
                                qVar.l = motionEvent.getPointerId(i);
                                qVar.q(qVar.o, actionIndex, motionEvent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    VelocityTracker velocityTracker2 = qVar.t;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else if (findPointerIndex >= 0) {
                    qVar.q(qVar.o, findPointerIndex, motionEvent);
                    qVar.n(f0Var);
                    RecyclerView recyclerView = qVar.r;
                    a aVar = qVar.s;
                    recyclerView.removeCallbacks(aVar);
                    aVar.run();
                    qVar.r.invalidate();
                    return;
                } else {
                    return;
                }
            }
            qVar.p(null, 0);
            qVar.l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final boolean e(MotionEvent motionEvent) {
            int findPointerIndex;
            q qVar = q.this;
            qVar.x.a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                qVar.l = motionEvent.getPointerId(0);
                qVar.d = motionEvent.getX();
                qVar.e = motionEvent.getY();
                VelocityTracker velocityTracker = qVar.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                qVar.t = VelocityTracker.obtain();
                if (qVar.c == null) {
                    ArrayList arrayList = qVar.p;
                    if (!arrayList.isEmpty()) {
                        View k = qVar.k(motionEvent);
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = (f) arrayList.get(size);
                            if (fVar2.e.itemView == k) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        qVar.d -= fVar.i;
                        qVar.e -= fVar.j;
                        RecyclerView.f0 f0Var = fVar.e;
                        qVar.j(f0Var, true);
                        if (qVar.a.remove(f0Var.itemView)) {
                            qVar.m.clearView(qVar.r, f0Var);
                        }
                        qVar.p(f0Var, fVar.f);
                        qVar.q(qVar.o, 0, motionEvent);
                    }
                }
            } else if (actionMasked != 3 && actionMasked != 1) {
                int i = qVar.l;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    qVar.h(actionMasked, findPointerIndex, motionEvent);
                }
            } else {
                qVar.l = -1;
                qVar.p(null, 0);
            }
            VelocityTracker velocityTracker2 = qVar.t;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (qVar.c != null) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class c extends f {
        public final /* synthetic */ int n;
        public final /* synthetic */ RecyclerView.f0 o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.f0 f0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.f0 f0Var2) {
            super(f0Var, i2, f, f2, f3, f4);
            this.n = i3;
            this.o = f0Var2;
        }

        @Override // androidx.recyclerview.widget.q.f, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.k) {
                return;
            }
            int i = this.n;
            RecyclerView.f0 f0Var = this.o;
            q qVar = q.this;
            if (i <= 0) {
                qVar.m.clearView(qVar.r, f0Var);
            } else {
                qVar.a.add(f0Var.itemView);
                this.h = true;
                if (i > 0) {
                    qVar.r.post(new r(qVar, this, i));
                }
            }
            View view = qVar.w;
            View view2 = f0Var.itemView;
            if (view == view2) {
                qVar.o(view2);
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean b = true;

        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            q qVar;
            View k;
            RecyclerView.f0 childViewHolder;
            if (!this.b || (k = (qVar = q.this).k(motionEvent)) == null || (childViewHolder = qVar.r.getChildViewHolder(k)) == null || !qVar.m.hasDragFlag(qVar.r, childViewHolder)) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            int i = qVar.l;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                qVar.d = x;
                qVar.e = y;
                qVar.i = 0.0f;
                qVar.h = 0.0f;
                if (qVar.m.isLongPressDragEnabled()) {
                    qVar.p(childViewHolder, 2);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class g extends d {
        public final int a = 16;
        public final int b = 0;

        @Override // androidx.recyclerview.widget.q.d
        public final int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            return d.makeMovementFlags(this.b, this.a);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public interface h {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public q(d dVar) {
        this.m = dVar;
    }

    public static boolean m(View view, float f2, float f3, float f4, float f5) {
        if (f2 >= f4 && f2 <= f4 + view.getWidth() && f3 >= f5 && f3 <= f5 + view.getHeight()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(View view) {
        o(view);
        RecyclerView.f0 childViewHolder = this.r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.f0 f0Var = this.c;
        if (f0Var != null && childViewHolder == f0Var) {
            p(null, 0);
            return;
        }
        j(childViewHolder, false);
        if (this.a.remove(childViewHolder.itemView)) {
            this.m.clearView(this.r, childViewHolder);
        }
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        b bVar = this.z;
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.r.removeOnItemTouchListener(bVar);
            this.r.removeOnChildAttachStateChangeListener(this);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                f fVar = (f) arrayList.get(0);
                fVar.g.cancel();
                this.m.clearView(this.r, fVar.e);
            }
            arrayList.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            e eVar = this.y;
            if (eVar != null) {
                eVar.b = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.addItemDecoration(this);
            this.r.addOnItemTouchListener(bVar);
            this.r.addOnChildAttachStateChangeListener(this);
            this.y = new e();
            this.x = new com.amazon.aps.iva.p3.e(this.r.getContext(), this.y);
        }
    }

    public final int g(RecyclerView.f0 f0Var, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.h > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.t;
            d dVar = this.m;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= dVar.getSwipeEscapeVelocity(this.f) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float swipeThreshold = dVar.getSwipeThreshold(f0Var) * this.r.getWidth();
            if ((i & i2) != 0 && Math.abs(this.h) > swipeThreshold) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.setEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r9, int r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.h(int, int, android.view.MotionEvent):void");
    }

    public final int i(RecyclerView.f0 f0Var, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.i > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.t;
            d dVar = this.m;
            if (velocityTracker != null && this.l > -1) {
                velocityTracker.computeCurrentVelocity(1000, dVar.getSwipeVelocityThreshold(this.g));
                float xVelocity = this.t.getXVelocity(this.l);
                float yVelocity = this.t.getYVelocity(this.l);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= dVar.getSwipeEscapeVelocity(this.f) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float swipeThreshold = dVar.getSwipeThreshold(f0Var) * this.r.getHeight();
            if ((i & i2) != 0 && Math.abs(this.i) > swipeThreshold) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final void j(RecyclerView.f0 f0Var, boolean z) {
        f fVar;
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
            } else {
                return;
            }
        } while (fVar.e != f0Var);
        fVar.k |= z;
        if (!fVar.l) {
            fVar.g.cancel();
        }
        arrayList.remove(size);
    }

    public final View k(MotionEvent motionEvent) {
        f fVar;
        View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.f0 f0Var = this.c;
        if (f0Var != null) {
            View view2 = f0Var.itemView;
            if (m(view2, x, y, this.j + this.h, this.k + this.i)) {
                return view2;
            }
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        do {
            size--;
            if (size >= 0) {
                fVar = (f) arrayList.get(size);
                view = fVar.e.itemView;
            } else {
                return this.r.findChildViewUnder(x, y);
            }
        } while (!m(view, x, y, fVar.i, fVar.j));
        return view;
    }

    public final void l(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.itemView.getLeft();
        } else {
            fArr[0] = this.c.itemView.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.itemView.getTop();
        } else {
            fArr[1] = this.c.itemView.getTranslationY();
        }
    }

    public final void n(RecyclerView.f0 f0Var) {
        int i;
        int i2;
        int i3;
        if (this.r.isLayoutRequested() || this.n != 2) {
            return;
        }
        d dVar = this.m;
        float moveThreshold = dVar.getMoveThreshold(f0Var);
        int i4 = (int) (this.j + this.h);
        int i5 = (int) (this.k + this.i);
        if (Math.abs(i5 - f0Var.itemView.getTop()) < f0Var.itemView.getHeight() * moveThreshold && Math.abs(i4 - f0Var.itemView.getLeft()) < f0Var.itemView.getWidth() * moveThreshold) {
            return;
        }
        ArrayList arrayList = this.u;
        if (arrayList == null) {
            this.u = new ArrayList();
            this.v = new ArrayList();
        } else {
            arrayList.clear();
            this.v.clear();
        }
        int boundingBoxMargin = dVar.getBoundingBoxMargin();
        int round = Math.round(this.j + this.h) - boundingBoxMargin;
        int round2 = Math.round(this.k + this.i) - boundingBoxMargin;
        int i6 = boundingBoxMargin * 2;
        int width = f0Var.itemView.getWidth() + round + i6;
        int height = f0Var.itemView.getHeight() + round2 + i6;
        int i7 = (round + width) / 2;
        int i8 = (round2 + height) / 2;
        RecyclerView.p layoutManager = this.r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = layoutManager.getChildAt(i9);
            if (childAt != f0Var.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                RecyclerView.f0 childViewHolder = this.r.getChildViewHolder(childAt);
                i2 = round;
                i3 = round2;
                if (dVar.canDropOver(this.r, this.c, childViewHolder)) {
                    int abs = Math.abs(i7 - ((childAt.getRight() + childAt.getLeft()) / 2));
                    int abs2 = Math.abs(i8 - ((childAt.getBottom() + childAt.getTop()) / 2));
                    int i10 = (abs2 * abs2) + (abs * abs);
                    int size = this.u.size();
                    i = i7;
                    int i11 = 0;
                    int i12 = 0;
                    while (i12 < size) {
                        int i13 = size;
                        if (i10 <= ((Integer) this.v.get(i12)).intValue()) {
                            break;
                        }
                        i11++;
                        i12++;
                        size = i13;
                    }
                    this.u.add(i11, childViewHolder);
                    this.v.add(i11, Integer.valueOf(i10));
                } else {
                    i = i7;
                }
            } else {
                i = i7;
                i2 = round;
                i3 = round2;
            }
            i9++;
            round = i2;
            round2 = i3;
            i7 = i;
        }
        ArrayList arrayList2 = this.u;
        if (arrayList2.size() == 0) {
            return;
        }
        RecyclerView.f0 chooseDropTarget = dVar.chooseDropTarget(f0Var, arrayList2, i4, i5);
        if (chooseDropTarget == null) {
            this.u.clear();
            this.v.clear();
            return;
        }
        int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = f0Var.getAbsoluteAdapterPosition();
        if (dVar.onMove(this.r, f0Var, chooseDropTarget)) {
            this.m.onMoved(this.r, f0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i4, i5);
        }
    }

    public final void o(View view) {
        if (view == this.w) {
            this.w = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @SuppressLint({"UnknownNullness"})
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f2;
        float f3;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDraw(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        float f2;
        float f3;
        if (this.c != null) {
            float[] fArr = this.b;
            l(fArr);
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.m.onDrawOver(canvas, recyclerView, this.c, this.p, this.n, f2, f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r2 > 0) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(androidx.recyclerview.widget.RecyclerView.f0 r25, int r26) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.q.p(androidx.recyclerview.widget.RecyclerView$f0, int):void");
    }

    public final void q(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.d;
        this.h = f2;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper.java */
        /* loaded from: classes.dex */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        public RecyclerView.f0 chooseDropTarget(RecyclerView.f0 f0Var, List<RecyclerView.f0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = f0Var.itemView.getWidth() + i;
            int height = f0Var.itemView.getHeight() + i2;
            int left2 = i - f0Var.itemView.getLeft();
            int top2 = i2 - f0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.f0 f0Var2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.f0 f0Var3 = list.get(i4);
                if (left2 > 0 && (right = f0Var3.itemView.getRight() - width) < 0 && f0Var3.itemView.getRight() > f0Var.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = f0Var3.itemView.getLeft() - i) > 0 && f0Var3.itemView.getLeft() < f0Var.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = f0Var3.itemView.getTop() - i2) > 0 && f0Var3.itemView.getTop() < f0Var.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = f0Var3.itemView.getBottom() - height) < 0 && f0Var3.itemView.getBottom() > f0Var.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    f0Var2 = f0Var3;
                    i3 = abs;
                }
            }
            return f0Var2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            View view = f0Var.itemView;
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                g0.i.s(view, floatValue);
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & 3158064) >> 2;
            }
            return i5 | i3;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            int movementFlags = getMovementFlags(recyclerView, f0Var);
            WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
            return convertToAbsoluteDirection(movementFlags, g0.e.d(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.e;
            } else {
                return itemAnimator.d;
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var);

        public float getSwipeThreshold(RecyclerView.f0 f0Var) {
            return 0.5f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
            if ((getAbsoluteMovementFlags(recyclerView, f0Var) & 16711680) != 0) {
                return true;
            }
            return false;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int maxDragScroll = getMaxDragScroll(recyclerView);
            float f = 1.0f;
            int interpolation = (int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * maxDragScroll);
            if (j <= 2000) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation2 = (int) (sDragScrollInterpolator.getInterpolation(f) * interpolation);
            if (interpolation2 == 0) {
                if (i2 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation2;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, float f, float f2, int i, boolean z) {
            View view = f0Var.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                WeakHashMap<View, r0> weakHashMap = com.amazon.aps.iva.p3.g0.a;
                Float valueOf = Float.valueOf(g0.i.i(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        WeakHashMap<View, r0> weakHashMap2 = com.amazon.aps.iva.p3.g0.a;
                        float i3 = g0.i.i(childAt);
                        if (i3 > f3) {
                            f3 = i3;
                        }
                    }
                }
                g0.i.s(view, f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.f0 f0Var, float f, float f2, int i, boolean z) {
            View view = f0Var.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<f> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                float f3 = fVar.a;
                float f4 = fVar.c;
                int i3 = (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1));
                RecyclerView.f0 f0Var2 = fVar.e;
                if (i3 == 0) {
                    fVar.i = f0Var2.itemView.getTranslationX();
                } else {
                    fVar.i = t0.a(f4, f3, fVar.m, f3);
                }
                float f5 = fVar.b;
                float f6 = fVar.d;
                if (f5 == f6) {
                    fVar.j = f0Var2.itemView.getTranslationY();
                } else {
                    fVar.j = t0.a(f6, f5, fVar.m, f5);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.e, fVar.i, fVar.j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, f0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.f0 f0Var, List<f> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.e, fVar.i, fVar.j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (f0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, f0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                f fVar2 = list.get(i3);
                boolean z2 = fVar2.l;
                if (z2 && !fVar2.h) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.f0 f0Var, int i, RecyclerView.f0 f0Var2, int i2, int i3, int i4) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).prepareForDrop(f0Var.itemView, f0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(f0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(f0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(f0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(f0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public abstract void onSwiped(RecyclerView.f0 f0Var, int i);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public void onSelectedChanged(RecyclerView.f0 f0Var, int i) {
        }
    }

    /* compiled from: ItemTouchHelper.java */
    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.f0 e;
        public final int f;
        public final ValueAnimator g;
        public boolean h;
        public float i;
        public float j;
        public boolean k = false;
        public boolean l = false;
        public float m;

        public f(RecyclerView.f0 f0Var, int i, float f, float f2, float f3, float f4) {
            this.f = i;
            this.e = f0Var;
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.g = ofFloat;
            ofFloat.addUpdateListener(new s(this));
            ofFloat.setTarget(f0Var.itemView);
            ofFloat.addListener(this);
            this.m = 0.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.m = 1.0f;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.setIsRecyclable(true);
            }
            this.l = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(View view) {
    }
}
