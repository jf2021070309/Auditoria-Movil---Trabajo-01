package com.amazon.aps.iva.c3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import com.amazon.aps.iva.p3.g;
/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public class i extends Activity implements com.amazon.aps.iva.i5.o, g.a {
    private com.amazon.aps.iva.x.h<Class<? extends a>, a> mExtraDataMap = new com.amazon.aps.iva.x.h<>();
    private androidx.lifecycle.k mLifecycleRegistry = new androidx.lifecycle.k(this);

    /* compiled from: ComponentActivity.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT < 31) {
                    return false;
                }
                return true;
            case 1:
            case 2:
                if (Build.VERSION.SDK_INT < 33) {
                    return false;
                }
                return true;
            case 3:
                if (Build.VERSION.SDK_INT < 29) {
                    return false;
                }
                return true;
            case 4:
                return true;
            default:
                return false;
        }
    }

    public void G4() {
        finish();
    }

    public void Xf(int i) {
        setTitle(i);
    }

    public void close() {
        finish();
    }

    public void closeScreen() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && com.amazon.aps.iva.p3.g.a(decorView, keyEvent)) {
            return true;
        }
        return com.amazon.aps.iva.p3.g.b(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView != null && com.amazon.aps.iva.p3.g.a(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public androidx.lifecycle.g getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = androidx.lifecycle.o.c;
        o.b.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.k kVar = this.mLifecycleRegistry;
        g.b bVar = g.b.CREATED;
        kVar.getClass();
        com.amazon.aps.iva.yb0.j.f(bVar, "state");
        kVar.b("markState");
        kVar.e(bVar);
        super.onSaveInstanceState(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public void putExtraData(a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // com.amazon.aps.iva.p3.g.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
