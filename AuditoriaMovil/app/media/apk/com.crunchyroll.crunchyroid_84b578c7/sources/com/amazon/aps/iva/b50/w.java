package com.amazon.aps.iva.b50;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.amazon.aps.iva.d0.d1;
import com.amazon.aps.iva.d0.r1;
import com.amazon.aps.iva.d0.u1;
import com.amazon.aps.iva.d0.z1;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.tl.m;
import com.amazon.aps.iva.xe.a;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: WatchlistModule.kt */
/* loaded from: classes2.dex */
public final class w implements com.amazon.aps.iva.j70.d, com.amazon.aps.iva.c6.j, com.amazon.aps.iva.tl.a, com.amazon.aps.iva.vl.b, com.amazon.aps.iva.ya0.a {
    public static x b;
    public static com.amazon.aps.iva.sf.d f;
    public static final com.amazon.aps.iva.p1.b c = new com.amazon.aps.iva.p1.b(1008);
    public static final w d = new w();
    public static final w e = new w();
    public static final w g = new w();
    public static final com.amazon.aps.iva.xe0.s h = new com.amazon.aps.iva.xe0.s("CLOSED");
    public static final Class[] i = {Context.class};
    public static final Class[] j = {Context.class, AttributeSet.class};

    public w(com.amazon.aps.iva.ds.a aVar) {
    }

    public static final int f(List list, com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.xb0.p pVar2, int i2, int i3, d1 d1Var, d1 d1Var2) {
        int a;
        int i4;
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (d1Var == d1Var2) {
            int size = list.size();
            float f2 = 0.0f;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                com.amazon.aps.iva.s1.l lVar = (com.amazon.aps.iva.s1.l) list.get(i7);
                float m = m(l(lVar));
                int intValue = ((Number) pVar.invoke(lVar, Integer.valueOf(i2))).intValue();
                if (m == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i6 += intValue;
                } else if (m > 0.0f) {
                    f2 += m;
                    i5 = Math.max(i5, com.amazon.aps.iva.ob0.f.a(intValue / m));
                }
            }
            return ((list.size() - 1) * i3) + com.amazon.aps.iva.ob0.f.a(i5 * f2) + i6;
        }
        int min = Math.min((list.size() - 1) * i3, i2);
        int size2 = list.size();
        float f3 = 0.0f;
        int i8 = 0;
        for (int i9 = 0; i9 < size2; i9++) {
            com.amazon.aps.iva.s1.l lVar2 = (com.amazon.aps.iva.s1.l) list.get(i9);
            float m2 = m(l(lVar2));
            if (m2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int min2 = Math.min(((Number) pVar2.invoke(lVar2, Integer.MAX_VALUE)).intValue(), i2 - min);
                min += min2;
                i8 = Math.max(i8, ((Number) pVar.invoke(lVar2, Integer.valueOf(min2))).intValue());
            } else if (m2 > 0.0f) {
                f3 += m2;
            }
        }
        if (f3 != 0.0f) {
            z3 = false;
        }
        if (z3) {
            a = 0;
        } else if (i2 == Integer.MAX_VALUE) {
            a = Integer.MAX_VALUE;
        } else {
            a = com.amazon.aps.iva.ob0.f.a(Math.max(i2 - min, 0) / f3);
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            com.amazon.aps.iva.s1.l lVar3 = (com.amazon.aps.iva.s1.l) list.get(i10);
            float m3 = m(l(lVar3));
            if (m3 > 0.0f) {
                if (a != Integer.MAX_VALUE) {
                    i4 = com.amazon.aps.iva.ob0.f.a(a * m3);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                i8 = Math.max(i8, ((Number) pVar.invoke(lVar3, Integer.valueOf(i4))).intValue());
            }
        }
        return i8;
    }

    public static com.amazon.aps.iva.oc0.e g(com.amazon.aps.iva.oc0.e eVar) {
        com.amazon.aps.iva.nd0.d g2 = com.amazon.aps.iva.qd0.i.g(eVar);
        String str = com.amazon.aps.iva.nc0.c.a;
        com.amazon.aps.iva.nd0.c cVar = com.amazon.aps.iva.nc0.c.k.get(g2);
        if (cVar != null) {
            return com.amazon.aps.iva.ud0.b.e(eVar).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public static final u1 l(com.amazon.aps.iva.s1.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        Object b2 = lVar.b();
        if (b2 instanceof u1) {
            return (u1) b2;
        }
        return null;
    }

    public static final float m(u1 u1Var) {
        if (u1Var != null) {
            return u1Var.a;
        }
        return 0.0f;
    }

    public static com.amazon.aps.iva.oc0.e p(w wVar, com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.lc0.k kVar) {
        wVar.getClass();
        com.amazon.aps.iva.yb0.j.f(kVar, "builtIns");
        String str = com.amazon.aps.iva.nc0.c.a;
        com.amazon.aps.iva.nd0.b f2 = com.amazon.aps.iva.nc0.c.f(cVar);
        if (f2 != null) {
            return kVar.j(f2.b());
        }
        return null;
    }

    public static com.amazon.aps.iva.c4.c q(String str, a.c cVar, int i2) {
        com.amazon.aps.iva.xe0.d dVar;
        com.amazon.aps.iva.xb0.l lVar = cVar;
        if ((i2 & 4) != 0) {
            lVar = com.amazon.aps.iva.c4.a.h;
        }
        if ((i2 & 8) != 0) {
            dVar = com.amazon.aps.iva.e.z.i(r0.b.plus(com.amazon.aps.iva.se0.i.a()));
        } else {
            dVar = null;
        }
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.f(lVar, "produceMigrations");
        com.amazon.aps.iva.yb0.j.f(dVar, "scope");
        return new com.amazon.aps.iva.c4.c(str, lVar, dVar);
    }

    public static final r1 r(d1 d1Var, com.amazon.aps.iva.xb0.s sVar, float f2, z1 z1Var, com.amazon.aps.iva.d0.q qVar) {
        com.amazon.aps.iva.yb0.j.f(d1Var, "orientation");
        com.amazon.aps.iva.yb0.j.f(sVar, "arrangement");
        com.amazon.aps.iva.yb0.j.f(z1Var, "crossAxisSize");
        return new r1(d1Var, sVar, f2, z1Var, qVar);
    }

    @Override // com.amazon.aps.iva.tl.a
    public boolean a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, ImagesContract.URL);
        Pattern pattern = com.amazon.aps.iva.x50.w.a;
        return com.amazon.aps.iva.x50.w.a.matcher(str).matches();
    }

    @Override // com.amazon.aps.iva.j70.d
    public boolean b(String str) {
        com.amazon.aps.iva.yb0.j.f(str, Scopes.EMAIL);
        return !com.amazon.aps.iva.oe0.m.b0(str);
    }

    @Override // com.amazon.aps.iva.vl.b
    public void c(m.a aVar) {
        aVar.invoke(com.amazon.aps.iva.lb0.o.b0(com.amazon.aps.iva.vl.a.values()));
    }

    @Override // com.amazon.aps.iva.vl.b
    public boolean e(com.amazon.aps.iva.vl.a aVar) {
        if (aVar != com.amazon.aps.iva.vl.a.OTHER_PLAYBACK_ISSUE) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ya0.a
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Class cls;
        Constructor constructor;
        Object[] objArr;
        com.amazon.aps.iva.yb0.j.g(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        com.amazon.aps.iva.yb0.j.g(context, "context");
        try {
            try {
                constructor = Class.forName(str).asSubclass(View.class).getConstructor((Class[]) Arrays.copyOf(j, 2));
                com.amazon.aps.iva.yb0.j.b(constructor, "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_2)");
                objArr = new Object[]{context, attributeSet};
            } catch (NoSuchMethodException unused) {
                constructor = cls.getConstructor((Class[]) Arrays.copyOf(i, 1));
                com.amazon.aps.iva.yb0.j.b(constructor, "clazz.getConstructor(*CONSTRUCTOR_SIGNATURE_1)");
                objArr = new Context[]{context};
            }
            constructor.setAccessible(true);
            return (View) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e2) {
            if (e2 instanceof ClassNotFoundException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof NoSuchMethodException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof IllegalAccessException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof InstantiationException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof InvocationTargetException) {
                e2.printStackTrace();
                return null;
            } else {
                throw e2;
            }
        }
    }
}
