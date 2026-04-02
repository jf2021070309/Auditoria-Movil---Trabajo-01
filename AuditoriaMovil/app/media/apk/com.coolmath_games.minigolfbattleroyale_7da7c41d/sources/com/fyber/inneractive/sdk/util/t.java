package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class t {
    public List<b> a;
    public boolean b;
    public Context c;
    public BroadcastReceiver d;

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* synthetic */ t(byte b2) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private static t a = new t((byte) 0);
    }

    private t() {
        this.a = new CopyOnWriteArrayList();
    }

    final synchronized void a(Context context, Intent intent) {
        boolean z;
        try {
            z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
        } catch (Exception unused) {
            IAlog.b("%sFailed to get lock screen status", IAlog.a(this));
            z = false;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.b = true;
        } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.b = false;
        }
        IAlog.b("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(this), Boolean.valueOf(this.b), Integer.valueOf(this.a.size()));
        for (b bVar : this.a) {
            bVar.a(this.b);
        }
    }

    public final synchronized void a() {
        if (this.c != null) {
            IAlog.b("%sremoving screen state receiver and destroying singleton", IAlog.a(this));
            this.c.unregisterReceiver(this.d);
            this.c = null;
            this.d = null;
            this.a.clear();
        }
    }
}
