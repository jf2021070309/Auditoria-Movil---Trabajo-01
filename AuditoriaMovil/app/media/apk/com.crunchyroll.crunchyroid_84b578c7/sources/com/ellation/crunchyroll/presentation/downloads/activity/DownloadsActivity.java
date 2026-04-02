package com.ellation.crunchyroll.presentation.downloads.activity;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import androidx.lifecycle.p;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: DownloadsActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/downloads/activity/DownloadsActivity;", "Lcom/amazon/aps/iva/i60/b;", "Lcom/amazon/aps/iva/e10/c;", "<init>", "()V", "a", "downloading_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DownloadsActivity extends com.amazon.aps.iva.i60.b implements com.amazon.aps.iva.e10.c {
    public final com.amazon.aps.iva.ez.a k = new com.amazon.aps.iva.ez.a(com.amazon.aps.iva.uw.b.class, new e(this), b.h);
    public final m l = f.b(new d());
    public final com.amazon.aps.iva.xw.a m = com.amazon.aps.iva.xw.b.b(this, new c());
    public final int n = R.layout.activity_downloads;
    public static final /* synthetic */ l<Object>[] p = {q.a(DownloadsActivity.class, "editModeViewModel", "getEditModeViewModel()Lcom/ellation/crunchyroll/edit/EditModeViewModel;", 0)};
    public static final a o = new a();

    /* compiled from: DownloadsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: DownloadsActivity.kt */
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

    /* compiled from: DownloadsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.e.m, com.amazon.aps.iva.kb0.q> {
        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.e.m mVar) {
            j.f(mVar, "$this$onBackPressedCallback");
            a aVar = DownloadsActivity.o;
            ((com.amazon.aps.iva.e10.a) DownloadsActivity.this.l.getValue()).a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.e10.a> {
        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.e10.a invoke() {
            a aVar = DownloadsActivity.o;
            DownloadsActivity downloadsActivity = DownloadsActivity.this;
            downloadsActivity.getClass();
            return new com.amazon.aps.iva.e10.b((com.amazon.aps.iva.uw.a) downloadsActivity.k.getValue(downloadsActivity, DownloadsActivity.p[0]), downloadsActivity);
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes2.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h> {
        public final /* synthetic */ h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final h invoke() {
            return this.h;
        }
    }

    @Override // com.amazon.aps.iva.wy.c
    public final Integer ji() {
        return Integer.valueOf(this.n);
    }

    @Override // com.amazon.aps.iva.i60.b
    public final void li() {
        super.li();
        Toolbar toolbar = this.f;
        j.c(toolbar);
        toolbar.setPadding(0, 0, 0, 0);
    }

    @Override // com.amazon.aps.iva.i60.b, com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a a2 = defpackage.b.a(supportFragmentManager, supportFragmentManager);
            com.amazon.aps.iva.i10.a.x.getClass();
            com.amazon.aps.iva.i10.a aVar = new com.amazon.aps.iva.i10.a();
            aVar.d.b(aVar, com.amazon.aps.iva.i10.a.y[0], Boolean.TRUE);
            a2.d(R.id.container, aVar, null, 1);
            a2.h();
        }
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        onBackPressedDispatcher.getClass();
        com.amazon.aps.iva.xw.a aVar2 = this.m;
        j.f(aVar2, "onBackPressedCallback");
        onBackPressedDispatcher.b(aVar2);
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H((com.amazon.aps.iva.e10.a) this.l.getValue());
    }
}
