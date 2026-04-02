package e.d.b.d.y;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes2.dex */
public abstract class m {
    public TextInputLayout a;

    /* renamed from: b  reason: collision with root package name */
    public Context f6703b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f6704c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6705d;

    public m(TextInputLayout textInputLayout, int i2) {
        this.a = textInputLayout;
        this.f6703b = textInputLayout.getContext();
        this.f6704c = textInputLayout.getEndIconView();
        this.f6705d = i2;
    }

    public abstract void a();

    public boolean b(int i2) {
        return true;
    }

    public void c(boolean z) {
    }
}
