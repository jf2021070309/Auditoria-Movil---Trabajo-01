package com.amazon.aps.iva.jc0;

import com.amazon.aps.iva.lb0.z;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ThrowingCaller.kt */
/* loaded from: classes4.dex */
public final class j implements f {
    public static final j a = new j();

    @Override // com.amazon.aps.iva.jc0.f
    public final List<Type> a() {
        return z.b;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Object call(Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // com.amazon.aps.iva.jc0.f
    public final Type getReturnType() {
        Class cls = Void.TYPE;
        com.amazon.aps.iva.yb0.j.e(cls, "TYPE");
        return cls;
    }
}
