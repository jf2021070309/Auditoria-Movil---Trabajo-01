package com.braze.events;

import bo.app.s1;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B\u001b\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0018\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Exception;", "Lkotlin/Exception;", "originalException", "Ljava/lang/Exception;", "Lbo/app/s1;", "brazeRequest", "Lbo/app/s1;", "networkExceptionMessage", "Ljava/lang/String;", "getNetworkExceptionMessage", "()Ljava/lang/String;", "", "requestInitiationTime", "Ljava/lang/Long;", "getRequestInitiationTime", "()Ljava/lang/Long;", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "requestType", "Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "getRequestType", "()Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "<init>", "(Ljava/lang/Exception;Lbo/app/s1;)V", "RequestType", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeNetworkFailureEvent {
    private final s1 brazeRequest;
    private final String networkExceptionMessage;
    private final Exception originalException;
    private final Long requestInitiationTime;
    private final RequestType requestType;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/events/BrazeNetworkFailureEvent$RequestType;", "", "(Ljava/lang/String;I)V", "CONTENT_CARDS_SYNC", "NEWS_FEED_SYNC", "OTHER", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum RequestType {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r2.w() == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BrazeNetworkFailureEvent(java.lang.Exception r2, bo.app.s1 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "originalException"
            com.amazon.aps.iva.yb0.j.f(r2, r0)
            java.lang.String r0 = "brazeRequest"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            r1.<init>()
            r1.originalException = r2
            r1.brazeRequest = r3
            java.lang.String r2 = r2.getMessage()
            r1.networkExceptionMessage = r2
            java.lang.Long r2 = r3.k()
            r1.requestInitiationTime = r2
            boolean r2 = r3 instanceof bo.app.a0
            if (r2 == 0) goto L24
            com.braze.events.BrazeNetworkFailureEvent$RequestType r2 = com.braze.events.BrazeNetworkFailureEvent.RequestType.CONTENT_CARDS_SYNC
            goto L41
        L24:
            boolean r2 = r3 instanceof bo.app.g0
            if (r2 == 0) goto L3f
            bo.app.o3 r2 = r3.f()
            if (r2 == 0) goto L36
            boolean r2 = r2.w()
            r3 = 1
            if (r2 != r3) goto L36
            goto L37
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L3c
            com.braze.events.BrazeNetworkFailureEvent$RequestType r2 = com.braze.events.BrazeNetworkFailureEvent.RequestType.NEWS_FEED_SYNC
            goto L41
        L3c:
            com.braze.events.BrazeNetworkFailureEvent$RequestType r2 = com.braze.events.BrazeNetworkFailureEvent.RequestType.OTHER
            goto L41
        L3f:
            com.braze.events.BrazeNetworkFailureEvent$RequestType r2 = com.braze.events.BrazeNetworkFailureEvent.RequestType.OTHER
        L41:
            r1.requestType = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.events.BrazeNetworkFailureEvent.<init>(java.lang.Exception, bo.app.s1):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrazeNetworkFailureEvent)) {
            return false;
        }
        BrazeNetworkFailureEvent brazeNetworkFailureEvent = (BrazeNetworkFailureEvent) obj;
        if (j.a(this.originalException, brazeNetworkFailureEvent.originalException) && j.a(this.brazeRequest, brazeNetworkFailureEvent.brazeRequest)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.brazeRequest.hashCode() + (this.originalException.hashCode() * 31);
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(originalException=" + this.originalException + ", brazeRequest=" + this.brazeRequest + ')';
    }
}
