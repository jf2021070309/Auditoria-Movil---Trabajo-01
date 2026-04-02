package com.amazon.aps.iva.p70;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.p70.c;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: CustomRadioGroup.kt */
/* loaded from: classes2.dex */
public final class b<T extends c> extends RadioGroup {
    public static final /* synthetic */ int d = 0;
    public boolean b;
    public final LinkedHashMap c;

    public b(Context context) {
        super(context);
        this.b = true;
        this.c = new LinkedHashMap();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.custom_radio_group_horizontal_margin);
        t0.j(this, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), null, 10);
    }

    public final void a(List<? extends T> list, Integer num) {
        j.f(list, "options");
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.clear();
        removeAllViews();
        if (num != null) {
            int intValue = num.intValue();
            View inflate = View.inflate(getContext(), R.layout.custom_radio_group_title, null);
            j.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) inflate;
            textView.setText(intValue);
            textView.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
            addView(textView);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int title = cVar.getTitle();
            View inflate2 = View.inflate(getContext(), R.layout.custom_radio_button, null);
            j.d(inflate2, "null cannot be cast to non-null type android.widget.RadioButton");
            RadioButton radioButton = (RadioButton) inflate2;
            radioButton.setId(View.generateViewId());
            radioButton.setText(title);
            radioButton.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
            addView(radioButton);
            linkedHashMap.put(cVar, radioButton);
            Integer description = cVar.getDescription();
            if (description != null) {
                int intValue2 = description.intValue();
                View inflate3 = View.inflate(getContext(), R.layout.custom_radio_button_description, null);
                j.d(inflate3, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) inflate3;
                textView2.setText(intValue2);
                textView2.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                addView(textView2);
            }
        }
    }

    public final void b(T t) {
        j.f(t, "option");
        this.b = false;
        Object obj = this.c.get(t);
        j.c(obj);
        ((RadioButton) obj).setChecked(true);
        this.b = true;
    }

    public final T getCheckedOption() {
        Object obj;
        Iterator it = this.c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((RadioButton) ((Map.Entry) obj).getValue()).isChecked()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (T) entry.getKey();
    }

    public final void setOnCheckedChangeListener(final l<? super T, q> lVar) {
        j.f(lVar, "onChange");
        setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.amazon.aps.iva.p70.a
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                b bVar = b.this;
                j.f(bVar, "this$0");
                l lVar2 = lVar;
                j.f(lVar2, "$onChange");
                if (bVar.b) {
                    c checkedOption = bVar.getCheckedOption();
                    j.c(checkedOption);
                    lVar2.invoke(checkedOption);
                }
            }
        });
    }
}
