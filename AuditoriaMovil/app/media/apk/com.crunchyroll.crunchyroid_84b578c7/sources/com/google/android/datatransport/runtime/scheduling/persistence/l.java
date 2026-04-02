package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements SQLiteEventStore.Function, SQLiteEventStore.Producer {
    public final /* synthetic */ Object a;

    public /* synthetic */ l(Object obj) {
        this.a = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$loadMetadata$16;
        lambda$loadMetadata$16 = SQLiteEventStore.lambda$loadMetadata$16((Map) this.a, (Cursor) obj);
        return lambda$loadMetadata$16;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public final Object produce() {
        Object lambda$ensureBeginTransaction$24;
        lambda$ensureBeginTransaction$24 = SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) this.a);
        return lambda$ensureBeginTransaction$24;
    }
}
