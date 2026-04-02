package com.jrt.recyclerview.os;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.h.g.s1;
/* loaded from: classes2.dex */
public class NPEGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int P0(int i2, RecyclerView.t tVar, RecyclerView.x xVar) {
        try {
            S1();
            K1();
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

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void w0(RecyclerView.t tVar, RecyclerView.x xVar) {
        try {
            super.w0(tVar, xVar);
        } catch (IllegalArgumentException unused) {
            s1.c("Stopping RecyclerView from crashing from precompute text");
        } catch (IndexOutOfBoundsException unused2) {
            s1.c("Stopping RecyclerView from crashing, even though all data modified correctly");
        } catch (Throwable th) {
            s1.l(th, true);
            s1.c("Stopping RecyclerView from crashing for unknown reason");
        }
    }
}
