package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.amazon.aps.iva.g3.i;
import com.amazon.aps.iva.g3.o;
import com.amazon.aps.iva.n3.h;
import com.amazon.aps.iva.q.a1;
import com.amazon.aps.iva.q.b0;
import com.amazon.aps.iva.q.d;
import com.amazon.aps.iva.q.d0;
import com.amazon.aps.iva.q.f0;
import com.amazon.aps.iva.q.m;
import com.amazon.aps.iva.q.m1;
import com.amazon.aps.iva.q.y0;
import com.amazon.aps.iva.t3.k;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final d mBackgroundTintHelper;
    private m mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<h> mPrecomputedTextFuture;
    private a mSuperCaller;
    private final b0 mTextClassifierHelper;
    private final d0 mTextHelper;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i);

        void b(int i);
    }

    /* loaded from: classes.dex */
    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<h> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                k.d(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    private m getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new m(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.a();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (m1.b) {
            return super.getAutoSizeMaxTextSize();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return Math.round(d0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (m1.b) {
            return super.getAutoSizeMinTextSize();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return Math.round(d0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (m1.b) {
            return super.getAutoSizeStepGranularity();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return Math.round(d0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (m1.b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            return d0Var.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (m1.b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var == null) {
            return 0;
        }
        return d0Var.i.a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return k.e(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        if (this.mSuperCaller == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.mSuperCaller = new c();
            } else {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b0Var.b;
        if (textClassifier == null) {
            return b0.a.a(b0Var.a);
        }
        return textClassifier;
    }

    public h.a getTextMetricsParamsCompat() {
        return k.a(this);
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            com.amazon.aps.iva.s3.a.a(editorInfo, getText());
        }
        com.amazon.aps.iva.ff0.b.A(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null && !m1.b) {
            d0Var.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        d0 d0Var = this.mTextHelper;
        boolean z2 = false;
        if (d0Var != null && !m1.b) {
            f0 f0Var = d0Var.i;
            if (f0Var.h() && f0Var.a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            this.mTextHelper.i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (m1.b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (m1.b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (m1.b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(k.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i);
        } else {
            k.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            k.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        com.amazon.aps.iva.cq.b.w(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(h hVar) {
        k.d(this, hVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b0 b0Var;
        if (Build.VERSION.SDK_INT >= 28 || (b0Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b0Var.b = textClassifier;
        }
    }

    public void setTextFuture(Future<h> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(h.a aVar) {
        int i;
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
            k.b.h(this, i);
            getPaint().set(aVar.a);
            k.c.e(this, aVar.c);
            k.c.h(this, aVar.d);
        }
        i = 1;
        k.b.h(this, i);
        getPaint().set(aVar.a);
        k.c.e(this, aVar.c);
        k.c.h(this, aVar.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = m1.b;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        d0 d0Var = this.mTextHelper;
        if (d0Var != null && !z2) {
            f0 f0Var = d0Var.i;
            if (f0Var.h() && f0Var.a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                f0Var.e(f, i);
            }
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            o oVar = i.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.mIsSetTypefaceProcessing = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.a(context);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        y0.a(getContext(), this);
        d dVar = new d(this);
        this.mBackgroundTintHelper = dVar;
        dVar.d(attributeSet, i);
        d0 d0Var = new d0(this);
        this.mTextHelper = d0Var;
        d0Var.f(attributeSet, i);
        d0Var.b();
        this.mTextClassifierHelper = new b0(this);
        getEmojiTextViewHelper().c(attributeSet, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.amazon.aps.iva.l.a.a(context, i) : null, i2 != 0 ? com.amazon.aps.iva.l.a.a(context, i2) : null, i3 != 0 ? com.amazon.aps.iva.l.a.a(context, i3) : null, i4 != 0 ? com.amazon.aps.iva.l.a.a(context, i4) : null);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.amazon.aps.iva.l.a.a(context, i) : null, i2 != 0 ? com.amazon.aps.iva.l.a.a(context, i2) : null, i3 != 0 ? com.amazon.aps.iva.l.a.a(context, i3) : null, i4 != 0 ? com.amazon.aps.iva.l.a.a(context, i4) : null);
        d0 d0Var = this.mTextHelper;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    /* loaded from: classes.dex */
    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i) {
        }
    }
}
