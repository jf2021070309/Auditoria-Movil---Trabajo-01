package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.fc0.m;
import com.amazon.aps.iva.ic0.h0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: KProperty0Impl.kt */
/* loaded from: classes4.dex */
public class e0<V> extends h0<V> implements com.amazon.aps.iva.fc0.m<V> {
    public final com.amazon.aps.iva.kb0.e<a<V>> n;
    public final com.amazon.aps.iva.kb0.e<Object> o;

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes4.dex */
    public static final class a<R> extends h0.b<R> implements m.a<R> {
        public final e0<R> j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e0<? extends R> e0Var) {
            com.amazon.aps.iva.yb0.j.f(e0Var, "property");
            this.j = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final R invoke() {
            return this.j.get();
        }

        @Override // com.amazon.aps.iva.ic0.h0.a
        public final h0 s() {
            return this.j;
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<a<? extends V>> {
        public final /* synthetic */ e0<V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e0<? extends V> e0Var) {
            super(0);
            this.h = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            return new a(this.h);
        }
    }

    /* compiled from: KProperty0Impl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Object> {
        public final /* synthetic */ e0<V> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e0<? extends V> e0Var) {
            super(0);
            this.h = e0Var;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            Object obj;
            boolean z;
            AccessibleObject accessibleObject;
            e0<V> e0Var = this.h;
            Member r = e0Var.r();
            try {
                Object obj2 = h0.m;
                if (e0Var.q()) {
                    obj = f1.q(e0Var.j, e0Var.o());
                } else {
                    obj = null;
                }
                if (obj != obj2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    obj = null;
                }
                e0Var.q();
                if (r instanceof AccessibleObject) {
                    accessibleObject = (AccessibleObject) r;
                } else {
                    accessibleObject = null;
                }
                if (accessibleObject != null) {
                    accessibleObject.setAccessible(com.amazon.aps.iva.hc0.a.a(e0Var));
                }
                if (r == null) {
                    return null;
                }
                if (r instanceof Field) {
                    return ((Field) r).get(obj);
                }
                if (r instanceof Method) {
                    int length = ((Method) r).getParameterTypes().length;
                    if (length != 0) {
                        if (length != 1) {
                            if (length == 2) {
                                Method method = (Method) r;
                                Class<?> cls = ((Method) r).getParameterTypes()[1];
                                com.amazon.aps.iva.yb0.j.e(cls, "fieldOrMethod.parameterTypes[1]");
                                return method.invoke(null, obj, v0.e(cls));
                            }
                            throw new AssertionError("delegate method " + r + " should take 0, 1, or 2 parameters");
                        }
                        Method method2 = (Method) r;
                        Object[] objArr = new Object[1];
                        if (obj == null) {
                            Class<?> cls2 = ((Method) r).getParameterTypes()[0];
                            com.amazon.aps.iva.yb0.j.e(cls2, "fieldOrMethod.parameterTypes[0]");
                            obj = v0.e(cls2);
                        }
                        objArr[0] = obj;
                        return method2.invoke(null, objArr);
                    }
                    return ((Method) r).invoke(null, new Object[0]);
                }
                throw new AssertionError("delegate field/method " + r + " neither field nor method");
            } catch (IllegalAccessException e) {
                throw new com.amazon.aps.iva.qw.n(e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s sVar, com.amazon.aps.iva.oc0.n0 n0Var) {
        super(sVar, n0Var);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(n0Var, "descriptor");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        this.o = com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }

    @Override // com.amazon.aps.iva.fc0.m
    public final V get() {
        return this.n.getValue().call(new Object[0]);
    }

    @Override // com.amazon.aps.iva.fc0.m
    public final Object getDelegate() {
        return this.o.getValue();
    }

    @Override // com.amazon.aps.iva.fc0.m
    /* renamed from: getGetter */
    public final m.a mo26getGetter() {
        return this.n.getValue();
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final V invoke() {
        return get();
    }

    @Override // com.amazon.aps.iva.ic0.h0
    public final h0.b t() {
        return this.n.getValue();
    }

    public final l.a u() {
        return this.n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s sVar, String str, String str2, Object obj) {
        super(sVar, str, str2, obj);
        com.amazon.aps.iva.yb0.j.f(sVar, "container");
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(str2, "signature");
        com.amazon.aps.iva.kb0.g gVar = com.amazon.aps.iva.kb0.g.PUBLICATION;
        this.n = com.amazon.aps.iva.kb0.f.a(gVar, new b(this));
        this.o = com.amazon.aps.iva.kb0.f.a(gVar, new c(this));
    }
}
