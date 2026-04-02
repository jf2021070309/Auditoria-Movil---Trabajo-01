package c.t;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import c.b.c.i;
import ch.qos.logback.core.joran.action.Action;
/* loaded from: classes.dex */
public abstract class e extends c.m.b.n implements DialogInterface.OnClickListener {
    public DialogPreference a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f2521b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f2522c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2523d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2524e;

    /* renamed from: f  reason: collision with root package name */
    public int f2525f;

    /* renamed from: g  reason: collision with root package name */
    public BitmapDrawable f2526g;

    /* renamed from: h  reason: collision with root package name */
    public int f2527h;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public DialogPreference b() {
        if (this.a == null) {
            this.a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).a(requireArguments().getString(Action.KEY_ATTRIBUTE));
        }
        return this.a;
    }

    public void c(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f2524e;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public View d() {
        int i2 = this.f2525f;
        if (i2 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i2, (ViewGroup) null);
    }

    public abstract void e(boolean z);

    public void f(i.a aVar) {
    }

    public void g() {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f2527h = i2;
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString(Action.KEY_ATTRIBUTE);
        if (bundle != null) {
            this.f2521b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2522c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2523d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2524e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2525f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2526g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.a(string);
        this.a = dialogPreference;
        this.f2521b = dialogPreference.O;
        this.f2522c = dialogPreference.V;
        this.f2523d = dialogPreference.W;
        this.f2524e = dialogPreference.P;
        this.f2525f = dialogPreference.X;
        Drawable drawable = dialogPreference.U;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f2526g = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f2526g = new BitmapDrawable(getResources(), createBitmap);
    }

    @Override // c.m.b.n
    public Dialog onCreateDialog(Bundle bundle) {
        this.f2527h = -2;
        i.a aVar = new i.a(requireContext());
        CharSequence charSequence = this.f2521b;
        AlertController.b bVar = aVar.a;
        bVar.f128d = charSequence;
        bVar.f127c = this.f2526g;
        aVar.c(this.f2522c, this);
        aVar.b(this.f2523d, this);
        requireContext();
        View d2 = d();
        if (d2 != null) {
            c(d2);
            aVar.a.o = d2;
        } else {
            aVar.a.f130f = this.f2524e;
        }
        f(aVar);
        c.b.c.i a2 = aVar.a();
        if (this instanceof c.t.a) {
            Window window = a2.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                a.a(window);
            } else {
                g();
            }
        }
        return a2;
    }

    @Override // c.m.b.n, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        e(this.f2527h == -1);
    }

    @Override // c.m.b.n, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2521b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2522c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2523d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2524e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2525f);
        BitmapDrawable bitmapDrawable = this.f2526g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
