package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements SQLiteEventStore.Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ SQLiteEventStore b;

    public /* synthetic */ h(SQLiteEventStore sQLiteEventStore, int i) {
        this.a = i;
        this.b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object lambda$cleanUp$11;
        Object lambda$resetClientMetrics$23;
        int i = this.a;
        SQLiteEventStore sQLiteEventStore = this.b;
        switch (i) {
            case 0:
                lambda$resetClientMetrics$23 = sQLiteEventStore.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
                return lambda$resetClientMetrics$23;
            default:
                lambda$cleanUp$11 = sQLiteEventStore.lambda$cleanUp$11((Cursor) obj);
                return lambda$cleanUp$11;
        }
    }
}
