package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import e.d.b.d.r.j;
import e.d.b.d.r.l;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f4690b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f4691c;

    /* renamed from: d  reason: collision with root package name */
    public TextWatcher f4692d;

    /* loaded from: classes2.dex */
    public class b extends j {
        public b(a aVar) {
        }

        @Override // e.d.b.d.r.j, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.a.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.a = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f4690b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f4691c = editText;
        editText.setVisibility(4);
        b bVar = new b(null);
        this.f4692d = bVar;
        editText.addTextChangedListener(bVar);
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4691c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.a.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.a.setChecked(z);
        this.f4691c.setVisibility(z ? 0 : 4);
        this.a.setVisibility(z ? 8 : 0);
        if (isChecked()) {
            EditText editText = this.f4691c;
            editText.requestFocus();
            editText.post(new l(editText));
            if (TextUtils.isEmpty(this.f4691c.getText())) {
                return;
            }
            EditText editText2 = this.f4691c;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i2, Object obj) {
        this.a.setTag(i2, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.a.toggle();
    }
}
