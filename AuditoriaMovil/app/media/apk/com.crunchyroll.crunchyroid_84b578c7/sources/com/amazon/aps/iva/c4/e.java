package com.amazon.aps.iva.c4;

import com.amazon.aps.iva.e4.a0;
import com.amazon.aps.iva.e4.e1;
import com.amazon.aps.iva.e4.j;
import com.amazon.aps.iva.e4.j0;
import com.amazon.aps.iva.e4.k0;
import com.amazon.aps.iva.e4.m1;
import com.amazon.aps.iva.e4.p;
import com.amazon.aps.iva.e4.r0;
import com.amazon.aps.iva.e4.u1;
import com.amazon.aps.iva.e4.x;
import com.amazon.aps.iva.e4.z0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class e extends x<e, a> implements r0 {
    private static final e DEFAULT_INSTANCE;
    private static volatile z0<e> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private k0<String, g> preferences_ = k0.c;

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes.dex */
    public static final class a extends x.a<e, a> implements r0 {
        public a() {
            super(e.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final j0<String, g> a = new j0<>(u1.STRING, u1.MESSAGE, g.t());
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        x.j(e.class, eVar);
    }

    public static k0 l(e eVar) {
        k0<String, g> k0Var = eVar.preferences_;
        if (!k0Var.b) {
            eVar.preferences_ = k0Var.d();
        }
        return eVar.preferences_;
    }

    public static a n() {
        e eVar = DEFAULT_INSTANCE;
        eVar.getClass();
        return (a) ((x.a) eVar.f(x.f.NEW_BUILDER));
    }

    public static e o(FileInputStream fileInputStream) throws IOException {
        x i = x.i(DEFAULT_INSTANCE, new j.b(fileInputStream), p.a());
        if (i.isInitialized()) {
            return (e) i;
        }
        throw new a0(new m1().getMessage());
    }

    @Override // com.amazon.aps.iva.e4.x
    public final Object f(x.f fVar) {
        switch (d.a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new a();
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<e> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (e.class) {
                        try {
                            z0Var = PARSER;
                            if (z0Var == null) {
                                z0Var = new x.b<>(DEFAULT_INSTANCE);
                                PARSER = z0Var;
                            }
                        } finally {
                        }
                    }
                }
                return z0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map<String, g> m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
