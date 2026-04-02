package com.worldturner.medeia.format;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.q.c0;
import com.worldturner.medeia.format.i18n.Punycode;
import java.lang.Character;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: idn-hostname.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\b\u001a\u00020\t*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\t*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\r*\u00020\r\u001a\n\u0010\u000e\u001a\u00020\r*\u00020\r\u001a\n\u0010\u000f\u001a\u00020\t*\u00020\r\"\u001d\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0010"}, d2 = {"idnCodePointsBackwardsCompatible", "", "", "Lcom/worldturner/medeia/format/IdnProperty;", "getIdnCodePointsBackwardsCompatible", "()Ljava/util/Map;", "idnCodePointsExceptions", "getIdnCodePointsExceptions", "idnIsIgnorableBlocks", "", "idnIsIgnorableProperty", "idnProperty", "idnToLdhHostname", "", "idnToLdhLabel", "isIdnHostname", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class Idn_hostnameKt {
    private static final Map<Integer, IdnProperty> idnCodePointsBackwardsCompatible;
    private static final Map<Integer, IdnProperty> idnCodePointsExceptions;

    static {
        IdnProperty idnProperty = IdnProperty.PVALID;
        j jVar = new j(223, idnProperty);
        j jVar2 = new j(962, idnProperty);
        j jVar3 = new j(1789, idnProperty);
        j jVar4 = new j(1790, idnProperty);
        j jVar5 = new j(3851, idnProperty);
        j jVar6 = new j(12295, idnProperty);
        IdnProperty idnProperty2 = IdnProperty.CONTEXTO;
        j jVar7 = new j(183, idnProperty2);
        j jVar8 = new j(885, idnProperty2);
        j jVar9 = new j(1523, idnProperty2);
        j jVar10 = new j(1524, idnProperty2);
        j jVar11 = new j(12539, idnProperty2);
        j jVar12 = new j(1632, idnProperty2);
        j jVar13 = new j(1633, idnProperty2);
        j jVar14 = new j(1634, idnProperty2);
        j jVar15 = new j(1635, idnProperty2);
        j jVar16 = new j(1636, idnProperty2);
        j jVar17 = new j(1637, idnProperty2);
        j jVar18 = new j(1638, idnProperty2);
        j jVar19 = new j(1639, idnProperty2);
        j jVar20 = new j(1640, idnProperty2);
        j jVar21 = new j(1641, idnProperty2);
        j jVar22 = new j(1776, idnProperty2);
        j jVar23 = new j(1777, idnProperty2);
        j jVar24 = new j(1778, idnProperty2);
        j jVar25 = new j(1779, idnProperty2);
        j jVar26 = new j(1780, idnProperty2);
        j jVar27 = new j(1781, idnProperty2);
        j jVar28 = new j(1782, idnProperty2);
        j jVar29 = new j(1783, idnProperty2);
        j jVar30 = new j(1784, idnProperty2);
        j jVar31 = new j(1785, idnProperty2);
        IdnProperty idnProperty3 = IdnProperty.DISALLOWED;
        idnCodePointsExceptions = i0.U(jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18, jVar19, jVar20, jVar21, jVar22, jVar23, jVar24, jVar25, jVar26, jVar27, jVar28, jVar29, jVar30, jVar31, new j(1600, idnProperty3), new j(2042, idnProperty3), new j(12334, idnProperty3), new j(12335, idnProperty3), new j(12337, idnProperty3), new j(12338, idnProperty3), new j(12339, idnProperty3), new j(12340, idnProperty3), new j(12341, idnProperty3), new j(12347, idnProperty3));
        idnCodePointsBackwardsCompatible = a0.b;
    }

    public static final Map<Integer, IdnProperty> getIdnCodePointsBackwardsCompatible() {
        return idnCodePointsBackwardsCompatible;
    }

    public static final Map<Integer, IdnProperty> getIdnCodePointsExceptions() {
        return idnCodePointsExceptions;
    }

    public static final boolean idnIsIgnorableBlocks(int i) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(i);
        if (!com.amazon.aps.iva.yb0.j.a(of, Character.UnicodeBlock.COMBINING_MARKS_FOR_SYMBOLS) && !com.amazon.aps.iva.yb0.j.a(of, Character.UnicodeBlock.MUSICAL_SYMBOLS)) {
            return false;
        }
        return true;
    }

    public static final boolean idnIsIgnorableProperty(int i) {
        return Character.isWhitespace(i);
    }

    public static final IdnProperty idnProperty(int i) {
        IdnProperty idnProperty = idnCodePointsExceptions.get(Integer.valueOf(i));
        if (idnProperty != null) {
            return idnProperty;
        }
        IdnProperty idnProperty2 = idnCodePointsBackwardsCompatible.get(Integer.valueOf(i));
        if (idnProperty2 != null) {
            return idnProperty2;
        }
        if (i != 45 && !Punycode.INSTANCE.getParameters().isBasicCodePoint(i)) {
            if (idnIsIgnorableProperty(i)) {
                return IdnProperty.DISALLOWED;
            }
            if (idnIsIgnorableBlocks(i)) {
                return IdnProperty.DISALLOWED;
            }
            if (Character.isLetterOrDigit(i)) {
                return IdnProperty.PVALID;
            }
            return IdnProperty.DISALLOWED;
        }
        return IdnProperty.PVALID;
    }

    public static final String idnToLdhHostname(String str) {
        com.amazon.aps.iva.yb0.j.g(str, "receiver$0");
        List<String> D0 = q.D0(str, new char[]{'.'});
        ArrayList arrayList = new ArrayList(r.Y(D0));
        for (String str2 : D0) {
            arrayList.add(idnToLdhLabel(str2));
        }
        return x.B0(arrayList, ".", null, null, null, 62);
    }

    public static final String idnToLdhLabel(String str) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int intValue;
        com.amazon.aps.iva.yb0.j.g(str, "receiver$0");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            int i2 = 0;
            i = 0;
            while (true) {
                if (i2 < str.length()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                int codePointAt = str.codePointAt(i2);
                i2 += Character.charCount(codePointAt);
                if (Punycode.INSTANCE.getParameters().isBasicCodePoint(Integer.valueOf(codePointAt).intValue()) && (i = i + 1) < 0) {
                    f1.R();
                    throw null;
                }
            }
        }
        if (i != str.length()) {
            int i3 = 0;
            do {
                if (i3 < str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int codePointAt2 = str.codePointAt(i3);
                    i3 += Character.charCount(codePointAt2);
                    intValue = Integer.valueOf(codePointAt2).intValue();
                } else {
                    return "xn--" + Punycode.INSTANCE.encode(str);
                }
            } while (idnProperty(intValue) == IdnProperty.PVALID);
            throw new IllegalArgumentException(c0.a("Illegal code point in IDN label ", intValue));
        }
        return str;
    }

    public static final boolean isIdnHostname(String str) {
        com.amazon.aps.iva.yb0.j.g(str, "receiver$0");
        try {
            return HostnameKt.isHostname(idnToLdhHostname(str));
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
