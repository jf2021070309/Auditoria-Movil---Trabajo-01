package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.aq.k;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: Caller.kt */
/* loaded from: classes4.dex */
public interface f<M extends Member> {

    /* compiled from: Caller.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static <M extends Member> void a(f<? extends M> fVar, Object[] objArr) {
            com.amazon.aps.iva.yb0.j.f(objArr, "args");
            if (k.m(fVar) == objArr.length) {
                return;
            }
            StringBuilder sb = new StringBuilder("Callable expects ");
            sb.append(k.m(fVar));
            sb.append(" arguments, but ");
            throw new IllegalArgumentException(defpackage.e.f(sb, objArr.length, " were provided."));
        }
    }

    List<Type> a();

    M b();

    Object call(Object[] objArr);

    Type getReturnType();
}
