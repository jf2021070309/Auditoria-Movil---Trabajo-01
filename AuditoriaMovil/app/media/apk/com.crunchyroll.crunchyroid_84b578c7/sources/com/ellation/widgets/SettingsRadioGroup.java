package com.ellation.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.ellation.widgets.SettingsRadioGroup;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SettingsRadioGroup.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007J\r\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u0004\u0018\u00010\n¨\u0006\u0012"}, d2 = {"Lcom/ellation/widgets/SettingsRadioGroup;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroid/widget/RadioGroup;", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/kb0/q;", "onChange", "setOnCheckedChangeListener", "Lkotlin/Function1;", "getCheckedOption", "()Ljava/lang/Object;", "Landroid/view/View;", "getCheckedOptionView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SettingsRadioGroup<T> extends RadioGroup {
    public static final /* synthetic */ int e = 0;
    public List<? extends T> b;
    public final int c;
    public boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        this.b = z.b;
        int[] iArr = R.styleable.SettingsRadioGroup;
        j.e(iArr, "SettingsRadioGroup");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.c = obtainStyledAttributes.getResourceId(R.styleable.SettingsRadioGroup_radio_button_layout, R.layout.radio_button_settings);
        obtainStyledAttributes.recycle();
        this.d = true;
    }

    public final void a(List<? extends T> list, l<? super T, ? extends CharSequence> lVar) {
        removeAllViews();
        this.b = list;
        Iterator<T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object obj = (T) it.next();
            int i2 = i + 1;
            if (i >= 0) {
                View inflate = View.inflate(getContext(), this.c, null);
                j.d(inflate, "null cannot be cast to non-null type android.widget.RadioButton");
                RadioButton radioButton = (RadioButton) inflate;
                radioButton.setId(i);
                radioButton.setText(lVar.invoke(obj));
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                addView(radioButton);
                i = i2;
            } else {
                f1.S();
                throw null;
            }
        }
    }

    public final T getCheckedOption() {
        return this.b.get(getCheckedRadioButtonId());
    }

    public final View getCheckedOptionView() {
        return findViewById(getCheckedRadioButtonId());
    }

    public final void setOnCheckedChangeListener(final a<q> aVar) {
        j.f(aVar, "onChange");
        setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.amazon.aps.iva.z60.e
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                int i2 = SettingsRadioGroup.e;
                com.amazon.aps.iva.xb0.a aVar2 = com.amazon.aps.iva.xb0.a.this;
                j.f(aVar2, "$onChange");
                aVar2.invoke();
            }
        });
    }

    public final void setOnCheckedChangeListener(final l<? super T, q> lVar) {
        j.f(lVar, "onChange");
        setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.amazon.aps.iva.z60.d
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                int i2 = SettingsRadioGroup.e;
                SettingsRadioGroup settingsRadioGroup = SettingsRadioGroup.this;
                j.f(settingsRadioGroup, "this$0");
                l lVar2 = lVar;
                j.f(lVar2, "$onChange");
                if (settingsRadioGroup.d) {
                    lVar2.invoke(settingsRadioGroup.getCheckedOption());
                }
            }
        });
    }
}
