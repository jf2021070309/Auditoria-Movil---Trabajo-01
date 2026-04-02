package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements SQLiteEventStore.Function {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Boolean lambda$recordLogEventDropped$17;
        lambda$recordLogEventDropped$17 = SQLiteEventStore.lambda$recordLogEventDropped$17((Cursor) obj);
        return lambda$recordLogEventDropped$17;
    }
}
