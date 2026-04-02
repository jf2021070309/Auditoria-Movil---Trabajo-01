package com.amazon.aps.iva.qd0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e0;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.oc0.b0;
import com.amazon.aps.iva.oc0.c0;
import com.amazon.aps.iva.oc0.f0;
import com.amazon.aps.iva.oc0.j0;
import com.amazon.aps.iva.oc0.p0;
import com.amazon.aps.iva.oc0.u0;
import com.google.ads.AdSize;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.apache.commons.codec.binary.BaseNCodec;
/* compiled from: DescriptorUtils.java */
/* loaded from: classes4.dex */
public final class i {
    public static final /* synthetic */ int a = 0;

    static {
        new com.amazon.aps.iva.nd0.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 64:
            case 82:
            case 95:
            case 97:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 67:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 68:
            case 69:
            case 70:
            case 77:
            case 78:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = FirebaseAnalytics.Param.LOCATION;
                break;
            case 66:
                objArr[0] = "variable";
                break;
            case 71:
                objArr[0] = "f";
                break;
            case 73:
                objArr[0] = "current";
                break;
            case 74:
                objArr[0] = "result";
                break;
            case 75:
                objArr[0] = "memberDescriptor";
                break;
            case 79:
            case 80:
            case 81:
                objArr[0] = "annotated";
                break;
            case 85:
            case 87:
            case 90:
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
                objArr[0] = "scope";
                break;
            case 88:
            case 91:
            case 93:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
            case 63:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 65:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 72:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 83:
            case 84:
                objArr[1] = "getContainingSourceFile";
                break;
            case 86:
                objArr[1] = "getAllDescriptors";
                break;
            case 89:
                objArr[1] = "getFunctionByName";
                break;
            case 94:
                objArr[1] = "getPropertyByName";
                break;
            case 96:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 66:
            case 67:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 69:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 70:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 71:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 73:
            case 74:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 75:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 77:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 78:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 79:
                objArr[2] = "getJvmName";
                break;
            case 80:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 82:
                objArr[2] = "getContainingSourceFile";
                break;
            case 85:
                objArr[2] = "getAllDescriptors";
                break;
            case 87:
            case 88:
                objArr[2] = "getFunctionByName";
                break;
            case 90:
            case 91:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 92 */:
            case 93:
                objArr[2] = "getPropertyByName";
                break;
            case 95:
                objArr[2] = "getDirectMember";
                break;
            case 97:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 63:
            case 65:
            case 72:
            case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
            case 83:
            case 84:
            case 86:
            case 89:
            case 94:
            case 96:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(com.amazon.aps.iva.oc0.a aVar, LinkedHashSet linkedHashSet) {
        if (aVar != null) {
            if (linkedHashSet.contains(aVar)) {
                return;
            }
            for (com.amazon.aps.iva.oc0.a aVar2 : aVar.a().k()) {
                com.amazon.aps.iva.oc0.a a2 = aVar2.a();
                b(a2, linkedHashSet);
                linkedHashSet.add(a2);
            }
            return;
        }
        a(73);
        throw null;
    }

    public static com.amazon.aps.iva.oc0.e c(e0 e0Var) {
        if (e0Var != null) {
            c1 I0 = e0Var.I0();
            if (I0 != null) {
                com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) I0.k();
                if (eVar != null) {
                    return eVar;
                }
                a(47);
                throw null;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static c0 d(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            c0 e = e(kVar);
            if (e != null) {
                return e;
            }
            a(22);
            throw null;
        }
        a(21);
        throw null;
    }

    public static c0 e(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            while (kVar != null) {
                if (kVar instanceof c0) {
                    return (c0) kVar;
                }
                if (kVar instanceof j0) {
                    return ((j0) kVar).x0();
                }
                kVar = kVar.d();
            }
            return null;
        }
        a(23);
        throw null;
    }

    public static u0 f(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            if (kVar instanceof p0) {
                kVar = ((p0) kVar).S();
            }
            boolean z = kVar instanceof com.amazon.aps.iva.oc0.n;
            u0.a aVar = u0.a;
            if (z) {
                ((com.amazon.aps.iva.oc0.n) kVar).g().b();
            }
            return aVar;
        }
        a(82);
        throw null;
    }

    public static com.amazon.aps.iva.nd0.d g(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            com.amazon.aps.iva.nd0.c h = h(kVar);
            if (h != null) {
                return h.i();
            }
            return g(kVar.d()).b(kVar.getName());
        }
        a(2);
        throw null;
    }

    public static com.amazon.aps.iva.nd0.c h(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            if (!(kVar instanceof c0) && !com.amazon.aps.iva.ge0.k.f(kVar)) {
                if (kVar instanceof j0) {
                    return ((j0) kVar).c();
                }
                if (!(kVar instanceof f0)) {
                    return null;
                }
                return ((f0) kVar).c();
            }
            return com.amazon.aps.iva.nd0.c.c;
        }
        a(5);
        throw null;
    }

    public static <D extends com.amazon.aps.iva.oc0.k> D i(com.amazon.aps.iva.oc0.k kVar, Class<D> cls, boolean z) {
        if (kVar == null) {
            return null;
        }
        if (z) {
            kVar = (D) kVar.d();
        }
        while (kVar != null) {
            if (cls.isInstance(kVar)) {
                return (D) kVar;
            }
            kVar = (D) kVar.d();
        }
        return null;
    }

    public static com.amazon.aps.iva.oc0.e j(com.amazon.aps.iva.oc0.e eVar) {
        if (eVar != null) {
            for (e0 e0Var : eVar.h().g()) {
                com.amazon.aps.iva.oc0.e c = c(e0Var);
                if (c.getKind() != com.amazon.aps.iva.oc0.f.INTERFACE) {
                    return c;
                }
            }
            return null;
        }
        a(44);
        throw null;
    }

    public static boolean k(com.amazon.aps.iva.oc0.k kVar) {
        if (n(kVar, com.amazon.aps.iva.oc0.f.CLASS) && kVar.getName().equals(com.amazon.aps.iva.nd0.h.a)) {
            return true;
        }
        return false;
    }

    public static boolean l(com.amazon.aps.iva.oc0.k kVar) {
        if (n(kVar, com.amazon.aps.iva.oc0.f.OBJECT) && ((com.amazon.aps.iva.oc0.e) kVar).X()) {
            return true;
        }
        return false;
    }

    public static boolean m(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            return n(kVar, com.amazon.aps.iva.oc0.f.ENUM_ENTRY);
        }
        a(36);
        throw null;
    }

    public static boolean n(com.amazon.aps.iva.oc0.k kVar, com.amazon.aps.iva.oc0.f fVar) {
        if (fVar != null) {
            if ((kVar instanceof com.amazon.aps.iva.oc0.e) && ((com.amazon.aps.iva.oc0.e) kVar).getKind() == fVar) {
                return true;
            }
            return false;
        }
        a(37);
        throw null;
    }

    public static boolean o(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null) {
            while (true) {
                boolean z = false;
                if (kVar == null) {
                    return false;
                }
                if (k(kVar)) {
                    break;
                }
                if ((kVar instanceof com.amazon.aps.iva.oc0.o) && ((com.amazon.aps.iva.oc0.o) kVar).getVisibility() == com.amazon.aps.iva.oc0.q.f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                kVar = kVar.d();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean p(e0 e0Var, com.amazon.aps.iva.oc0.e eVar) {
        if (e0Var != null) {
            if (eVar != null) {
                com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
                if (k != null) {
                    com.amazon.aps.iva.oc0.k a2 = k.a();
                    if ((a2 instanceof com.amazon.aps.iva.oc0.h) && eVar.h().equals(((com.amazon.aps.iva.oc0.h) a2).h())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }

    public static boolean q(com.amazon.aps.iva.oc0.i iVar) {
        if ((n(iVar, com.amazon.aps.iva.oc0.f.CLASS) || n(iVar, com.amazon.aps.iva.oc0.f.INTERFACE)) && ((com.amazon.aps.iva.oc0.e) iVar).o() == b0.SEALED) {
            return true;
        }
        return false;
    }

    public static boolean r(com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.oc0.e eVar2) {
        return s(eVar.m(), eVar2.a());
    }

    public static boolean s(e0 e0Var, com.amazon.aps.iva.oc0.e eVar) {
        if (e0Var != null) {
            if (eVar != null) {
                if (p(e0Var, eVar)) {
                    return true;
                }
                for (e0 e0Var2 : e0Var.I0().g()) {
                    if (s(e0Var2, eVar)) {
                        return true;
                    }
                }
                return false;
            }
            a(33);
            throw null;
        }
        a(32);
        throw null;
    }

    public static boolean t(com.amazon.aps.iva.oc0.k kVar) {
        if (kVar != null && (kVar.d() instanceof f0)) {
            return true;
        }
        return false;
    }

    public static <D extends com.amazon.aps.iva.oc0.b> D u(D d) {
        if (d != null) {
            while (d.getKind() == b.a.FAKE_OVERRIDE) {
                Collection<? extends com.amazon.aps.iva.oc0.b> k = d.k();
                if (!k.isEmpty()) {
                    d = (D) k.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            return d;
        }
        a(59);
        throw null;
    }

    public static <D extends com.amazon.aps.iva.oc0.o> D v(D d) {
        if (d instanceof com.amazon.aps.iva.oc0.b) {
            return u((com.amazon.aps.iva.oc0.b) d);
        }
        return d;
    }
}
