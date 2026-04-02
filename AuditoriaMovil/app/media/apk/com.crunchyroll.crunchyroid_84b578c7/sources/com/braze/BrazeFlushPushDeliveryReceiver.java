package com.braze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/BrazeFlushPushDeliveryReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/amazon/aps/iva/kb0/q;", "onReceive", "<init>", "()V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeFlushPushDeliveryReceiver extends BroadcastReceiver {
    public static final a Companion = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Intent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent) {
            super(0);
            this.b = intent;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "BrazeFlushPushDeliveryReceiver received intent: " + this.b.getAction();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new b(intent), 3, (Object) null);
        if (j.a(intent.getAction(), "com.braze.FLUSH_PUSH_DELIVERY")) {
            BrazeInternal.INSTANCE.performPushDeliveryFlush(context);
        }
    }
}
