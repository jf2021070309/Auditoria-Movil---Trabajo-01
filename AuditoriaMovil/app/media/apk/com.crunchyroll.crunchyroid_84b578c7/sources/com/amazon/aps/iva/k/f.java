package com.amazon.aps.iva.k;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.k.s;
import com.amazon.aps.iva.k.u;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.x.b;
import java.lang.ref.WeakReference;
/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class f {
    public static final u.a b = new u.a(new u.b());
    public static final int c = -100;
    public static com.amazon.aps.iva.k3.j d = null;
    public static com.amazon.aps.iva.k3.j e = null;
    public static Boolean f = null;
    public static boolean g = false;
    public static final com.amazon.aps.iva.x.b<WeakReference<f>> h = new com.amazon.aps.iva.x.b<>();
    public static final Object i = new Object();
    public static final Object j = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean k(Context context) {
        if (f == null) {
            try {
                int i2 = s.b;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, s.class), s.a.a() | 128).metaData;
                if (bundle != null) {
                    f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f = Boolean.FALSE;
            }
        }
        return f.booleanValue();
    }

    public static void t(f fVar) {
        synchronized (i) {
            com.amazon.aps.iva.x.b<WeakReference<f>> bVar = h;
            bVar.getClass();
            b.a aVar = new b.a();
            while (aVar.hasNext()) {
                f fVar2 = (f) ((WeakReference) aVar.next()).get();
                if (fVar2 == fVar || fVar2 == null) {
                    aVar.remove();
                }
            }
        }
    }

    public abstract void A(CharSequence charSequence);

    public abstract com.amazon.aps.iva.o.a B(a.InterfaceC0549a interfaceC0549a);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T c(int i2);

    public Context d() {
        return null;
    }

    public abstract com.amazon.aps.iva.k.b e();

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract com.amazon.aps.iva.k.a h();

    public abstract void i();

    public abstract void j();

    public abstract void l(Configuration configuration);

    public abstract void m(Bundle bundle);

    public abstract void n();

    public abstract void o(Bundle bundle);

    public abstract void p();

    public abstract void q(Bundle bundle);

    public abstract void r();

    public abstract void s();

    public abstract boolean u(int i2);

    public abstract void v(int i2);

    public abstract void w(View view);

    public abstract void x(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void y(Toolbar toolbar);

    public Context b(Context context) {
        return context;
    }

    public void z(int i2) {
    }
}
