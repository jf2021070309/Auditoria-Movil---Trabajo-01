package c.j.a;

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
import c.j.a.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2245b;

    /* renamed from: c  reason: collision with root package name */
    public Cursor f2246c;

    /* renamed from: d  reason: collision with root package name */
    public Context f2247d;

    /* renamed from: e  reason: collision with root package name */
    public int f2248e;

    /* renamed from: f  reason: collision with root package name */
    public C0043a f2249f;

    /* renamed from: g  reason: collision with root package name */
    public DataSetObserver f2250g;

    /* renamed from: h  reason: collision with root package name */
    public c.j.a.b f2251h;

    /* renamed from: c.j.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043a extends ContentObserver {
        public C0043a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f2245b || (cursor = aVar.f2246c) == null || cursor.isClosed()) {
                return;
            }
            aVar.a = aVar.f2246c.requery();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z) {
        int i2 = z ? 1 : 2;
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f2245b = true;
        } else {
            this.f2245b = false;
        }
        boolean z2 = cursor != null;
        this.f2246c = cursor;
        this.a = z2;
        this.f2247d = context;
        this.f2248e = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f2249f = new C0043a();
            this.f2250g = new b();
        } else {
            this.f2249f = null;
            this.f2250g = null;
        }
        if (z2) {
            C0043a c0043a = this.f2249f;
            if (c0043a != null) {
                cursor.registerContentObserver(c0043a);
            }
            DataSetObserver dataSetObserver = this.f2250g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f2246c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0043a c0043a = this.f2249f;
                if (c0043a != null) {
                    cursor2.unregisterContentObserver(c0043a);
                }
                DataSetObserver dataSetObserver = this.f2250g;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2246c = cursor;
            if (cursor != null) {
                C0043a c0043a2 = this.f2249f;
                if (c0043a2 != null) {
                    cursor.registerContentObserver(c0043a2);
                }
                DataSetObserver dataSetObserver2 = this.f2250g;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2248e = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.f2248e = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.f2246c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (this.a) {
            this.f2246c.moveToPosition(i2);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.f2254k.inflate(cVar.f2253j, viewGroup, false);
            }
            a(view, this.f2247d, this.f2246c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2251h == null) {
            this.f2251h = new c.j.a.b(this);
        }
        return this.f2251h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.a || (cursor = this.f2246c) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2246c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.a && (cursor = this.f2246c) != null && cursor.moveToPosition(i2)) {
            return this.f2246c.getLong(this.f2248e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (this.a) {
            if (this.f2246c.moveToPosition(i2)) {
                if (view == null) {
                    view = d(this.f2247d, this.f2246c, viewGroup);
                }
                a(view, this.f2247d, this.f2246c);
                return view;
            }
            throw new IllegalStateException(e.a.d.a.a.e("couldn't move cursor to position ", i2));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
