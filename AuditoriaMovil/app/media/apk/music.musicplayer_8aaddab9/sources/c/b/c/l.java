package c.b.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import c.b.h.a;
import c.b.i.f1;
import c.i.d.a;
import java.util.ArrayList;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class l extends c.m.b.o implements m {
    public n a;

    /* renamed from: b  reason: collision with root package name */
    public Resources f818b;

    public l() {
        getSavedStateRegistry().b("androidx:appcompat", new j(this));
        addOnContextAvailableListener(new k(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        t().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(t().e(context));
    }

    @Override // c.b.c.m
    public void c(c.b.h.a aVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        a u = u();
        if (getWindow().hasFeature(0)) {
            if (u == null || !u.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // c.i.c.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a u = u();
        if (keyCode == 82 && u != null && u.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.b.c.m
    public void e(c.b.h.a aVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) t().f(i2);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return t().h();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f818b == null && f1.a()) {
            this.f818b = new f1(this, super.getResources());
        }
        Resources resources = this.f818b;
        return resources == null ? super.getResources() : resources;
    }

    public final void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        t().k();
    }

    @Override // c.b.c.m
    public c.b.h.a j(a.InterfaceC0018a interfaceC0018a) {
        return null;
    }

    @Override // c.m.b.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f818b != null) {
            this.f818b.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        t().l(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // c.m.b.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t().n();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // c.m.b.o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent B;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a u = u();
        if (menuItem.getItemId() != 16908332 || u == null || (u.d() & 4) == 0 || (B = c.i.a.B(this)) == null) {
            return false;
        }
        if (!shouldUpRecreateTask(B)) {
            navigateUpTo(B);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent v = v();
        if (v == null) {
            v = c.i.a.B(this);
        }
        if (v != null) {
            ComponentName component = v.getComponent();
            if (component == null) {
                component = v.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            try {
                Intent C = c.i.a.C(this, component);
                while (C != null) {
                    arrayList.add(size, C);
                    C = c.i.a.C(this, C.getComponent());
                }
                arrayList.add(v);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
        x();
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = c.i.d.a.a;
        a.C0034a.a(this, intentArr, null);
        try {
            int i3 = c.i.c.c.f1944c;
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // c.m.b.o, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        t().o(bundle);
    }

    @Override // c.m.b.o, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        t().p();
    }

    @Override // c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
        t().r();
    }

    @Override // c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
        t().s();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        t().A(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        a u = u();
        if (getWindow().hasFeature(0)) {
            if (u == null || !u.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i2) {
        initViewTreeOwners();
        t().v(i2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        t().w(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        t().x(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        t().z(i2);
    }

    @Override // c.m.b.o
    public void supportInvalidateOptionsMenu() {
        t().k();
    }

    public n t() {
        if (this.a == null) {
            int i2 = n.a;
            this.a = new o(this, null, this, this);
        }
        return this.a;
    }

    public a u() {
        return t().i();
    }

    public Intent v() {
        return c.i.a.B(this);
    }

    public void w() {
    }

    public void x() {
    }
}
