package com.ellation.crunchyroll.presentation.update;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.c;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.m60.d;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.z40.h;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: UpdateAppActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/update/UpdateAppActivity;", "Lcom/amazon/aps/iva/k/c;", "Lcom/amazon/aps/iva/z40/h;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class UpdateAppActivity extends c implements h {
    public final v b = g.d(this, R.id.update_app_button);
    public final m c = f.b(new b());
    public final com.amazon.aps.iva.o60.b d = new com.amazon.aps.iva.o60.b();
    public static final /* synthetic */ l<Object>[] f = {q.a(UpdateAppActivity.class, "updateAppButton", "getUpdateAppButton()Landroid/widget/TextView;", 0)};
    public static final a e = new a();

    /* compiled from: UpdateAppActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: UpdateAppActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.z40.f> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.z40.f invoke() {
            UpdateAppActivity updateAppActivity = UpdateAppActivity.this;
            String packageName = updateAppActivity.getPackageName();
            j.e(packageName, "packageName");
            return new com.amazon.aps.iva.z40.g(updateAppActivity, packageName);
        }
    }

    @Override // com.amazon.aps.iva.z40.h
    public final void F8(String str) {
        j.f(str, "packageName");
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
    }

    @Override // com.amazon.aps.iva.z40.h
    public final void Qb(String str) {
        j.f(str, "packageName");
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(str))));
    }

    @Override // com.amazon.aps.iva.k.c
    public final com.amazon.aps.iva.k.f getDelegate() {
        com.amazon.aps.iva.k.f delegate = super.getDelegate();
        j.e(delegate, "super.getDelegate()");
        return this.d.a(delegate);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_update_app);
        com.amazon.aps.iva.xw.b.d(this, true);
        com.ellation.crunchyroll.mvp.lifecycle.a.a(new com.amazon.aps.iva.m60.b(k.n(this).c(), new d(this)), this);
        com.ellation.crunchyroll.mvp.lifecycle.a.a((com.amazon.aps.iva.z40.f) this.c.getValue(), this);
        ((TextView) this.b.getValue(this, f[0])).setOnClickListener(new com.amazon.aps.iva.c8.k(this, 19));
    }
}
