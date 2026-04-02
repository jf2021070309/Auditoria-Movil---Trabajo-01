package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements SQLiteEventStore.Function {
    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        List lambda$loadActiveContexts$9;
        lambda$loadActiveContexts$9 = SQLiteEventStore.lambda$loadActiveContexts$9((Cursor) obj);
        return lambda$loadActiveContexts$9;
    }
}
