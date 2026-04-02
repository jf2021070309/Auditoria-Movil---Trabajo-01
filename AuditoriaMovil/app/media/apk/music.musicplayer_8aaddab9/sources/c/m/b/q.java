package c.m.b;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
public class q extends AnimationSet implements Runnable {
    public final ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final View f2401b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2402c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2403d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2404e;

    public q(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2404e = true;
        this.a = viewGroup;
        this.f2401b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation) {
        this.f2404e = true;
        if (this.f2402c) {
            return !this.f2403d;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f2402c = true;
            c.i.k.x.a(this.a, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f2404e = true;
        if (this.f2402c) {
            return !this.f2403d;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f2402c = true;
            c.i.k.x.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2402c || !this.f2404e) {
            this.a.endViewTransition(this.f2401b);
            this.f2403d = true;
            return;
        }
        this.f2404e = false;
        this.a.post(this);
    }
}
