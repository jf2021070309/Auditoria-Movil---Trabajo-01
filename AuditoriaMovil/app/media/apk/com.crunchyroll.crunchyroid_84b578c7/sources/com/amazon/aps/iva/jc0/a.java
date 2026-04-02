package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AnnotationConstructorCaller.kt */
/* loaded from: classes4.dex */
public final class a implements f {
    public final Class<?> a;
    public final List<String> b;
    public final EnumC0410a c;
    public final List<Method> d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    /* compiled from: AnnotationConstructorCaller.kt */
    /* renamed from: com.amazon.aps.iva.jc0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0410a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    /* loaded from: classes4.dex */
    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class cls, ArrayList arrayList, EnumC0410a enumC0410a, b bVar, List list) {
        com.amazon.aps.iva.yb0.j.f(cls, "jClass");
        com.amazon.aps.iva.yb0.j.f(enumC0410a, "callMode");
        com.amazon.aps.iva.yb0.j.f(bVar, "origin");
        com.amazon.aps.iva.yb0.j.f(list, "methods");
        this.a = cls;
        this.b = arrayList;
        this.c = enumC0410a;
        this.d = list;
        List<Method> list2 = list;
        ArrayList arrayList2 = new ArrayList(r.Y(list2));
        for (Method method : list2) {
            arrayList2.add(method.getGenericReturnType());
        }
        this.e = arrayList2;
        List<Method> list3 = this.d;
        ArrayList arrayList3 = new ArrayList(r.Y(list3));
        for (Method method2 : list3) {
            Class<?> returnType = method2.getReturnType();
            com.amazon.aps.iva.yb0.j.e(returnType, "it");
            List<com.amazon.aps.iva.fc0.d<? extends Object>> list4 = com.amazon.aps.iva.uc0.d.a;
            Class<? extends Object> cls2 = com.amazon.aps.iva.uc0.d.c.get(returnType);
            if (cls2 != null) {
                returnType = cls2;
            }
            arrayList3.add(returnType);
        }
        this.f = arrayList3;
        List<Method> list5 = this.d;
        ArrayList arrayList4 = new ArrayList(r.Y(list5));
        for (Method method3 : list5) {
            arrayList4.add(method3.getDefaultValue());
        }
        this.g = arrayList4;
        if (this.c == EnumC0410a.POSITIONAL_CALL && bVar == b.JAVA && (!x.G0(this.b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final List<Type> a() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r9.isInstance(r6) != false) goto L9;
     */
    @Override // com.amazon.aps.iva.jc0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(java.lang.Object[] r15) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.a.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Type getReturnType() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.Class r7, java.util.ArrayList r8, com.amazon.aps.iva.jc0.a.EnumC0410a r9, com.amazon.aps.iva.jc0.a.b r10) {
        /*
            r6 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = com.amazon.aps.iva.lb0.r.Y(r8)
            r5.<init>(r0)
            java.util.Iterator r0 = r8.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r1, r2)
            r5.add(r1)
            goto Ld
        L24:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.a.<init>(java.lang.Class, java.util.ArrayList, com.amazon.aps.iva.jc0.a$a, com.amazon.aps.iva.jc0.a$b):void");
    }
}
