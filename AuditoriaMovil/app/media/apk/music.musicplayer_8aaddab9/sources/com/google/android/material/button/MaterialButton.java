package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import c.b.i.f;
import c.i.k.d0;
import e.d.b.d.r.k;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import e.d.b.d.w.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class MaterialButton extends f implements Checkable, n {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4578c = {16842911};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4579d = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public final e.d.b.d.h.a f4580e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<a> f4581f;

    /* renamed from: g  reason: collision with root package name */
    public b f4582g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f4583h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f4584i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f4585j;

    /* renamed from: k  reason: collision with root package name */
    public int f4586k;

    /* renamed from: l  reason: collision with root package name */
    public int f4587l;

    /* renamed from: m  reason: collision with root package name */
    public int f4588m;

    /* renamed from: n  reason: collision with root package name */
    public int f4589n;
    public boolean o;
    public boolean p;
    public int q;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f4590c;

        /* loaded from: classes2.dex */
        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.f4590c = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeInt(this.f4590c ? 1 : 0);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes2.dex */
    public interface b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131887077), attributeSet, R.attr.materialButtonStyle);
        this.f4581f = new LinkedHashSet<>();
        this.o = false;
        this.p = false;
        Context context2 = getContext();
        TypedArray d2 = k.d(context2, attributeSet, e.d.b.d.b.f6323l, R.attr.materialButtonStyle, 2131887077, new int[0]);
        this.f4589n = d2.getDimensionPixelSize(12, 0);
        this.f4583h = e.d.b.d.a.U(d2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f4584i = e.d.b.d.a.C(getContext(), d2, 14);
        this.f4585j = e.d.b.d.a.F(getContext(), d2, 10);
        this.q = d2.getInteger(11, 1);
        this.f4586k = d2.getDimensionPixelSize(13, 0);
        e.d.b.d.h.a aVar = new e.d.b.d.h.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131887077).a());
        this.f4580e = aVar;
        aVar.f6382e = d2.getDimensionPixelOffset(1, 0);
        aVar.f6383f = d2.getDimensionPixelOffset(2, 0);
        aVar.f6384g = d2.getDimensionPixelOffset(3, 0);
        aVar.f6385h = d2.getDimensionPixelOffset(4, 0);
        if (d2.hasValue(8)) {
            int dimensionPixelSize = d2.getDimensionPixelSize(8, -1);
            aVar.f6386i = dimensionPixelSize;
            aVar.e(aVar.f6381d.e(dimensionPixelSize));
            aVar.r = true;
        }
        aVar.f6387j = d2.getDimensionPixelSize(20, 0);
        aVar.f6388k = e.d.b.d.a.U(d2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f6389l = e.d.b.d.a.C(getContext(), d2, 6);
        aVar.f6390m = e.d.b.d.a.C(getContext(), d2, 19);
        aVar.f6391n = e.d.b.d.a.C(getContext(), d2, 16);
        aVar.s = d2.getBoolean(5, false);
        aVar.u = d2.getDimensionPixelSize(9, 0);
        AtomicInteger atomicInteger = d0.a;
        int f2 = d0.d.f(this);
        int paddingTop = getPaddingTop();
        int e2 = d0.d.e(this);
        int paddingBottom = getPaddingBottom();
        if (d2.hasValue(0)) {
            aVar.q = true;
            setSupportBackgroundTintList(aVar.f6389l);
            setSupportBackgroundTintMode(aVar.f6388k);
        } else {
            aVar.g();
        }
        d0.d.k(this, f2 + aVar.f6382e, paddingTop + aVar.f6384g, e2 + aVar.f6383f, paddingBottom + aVar.f6385h);
        d2.recycle();
        setCompoundDrawablePadding(this.f4589n);
        g(this.f4585j != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        e.d.b.d.h.a aVar = this.f4580e;
        return aVar != null && aVar.s;
    }

    public final boolean b() {
        int i2 = this.q;
        return i2 == 3 || i2 == 4;
    }

    public final boolean c() {
        int i2 = this.q;
        return i2 == 1 || i2 == 2;
    }

    public final boolean d() {
        int i2 = this.q;
        return i2 == 16 || i2 == 32;
    }

    public final boolean e() {
        e.d.b.d.h.a aVar = this.f4580e;
        return (aVar == null || aVar.q) ? false : true;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.f4585j, null, null, null);
        } else if (b()) {
            setCompoundDrawablesRelative(null, null, this.f4585j, null);
        } else if (d()) {
            setCompoundDrawablesRelative(null, this.f4585j, null, null);
        }
    }

    public final void g(boolean z) {
        Drawable drawable = this.f4585j;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = c.i.a.q0(drawable).mutate();
            this.f4585j = mutate;
            c.i.a.j0(mutate, this.f4584i);
            PorterDuff.Mode mode = this.f4583h;
            if (mode != null) {
                c.i.a.k0(this.f4585j, mode);
            }
            int i2 = this.f4586k;
            if (i2 == 0) {
                i2 = this.f4585j.getIntrinsicWidth();
            }
            int i3 = this.f4586k;
            if (i3 == 0) {
                i3 = this.f4585j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f4585j;
            int i4 = this.f4587l;
            int i5 = this.f4588m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f4585j.setVisible(true, z);
        }
        if (z) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.f4585j) && ((!b() || drawable5 == this.f4585j) && (!d() || drawable4 == this.f4585j))) {
            z2 = false;
        }
        if (z2) {
            f();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f4580e.f6386i;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f4585j;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.f4589n;
    }

    public int getIconSize() {
        return this.f4586k;
    }

    public ColorStateList getIconTint() {
        return this.f4584i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f4583h;
    }

    public int getInsetBottom() {
        return this.f4580e.f6385h;
    }

    public int getInsetTop() {
        return this.f4580e.f6384g;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f4580e.f6391n;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.f4580e.f6381d;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f4580e.f6390m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f4580e.f6387j;
        }
        return 0;
    }

    @Override // c.b.i.f, c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.f4580e.f6389l : super.getSupportBackgroundTintList();
    }

    @Override // c.b.i.f, c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.f4580e.f6388k : super.getSupportBackgroundTintMode();
    }

    public final void h(int i2, int i3) {
        if (this.f4585j == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f4587l = 0;
                if (this.q == 16) {
                    this.f4588m = 0;
                    g(false);
                    return;
                }
                int i4 = this.f4586k;
                if (i4 == 0) {
                    i4 = this.f4585j.getIntrinsicHeight();
                }
                int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i4) - this.f4589n) - getPaddingBottom()) / 2;
                if (this.f4588m != textHeight) {
                    this.f4588m = textHeight;
                    g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f4588m = 0;
        int i5 = this.q;
        if (i5 == 1 || i5 == 3) {
            this.f4587l = 0;
            g(false);
            return;
        }
        int i6 = this.f4586k;
        if (i6 == 0) {
            i6 = this.f4585j.getIntrinsicWidth();
        }
        int textWidth = i2 - getTextWidth();
        AtomicInteger atomicInteger = d0.a;
        int e2 = ((((textWidth - d0.d.e(this)) - i6) - this.f4589n) - d0.d.f(this)) / 2;
        if ((d0.d.d(this) == 1) != (this.q == 4)) {
            e2 = -e2;
        }
        if (this.f4587l != e2) {
            this.f4587l = e2;
            g(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.o;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            e.d.b.d.a.d0(this, this.f4580e.b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f4578c);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f4579d);
        }
        return onCreateDrawableState;
    }

    @Override // c.b.i.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // c.b.i.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // c.b.i.f, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        e.d.b.d.h.a aVar;
        super.onLayout(z, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.f4580e) == null) {
            return;
        }
        int i6 = i5 - i3;
        int i7 = i4 - i2;
        Drawable drawable = aVar.o;
        if (drawable != null) {
            drawable.setBounds(aVar.f6382e, aVar.f6384g, i7 - aVar.f6383f, i6 - aVar.f6385h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        setChecked(savedState.f4590c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4590c = this.o;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        h(i2, i3);
    }

    @Override // c.b.i.f, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f4585j != null) {
            if (this.f4585j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!e()) {
            super.setBackgroundColor(i2);
            return;
        }
        e.d.b.d.h.a aVar = this.f4580e;
        if (aVar.b() != null) {
            aVar.b().setTint(i2);
        }
    }

    @Override // c.b.i.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
        } else {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            e.d.b.d.h.a aVar = this.f4580e;
            aVar.q = true;
            aVar.f6380c.setSupportBackgroundTintList(aVar.f6389l);
            aVar.f6380c.setSupportBackgroundTintMode(aVar.f6388k);
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // c.b.i.f, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (e()) {
            this.f4580e.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.o != z) {
            this.o = z;
            refreshDrawableState();
            if (this.p) {
                return;
            }
            this.p = true;
            Iterator<a> it = this.f4581f.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.o);
            }
            this.p = false;
        }
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            e.d.b.d.h.a aVar = this.f4580e;
            if (aVar.r && aVar.f6386i == i2) {
                return;
            }
            aVar.f6386i = i2;
            aVar.r = true;
            aVar.e(aVar.f6381d.e(i2));
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            g b2 = this.f4580e.b();
            g.b bVar = b2.f6591c;
            if (bVar.o != f2) {
                bVar.o = f2;
                b2.x();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f4585j != drawable) {
            this.f4585j = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.q != i2) {
            this.q = i2;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f4589n != i2) {
            this.f4589n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? c.b.d.a.a.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f4586k != i2) {
            this.f4586k = i2;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f4584i != colorStateList) {
            this.f4584i = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f4583h != mode) {
            this.f4583h = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(c.b.d.a.a.a(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        e.d.b.d.h.a aVar = this.f4580e;
        aVar.f(aVar.f6384g, i2);
    }

    public void setInsetTop(int i2) {
        e.d.b.d.h.a aVar = this.f4580e;
        aVar.f(i2, aVar.f6385h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f4582g = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f4582g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            e.d.b.d.h.a aVar = this.f4580e;
            if (aVar.f6391n != colorStateList) {
                aVar.f6391n = colorStateList;
                boolean z = e.d.b.d.h.a.a;
                if (z && (aVar.f6380c.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f6380c.getBackground()).setColor(e.d.b.d.u.b.a(colorStateList));
                } else if (z || !(aVar.f6380c.getBackground() instanceof e.d.b.d.u.a)) {
                } else {
                    ((e.d.b.d.u.a) aVar.f6380c.getBackground()).setTintList(e.d.b.d.u.b.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            setRippleColor(c.b.d.a.a.a(getContext(), i2));
        }
    }

    @Override // e.d.b.d.w.n
    public void setShapeAppearanceModel(j jVar) {
        if (!e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f4580e.e(jVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            e.d.b.d.h.a aVar = this.f4580e;
            aVar.p = z;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            e.d.b.d.h.a aVar = this.f4580e;
            if (aVar.f6390m != colorStateList) {
                aVar.f6390m = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            setStrokeColor(c.b.d.a.a.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            e.d.b.d.h.a aVar = this.f4580e;
            if (aVar.f6387j != i2) {
                aVar.f6387j = i2;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // c.b.i.f, c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        e.d.b.d.h.a aVar = this.f4580e;
        if (aVar.f6389l != colorStateList) {
            aVar.f6389l = colorStateList;
            if (aVar.b() != null) {
                c.i.a.j0(aVar.b(), aVar.f6389l);
            }
        }
    }

    @Override // c.b.i.f, c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        e.d.b.d.h.a aVar = this.f4580e;
        if (aVar.f6388k != mode) {
            aVar.f6388k = mode;
            if (aVar.b() == null || aVar.f6388k == null) {
                return;
            }
            c.i.a.k0(aVar.b(), aVar.f6388k);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.o);
    }
}
