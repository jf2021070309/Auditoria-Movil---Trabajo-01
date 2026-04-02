package com.ellation.crunchyroll.presentation.main.lists;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.lb0.m0;
import com.amazon.aps.iva.u70.h;
import com.amazon.aps.iva.u70.i;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.y10.h;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MyListsBottomBarActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ellation/crunchyroll/presentation/main/lists/MyListsBottomBarActivity;", "Lcom/amazon/aps/iva/v10/a;", "Lcom/amazon/aps/iva/y10/h;", "Lcom/amazon/aps/iva/xu/g;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MyListsBottomBarActivity extends com.amazon.aps.iva.v10.a implements h, com.amazon.aps.iva.xu.g {
    public final com.amazon.aps.iva.xw.a r = com.amazon.aps.iva.xw.b.b(this, new d());
    public final com.amazon.aps.iva.ez.a s = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.uw.b.class, new g(this), b.h);
    public final m t = com.amazon.aps.iva.kb0.f.b(new f());
    public final v u = com.amazon.aps.iva.xw.g.d(this, R.id.errors_layout);
    public final int v = 1;
    public static final /* synthetic */ l<Object>[] x = {q.a(MyListsBottomBarActivity.class, "editModeViewModel", "getEditModeViewModel()Lcom/ellation/crunchyroll/edit/EditModeViewModel;", 0), q.a(MyListsBottomBarActivity.class, "errorsLayout", "getErrorsLayout()Landroid/view/View;", 0)};
    public static final a w = new a();

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Context context, com.amazon.aps.iva.y10.m mVar) {
            j.f(context, "context");
            j.f(mVar, "tabToOpen");
            Intent intent = new Intent(context, MyListsBottomBarActivity.class);
            intent.putExtra("tab_to_open", mVar);
            intent.setFlags(131072);
            context.startActivity(intent);
        }
    }

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.uw.b> {
        public static final b h = new b();

        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.uw.b invoke(p pVar) {
            j.f(pVar, "it");
            return new com.amazon.aps.iva.uw.b();
        }
    }

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xa0.f, com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.xa0.f fVar) {
            com.amazon.aps.iva.xa0.f fVar2 = fVar;
            j.f(fVar2, "$this$applyInsetter");
            com.amazon.aps.iva.xa0.f.a(fVar2, false, true, false, false, com.ellation.crunchyroll.presentation.main.lists.a.h, 253);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public d() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            j.f(mVar, "$this$onBackPressedCallback");
            a aVar = MyListsBottomBarActivity.w;
            ((com.amazon.aps.iva.y10.f) MyListsBottomBarActivity.this.t.getValue()).a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Fragment> {
        public static final e h = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Fragment invoke() {
            com.ellation.crunchyroll.presentation.main.lists.b.k.getClass();
            return new com.ellation.crunchyroll.presentation.main.lists.b();
        }
    }

    /* compiled from: MyListsBottomBarActivity.kt */
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.y10.f> {
        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.y10.f invoke() {
            a aVar = MyListsBottomBarActivity.w;
            MyListsBottomBarActivity myListsBottomBarActivity = MyListsBottomBarActivity.this;
            myListsBottomBarActivity.getClass();
            return new com.amazon.aps.iva.y10.g((com.amazon.aps.iva.uw.a) myListsBottomBarActivity.s.getValue(myListsBottomBarActivity, MyListsBottomBarActivity.x[0]), myListsBottomBarActivity);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.y10.h
    public final void Kc() {
        f1.i((View) this.u.getValue(this, x[1]), c.h);
        oi().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.us.a
    public final com.amazon.aps.iva.ls.a b1() {
        Fragment qi = qi();
        j.d(qi, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.main.lists.MyListsFragment");
        return ((com.ellation.crunchyroll.presentation.main.lists.b) qi).b1();
    }

    @Override // com.amazon.aps.iva.y10.h
    public final void ch() {
        oi().setVisibility(0);
        ((View) this.u.getValue(this, x[1])).setPadding(0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.c3.i, com.amazon.aps.iva.sn.e
    public final void closeScreen() {
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mi(e.h);
        getOnBackPressedDispatcher().a(this, this.r);
    }

    @Override // com.amazon.aps.iva.v10.a
    public final int pi() {
        return this.v;
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return m0.R(super.setupPresenters(), (com.amazon.aps.iva.y10.f) this.t.getValue());
    }

    @Override // com.amazon.aps.iva.v10.a, com.amazon.aps.iva.u70.j
    public final void showSnackbar(i iVar) {
        j.f(iVar, "message");
        int i = com.amazon.aps.iva.u70.h.a;
        View findViewById = findViewById(R.id.errors_layout);
        j.e(findViewById, "findViewById(R.id.errors_layout)");
        h.a.a((ViewGroup) findViewById, iVar);
    }
}
