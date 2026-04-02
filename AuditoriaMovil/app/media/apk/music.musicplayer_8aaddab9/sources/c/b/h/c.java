package c.b.h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
public class c extends ContextWrapper {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f908b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f909c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f910d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f911e;

    public c() {
        super(null);
    }

    public c(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f908b = theme;
    }

    public void a(Configuration configuration) {
        if (this.f911e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f910d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f910d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f908b == null) {
            this.f908b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f908b.setTo(theme);
            }
        }
        this.f908b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f911e == null) {
            Configuration configuration = this.f910d;
            if (configuration == null) {
                this.f911e = super.getResources();
            } else {
                this.f911e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.f911e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f909c == null) {
                this.f909c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f909c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f908b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = 2131886636;
        }
        b();
        return this.f908b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            b();
        }
    }
}
