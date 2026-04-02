package c.b.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* loaded from: classes.dex */
public abstract class h0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1157b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1158c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1159d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1160e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f1161f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1162g;

    /* renamed from: h  reason: collision with root package name */
    public int f1163h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f1164i = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = h0.this.f1159d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0 h0Var = h0.this;
            h0Var.a();
            View view = h0Var.f1159d;
            if (view.isEnabled() && !view.isLongClickable() && h0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                h0Var.f1162g = true;
            }
        }
    }

    public h0(View view) {
        this.f1159d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1157b = tapTimeout;
        this.f1158c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1161f;
        if (runnable != null) {
            this.f1159d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1160e;
        if (runnable2 != null) {
            this.f1159d.removeCallbacks(runnable2);
        }
    }

    public abstract c.b.h.i.p b();

    public abstract boolean c();

    public boolean d() {
        c.b.h.i.p b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r4 != 3) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.i.h0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1162g = false;
        this.f1163h = -1;
        Runnable runnable = this.f1160e;
        if (runnable != null) {
            this.f1159d.removeCallbacks(runnable);
        }
    }
}
