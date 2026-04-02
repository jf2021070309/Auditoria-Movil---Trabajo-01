package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.amazon.aps.iva.l8.g;
import com.crunchyroll.crunchyroid.R;
/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter Z;
    public Spinner k0;
    public final a v0;

    public DropDownPreference() {
        throw null;
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        ArrayAdapter arrayAdapter = this.Z;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void n(g gVar) {
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) gVar.itemView.findViewById(R.id.spinner);
        this.k0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.Z);
        this.k0.setOnItemSelectedListener(this.v0);
        Spinner spinner2 = this.k0;
        String str = this.W;
        int i = -1;
        if (str != null && (charSequenceArr = this.V) != null) {
            int length = charSequenceArr.length - 1;
            while (true) {
                if (length < 0) {
                    break;
                } else if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                } else {
                    length--;
                }
            }
        }
        spinner2.setSelection(i);
        super.n(gVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void o() {
        this.k0.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.v0 = new a();
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.Z = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.U;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= 0) {
                DropDownPreference dropDownPreference = DropDownPreference.this;
                String charSequence = dropDownPreference.V[i].toString();
                if (!charSequence.equals(dropDownPreference.W)) {
                    dropDownPreference.getClass();
                    dropDownPreference.D(charSequence);
                }
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
