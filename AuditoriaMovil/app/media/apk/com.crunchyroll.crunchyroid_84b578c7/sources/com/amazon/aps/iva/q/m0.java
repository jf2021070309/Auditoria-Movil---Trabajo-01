package com.amazon.aps.iva.q;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
/* compiled from: ForwardingListener.java */
/* loaded from: classes.dex */
public abstract class m0 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float b;
    public final int c;
    public final int d;
    public final View e;
    public a f;
    public b g;
    public boolean h;
    public int i;
    public final int[] j = new int[2];

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = m0.this.e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* compiled from: ForwardingListener.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m0 m0Var = m0.this;
            m0Var.a();
            View view = m0Var.e;
            if (view.isEnabled() && !view.isLongClickable() && m0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                m0Var.h = true;
            }
        }
    }

    public m0(View view) {
        this.e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.c = tapTimeout;
        this.d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.g;
        View view = this.e;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract com.amazon.aps.iva.p.f b();

    public abstract boolean c();

    public boolean d() {
        com.amazon.aps.iva.p.f b2 = b();
        if (b2 != null && b2.a()) {
            b2.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r4 != 3) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q.m0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        a aVar = this.f;
        if (aVar != null) {
            this.e.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
