package com.amazon.aps.iva.u3;

import android.database.Cursor;
import android.widget.Filter;
import com.amazon.aps.iva.q.x0;
/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public final class b extends Filter {
    public final a a;

    /* compiled from: CursorFilter.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((x0) this.a).d((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.amazon.aps.iva.u3.b$a r0 = r4.a
            com.amazon.aps.iva.q.x0 r0 = (com.amazon.aps.iva.q.x0) r0
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.l
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L2c
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L20
            goto L2c
        L20:
            android.app.SearchableInfo r1 = r0.m     // Catch: java.lang.RuntimeException -> L2c
            android.database.Cursor r5 = r0.h(r1, r5)     // Catch: java.lang.RuntimeException -> L2c
            if (r5 == 0) goto L2c
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2c
            goto L2d
        L2c:
            r5 = r3
        L2d:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L3d
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L42
        L3d:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.u3.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.a;
        Cursor cursor = ((com.amazon.aps.iva.u3.a) aVar).d;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((x0) aVar).c((Cursor) obj);
        }
    }
}
