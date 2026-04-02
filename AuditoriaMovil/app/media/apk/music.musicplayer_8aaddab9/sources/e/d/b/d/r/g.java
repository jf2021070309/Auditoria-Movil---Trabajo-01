package e.d.b.d.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class g {
    public final ArrayList<b> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f6527b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f6528c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f6529d = new a();

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            g gVar = g.this;
            if (gVar.f6528c == animator) {
                gVar.f6528c = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public final int[] a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f6530b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.f6530b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f6529d);
        this.a.add(bVar);
    }
}
