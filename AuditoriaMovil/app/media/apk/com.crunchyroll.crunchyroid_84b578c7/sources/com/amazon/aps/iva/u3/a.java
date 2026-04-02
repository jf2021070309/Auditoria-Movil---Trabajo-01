package com.amazon.aps.iva.u3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.u3.b;
/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public com.amazon.aps.iva.u3.b h;
    public boolean c = true;
    public Cursor d = null;
    public boolean b = false;
    public int e = -1;
    public C0753a f = new C0753a();
    public b g = new b();

    /* compiled from: CursorAdapter.java */
    /* renamed from: com.amazon.aps.iva.u3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0753a extends ContentObserver {
        public C0753a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.c && (cursor = aVar.d) != null && !cursor.isClosed()) {
                aVar.b = aVar.d.requery();
            }
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0753a c0753a = this.f;
                if (c0753a != null) {
                    cursor2.unregisterContentObserver(c0753a);
                }
                b bVar = this.g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.d = cursor;
            if (cursor != null) {
                C0753a c0753a2 = this.f;
                if (c0753a2 != null) {
                    cursor.registerContentObserver(c0753a2);
                }
                b bVar2 = this.g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.e = cursor.getColumnIndexOrThrow("_id");
                this.b = true;
                notifyDataSetChanged();
            } else {
                this.e = -1;
                this.b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            this.d.moveToPosition(i);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.k.inflate(cVar.j, viewGroup, false);
            }
            b(view, this.d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.h == null) {
            this.h = new com.amazon.aps.iva.u3.b(this);
        }
        return this.h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.b && (cursor = this.d) != null) {
            cursor.moveToPosition(i);
            return this.d;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.b || (cursor = this.d) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.d.getLong(this.e);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.b) {
            if (this.d.moveToPosition(i)) {
                if (view == null) {
                    view = e(viewGroup);
                }
                b(view, this.d);
                return view;
            }
            throw new IllegalStateException(c0.a("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
