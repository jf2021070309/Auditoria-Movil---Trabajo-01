package com.braze.events;

import bo.app.t4;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/braze/events/BrazeSdkAuthenticationErrorEvent;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/t4;", "sdkAuthError", "Lbo/app/t4;", "<init>", "(Lbo/app/t4;)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeSdkAuthenticationErrorEvent {
    private final t4 sdkAuthError;

    public BrazeSdkAuthenticationErrorEvent(t4 t4Var) {
        j.f(t4Var, "sdkAuthError");
        this.sdkAuthError = t4Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BrazeSdkAuthenticationErrorEvent) && j.a(this.sdkAuthError, ((BrazeSdkAuthenticationErrorEvent) obj).sdkAuthError)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.sdkAuthError.hashCode();
    }

    public String toString() {
        return this.sdkAuthError.toString();
    }
}
