package c.i.k;

import android.text.TextUtils;
import android.view.View;
import c.i.k.d0;
/* loaded from: classes.dex */
public class b0 extends d0.a<CharSequence> {
    public b0(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    @Override // c.i.k.d0.a
    public CharSequence b(View view) {
        return d0.m.a(view);
    }

    @Override // c.i.k.d0.a
    public void c(View view, CharSequence charSequence) {
        d0.m.b(view, charSequence);
    }

    @Override // c.i.k.d0.a
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
