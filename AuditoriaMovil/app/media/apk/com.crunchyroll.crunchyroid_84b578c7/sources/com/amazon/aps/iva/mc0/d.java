package com.amazon.aps.iva.mc0;

import com.amazon.aps.iva.de0.l;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.mc0.e;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.yb0.j;
import java.util.List;
/* compiled from: FunctionClassScope.kt */
/* loaded from: classes4.dex */
public final class d extends com.amazon.aps.iva.xd0.e {

    /* compiled from: FunctionClassScope.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.Function.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SuspendFunction.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l lVar, b bVar) {
        super(lVar, bVar);
        j.f(lVar, "storageManager");
        j.f(bVar, "containingClass");
    }

    @Override // com.amazon.aps.iva.xd0.e
    public final List<v> h() {
        com.amazon.aps.iva.oc0.e eVar = this.b;
        j.d(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        b bVar = (b) eVar;
        int i = a.a[bVar.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return z.b;
            }
            return f1.J(e.a.a(bVar, true));
        }
        return f1.J(e.a.a(bVar, false));
    }
}
