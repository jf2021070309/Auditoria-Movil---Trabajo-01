package com.braze.push;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
/* compiled from: BrazeNotificationFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory;", "Lcom/braze/IBrazeNotificationFactory;", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Landroid/app/Notification;", "createNotification", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeNotificationFactory implements IBrazeNotificationFactory {
    public static final Companion Companion = new Companion(null);
    private static final BrazeNotificationFactory internalInstance = new BrazeNotificationFactory();

    /* compiled from: BrazeNotificationFactory.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/braze/push/BrazeNotificationFactory$Companion;", "", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Lcom/amazon/aps/iva/c3/s;", "populateNotificationBuilder", "Lcom/braze/push/BrazeNotificationFactory;", "getInstance", "()Lcom/braze/push/BrazeNotificationFactory;", "getInstance$annotations", "()V", "instance", "internalInstance", "Lcom/braze/push/BrazeNotificationFactory;", "<init>", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final BrazeNotificationFactory getInstance() {
            return BrazeNotificationFactory.internalInstance;
        }

        public final s populateNotificationBuilder(BrazeNotificationPayload brazeNotificationPayload) {
            j.f(brazeNotificationPayload, "payload");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationFactory$Companion$populateNotificationBuilder$1(brazeNotificationPayload), 2, (Object) null);
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationFactory$Companion$populateNotificationBuilder$2.INSTANCE, 3, (Object) null);
                return null;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationFactory$Companion$populateNotificationBuilder$3.INSTANCE, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            BrazeNotificationUtils.prefetchBitmapsIfNewlyReceivedStoryPush(brazeNotificationPayload);
            s sVar = new s(context, BrazeNotificationUtils.getOrCreateNotificationChannelId(brazeNotificationPayload));
            sVar.f(16, true);
            BrazeNotificationUtils.setTitleIfPresent(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setContentIfPresent(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setTickerIfPresent(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setSetShowWhen(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setContentIntentIfPresent(context, sVar, notificationExtras);
            BrazeNotificationUtils.setDeleteIntent(context, sVar, notificationExtras);
            BrazeNotificationUtils.setSmallIcon(configurationProvider, sVar);
            BrazeNotificationUtils.setLargeIconIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setSoundIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setSummaryTextIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setPriorityIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationStyleFactory.Companion.setStyleIfSupported(sVar, brazeNotificationPayload);
            BrazeNotificationActionUtils.addNotificationActions(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setAccentColorIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setCategoryIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setVisibilityIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setPublicVersionIfPresentAndSupported(sVar, brazeNotificationPayload);
            BrazeNotificationUtils.setNotificationBadgeNumberIfPresent(sVar, brazeNotificationPayload);
            return sVar;
        }
    }

    @Override // com.braze.IBrazeNotificationFactory
    public Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazeNotificationPayload, "payload");
        s populateNotificationBuilder = Companion.populateNotificationBuilder(brazeNotificationPayload);
        if (populateNotificationBuilder != null) {
            return populateNotificationBuilder.b();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, BrazeNotificationFactory$createNotification$1.INSTANCE, 2, (Object) null);
        return null;
    }
}
