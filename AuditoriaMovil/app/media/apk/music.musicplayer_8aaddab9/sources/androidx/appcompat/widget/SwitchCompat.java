package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.b.b;
import c.b.i.a1;
import c.b.i.e0;
import c.b.i.g1;
import c.b.i.v0;
import c.b.i.y;
import c.i.k.b0;
import c.i.k.d0;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final Property<SwitchCompat, Float> a = new a(Float.class, "thumbPos");

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f233b = {16842912};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final TextPaint H;
    public ColorStateList I;
    public Layout J;
    public Layout K;
    public TransformationMethod L;
    public ObjectAnimator M;
    public final y N;
    public final Rect O;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f234c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f235d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f236e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f237f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f238g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f239h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f240i;

    /* renamed from: j  reason: collision with root package name */
    public PorterDuff.Mode f241j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f242k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f243l;

    /* renamed from: m  reason: collision with root package name */
    public int f244m;

    /* renamed from: n  reason: collision with root package name */
    public int f245n;
    public int o;
    public boolean p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public int u;
    public float v;
    public float w;
    public VelocityTracker x;
    public int y;
    public float z;

    /* loaded from: classes.dex */
    public class a extends Property<SwitchCompat, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.z);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f2) {
            switchCompat.setThumbPosition(f2.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        int resourceId;
        this.f235d = null;
        this.f236e = null;
        this.f237f = false;
        this.f238g = false;
        this.f240i = null;
        this.f241j = null;
        this.f242k = false;
        this.f243l = false;
        this.x = VelocityTracker.obtain();
        this.O = new Rect();
        v0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.H = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = b.v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        a1 a1Var = new a1(context, obtainStyledAttributes);
        d0.z(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle, 0);
        Drawable g2 = a1Var.g(2);
        this.f234c = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        Drawable g3 = a1Var.g(11);
        this.f239h = g3;
        if (g3 != null) {
            g3.setCallback(this);
        }
        this.q = a1Var.n(0);
        this.r = a1Var.n(1);
        this.s = a1Var.a(3, true);
        this.f244m = a1Var.f(8, 0);
        this.f245n = a1Var.f(5, 0);
        this.o = a1Var.f(6, 0);
        this.p = a1Var.a(4, false);
        ColorStateList c2 = a1Var.c(9);
        if (c2 != null) {
            this.f235d = c2;
            this.f237f = true;
        }
        PorterDuff.Mode d2 = e0.d(a1Var.j(10, -1), null);
        if (this.f236e != d2) {
            this.f236e = d2;
            this.f238g = true;
        }
        if (this.f237f || this.f238g) {
            a();
        }
        ColorStateList c3 = a1Var.c(12);
        if (c3 != null) {
            this.f240i = c3;
            this.f242k = true;
        }
        PorterDuff.Mode d3 = e0.d(a1Var.j(13, -1), null);
        if (this.f241j != d3) {
            this.f241j = d3;
            this.f243l = true;
        }
        if (this.f242k || this.f243l) {
            b();
        }
        int l2 = a1Var.l(7, 0);
        if (l2 != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(l2, b.w);
            ColorStateList colorStateList = (!obtainStyledAttributes2.hasValue(3) || (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = c.b.d.a.a.a(context, resourceId)) == null) ? obtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.I = colorStateList;
            } else {
                this.I = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int i2 = obtainStyledAttributes2.getInt(1, -1);
            int i3 = obtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i3 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(defaultFromStyle);
                int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i3;
                textPaint.setFakeBoldText((style & 1) != 0);
                textPaint.setTextSkewX((2 & style) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes2.getBoolean(14, false)) {
                this.L = new c.b.g.a(getContext());
            } else {
                this.L = null;
            }
            obtainStyledAttributes2.recycle();
        }
        y yVar = new y(this);
        this.N = yVar;
        yVar.e(attributeSet, R.attr.switchStyle);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((g1.a(this) ? 1.0f - this.z : this.z) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f239h;
        if (drawable != null) {
            Rect rect = this.O;
            drawable.getPadding(rect);
            Drawable drawable2 = this.f234c;
            Rect c2 = drawable2 != null ? e0.c(drawable2) : e0.f1131c;
            return ((((this.A - this.C) - rect.left) - rect.right) - c2.left) - c2.right;
        }
        return 0;
    }

    public final void a() {
        Drawable drawable = this.f234c;
        if (drawable != null) {
            if (this.f237f || this.f238g) {
                Drawable mutate = c.i.a.q0(drawable).mutate();
                this.f234c = mutate;
                if (this.f237f) {
                    c.i.a.j0(mutate, this.f235d);
                }
                if (this.f238g) {
                    c.i.a.k0(this.f234c, this.f236e);
                }
                if (this.f234c.isStateful()) {
                    this.f234c.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f239h;
        if (drawable != null) {
            if (this.f242k || this.f243l) {
                Drawable mutate = c.i.a.q0(drawable).mutate();
                this.f239h = mutate;
                if (this.f242k) {
                    c.i.a.j0(mutate, this.f240i);
                }
                if (this.f243l) {
                    c.i.a.k0(this.f239h, this.f241j);
                }
                if (this.f239h.isStateful()) {
                    this.f239h.setState(getDrawableState());
                }
            }
        }
    }

    public final Layout c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.L;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.H;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.r;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            AtomicInteger atomicInteger = d0.a;
            new b0(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        int i3;
        Rect rect = this.O;
        int i4 = this.D;
        int i5 = this.E;
        int i6 = this.F;
        int i7 = this.G;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.f234c;
        Rect c2 = drawable != null ? e0.c(drawable) : e0.f1131c;
        Drawable drawable2 = this.f239h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i8 = rect.left;
            thumbOffset += i8;
            if (c2 != null) {
                int i9 = c2.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = c2.top;
                int i11 = rect.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = c2.right;
                int i13 = rect.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = c2.bottom;
                int i15 = rect.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f239h.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f239h.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.f234c;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i16 = thumbOffset - rect.left;
            int i17 = thumbOffset + this.C + rect.right;
            this.f234c.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                c.i.a.b0(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.f234c;
        if (drawable != null) {
            c.i.a.a0(drawable, f2, f3);
        }
        Drawable drawable2 = this.f239h;
        if (drawable2 != null) {
            c.i.a.a0(drawable2, f2, f3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f234c;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f239h;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.q;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            AtomicInteger atomicInteger = d0.a;
            new b0(R.id.tag_state_description, CharSequence.class, 64, 30).e(this, obj);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (g1.a(this)) {
            int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
            return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.o : compoundPaddingLeft;
        }
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g1.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.o : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.p;
    }

    public int getSwitchMinWidth() {
        return this.f245n;
    }

    public int getSwitchPadding() {
        return this.o;
    }

    public CharSequence getTextOff() {
        return this.r;
    }

    public CharSequence getTextOn() {
        return this.q;
    }

    public Drawable getThumbDrawable() {
        return this.f234c;
    }

    public int getThumbTextPadding() {
        return this.f244m;
    }

    public ColorStateList getThumbTintList() {
        return this.f235d;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f236e;
    }

    public Drawable getTrackDrawable() {
        return this.f239h;
    }

    public ColorStateList getTrackTintList() {
        return this.f240i;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f241j;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f234c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f239h;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.M.end();
        this.M = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f233b);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.O;
        Drawable drawable = this.f239h;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.E;
        int i3 = this.G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f234c;
        if (drawable != null) {
            if (!this.p || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c2 = e0.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c2.left;
                rect.right -= c2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.J : this.K;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.I;
            if (colorStateList != null) {
                this.H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i4 + i5) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.q : this.r;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int width;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i2, i3, i4, i5);
        int i10 = 0;
        if (this.f234c != null) {
            Rect rect = this.O;
            Drawable drawable = this.f239h;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c2 = e0.c(this.f234c);
            i6 = Math.max(0, c2.left - rect.left);
            i10 = Math.max(0, c2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (g1.a(this)) {
            i7 = getPaddingLeft() + i6;
            width = ((this.A + i7) - i6) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i7 = (width - this.A) + i6 + i10;
        }
        int gravity = getGravity() & SyslogConstants.LOG_ALERT;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.B;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            i8 = i11 + height;
            i9 = height;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.B + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.B;
        }
        this.D = i7;
        this.E = i9;
        this.G = i8;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (this.s) {
            if (this.J == null) {
                this.J = c(this.q);
            }
            if (this.K == null) {
                this.K = c(this.r);
            }
        }
        Rect rect = this.O;
        Drawable drawable = this.f234c;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f234c.getIntrinsicWidth() - rect.left) - rect.right;
            i5 = this.f234c.getIntrinsicHeight();
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (this.s) {
            i6 = (this.f244m * 2) + Math.max(this.J.getWidth(), this.K.getWidth());
        } else {
            i6 = 0;
        }
        this.C = Math.max(i6, i4);
        Drawable drawable2 = this.f239h;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f239h.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f234c;
        if (drawable3 != null) {
            Rect c2 = e0.c(drawable3);
            i8 = Math.max(i8, c2.left);
            i9 = Math.max(i9, c2.right);
        }
        int max = Math.max(this.f245n, (this.C * 2) + i8 + i9);
        int max2 = Math.max(i7, i5);
        this.A = max;
        this.B = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.q : this.r;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            e();
        } else {
            d();
        }
        if (getWindowToken() != null) {
            AtomicInteger atomicInteger = d0.a;
            if (d0.f.c(this)) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, a, isChecked ? 1.0f : 0.0f);
                this.M = ofFloat;
                ofFloat.setDuration(250L);
                this.M.setAutoCancel(true);
                this.M.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.M;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(isChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.i.a.r0(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.p = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.f245n = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.o = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.H.getTypeface() == null || this.H.getTypeface().equals(typeface)) && (this.H.getTypeface() != null || typeface == null)) {
            return;
        }
        this.H.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.r = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        d();
    }

    public void setTextOn(CharSequence charSequence) {
        this.q = charSequence;
        requestLayout();
        if (isChecked()) {
            e();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f234c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f234c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.z = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(c.b.d.a.a.b(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.f244m = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f235d = colorStateList;
        this.f237f = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f236e = mode;
        this.f238g = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f239h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f239h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(c.b.d.a.a.b(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f240i = colorStateList;
        this.f242k = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f241j = mode;
        this.f243l = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f234c || drawable == this.f239h;
    }
}
