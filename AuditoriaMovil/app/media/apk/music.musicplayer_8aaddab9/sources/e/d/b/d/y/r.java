package e.d.b.d.y;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class r extends m {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f6726e;

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f6727f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f6728g;

    /* loaded from: classes2.dex */
    public class a extends e.d.b.d.r.j {
        public a() {
        }

        @Override // e.d.b.d.r.j, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            r rVar = r.this;
            rVar.f6704c.setChecked(!r.d(rVar));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            r rVar = r.this;
            rVar.f6704c.setChecked(!r.d(rVar));
            editText.removeTextChangedListener(r.this.f6726e);
            editText.addTextChangedListener(r.this.f6726e);
        }
    }

    /* loaded from: classes2.dex */
    public class c implements TextInputLayout.g {

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public final /* synthetic */ EditText a;

            public a(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(r.this.f6726e);
            }
        }

        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    /* loaded from: classes2.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditText editText = r.this.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (r.d(r.this)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            r.this.a.q();
        }
    }

    public r(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f6726e = new a();
        this.f6727f = new b();
        this.f6728g = new c();
    }

    public static boolean d(r rVar) {
        EditText editText = rVar.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // e.d.b.d.y.m
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i2 = this.f6705d;
        if (i2 == 0) {
            i2 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.a(this.f6727f);
        this.a.n0.add(this.f6728g);
        EditText editText = this.a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
