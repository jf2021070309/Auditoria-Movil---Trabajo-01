package com.amazon.aps.iva.ve;

import android.content.SharedPreferences;
import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.xw.j0;
import com.amazon.aps.iva.xw.k0;
import com.amazon.aps.iva.xw.l0;
import java.util.Date;
/* compiled from: BillingStatusStorage.kt */
/* loaded from: classes.dex */
public final class d implements com.amazon.aps.iva.ve.e {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] C = {defpackage.e.b(d.class, "isOnHold", "isOnHold()Z", 0), defpackage.e.b(d.class, "isInGrace", "isInGrace()Z", 0), defpackage.e.b(d.class, "isAutoRenewable", "isAutoRenewable()Z", 0), defpackage.e.b(d.class, "hasSubscription", "getHasSubscription()Z", 0), defpackage.e.b(d.class, "isSubscriptionFromGooglePlay", "isSubscriptionFromGooglePlay()Z", 0), defpackage.e.b(d.class, "hasSeenInGraceStart", "getHasSeenInGraceStart()Z", 0), defpackage.e.b(d.class, "hasSeenInGraceEnd", "getHasSeenInGraceEnd()Z", 0), defpackage.e.b(d.class, "hasSeenOnHold", "getHasSeenOnHold()Z", 0), defpackage.e.b(d.class, "hasSeenRenewStart", "getHasSeenRenewStart()Z", 0), defpackage.e.b(d.class, "hasSeenRenewEnd", "getHasSeenRenewEnd()Z", 0), defpackage.e.b(d.class, "hasSeenCancellationComplete", "getHasSeenCancellationComplete()Z", 0)};
    public final a A;
    public final b B;
    public final SharedPreferences b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final c p;
    public final C0796d q;
    public final j0 r;
    public final e s;
    public final j0 t;
    public final f u;
    public final g v;
    public final h w;
    public final i x;
    public final j y;
    public final k z;

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public a(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class b implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public b(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class c implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public c(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* renamed from: com.amazon.aps.iva.ve.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0796d implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public C0796d(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class e implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public e(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class f implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public f(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class g implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public g(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class h implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public h(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class i implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public i(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class j implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public j(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    /* compiled from: SharedPreferencesExtensions.kt */
    /* loaded from: classes.dex */
    public static final class k implements com.amazon.aps.iva.bc0.b {
        public final /* synthetic */ SharedPreferences a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Object c;

        public k(SharedPreferences sharedPreferences, String str, Boolean bool) {
            this.a = sharedPreferences;
            this.b = str;
            this.c = bool;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Boolean, java.lang.Object] */
        @Override // com.amazon.aps.iva.bc0.b
        public final Boolean getValue(d dVar, com.amazon.aps.iva.fc0.l<?> lVar) {
            com.amazon.aps.iva.yb0.j.f(lVar, "property");
            ?? a = l0.a(this.a, this.b, this.c);
            com.amazon.aps.iva.yb0.j.c(a);
            return a;
        }
    }

    public d(SharedPreferences sharedPreferences, String str) {
        this.b = sharedPreferences;
        String concat = str.concat("_is_in_grace");
        this.c = concat;
        this.d = str.concat("_in_grace_expiration_date");
        this.e = str.concat("_expiration_date");
        String concat2 = str.concat("_is_on_hold");
        this.f = concat2;
        String concat3 = str.concat("_is_auto_renewable");
        this.g = concat3;
        String concat4 = str.concat("_has_subscription");
        this.h = concat4;
        String concat5 = str.concat("_is_subscription_from_google_play");
        this.i = concat5;
        String concat6 = str.concat("_seen_in_grace_start");
        this.j = concat6;
        String concat7 = str.concat("_seen_in_grace_end");
        this.k = concat7;
        String concat8 = str.concat("_seen_on_hold");
        this.l = concat8;
        String concat9 = str.concat("_seen_renew_start");
        this.m = concat9;
        String concat10 = str.concat("_seen_renew_end");
        this.n = concat10;
        String concat11 = str.concat("_seen_cancellation_complete");
        this.o = concat11;
        Boolean bool = Boolean.FALSE;
        this.p = new c(sharedPreferences, concat2, bool);
        this.q = new C0796d(sharedPreferences, concat, bool);
        Boolean valueOf = Boolean.valueOf(Z6());
        com.amazon.aps.iva.yb0.j.f(concat, "key");
        k0 k0Var = k0.h;
        com.amazon.aps.iva.yb0.j.f(k0Var, "onSetValue");
        this.r = new j0(sharedPreferences, concat, valueOf, k0Var);
        this.s = new e(sharedPreferences, concat3, Boolean.TRUE);
        Boolean valueOf2 = Boolean.valueOf(O0());
        com.amazon.aps.iva.yb0.j.f(concat3, "key");
        com.amazon.aps.iva.yb0.j.f(k0Var, "onSetValue");
        this.t = new j0(sharedPreferences, concat3, valueOf2, k0Var);
        this.u = new f(sharedPreferences, concat4, bool);
        this.v = new g(sharedPreferences, concat5, bool);
        this.w = new h(sharedPreferences, concat6, bool);
        this.x = new i(sharedPreferences, concat7, bool);
        this.y = new j(sharedPreferences, concat8, bool);
        this.z = new k(sharedPreferences, concat9, bool);
        this.A = new a(sharedPreferences, concat10, bool);
        this.B = new b(sharedPreferences, concat11, bool);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void B2(Date date) {
        this.b.edit().putLong(this.e, date.getTime()).apply();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void B3(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[1];
        Boolean valueOf = Boolean.valueOf(z);
        C0796d c0796d = this.q;
        c0796d.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(c0796d.a, c0796d.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean E3() {
        return ((Boolean) this.z.getValue(this, C[8])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void H7(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[0];
        Boolean valueOf = Boolean.valueOf(z);
        c cVar = this.p;
        cVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(cVar.a, cVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void K3(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[7];
        Boolean valueOf = Boolean.valueOf(z);
        j jVar = this.y;
        jVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(jVar.a, jVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean O0() {
        return ((Boolean) this.s.getValue(this, C[2])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void Q4(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[10];
        Boolean valueOf = Boolean.valueOf(z);
        b bVar = this.B;
        bVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(bVar.a, bVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void T0(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[6];
        Boolean valueOf = Boolean.valueOf(z);
        i iVar = this.x;
        iVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(iVar.a, iVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean T2() {
        return ((Boolean) this.w.getValue(this, C[5])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void U6(Date date) {
        this.b.edit().putLong(this.d, date.getTime()).apply();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean X2() {
        return ((Boolean) this.A.getValue(this, C[9])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void Y7(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[8];
        Boolean valueOf = Boolean.valueOf(z);
        k kVar = this.z;
        kVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(kVar.a, kVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean Z6() {
        return ((Boolean) this.q.getValue(this, C[1])).booleanValue();
    }

    @Override // com.amazon.aps.iva.rs.q
    public final boolean a3() {
        return ((Boolean) this.p.getValue(this, C[0])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean b2() {
        return ((Boolean) this.u.getValue(this, C[3])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean c2() {
        return ((Boolean) this.B.getValue(this, C[10])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void clear() {
        this.b.edit().remove(this.c).remove(this.d).remove(this.e).remove(this.f).remove(this.g).remove(this.h).remove(this.i).remove(this.j).remove(this.k).remove(this.l).remove(this.m).remove(this.n).remove(this.o).apply();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void f1(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[3];
        Boolean valueOf = Boolean.valueOf(z);
        f fVar = this.u;
        fVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(fVar.a, fVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void h2(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[5];
        Boolean valueOf = Boolean.valueOf(z);
        h hVar = this.w;
        hVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(hVar.a, hVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean k3() {
        return ((Boolean) this.v.getValue(this, C[4])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void k5(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[4];
        Boolean valueOf = Boolean.valueOf(z);
        g gVar = this.v;
        gVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(gVar.a, gVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean k8() {
        return ((Boolean) this.y.getValue(this, C[7])).booleanValue();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final Date l3() {
        return new Date(this.b.getLong(this.e, 0L));
    }

    @Override // com.amazon.aps.iva.ve.e
    public final Date n5() {
        return new Date(this.b.getLong(this.d, 0L));
    }

    @Override // com.amazon.aps.iva.rs.q
    public final LiveData<Boolean> r2() {
        return this.r;
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void r6(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[9];
        Boolean valueOf = Boolean.valueOf(z);
        a aVar = this.A;
        aVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(aVar.a, aVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final void s6(boolean z) {
        com.amazon.aps.iva.fc0.l<Object> lVar = C[2];
        Boolean valueOf = Boolean.valueOf(z);
        e eVar = this.s;
        eVar.getClass();
        com.amazon.aps.iva.yb0.j.f(lVar, "property");
        l0.b(eVar.a, eVar.b, valueOf);
    }

    @Override // com.amazon.aps.iva.ve.e
    public final boolean t1() {
        return ((Boolean) this.x.getValue(this, C[6])).booleanValue();
    }

    @Override // com.amazon.aps.iva.rs.q
    public final Date v6() {
        if (Z6()) {
            return n5();
        }
        return l3();
    }

    @Override // com.amazon.aps.iva.ve.e
    public final j0 x7() {
        return this.t;
    }
}
