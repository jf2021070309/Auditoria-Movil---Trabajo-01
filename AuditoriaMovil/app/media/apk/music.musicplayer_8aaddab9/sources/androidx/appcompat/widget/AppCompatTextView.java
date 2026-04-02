package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c.b.i.e;
import c.b.i.v0;
import c.b.i.x;
import c.b.i.x0;
import c.b.i.y0;
import c.i.a;
import c.i.i.b;
import c.i.k.y;
import c.i.l.b;
import c.i.l.j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements y, j, b {
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final c.b.i.y f209b;

    /* renamed from: c  reason: collision with root package name */
    public final x f210c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f211d;

    /* renamed from: e  reason: collision with root package name */
    public Future<c.i.i.b> f212e;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(x0.a(context), attributeSet, i2);
        this.f211d = false;
        v0.a(this, getContext());
        e eVar = new e(this);
        this.a = eVar;
        eVar.d(attributeSet, i2);
        c.b.i.y yVar = new c.b.i.y(this);
        this.f209b = yVar;
        yVar.e(attributeSet, i2);
        yVar.b();
        this.f210c = new x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.a();
        }
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.Q) {
            return super.getAutoSizeMaxTextSize();
        }
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1076h);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.Q) {
            return super.getAutoSizeMinTextSize();
        }
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1075g);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.Q) {
            return super.getAutoSizeStepGranularity();
        }
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            return Math.round(yVar.f1273i.f1074f);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.Q) {
            return super.getAutoSizeTextAvailableSizes();
        }
        c.b.i.y yVar = this.f209b;
        return yVar != null ? yVar.f1273i.f1077i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.Q) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            return yVar.f1273i.f1072d;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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
        y0 y0Var = this.f209b.f1272h;
        if (y0Var != null) {
            return y0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        y0 y0Var = this.f209b.f1272h;
        if (y0Var != null) {
            return y0Var.f1281b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<c.i.i.b> future = this.f212e;
        if (future != null) {
            try {
                this.f212e = null;
                a.g0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        return (Build.VERSION.SDK_INT >= 28 || (xVar = this.f210c) == null) ? super.getTextClassifier() : xVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return a.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f209b.g(this, onCreateInputConnection, editorInfo);
        c.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c.b.i.y yVar = this.f209b;
        if (yVar == null || c.i.l.b.Q) {
            return;
        }
        yVar.f1273i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future<c.i.i.b> future = this.f212e;
        if (future != null) {
            try {
                this.f212e = null;
                a.g0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        c.b.i.y yVar = this.f209b;
        if (yVar == null || c.i.l.b.Q || !yVar.d()) {
            return;
        }
        this.f209b.f1273i.a();
    }

    @Override // android.widget.TextView, c.i.l.b
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (c.i.l.b.Q) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        c.b.i.y yVar = this.f209b;
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
        c.b.i.y yVar = this.f209b;
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
        c.b.i.y yVar = this.f209b;
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
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? c.b.d.a.a.b(context, i2) : null, i3 != 0 ? c.b.d.a.a.b(context, i3) : null, i4 != 0 ? c.b.d.a.a.b(context, i4) : null, i5 != 0 ? c.b.d.a.a.b(context, i5) : null);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? c.b.d.a.a.b(context, i2) : null, i3 != 0 ? c.b.d.a.a.b(context, i3) : null, i4 != 0 ? c.b.d.a.a.b(context, i4) : null, i5 != 0 ? c.b.d.a.a.b(context, i5) : null);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.r0(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            a.Z(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            a.c0(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        a.e0(this, i2);
    }

    public void setPrecomputedText(c.i.i.b bVar) {
        a.g0(this, bVar);
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
        this.f209b.k(colorStateList);
        this.f209b.b();
    }

    @Override // c.i.l.j
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f209b.l(mode);
        this.f209b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        c.b.i.y yVar = this.f209b;
        if (yVar != null) {
            yVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f210c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f1262b = textClassifier;
        }
    }

    public void setTextFuture(Future<c.i.i.b> future) {
        this.f212e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f2117b;
        int i3 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        if (i2 >= 23) {
            getPaint().set(aVar.a);
            setBreakStrategy(aVar.f2118c);
            setHyphenationFrequency(aVar.f2119d);
            return;
        }
        float textScaleX = aVar.a.getTextScaleX();
        getPaint().set(aVar.a);
        if (textScaleX == getTextScaleX()) {
            setTextScaleX((textScaleX / 2.0f) + 1.0f);
        }
        setTextScaleX(textScaleX);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z = c.i.l.b.Q;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        c.b.i.y yVar = this.f209b;
        if (yVar == null || z || yVar.d()) {
            return;
        }
        yVar.f1273i.f(i2, f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r0 != null) goto L22;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTypeface(android.graphics.Typeface r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f211d
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            if (r9 == 0) goto L50
            if (r10 <= 0) goto L50
            android.content.Context r1 = r8.getContext()
            c.i.e.k r2 = c.i.e.e.a
            if (r1 == 0) goto L48
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 >= r3) goto L43
            c.i.e.k r2 = c.i.e.e.a
            java.util.Objects.requireNonNull(r2)
            long r3 = c.i.e.k.g(r9)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L29
            r3 = r0
            goto L35
        L29:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, c.i.d.c.f> r5 = r2.a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r5.get(r3)
            c.i.d.c.f r3 = (c.i.d.c.f) r3
        L35:
            if (r3 != 0) goto L38
            goto L40
        L38:
            android.content.res.Resources r0 = r1.getResources()
            android.graphics.Typeface r0 = r2.a(r1, r3, r0, r10)
        L40:
            if (r0 == 0) goto L43
            goto L50
        L43:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r9, r10)
            goto L50
        L48:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Context cannot be null"
            r9.<init>(r10)
            throw r9
        L50:
            r1 = 1
            r8.f211d = r1
            if (r0 == 0) goto L56
            r9 = r0
        L56:
            r0 = 0
            super.setTypeface(r9, r10)     // Catch: java.lang.Throwable -> L5d
            r8.f211d = r0
            return
        L5d:
            r9 = move-exception
            r8.f211d = r0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTypeface(android.graphics.Typeface, int):void");
    }
}
