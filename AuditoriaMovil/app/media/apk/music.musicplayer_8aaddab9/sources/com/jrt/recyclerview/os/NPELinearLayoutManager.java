package com.jrt.recyclerview.os;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class NPELinearLayoutManager extends LinearLayoutManager {
    public NPELinearLayoutManager(Context context) {
        super(1, false);
    }

    public NPELinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        try {
            if (this.r == 0) {
                return 0;
            }
            return C1(i2, tVar, xVar);
        } catch (IndexOutOfBoundsException unused) {
            s1.c("Stopping RecyclerView from crashing, even though all data modified correctly");
            return 0;
        } catch (Throwable th) {
            s1.c("Stopping RecyclerView from crashing for unknown reason");
            s1.l(th, true);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void w0(RecyclerView.t tVar, RecyclerView.x xVar) {
        try {
            super.w0(tVar, xVar);
        } catch (IllegalArgumentException unused) {
            s1.c("Stopping RecyclerView from crashing from precompute text");
        } catch (IndexOutOfBoundsException unused2) {
            s1.c("Stopping RecyclerView from crashing, even though all data modified correctly");
        } catch (Throwable th) {
            s1.c("Stopping RecyclerView from crashing for unknown reason");
            s1.l(th, true);
        }
    }
}
