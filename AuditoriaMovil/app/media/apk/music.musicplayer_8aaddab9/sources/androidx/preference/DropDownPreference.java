package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import c.t.l;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final Context d0;
    public final ArrayAdapter e0;
    public Spinner f0;
    public final AdapterView.OnItemSelectedListener g0;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (i2 >= 0) {
                String charSequence = DropDownPreference.this.Z[i2].toString();
                if (charSequence.equals(DropDownPreference.this.a0) || !DropDownPreference.this.a(charSequence)) {
                    return;
                }
                DropDownPreference.this.S(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        this.g0 = new a();
        this.d0 = context;
        this.e0 = new ArrayAdapter(context, 17367049);
        T();
    }

    @Override // androidx.preference.ListPreference
    public void R(CharSequence[] charSequenceArr) {
        this.Y = charSequenceArr;
        T();
    }

    public final void T() {
        this.e0.clear();
        CharSequence[] charSequenceArr = this.Y;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.e0.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void m() {
        super.m();
        ArrayAdapter arrayAdapter = this.e0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public void r(l lVar) {
        Spinner spinner = (Spinner) lVar.f527b.findViewById(R.id.spinner);
        this.f0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.e0);
        this.f0.setOnItemSelectedListener(this.g0);
        Spinner spinner2 = this.f0;
        String str = this.a0;
        CharSequence[] charSequenceArr = this.Z;
        int i2 = -1;
        if (str != null && charSequenceArr != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i2 = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i2);
        super.r(lVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void s() {
        this.f0.performClick();
    }
}
