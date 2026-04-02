package com.braze.events;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/braze/events/NoMatchingTriggerEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "sourceEventType", "Ljava/lang/String;", "getSourceEventType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoMatchingTriggerEvent {
    private final String sourceEventType;

    public NoMatchingTriggerEvent(String str) {
        j.f(str, "sourceEventType");
        this.sourceEventType = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof NoMatchingTriggerEvent) && j.a(this.sourceEventType, ((NoMatchingTriggerEvent) obj).sourceEventType)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.sourceEventType.hashCode();
    }

    public String toString() {
        return t1.b(new StringBuilder("NoMatchingTriggerEvent(sourceEventType="), this.sourceEventType, ')');
    }
}
