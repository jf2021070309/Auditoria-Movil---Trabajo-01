package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    private final FirebaseInstanceId c;
    private final zzan d;
    private final x e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(FirebaseInstanceId firebaseInstanceId, zzan zzanVar, x xVar, long j) {
        this.c = firebaseInstanceId;
        this.d = zzanVar;
        this.e = xVar;
        this.a = j;
        this.b.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.acquire();
        try {
            this.c.a(true);
            if (!this.c.f()) {
                this.c.a(false);
            } else if (!b()) {
                new w(this).a();
            } else {
                if (c() && d() && this.e.a(this.c)) {
                    this.c.a(false);
                } else {
                    this.c.a(this.a);
                }
            }
        } finally {
            this.b.release();
        }
    }

    private final boolean c() {
        try {
            if (!this.c.g()) {
                this.c.h();
            }
            return true;
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Build channel failed: ".concat(valueOf) : new String("Build channel failed: "));
            return false;
        }
    }

    private final boolean d() {
        u b = this.c.b();
        if (b == null || b.b(this.d.zzad())) {
            try {
                String c = this.c.c();
                if (c == null) {
                    Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                    return false;
                }
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Token successfully retrieved");
                }
                if (b == null || !(b == null || c.equals(b.a))) {
                    Context a = a();
                    Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                    intent.putExtra("token", c);
                    zzav.zzc(a, intent);
                    zzav.zzb(a, new Intent("com.google.firebase.iid.TOKEN_REFRESH"));
                    return true;
                }
                return true;
            } catch (IOException | SecurityException e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.e("FirebaseInstanceId", valueOf.length() != 0 ? "Token retrieval failed: ".concat(valueOf) : new String("Token retrieval failed: "));
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.c.a().getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
