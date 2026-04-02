package com.rovio.fusion;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.savegame.SavesRestoring;
/* loaded from: classes2.dex */
public class App extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final boolean ENABLE_LOGGING = false;
    private RelativeLayout a;
    private MySurfaceView b;
    private Object c;

    static {
        $assertionsDisabled = !App.class.desiredAssertionStatus();
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        SavesRestoring.DoSmth(this);
        Debug("onCreate()");
        a();
        Globals.loadLibraries();
        Globals.setActivity(this);
        this.c = Globals.newInstanceIfAvailable("com.rovio.fusion.HockeyAppWrapper");
        super.onCreate(bundle);
        this.a = new RelativeLayout(this);
        this.a.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b = new MySurfaceView(this);
        this.a.addView(this.b, -1, -1);
        c();
        setContentView(this.a);
        if (getIntent() != null) {
            onNewIntent(getIntent());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Debug("onStart()");
        super.onStart();
        Globals.onStart();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        Debug("onRestart()");
        super.onRestart();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Debug("onResume()");
        super.onResume();
        Globals.onResume();
        this.b.onResume();
        b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Debug("onPause()");
        super.onPause();
        this.b.onPause();
        Globals.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Debug("onStop()");
        super.onStop();
        Globals.onStop();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Debug("onDestroy()");
        super.onDestroy();
        Globals.onDestroy();
        Process.killProcess(Process.myPid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Debug("onActivityResult(" + i + "," + i2 + ",Intent=" + (intent != null ? intent.getAction() : "null") + ")");
        Globals.onActivityResult(i, i2, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Debug("onNewIntent(Intent=" + intent.getAction() + ")");
        setIntent(intent);
        Globals.onNewIntent(intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Permissions.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return this.b.getInputDelegate().onGenericMotionEvent(motionEvent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.SupportActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return Globals.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.b.getInputDelegate().onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        b();
        return this.b.getInputDelegate().onKeyUp(i, keyEvent);
    }

    private void a() {
        int i;
        if (Build.VERSION.SDK_INT < 18) {
            ActivityInfo activityInfo = null;
            try {
                activityInfo = getPackageManager().getActivityInfo(getComponentName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!$assertionsDisabled) {
                    throw new AssertionError("unexpected exception");
                }
            }
            switch (activityInfo.screenOrientation) {
                case 11:
                    i = 6;
                    break;
                case 12:
                    i = 7;
                    break;
                case 13:
                    i = 10;
                    break;
                default:
                    return;
            }
            Log.w("App", "Requested screen orientation " + activityInfo.screenOrientation + " not supported, falling back to " + i);
            setRequestedOrientation(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    private void c() {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.rovio.fusion.App.1
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public void onSystemUiVisibilityChange(int i) {
                    App.this.b();
                }
            });
        }
    }

    public boolean isSilentProfile() {
        return ((AudioManager) getSystemService("audio")).getRingerMode() != 2;
    }

    public void quitRequested() {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                stopLockTask();
            } catch (Exception e) {
            }
        }
    }

    public void allowSleep(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.rovio.fusion.App.2
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    App.this.getWindow().clearFlags(128);
                } else {
                    App.this.getWindow().addFlags(128);
                }
            }
        });
    }

    private static void Debug(String str) {
    }
}
