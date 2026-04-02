package com.facebook.ads.internal.view.hscroll;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes2.dex */
public class d extends RecyclerView implements View.OnTouchListener {
    protected final int a;
    protected int b;
    private int c;
    private boolean d;
    private boolean e;
    private LinearLayoutManager f;
    private a g;

    /* loaded from: classes2.dex */
    public interface a {
        int a(int i);
    }

    public d(Context context) {
        super(context);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.a = a();
        setOnTouchListener(this);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.a = a();
        setOnTouchListener(this);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 0;
        this.c = 0;
        this.d = true;
        this.e = false;
        this.a = a();
        setOnTouchListener(this);
    }

    private int a() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int a(int i) {
        int i2 = this.c - i;
        int a2 = this.g.a(i2);
        return i2 > this.a ? a(this.b, a2) : i2 < (-this.a) ? b(this.b, a2) : this.b;
    }

    private int a(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    private int b(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getItemCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, boolean z) {
        if (getAdapter() == null) {
            return;
        }
        this.b = i;
        if (z) {
            smoothScrollToPosition(i);
        } else {
            scrollToPosition(i);
        }
    }

    public int getCurrentPosition() {
        return this.b;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || actionMasked == 4) {
            if (this.e) {
                a(a(rawX), true);
            }
            this.d = true;
            this.e = false;
            return true;
        } else if (actionMasked == 0 || actionMasked == 5 || (this.d && actionMasked == 2)) {
            this.c = rawX;
            if (this.d) {
                this.d = false;
            }
            this.e = true;
            return false;
        } else {
            return false;
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("SnapRecyclerView only supports LinearLayoutManager");
        }
        super.setLayoutManager(layoutManager);
        this.f = (LinearLayoutManager) layoutManager;
    }

    public void setSnapDelegate(a aVar) {
        this.g = aVar;
    }
}
