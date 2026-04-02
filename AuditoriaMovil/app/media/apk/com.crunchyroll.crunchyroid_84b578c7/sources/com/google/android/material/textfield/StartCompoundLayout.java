package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.amazon.aps.iva.q.d1;
import com.amazon.aps.iva.q3.l;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, d1 d1Var) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(d1Var);
        initPrefixTextView(d1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(d1 d1Var) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = this.prefixTextView;
        WeakHashMap<View, r0> weakHashMap = g0.a;
        g0.g.f(textView, 1);
        setPrefixTextAppearance(d1Var.i(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        if (d1Var.l(R.styleable.TextInputLayout_prefixTextColor)) {
            setPrefixTextColor(d1Var.b(R.styleable.TextInputLayout_prefixTextColor));
        }
        setPrefixText(d1Var.k(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(d1 d1Var) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            com.amazon.aps.iva.p3.h.g((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        if (d1Var.l(R.styleable.TextInputLayout_startIconTint)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), d1Var, R.styleable.TextInputLayout_startIconTint);
        }
        if (d1Var.l(R.styleable.TextInputLayout_startIconTintMode)) {
            this.startIconTintMode = ViewUtils.parseTintMode(d1Var.h(R.styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (d1Var.l(R.styleable.TextInputLayout_startIconDrawable)) {
            setStartIconDrawable(d1Var.e(R.styleable.TextInputLayout_startIconDrawable));
            if (d1Var.l(R.styleable.TextInputLayout_startIconContentDescription)) {
                setStartIconContentDescription(d1Var.k(R.styleable.TextInputLayout_startIconContentDescription));
            }
            setStartIconCheckable(d1Var.a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(d1Var.d(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        if (d1Var.l(R.styleable.TextInputLayout_startIconScaleType)) {
            setStartIconScaleType(IconHelper.convertScaleType(d1Var.h(R.styleable.TextInputLayout_startIconScaleType, -1)));
        }
    }

    private void updateVisibility() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.prefixText != null && !this.hintExpanded) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.startIconView.getVisibility() != 0 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.prefixTextView.setVisibility(i);
        this.textInputLayout.updateDummyDrawables();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public int getPrefixTextStartOffset() {
        int i;
        if (isStartIconVisible()) {
            i = com.amazon.aps.iva.p3.h.b((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()) + this.startIconView.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap<View, r0> weakHashMap = g0.a;
        return g0.e.f(this.prefixTextView) + g0.e.f(this) + i;
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        if (this.startIconView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void onHintStateChanged(boolean z) {
        this.hintExpanded = z;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.prefixText = charSequence2;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        this.prefixTextView.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription(null);
    }

    public void setStartIconMinSize(int i) {
        if (i >= 0) {
            if (i != this.startIconMinSize) {
                this.startIconMinSize = i;
                IconHelper.setIconMinSize(this.startIconView, i);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        int i;
        if (isStartIconVisible() != z) {
            CheckableImageButton checkableImageButton = this.startIconView;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(l lVar) {
        if (this.prefixTextView.getVisibility() == 0) {
            lVar.a.setLabelFor(this.prefixTextView);
            lVar.a.setTraversalAfter(this.prefixTextView);
            return;
        }
        lVar.a.setTraversalAfter(this.startIconView);
    }

    public void updatePrefixTextViewPadding() {
        int f;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        if (isStartIconVisible()) {
            f = 0;
        } else {
            WeakHashMap<View, r0> weakHashMap = g0.a;
            f = g0.e.f(editText);
        }
        TextView textView = this.prefixTextView;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, r0> weakHashMap2 = g0.a;
        g0.e.k(textView, f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }
}
