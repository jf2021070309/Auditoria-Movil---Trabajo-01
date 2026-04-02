package androidx.preference;

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
import androidx.appcompat.app.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.preference.DialogPreference;
/* compiled from: PreferenceDialogFragmentCompat.java */
/* loaded from: classes.dex */
public abstract class a extends g implements DialogInterface.OnClickListener {
    public DialogPreference b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    public int g;
    public BitmapDrawable h;
    public int i;

    /* compiled from: PreferenceDialogFragmentCompat.java */
    /* renamed from: androidx.preference.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0050a {
        public static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public final DialogPreference ci() {
        if (this.b == null) {
            this.b = (DialogPreference) ((DialogPreference.a) getTargetFragment()).G4(requireArguments().getString("key"));
        }
        return this.b;
    }

    public void di(View view) {
        int i;
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            } else {
                i = 8;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void ei(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.i = i;
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof DialogPreference.a) {
            DialogPreference.a aVar = (DialogPreference.a) targetFragment;
            String string = requireArguments().getString("key");
            if (bundle == null) {
                DialogPreference dialogPreference = (DialogPreference) aVar.G4(string);
                this.b = dialogPreference;
                this.c = dialogPreference.O;
                this.d = dialogPreference.R;
                this.e = dialogPreference.S;
                this.f = dialogPreference.P;
                this.g = dialogPreference.T;
                Drawable drawable = dialogPreference.Q;
                if (drawable != null && !(drawable instanceof BitmapDrawable)) {
                    Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    this.h = new BitmapDrawable(getResources(), createBitmap);
                    return;
                }
                this.h = (BitmapDrawable) drawable;
                return;
            }
            this.c = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.d = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.e = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.g = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.h = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        this.i = -2;
        e.a negativeButton = new e.a(requireContext()).setTitle(this.c).setIcon(this.h).setPositiveButton(this.d, this).setNegativeButton(this.e, this);
        requireContext();
        int i = this.g;
        View view = null;
        if (i != 0) {
            view = getLayoutInflater().inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            di(view);
            negativeButton.setView(view);
        } else {
            negativeButton.setMessage(this.f);
        }
        fi(negativeButton);
        androidx.appcompat.app.e create = negativeButton.create();
        if (this instanceof com.amazon.aps.iva.l8.a) {
            Window window = create.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                C0050a.a(window);
            } else {
                gi();
            }
        }
        return create;
    }

    @Override // androidx.fragment.app.g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean z;
        super.onDismiss(dialogInterface);
        if (this.i == -1) {
            z = true;
        } else {
            z = false;
        }
        ei(z);
    }

    @Override // androidx.fragment.app.g, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.c);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.d);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.e);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f);
        bundle.putInt("PreferenceDialogFragment.layout", this.g);
        BitmapDrawable bitmapDrawable = this.h;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void gi() {
    }

    public void fi(e.a aVar) {
    }
}
