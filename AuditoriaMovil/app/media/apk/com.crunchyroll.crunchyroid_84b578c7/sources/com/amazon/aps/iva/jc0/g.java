package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.jc0.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.m;
import com.amazon.aps.iva.lb0.o;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: CallerImpl.kt */
/* loaded from: classes4.dex */
public abstract class g<M extends Member> implements com.amazon.aps.iva.jc0.f<M> {
    public final M a;
    public final Type b;
    public final Class<?> c;
    public final List<Type> d;

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static final class a extends g<Constructor<?>> implements com.amazon.aps.iva.jc0.e {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.reflect.Constructor<?> r5, java.lang.Object r6) {
            /*
                r4 = this;
                java.lang.String r0 = "constructor"
                com.amazon.aps.iva.yb0.j.f(r5, r0)
                java.lang.Class r0 = r5.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.reflect.Type[] r1 = r5.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                com.amazon.aps.iva.yb0.j.e(r1, r2)
                int r2 = r1.length
                r3 = 2
                if (r2 > r3) goto L1f
                r1 = 0
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                goto L26
            L1f:
                int r2 = r1.length
                r3 = 1
                int r2 = r2 - r3
                java.lang.Object[] r1 = com.amazon.aps.iva.lb0.m.I(r3, r2, r1)
            L26:
                java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
                r2 = 0
                r4.<init>(r5, r0, r2, r1)
                r4.e = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(3);
            bVar.a(this.e);
            bVar.b(objArr);
            bVar.a(null);
            return ((Constructor) this.a).newInstance(bVar.d(new Object[bVar.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static final class b extends g<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(java.lang.reflect.Constructor<?> r6) {
            /*
                r5 = this;
                java.lang.String r0 = "constructor"
                com.amazon.aps.iva.yb0.j.f(r6, r0)
                java.lang.Class r0 = r6.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.reflect.Type[] r1 = r6.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                com.amazon.aps.iva.yb0.j.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 1
                if (r2 > r4) goto L1f
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r3]
                goto L25
            L1f:
                int r2 = r1.length
                int r2 = r2 - r4
                java.lang.Object[] r1 = com.amazon.aps.iva.lb0.m.I(r3, r2, r1)
            L25:
                java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
                r2 = 0
                r5.<init>(r6, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
            bVar.b(objArr);
            bVar.a(null);
            return ((Constructor) this.a).newInstance(bVar.d(new Object[bVar.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static final class c extends g<Constructor<?>> implements com.amazon.aps.iva.jc0.e {
        public final Object e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(java.lang.reflect.Constructor<?> r4, java.lang.Object r5) {
            /*
                r3 = this;
                java.lang.String r0 = "constructor"
                com.amazon.aps.iva.yb0.j.f(r4, r0)
                java.lang.Class r0 = r4.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.reflect.Type[] r1 = r4.getGenericParameterTypes()
                java.lang.String r2 = "constructor.genericParameterTypes"
                com.amazon.aps.iva.yb0.j.e(r1, r2)
                r2 = 0
                r3.<init>(r4, r0, r2, r1)
                r3.e = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
            bVar.a(this.e);
            bVar.b(objArr);
            return ((Constructor) this.a).newInstance(bVar.d(new Object[bVar.c()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static final class d extends g<Constructor<?>> {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(java.lang.reflect.Constructor<?> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "constructor"
                com.amazon.aps.iva.yb0.j.f(r5, r0)
                java.lang.Class r0 = r5.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                java.lang.Class r1 = r5.getDeclaringClass()
                java.lang.Class r2 = r1.getDeclaringClass()
                if (r2 == 0) goto L23
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L23
                goto L24
            L23:
                r2 = 0
            L24:
                java.lang.reflect.Type[] r1 = r5.getGenericParameterTypes()
                java.lang.String r3 = "constructor.genericParameterTypes"
                com.amazon.aps.iva.yb0.j.e(r1, r3)
                r4.<init>(r5, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.d.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // com.amazon.aps.iva.jc0.f
        public final Object call(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            return ((Constructor) this.a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static abstract class e extends g<Field> {

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class a extends e implements com.amazon.aps.iva.jc0.e {
            public final Object e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
                this.e = obj;
            }

            @Override // com.amazon.aps.iva.jc0.g.e, com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                return ((Field) this.a).get(this.e);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class b extends e implements com.amazon.aps.iva.jc0.e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class c extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class d extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }

            @Override // com.amazon.aps.iva.jc0.g
            public final void c(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                d(o.Q(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$e$e  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0411e extends e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0411e(Field field) {
                super(field, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(java.lang.reflect.Field r3, boolean r4) {
            /*
                r2 = this;
                java.lang.reflect.Type r0 = r3.getGenericType()
                java.lang.String r1 = "field.genericType"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                if (r4 == 0) goto L10
                java.lang.Class r4 = r3.getDeclaringClass()
                goto L11
            L10:
                r4 = 0
            L11:
                r1 = 0
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2.<init>(r3, r0, r4, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.e.<init>(java.lang.reflect.Field, boolean):void");
        }

        @Override // com.amazon.aps.iva.jc0.f
        public Object call(Object[] objArr) {
            Object obj;
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            c(objArr);
            Field field = (Field) this.a;
            if (this.c != null) {
                obj = o.P(objArr);
            } else {
                obj = null;
            }
            return field.get(obj);
        }
    }

    /* compiled from: CallerImpl.kt */
    /* loaded from: classes4.dex */
    public static abstract class f extends g<Field> {
        public final boolean e;

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class a extends f implements com.amazon.aps.iva.jc0.e {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
                this.f = obj;
            }

            @Override // com.amazon.aps.iva.jc0.g.f, com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                c(objArr);
                ((Field) this.a).set(this.f, o.P(objArr));
                return q.a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class b extends f implements com.amazon.aps.iva.jc0.e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }

            @Override // com.amazon.aps.iva.jc0.g.f, com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                c(objArr);
                ((Field) this.a).set(null, o.W(objArr));
                return q.a;
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class c extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class d extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z) {
                super(field, z, true);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }

            @Override // com.amazon.aps.iva.jc0.g.f, com.amazon.aps.iva.jc0.g
            public final void c(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                super.c(objArr);
                d(o.Q(objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* loaded from: classes4.dex */
        public static final class e extends f {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false);
                com.amazon.aps.iva.yb0.j.f(field, "field");
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(java.lang.reflect.Field r5, boolean r6, boolean r7) {
            /*
                r4 = this;
                java.lang.Class r0 = java.lang.Void.TYPE
                java.lang.String r1 = "TYPE"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                if (r7 == 0) goto Le
                java.lang.Class r7 = r5.getDeclaringClass()
                goto Lf
            Le:
                r7 = 0
            Lf:
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                java.lang.reflect.Type r2 = r5.getGenericType()
                java.lang.String r3 = "field.genericType"
                com.amazon.aps.iva.yb0.j.e(r2, r3)
                r3 = 0
                r1[r3] = r2
                r4.<init>(r5, r0, r7, r1)
                r4.e = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.f.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }

        @Override // com.amazon.aps.iva.jc0.g
        public void c(Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            f.a.a(this, objArr);
            if (this.e && o.W(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // com.amazon.aps.iva.jc0.f
        public Object call(Object[] objArr) {
            Object obj;
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            c(objArr);
            Field field = (Field) this.a;
            if (this.c != null) {
                obj = o.P(objArr);
            } else {
                obj = null;
            }
            field.set(obj, o.W(objArr));
            return q.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(Member member, Type type, Class cls, Type[] typeArr) {
        List<Type> b0;
        this.a = member;
        this.b = type;
        this.c = cls;
        if (cls != null) {
            com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
            bVar.a(cls);
            bVar.b(typeArr);
            b0 = f1.K(bVar.d(new Type[bVar.c()]));
        } else {
            b0 = o.b0(typeArr);
        }
        this.d = b0;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final List<Type> a() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final M b() {
        return this.a;
    }

    public void c(Object[] objArr) {
        f.a.a(this, objArr);
    }

    public final void d(Object obj) {
        if (obj != null && this.a.getDeclaringClass().isInstance(obj)) {
            return;
        }
        throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Type getReturnType() {
        return this.b;
    }

    /* compiled from: CallerImpl.kt */
    /* renamed from: com.amazon.aps.iva.jc0.g$g  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0412g extends g<Method> {
        public final boolean e;

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0412g implements com.amazon.aps.iva.jc0.e {
            public final Object f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, 4);
                com.amazon.aps.iva.yb0.j.f(method, FirebaseAnalytics.Param.METHOD);
                this.f = obj;
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                return e(this.f, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0412g implements com.amazon.aps.iva.jc0.e {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, 4);
                com.amazon.aps.iva.yb0.j.f(method, FirebaseAnalytics.Param.METHOD);
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0412g implements com.amazon.aps.iva.jc0.e {
            public final Object f;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    com.amazon.aps.iva.yb0.j.f(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    com.amazon.aps.iva.yb0.j.e(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L16
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L1b
                L16:
                    int r1 = r0.length
                    java.lang.Object[] r0 = com.amazon.aps.iva.lb0.m.I(r3, r1, r0)
                L1b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r2, r0)
                    r4.f = r6
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.AbstractC0412g.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                com.amazon.aps.iva.ak.b bVar = new com.amazon.aps.iva.ak.b(2);
                bVar.a(this.f);
                bVar.b(objArr);
                return e(null, bVar.d(new Object[bVar.c()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC0412g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, 6);
                com.amazon.aps.iva.yb0.j.f(method, FirebaseAnalytics.Param.METHOD);
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                Object[] I;
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    I = new Object[0];
                } else {
                    I = m.I(1, objArr.length, objArr);
                }
                return e(obj, I);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC0412g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, 4);
                com.amazon.aps.iva.yb0.j.f(method, FirebaseAnalytics.Param.METHOD);
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                Object[] I;
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                d(o.Q(objArr));
                if (objArr.length <= 1) {
                    I = new Object[0];
                } else {
                    I = m.I(1, objArr.length, objArr);
                }
                return e(null, I);
            }
        }

        /* compiled from: CallerImpl.kt */
        /* renamed from: com.amazon.aps.iva.jc0.g$g$f */
        /* loaded from: classes4.dex */
        public static final class f extends AbstractC0412g {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, 6);
                com.amazon.aps.iva.yb0.j.f(method, FirebaseAnalytics.Param.METHOD);
            }

            @Override // com.amazon.aps.iva.jc0.f
            public final Object call(Object[] objArr) {
                com.amazon.aps.iva.yb0.j.f(objArr, "args");
                f.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ AbstractC0412g(java.lang.reflect.Method r2, boolean r3, int r4) {
            /*
                r1 = this;
                r0 = r4 & 2
                if (r0 == 0) goto Le
                int r3 = r2.getModifiers()
                boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
                r3 = r3 ^ 1
            Le:
                r4 = r4 & 4
                if (r4 == 0) goto L1c
                java.lang.reflect.Type[] r4 = r2.getGenericParameterTypes()
                java.lang.String r0 = "method.genericParameterTypes"
                com.amazon.aps.iva.yb0.j.e(r4, r0)
                goto L1d
            L1c:
                r4 = 0
            L1d:
                r1.<init>(r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.AbstractC0412g.<init>(java.lang.reflect.Method, boolean, int):void");
        }

        public final Object e(Object obj, Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            Object invoke = ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            if (this.e) {
                return q.a;
            }
            return invoke;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AbstractC0412g(java.lang.reflect.Method r3, boolean r4, java.lang.reflect.Type[] r5) {
            /*
                r2 = this;
                java.lang.reflect.Type r0 = r3.getGenericReturnType()
                java.lang.String r1 = "method.genericReturnType"
                com.amazon.aps.iva.yb0.j.e(r0, r1)
                if (r4 == 0) goto L10
                java.lang.Class r4 = r3.getDeclaringClass()
                goto L11
            L10:
                r4 = 0
            L11:
                r2.<init>(r3, r0, r4, r5)
                java.lang.Class r3 = java.lang.Void.TYPE
                boolean r3 = com.amazon.aps.iva.yb0.j.a(r0, r3)
                r2.e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.g.AbstractC0412g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }
}
