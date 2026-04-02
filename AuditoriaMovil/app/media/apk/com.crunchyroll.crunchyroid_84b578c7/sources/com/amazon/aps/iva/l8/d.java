package com.amazon.aps.iva.l8;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.e;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class d extends androidx.preference.a {
    public final HashSet j = new HashSet();
    public boolean k;
    public CharSequence[] l;
    public CharSequence[] m;

    /* compiled from: MultiSelectListPreferenceDialogFragmentCompat.java */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
            d dVar = d.this;
            if (z) {
                dVar.k = dVar.j.add(dVar.m[i].toString()) | dVar.k;
                return;
            }
            dVar.k = dVar.j.remove(dVar.m[i].toString()) | dVar.k;
        }
    }

    @Override // androidx.preference.a
    public final void ei(boolean z) {
        if (z && this.k) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) ci();
            multiSelectListPreference.getClass();
            multiSelectListPreference.B(this.j);
        }
        this.k = false;
    }

    @Override // androidx.preference.a
    public final void fi(e.a aVar) {
        int length = this.m.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.j.contains(this.m[i].toString());
        }
        aVar.setMultiChoiceItems(this.l, zArr, new a());
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.onCreate(bundle);
        HashSet hashSet = this.j;
        if (bundle == null) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) ci();
            if (multiSelectListPreference.U != null && (charSequenceArr = multiSelectListPreference.V) != null) {
                hashSet.clear();
                hashSet.addAll(multiSelectListPreference.W);
                this.k = false;
                this.l = multiSelectListPreference.U;
                this.m = charSequenceArr;
                return;
            }
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
        this.k = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
        this.l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
        this.m = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.j));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.l);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.m);
    }
}
