package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.xd0.d;
/* compiled from: MemberScope.kt */
/* loaded from: classes4.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c {
        public static final a a = new a();
        public static final int b;

        static {
            d.a aVar = d.c;
            aVar.getClass();
            int i = d.k;
            aVar.getClass();
            int i2 = d.i;
            aVar.getClass();
            b = (~(d.j | i2)) & i;
        }

        @Override // com.amazon.aps.iva.xd0.c
        public final int a() {
            return b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class b extends c {
        public static final b a = new b();

        @Override // com.amazon.aps.iva.xd0.c
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
