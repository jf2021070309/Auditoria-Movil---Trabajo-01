package com.amazon.aps.iva.l8;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
/* compiled from: EditTextPreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public class a extends androidx.preference.a {
    public EditText j;
    public CharSequence k;
    public final RunnableC0472a l = new RunnableC0472a();
    public long m = -1;

    /* compiled from: EditTextPreferenceDialogFragmentCompat.java */
    /* renamed from: com.amazon.aps.iva.l8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0472a implements Runnable {
        public RunnableC0472a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.hi();
        }
    }

    @Override // androidx.preference.a
    public final void di(View view) {
        super.di(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.j = editText;
        if (editText != null) {
            editText.requestFocus();
            this.j.setText(this.k);
            EditText editText2 = this.j;
            editText2.setSelection(editText2.getText().length());
            ((EditTextPreference) ci()).getClass();
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    @Override // androidx.preference.a
    public final void ei(boolean z) {
        if (z) {
            String obj = this.j.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) ci();
            editTextPreference.getClass();
            editTextPreference.B(obj);
        }
    }

    @Override // androidx.preference.a
    public final void gi() {
        this.m = SystemClock.currentThreadTimeMillis();
        hi();
    }

    public final void hi() {
        boolean z;
        long j = this.m;
        if (j != -1 && j + 1000 > SystemClock.currentThreadTimeMillis()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EditText editText = this.j;
            if (editText != null && editText.isFocused()) {
                if (((InputMethodManager) this.j.getContext().getSystemService("input_method")).showSoftInput(this.j, 0)) {
                    this.m = -1L;
                    return;
                }
                EditText editText2 = this.j;
                RunnableC0472a runnableC0472a = this.l;
                editText2.removeCallbacks(runnableC0472a);
                this.j.postDelayed(runnableC0472a, 50L);
                return;
            }
            this.m = -1L;
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.k = ((EditTextPreference) ci()).U;
        } else {
            this.k = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // androidx.preference.a, androidx.fragment.app.g, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.k);
    }
}
