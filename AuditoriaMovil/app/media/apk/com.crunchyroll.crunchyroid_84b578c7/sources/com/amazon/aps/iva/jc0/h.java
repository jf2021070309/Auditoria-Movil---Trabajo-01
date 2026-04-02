package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.ic0.v0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
/* compiled from: InlineClassAwareCaller.kt */
/* loaded from: classes4.dex */
public final class h<M extends Member> implements f<M> {
    public final f<M> a;
    public final boolean b;
    public final a c;

    /* compiled from: InlineClassAwareCaller.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.ec0.j a;
        public final Method[] b;
        public final Method c;

        public a(com.amazon.aps.iva.ec0.j jVar, Method[] methodArr, Method method) {
            com.amazon.aps.iva.yb0.j.f(jVar, "argumentRange");
            this.a = jVar;
            this.b = methodArr;
            this.c = method;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        if ((r11 instanceof com.amazon.aps.iva.jc0.e) != false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102 A[LOOP:0: B:46:0x00fc->B:48:0x0102, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(com.amazon.aps.iva.jc0.f r11, com.amazon.aps.iva.oc0.v r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jc0.h.<init>(com.amazon.aps.iva.jc0.f, com.amazon.aps.iva.oc0.v, boolean):void");
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final List<Type> a() {
        return this.a.a();
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final M b() {
        return this.a.b();
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Object call(Object[] objArr) {
        Object invoke;
        com.amazon.aps.iva.yb0.j.f(objArr, "args");
        a aVar = this.c;
        com.amazon.aps.iva.ec0.j jVar = aVar.a;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        com.amazon.aps.iva.yb0.j.e(copyOf, "copyOf(this, size)");
        int i = jVar.b;
        int i2 = jVar.c;
        if (i <= i2) {
            while (true) {
                Method method = aVar.b[i];
                Object obj = objArr[i];
                if (method != null) {
                    if (obj != null) {
                        obj = method.invoke(obj, new Object[0]);
                    } else {
                        Class<?> returnType = method.getReturnType();
                        com.amazon.aps.iva.yb0.j.e(returnType, "method.returnType");
                        obj = v0.e(returnType);
                    }
                }
                copyOf[i] = obj;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Object call = this.a.call(copyOf);
        Method method2 = aVar.c;
        if (method2 != null && (invoke = method2.invoke(null, call)) != null) {
            return invoke;
        }
        return call;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Type getReturnType() {
        return this.a.getReturnType();
    }
}
