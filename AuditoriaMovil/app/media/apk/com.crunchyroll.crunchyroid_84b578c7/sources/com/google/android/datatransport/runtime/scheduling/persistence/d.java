package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements SQLiteEventStore.Function {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        SQLiteDatabase lambda$getDb$0;
        switch (this.a) {
            case 0:
                lambda$getDb$0 = SQLiteEventStore.lambda$getDb$0((Throwable) obj);
                return lambda$getDb$0;
            default:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
        }
    }
}
