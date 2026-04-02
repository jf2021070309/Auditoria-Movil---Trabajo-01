package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements SQLiteEventStore.Function {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$ensureBeginTransaction$25;
        byte[] lambda$readPayload$15;
        switch (this.a) {
            case 0:
                lambda$readPayload$15 = SQLiteEventStore.lambda$readPayload$15((Cursor) obj);
                return lambda$readPayload$15;
            default:
                lambda$ensureBeginTransaction$25 = SQLiteEventStore.lambda$ensureBeginTransaction$25((Throwable) obj);
                return lambda$ensureBeginTransaction$25;
        }
    }
}
