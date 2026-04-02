package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.lc0.o;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: JvmBuiltInsSignatures.kt */
/* loaded from: classes4.dex */
public final class u {
    public static final LinkedHashSet a = m0.R(com.amazon.aps.iva.ab.r.n("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (com.amazon.aps.iva.vd0.c cVar : f1.K(com.amazon.aps.iva.vd0.c.BOOLEAN, com.amazon.aps.iva.vd0.c.CHAR)) {
            String b2 = cVar.getWrapperFqName().f().b();
            com.amazon.aps.iva.yb0.j.e(b2, "it.wrapperFqName.shortName().asString()");
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet, com.amazon.aps.iva.ab.r.m(b2, cVar.getJavaKeywordName() + "Value()" + cVar.getDesc()));
        }
        b = m0.Q(m0.Q(m0.Q(m0.Q(m0.Q(m0.Q(linkedHashSet, com.amazon.aps.iva.ab.r.n("List", "sort(Ljava/util/Comparator;)V")), com.amazon.aps.iva.ab.r.m("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), com.amazon.aps.iva.ab.r.m("Double", "isInfinite()Z", "isNaN()Z")), com.amazon.aps.iva.ab.r.m("Float", "isInfinite()Z", "isNaN()Z")), com.amazon.aps.iva.ab.r.m("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), com.amazon.aps.iva.ab.r.m("CharSequence", "isEmpty()Z"));
        c = m0.Q(m0.Q(m0.Q(m0.Q(m0.Q(m0.Q(com.amazon.aps.iva.ab.r.m("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), com.amazon.aps.iva.ab.r.n("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), com.amazon.aps.iva.ab.r.m("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), com.amazon.aps.iva.ab.r.m("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), com.amazon.aps.iva.ab.r.n("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), com.amazon.aps.iva.ab.r.n("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), com.amazon.aps.iva.ab.r.n("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        d = m0.Q(m0.Q(com.amazon.aps.iva.ab.r.n("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), com.amazon.aps.iva.ab.r.n("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), com.amazon.aps.iva.ab.r.n("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        com.amazon.aps.iva.vd0.c cVar2 = com.amazon.aps.iva.vd0.c.BOOLEAN;
        com.amazon.aps.iva.vd0.c cVar3 = com.amazon.aps.iva.vd0.c.BYTE;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (com.amazon.aps.iva.vd0.c cVar4 : f1.K(cVar2, cVar3, com.amazon.aps.iva.vd0.c.DOUBLE, com.amazon.aps.iva.vd0.c.FLOAT, cVar3, com.amazon.aps.iva.vd0.c.INT, com.amazon.aps.iva.vd0.c.LONG, com.amazon.aps.iva.vd0.c.SHORT)) {
            String b3 = cVar4.getWrapperFqName().f().b();
            com.amazon.aps.iva.yb0.j.e(b3, "it.wrapperFqName.shortName().asString()");
            String[] h = com.amazon.aps.iva.ab.r.h("Ljava/lang/String;");
            com.amazon.aps.iva.lb0.t.d0(linkedHashSet2, com.amazon.aps.iva.ab.r.m(b3, (String[]) Arrays.copyOf(h, h.length)));
        }
        String[] h2 = com.amazon.aps.iva.ab.r.h("D");
        LinkedHashSet Q = m0.Q(linkedHashSet2, com.amazon.aps.iva.ab.r.m("Float", (String[]) Arrays.copyOf(h2, h2.length)));
        String[] h3 = com.amazon.aps.iva.ab.r.h("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        e = m0.Q(Q, com.amazon.aps.iva.ab.r.m("String", (String[]) Arrays.copyOf(h3, h3.length)));
        String[] h4 = com.amazon.aps.iva.ab.r.h("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f = com.amazon.aps.iva.ab.r.m("Throwable", (String[]) Arrays.copyOf(h4, h4.length));
    }

    public static boolean a(com.amazon.aps.iva.nd0.d dVar) {
        boolean z;
        if (com.amazon.aps.iva.yb0.j.a(dVar, o.a.g)) {
            return true;
        }
        if (o.a.c0.get(dVar) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
