package c.b.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class w {
    public static final Class<?>[] a = {Context.class, AttributeSet.class};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f854b = {16843375};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f855c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d  reason: collision with root package name */
    public static final c.f.h<String, Constructor<? extends View>> f856d = new c.f.h<>();

    /* renamed from: e  reason: collision with root package name */
    public final Object[] f857e = new Object[2];

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final String f858b;

        /* renamed from: c  reason: collision with root package name */
        public Method f859c;

        /* renamed from: d  reason: collision with root package name */
        public Context f860d;

        public a(View view, String str) {
            this.a = view;
            this.f858b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f859c == null) {
                Context context = this.a.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f858b, View.class)) != null) {
                            this.f859c = method;
                            this.f860d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.a.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder y = e.a.d.a.a.y(" with id '");
                    y.append(this.a.getContext().getResources().getResourceEntryName(id));
                    y.append("'");
                    sb = y.toString();
                }
                StringBuilder y2 = e.a.d.a.a.y("Could not find method ");
                y2.append(this.f858b);
                y2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                y2.append(this.a.getClass());
                y2.append(sb);
                throw new IllegalStateException(y2.toString());
            }
            try {
                this.f859c.invoke(this.f860d, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public c.b.i.d a(Context context, AttributeSet attributeSet) {
        return new c.b.i.d(context, attributeSet);
    }

    public c.b.i.f b(Context context, AttributeSet attributeSet) {
        return new c.b.i.f(context, attributeSet);
    }

    public c.b.i.g c(Context context, AttributeSet attributeSet) {
        return new c.b.i.g(context, attributeSet);
    }

    public c.b.i.r d(Context context, AttributeSet attributeSet) {
        return new c.b.i.r(context, attributeSet, R.attr.radioButtonStyle);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        c.f.h<String, Constructor<? extends View>> hVar = f856d;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f857e);
    }

    public final void h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
