package c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import c.i.k.d0;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class c extends b0 {

    /* loaded from: classes.dex */
    public class a extends l {
        public final /* synthetic */ View a;

        public a(c cVar, View view) {
            this.a = view;
        }

        @Override // c.z.i.d
        public void c(i iVar) {
            View view = this.a;
            z zVar = t.a;
            zVar.e(view, 1.0f);
            zVar.a(this.a);
            iVar.y(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2870b = false;

        public b(View view) {
            this.a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.a.e(this.a, 1.0f);
            if (this.f2870b) {
                this.a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.a;
            AtomicInteger atomicInteger = c.i.k.d0.a;
            if (d0.c.h(view) && this.a.getLayerType() == 0) {
                this.f2870b = true;
                this.a.setLayerType(2, null);
            }
        }
    }

    public c() {
    }

    public c(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.y = i2;
    }

    @Override // c.z.b0
    public Animator N(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        t.a.c(view);
        Float f2 = (Float) qVar.a.get("android:fade:transitionAlpha");
        return O(view, f2 != null ? f2.floatValue() : 1.0f, 0.0f);
    }

    public final Animator O(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        t.a.e(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, t.f2912b, f3);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // c.z.i
    public void g(q qVar) {
        K(qVar);
        qVar.a.put("android:fade:transitionAlpha", Float.valueOf(t.a(qVar.f2907b)));
    }
}
