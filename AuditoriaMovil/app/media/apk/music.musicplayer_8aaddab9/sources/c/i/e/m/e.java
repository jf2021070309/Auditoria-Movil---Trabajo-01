package c.i.e.m;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f2064b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f2065c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f2066d;

    public e(e eVar) {
        this.f2065c = null;
        this.f2066d = c.a;
        if (eVar != null) {
            this.a = eVar.a;
            this.f2064b = eVar.f2064b;
            this.f2065c = eVar.f2065c;
            this.f2066d = eVar.f2066d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.f2064b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new d(this, resources) : new c(this, resources);
    }
}
