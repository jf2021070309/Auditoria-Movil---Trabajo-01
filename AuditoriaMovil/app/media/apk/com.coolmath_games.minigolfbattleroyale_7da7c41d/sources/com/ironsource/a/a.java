package com.ironsource.a;

import android.util.Pair;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class a {
    String a;
    public boolean b;
    String c;
    d d;
    boolean e;
    ArrayList<Pair<String, String>> f;

    /* renamed from: com.ironsource.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0079a {
        String a;
        public d d;
        public boolean b = false;
        public String c = "POST";
        public boolean e = false;
        public ArrayList<Pair<String, String>> f = new ArrayList<>();

        public C0079a(String str) {
            this.a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.a = str;
        }
    }

    public a(C0079a c0079a) {
        this.e = false;
        this.a = c0079a.a;
        this.b = c0079a.b;
        this.c = c0079a.c;
        this.d = c0079a.d;
        this.e = c0079a.e;
        if (c0079a.f != null) {
            this.f = new ArrayList<>(c0079a.f);
        }
    }
}
