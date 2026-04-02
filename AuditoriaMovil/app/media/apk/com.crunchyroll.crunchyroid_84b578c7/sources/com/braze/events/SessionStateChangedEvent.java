package com.braze.events;

import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "sessionId", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "eventType", "Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "getEventType", "()Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "<init>", "(Ljava/lang/String;Lcom/braze/events/SessionStateChangedEvent$ChangeType;)V", "ChangeType", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SessionStateChangedEvent {
    private final ChangeType eventType;
    private final String sessionId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/braze/events/SessionStateChangedEvent$ChangeType;", "", "(Ljava/lang/String;I)V", "SESSION_STARTED", "SESSION_ENDED", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum ChangeType {
        SESSION_STARTED,
        SESSION_ENDED
    }

    public SessionStateChangedEvent(String str, ChangeType changeType) {
        j.f(str, "sessionId");
        j.f(changeType, "eventType");
        this.sessionId = str;
        this.eventType = changeType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStateChangedEvent)) {
            return false;
        }
        SessionStateChangedEvent sessionStateChangedEvent = (SessionStateChangedEvent) obj;
        if (j.a(this.sessionId, sessionStateChangedEvent.sessionId) && this.eventType == sessionStateChangedEvent.eventType) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.eventType.hashCode() + (this.sessionId.hashCode() * 31);
    }

    public String toString() {
        return "SessionStateChangedEvent{sessionId='" + this.sessionId + "', eventType='" + this.eventType + "'}'";
    }
}
