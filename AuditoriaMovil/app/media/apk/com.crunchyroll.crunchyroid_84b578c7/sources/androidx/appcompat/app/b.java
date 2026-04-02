package androidx.appcompat.app;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class b extends CursorAdapter {
    public final int b;
    public final int c;
    public final /* synthetic */ AlertController.RecycleListView d;
    public final /* synthetic */ AlertController e;
    public final /* synthetic */ AlertController.b f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertController.b bVar, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f = bVar;
        this.d = recycleListView;
        this.e = alertController;
        Cursor cursor2 = getCursor();
        this.b = cursor2.getColumnIndexOrThrow(bVar.K);
        this.c = cursor2.getColumnIndexOrThrow(bVar.L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.b));
        int position = cursor.getPosition();
        int i = cursor.getInt(this.c);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.d.setItemChecked(position, z);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f.b.inflate(this.e.M, viewGroup, false);
    }
}
