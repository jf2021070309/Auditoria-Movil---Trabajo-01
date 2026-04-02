package c.i.k;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f2215b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f2216c;

    public x(View view, Runnable runnable) {
        this.a = view;
        this.f2215b = view.getViewTreeObserver();
        this.f2216c = runnable;
    }

    public static x a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        x xVar = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(xVar);
        view.addOnAttachStateChangeListener(xVar);
        return xVar;
    }

    public void b() {
        if (this.f2215b.isAlive()) {
            this.f2215b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f2216c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f2215b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
