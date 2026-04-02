package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import c.b.i.g;
import c.i.k.d0;
import c.i.k.k0.b;
import com.google.android.gms.common.api.CommonStatusCodes;
import e.d.b.d.k.b;
import e.d.b.d.r.k;
import e.d.b.d.t.d;
import e.d.b.d.w.g;
import e.d.b.d.w.j;
import e.d.b.d.w.n;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class Chip extends g implements b.a, n {

    /* renamed from: d  reason: collision with root package name */
    public static final Rect f4606d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4607e = {16842913};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4608f = {16842911};

    /* renamed from: g  reason: collision with root package name */
    public e.d.b.d.k.b f4609g;

    /* renamed from: h  reason: collision with root package name */
    public InsetDrawable f4610h;

    /* renamed from: i  reason: collision with root package name */
    public RippleDrawable f4611i;

    /* renamed from: j  reason: collision with root package name */
    public View.OnClickListener f4612j;

    /* renamed from: k  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f4613k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4614l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4615m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4616n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public final b s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final d w;

    /* loaded from: classes2.dex */
    public class a extends d {
        public a() {
        }

        @Override // e.d.b.d.t.d
        public void a(int i2) {
        }

        @Override // e.d.b.d.t.d
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            e.d.b.d.k.b bVar = chip.f4609g;
            chip.setText(bVar.L0 ? bVar.I : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c.k.a.a {
        public b(Chip chip) {
            super(chip);
        }

        @Override // c.k.a.a
        public void m(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f4606d;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                e.d.b.d.k.b bVar = chip2.f4609g;
                if (bVar != null && bVar.O) {
                    z = true;
                }
                if (!z || chip2.f4612j == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // c.k.a.a
        public boolean p(int i2, int i3, Bundle bundle) {
            if (i3 == 16) {
                if (i2 == 0) {
                    return Chip.this.performClick();
                }
                if (i2 == 1) {
                    return Chip.this.g();
                }
                return false;
            }
            return false;
        }

        @Override // c.k.a.a
        public void q(int i2, c.i.k.k0.b bVar) {
            if (i2 != 1) {
                bVar.f2193b.setContentDescription("");
                bVar.f2193b.setBoundsInParent(Chip.f4606d);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                bVar.f2193b.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                bVar.f2193b.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            }
            bVar.f2193b.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            bVar.a(b.a.a);
            bVar.f2193b.setEnabled(Chip.this.isEnabled());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        super(e.d.b.d.z.a.a.a(context, attributeSet, R.attr.chipStyle, 2131887091), attributeSet, R.attr.chipStyle);
        int resourceId;
        this.u = new Rect();
        this.v = new RectF();
        this.w = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        e.d.b.d.k.b bVar = new e.d.b.d.k.b(context2, attributeSet, R.attr.chipStyle, 2131887091);
        Context context3 = bVar.m0;
        int[] iArr = e.d.b.d.b.f6314c;
        TypedArray d2 = k.d(context3, attributeSet, iArr, R.attr.chipStyle, 2131887091, new int[0]);
        bVar.N0 = d2.hasValue(37);
        ColorStateList C = e.d.b.d.a.C(bVar.m0, d2, 24);
        if (bVar.B != C) {
            bVar.B = C;
            bVar.onStateChange(bVar.getState());
        }
        bVar.P(e.d.b.d.a.C(bVar.m0, d2, 11));
        bVar.W(d2.getDimension(19, 0.0f));
        if (d2.hasValue(12)) {
            bVar.Q(d2.getDimension(12, 0.0f));
        }
        bVar.Y(e.d.b.d.a.C(bVar.m0, d2, 22));
        bVar.Z(d2.getDimension(23, 0.0f));
        bVar.j0(e.d.b.d.a.C(bVar.m0, d2, 36));
        bVar.k0(d2.getText(5));
        e.d.b.d.t.b bVar2 = (!d2.hasValue(0) || (resourceId = d2.getResourceId(0, 0)) == 0) ? null : new e.d.b.d.t.b(bVar.m0, resourceId);
        bVar2.f6568k = d2.getDimension(1, bVar2.f6568k);
        bVar.l0(bVar2);
        int i2 = d2.getInt(3, 0);
        if (i2 == 1) {
            bVar.K0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            bVar.K0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            bVar.K0 = TextUtils.TruncateAt.END;
        }
        bVar.V(d2.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            bVar.V(d2.getBoolean(15, false));
        }
        bVar.S(e.d.b.d.a.F(bVar.m0, d2, 14));
        if (d2.hasValue(17)) {
            bVar.U(e.d.b.d.a.C(bVar.m0, d2, 17));
        }
        bVar.T(d2.getDimension(16, -1.0f));
        bVar.g0(d2.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            bVar.g0(d2.getBoolean(26, false));
        }
        bVar.a0(e.d.b.d.a.F(bVar.m0, d2, 25));
        bVar.f0(e.d.b.d.a.C(bVar.m0, d2, 30));
        bVar.c0(d2.getDimension(28, 0.0f));
        bVar.L(d2.getBoolean(6, false));
        bVar.O(d2.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            bVar.O(d2.getBoolean(8, false));
        }
        bVar.M(e.d.b.d.a.F(bVar.m0, d2, 7));
        if (d2.hasValue(9)) {
            bVar.N(e.d.b.d.a.C(bVar.m0, d2, 9));
        }
        bVar.c0 = e.d.b.d.c.g.a(bVar.m0, d2, 39);
        bVar.d0 = e.d.b.d.c.g.a(bVar.m0, d2, 33);
        bVar.X(d2.getDimension(21, 0.0f));
        bVar.i0(d2.getDimension(35, 0.0f));
        bVar.h0(d2.getDimension(34, 0.0f));
        bVar.n0(d2.getDimension(41, 0.0f));
        bVar.m0(d2.getDimension(40, 0.0f));
        bVar.d0(d2.getDimension(29, 0.0f));
        bVar.b0(d2.getDimension(27, 0.0f));
        bVar.R(d2.getDimension(13, 0.0f));
        bVar.M0 = d2.getDimensionPixelSize(4, Integer.MAX_VALUE);
        d2.recycle();
        k.a(context2, attributeSet, R.attr.chipStyle, 2131887091);
        k.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131887091, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131887091);
        this.p = obtainStyledAttributes.getBoolean(32, false);
        this.r = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(bVar);
        bVar.p(d0.l(this));
        k.a(context2, attributeSet, R.attr.chipStyle, 2131887091);
        k.b(context2, attributeSet, iArr, R.attr.chipStyle, 2131887091, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131887091);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            setTextColor(e.d.b.d.a.C(context2, obtainStyledAttributes2, 2));
        }
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.s = new b(this);
        i();
        if (!hasValue && i3 >= 21) {
            setOutlineProvider(new e.d.b.d.k.a(this));
        }
        setChecked(this.f4614l);
        setText(bVar.I);
        setEllipsize(bVar.K0);
        m();
        if (!this.f4609g.L0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        l();
        if (this.p) {
            setMinHeight(this.r);
        }
        this.q = d0.d.d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.v.setEmpty();
        if (e() && this.f4612j != null) {
            e.d.b.d.k.b bVar = this.f4609g;
            bVar.C(bVar.getBounds(), this.v);
        }
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.u.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.u;
    }

    private e.d.b.d.t.b getTextAppearance() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.s0.f6548f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f4616n != z) {
            this.f4616n = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f4615m != z) {
            this.f4615m = z;
            refreshDrawableState();
        }
    }

    @Override // e.d.b.d.k.b.a
    public void a() {
        d(this.r);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public boolean d(int i2) {
        this.r = i2;
        if (!this.p) {
            if (this.f4610h != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int max = Math.max(0, i2 - ((int) this.f4609g.D));
        int max2 = Math.max(0, i2 - this.f4609g.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f4610h != null) {
                h();
            } else {
                j();
            }
            return false;
        }
        int i3 = max2 > 0 ? max2 / 2 : 0;
        int i4 = max > 0 ? max / 2 : 0;
        if (this.f4610h != null) {
            Rect rect = new Rect();
            this.f4610h.getPadding(rect);
            if (rect.top == i4 && rect.bottom == i4 && rect.left == i3 && rect.right == i3) {
                j();
                return true;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        this.f4610h = new InsetDrawable((Drawable) this.f4609g, i3, i4, i3, i4);
        j();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.t
            if (r0 != 0) goto L9
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L9:
            com.google.android.material.chip.Chip$b r0 = r9.s
            android.view.accessibility.AccessibilityManager r1 = r0.f2262k
            boolean r1 = r1.isEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L74
            android.view.accessibility.AccessibilityManager r1 = r0.f2262k
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1e
            goto L74
        L1e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L44
            r4 = 9
            if (r1 == r4) goto L44
            r4 = 10
            if (r1 == r4) goto L34
            goto L74
        L34:
            int r1 = r0.p
            if (r1 == r7) goto L74
            if (r1 != r7) goto L3b
            goto L72
        L3b:
            r0.p = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L72
        L44:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L62
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = b(r8)
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            int r4 = r0.p
            if (r4 != r1) goto L68
            goto L70
        L68:
            r0.p = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L70:
            if (r1 == r7) goto L74
        L72:
            r0 = 1
            goto L75
        L74:
            r0 = 0
        L75:
            if (r0 != 0) goto L7d
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L7e
        L7d:
            r2 = 1
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.t) {
            b bVar = this.s;
            Objects.requireNonNull(bVar);
            boolean z = false;
            int i2 = 0;
            z = false;
            z = false;
            z = false;
            z = false;
            z = false;
            if (keyEvent.getAction() != 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 61) {
                    int i3 = 66;
                    if (keyCode != 66) {
                        switch (keyCode) {
                            case 19:
                            case 20:
                            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                            case 22:
                                if (keyEvent.hasNoModifiers()) {
                                    if (keyCode == 19) {
                                        i3 = 33;
                                    } else if (keyCode == 21) {
                                        i3 = 17;
                                    } else if (keyCode != 22) {
                                        i3 = 130;
                                    }
                                    int repeatCount = keyEvent.getRepeatCount() + 1;
                                    boolean z2 = false;
                                    while (i2 < repeatCount && bVar.n(i3, null)) {
                                        i2++;
                                        z2 = true;
                                    }
                                    z = z2;
                                    break;
                                }
                                break;
                        }
                    }
                    if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                        int i4 = bVar.o;
                        if (i4 != Integer.MIN_VALUE) {
                            bVar.p(i4, 16, null);
                        }
                        z = true;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    z = bVar.n(2, null);
                } else if (keyEvent.hasModifiers(1)) {
                    z = bVar.n(1, null);
                }
            }
            if (!z || this.s.o == Integer.MIN_VALUE) {
                return super.dispatchKeyEvent(keyEvent);
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // c.b.i.g, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e.d.b.d.k.b bVar = this.f4609g;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (bVar != null && e.d.b.d.k.b.I(bVar.P)) {
            e.d.b.d.k.b bVar2 = this.f4609g;
            ?? isEnabled = isEnabled();
            int i3 = isEnabled;
            if (this.o) {
                i3 = isEnabled + 1;
            }
            int i4 = i3;
            if (this.f4616n) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (this.f4615m) {
                i5 = i4 + 1;
            }
            int i6 = i5;
            if (isChecked()) {
                i6 = i5 + 1;
            }
            int[] iArr = new int[i6];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.o) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f4616n) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f4615m) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            z = bVar2.e0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final boolean e() {
        e.d.b.d.k.b bVar = this.f4609g;
        return (bVar == null || bVar.F() == null) ? false : true;
    }

    public boolean f() {
        e.d.b.d.k.b bVar = this.f4609g;
        return bVar != null && bVar.Y;
    }

    public boolean g() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f4612j;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.t) {
            this.s.s(1, 1);
        }
        return z;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).f4619g) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4610h;
        return insetDrawable == null ? this.f4609g : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.a0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.b0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.C;
        }
        return null;
    }

    public float getChipCornerRadius() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return Math.max(0.0f, bVar.E());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4609g;
    }

    public float getChipEndPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.l0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || (drawable = bVar.K) == null) {
            return null;
        }
        return c.i.a.p0(drawable);
    }

    public float getChipIconSize() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.M;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.L;
        }
        return null;
    }

    public float getChipMinHeight() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.D;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.e0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.F;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.G;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.F();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.X;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.k0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.W;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.j0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.V;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.K0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.t) {
            b bVar = this.s;
            if (bVar.o == 1 || bVar.f2265n == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public e.d.b.d.c.g getHideMotionSpec() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.d0;
        }
        return null;
    }

    public float getIconEndPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.g0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.f0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.H;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f4609g.f6591c.a;
    }

    public e.d.b.d.c.g getShowMotionSpec() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.c0;
        }
        return null;
    }

    public float getTextEndPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.i0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            return bVar.h0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f4610h != null) {
            this.f4610h = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            j();
        }
    }

    public final void i() {
        if (e()) {
            e.d.b.d.k.b bVar = this.f4609g;
            if ((bVar != null && bVar.O) && this.f4612j != null) {
                d0.A(this, this.s);
                this.t = true;
                return;
            }
        }
        d0.A(this, null);
        this.t = false;
    }

    public final void j() {
        if (e.d.b.d.u.b.a) {
            k();
            return;
        }
        this.f4609g.o0(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, backgroundDrawable);
        l();
        if (getBackgroundDrawable() == this.f4610h && this.f4609g.getCallback() == null) {
            this.f4609g.setCallback(this.f4610h);
        }
    }

    public final void k() {
        this.f4611i = new RippleDrawable(e.d.b.d.u.b.a(this.f4609g.H), getBackgroundDrawable(), null);
        this.f4609g.o0(false);
        RippleDrawable rippleDrawable = this.f4611i;
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, rippleDrawable);
        l();
    }

    public final void l() {
        e.d.b.d.k.b bVar;
        if (TextUtils.isEmpty(getText()) || (bVar = this.f4609g) == null) {
            return;
        }
        int D = (int) (bVar.D() + bVar.l0 + bVar.i0);
        e.d.b.d.k.b bVar2 = this.f4609g;
        int A = (int) (bVar2.A() + bVar2.e0 + bVar2.h0);
        if (this.f4610h != null) {
            Rect rect = new Rect();
            this.f4610h.getPadding(rect);
            A += rect.left;
            D += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        AtomicInteger atomicInteger = d0.a;
        d0.d.k(this, A, paddingTop, D, paddingBottom);
    }

    public final void m() {
        TextPaint paint = getPaint();
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        e.d.b.d.t.b textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e.d.b.d.a.d0(this, this.f4609g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f4607e);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f4608f);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (this.t) {
            b bVar = this.s;
            int i3 = bVar.o;
            if (i3 != Integer.MIN_VALUE) {
                bVar.k(i3);
            }
            if (z) {
                bVar.n(i2, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f6525c) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i2 = i4;
            } else {
                i2 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i2, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.q != i2) {
            this.q = i2;
            l();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f4615m
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f4615m
            if (r0 == 0) goto L34
            r5.g()
            r0 = 1
            goto L35
        L34:
            r0 = 0
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = 1
            goto L41
        L40:
            r0 = 0
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = 1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4611i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // c.b.i.g, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f4611i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // c.b.i.g, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.L(z);
        }
    }

    public void setCheckableResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.L(bVar.m0.getResources().getBoolean(i2));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null) {
            this.f4614l = z;
        } else if (bVar.Y) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.f4613k) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.M(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.M(c.b.d.a.a.b(bVar.m0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.N(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.N(c.b.d.a.a.a(bVar.m0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.O(bVar.m0.getResources().getBoolean(i2));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.O(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.C == colorStateList) {
            return;
        }
        bVar.C = colorStateList;
        bVar.onStateChange(bVar.getState());
    }

    public void setChipBackgroundColorResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.P(c.b.d.a.a.a(bVar.m0, i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Q(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Q(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(e.d.b.d.k.b bVar) {
        e.d.b.d.k.b bVar2 = this.f4609g;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.J0 = new WeakReference<>(null);
            }
            this.f4609g = bVar;
            bVar.L0 = false;
            Objects.requireNonNull(bVar);
            bVar.J0 = new WeakReference<>(this);
            d(this.r);
        }
    }

    public void setChipEndPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.l0 == f2) {
            return;
        }
        bVar.l0 = f2;
        bVar.invalidateSelf();
        bVar.J();
    }

    public void setChipEndPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.R(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.S(c.b.d.a.a.b(bVar.m0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.T(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.T(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.U(c.b.d.a.a.a(bVar.m0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.V(bVar.m0.getResources().getBoolean(i2));
        }
    }

    public void setChipIconVisible(boolean z) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.V(z);
        }
    }

    public void setChipMinHeight(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.D == f2) {
            return;
        }
        bVar.D = f2;
        bVar.invalidateSelf();
        bVar.J();
    }

    public void setChipMinHeightResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.W(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.e0 == f2) {
            return;
        }
        bVar.e0 = f2;
        bVar.invalidateSelf();
        bVar.J();
    }

    public void setChipStartPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.X(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Y(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Y(c.b.d.a.a.a(bVar.m0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Z(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.Z(bVar.m0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.a0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.X == charSequence) {
            return;
        }
        c.i.i.a c2 = c.i.i.a.c();
        bVar.X = c2.d(charSequence, c2.f2108h, true);
        bVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.b0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.b0(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.a0(c.b.d.a.a.b(bVar.m0, i2));
        }
        i();
    }

    public void setCloseIconSize(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.c0(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.c0(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.d0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.d0(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.f0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.f0(c.b.d.a.a.a(bVar.m0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.g0(z);
        }
        i();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i4 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            g.b bVar2 = bVar.f6591c;
            if (bVar2.o != f2) {
                bVar2.o = f2;
                bVar.x();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4609g == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.K0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.p = z;
        d(this.r);
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(e.d.b.d.c.g gVar) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.d0 = gVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.d0 = e.d.b.d.c.g.b(bVar.m0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.h0(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.h0(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.i0(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.i0(bVar.m0.getResources().getDimension(i2));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f4609g == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.M0 = i2;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f4613k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f4612j = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.j0(colorStateList);
        }
        if (this.f4609g.H0) {
            return;
        }
        k();
    }

    public void setRippleColorResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.j0(c.b.d.a.a.a(bVar.m0, i2));
            if (this.f4609g.H0) {
                return;
            }
            k();
        }
    }

    @Override // e.d.b.d.w.n
    public void setShapeAppearanceModel(j jVar) {
        e.d.b.d.k.b bVar = this.f4609g;
        bVar.f6591c.a = jVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(e.d.b.d.c.g gVar) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.c0 = gVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.c0 = e.d.b.d.c.g.b(bVar.m0, i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.L0 ? null : charSequence, bufferType);
        e.d.b.d.k.b bVar2 = this.f4609g;
        if (bVar2 != null) {
            bVar2.k0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.l0(new e.d.b.d.t.b(bVar.m0, i2));
        }
        m();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.l0(new e.d.b.d.t.b(bVar.m0, i2));
        }
        m();
    }

    public void setTextAppearance(e.d.b.d.t.b bVar) {
        e.d.b.d.k.b bVar2 = this.f4609g;
        if (bVar2 != null) {
            bVar2.l0(bVar);
        }
        m();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.i0 == f2) {
            return;
        }
        bVar.i0 = f2;
        bVar.invalidateSelf();
        bVar.J();
    }

    public void setTextEndPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.m0(bVar.m0.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar == null || bVar.h0 == f2) {
            return;
        }
        bVar.h0 = f2;
        bVar.invalidateSelf();
        bVar.J();
    }

    public void setTextStartPaddingResource(int i2) {
        e.d.b.d.k.b bVar = this.f4609g;
        if (bVar != null) {
            bVar.n0(bVar.m0.getResources().getDimension(i2));
        }
    }
}
