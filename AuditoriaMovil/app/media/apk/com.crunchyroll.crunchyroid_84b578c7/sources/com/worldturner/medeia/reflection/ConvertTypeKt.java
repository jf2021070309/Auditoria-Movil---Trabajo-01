package com.worldturner.medeia.reflection;

import com.amazon.aps.iva.ab.t;
import com.amazon.aps.iva.fc0.d;
import com.amazon.aps.iva.fc0.p;
import com.amazon.aps.iva.gc0.e;
import com.amazon.aps.iva.kb0.o;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.ads.RequestConfiguration;
import com.worldturner.medeia.parser.JsonTokenData;
import com.worldturner.medeia.parser.JsonTokenDataKt;
import com.worldturner.medeia.parser.JsonTokenType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: convertType.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u001a\u0018\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0006\u001a(\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006\u001a&\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u000e\u0010\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0003\u001a\u00020\u0006\u001a4\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u001a\u001e\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r2\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0003\u001a\u00020\u0006\u001a\"\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0001\u001a\u00020\u00132\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0014\u001a\u001a\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00172\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0014\u001a\u0010\u0010\u0019\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u001a\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001a\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00172\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0014\"\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"", "input", "Lcom/worldturner/medeia/parser/JsonTokenType;", "target", "Lcom/worldturner/medeia/parser/JsonTokenData;", "convertType", "Lcom/amazon/aps/iva/fc0/p;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "isEnum", "", "convertMap", "", "enumClass", "Ljava/util/EnumSet;", "buildEnumSet", "", "convertList", "", "Lcom/amazon/aps/iva/fc0/d;", "kotlin.jvm.PlatformType", "convertNumber", "", "convertString", "convertToText", "convertToNumber", "convertToBoolean", "value", "type", "createEnum", "anyType", "Lcom/amazon/aps/iva/fc0/p;", "getAnyType", "()Lcom/amazon/aps/iva/fc0/p;", "medeia-validator-core"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public final class ConvertTypeKt {
    private static final p anyType;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonTokenType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[JsonTokenType.VALUE_TEXT.ordinal()] = 1;
            iArr[JsonTokenType.VALUE_NUMBER.ordinal()] = 2;
            iArr[JsonTokenType.VALUE_BOOLEAN_FALSE.ordinal()] = 3;
            iArr[JsonTokenType.VALUE_BOOLEAN_TRUE.ordinal()] = 4;
        }
    }

    static {
        d a = e0.a(Object.class);
        z zVar = z.b;
        anyType = e.a(a, zVar, false, zVar);
    }

    public static final <T extends Enum<T>> EnumSet<?> buildEnumSet(Collection<?> collection, Class<T> cls) {
        j.g(collection, "input");
        j.g(cls, "enumClass");
        EnumSet<?> noneOf = EnumSet.noneOf(cls);
        for (Object obj : collection) {
            if (obj != null) {
                noneOf.add((Enum) obj);
            } else {
                throw new o("null cannot be cast to non-null type T");
            }
        }
        j.b(noneOf, "result");
        return noneOf;
    }

    public static final Collection<?> convertList(List<?> list, p pVar) {
        EnumSet<?> enumSet;
        EnumSet<?> buildEnumSet;
        j.g(list, "input");
        j.g(pVar, "target");
        List<?> list2 = list;
        ArrayList arrayList = new ArrayList(r.Y(list2));
        for (Object obj : list2) {
            p pVar2 = pVar.d().get(0).b;
            if (pVar2 == null) {
                pVar2 = anyType;
            }
            arrayList.add(convertType(obj, pVar2));
        }
        com.amazon.aps.iva.fc0.e b = pVar.b();
        if (!j.a(b, e0.a(List.class))) {
            if (j.a(b, e0.a(Set.class))) {
                Class isEnum = isEnum(pVar.d().get(0).b);
                if (isEnum != null && (buildEnumSet = buildEnumSet(arrayList, isEnum)) != null) {
                    return buildEnumSet;
                }
                return x.c1(arrayList);
            } else if (j.a(b, e0.a(EnumSet.class))) {
                Class isEnum2 = isEnum(pVar.d().get(0).b);
                if (isEnum2 != null) {
                    enumSet = buildEnumSet(arrayList, isEnum2);
                } else {
                    enumSet = null;
                }
                if (enumSet == null) {
                    j.l();
                    throw null;
                }
                return enumSet;
            } else {
                return arrayList;
            }
        }
        return arrayList;
    }

    public static final Map<?, ?> convertMap(Map<?, ?> map, p pVar) {
        j.g(map, "input");
        j.g(pVar, "target");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            p pVar2 = pVar.d().get(0).b;
            if (pVar2 == null) {
                pVar2 = anyType;
            }
            Object convertType = convertType(key, pVar2);
            Object value = entry.getValue();
            p pVar3 = pVar.d().get(1).b;
            if (pVar3 == null) {
                pVar3 = anyType;
            }
            arrayList.add(new com.amazon.aps.iva.kb0.j(convertType, convertType(value, pVar3)));
        }
        return i0.Z(arrayList);
    }

    public static final Number convertNumber(Number number, d<?> dVar) {
        j.g(number, "input");
        j.g(dVar, "target");
        if (j.a(dVar, e0.a(Integer.TYPE))) {
            return Integer.valueOf(number.intValue());
        }
        if (j.a(dVar, e0.a(Long.TYPE))) {
            return Long.valueOf(number.longValue());
        }
        if (j.a(dVar, e0.a(Float.TYPE))) {
            return Float.valueOf(number.floatValue());
        }
        if (j.a(dVar, e0.a(Double.TYPE))) {
            return Double.valueOf(number.doubleValue());
        }
        if (j.a(dVar, e0.a(BigInteger.class))) {
            if (number instanceof BigInteger) {
                return (BigInteger) number;
            }
            if (number instanceof BigDecimal) {
                return ((BigDecimal) number).toBigIntegerExact();
            }
            return BigInteger.valueOf(number.longValue());
        }
        return number;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.net.URI] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object convertString(java.lang.String r4, com.amazon.aps.iva.fc0.d<?> r5) {
        /*
            java.lang.String r0 = "input"
            com.amazon.aps.iva.yb0.j.g(r4, r0)
            java.lang.String r0 = "target"
            com.amazon.aps.iva.yb0.j.g(r5, r0)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            com.amazon.aps.iva.fc0.d r0 = com.amazon.aps.iva.yb0.e0.a(r0)
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r5, r0)
            if (r0 == 0) goto L17
            goto L77
        L17:
            java.lang.Class<java.net.URI> r0 = java.net.URI.class
            com.amazon.aps.iva.fc0.d r0 = com.amazon.aps.iva.yb0.e0.a(r0)
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r5, r0)
            if (r0 == 0) goto L28
            java.net.URI r4 = java.net.URI.create(r4)
            goto L77
        L28:
            java.lang.Class<com.amazon.aps.iva.oe0.f> r0 = com.amazon.aps.iva.oe0.f.class
            com.amazon.aps.iva.fc0.d r0 = com.amazon.aps.iva.yb0.e0.a(r0)
            boolean r0 = com.amazon.aps.iva.yb0.j.a(r5, r0)
            if (r0 == 0) goto L3b
            com.amazon.aps.iva.oe0.f r5 = new com.amazon.aps.iva.oe0.f
            r5.<init>(r4)
            r4 = r5
            goto L77
        L3b:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            com.amazon.aps.iva.fc0.d r0 = com.amazon.aps.iva.yb0.e0.a(r0)
            java.lang.String r1 = "base"
            com.amazon.aps.iva.yb0.j.f(r0, r1)
            boolean r1 = com.amazon.aps.iva.yb0.j.a(r5, r0)
            if (r1 != 0) goto L70
            java.util.List r1 = com.amazon.aps.iva.ee0.f1.J(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            com.amazon.aps.iva.gc0.b r2 = com.amazon.aps.iva.gc0.b.b
            com.amazon.aps.iva.j9.i0 r3 = new com.amazon.aps.iva.j9.i0
            r3.<init>(r2)
            com.amazon.aps.iva.gc0.c r2 = new com.amazon.aps.iva.gc0.c
            r2.<init>(r0)
            java.lang.Boolean r0 = com.amazon.aps.iva.me0.a.d(r1, r3, r2)
            java.lang.String r1 = "base: KClass<*>): Boolea…erclasses) { it == base }"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6e
            goto L70
        L6e:
            r0 = 0
            goto L71
        L70:
            r0 = 1
        L71:
            if (r0 == 0) goto L77
            java.lang.Object r4 = createEnum(r4, r5)
        L77:
            java.lang.String r5 = "when (target) {\n        … -> input\n        }\n    }"
            com.amazon.aps.iva.yb0.j.b(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.worldturner.medeia.reflection.ConvertTypeKt.convertString(java.lang.String, com.amazon.aps.iva.fc0.d):java.lang.Object");
    }

    public static final JsonTokenData convertToBoolean(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return JsonTokenDataKt.getTOKEN_NULL();
        }
        if (bool.booleanValue()) {
            return JsonTokenDataKt.getTOKEN_TRUE();
        }
        return JsonTokenDataKt.getTOKEN_FALSE();
    }

    public static final JsonTokenData convertToNumber(Object obj) {
        JsonTokenData jsonTokenData;
        Number number = (Number) obj;
        if (number == null) {
            return JsonTokenDataKt.getTOKEN_NULL();
        }
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return JsonTokenData.Companion.createNumber(number.longValue());
        }
        if (number instanceof Long) {
            return JsonTokenData.Companion.createNumber(number.longValue());
        }
        if (number instanceof BigInteger) {
            jsonTokenData = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, (BigInteger) number, null, 22, null);
        } else if (number instanceof BigDecimal) {
            jsonTokenData = new JsonTokenData(JsonTokenType.VALUE_NUMBER, null, 0L, null, (BigDecimal) number, 14, null);
        } else {
            throw new IllegalArgumentException("Can't convert " + e0.a(number.getClass()) + " to number");
        }
        return jsonTokenData;
    }

    public static final JsonTokenData convertToText(Object obj) {
        String str;
        if (obj != null) {
            str = obj.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return JsonTokenDataKt.getTOKEN_NULL();
        }
        return JsonTokenData.Companion.createText(str);
    }

    public static final JsonTokenData convertType(Object obj, JsonTokenType jsonTokenType) {
        j.g(jsonTokenType, "target");
        int i = WhenMappings.$EnumSwitchMapping$0[jsonTokenType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new IllegalArgumentException("target=" + jsonTokenType);
                }
                return convertToBoolean(obj);
            }
            return convertToNumber(obj);
        }
        return convertToText(obj);
    }

    public static final Object createEnum(String str, d<?> dVar) {
        Enum[] enumArr;
        j.g(str, "value");
        j.g(dVar, "type");
        Object[] enumConstants = t.o(dVar).getEnumConstants();
        if (enumConstants != null) {
            for (Enum r2 : (Enum[]) enumConstants) {
                if (m.Z(r2.name(), str)) {
                    return r2;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        throw new o("null cannot be cast to non-null type kotlin.Array<kotlin.Enum<*>>");
    }

    public static final p getAnyType() {
        return anyType;
    }

    public static final <T extends Enum<T>> Class<T> isEnum(p pVar) {
        com.amazon.aps.iva.fc0.e eVar;
        if (pVar != null) {
            eVar = pVar.b();
        } else {
            eVar = null;
        }
        if (!(eVar instanceof d)) {
            return null;
        }
        d dVar = (d) eVar;
        if (!t.o(dVar).isEnum()) {
            return null;
        }
        return t.o(dVar);
    }

    public static final Object convertType(Object obj, p pVar) {
        j.g(pVar, "target");
        com.amazon.aps.iva.fc0.e b = pVar.b();
        return b instanceof d ? obj instanceof String ? convertString((String) obj, (d) b) : obj instanceof Number ? convertNumber((Number) obj, (d) b) : obj instanceof List ? convertList((List) obj, pVar) : obj instanceof Map ? convertMap((Map) obj, pVar) : obj : obj;
    }
}
