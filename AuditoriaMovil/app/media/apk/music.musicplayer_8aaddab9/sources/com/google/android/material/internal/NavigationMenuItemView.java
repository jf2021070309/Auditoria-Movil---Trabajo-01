package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c.b.h.i.i;
import c.b.h.i.n;
import c.b.i.i0;
import c.i.d.c.j;
import c.i.k.d0;
import c.i.k.e;
import c.i.k.k0.b;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import e.d.b.d.r.f;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class NavigationMenuItemView extends f implements n.a {
    public static final int[] v = {16842912};
    public FrameLayout A;
    public i B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final e F;
    public int w;
    public boolean x;
    public boolean y;
    public final CheckedTextView z;

    /* loaded from: classes2.dex */
    public class a extends e {
        public a() {
        }

        @Override // c.i.k.e
        public void d(View view, b bVar) {
            this.f2148b.onInitializeAccessibilityNodeInfo(view, bVar.f2193b);
            bVar.f2193b.setCheckable(NavigationMenuItemView.this.y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        d0.A(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // c.b.h.i.n.a
    public void d(i iVar, int i2) {
        StateListDrawable stateListDrawable;
        this.B = iVar;
        int i3 = iVar.a;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(v, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = d0.a;
            d0.c.q(this, stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.f1018e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.q);
        c.b.a.c(this, iVar.r);
        i iVar2 = this.B;
        if ((iVar2.f1018e == null && iVar2.getIcon() == null && this.B.getActionView() != null) ? false : false) {
            this.z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                i0.a aVar = (i0.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        FrameLayout frameLayout2 = this.A;
        if (frameLayout2 != null) {
            i0.a aVar2 = (i0.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.A.setLayoutParams(aVar2);
        }
    }

    @Override // c.b.h.i.n.a
    public i getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        i iVar = this.B;
        if (iVar != null && iVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, v);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.y != z) {
            this.y = z;
            this.F.h(this.z, ThrowableProxyConverter.BUILDER_CAPACITY);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.z.setChecked(z);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = c.i.a.q0(drawable).mutate();
                c.i.a.j0(drawable, this.C);
            }
            int i2 = this.w;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.x) {
            if (this.E == null) {
                Drawable a2 = j.a(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.E = a2;
                if (a2 != null) {
                    int i3 = this.w;
                    a2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        this.z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.w = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        i iVar = this.B;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.x = z;
    }

    public void setTextAppearance(int i2) {
        c.i.a.h0(this.z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.z.setText(charSequence);
    }
}
