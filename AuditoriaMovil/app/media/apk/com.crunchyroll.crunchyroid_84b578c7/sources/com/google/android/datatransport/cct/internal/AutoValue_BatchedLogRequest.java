package com.google.android.datatransport.cct.internal;

import com.amazon.aps.iva.oa.a;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;
/* loaded from: classes2.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {
    private final List<LogRequest> logRequests;

    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        if (list != null) {
            this.logRequests = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.logRequests.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @Encodable.Field(name = "logRequest")
    public List<LogRequest> getLogRequests() {
        return this.logRequests;
    }

    public int hashCode() {
        return this.logRequests.hashCode() ^ 1000003;
    }

    public String toString() {
        return a.b(new StringBuilder("BatchedLogRequest{logRequests="), this.logRequests, "}");
    }
}
