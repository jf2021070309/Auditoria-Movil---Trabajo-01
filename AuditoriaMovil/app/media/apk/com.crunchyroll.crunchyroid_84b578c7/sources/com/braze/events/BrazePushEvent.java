package com.braze.events;

import com.amazon.aps.iva.yb0.j;
import com.braze.enums.BrazePushEventType;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/braze/events/BrazePushEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/braze/enums/BrazePushEventType;", "eventType", "Lcom/braze/enums/BrazePushEventType;", "getEventType", "()Lcom/braze/enums/BrazePushEventType;", "Lcom/braze/models/push/BrazeNotificationPayload;", "notificationPayload", "Lcom/braze/models/push/BrazeNotificationPayload;", "getNotificationPayload", "()Lcom/braze/models/push/BrazeNotificationPayload;", "<init>", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazePushEvent {
    private final BrazePushEventType eventType;
    private final BrazeNotificationPayload notificationPayload;

    public BrazePushEvent(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazePushEventType, "eventType");
        j.f(brazeNotificationPayload, "notificationPayload");
        this.eventType = brazePushEventType;
        this.notificationPayload = brazeNotificationPayload;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazePushEvent)) {
            return false;
        }
        BrazePushEvent brazePushEvent = (BrazePushEvent) obj;
        if (this.eventType == brazePushEvent.eventType && j.a(this.notificationPayload, brazePushEvent.notificationPayload)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.notificationPayload.hashCode() + (this.eventType.hashCode() * 31);
    }

    public String toString() {
        return "BrazePushEvent(eventType=" + this.eventType + ", notificationPayload=" + this.notificationPayload + ')';
    }
}
