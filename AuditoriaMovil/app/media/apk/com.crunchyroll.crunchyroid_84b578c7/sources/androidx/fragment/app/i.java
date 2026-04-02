package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import com.amazon.aps.iva.p3.x;
/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public final class i {
    public static int a(int i, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class a {
        public final Animation a;
        public final Animator b;

        public a(Animation animation) {
            this.a = animation;
            this.b = null;
        }

        public a(Animator animator) {
            this.a = null;
            this.b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {
        public final ViewGroup b;
        public final View c;
        public boolean d;
        public boolean e;
        public boolean f;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.b = viewGroup;
            this.c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                x.a(this.b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z = this.d;
            ViewGroup viewGroup = this.b;
            if (!z && this.f) {
                this.f = false;
                viewGroup.post(this);
                return;
            }
            viewGroup.endViewTransition(this.c);
            this.e = true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                x.a(this.b, this);
            }
            return true;
        }
    }
}
