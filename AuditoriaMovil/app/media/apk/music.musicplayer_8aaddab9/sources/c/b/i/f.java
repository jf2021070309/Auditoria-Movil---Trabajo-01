package c.b.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class f extends Button implements c.i.k.y, c.i.l.b, c.i.l.j {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final y f1139b;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public f(Context context, AttributeSet attributeSet, int i2) {
        super(x0.a(context), attributeSet, i2);
        v0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.d(attributeSet, i2);
        y yVar = new y(this);
        this.f1139b = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c.i.l.b.Q) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1076h);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c.i.l.b.Q) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1075g);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c.i.l.b.Q) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1074f);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c.i.l.b.Q) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f1139b;
        return yVar != null ? yVar.f1273i.f1077i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c.i.l.b.Q) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            return yVar.f1273i.f1072d;
        }
        return 0;
    }

    @Override // c.i.k.y
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // c.i.k.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        y0 y0Var = this.f1139b.f1272h;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        y0 y0Var = this.f1139b.f1272h;
        if (y0Var != null) {
            return y0Var.f1281b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f1139b;
        if (yVar == null || c.i.l.b.Q) {
            return;
        }
        yVar.f1273i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f1139b;
        if (yVar == null || c.i.l.b.Q || !yVar.d()) {
            return;
        }
        this.f1139b.f1273i.a();
    }

    @Override // android.widget.TextView, c.i.l.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (c.i.l.b.Q) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.h(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) throws IllegalArgumentException {
        if (c.i.l.b.Q) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.i(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (c.i.l.b.Q) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.j(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.i.a.r0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.a.setAllCaps(z);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    @Override // c.i.k.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    @Override // c.i.l.j
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1139b.k(colorStateList);
        this.f1139b.b();
    }

    @Override // c.i.l.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1139b.l(mode);
        this.f1139b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1139b;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z = c.i.l.b.Q;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f1139b;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.f1273i.f(i2, f2);
    }
}
