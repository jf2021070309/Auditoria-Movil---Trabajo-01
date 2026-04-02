package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.mediation.debugger.ui.d.e;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.d.d {
    private final com.applovin.impl.mediation.debugger.a.a.a a;
    private final com.applovin.impl.mediation.debugger.a.a.b b;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> d;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> e;
    private final List<com.applovin.impl.mediation.debugger.ui.d.c> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends com.applovin.impl.mediation.debugger.ui.b.a.a {
        private final com.applovin.impl.mediation.debugger.a.a.b o;

        a(com.applovin.impl.mediation.debugger.a.a.b bVar, String str, boolean z) {
            super(bVar.a(), b.this.c);
            this.o = bVar;
            this.d = StringUtils.createSpannedString(bVar.c(), ViewCompat.MEASURED_STATE_MASK, 18, 1);
            this.e = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.c = z;
        }

        public com.applovin.impl.mediation.debugger.a.a.b a() {
            return this.o;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.b.a.a, com.applovin.impl.mediation.debugger.ui.d.c
        public boolean b() {
            return this.c;
        }

        @Override // com.applovin.impl.mediation.debugger.ui.d.c
        public int c() {
            return -12303292;
        }
    }

    /* renamed from: com.applovin.impl.mediation.debugger.ui.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    enum EnumC0019b {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.applovin.impl.mediation.debugger.a.a.a aVar, com.applovin.impl.mediation.debugger.a.a.b bVar, Context context) {
        super(context);
        this.a = aVar;
        this.b = bVar;
        this.d = c();
        this.e = d();
        this.f = e();
        notifyDataSetChanged();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> c() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(f());
        arrayList.add(g());
        if (this.b != null) {
            arrayList.add(h());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d() {
        com.applovin.impl.mediation.debugger.a.a.b bVar = this.b;
        if (bVar == null || bVar.e()) {
            List<com.applovin.impl.mediation.debugger.a.a.b> a2 = this.a.e().a();
            ArrayList arrayList = new ArrayList(a2.size());
            for (com.applovin.impl.mediation.debugger.a.a.b bVar2 : a2) {
                com.applovin.impl.mediation.debugger.a.a.b bVar3 = this.b;
                if (bVar3 == null || bVar3.b().equals(bVar2.b())) {
                    arrayList.add(new a(bVar2, bVar2.d() != null ? bVar2.d().a() : "", this.b == null));
                }
            }
            return arrayList;
        }
        return new ArrayList();
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> e() {
        com.applovin.impl.mediation.debugger.a.a.b bVar = this.b;
        if (bVar == null || !bVar.e()) {
            List<com.applovin.impl.mediation.debugger.a.a.b> b = this.a.e().b();
            ArrayList arrayList = new ArrayList(b.size());
            for (com.applovin.impl.mediation.debugger.a.a.b bVar2 : b) {
                com.applovin.impl.mediation.debugger.a.a.b bVar3 = this.b;
                if (bVar3 == null || bVar3.b().equals(bVar2.b())) {
                    arrayList.add(new a(bVar2, null, this.b == null));
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
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Selected Network").b(this.b.c()).a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int a(int i) {
        return (i == EnumC0019b.INFO.ordinal() ? this.d : i == EnumC0019b.BIDDERS.ordinal() ? this.e : this.f).size();
    }

    public String a() {
        return this.a.b();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected int b() {
        return EnumC0019b.COUNT.ordinal();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected com.applovin.impl.mediation.debugger.ui.d.c b(int i) {
        return i == EnumC0019b.INFO.ordinal() ? new e("INFO") : i == EnumC0019b.BIDDERS.ordinal() ? new e("BIDDERS") : new e("WATERFALL");
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    protected List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i) {
        return i == EnumC0019b.INFO.ordinal() ? this.d : i == EnumC0019b.BIDDERS.ordinal() ? this.e : this.f;
    }
}
