package com.amazon.aps.iva.b8;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.SparseBooleanArray;
import com.amazon.aps.iva.b8.q;
import com.amazon.aps.iva.n5.b;
import com.amazon.aps.iva.q5.l0;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Longs;
import com.google.common.util.concurrent.AsyncFunction;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: MediaSession.java */
@DoNotMock
/* loaded from: classes.dex */
public class q {
    public static final Object b;
    public static final HashMap<String, q> c;
    public final t a;

    /* compiled from: MediaSession.java */
    /* loaded from: classes.dex */
    public static final class b {
        public static final y1 e;
        public static final l0.a f;
        public final y1 b;
        public final l0.a c;
        public final boolean a = true;
        public final ImmutableList<com.amazon.aps.iva.b8.b> d = null;

        static {
            int[] iArr;
            HashSet hashSet = new HashSet();
            ImmutableList<Integer> immutableList = x1.e;
            for (int i = 0; i < immutableList.size(); i++) {
                hashSet.add(new x1(immutableList.get(i).intValue()));
            }
            e = new y1(hashSet);
            HashSet hashSet2 = new HashSet();
            ImmutableList<Integer> immutableList2 = x1.f;
            for (int i2 = 0; i2 < immutableList2.size(); i2++) {
                hashSet2.add(new x1(immutableList2.get(i2).intValue()));
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                hashSet2.add(new x1(immutableList.get(i3).intValue()));
            }
            new y1(hashSet2);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (int i4 : l0.a.C0636a.b) {
                com.amazon.aps.iva.cq.b.C(!false);
                sparseBooleanArray.append(i4, true);
            }
            com.amazon.aps.iva.cq.b.C(!false);
            f = new l0.a(new com.amazon.aps.iva.q5.u(sparseBooleanArray));
        }

        public b(y1 y1Var, l0.a aVar) {
            this.b = y1Var;
            this.c = aVar;
        }
    }

    /* compiled from: MediaSession.java */
    /* loaded from: classes.dex */
    public static final class d {
        public final b.C0529b a;
        public final int b;
        public final boolean c;
        public final c d;

        public d(b.C0529b c0529b, int i, boolean z, c cVar) {
            this.a = c0529b;
            this.b = i;
            this.c = z;
            this.d = cVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            d dVar = (d) obj;
            c cVar = this.d;
            if (cVar == null && dVar.d == null) {
                return this.a.equals(dVar.a);
            }
            return com.amazon.aps.iva.t5.g0.a(cVar, dVar.d);
        }

        public final int hashCode() {
            return Objects.hashCode(this.d, this.a);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
            b.C0529b c0529b = this.a;
            sb.append(c0529b.a.a);
            sb.append(", uid=");
            return defpackage.e.f(sb, c0529b.a.c, "})");
        }
    }

    /* compiled from: MediaSession.java */
    /* loaded from: classes.dex */
    public static final class e {
        public final ImmutableList<com.amazon.aps.iva.q5.b0> a;
        public final int b;
        public final long c;

        public e(int i, long j, List list) {
            this.a = ImmutableList.copyOf((Collection) list);
            this.b = i;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.a.equals(eVar.a) && com.amazon.aps.iva.t5.g0.a(Integer.valueOf(this.b), Integer.valueOf(eVar.b)) && com.amazon.aps.iva.t5.g0.a(Long.valueOf(this.c), Long.valueOf(eVar.c))) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Longs.hashCode(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
        }
    }

    static {
        com.amazon.aps.iva.q5.c0.a("media3.session");
        b = new Object();
        c = new HashMap<>();
    }

    public q(Context context, String str, com.amazon.aps.iva.q5.l0 l0Var, ImmutableList immutableList, a aVar, Bundle bundle, com.amazon.aps.iva.t5.b bVar) {
        synchronized (b) {
            HashMap<String, q> hashMap = c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.a = new t(this, context, str, l0Var, immutableList, aVar, bundle, bVar);
    }

    public final com.amazon.aps.iva.q5.l0 a() {
        return this.a.o.a;
    }

    /* compiled from: MediaSession.java */
    /* loaded from: classes.dex */
    public interface c {
        default void A() throws RemoteException {
        }

        default void B() throws RemoteException {
        }

        default void d() throws RemoteException {
        }

        default void q() throws RemoteException {
        }

        default void t() throws RemoteException {
        }

        default void v() throws RemoteException {
        }

        default void w() throws RemoteException {
        }

        default void C(com.amazon.aps.iva.q5.b0 b0Var) throws RemoteException {
        }

        default void a(int i) throws RemoteException {
        }

        default void e(com.amazon.aps.iva.q5.f fVar) throws RemoteException {
        }

        default void p(com.amazon.aps.iva.q5.d0 d0Var) throws RemoteException {
        }

        default void r(int i, a2 a2Var) throws RemoteException {
        }

        default void s(int i, l0.a aVar) throws RemoteException {
        }

        default void u(int i, k<?> kVar) throws RemoteException {
        }

        default void x(int i, v1 v1Var, v1 v1Var2) throws RemoteException {
        }

        default void z(int i, z1 z1Var, boolean z, boolean z2) throws RemoteException {
        }

        default void y(int i, r1 r1Var, l0.a aVar, boolean z, boolean z2, int i2) throws RemoteException {
        }
    }

    /* compiled from: MediaSession.java */
    /* loaded from: classes.dex */
    public interface a {
        static SettableFuture a(List list, final int i, final long j) {
            return com.amazon.aps.iva.t5.g0.d0(c(list), new AsyncFunction() { // from class: com.amazon.aps.iva.b8.p
                @Override // com.google.common.util.concurrent.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Futures.immediateFuture(new q.e(i, j, (List) obj));
                }
            });
        }

        static ListenableFuture c(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((com.amazon.aps.iva.q5.b0) it.next()).c == null) {
                    return Futures.immediateFailedFuture(new UnsupportedOperationException());
                }
            }
            return Futures.immediateFuture(list);
        }

        static ListenableFuture d() {
            return Futures.immediateFuture(new a2(-6));
        }

        static ListenableFuture e() {
            return Futures.immediateFailedFuture(new UnsupportedOperationException());
        }

        static ListenableFuture f() {
            return Futures.immediateFuture(new a2(-6));
        }

        static ListenableFuture h() {
            return Futures.immediateFuture(new a2(-6));
        }

        default b g(q qVar, d dVar) {
            return new b(b.e, b.f);
        }

        @Deprecated
        default void b(q qVar, d dVar, int i) {
        }
    }
}
