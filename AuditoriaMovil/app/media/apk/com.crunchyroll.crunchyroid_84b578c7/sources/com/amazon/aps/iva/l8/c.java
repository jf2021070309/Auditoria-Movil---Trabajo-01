package com.amazon.aps.iva.l8;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.e;
import androidx.preference.ListPreference;
/* compiled from: ListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class c extends androidx.preference.a {
    public int j;
    public CharSequence[] k;
    public CharSequence[] l;

    /* compiled from: ListPreferenceDialogFragmentCompat.java */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            c cVar = c.this;
            cVar.j = i;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // androidx.preference.a
    public final void ei(boolean z) {
        int i;
        if (z && (i = this.j) >= 0) {
            String charSequence = this.l[i].toString();
            ListPreference listPreference = (ListPreference) ci();
            listPreference.getClass();
            listPreference.D(charSequence);
        }
    }

    @Override // androidx.preference.a
    public final void fi(e.a aVar) {
        aVar.setSingleChoiceItems(this.k, this.j, new a());
        aVar.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference listPreference = (ListPreference) ci();
            if (listPreference.U != null && (charSequenceArr = listPreference.V) != null) {
                this.j = listPreference.B(listPreference.W);
                this.k = listPreference.U;
                this.l = charSequenceArr;
                return;
            }
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.j = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.l = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.k);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.l);
    }
}
