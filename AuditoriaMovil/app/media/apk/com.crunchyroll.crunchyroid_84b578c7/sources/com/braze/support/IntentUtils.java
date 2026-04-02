package com.braze.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\u0002H\u0007R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/braze/support/IntentUtils;", "", "", "getRequestCode", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/amazon/aps/iva/kb0/q;", "addComponentAndSendBroadcast", "getImmutablePendingIntentFlags", "Ljava/util/Random;", "random$delegate", "Lcom/amazon/aps/iva/kb0/e;", "getRandom", "()Ljava/util/Random;", "random", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IntentUtils {
    public static final IntentUtils INSTANCE = new IntentUtils();
    private static final com.amazon.aps.iva.kb0.e random$delegate = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, b.b);

    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ ComponentName b;
        final /* synthetic */ Intent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ComponentName componentName, Intent intent) {
            super(0);
            this.b = componentName;
            this.c = intent;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Sent intent with component " + this.b + " and explicit intent " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final Random invoke() {
            return new Random();
        }
    }

    private IntentUtils() {
    }

    public static final void addComponentAndSendBroadcast(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers;
        PackageManager.ResolveInfoFlags of;
        j.f(context, "context");
        j.f(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, of);
        } else {
            queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        }
        j.e(queryBroadcastReceivers, "if (Build.VERSION.SDK_IN…vers(intent, 0)\n        }");
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setComponent(componentName);
            context.sendBroadcast(intent2);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new a(componentName, intent2), 2, (Object) null);
        }
    }

    public static final int getImmutablePendingIntentFlags() {
        return 67108864;
    }

    private final Random getRandom() {
        return (Random) random$delegate.getValue();
    }

    public static final int getRequestCode() {
        return INSTANCE.getRandom().nextInt(1073741823) + 100000;
    }
}
