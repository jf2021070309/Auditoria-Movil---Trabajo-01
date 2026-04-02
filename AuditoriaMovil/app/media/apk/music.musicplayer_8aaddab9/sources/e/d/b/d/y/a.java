package e.d.b.d.y;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public class a extends m {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f6682e;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f6683f;

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f6684g;

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f6685h;

    /* renamed from: i  reason: collision with root package name */
    public AnimatorSet f6686i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f6687j;

    /* renamed from: e.d.b.d.y.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0145a implements TextWatcher {
        public C0145a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(a.this.f6683f);
            a aVar = a.this;
            aVar.f6704c.setOnFocusChangeListener(aVar.f6683f);
            editText.removeTextChangedListener(a.this.f6682e);
            editText.addTextChangedListener(a.this.f6682e);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: e.d.b.d.y.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0146a implements Runnable {
            public final /* synthetic */ EditText a;

            public RunnableC0146a(EditText editText) {
                this.a = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.removeTextChangedListener(a.this.f6682e);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.post(new RunnableC0146a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f6683f) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = a.this.f6704c.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener == aVar.f6683f) {
                aVar.f6704c.setOnFocusChangeListener(null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.a.q();
        }
    }

    public a(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
        this.f6682e = new C0145a();
        this.f6683f = new b();
        this.f6684g = new c();
        this.f6685h = new d();
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f6704c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // e.d.b.d.y.m
    public void a() {
        TextInputLayout textInputLayout = this.a;
        int i2 = this.f6705d;
        if (i2 == 0) {
            i2 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new e());
        this.a.a(this.f6684g);
        this.a.n0.add(this.f6685h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(e.d.b.d.c.a.f6329d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e.d.b.d.y.e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = e.d.b.d.c.a.a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener(new e.d.b.d.y.d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6686i = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f6686i.addListener(new e.d.b.d.y.b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener(new e.d.b.d.y.d(this));
        this.f6687j = ofFloat3;
        ofFloat3.addListener(new e.d.b.d.y.c(this));
    }

    @Override // e.d.b.d.y.m
    public void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        e(z);
    }

    public final void e(boolean z) {
        boolean z2 = this.a.m() == z;
        if (z && !this.f6686i.isRunning()) {
            this.f6687j.cancel();
            this.f6686i.start();
            if (z2) {
                this.f6686i.end();
            }
        } else if (z) {
        } else {
            this.f6686i.cancel();
            this.f6687j.start();
            if (z2) {
                this.f6687j.end();
            }
        }
    }
}
