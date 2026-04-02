package com.amazon.aps.iva.y7;

import java.util.Collections;
import java.util.Set;
/* compiled from: WebvttCssStyle.java */
/* loaded from: classes.dex */
public final class d {
    public int f;
    public int h;
    public float o;
    public String a = "";
    public String b = "";
    public Set<String> c = Collections.emptySet();
    public String d = "";
    public String e = null;
    public boolean g = false;
    public boolean i = false;
    public final int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int p = -1;
    public boolean q = false;

    public static int a(int i, int i2, String str, String str2) {
        if (!str.isEmpty() && i != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i + i2;
        }
        return i;
    }
}
