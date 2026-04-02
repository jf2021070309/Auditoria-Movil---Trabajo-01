package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_int108.bykvm_for12;

import java.util.Map;
/* loaded from: classes.dex */
public class d {
    public boolean a = false;
    public boolean b = true;
    public Map<String, Integer> c = null;
    public Map<String, String> d = null;
    public int e = 10;
    public int f = 1;
    public int g = 1;
    public int h = 10;
    public int i = 1;
    public int j = 1;
    public int k = 900;
    public int l = 120;
    public String m = null;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" localEnable: ");
        sb.append(this.a);
        sb.append(" probeEnable: ");
        sb.append(this.b);
        sb.append(" hostFilter: ");
        Map<String, Integer> map = this.c;
        sb.append(map != null ? map.size() : 0);
        sb.append(" hostMap: ");
        Map<String, String> map2 = this.d;
        sb.append(map2 != null ? map2.size() : 0);
        sb.append(" reqTo: ");
        sb.append(this.e);
        sb.append("#");
        sb.append(this.f);
        sb.append("#");
        sb.append(this.g);
        sb.append(" reqErr: ");
        sb.append(this.h);
        sb.append("#");
        sb.append(this.i);
        sb.append("#");
        sb.append(this.j);
        sb.append(" updateInterval: ");
        sb.append(this.k);
        sb.append(" updateRandom: ");
        sb.append(this.l);
        sb.append(" httpBlack: ");
        sb.append(this.m);
        return sb.toString();
    }
}
