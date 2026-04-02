package com.amazon.aps.iva.n5;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.amazon.aps.iva.n5.b;
/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes.dex */
public class e implements b.a {
    public static final boolean c = b.b;
    public Context a;
    public final ContentResolver b;

    /* compiled from: MediaSessionManagerImplBase.java */
    /* loaded from: classes.dex */
    public static class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            int i = this.c;
            String str = this.a;
            int i2 = this.b;
            if (i2 >= 0 && aVar.b >= 0) {
                if (TextUtils.equals(str, aVar.a) && i2 == aVar.b && i == aVar.c) {
                    return true;
                }
                return false;
            } else if (TextUtils.equals(str, aVar.a) && i == aVar.c) {
                return true;
            } else {
                return false;
            }
        }

        public final int hashCode() {
            return com.amazon.aps.iva.o3.b.b(this.a, Integer.valueOf(this.c));
        }
    }

    public e(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
    }

    @Override // com.amazon.aps.iva.n5.b.a
    public boolean a(a aVar) {
        boolean z;
        try {
            if (this.a.getPackageManager().getApplicationInfo(aVar.a, 0) == null) {
                return false;
            }
            if (!b(aVar, "android.permission.STATUS_BAR_SERVICE") && !b(aVar, "android.permission.MEDIA_CONTENT_CONTROL") && aVar.c != 1000) {
                String string = Settings.Secure.getString(this.b, "enabled_notification_listeners");
                if (string != null) {
                    for (String str : string.split(":")) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null && unflattenFromString.getPackageName().equals(aVar.a)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    return false;
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            if (c) {
                String str2 = aVar.a;
            }
            return false;
        }
    }

    public final boolean b(a aVar, String str) {
        int i = aVar.b;
        if (i < 0) {
            if (this.a.getPackageManager().checkPermission(str, aVar.a) == 0) {
                return true;
            }
            return false;
        } else if (this.a.checkPermission(str, i, aVar.c) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
