package com.amazon.aps.iva.lc0;

import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.s1;
import com.amazon.aps.iva.ee0.u1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.lc0.a;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.n0;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.u;
import com.amazon.aps.iva.oc0.v;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.qc0.a;
import com.amazon.aps.iva.qc0.c;
import com.amazon.aps.iva.rc0.d0;
import com.amazon.aps.iva.rc0.g0;
import com.google.ads.AdSize;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes4.dex */
public abstract class k {
    public static final com.amazon.aps.iva.nd0.f e = com.amazon.aps.iva.nd0.f.j("<built-ins module>");
    public g0 a;
    public final com.amazon.aps.iva.de0.i<a> b;
    public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.oc0.e> c;
    public final com.amazon.aps.iva.de0.l d;

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes4.dex */
    public static class a {
        public final Map<l, m0> a;
        public final Map<e0, m0> b;
        public final Map<m0, m0> c;

        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.a = enumMap;
            this.b = hashMap;
            this.c = hashMap2;
        }
    }

    public k(com.amazon.aps.iva.de0.c cVar) {
        this.d = cVar;
        cVar.g(new g(this));
        this.b = cVar.g(new h(this));
        this.c = cVar.f(new i(this));
    }

    public static boolean A(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            if (com.amazon.aps.iva.qd0.i.i(kVar, b.class, false) == null) {
                return false;
            }
            return true;
        }
        a(9);
        throw null;
    }

    public static boolean B(e0 e0Var, com.amazon.aps.iva.nd0.d dVar) {
        if (e0Var != null) {
            if (dVar != null) {
                return K(e0Var.I0(), dVar);
            }
            a(98);
            throw null;
        }
        a(97);
        throw null;
    }

    public static boolean C(e0 e0Var, com.amazon.aps.iva.nd0.d dVar) {
        if (dVar != null) {
            if (B(e0Var, dVar) && !e0Var.J0()) {
                return true;
            }
            return false;
        }
        a(135);
        throw null;
    }

    public static boolean D(v vVar) {
        if (vVar.a().getAnnotations().A(o.a.m)) {
            return true;
        }
        if (!(vVar instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) vVar;
        boolean L = n0Var.L();
        com.amazon.aps.iva.rc0.m0 getter = n0Var.getGetter();
        p0 setter = n0Var.getSetter();
        if (getter != null && D(getter)) {
            if (!L) {
                return true;
            }
            if (setter != null && D(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(e0 e0Var, com.amazon.aps.iva.nd0.d dVar) {
        if (dVar != null) {
            if (!e0Var.J0() && B(e0Var, dVar)) {
                return true;
            }
            return false;
        }
        a(106);
        throw null;
    }

    public static boolean F(e0 e0Var) {
        if (e0Var != null) {
            if (e0Var != null) {
                if (B(e0Var, o.a.b) && !s1.g(e0Var)) {
                    return true;
                }
                return false;
            }
            a(138);
            throw null;
        }
        a(136);
        throw null;
    }

    public static boolean G(e0 e0Var) {
        com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
        if (k != null && s(k) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean H(com.amazon.aps.iva.ee0.e0 r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L33
            boolean r1 = r4.J0()
            r2 = 0
            if (r1 != 0) goto L32
            com.amazon.aps.iva.ee0.c1 r4 = r4.I0()
            com.amazon.aps.iva.oc0.h r4 = r4.k()
            boolean r1 = r4 instanceof com.amazon.aps.iva.oc0.e
            r3 = 1
            if (r1 == 0) goto L2e
            com.amazon.aps.iva.oc0.e r4 = (com.amazon.aps.iva.oc0.e) r4
            if (r4 == 0) goto L28
            com.amazon.aps.iva.lc0.l r4 = u(r4)
            if (r4 == 0) goto L23
            r4 = r3
            goto L24
        L23:
            r4 = r2
        L24:
            if (r4 == 0) goto L2e
            r4 = r3
            goto L2f
        L28:
            r4 = 96
            a(r4)
            throw r0
        L2e:
            r4 = r2
        L2f:
            if (r4 == 0) goto L32
            r2 = r3
        L32:
            return r2
        L33:
            r4 = 94
            a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.lc0.k.H(com.amazon.aps.iva.ee0.e0):boolean");
    }

    public static boolean I(com.amazon.aps.iva.oc0.e eVar) {
        if (eVar != null) {
            if (!c(eVar, o.a.a) && !c(eVar, o.a.b)) {
                return false;
            }
            return true;
        }
        a(107);
        throw null;
    }

    public static boolean J(e0 e0Var) {
        if (E(e0Var, o.a.f)) {
            return true;
        }
        return false;
    }

    public static boolean K(c1 c1Var, com.amazon.aps.iva.nd0.d dVar) {
        if (c1Var != null) {
            if (dVar != null) {
                com.amazon.aps.iva.oc0.h k = c1Var.k();
                if ((k instanceof com.amazon.aps.iva.oc0.e) && c(k, dVar)) {
                    return true;
                }
                return false;
            }
            a(MediaError.DetailedErrorCode.MEDIA_DECODE);
            throw null;
        }
        a(101);
        throw null;
    }

    public static boolean L(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof f0) {
                    return ((f0) kVar).c().h(o.j);
                }
                kVar = kVar.d();
            }
            return false;
        }
        a(10);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 77:
            case 89:
            case 96:
            case MediaError.DetailedErrorCode.MEDIA_NETWORK /* 103 */:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case MediaError.DetailedErrorCode.MEDIA_DECODE /* 102 */:
            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE /* 110 */:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case MediaError.DetailedErrorCode.MEDIA_DECODE /* 102 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case MediaError.DetailedErrorCode.MEDIA_NETWORK /* 103 */:
            case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE /* 110 */:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case WebSocketProtocol.PAYLOAD_SHORT /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static m0 b(k kVar, String str) {
        if (str != null) {
            m0 m = kVar.k(str).m();
            if (m != null) {
                return m;
            }
            a(47);
            throw null;
        }
        kVar.getClass();
        a(46);
        throw null;
    }

    public static boolean c(com.amazon.aps.iva.oc0.h hVar, com.amazon.aps.iva.nd0.d dVar) {
        if (hVar != null) {
            if (dVar != null) {
                if (hVar.getName().equals(dVar.g()) && dVar.equals(com.amazon.aps.iva.qd0.i.g(hVar))) {
                    return true;
                }
                return false;
            }
            a(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
            throw null;
        }
        a(MediaError.DetailedErrorCode.MEDIA_NETWORK);
        throw null;
    }

    public static l s(com.amazon.aps.iva.oc0.h hVar) {
        if (hVar != null) {
            if (!o.a.a0.contains(hVar.getName())) {
                return null;
            }
            return (l) o.a.c0.get(com.amazon.aps.iva.qd0.i.g(hVar));
        }
        a(77);
        throw null;
    }

    public static l u(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            if (!o.a.Z.contains(kVar.getName())) {
                return null;
            }
            return (l) o.a.b0.get(com.amazon.aps.iva.qd0.i.g(kVar));
        }
        a(76);
        throw null;
    }

    public static boolean y(e0 e0Var) {
        if (e0Var != null) {
            return B(e0Var, o.a.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(e0 e0Var) {
        if (e0Var != null) {
            return B(e0Var, o.a.g);
        }
        a(88);
        throw null;
    }

    public final void d(boolean z) {
        com.amazon.aps.iva.nd0.f fVar = e;
        com.amazon.aps.iva.yb0.j.f(fVar, "moduleName");
        com.amazon.aps.iva.de0.l lVar = this.d;
        com.amazon.aps.iva.yb0.j.f(lVar, "storageManager");
        g0 g0Var = new g0(fVar, lVar, this, 48);
        this.a = g0Var;
        com.amazon.aps.iva.lc0.a.a.getClass();
        com.amazon.aps.iva.oc0.g0 a2 = a.C0475a.b.getValue().a(this.d, this.a, m(), q(), e(), z);
        com.amazon.aps.iva.yb0.j.f(a2, "providerForModuleContent");
        g0Var.i = a2;
        g0 g0Var2 = this.a;
        g0Var2.getClass();
        g0Var2.h = new d0(com.amazon.aps.iva.lb0.o.b0(new g0[]{g0Var2}));
    }

    public com.amazon.aps.iva.qc0.a e() {
        return a.C0644a.a;
    }

    public final m0 f() {
        m0 m = k("Any").m();
        if (m != null) {
            return m;
        }
        a(50);
        throw null;
    }

    public final e0 g(e0 e0Var) {
        c0 e2;
        com.amazon.aps.iva.nd0.b f;
        com.amazon.aps.iva.nd0.b bVar;
        com.amazon.aps.iva.oc0.e a2;
        m0 m0Var = null;
        if (e0Var != null) {
            if (z(e0Var)) {
                if (e0Var.G0().size() == 1) {
                    e0 type = e0Var.G0().get(0).getType();
                    if (type != null) {
                        return type;
                    }
                    a(68);
                    throw null;
                }
                throw new IllegalStateException();
            }
            u1 i = s1.i(e0Var);
            m0 m0Var2 = this.b.invoke().c.get(i);
            if (m0Var2 != null) {
                return m0Var2;
            }
            int i2 = com.amazon.aps.iva.qd0.i.a;
            com.amazon.aps.iva.oc0.h k = i.I0().k();
            if (k == null) {
                e2 = null;
            } else {
                e2 = com.amazon.aps.iva.qd0.i.e(k);
            }
            if (e2 != null) {
                com.amazon.aps.iva.oc0.h k2 = i.I0().k();
                if (k2 != null) {
                    Set<com.amazon.aps.iva.nd0.f> set = s.a;
                    com.amazon.aps.iva.nd0.f name = k2.getName();
                    com.amazon.aps.iva.yb0.j.f(name, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (s.e.contains(name) && (f = com.amazon.aps.iva.ud0.b.f(k2)) != null && (bVar = s.c.get(f)) != null && (a2 = u.a(e2, bVar)) != null) {
                        m0Var = a2.m();
                    }
                }
                if (m0Var != null) {
                    return m0Var;
                }
            }
            throw new IllegalStateException("not array: " + e0Var);
        }
        a(67);
        throw null;
    }

    public final m0 h(u1 u1Var, v1 v1Var) {
        if (v1Var != null) {
            if (u1Var != null) {
                return i(v1Var, u1Var, h.a.a);
            }
            a(83);
            throw null;
        }
        a(82);
        throw null;
    }

    public final m0 i(v1 v1Var, e0 e0Var, com.amazon.aps.iva.pc0.h hVar) {
        if (v1Var != null) {
            if (e0Var != null) {
                return com.amazon.aps.iva.ee0.f0.e(k0.m(hVar), k("Array"), Collections.singletonList(new l1(e0Var, v1Var)));
            }
            a(79);
            throw null;
        }
        a(78);
        throw null;
    }

    public final com.amazon.aps.iva.oc0.e j(com.amazon.aps.iva.nd0.c cVar) {
        if (cVar != null) {
            com.amazon.aps.iva.oc0.e c0 = x.c0(l(), cVar, com.amazon.aps.iva.wc0.d.FROM_BUILTINS);
            if (c0 != null) {
                return c0;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final com.amazon.aps.iva.oc0.e k(String str) {
        if (str != null) {
            com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) ((c.k) this.c).invoke(com.amazon.aps.iva.nd0.f.h(str));
            if (eVar != null) {
                return eVar;
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    public final g0 l() {
        g0 g0Var = this.a;
        g0Var.getClass();
        if (g0Var != null) {
            return g0Var;
        }
        a(7);
        throw null;
    }

    public Iterable<com.amazon.aps.iva.qc0.b> m() {
        List singletonList = Collections.singletonList(new com.amazon.aps.iva.mc0.a(this.d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final m0 n() {
        m0 p = p();
        if (p != null) {
            return p;
        }
        a(52);
        throw null;
    }

    public final m0 o() {
        m0 m = k("Nothing").m();
        if (m != null) {
            return m;
        }
        a(48);
        throw null;
    }

    public final m0 p() {
        m0 M0 = f().M0(true);
        if (M0 != null) {
            return M0;
        }
        a(51);
        throw null;
    }

    public com.amazon.aps.iva.qc0.c q() {
        return c.b.a;
    }

    public final m0 r(l lVar) {
        if (lVar != null) {
            m0 m0Var = this.b.invoke().a.get(lVar);
            if (m0Var != null) {
                return m0Var;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public final m0 t(l lVar) {
        if (lVar != null) {
            if (lVar != null) {
                m0 m = k(lVar.getTypeName().b()).m();
                if (m != null) {
                    return m;
                }
                a(54);
                throw null;
            }
            a(16);
            throw null;
        }
        a(53);
        throw null;
    }

    public final m0 v() {
        m0 m = k("String").m();
        if (m != null) {
            return m;
        }
        a(65);
        throw null;
    }

    public final com.amazon.aps.iva.oc0.e w(int i) {
        com.amazon.aps.iva.nd0.c cVar = o.e;
        com.amazon.aps.iva.oc0.e j = j(cVar.c(com.amazon.aps.iva.nd0.f.h(com.amazon.aps.iva.mc0.c.SuspendFunction.getClassNamePrefix() + i)));
        if (j != null) {
            return j;
        }
        a(18);
        throw null;
    }

    public final m0 x() {
        m0 m = k("Unit").m();
        if (m != null) {
            return m;
        }
        a(64);
        throw null;
    }
}
