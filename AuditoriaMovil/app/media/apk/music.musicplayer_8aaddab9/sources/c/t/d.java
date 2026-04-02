package c.t;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.preference.MultiSelectListPreference;
import c.b.c.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: i  reason: collision with root package name */
    public Set<String> f2517i = new HashSet();

    /* renamed from: j  reason: collision with root package name */
    public boolean f2518j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence[] f2519k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence[] f2520l;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i2, boolean z) {
            if (z) {
                d dVar = d.this;
                dVar.f2518j = dVar.f2517i.add(dVar.f2520l[i2].toString()) | dVar.f2518j;
                return;
            }
            d dVar2 = d.this;
            dVar2.f2518j = dVar2.f2517i.remove(dVar2.f2520l[i2].toString()) | dVar2.f2518j;
        }
    }

    @Override // c.t.e
    public void e(boolean z) {
        if (z && this.f2518j) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) b();
            if (multiSelectListPreference.a(this.f2517i)) {
                multiSelectListPreference.O(this.f2517i);
            }
        }
        this.f2518j = false;
    }

    @Override // c.t.e
    public void f(i.a aVar) {
        int length = this.f2520l.length;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zArr[i2] = this.f2517i.contains(this.f2520l[i2].toString());
        }
        CharSequence[] charSequenceArr = this.f2519k;
        a aVar2 = new a();
        AlertController.b bVar = aVar.a;
        bVar.f136l = charSequenceArr;
        bVar.t = aVar2;
        bVar.p = zArr;
        bVar.q = true;
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2517i.clear();
            this.f2517i.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f2518j = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f2519k = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f2520l = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) b();
        if (multiSelectListPreference.Y == null || multiSelectListPreference.Z == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f2517i.clear();
        this.f2517i.addAll(multiSelectListPreference.a0);
        this.f2518j = false;
        this.f2519k = multiSelectListPreference.Y;
        this.f2520l = multiSelectListPreference.Z;
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f2517i));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f2518j);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f2519k);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f2520l);
    }
}
