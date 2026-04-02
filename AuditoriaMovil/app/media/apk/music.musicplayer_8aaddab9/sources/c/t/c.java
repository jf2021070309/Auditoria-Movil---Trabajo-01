package c.t;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertController;
import androidx.preference.ListPreference;
import c.b.c.i;
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: i  reason: collision with root package name */
    public int f2514i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence[] f2515j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence[] f2516k;

    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            c cVar = c.this;
            cVar.f2514i = i2;
            cVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // c.t.e
    public void e(boolean z) {
        int i2;
        if (!z || (i2 = this.f2514i) < 0) {
            return;
        }
        String charSequence = this.f2516k[i2].toString();
        ListPreference listPreference = (ListPreference) b();
        if (listPreference.a(charSequence)) {
            listPreference.S(charSequence);
        }
    }

    @Override // c.t.e
    public void f(i.a aVar) {
        CharSequence[] charSequenceArr = this.f2515j;
        int i2 = this.f2514i;
        a aVar2 = new a();
        AlertController.b bVar = aVar.a;
        bVar.f136l = charSequenceArr;
        bVar.f138n = aVar2;
        bVar.s = i2;
        bVar.r = true;
        aVar.c(null, null);
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2514i = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f2515j = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f2516k = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) b();
        if (listPreference.P() == null || listPreference.Z == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f2514i = listPreference.O(listPreference.a0);
        this.f2515j = listPreference.P();
        this.f2516k = listPreference.Z;
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f2514i);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f2515j);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f2516k);
    }
}
