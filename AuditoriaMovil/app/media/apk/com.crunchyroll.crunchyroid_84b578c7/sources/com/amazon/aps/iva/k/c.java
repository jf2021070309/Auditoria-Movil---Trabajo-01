package com.amazon.aps.iva.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.savedstate.a;
import com.amazon.aps.iva.c3.a;
import com.amazon.aps.iva.c3.g0;
import com.amazon.aps.iva.c3.l;
import com.amazon.aps.iva.i5.i0;
import com.amazon.aps.iva.i5.j0;
import com.amazon.aps.iva.k.u;
import com.amazon.aps.iva.o.a;
import com.amazon.aps.iva.q.l1;
/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class c extends androidx.fragment.app.h implements d, g0.b {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private f mDelegate;
    private Resources mResources;

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // androidx.savedstate.a.b
        public final Bundle a() {
            Bundle bundle = new Bundle();
            c.this.getDelegate().q(bundle);
            return bundle;
        }
    }

    /* compiled from: AppCompatActivity.java */
    /* loaded from: classes.dex */
    public class b implements com.amazon.aps.iva.g.b {
        public b() {
        }

        @Override // com.amazon.aps.iva.g.b
        public final void a(Context context) {
            c cVar = c.this;
            f delegate = cVar.getDelegate();
            delegate.i();
            delegate.m(cVar.getSavedStateRegistry().a(c.DELEGATE_TAG));
        }
    }

    public c() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().c(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void initViewTreeOwners() {
        i0.b(getWindow().getDecorView(), this);
        j0.b(getWindow().getDecorView(), this);
        com.amazon.aps.iva.s8.d.b(getWindow().getDecorView(), this);
        com.amazon.aps.iva.e.z.O(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().b(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // com.amazon.aps.iva.c3.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.j(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().c(i);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            u.a aVar = f.b;
            this.mDelegate = new g(this, null, this, this);
        }
        return this.mDelegate;
    }

    public com.amazon.aps.iva.k.b getDrawerToggleDelegate() {
        return getDelegate().e();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
            int i = l1.a;
        }
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public com.amazon.aps.iva.k.a getSupportActionBar() {
        return getDelegate().h();
    }

    @Override // com.amazon.aps.iva.c3.g0.b
    public Intent getSupportParentActivityIntent() {
        return com.amazon.aps.iva.c3.l.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().j();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().l(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(g0 g0Var) {
        g0Var.getClass();
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = com.amazon.aps.iva.c3.l.a(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(g0Var.c.getPackageManager());
            }
            g0Var.d(component);
            g0Var.b.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.d() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().o(bundle);
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().p();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().r();
    }

    @Override // androidx.fragment.app.h, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().s();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                g0 g0Var = new g0(this);
                onCreateSupportNavigateUpTaskStack(g0Var);
                onPrepareSupportNavigateUpTaskStack(g0Var);
                g0Var.f();
                try {
                    int i = com.amazon.aps.iva.c3.a.a;
                    a.C0160a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().A(charSequence);
    }

    @Override // com.amazon.aps.iva.k.d
    public com.amazon.aps.iva.o.a onWindowStartingSupportActionMode(a.InterfaceC0549a interfaceC0549a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        com.amazon.aps.iva.k.a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.k()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().v(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().y(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().z(i);
    }

    public com.amazon.aps.iva.o.a startSupportActionMode(a.InterfaceC0549a interfaceC0549a) {
        return getDelegate().B(interfaceC0549a);
    }

    @Override // androidx.fragment.app.h
    public void supportInvalidateOptionsMenu() {
        getDelegate().j();
    }

    public void supportNavigateUpTo(Intent intent) {
        l.a.b(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().u(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return l.a.c(this, intent);
    }

    public c(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        getDelegate().w(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().x(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public void onLocalesChanged(com.amazon.aps.iva.k3.j jVar) {
    }

    public void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(g0 g0Var) {
    }

    @Override // com.amazon.aps.iva.k.d
    public void onSupportActionModeFinished(com.amazon.aps.iva.o.a aVar) {
    }

    @Override // com.amazon.aps.iva.k.d
    public void onSupportActionModeStarted(com.amazon.aps.iva.o.a aVar) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}
