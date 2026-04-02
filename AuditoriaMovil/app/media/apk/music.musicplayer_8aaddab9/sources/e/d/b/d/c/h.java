package e.d.b.d.c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* loaded from: classes2.dex */
public class h {
    public long a;

    /* renamed from: b  reason: collision with root package name */
    public long f6335b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f6336c;

    /* renamed from: d  reason: collision with root package name */
    public int f6337d;

    /* renamed from: e  reason: collision with root package name */
    public int f6338e;

    public h(long j2, long j3) {
        this.a = 0L;
        this.f6335b = 300L;
        this.f6336c = null;
        this.f6337d = 0;
        this.f6338e = 1;
        this.a = j2;
        this.f6335b = j3;
    }

    public h(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f6335b = 300L;
        this.f6336c = null;
        this.f6337d = 0;
        this.f6338e = 1;
        this.a = j2;
        this.f6335b = j3;
        this.f6336c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.f6335b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f6337d);
            valueAnimator.setRepeatMode(this.f6338e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f6336c;
        return timeInterpolator != null ? timeInterpolator : a.f6327b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.a == hVar.a && this.f6335b == hVar.f6335b && this.f6337d == hVar.f6337d && this.f6338e == hVar.f6338e) {
                return b().getClass().equals(hVar.b().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f6335b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f6337d) * 31) + this.f6338e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\n');
        sb.append(h.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.f6335b);
        sb.append(" interpolator: ");
        sb.append(b().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f6337d);
        sb.append(" repeatMode: ");
        return e.a.d.a.a.p(sb, this.f6338e, "}\n");
    }
}
