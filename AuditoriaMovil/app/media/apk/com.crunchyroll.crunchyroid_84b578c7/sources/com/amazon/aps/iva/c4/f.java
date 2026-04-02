package com.amazon.aps.iva.c4;

import com.amazon.aps.iva.e4.a1;
import com.amazon.aps.iva.e4.d1;
import com.amazon.aps.iva.e4.e1;
import com.amazon.aps.iva.e4.f0;
import com.amazon.aps.iva.e4.r0;
import com.amazon.aps.iva.e4.x;
import com.amazon.aps.iva.e4.z;
import com.amazon.aps.iva.e4.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class f extends x<f, a> implements r0 {
    private static final f DEFAULT_INSTANCE;
    private static volatile z0<f> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private z.c<String> strings_ = d1.e;

    /* compiled from: PreferencesProto.java */
    /* loaded from: classes.dex */
    public static final class a extends x.a<f, a> implements r0 {
        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        x.j(f.class, fVar);
    }

    public static void l(f fVar, Iterable iterable) {
        int i;
        if (!fVar.strings_.isModifiable()) {
            z.c<String> cVar = fVar.strings_;
            int size = cVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            fVar.strings_ = cVar.mutableCopyWithCapacity(i);
        }
        List list = fVar.strings_;
        Charset charset = z.a;
        iterable.getClass();
        if (iterable instanceof f0) {
            List<?> underlyingElements = ((f0) iterable).getUnderlyingElements();
            f0 f0Var = (f0) list;
            int size2 = list.size();
            for (Object obj : underlyingElements) {
                if (obj == null) {
                    String str = "Element at index " + (f0Var.size() - size2) + " is null.";
                    int size3 = f0Var.size();
                    while (true) {
                        size3--;
                        if (size3 < size2) {
                            break;
                        }
                        f0Var.remove(size3);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof com.amazon.aps.iva.e4.i) {
                    f0Var.v((com.amazon.aps.iva.e4.i) obj);
                } else {
                    f0Var.add((String) obj);
                }
            }
        } else if (iterable instanceof a1) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size4 = list.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (list.size() - size4) + " is null.";
                    int size5 = list.size();
                    while (true) {
                        size5--;
                        if (size5 < size4) {
                            break;
                        }
                        list.remove(size5);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(obj2);
            }
        }
    }

    public static f m() {
        return DEFAULT_INSTANCE;
    }

    public static a o() {
        f fVar = DEFAULT_INSTANCE;
        fVar.getClass();
        return (a) ((x.a) fVar.f(x.f.NEW_BUILDER));
    }

    @Override // com.amazon.aps.iva.e4.x
    public final Object f(x.f fVar) {
        switch (d.a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a();
            case 3:
                return new e1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                z0<f> z0Var = PARSER;
                if (z0Var == null) {
                    synchronized (f.class) {
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

    public final z.c n() {
        return this.strings_;
    }
}
