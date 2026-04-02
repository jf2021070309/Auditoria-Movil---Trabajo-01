package com.android.music;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.view.MenuItem;
import c.b.c.l;
import c.b.c.n;
import c.b.i.f1;
import c.m.b.d;
import e.a.c.c7;
import e.a.c.u6;
import e.a.c.z6;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class SettingsActivity extends l implements ServiceConnection {
    public static void y(Activity activity) {
        try {
            activity.startActivity(new Intent(activity, SettingsActivity.class));
        } catch (NullPointerException unused) {
        }
    }

    @Override // c.b.c.l, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Configuration a = u6.a(context, context.getResources().getConfiguration());
        applyOverrideConfiguration(a);
        super.attachBaseContext(context.createConfigurationContext(a));
    }

    @Override // c.m.b.o, androidx.activity.ComponentActivity, c.i.c.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(z6.E(R.string.settings));
        setContentView(R.layout.activity_settings);
        if (Build.VERSION.SDK_INT < 21) {
            int i2 = n.a;
            f1.a = true;
        }
        d dVar = new d(getSupportFragmentManager());
        dVar.e(R.id.fragment_container, new c7());
        dVar.c();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // c.b.c.l, c.m.b.o, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
