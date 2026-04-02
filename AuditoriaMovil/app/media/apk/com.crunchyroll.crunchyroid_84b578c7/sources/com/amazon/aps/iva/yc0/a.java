package com.amazon.aps.iva.yc0;

import com.amazon.aps.iva.ae0.s;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oc0.b;
import com.amazon.aps.iva.qd0.m;
import com.amazon.aps.iva.qd0.n;
import com.amazon.aps.iva.xb0.l;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: DescriptorResolverUtils.java */
/* loaded from: classes4.dex */
public final class a extends m {
    public final /* synthetic */ s a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ boolean c;

    /* compiled from: DescriptorResolverUtils.java */
    /* renamed from: com.amazon.aps.iva.yc0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0889a implements l<com.amazon.aps.iva.oc0.b, q> {
        public C0889a() {
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.oc0.b bVar) {
            com.amazon.aps.iva.oc0.b bVar2 = bVar;
            if (bVar2 != null) {
                a.this.a.a(bVar2);
                return q.a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
        }
    }

    public a(s sVar, LinkedHashSet linkedHashSet, boolean z) {
        this.a = sVar;
        this.b = linkedHashSet;
        this.c = z;
    }

    public static /* synthetic */ void t(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "overridden";
                    }
                } else {
                    objArr[0] = "member";
                }
            } else {
                objArr[0] = "fromCurrent";
            }
        } else {
            objArr[0] = "fromSuper";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                objArr[2] = "addFakeOverride";
            } else {
                objArr[2] = "setOverriddenDescriptors";
            }
        } else {
            objArr[2] = "conflict";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void c(com.amazon.aps.iva.oc0.b bVar) {
        if (bVar != null) {
            n.r(bVar, new C0889a());
            this.b.add(bVar);
            return;
        }
        t(0);
        throw null;
    }

    @Override // com.amazon.aps.iva.ab.a
    public final void r(com.amazon.aps.iva.oc0.b bVar, Collection<? extends com.amazon.aps.iva.oc0.b> collection) {
        if (bVar != null) {
            if (this.c && bVar.getKind() != b.a.FAKE_OVERRIDE) {
                return;
            }
            bVar.z0(collection);
            return;
        }
        t(3);
        throw null;
    }

    @Override // com.amazon.aps.iva.qd0.m
    public final void s(com.amazon.aps.iva.oc0.b bVar, com.amazon.aps.iva.oc0.b bVar2) {
        if (bVar != null) {
            if (bVar2 != null) {
                return;
            }
            t(2);
            throw null;
        }
        t(1);
        throw null;
    }
}
