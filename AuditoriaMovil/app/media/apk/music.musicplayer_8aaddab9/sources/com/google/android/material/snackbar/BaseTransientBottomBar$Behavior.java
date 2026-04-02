package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e.d.b.d.x.a;
import e.d.b.d.x.d;
import e.d.b.d.x.e;
import java.util.Objects;
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final a f4665h = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean B(View view) {
        Objects.requireNonNull(this.f4665h);
        return view instanceof d;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f4665h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.a == null) {
                    e.a = new e();
                }
                synchronized (e.a.f6680b) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.a == null) {
                e.a = new e();
            }
            synchronized (e.a.f6680b) {
            }
        }
        return super.j(coordinatorLayout, view, motionEvent);
    }
}
