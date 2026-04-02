package e.d.b.d.q;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class g extends d {
    public g(FloatingActionButton floatingActionButton, e.d.b.d.v.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // e.d.b.d.q.d
    public float e() {
        return this.y.getElevation();
    }

    @Override // e.d.b.d.q.d
    public void f(Rect rect) {
        if (FloatingActionButton.this.f4655k) {
            super.f(rect);
        } else if (s()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (0 - this.y.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // e.d.b.d.q.d
    public void i() {
    }

    @Override // e.d.b.d.q.d
    public void j() {
        u();
        throw null;
    }

    @Override // e.d.b.d.q.d
    public void k(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.y.isEnabled()) {
                this.y.setElevation(0.0f);
                this.y.setTranslationZ(0.0f);
                return;
            }
            this.y.setElevation(this.f6491k);
            if (this.y.isPressed()) {
                this.y.setTranslationZ(this.f6493m);
            } else if (this.y.isFocused() || this.y.isHovered()) {
                this.y.setTranslationZ(this.f6492l);
            } else {
                this.y.setTranslationZ(0.0f);
            }
        }
    }

    @Override // e.d.b.d.q.d
    public void l(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.y.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.f6482b, v(f2, f4));
            stateListAnimator.addState(d.f6483c, v(f2, f3));
            stateListAnimator.addState(d.f6484d, v(f2, f3));
            stateListAnimator.addState(d.f6485e, v(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.y;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.a);
            stateListAnimator.addState(d.f6486f, animatorSet);
            stateListAnimator.addState(d.f6487g, v(0.0f, 0.0f));
            this.y.setStateListAnimator(stateListAnimator);
        }
        if (q()) {
            u();
            throw null;
        }
    }

    @Override // e.d.b.d.q.d
    public void p(ColorStateList colorStateList) {
    }

    @Override // e.d.b.d.q.d
    public boolean q() {
        return FloatingActionButton.this.f4655k || !s();
    }

    @Override // e.d.b.d.q.d
    public void t() {
    }

    public final Animator v(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.y, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.y, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(d.a);
        return animatorSet;
    }
}
