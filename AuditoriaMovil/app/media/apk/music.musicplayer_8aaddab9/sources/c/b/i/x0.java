package c.b.i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class x0 extends ContextWrapper {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static ArrayList<WeakReference<x0>> f1263b;

    /* renamed from: c  reason: collision with root package name */
    public final Resources f1264c;

    /* renamed from: d  reason: collision with root package name */
    public final Resources.Theme f1265d;

    public x0(Context context) {
        super(context);
        if (!f1.a()) {
            this.f1264c = new z0(this, context.getResources());
            this.f1265d = null;
            return;
        }
        f1 f1Var = new f1(this, context.getResources());
        this.f1264c = f1Var;
        Resources.Theme newTheme = f1Var.newTheme();
        this.f1265d = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof x0) && !(context.getResources() instanceof z0) && !(context.getResources() instanceof f1) && (Build.VERSION.SDK_INT < 21 || f1.a())) {
            z = true;
        }
        if (z) {
            synchronized (a) {
                ArrayList<WeakReference<x0>> arrayList = f1263b;
                if (arrayList == null) {
                    f1263b = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<x0> weakReference = f1263b.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1263b.remove(size);
                        }
                    }
                    for (int size2 = f1263b.size() - 1; size2 >= 0; size2--) {
                        WeakReference<x0> weakReference2 = f1263b.get(size2);
                        x0 x0Var = weakReference2 != null ? weakReference2.get() : null;
                        if (x0Var != null && x0Var.getBaseContext() == context) {
                            return x0Var;
                        }
                    }
                }
                x0 x0Var2 = new x0(context);
                f1263b.add(new WeakReference<>(x0Var2));
                return x0Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1264c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1264c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1265d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        Resources.Theme theme = this.f1265d;
        if (theme == null) {
            super.setTheme(i2);
        } else {
            theme.applyStyle(i2, true);
        }
    }
}
