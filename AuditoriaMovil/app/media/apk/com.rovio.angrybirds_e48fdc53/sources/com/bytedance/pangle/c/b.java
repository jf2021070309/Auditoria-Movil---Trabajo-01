package com.bytedance.pangle.c;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b {
    public static String b = "request_finish";
    public static String c = "download_start";
    public static String d = "download_finish";
    public static String e = "install_start";
    public static String f = "install_finish";
    public static String g = "load_start";
    public static String h = "load_finish";
    public static String i = "rm_entry_finish";
    private static volatile b j;
    public final List<com.bytedance.pangle.c.a> a = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {
        public static int a = 1;
        public static int b = 2;
        public static int c = -1;
        public static int d = -2;
        public static int e = 12000;
        public static int f = 12001;
        public static int g = 12002;
        public static int h = 12003;
        public static int i = 12004;
        public static int j = 20000;
        public static int k = 21000;
        public static int l = 21001;
        public static int m = 21002;
        public static int n = 22000;
        public static int o = 22001;
        public static int p = 22002;
        public static int q = 22999;
        public static int r = 30000;
        public static int s = 31000;
        public static int t = 32000;
        public static int u = 32001;
        public static int v = 32002;
        public static int w = 32003;
        public static int x = 32004;
        public static int y = 32005;
        public static int z = 32006;
        public static int A = 32007;
        public static int B = 32008;
        public static int C = 32999;
        public static int D = 40000;
        public static int E = 41000;
        public static int F = 42000;
    }

    public static b a() {
        if (j == null) {
            synchronized (b.class) {
                j = new b();
            }
        }
        return j;
    }

    private b() {
    }

    public final void a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        synchronized (this.a) {
            for (com.bytedance.pangle.c.a aVar : this.a) {
                aVar.a(str, jSONObject, jSONObject2, jSONObject3);
            }
        }
    }
}
