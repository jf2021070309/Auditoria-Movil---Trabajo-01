package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import c.b.b;
import c.b.h.i.i;
import c.b.h.i.n;
import c.b.i.a1;
import c.i.k.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {
    public i a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f150b;

    /* renamed from: c  reason: collision with root package name */
    public RadioButton f151c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f152d;

    /* renamed from: e  reason: collision with root package name */
    public CheckBox f153e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f154f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f155g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f156h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f157i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f158j;

    /* renamed from: k  reason: collision with root package name */
    public int f159k;

    /* renamed from: l  reason: collision with root package name */
    public Context f160l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f161m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f162n;
    public boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1 q = a1.q(getContext(), attributeSet, b.q, R.attr.listMenuViewStyle, 0);
        this.f158j = q.g(5);
        this.f159k = q.l(1, -1);
        this.f161m = q.a(7, false);
        this.f160l = context;
        this.f162n = q.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        q.f1083b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.p == null) {
            this.p = LayoutInflater.from(getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f155g;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f153e = checkBox;
        LinearLayout linearLayout = this.f157i;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f156h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f156h.getLayoutParams();
        rect.top = this.f156h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f151c = radioButton;
        LinearLayout linearLayout = this.f157i;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void c(boolean z) {
        String sb;
        int i2 = (z && this.a.m()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f154f;
            i iVar = this.a;
            char e2 = iVar.e();
            if (e2 == 0) {
                sb = "";
            } else {
                Resources resources = iVar.f1027n.f1000b.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(iVar.f1027n.f1000b).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i3 = iVar.f1027n.n() ? iVar.f1024k : iVar.f1022i;
                i.c(sb2, i3, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                i.c(sb2, i3, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                i.c(sb2, i3, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                i.c(sb2, i3, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                i.c(sb2, i3, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                i.c(sb2, i3, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (e2 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (e2 != ' ') {
                    sb2.append(e2);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f154f.getVisibility() != i2) {
            this.f154f.setVisibility(i2);
        }
    }

    @Override // c.b.h.i.n.a
    public void d(i iVar, int i2) {
        this.a = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.f1018e);
        setCheckable(iVar.isCheckable());
        boolean m2 = iVar.m();
        iVar.e();
        c(m2);
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.q);
    }

    @Override // c.b.h.i.n.a
    public i getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f158j;
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f152d = textView;
        int i2 = this.f159k;
        if (i2 != -1) {
            textView.setTextAppearance(this.f160l, i2);
        }
        this.f154f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f155g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f162n);
        }
        this.f156h = (ImageView) findViewById(R.id.group_divider);
        this.f157i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f150b != null && this.f161m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f150b.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f151c == null && this.f153e == null) {
            return;
        }
        if (this.a.h()) {
            if (this.f151c == null) {
                b();
            }
            compoundButton = this.f151c;
            compoundButton2 = this.f153e;
        } else {
            if (this.f153e == null) {
                a();
            }
            compoundButton = this.f153e;
            compoundButton2 = this.f151c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f153e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f151c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.a.h()) {
            if (this.f151c == null) {
                b();
            }
            compoundButton = this.f151c;
        } else {
            if (this.f153e == null) {
                a();
            }
            compoundButton = this.f153e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.f161m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f156h;
        if (imageView != null) {
            imageView.setVisibility((this.o || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.a.f1027n);
        boolean z = this.q;
        if (z || this.f161m) {
            ImageView imageView = this.f150b;
            if (imageView == null && drawable == null && !this.f161m) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f150b = imageView2;
                LinearLayout linearLayout = this.f157i;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f161m) {
                this.f150b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f150b;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f150b.getVisibility() != 0) {
                this.f150b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f152d.getVisibility() != 8) {
                this.f152d.setVisibility(8);
                return;
            }
            return;
        }
        this.f152d.setText(charSequence);
        if (this.f152d.getVisibility() != 0) {
            this.f152d.setVisibility(0);
        }
    }
}
