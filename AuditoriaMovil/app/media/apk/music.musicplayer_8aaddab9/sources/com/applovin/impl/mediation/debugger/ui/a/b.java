package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.d.d {
    private final com.applovin.impl.mediation.debugger.a.a.a a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.a.a.b f3543b;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f3544d;

    /* renamed from: e  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f3545e;

    /* renamed from: f  reason: collision with root package name */
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f3546f;

    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {
        private final com.applovin.impl.mediation.debugger.a.a.b o;

        public a(com.applovin.impl.mediation.debugger.a.a.b bVar, String str, boolean z) {
            super(bVar.a(), b.this.f3645c);
            this.o = bVar;
            this.f3614d = StringUtils.createSpannedString(bVar.c(), -16777216, 18, 1);
            this.f3615e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f3613c = z;
        }

        public com.applovin.impl.mediation.debugger.a.a.b a() {
            return this.o;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean b() {
            return this.f3613c;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0080b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public b(com.applovin.impl.mediation.debugger.a.a.a aVar, com.applovin.impl.mediation.debugger.a.a.b bVar, Context context) {
        super(context);
        this.a = aVar;
        this.f3543b = bVar;
        this.f3544d = c();
        this.f3545e = d();
        this.f3546f = e();
        notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.f3543b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        com.applovin.impl.mediation.debugger.a.a.b bVar = this.f3543b;
        if (bVar == null || bVar.e()) {
            List<com.applovin.impl.mediation.debugger.a.a.b> a2 = this.a.e().a();
            ArrayList arrayList = new ArrayList(a2.size());
            for (com.applovin.impl.mediation.debugger.a.a.b bVar2 : a2) {
                com.applovin.impl.mediation.debugger.a.a.b bVar3 = this.f3543b;
                if (bVar3 == null || bVar3.b().equals(bVar2.b())) {
                    arrayList.add(new a(bVar2, bVar2.d() != null ? bVar2.d().a() : "", this.f3543b == null));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> e() {
        com.applovin.impl.mediation.debugger.a.a.b bVar = this.f3543b;
        if (bVar == null || !bVar.e()) {
            List<com.applovin.impl.mediation.debugger.a.a.b> b2 = this.a.e().b();
            ArrayList arrayList = new ArrayList(b2.size());
            for (com.applovin.impl.mediation.debugger.a.a.b bVar2 : b2) {
                com.applovin.impl.mediation.debugger.a.a.b bVar3 = this.f3543b;
                if (bVar3 == null || bVar3.b().equals(bVar2.b())) {
                    arrayList.add(new a(bVar2, null, this.f3543b == null));
                    for (com.applovin.impl.mediation.debugger.a.a.d dVar : bVar2.f()) {
                        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a(dVar.a()).b(dVar.b()).b(true).a());
                    }
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c f() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("ID").b(this.a.a()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c g() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Format").b(this.a.c()).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c h() {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.f3543b.c()).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i2) {
        return (i2 == EnumC0080b.INFO.ordinal() ? this.f3544d : i2 == EnumC0080b.BIDDERS.ordinal() ? this.f3545e : this.f3546f).size();
    }

    public String a() {
        return this.a.b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int b() {
        return EnumC0080b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i2) {
        return i2 == EnumC0080b.INFO.ordinal() ? new e("INFO") : i2 == EnumC0080b.BIDDERS.ordinal() ? new e("BIDDERS") : new e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i2) {
        return i2 == EnumC0080b.INFO.ordinal() ? this.f3544d : i2 == EnumC0080b.BIDDERS.ordinal() ? this.f3545e : this.f3546f;
    }
}
