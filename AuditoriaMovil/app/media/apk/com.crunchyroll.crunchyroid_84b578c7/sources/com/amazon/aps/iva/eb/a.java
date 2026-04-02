package com.amazon.aps.iva.eb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
/* compiled from: ChildViewsIterable.java */
/* loaded from: classes.dex */
public final class a implements Iterable<View> {
    public final RecyclerView.p b;

    /* compiled from: ChildViewsIterable.java */
    /* renamed from: com.amazon.aps.iva.eb.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0219a implements Iterator<View> {
        public int b = 0;

        public C0219a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.b < a.this.b.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final View next() {
            RecyclerView.p pVar = a.this.b;
            int i = this.b;
            this.b = i + 1;
            return pVar.getChildAt(i);
        }
    }

    public a(RecyclerView.p pVar) {
        this.b = pVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<View> iterator() {
        return new C0219a();
    }
}
