package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t {
    private final SharedPreferences a;
    private final Context b;
    private final aq c;
    private final Map<String, ar> d;

    public t(Context context) {
        this(context, new aq());
    }

    private t(Context context, aq aqVar) {
        this.d = new ArrayMap();
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.c = aqVar;
        File file = new File(ContextCompat.getNoBackupFilesDir(this.b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    b();
                    FirebaseInstanceId.getInstance().e();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    public final synchronized String a() {
        return this.a.getString("topic_operaion_queue", "");
    }

    public final synchronized void a(String str) {
        this.a.edit().putString("topic_operaion_queue", str).apply();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    private static String c(String str, String str2, String str3) {
        return new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length()).append(str).append("|T|").append(str2).append("|").append(str3).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length()).append(str).append("|S|").append(str2).toString();
    }

    public final synchronized void b() {
        this.d.clear();
        aq.a(this.b);
        this.a.edit().clear().commit();
    }

    public final synchronized u a(String str, String str2, String str3) {
        return u.a(this.a.getString(c(str, str2, str3), null));
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a = u.a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(c(str, str2, str3), a);
            edit.commit();
        }
    }

    public final synchronized void b(String str, String str2, String str3) {
        String c = c(str, str2, str3);
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(c);
        edit.commit();
    }

    public final synchronized ar b(String str) {
        ar arVar;
        arVar = this.d.get(str);
        if (arVar == null) {
            try {
                arVar = this.c.a(this.b, str);
            } catch (a e) {
                Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
                FirebaseInstanceId.getInstance().e();
                arVar = this.c.b(this.b, str);
            }
            this.d.put(str, arVar);
        }
        return arVar;
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }
}
