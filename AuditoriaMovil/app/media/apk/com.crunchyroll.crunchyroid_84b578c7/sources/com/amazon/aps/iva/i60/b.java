package com.amazon.aps.iva.i60;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.connectivity.e;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BaseFeatureActivity.kt */
/* loaded from: classes2.dex */
public abstract class b extends com.amazon.aps.iva.wy.c {
    public static final /* synthetic */ int j = 0;
    public View e;
    public Toolbar f;
    public final com.amazon.aps.iva.ty.a d = new com.amazon.aps.iva.ty.a(this);
    public final e g = new e(this);
    public final m h = f.b(new a());
    public final com.amazon.aps.iva.o60.b i = new com.amazon.aps.iva.o60.b();

    /* compiled from: BaseFeatureActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.m60.a> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.m60.a invoke() {
            b bVar = b.this;
            return new com.amazon.aps.iva.m60.b(k.n(bVar).c(), new com.amazon.aps.iva.m60.d(bVar));
        }
    }

    public final void U0() {
        com.amazon.aps.iva.mf.f ki = ki();
        if (ki != null) {
            ki.U0();
        }
    }

    public final void W0() {
        com.amazon.aps.iva.mf.f ki = ki();
        if (ki != null) {
            ki.W0();
        }
    }

    public void a() {
        View view = this.e;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void b() {
        View view = this.e;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.amazon.aps.iva.wy.c
    public final void d() {
        this.d.b();
    }

    @Override // com.amazon.aps.iva.k.c
    public final com.amazon.aps.iva.k.f getDelegate() {
        com.amazon.aps.iva.k.f delegate = super.getDelegate();
        j.e(delegate, "super.getDelegate()");
        return this.i.a(delegate);
    }

    public com.amazon.aps.iva.mf.f ki() {
        return this.g;
    }

    public void li() {
        ActivityInfo activityInfo;
        PackageManager.ComponentInfoFlags of;
        Toolbar toolbar = this.f;
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
            j.c(supportActionBar);
            supportActionBar.m(true);
            com.amazon.aps.iva.k.a supportActionBar2 = getSupportActionBar();
            j.c(supportActionBar2);
            supportActionBar2.n(true);
            com.amazon.aps.iva.k.a supportActionBar3 = getSupportActionBar();
            j.c(supportActionBar3);
            supportActionBar3.p(R.drawable.ic_back);
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = getPackageManager();
                    ComponentName componentName = getComponentName();
                    of = PackageManager.ComponentInfoFlags.of(128L);
                    activityInfo = packageManager.getActivityInfo(componentName, of);
                } else {
                    activityInfo = getPackageManager().getActivityInfo(getComponentName(), 128);
                }
                j.e(activityInfo, "if (Build.VERSION.SDK_IN…          )\n            }");
                setTitle(activityInfo.labelRes);
            } catch (PackageManager.NameNotFoundException unused) {
                setTitle(getTitle());
            } catch (Resources.NotFoundException unused2) {
                setTitle(getTitle());
            }
            toolbar.setNavigationOnClickListener(new com.amazon.aps.iva.c8.f(this, 18));
        }
    }

    @Override // com.amazon.aps.iva.wy.c, androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.amazon.aps.iva.mf.f ki = ki();
        if (ki != null) {
            ki.init();
        }
        com.amazon.aps.iva.m60.a aVar = (com.amazon.aps.iva.m60.a) this.h.getValue();
        if (aVar != null) {
            this.b.a(aVar);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        j.f(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            getOnBackPressedDispatcher().c();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.amazon.aps.iva.k.c, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        this.f = (Toolbar) findViewById(R.id.toolbar);
        this.e = findViewById(R.id.progress);
        li();
    }

    @Override // android.app.Activity
    public final void setTitle(int i) {
        Toolbar toolbar = this.f;
        if (toolbar != null) {
            com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
            j.c(supportActionBar);
            supportActionBar.o();
            toolbar.setTitle(i);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        Toolbar toolbar = this.f;
        if (toolbar != null) {
            com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
            j.c(supportActionBar);
            supportActionBar.o();
            toolbar.setTitle(charSequence);
        }
    }

    @Override // com.amazon.aps.iva.k.c, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        j.f(view, "view");
        super.setContentView(view);
        this.f = (Toolbar) findViewById(R.id.toolbar);
        li();
    }
}
