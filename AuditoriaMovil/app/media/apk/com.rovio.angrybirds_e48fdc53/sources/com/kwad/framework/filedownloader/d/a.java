package com.kwad.framework.filedownloader.d;

import android.content.ContentValues;
import com.kwad.framework.filedownloader.f.f;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.List;
/* loaded from: classes.dex */
public final class a {
    private long acw;
    private long acx;
    private long acy;
    private int id;
    private int index;

    public static long o(List<a> list) {
        long j = 0;
        for (a aVar : list) {
            j += aVar.vl() - aVar.getStartOffset();
        }
        return j;
    }

    public final void J(long j) {
        this.acx = j;
    }

    public final void K(long j) {
        this.acy = j;
    }

    public final int getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getStartOffset() {
        return this.acw;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setStartOffset(long j) {
        this.acw = j;
    }

    public final String toString() {
        return f.b("id[%d] index[%d] range[%d, %d) current offset(%d)", Integer.valueOf(this.id), Integer.valueOf(this.index), Long.valueOf(this.acw), Long.valueOf(this.acy), Long.valueOf(this.acx));
    }

    public final long vl() {
        return this.acx;
    }

    public final long vm() {
        return this.acy;
    }

    public final ContentValues vn() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(this.id));
        contentValues.put("connectionIndex", Integer.valueOf(this.index));
        contentValues.put(DBDefinition.START_OFFSET, Long.valueOf(this.acw));
        contentValues.put("currentOffset", Long.valueOf(this.acx));
        contentValues.put(DBDefinition.END_OFFSET, Long.valueOf(this.acy));
        return contentValues;
    }
}
