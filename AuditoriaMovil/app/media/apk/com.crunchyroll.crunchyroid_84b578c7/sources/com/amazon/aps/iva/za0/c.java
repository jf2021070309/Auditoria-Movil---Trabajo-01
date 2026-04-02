package com.amazon.aps.iva.za0;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.ya0.e;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yb0.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: -ViewPumpLayoutInflater.kt */
/* loaded from: classes4.dex */
public final class c extends LayoutInflater {
    public final boolean a;
    public final C0915c b;
    public final d c;
    public boolean d;
    public static final b g = new b();
    public static final Set<String> e = l1.I("android.widget.", "android.webkit.");
    public static final m f = com.amazon.aps.iva.kb0.f.b(a.h);

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<Field> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Field invoke() {
            Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                return declaredField;
            }
            throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!".toString());
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        public static final /* synthetic */ com.amazon.aps.iva.fc0.l[] a = {e0.c(new v(e0.a(b.class), "CONSTRUCTOR_ARGS_FIELD", "getCONSTRUCTOR_ARGS_FIELD()Ljava/lang/reflect/Field;"))};

        public static final Field a(b bVar) {
            bVar.getClass();
            m mVar = c.f;
            com.amazon.aps.iva.fc0.l lVar = a[0];
            return (Field) mVar.getValue();
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* renamed from: com.amazon.aps.iva.za0.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0915c implements com.amazon.aps.iva.ya0.a {
        public final c b;

        public C0915c(c cVar) {
            com.amazon.aps.iva.yb0.j.g(cVar, "inflater");
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.ya0.a
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            c cVar;
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            Iterator<String> it = c.e.iterator();
            View view2 = null;
            while (true) {
                boolean hasNext = it.hasNext();
                cVar = this.b;
                if (!hasNext) {
                    break;
                }
                try {
                    view2 = cVar.createView(str, it.next(), attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (view2 != null) {
                    break;
                }
            }
            if (view2 == null) {
                return c.b(cVar, str, attributeSet);
            }
            return view2;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class d implements com.amazon.aps.iva.ya0.a {
        public final c b;

        public d(c cVar) {
            com.amazon.aps.iva.yb0.j.g(cVar, "inflater");
            this.b = cVar;
        }

        @Override // com.amazon.aps.iva.ya0.a
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            return c.a(this.b, view, str, attributeSet);
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class e extends g {
        public final f c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LayoutInflater.Factory2 factory2, c cVar) {
            super(factory2);
            com.amazon.aps.iva.yb0.j.g(cVar, "inflater");
            this.c = new f(factory2, cVar);
        }

        @Override // com.amazon.aps.iva.za0.c.g, android.view.LayoutInflater.Factory2
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            com.amazon.aps.iva.ya0.e.f.getClass();
            return e.c.a().a(new com.amazon.aps.iva.ya0.b(str, context, attributeSet, view, this.c)).a;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class f extends h {
        public final c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LayoutInflater.Factory2 factory2, c cVar) {
            super(factory2);
            com.amazon.aps.iva.yb0.j.g(cVar, "inflater");
            this.c = cVar;
        }

        @Override // com.amazon.aps.iva.za0.c.h, com.amazon.aps.iva.ya0.a
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            View onCreateView = this.b.onCreateView(view, str, context, attributeSet);
            Set<String> set = c.e;
            c cVar = this.c;
            cVar.getClass();
            com.amazon.aps.iva.ya0.e.f.getClass();
            if (e.c.a().d && onCreateView == null && q.q0(str, '.', 0, false, 6) > -1) {
                if (cVar.a) {
                    return cVar.cloneInContext(context).createView(str, null, attributeSet);
                }
                b bVar = c.g;
                Object obj = b.a(bVar).get(cVar);
                if (obj != null) {
                    Object[] objArr = (Object[]) obj;
                    Object obj2 = objArr[0];
                    objArr[0] = context;
                    k.D(b.a(bVar), cVar, objArr);
                    try {
                        onCreateView = cVar.createView(str, null, attributeSet);
                        objArr[0] = obj2;
                    } catch (ClassNotFoundException unused) {
                        objArr[0] = obj2;
                    } catch (Throwable th) {
                        objArr[0] = obj2;
                        k.D(b.a(bVar), cVar, objArr);
                        throw th;
                    }
                    k.D(b.a(bVar), cVar, objArr);
                    return onCreateView;
                }
                throw new o("null cannot be cast to non-null type kotlin.Array<kotlin.Any>");
            }
            return onCreateView;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static class g implements LayoutInflater.Factory2 {
        public final h b;

        public g(LayoutInflater.Factory2 factory2) {
            com.amazon.aps.iva.yb0.j.g(factory2, "factory2");
            this.b = new h(factory2);
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            return onCreateView(null, str, context, attributeSet);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            com.amazon.aps.iva.ya0.e.f.getClass();
            return e.c.a().a(new com.amazon.aps.iva.ya0.b(str, context, attributeSet, view, this.b)).a;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static class h implements com.amazon.aps.iva.ya0.a {
        public final LayoutInflater.Factory2 b;

        public h(LayoutInflater.Factory2 factory2) {
            com.amazon.aps.iva.yb0.j.g(factory2, "factory2");
            this.b = factory2;
        }

        @Override // com.amazon.aps.iva.ya0.a
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            return this.b.onCreateView(view, str, context, attributeSet);
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class i implements LayoutInflater.Factory {
        public final j b;

        public i(LayoutInflater.Factory factory) {
            com.amazon.aps.iva.yb0.j.g(factory, "factory");
            this.b = new j(factory);
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            com.amazon.aps.iva.ya0.e.f.getClass();
            return e.c.a().a(new com.amazon.aps.iva.ya0.b(str, context, attributeSet, this.b)).a;
        }
    }

    /* compiled from: -ViewPumpLayoutInflater.kt */
    /* loaded from: classes4.dex */
    public static final class j implements com.amazon.aps.iva.ya0.a {
        public final LayoutInflater.Factory b;

        public j(LayoutInflater.Factory factory) {
            com.amazon.aps.iva.yb0.j.g(factory, "factory");
            this.b = factory;
        }

        @Override // com.amazon.aps.iva.ya0.a
        public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            com.amazon.aps.iva.yb0.j.g(context, "context");
            return this.b.onCreateView(str, context, attributeSet);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LayoutInflater layoutInflater, Context context, boolean z) {
        super(layoutInflater, context);
        boolean z2;
        com.amazon.aps.iva.yb0.j.g(layoutInflater, "original");
        com.amazon.aps.iva.yb0.j.g(context, "newContext");
        int i2 = Build.VERSION.SDK_INT;
        boolean z3 = true;
        if (i2 <= 28) {
            int i3 = com.amazon.aps.iva.k3.a.a;
            if (i2 >= 29) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        this.a = z3;
        this.b = new C0915c(this);
        this.c = new d(this);
        com.amazon.aps.iva.ya0.e.f.getClass();
        e.c.a();
        if (!z) {
            if (getFactory2() != null && !(getFactory2() instanceof g)) {
                setFactory2(getFactory2());
            }
            if (getFactory() != null && !(getFactory() instanceof i)) {
                setFactory(getFactory());
            }
        }
    }

    public static final View a(c cVar, View view, String str, AttributeSet attributeSet) {
        cVar.getClass();
        try {
            return super.onCreateView(view, str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final View b(c cVar, String str, AttributeSet attributeSet) {
        cVar.getClass();
        try {
            return super.onCreateView(str, attributeSet);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        com.amazon.aps.iva.yb0.j.g(context, "newContext");
        return new c(this, context, true);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i2, ViewGroup viewGroup, boolean z) {
        return super.inflate(i2, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(View view, String str, AttributeSet attributeSet) throws ClassNotFoundException {
        com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.ya0.e.f.getClass();
        com.amazon.aps.iva.ya0.e a2 = e.c.a();
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.b(context, "context");
        return a2.a(new com.amazon.aps.iva.ya0.b(str, context, attributeSet, view, this.c)).a;
    }

    @Override // android.view.LayoutInflater
    public final void setFactory(LayoutInflater.Factory factory) {
        com.amazon.aps.iva.yb0.j.g(factory, "factory");
        if (!(factory instanceof i)) {
            super.setFactory(new i(factory));
        } else {
            super.setFactory(factory);
        }
    }

    @Override // android.view.LayoutInflater
    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        com.amazon.aps.iva.yb0.j.g(factory2, "factory2");
        if (!(factory2 instanceof g)) {
            super.setFactory2(new g(factory2));
        } else {
            super.setFactory2(factory2);
        }
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        Method method;
        com.amazon.aps.iva.yb0.j.g(xmlPullParser, "parser");
        if (!this.d) {
            com.amazon.aps.iva.ya0.e.f.getClass();
            if (e.c.a().c) {
                if (!(getContext() instanceof LayoutInflater.Factory2)) {
                    this.d = true;
                } else {
                    Method[] methods = LayoutInflater.class.getMethods();
                    int length = methods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            method = null;
                            break;
                        }
                        method = methods[i2];
                        com.amazon.aps.iva.yb0.j.b(method, FirebaseAnalytics.Param.METHOD);
                        if (com.amazon.aps.iva.yb0.j.a(method.getName(), "setPrivateFactory")) {
                            method.setAccessible(true);
                            break;
                        }
                        i2++;
                    }
                    Object[] objArr = new Object[1];
                    Context context = getContext();
                    if (context != null) {
                        objArr[0] = new e((LayoutInflater.Factory2) context, this);
                        if (method != null) {
                            try {
                                method.invoke(this, Arrays.copyOf(objArr, 1));
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                            }
                        }
                        this.d = true;
                    } else {
                        throw new o("null cannot be cast to non-null type android.view.LayoutInflater.Factory2");
                    }
                }
            }
        }
        View inflate = super.inflate(xmlPullParser, viewGroup, z);
        com.amazon.aps.iva.yb0.j.b(inflate, "super.inflate(parser, root, attachToRoot)");
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.ya0.e.f.getClass();
        com.amazon.aps.iva.ya0.e a2 = e.c.a();
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.b(context, "context");
        return a2.a(new com.amazon.aps.iva.ya0.b(str, context, attributeSet, this.b)).a;
    }
}
