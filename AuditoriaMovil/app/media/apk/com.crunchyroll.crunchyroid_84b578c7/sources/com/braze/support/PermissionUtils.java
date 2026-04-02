package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.amazon.aps.iva.d0.b2;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0005\u001a\f\u0010\b\u001a\u00020\u0003*\u0004\u0018\u00010\u0005\u001a\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroid/content/Context;", "", "permission", "", "hasPermission", "Landroid/app/Activity;", "Lcom/amazon/aps/iva/kb0/q;", "requestPushPermissionPrompt", "wouldPushPermissionPromptDisplay", "context", "", "getPermissionRequestCount", "incrementPermissionRequestCount", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PermissionUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failure checking permission " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return b2.b(new StringBuilder("Incrementing permission request counter to "), this.b, '.');
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Attempting to execute requestPushPermissionPrompt()";
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final d b = new d();

        public d() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e b = new e();

        public e() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Permission prompt would not display, not attempting to request push permission prompt.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f b = new f();

        public f() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Requesting push permission from system.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g b = new g();

        public g() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot request push permission with null Activity.";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("Device API version of "), Build.VERSION.SDK_INT, " is too low to display push permission prompt.");
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("App Target API version of "), this.b, " is too low to display push permission prompt.");
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Notification permission already granted, doing nothing.";
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(int i) {
            super(0);
            this.b = i;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.e.f(new StringBuilder("Notification permission request count is "), this.b, ". Returning value of 'shouldShowRequestPermissionRationale(NOTIFICATION_PERMISSION)'");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Push Prompt can be shown on this device, within a reasonable confidence.";
        }
    }

    public static final int getPermissionRequestCount(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "permission");
        return context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0).getInt(str, 0);
    }

    public static final boolean hasPermission(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "permission");
        if (context == null) {
            return false;
        }
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(TAG, BrazeLogger.Priority.E, th, (com.amazon.aps.iva.xb0.a<String>) new a(str));
            return false;
        }
    }

    public static final void incrementPermissionRequestCount(Context context, String str) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "permission");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.support.permission_util.requested_perms", 0);
        int i2 = sharedPreferences.getInt(str, 0) + 1;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new b(i2), 6, (Object) null);
        sharedPreferences.edit().putInt(str, i2).apply();
    }

    public static final void requestPushPermissionPrompt(Activity activity) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, (com.amazon.aps.iva.xb0.a) c.b, 4, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) d.b, 6, (Object) null);
        } else if (wouldPushPermissionPromptDisplay(activity) && Build.VERSION.SDK_INT >= 33) {
            incrementPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
            BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, (com.amazon.aps.iva.xb0.a) f.b, 4, (Object) null);
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, IntentUtils.getRequestCode());
        } else {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) e.b, 6, (Object) null);
        }
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) {
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) g.b, 6, (Object) null);
            return false;
        } else if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) h.b, 4, (Object) null);
            return false;
        } else {
            int i2 = activity.getApplicationInfo().targetSdkVersion;
            if (i2 < 33) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) new i(i2), 4, (Object) null);
                return false;
            } else if (hasPermission(activity, "android.permission.POST_NOTIFICATIONS")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) j.b, 4, (Object) null);
                return false;
            } else {
                int permissionRequestCount = getPermissionRequestCount(activity, "android.permission.POST_NOTIFICATIONS");
                if (permissionRequestCount >= 2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, (com.amazon.aps.iva.xb0.a) new k(permissionRequestCount), 4, (Object) null);
                    return activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (com.amazon.aps.iva.xb0.a) l.b, 4, (Object) null);
                return true;
            }
        }
    }
}
