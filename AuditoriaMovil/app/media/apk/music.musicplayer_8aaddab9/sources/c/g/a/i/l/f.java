package c.g.a.i.l;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public o f1776d;

    /* renamed from: f  reason: collision with root package name */
    public int f1778f;

    /* renamed from: g  reason: collision with root package name */
    public int f1779g;
    public d a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1774b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1775c = false;

    /* renamed from: e  reason: collision with root package name */
    public a f1777e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f1780h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f1781i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1782j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f1783k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f1784l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(o oVar) {
        this.f1776d = oVar;
    }

    @Override // c.g.a.i.l.d
    public void a(d dVar) {
        for (f fVar : this.f1784l) {
            if (!fVar.f1782j) {
                return;
            }
        }
        this.f1775c = true;
        d dVar2 = this.a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f1774b) {
            this.f1776d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f1784l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f1782j) {
            g gVar = this.f1781i;
            if (gVar != null) {
                if (!gVar.f1782j) {
                    return;
                }
                this.f1778f = this.f1780h * gVar.f1779g;
            }
            c(fVar2.f1779g + this.f1778f);
        }
        d dVar3 = this.a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f1784l.clear();
        this.f1783k.clear();
        this.f1782j = false;
        this.f1779g = 0;
        this.f1775c = false;
        this.f1774b = false;
    }

    public void c(int i2) {
        if (this.f1782j) {
            return;
        }
        this.f1782j = true;
        this.f1779g = i2;
        for (d dVar : this.f1783k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1776d.f1798b.j0);
        sb.append(":");
        sb.append(this.f1777e);
        sb.append("(");
        sb.append(this.f1782j ? Integer.valueOf(this.f1779g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1784l.size());
        sb.append(":d=");
        sb.append(this.f1783k.size());
        sb.append(">");
        return sb.toString();
    }
}
