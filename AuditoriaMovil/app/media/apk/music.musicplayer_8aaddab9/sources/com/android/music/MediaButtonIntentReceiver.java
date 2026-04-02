package com.android.music;

import android.content.Context;
import android.content.Intent;
import com.jrtstudio.audio.Bookmark;
import e.h.d.m0;
import e.h.g.d1.j;
import e.h.g.d1.k;
import e.h.g.s1;
import e.h.g.x0;
/* loaded from: classes.dex */
public class MediaButtonIntentReceiver extends j {
    public static void x(Intent intent) {
        j.q(new MediaButtonIntentReceiver(), intent);
    }

    @Override // e.h.g.d1.j
    public long b() {
        m0 m0Var = m0.u;
        if (m0Var == null) {
            return -1L;
        }
        try {
            return m0Var.q0();
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // e.h.g.d1.j
    public boolean c(x0 x0Var) {
        return false;
    }

    @Override // e.h.g.d1.j
    public float d(Context context) {
        return 0.0f;
    }

    @Override // e.h.g.d1.j
    public boolean e(x0 x0Var) {
        return false;
    }

    @Override // e.h.g.d1.j
    public boolean f(x0 x0Var) {
        return true;
    }

    @Override // e.h.g.d1.j
    public boolean g(Context context) {
        return false;
    }

    @Override // e.h.g.d1.j
    public boolean h(x0 x0Var) {
        return false;
    }

    @Override // e.h.g.d1.j
    public long i() {
        m0 m0Var = m0.u;
        if (m0Var == null) {
            return -1L;
        }
        try {
            return m0Var.w0().a;
        } catch (Exception e2) {
            s1.l(e2, true);
            return -1L;
        }
    }

    @Override // e.h.g.d1.j
    public boolean j(Context context) {
        return false;
    }

    @Override // e.h.g.d1.j
    public boolean k(Context context) {
        return false;
    }

    @Override // e.h.g.d1.j
    public boolean l() {
        return true;
    }

    @Override // e.h.g.d1.j
    public void m() {
        try {
            m0.N0(k.USER_PAUSE);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // e.h.g.d1.j
    public void n() {
        Intent intent = new Intent();
        intent.putExtra("autoshuffle", "true");
        intent.setClass(x0.f8405d, MusicBrowserActivity.class);
        intent.setFlags(335544320);
        x0.f8405d.startActivity(intent);
    }

    @Override // e.h.g.d1.j
    public void o() {
    }

    @Override // e.h.g.d1.j
    public void p() {
        m0.N0(k.USER_PREVIOUS);
    }

    @Override // e.h.g.d1.j
    public void r(long j2) {
        m0 m0Var = m0.u;
        if (m0Var != null) {
            try {
                m0Var.M0(new Bookmark(j2, m0Var.v0().getPath()));
            } catch (Exception e2) {
                s1.l(e2, true);
            }
        }
    }

    @Override // e.h.g.d1.j
    public void s(k kVar) {
        m0.N0(kVar);
    }

    @Override // e.h.g.d1.j
    public void u() {
        m0.N0(k.USER_NEXT);
    }

    @Override // e.h.g.d1.j
    public boolean v() {
        return true;
    }

    @Override // e.h.g.d1.j
    public void w() {
        m0.N0(k.TOGGLE_PAUSE);
    }
}
