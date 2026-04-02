package com.amazon.aps.iva.i2;

import java.util.List;
/* compiled from: EditProcessor.kt */
/* loaded from: classes.dex */
public final class h {
    public e0 a;
    public i b;

    public h() {
        e0 e0Var = new e0(com.amazon.aps.iva.c2.c.a, com.amazon.aps.iva.c2.z.b, (com.amazon.aps.iva.c2.z) null);
        this.a = e0Var;
        this.b = new i(e0Var.a, e0Var.b);
    }

    public final e0 a(List<? extends f> list) {
        f fVar;
        Exception e;
        f fVar2;
        com.amazon.aps.iva.yb0.j.f(list, "editCommands");
        try {
            int size = list.size();
            int i = 0;
            fVar = null;
            while (i < size) {
                try {
                    fVar2 = list.get(i);
                } catch (Exception e2) {
                    e = e2;
                    fVar2 = fVar;
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb2.append(this.b.d());
                    sb2.append(", composition=");
                    sb2.append(this.b.c());
                    sb2.append(", selection=");
                    i iVar = this.b;
                    sb2.append((Object) com.amazon.aps.iva.c2.z.g(com.amazon.aps.iva.ab.x.f(iVar.b, iVar.c)));
                    sb2.append("):");
                    sb.append(sb2.toString());
                    sb.append('\n');
                    com.amazon.aps.iva.lb0.x.A0(list, sb, "\n", null, null, new g(fVar2, this), 60);
                    String sb3 = sb.toString();
                    com.amazon.aps.iva.yb0.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb3, e);
                }
                try {
                    fVar2.a(this.b);
                    i++;
                    fVar = fVar2;
                } catch (Exception e3) {
                    e = e3;
                    StringBuilder sb4 = new StringBuilder();
                    StringBuilder sb22 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb22.append(this.b.d());
                    sb22.append(", composition=");
                    sb22.append(this.b.c());
                    sb22.append(", selection=");
                    i iVar2 = this.b;
                    sb22.append((Object) com.amazon.aps.iva.c2.z.g(com.amazon.aps.iva.ab.x.f(iVar2.b, iVar2.c)));
                    sb22.append("):");
                    sb4.append(sb22.toString());
                    sb4.append('\n');
                    com.amazon.aps.iva.lb0.x.A0(list, sb4, "\n", null, null, new g(fVar2, this), 60);
                    String sb32 = sb4.toString();
                    com.amazon.aps.iva.yb0.j.e(sb32, "StringBuilder().apply(builderAction).toString()");
                    throw new RuntimeException(sb32, e);
                }
            }
            com.amazon.aps.iva.c2.b bVar = new com.amazon.aps.iva.c2.b(this.b.toString(), null, 6);
            i iVar3 = this.b;
            e0 e0Var = new e0(bVar, com.amazon.aps.iva.ab.x.f(iVar3.b, iVar3.c), this.b.c());
            this.a = e0Var;
            return e0Var;
        } catch (Exception e4) {
            fVar = null;
            e = e4;
        }
    }
}
