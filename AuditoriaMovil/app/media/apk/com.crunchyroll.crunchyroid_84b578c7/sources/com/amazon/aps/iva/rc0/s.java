package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.oc0.a1;
import com.amazon.aps.iva.oc0.q;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.xd0.i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes4.dex */
public final class s extends m {
    public final com.amazon.aps.iva.ee0.m i;
    public final a j;
    public final com.amazon.aps.iva.de0.i<Set<com.amazon.aps.iva.nd0.f>> k;
    public final com.amazon.aps.iva.pc0.h l;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    /* loaded from: classes4.dex */
    public class a extends com.amazon.aps.iva.xd0.j {
        public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<? extends com.amazon.aps.iva.oc0.s0>> b;
        public final com.amazon.aps.iva.de0.g<com.amazon.aps.iva.nd0.f, Collection<? extends com.amazon.aps.iva.oc0.n0>> c;
        public final com.amazon.aps.iva.de0.i<Collection<com.amazon.aps.iva.oc0.k>> d;
        public final /* synthetic */ s e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: com.amazon.aps.iva.rc0.s$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0678a implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends com.amazon.aps.iva.oc0.s0>> {
            public C0678a() {
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Collection<? extends com.amazon.aps.iva.oc0.s0> invoke(com.amazon.aps.iva.nd0.f fVar) {
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(aVar.i().b(fVar2, com.amazon.aps.iva.wc0.d.FOR_NON_TRACKED_SCOPE), fVar2);
                }
                aVar.getClass();
                a.h(8);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* loaded from: classes4.dex */
        public class b implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.f, Collection<? extends com.amazon.aps.iva.oc0.n0>> {
            public b() {
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final Collection<? extends com.amazon.aps.iva.oc0.n0> invoke(com.amazon.aps.iva.nd0.f fVar) {
                com.amazon.aps.iva.nd0.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(aVar.i().c(fVar2, com.amazon.aps.iva.wc0.d.FOR_NON_TRACKED_SCOPE), fVar2);
                }
                aVar.getClass();
                a.h(4);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* loaded from: classes4.dex */
        public class c implements com.amazon.aps.iva.xb0.a<Collection<com.amazon.aps.iva.oc0.k>> {
            public c() {
            }

            @Override // com.amazon.aps.iva.xb0.a
            public final Collection<com.amazon.aps.iva.oc0.k> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (com.amazon.aps.iva.nd0.f fVar : aVar.e.k.invoke()) {
                    com.amazon.aps.iva.wc0.d dVar = com.amazon.aps.iva.wc0.d.FOR_NON_TRACKED_SCOPE;
                    hashSet.addAll(aVar.b(fVar, dVar));
                    hashSet.addAll(aVar.c(fVar, dVar));
                }
                return hashSet;
            }
        }

        public a(s sVar, com.amazon.aps.iva.de0.l lVar) {
            if (lVar != null) {
                this.e = sVar;
                this.b = lVar.f(new C0678a());
                this.c = lVar.f(new b());
                this.d = lVar.g(new c());
                return;
            }
            h(0);
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.rc0.s.a.h(int):void");
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> a() {
            Set<com.amazon.aps.iva.nd0.f> invoke = this.e.k.invoke();
            if (invoke != null) {
                return invoke;
            }
            h(17);
            throw null;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Collection b(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            if (fVar != null) {
                if (dVar != null) {
                    Collection collection = (Collection) ((c.k) this.b).invoke(fVar);
                    if (collection != null) {
                        return collection;
                    }
                    h(7);
                    throw null;
                }
                h(6);
                throw null;
            }
            h(5);
            throw null;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Collection c(com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.wc0.d dVar) {
            if (fVar != null) {
                if (dVar != null) {
                    Collection collection = (Collection) ((c.k) this.c).invoke(fVar);
                    if (collection != null) {
                        return collection;
                    }
                    h(3);
                    throw null;
                }
                h(2);
                throw null;
            }
            h(1);
            throw null;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> d() {
            Set<com.amazon.aps.iva.nd0.f> invoke = this.e.k.invoke();
            if (invoke != null) {
                return invoke;
            }
            h(19);
            throw null;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.l
        public final Collection<com.amazon.aps.iva.oc0.k> e(com.amazon.aps.iva.xd0.d dVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.nd0.f, Boolean> lVar) {
            if (dVar != null) {
                if (lVar != null) {
                    Collection<com.amazon.aps.iva.oc0.k> invoke = this.d.invoke();
                    if (invoke != null) {
                        return invoke;
                    }
                    h(15);
                    throw null;
                }
                h(14);
                throw null;
            }
            h(13);
            throw null;
        }

        @Override // com.amazon.aps.iva.xd0.j, com.amazon.aps.iva.xd0.i
        public final Set<com.amazon.aps.iva.nd0.f> f() {
            Set<com.amazon.aps.iva.nd0.f> emptySet = Collections.emptySet();
            if (emptySet != null) {
                return emptySet;
            }
            h(18);
            throw null;
        }

        public final com.amazon.aps.iva.xd0.i i() {
            com.amazon.aps.iva.xd0.i l = ((com.amazon.aps.iva.ee0.e0) ((com.amazon.aps.iva.ee0.h) this.e.h()).g().iterator().next()).l();
            if (l != null) {
                return l;
            }
            h(9);
            throw null;
        }

        public final LinkedHashSet j(Collection collection, com.amazon.aps.iva.nd0.f fVar) {
            if (fVar != null) {
                if (collection != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    com.amazon.aps.iva.qd0.n.f.h(fVar, collection, Collections.emptySet(), this.e, new t(linkedHashSet));
                    return linkedHashSet;
                }
                h(11);
                throw null;
            }
            h(10);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.ee0.m0 m0Var, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.de0.i iVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        super(lVar, eVar, fVar, t0Var);
        if (lVar != null) {
            if (eVar != null) {
                if (m0Var != null) {
                    if (fVar != null) {
                        if (iVar != null) {
                            if (t0Var != null) {
                                this.l = hVar;
                                this.i = new com.amazon.aps.iva.ee0.m(this, Collections.emptyList(), Collections.singleton(m0Var), lVar);
                                this.j = new a(this, lVar);
                                this.k = iVar;
                                return;
                            }
                            A0(12);
                            throw null;
                        }
                        A0(10);
                        throw null;
                    }
                    A0(9);
                    throw null;
                }
                A0(8);
                throw null;
            }
            A0(7);
            throw null;
        }
        A0(6);
        throw null;
    }

    public static /* synthetic */ void A0(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = FirebaseAnalytics.Param.SOURCE;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static s G0(com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.e eVar, com.amazon.aps.iva.nd0.f fVar, com.amazon.aps.iva.de0.i<Set<com.amazon.aps.iva.nd0.f>> iVar, com.amazon.aps.iva.pc0.h hVar, com.amazon.aps.iva.oc0.t0 t0Var) {
        if (lVar != null) {
            if (eVar != null) {
                if (fVar != null) {
                    if (iVar != null) {
                        if (t0Var != null) {
                            return new s(lVar, eVar, eVar.m(), fVar, iVar, hVar, t0Var);
                        }
                        A0(5);
                        throw null;
                    }
                    A0(3);
                    throw null;
                }
                A0(2);
                throw null;
            }
            A0(1);
            throw null;
        }
        A0(0);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.d D() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final a1<com.amazon.aps.iva.ee0.m0> R() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean U() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean X() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean a0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.d> e() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(16);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean f0() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.a0
    public final boolean g0() {
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        com.amazon.aps.iva.pc0.h hVar = this.l;
        if (hVar != null) {
            return hVar;
        }
        A0(21);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.f getKind() {
        com.amazon.aps.iva.oc0.f fVar = com.amazon.aps.iva.oc0.f.ENUM_ENTRY;
        if (fVar != null) {
            return fVar;
        }
        A0(18);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.o, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.r getVisibility() {
        q.h hVar = com.amazon.aps.iva.oc0.q.e;
        if (hVar != null) {
            return hVar;
        }
        A0(20);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.h
    public final c1 h() {
        com.amazon.aps.iva.ee0.m mVar = this.i;
        if (mVar != null) {
            return mVar;
        }
        A0(17);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.xd0.i h0() {
        i.b bVar = i.b.b;
        if (bVar != null) {
            return bVar;
        }
        A0(15);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final com.amazon.aps.iva.oc0.e i0() {
        return null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean isInline() {
        return false;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.i
    public final List<y0> n() {
        List<y0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(22);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e, com.amazon.aps.iva.oc0.a0
    public final com.amazon.aps.iva.oc0.b0 o() {
        com.amazon.aps.iva.oc0.b0 b0Var = com.amazon.aps.iva.oc0.b0.FINAL;
        if (b0Var != null) {
            return b0Var;
        }
        A0(19);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final boolean s() {
        return false;
    }

    @Override // com.amazon.aps.iva.rc0.b0
    public final com.amazon.aps.iva.xd0.i s0(com.amazon.aps.iva.fe0.f fVar) {
        if (fVar != null) {
            a aVar = this.j;
            if (aVar != null) {
                return aVar;
            }
            A0(14);
            throw null;
        }
        A0(13);
        throw null;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // com.amazon.aps.iva.oc0.e
    public final Collection<com.amazon.aps.iva.oc0.e> x() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        A0(23);
        throw null;
    }

    @Override // com.amazon.aps.iva.oc0.i
    public final boolean z() {
        return false;
    }
}
