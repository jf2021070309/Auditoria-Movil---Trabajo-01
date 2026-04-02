package com.crunchyroll.sortandfilters.screen;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.c8.r;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.g;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SortAndFilterActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/crunchyroll/sortandfilters/screen/SortAndFilterActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/sn/e;", "<init>", "()V", "a", "sortandfilters_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SortAndFilterActivity extends com.amazon.aps.iva.i60.b implements com.amazon.aps.iva.sn.e {
    public static final /* synthetic */ int n = 0;
    public final com.amazon.aps.iva.kb0.e k = f.a(g.NONE, new e(this, this));
    public final m l = f.b(new d());
    public final com.amazon.aps.iva.xw.a m = com.amazon.aps.iva.xw.b.b(this, new b());

    /* compiled from: SortAndFilterActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(h hVar, com.amazon.aps.iva.sn.a aVar) {
            Intent intent = new Intent(hVar, SortAndFilterActivity.class);
            intent.putExtra("SCREEN_PROVIDER", aVar);
            hVar.startActivity(intent);
            if (k.n(hVar).c()) {
                hVar.overridePendingTransition(0, 0);
            }
        }
    }

    /* compiled from: SortAndFilterActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.e.m mVar) {
            q qVar;
            com.amazon.aps.iva.e.m mVar2 = mVar;
            j.f(mVar2, "$this$onBackPressedCallback");
            int i = SortAndFilterActivity.n;
            SortAndFilterActivity sortAndFilterActivity = SortAndFilterActivity.this;
            DrawerLayout drawerLayout = sortAndFilterActivity.mi().b;
            if (drawerLayout != null) {
                View e = drawerLayout.e(8388613);
                if (e != null) {
                    drawerLayout.c(e, true);
                    qVar = q.a;
                } else {
                    throw new IllegalArgumentException("No drawer view found with gravity " + DrawerLayout.j(8388613));
                }
            } else {
                qVar = null;
            }
            if (qVar == null) {
                mVar2.setEnabled(false);
                sortAndFilterActivity.getOnBackPressedDispatcher().c();
                mVar2.setEnabled(true);
            }
            return q.a;
        }
    }

    /* compiled from: SortAndFilterActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends DrawerLayout.g {
        public c() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.g, androidx.drawerlayout.widget.DrawerLayout.d
        public final void onDrawerStateChanged(int i) {
            boolean z;
            super.onDrawerStateChanged(i);
            int i2 = SortAndFilterActivity.n;
            SortAndFilterActivity sortAndFilterActivity = SortAndFilterActivity.this;
            DrawerLayout drawerLayout = sortAndFilterActivity.mi().b;
            if (drawerLayout != null && i == 0) {
                View e = drawerLayout.e(8388613);
                if (e != null) {
                    z = DrawerLayout.m(e);
                } else {
                    z = false;
                }
                if (!z) {
                    ((com.amazon.aps.iva.sn.c) sortAndFilterActivity.l.getValue()).f2();
                }
            }
        }
    }

    /* compiled from: SortAndFilterActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.sn.c> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.sn.c invoke() {
            SortAndFilterActivity sortAndFilterActivity = SortAndFilterActivity.this;
            return new com.amazon.aps.iva.sn.d(sortAndFilterActivity, k.n(sortAndFilterActivity).c());
        }
    }

    /* compiled from: ActivityViewBindingDelegate.kt */
    /* loaded from: classes2.dex */
    public static final class e extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.on.a> {
        public final /* synthetic */ com.amazon.aps.iva.k.c h;
        public final /* synthetic */ SortAndFilterActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.amazon.aps.iva.k.c cVar, SortAndFilterActivity sortAndFilterActivity) {
            super(0);
            this.h = cVar;
            this.i = sortAndFilterActivity;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.on.a invoke() {
            j.e(this.h.getLayoutInflater(), "layoutInflater");
            com.amazon.aps.iva.on.c cVar = null;
            View inflate = LayoutInflater.from(this.i).inflate(R.layout.activity_sort_and_filter, (ViewGroup) null, false);
            DrawerLayout drawerLayout = (DrawerLayout) z.u(R.id.drawer_layout, inflate);
            if (((FrameLayout) z.u(R.id.sort_and_filter_content_container, inflate)) != null) {
                View u = z.u(R.id.sort_and_filter_toolbar_container, inflate);
                int i = R.id.toolbar_title;
                if (u != null) {
                    ImageView imageView = (ImageView) z.u(R.id.toolbar_close, u);
                    if (imageView != null) {
                        TextView textView = (TextView) z.u(R.id.toolbar_title, u);
                        if (textView != null) {
                            cVar = new com.amazon.aps.iva.on.c((LinearLayout) u, imageView, textView, 1);
                        }
                    } else {
                        i = R.id.toolbar_close;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(u.getResources().getResourceName(i)));
                }
                TextView textView2 = (TextView) z.u(R.id.toolbar_title, inflate);
                return new com.amazon.aps.iva.on.a((ConstraintLayout) inflate, drawerLayout, cVar);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.sort_and_filter_content_container)));
        }
    }

    @Override // com.amazon.aps.iva.sn.e
    public final void Xa() {
        DrawerLayout drawerLayout = mi().b;
        if (drawerLayout != null) {
            drawerLayout.post(new com.amazon.aps.iva.e.h(this, 7));
        }
    }

    @Override // com.amazon.aps.iva.c3.i, com.amazon.aps.iva.sn.e
    public final void closeScreen() {
        finish();
        if (k.n(this).c()) {
            overridePendingTransition(0, 0);
        }
    }

    @Override // com.amazon.aps.iva.i60.b
    public final com.amazon.aps.iva.mf.f ki() {
        if (k.n(this).c()) {
            return null;
        }
        return new com.crunchyroll.connectivity.e(this);
    }

    public final com.amazon.aps.iva.on.a mi() {
        return (com.amazon.aps.iva.on.a) this.k.getValue();
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        com.amazon.aps.iva.sn.a aVar;
        TextView textView;
        Object obj;
        ImageView imageView;
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = mi().a;
        j.e(constraintLayout, "binding.root");
        setContentView(constraintLayout);
        com.amazon.aps.iva.xw.b.d(this, true);
        DrawerLayout drawerLayout = mi().b;
        if (drawerLayout != null) {
            drawerLayout.setStatusBarBackground(0);
        }
        com.amazon.aps.iva.on.c cVar = mi().c;
        if (cVar != null && (imageView = cVar.d) != null) {
            imageView.setOnClickListener(new r(this, 4));
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = extras.getSerializable("SCREEN_PROVIDER", com.amazon.aps.iva.sn.a.class);
            } else {
                obj = (com.amazon.aps.iva.sn.a) extras.getSerializable("SCREEN_PROVIDER");
            }
            aVar = (com.amazon.aps.iva.sn.a) obj;
        } else {
            aVar = null;
        }
        j.c(aVar);
        com.amazon.aps.iva.o3.e C = aVar.C();
        com.amazon.aps.iva.on.c cVar2 = mi().c;
        if (cVar2 != null && (textView = cVar2.c) != null) {
            textView.setText(C.a);
        }
        if (getSupportFragmentManager().B(R.id.sort_and_filter_content_container) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
            a2.e(R.id.sort_and_filter_content_container, (Fragment) C.b, null);
            a2.h();
        }
        DrawerLayout drawerLayout2 = mi().b;
        if (drawerLayout2 != null) {
            drawerLayout2.a(new c());
        }
        getOnBackPressedDispatcher().a(this, this.m);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.sn.c) this.l.getValue());
    }
}
