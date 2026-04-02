package com.ellation.crunchyroll.api.etp.content;

import com.amazon.aps.iva.dh.c;
import com.amazon.aps.iva.xb0.a;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ContentServiceMonitor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/content/ContentServiceMonitorImpl;", "Lcom/ellation/crunchyroll/api/etp/content/ContentServiceMonitor;", "Lcom/amazon/aps/iva/kb0/q;", "onAddToWatchlist", "Lkotlin/Function0;", "Lcom/amazon/aps/iva/dh/c;", "getInAppReviewEligibilityEventHandler", "Lcom/amazon/aps/iva/xb0/a;", "<init>", "(Lcom/amazon/aps/iva/xb0/a;)V", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ContentServiceMonitorImpl implements ContentServiceMonitor {
    public static final int $stable = 0;
    private final a<c> getInAppReviewEligibilityEventHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public ContentServiceMonitorImpl(a<? extends c> aVar) {
        j.f(aVar, "getInAppReviewEligibilityEventHandler");
        this.getInAppReviewEligibilityEventHandler = aVar;
    }

    @Override // com.ellation.crunchyroll.api.etp.content.ContentServiceMonitor
    public void onAddToWatchlist() {
        this.getInAppReviewEligibilityEventHandler.invoke().onAddToWatchlist();
    }
}
