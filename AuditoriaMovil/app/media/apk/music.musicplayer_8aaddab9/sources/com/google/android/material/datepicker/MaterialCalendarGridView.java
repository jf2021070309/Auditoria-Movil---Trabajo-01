package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import c.i.k.d0;
import ch.qos.logback.classic.Level;
import e.d.b.d.a;
import e.d.b.d.m.b;
import e.d.b.d.m.k;
import e.d.b.d.m.l;
import e.d.b.d.m.p;
import e.d.b.d.m.w;
import java.util.Calendar;
import java.util.Iterator;
import music.musicplayer.R;
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4637b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = w.e();
        if (l.d(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f4637b = l.e(getContext(), R.attr.nestedScrollable);
        d0.A(this, new k(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public p getAdapter2() {
        return (p) super.getAdapter();
    }

    public final View b(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int a;
        int width;
        int a2;
        int width2;
        int width3;
        int i2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        p adapter2 = getAdapter2();
        DateSelector<?> dateSelector = adapter2.f6454c;
        b bVar = adapter2.f6456e;
        int max = Math.max(adapter2.b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.d(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<c.i.j.b<Long, Long>> it = dateSelector.f().iterator();
        while (it.hasNext()) {
            c.i.j.b<Long, Long> next = it.next();
            Long l2 = next.a;
            if (l2 == null) {
                materialCalendarGridView = this;
            } else if (next.f2126b != null) {
                long longValue = l2.longValue();
                long longValue2 = next.f2126b.longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                    boolean N = a.N(this);
                    if (longValue < item.longValue()) {
                        width = max % adapter2.f6453b.f4640d == 0 ? 0 : !N ? materialCalendarGridView.b(max - 1).getRight() : materialCalendarGridView.b(max - 1).getLeft();
                        a = max;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue);
                        a = adapter2.a(materialCalendarGridView.a.get(5));
                        View b2 = materialCalendarGridView.b(a);
                        width = (b2.getWidth() / 2) + b2.getLeft();
                    }
                    if (longValue2 > item2.longValue()) {
                        width2 = (min + 1) % adapter2.f6453b.f4640d == 0 ? getWidth() : !N ? materialCalendarGridView.b(min).getRight() : materialCalendarGridView.b(min).getLeft();
                        a2 = min;
                    } else {
                        materialCalendarGridView.a.setTimeInMillis(longValue2);
                        a2 = adapter2.a(materialCalendarGridView.a.get(5));
                        View b3 = materialCalendarGridView.b(a2);
                        width2 = (b3.getWidth() / 2) + b3.getLeft();
                    }
                    int itemId = (int) adapter2.getItemId(a);
                    int i3 = max;
                    int i4 = min;
                    int itemId2 = (int) adapter2.getItemId(a2);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b4 = materialCalendarGridView.b(numColumns);
                        int top = b4.getTop() + bVar.a.a.top;
                        p pVar = adapter2;
                        int bottom = b4.getBottom() - bVar.a.a.bottom;
                        if (N) {
                            int i5 = a2 > numColumns2 ? 0 : width2;
                            width3 = numColumns > a ? getWidth() : width;
                            i2 = i5;
                        } else {
                            i2 = numColumns > a ? 0 : width;
                            width3 = a2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i2, top, width3, bottom, bVar.f6414h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        adapter2 = pVar;
                    }
                    materialCalendarGridView = this;
                    max = i3;
                    min = i4;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i2, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i2, rect);
        } else if (i2 == 33) {
            setSelection(getAdapter2().d());
        } else if (i2 == 130) {
            setSelection(getAdapter2().b());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (super.onKeyDown(i2, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().b()) {
                return true;
            }
            if (19 == i2) {
                setSelection(getAdapter2().b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i2, int i3) {
        if (!this.f4637b) {
            super.onMeasure(i2, i3);
            return;
        }
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Level.ALL_INT));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof p)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i2) {
        if (i2 < getAdapter2().b()) {
            super.setSelection(getAdapter2().b());
        } else {
            super.setSelection(i2);
        }
    }
}
