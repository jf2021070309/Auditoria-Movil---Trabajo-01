package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements SQLiteEventStore.Function {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Long lambda$getNextCallTime$5;
        lambda$getNextCallTime$5 = SQLiteEventStore.lambda$getNextCallTime$5((Cursor) obj);
        return lambda$getNextCallTime$5;
    }
}
