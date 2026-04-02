package e.d.d.w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes2.dex */
public class d0 {
    public final Context a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public String f7665b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    public String f7666c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public int f7667d;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public int f7668e = 0;

    public d0(Context context) {
        this.a = context;
    }

    public static String b(e.d.d.g gVar) {
        gVar.a();
        String str = gVar.f7042f.f7052e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = gVar.f7042f.f7049b;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length < 2) {
                return null;
            }
            String str3 = split[1];
            if (str3.isEmpty()) {
                return null;
            }
            return str3;
        }
        return str2;
    }

    public synchronized String a() {
        if (this.f7665b == null) {
            e();
        }
        return this.f7665b;
    }

    public final PackageInfo c(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("FirebaseMessaging", "Failed to find package ".concat(e2.toString()));
            return null;
        }
    }

    public boolean d() {
        int i2;
        synchronized (this) {
            i2 = this.f7668e;
            if (i2 == 0) {
                PackageManager packageManager = this.a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i2 = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f7668e = 1;
                            i2 = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                        this.f7668e = 2;
                        i2 = 2;
                    }
                    Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                    if (PlatformVersion.isAtLeastO()) {
                        this.f7668e = 2;
                        i2 = 2;
                    } else {
                        this.f7668e = 1;
                        i2 = 1;
                    }
                }
            }
        }
        return i2 != 0;
    }

    public final synchronized void e() {
        PackageInfo c2 = c(this.a.getPackageName());
        if (c2 != null) {
            this.f7665b = Integer.toString(c2.versionCode);
            this.f7666c = c2.versionName;
        }
    }
}
