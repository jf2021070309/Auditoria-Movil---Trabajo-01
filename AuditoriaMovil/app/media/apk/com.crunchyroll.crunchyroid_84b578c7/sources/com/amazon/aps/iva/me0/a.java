package com.amazon.aps.iva.me0;

import com.amazon.aps.iva.xb0.l;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
/* compiled from: DFS.java */
/* loaded from: classes4.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: DFS.java */
    /* renamed from: com.amazon.aps.iva.me0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0512a<N> extends b<N, Boolean> {
        public final /* synthetic */ l a;
        public final /* synthetic */ boolean[] b;

        public C0512a(l lVar, boolean[] zArr) {
            this.a = lVar;
            this.b = zArr;
        }

        @Override // com.amazon.aps.iva.me0.a.d
        public final Object a() {
            return Boolean.valueOf(this.b[0]);
        }

        @Override // com.amazon.aps.iva.me0.a.d
        public final boolean c(N n) {
            boolean booleanValue = ((Boolean) this.a.invoke(n)).booleanValue();
            boolean[] zArr = this.b;
            if (booleanValue) {
                zArr[0] = true;
            }
            return !zArr[0];
        }
    }

    /* compiled from: DFS.java */
    /* loaded from: classes4.dex */
    public interface c<N> {
        Iterable<? extends N> h(N n);
    }

    /* compiled from: DFS.java */
    /* loaded from: classes4.dex */
    public interface d<N, R> {
        R a();

        void b(N n);

        boolean c(N n);
    }

    /* compiled from: DFS.java */
    /* loaded from: classes4.dex */
    public static class e<N> {
        public final Set<N> a = new HashSet();
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case ConnectionResult.API_DISABLED /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case ConnectionResult.API_DISABLED /* 23 */:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, b bVar) {
        e eVar = new e();
        for (Object obj : collection) {
            c(obj, cVar, eVar, bVar);
        }
        return bVar.a();
    }

    public static void c(Object obj, c cVar, e eVar, b bVar) {
        if (obj != null) {
            if (!eVar.a.add(obj) || !bVar.c(obj)) {
                return;
            }
            for (Object obj2 : cVar.h(obj)) {
                c(obj2, cVar, eVar, bVar);
            }
            bVar.b(obj);
            return;
        }
        a(22);
        throw null;
    }

    public static <N> Boolean d(Collection<N> collection, c<N> cVar, l<N, Boolean> lVar) {
        if (lVar != null) {
            return (Boolean) b(collection, cVar, new C0512a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }

    /* compiled from: DFS.java */
    /* loaded from: classes4.dex */
    public static abstract class b<N, R> implements d<N, R> {
        @Override // com.amazon.aps.iva.me0.a.d
        public void b(N n) {
        }
    }
}
