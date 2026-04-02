package com.braze.events;

import bo.app.l2;
import bo.app.q2;
import com.amazon.aps.iva.yb0.j;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/braze/events/InAppMessageEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/l2;", "triggerEvent", "Lbo/app/l2;", "getTriggerEvent", "()Lbo/app/l2;", "Lbo/app/q2;", "triggerAction", "Lbo/app/q2;", "getTriggerAction", "()Lbo/app/q2;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "getInAppMessage", "()Lcom/braze/models/inappmessage/IInAppMessage;", "userId", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "<init>", "(Lbo/app/l2;Lbo/app/q2;Lcom/braze/models/inappmessage/IInAppMessage;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class InAppMessageEvent {
    private final IInAppMessage inAppMessage;
    private final q2 triggerAction;
    private final l2 triggerEvent;
    private final String userId;

    public InAppMessageEvent(l2 l2Var, q2 q2Var, IInAppMessage iInAppMessage, String str) {
        j.f(l2Var, "triggerEvent");
        j.f(q2Var, "triggerAction");
        j.f(iInAppMessage, "inAppMessage");
        this.triggerEvent = l2Var;
        this.triggerAction = q2Var;
        this.inAppMessage = iInAppMessage;
        this.userId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppMessageEvent)) {
            return false;
        }
        InAppMessageEvent inAppMessageEvent = (InAppMessageEvent) obj;
        if (j.a(this.triggerEvent, inAppMessageEvent.triggerEvent) && j.a(this.triggerAction, inAppMessageEvent.triggerAction) && j.a(this.inAppMessage, inAppMessageEvent.inAppMessage) && j.a(this.userId, inAppMessageEvent.userId)) {
            return true;
        }
        return false;
    }

    public final IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    public final q2 getTriggerAction() {
        return this.triggerAction;
    }

    public final l2 getTriggerEvent() {
        return this.triggerEvent;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.triggerAction.hashCode();
        int hashCode3 = (this.inAppMessage.hashCode() + ((hashCode2 + (this.triggerEvent.hashCode() * 31)) * 31)) * 31;
        String str = this.userId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public String toString() {
        return JsonUtils.getPrettyPrintedString(this.inAppMessage.forJsonPut());
    }
}
