package com.amazon.aps.iva.b4;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.c4.h;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z3.g;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.Set;
/* compiled from: SharedPreferencesMigration.kt */
/* loaded from: classes.dex */
public final class b<T> implements com.amazon.aps.iva.z3.d<T> {
    public final p<T, com.amazon.aps.iva.ob0.d<? super Boolean>, Object> a;
    public final q<d, T, com.amazon.aps.iva.ob0.d<? super T>, Object> b;
    public final Context c;
    public final String d;
    public final m e;
    public final Set<String> f;

    /* compiled from: SharedPreferencesMigration.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static final boolean a(Context context, String str) {
            j.f(context, "context");
            j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            return context.deleteSharedPreferences(str);
        }
    }

    /* compiled from: SharedPreferencesMigration.kt */
    @e(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.kt", l = {147}, m = "shouldMigrate")
    /* renamed from: com.amazon.aps.iva.b4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0129b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public /* synthetic */ Object i;
        public final /* synthetic */ b<T> j;
        public int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0129b(b<T> bVar, com.amazon.aps.iva.ob0.d<? super C0129b> dVar) {
            super(dVar);
            this.j = bVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return this.j.b(null, this);
        }
    }

    public b(Context context, String str, Set set, p pVar, h hVar) {
        Set<String> b1;
        j.f(context, "context");
        j.f(set, "keysToMigrate");
        j.f(pVar, "shouldRunMigration");
        com.amazon.aps.iva.b4.a aVar = new com.amazon.aps.iva.b4.a(context, str);
        this.a = pVar;
        this.b = hVar;
        this.c = context;
        this.d = str;
        this.e = f.b(aVar);
        if (set == c.a) {
            b1 = null;
        } else {
            b1 = x.b1(set);
        }
        this.f = b1;
    }

    @Override // com.amazon.aps.iva.z3.d
    public final Object a(Object obj, g gVar) {
        return this.b.invoke(new d(c(), this.f), obj, gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
        if (r5.isEmpty() == false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.amazon.aps.iva.z3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(T r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.b4.b.C0129b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.b4.b$b r0 = (com.amazon.aps.iva.b4.b.C0129b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.b4.b$b r0 = new com.amazon.aps.iva.b4.b$b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.b4.b r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r4
            r0.k = r3
            com.amazon.aps.iva.xb0.p<T, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean>, java.lang.Object> r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4d
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4d:
            java.util.Set<java.lang.String> r6 = r5.f
            if (r6 != 0) goto L65
            android.content.SharedPreferences r5 = r5.c()
            java.util.Map r5 = r5.getAll()
            java.lang.String r6 = "sharedPrefs.all"
            com.amazon.aps.iva.yb0.j.e(r5, r6)
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L98
            goto L99
        L65:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            android.content.SharedPreferences r5 = r5.c()
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L79
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L79
            goto L98
        L79:
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            goto L99
        L98:
            r3 = 0
        L99:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.b4.b.b(java.lang.Object, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public final SharedPreferences c() {
        return (SharedPreferences) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.z3.d
    public final com.amazon.aps.iva.kb0.q cleanUp() throws IOException {
        com.amazon.aps.iva.kb0.q qVar;
        Context context;
        String str;
        SharedPreferences.Editor edit = c().edit();
        Set<String> set = this.f;
        if (set == null) {
            edit.clear();
        } else {
            for (String str2 : set) {
                edit.remove(str2);
            }
        }
        if (edit.commit()) {
            if (c().getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null && !a.a(context, str)) {
                throw new IOException(j.k(str, "Unable to delete SharedPreferences: "));
            }
            if (set == null) {
                qVar = null;
            } else {
                set.clear();
                qVar = com.amazon.aps.iva.kb0.q.a;
            }
            if (qVar == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return qVar;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
    }
}
