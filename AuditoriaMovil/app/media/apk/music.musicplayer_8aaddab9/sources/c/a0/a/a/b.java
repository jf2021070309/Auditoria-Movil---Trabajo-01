package c.a0.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class b extends f implements Animatable {

    /* renamed from: b  reason: collision with root package name */
    public C0012b f697b;

    /* renamed from: c  reason: collision with root package name */
    public Context f698c;

    /* renamed from: d  reason: collision with root package name */
    public ArgbEvaluator f699d;

    /* renamed from: e  reason: collision with root package name */
    public final Drawable.Callback f700e;

    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: c.a0.a.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0012b extends Drawable.ConstantState {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public g f701b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f702c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f703d;

        /* renamed from: e  reason: collision with root package name */
        public c.f.a<Animator, String> f704e;

        public C0012b(C0012b c0012b, Drawable.Callback callback, Resources resources) {
            if (c0012b != null) {
                this.a = c0012b.a;
                g gVar = c0012b.f701b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f701b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f701b = (g) constantState.newDrawable();
                    }
                    g gVar2 = this.f701b;
                    gVar2.mutate();
                    this.f701b = gVar2;
                    gVar2.setCallback(callback);
                    this.f701b.setBounds(c0012b.f701b.getBounds());
                    this.f701b.f711g = false;
                }
                ArrayList<Animator> arrayList = c0012b.f703d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f703d = new ArrayList<>(size);
                    this.f704e = new c.f.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = c0012b.f703d.get(i2);
                        Animator clone = animator.clone();
                        String orDefault = c0012b.f704e.getOrDefault(animator, null);
                        clone.setTarget(this.f701b.f707c.f753b.q.getOrDefault(orDefault, null));
                        this.f703d.add(clone);
                        this.f704e.put(clone, orDefault);
                    }
                    if (this.f702c == null) {
                        this.f702c = new AnimatorSet();
                    }
                    this.f702c.playTogether(this.f703d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable();
            bVar.a = newDrawable;
            newDrawable.setCallback(bVar.f700e);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable(resources);
            bVar.a = newDrawable;
            newDrawable.setCallback(bVar.f700e);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b(null, null, null);
            Drawable newDrawable = this.a.newDrawable(resources, theme);
            bVar.a = newDrawable;
            newDrawable.setCallback(bVar.f700e);
            return bVar;
        }
    }

    public b() {
        this(null, null, null);
    }

    public b(Context context, C0012b c0012b, Resources resources) {
        this.f699d = null;
        a aVar = new a();
        this.f700e = aVar;
        this.f698c = context;
        this.f697b = new C0012b(null, aVar, null);
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                a(childAnimations.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f699d == null) {
                    this.f699d = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f699d);
            }
        }
    }

    @Override // c.a0.a.a.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return c.i.a.f(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f697b.f701b.draw(canvas);
        if (this.f697b.f702c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getAlpha() : this.f697b.f701b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f697b.a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.f697b.f701b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f697b.f701b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f697b.f701b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.getOpacity() : this.f697b.f701b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r25, org.xmlpull.v1.XmlPullParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a0.a.a.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isAutoMirrored() : this.f697b.f701b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f697b.f702c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null ? drawable.isStateful() : this.f697b.f701b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f697b.f701b.setBounds(rect);
        }
    }

    @Override // c.a0.a.a.f, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i2) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setLevel(i2) : this.f697b.f701b.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null ? drawable.setState(iArr) : this.f697b.f701b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f697b.f701b.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        g gVar = this.f697b.f701b;
        Drawable drawable2 = gVar.a;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            gVar.f707c.f756e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        g gVar = this.f697b.f701b;
        Drawable drawable2 = gVar.a;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        gVar.f709e = colorFilter;
        gVar.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTint(int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.i0(drawable, i2);
        } else {
            this.f697b.f701b.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.j0(drawable, colorStateList);
        } else {
            this.f697b.f701b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, c.i.e.m.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            c.i.a.k0(drawable, mode);
        } else {
            this.f697b.f701b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f697b.f701b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f697b.f702c.isStarted()) {
        } else {
            this.f697b.f702c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f697b.f702c.end();
        }
    }
}
