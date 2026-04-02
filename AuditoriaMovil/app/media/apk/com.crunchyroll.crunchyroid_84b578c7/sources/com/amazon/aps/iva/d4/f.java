package com.amazon.aps.iva.d4;

import com.amazon.aps.iva.c4.e;
import com.amazon.aps.iva.c4.f;
import com.amazon.aps.iva.c4.g;
import com.amazon.aps.iva.d4.d;
import com.amazon.aps.iva.e4.a0;
import com.amazon.aps.iva.e4.l;
import com.amazon.aps.iva.e4.z;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z3.m;
import com.amazon.aps.iva.z3.q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
/* compiled from: PreferencesSerializer.kt */
/* loaded from: classes.dex */
public final class f implements m<d> {
    public static final f a = new f();

    /* compiled from: PreferencesSerializer.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.b.values().length];
            iArr[g.b.BOOLEAN.ordinal()] = 1;
            iArr[g.b.FLOAT.ordinal()] = 2;
            iArr[g.b.DOUBLE.ordinal()] = 3;
            iArr[g.b.INTEGER.ordinal()] = 4;
            iArr[g.b.LONG.ordinal()] = 5;
            iArr[g.b.STRING.ordinal()] = 6;
            iArr[g.b.STRING_SET.ordinal()] = 7;
            iArr[g.b.VALUE_NOT_SET.ordinal()] = 8;
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.z3.m
    public final Object a(FileInputStream fileInputStream) throws IOException, com.amazon.aps.iva.z3.a {
        int i;
        try {
            com.amazon.aps.iva.c4.e o = com.amazon.aps.iva.c4.e.o(fileInputStream);
            com.amazon.aps.iva.d4.a aVar = new com.amazon.aps.iva.d4.a(false, 1);
            d.b[] bVarArr = (d.b[]) Arrays.copyOf(new d.b[0], 0);
            j.f(bVarArr, "pairs");
            aVar.f();
            for (d.b bVar : bVarArr) {
                aVar.h(bVar.a, bVar.b);
            }
            Map<String, g> m = o.m();
            j.e(m, "preferencesProto.preferencesMap");
            for (Map.Entry<String, g> entry : m.entrySet()) {
                String key = entry.getKey();
                g value = entry.getValue();
                j.e(key, AppMeasurementSdk.ConditionalUserProperty.NAME);
                j.e(value, "value");
                g.b A = value.A();
                if (A == null) {
                    i = -1;
                } else {
                    i = a.a[A.ordinal()];
                }
                switch (i) {
                    case -1:
                        throw new com.amazon.aps.iva.z3.a("Value case is null.");
                    case 0:
                    default:
                        throw new h();
                    case 1:
                        aVar.h(new d.a<>(key), Boolean.valueOf(value.s()));
                        break;
                    case 2:
                        aVar.h(new d.a<>(key), Float.valueOf(value.v()));
                        break;
                    case 3:
                        aVar.h(new d.a<>(key), Double.valueOf(value.u()));
                        break;
                    case 4:
                        aVar.h(new d.a<>(key), Integer.valueOf(value.w()));
                        break;
                    case 5:
                        aVar.h(new d.a<>(key), Long.valueOf(value.x()));
                        break;
                    case 6:
                        d.a<?> n0 = com.amazon.aps.iva.cq.b.n0(key);
                        Object y = value.y();
                        j.e(y, "value.string");
                        aVar.h(n0, y);
                        break;
                    case 7:
                        d.a<?> aVar2 = new d.a<>(key);
                        z.c n = value.z().n();
                        j.e(n, "value.stringSet.stringsList");
                        aVar.h(aVar2, x.c1(n));
                        break;
                    case 8:
                        throw new com.amazon.aps.iva.z3.a("Value not set.");
                }
            }
            return aVar.e();
        } catch (a0 e) {
            throw new com.amazon.aps.iva.z3.a("Unable to parse preferences proto.", e);
        }
    }

    @Override // com.amazon.aps.iva.z3.m
    public final q b(Object obj, q.b bVar) {
        g c;
        Map<d.a<?>, Object> a2 = ((d) obj).a();
        e.a n = com.amazon.aps.iva.c4.e.n();
        for (Map.Entry<d.a<?>, Object> entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = entry.getKey().a;
            if (value instanceof Boolean) {
                g.a B = g.B();
                boolean booleanValue = ((Boolean) value).booleanValue();
                B.e();
                g.p((g) B.c, booleanValue);
                c = B.c();
            } else if (value instanceof Float) {
                g.a B2 = g.B();
                float floatValue = ((Number) value).floatValue();
                B2.e();
                g.q((g) B2.c, floatValue);
                c = B2.c();
            } else if (value instanceof Double) {
                g.a B3 = g.B();
                double doubleValue = ((Number) value).doubleValue();
                B3.e();
                g.n((g) B3.c, doubleValue);
                c = B3.c();
            } else if (value instanceof Integer) {
                g.a B4 = g.B();
                int intValue = ((Number) value).intValue();
                B4.e();
                g.r((g) B4.c, intValue);
                c = B4.c();
            } else if (value instanceof Long) {
                g.a B5 = g.B();
                long longValue = ((Number) value).longValue();
                B5.e();
                g.k((g) B5.c, longValue);
                c = B5.c();
            } else if (value instanceof String) {
                g.a B6 = g.B();
                B6.e();
                g.l((g) B6.c, (String) value);
                c = B6.c();
            } else if (value instanceof Set) {
                g.a B7 = g.B();
                f.a o = com.amazon.aps.iva.c4.f.o();
                o.e();
                com.amazon.aps.iva.c4.f.l((com.amazon.aps.iva.c4.f) o.c, (Set) value);
                B7.e();
                g.m((g) B7.c, o);
                c = B7.c();
            } else {
                throw new IllegalStateException(j.k(value.getClass().getName(), "PreferencesSerializer does not support type: "));
            }
            n.getClass();
            str.getClass();
            n.e();
            com.amazon.aps.iva.c4.e.l((com.amazon.aps.iva.c4.e) n.c).put(str, c);
        }
        com.amazon.aps.iva.c4.e c2 = n.c();
        int serializedSize = c2.getSerializedSize();
        Logger logger = l.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        l.d dVar = new l.d(bVar, serializedSize);
        c2.b(dVar);
        if (dVar.f > 0) {
            dVar.a0();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.z3.m
    public final d getDefaultValue() {
        return new com.amazon.aps.iva.d4.a(true, 1);
    }
}
