package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.ironsource.mediationsdk.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0107a {
    int b;
    AbstractC0108b d;
    AbstractC0108b e;
    String f;
    String g;
    Boolean j;
    boolean k;
    private String m = IronSourceConstants.EVENTS_ERROR_REASON;
    private String n = "status";
    private String o = "placement";
    private String p = IronSourceConstants.EVENTS_REWARD_NAME;
    private String q = IronSourceConstants.EVENTS_REWARD_AMOUNT;
    private String r = "providerPriority";
    boolean i = false;
    boolean l = true;
    final CopyOnWriteArrayList<AbstractC0108b> c = new CopyOnWriteArrayList<>();
    IronSourceLoggerManager h = IronSourceLoggerManager.getLogger();
    com.ironsource.mediationsdk.utils.e a = null;

    abstract void a(Context context, boolean z);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(AbstractC0108b abstractC0108b) {
        this.c.add(abstractC0108b);
        com.ironsource.mediationsdk.utils.e eVar = this.a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (abstractC0108b.m != 99) {
                        eVar.a.put(eVar.d(abstractC0108b), Integer.valueOf(abstractC0108b.m));
                    }
                } catch (Exception e) {
                    eVar.c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean a() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b() {
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(AbstractC0108b abstractC0108b) {
        try {
            String str = E.a().l;
            if (!TextUtils.isEmpty(str) && abstractC0108b.b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = abstractC0108b.q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, abstractC0108b.j() + ":setMediationSegment(segment:" + str + ")", 1);
                abstractC0108b.b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
            if (abstractC0108b.b != null) {
                abstractC0108b.b.setPluginData(pluginType, pluginFrameworkVersion);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
