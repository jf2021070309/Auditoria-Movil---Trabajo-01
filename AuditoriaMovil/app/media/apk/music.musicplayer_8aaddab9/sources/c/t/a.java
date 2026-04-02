package c.t;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;
import java.util.Objects;
/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: i  reason: collision with root package name */
    public EditText f2510i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f2511j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f2512k = new RunnableC0052a();

    /* renamed from: l  reason: collision with root package name */
    public long f2513l = -1;

    /* renamed from: c.t.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0052a implements Runnable {
        public RunnableC0052a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.i();
        }
    }

    @Override // c.t.e
    public void c(View view) {
        super.c(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f2510i = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f2510i.setText(this.f2511j);
        EditText editText2 = this.f2510i;
        editText2.setSelection(editText2.getText().length());
        Objects.requireNonNull(h());
    }

    @Override // c.t.e
    public void e(boolean z) {
        if (z) {
            String obj = this.f2510i.getText().toString();
            EditTextPreference h2 = h();
            if (h2.a(obj)) {
                h2.O(obj);
            }
        }
    }

    @Override // c.t.e
    public void g() {
        j(true);
        i();
    }

    public final EditTextPreference h() {
        return (EditTextPreference) b();
    }

    public void i() {
        long j2 = this.f2513l;
        if (j2 != -1 && j2 + 1000 > SystemClock.currentThreadTimeMillis()) {
            EditText editText = this.f2510i;
            if (editText == null || !editText.isFocused()) {
                j(false);
            } else if (((InputMethodManager) this.f2510i.getContext().getSystemService("input_method")).showSoftInput(this.f2510i, 0)) {
                j(false);
            } else {
                this.f2510i.removeCallbacks(this.f2512k);
                this.f2510i.postDelayed(this.f2512k, 50L);
            }
        }
    }

    public final void j(boolean z) {
        this.f2513l = z ? SystemClock.currentThreadTimeMillis() : -1L;
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f2511j = h().Y;
        } else {
            this.f2511j = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // c.t.e, c.m.b.n, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f2511j);
    }
}
