package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t implements SQLiteEventStore.Function {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        List lambda$loadActiveContexts$10;
        lambda$loadActiveContexts$10 = SQLiteEventStore.lambda$loadActiveContexts$10((SQLiteDatabase) obj);
        return lambda$loadActiveContexts$10;
    }
}
