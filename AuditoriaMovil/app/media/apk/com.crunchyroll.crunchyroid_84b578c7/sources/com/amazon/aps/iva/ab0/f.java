package com.amazon.aps.iva.ab0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes4.dex */
public final class f implements Externalizable {
    public boolean B;
    public boolean D;
    public boolean F;
    public boolean H;
    public boolean M;
    public boolean O;
    public boolean Q;
    public boolean S;
    public boolean U;
    public boolean b;
    public boolean d;
    public boolean f;
    public boolean h;
    public boolean j;
    public boolean k0;
    public boolean l;
    public boolean n;
    public boolean p;
    public boolean r;
    public boolean t;
    public boolean v;
    public boolean x;
    public boolean z;
    public g c = null;
    public g e = null;
    public g g = null;
    public g i = null;
    public g k = null;
    public g m = null;
    public g o = null;
    public g q = null;
    public g s = null;
    public g u = null;
    public g w = null;
    public g y = null;
    public g A = null;
    public g C = null;
    public g E = null;
    public g G = null;
    public g I = null;
    public String J = "";
    public int K = 0;
    public String L = "";
    public String N = "";
    public String P = "";
    public String R = "";
    public String T = "";
    public String V = "";
    public boolean W = false;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public boolean Z = false;
    public String v0 = "";
    public boolean w0 = false;

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            g gVar = new g();
            gVar.readExternal(objectInput);
            this.b = true;
            this.c = gVar;
        }
        if (objectInput.readBoolean()) {
            g gVar2 = new g();
            gVar2.readExternal(objectInput);
            this.d = true;
            this.e = gVar2;
        }
        if (objectInput.readBoolean()) {
            g gVar3 = new g();
            gVar3.readExternal(objectInput);
            this.f = true;
            this.g = gVar3;
        }
        if (objectInput.readBoolean()) {
            g gVar4 = new g();
            gVar4.readExternal(objectInput);
            this.h = true;
            this.i = gVar4;
        }
        if (objectInput.readBoolean()) {
            g gVar5 = new g();
            gVar5.readExternal(objectInput);
            this.j = true;
            this.k = gVar5;
        }
        if (objectInput.readBoolean()) {
            g gVar6 = new g();
            gVar6.readExternal(objectInput);
            this.l = true;
            this.m = gVar6;
        }
        if (objectInput.readBoolean()) {
            g gVar7 = new g();
            gVar7.readExternal(objectInput);
            this.n = true;
            this.o = gVar7;
        }
        if (objectInput.readBoolean()) {
            g gVar8 = new g();
            gVar8.readExternal(objectInput);
            this.p = true;
            this.q = gVar8;
        }
        if (objectInput.readBoolean()) {
            g gVar9 = new g();
            gVar9.readExternal(objectInput);
            this.r = true;
            this.s = gVar9;
        }
        if (objectInput.readBoolean()) {
            g gVar10 = new g();
            gVar10.readExternal(objectInput);
            this.t = true;
            this.u = gVar10;
        }
        if (objectInput.readBoolean()) {
            g gVar11 = new g();
            gVar11.readExternal(objectInput);
            this.v = true;
            this.w = gVar11;
        }
        if (objectInput.readBoolean()) {
            g gVar12 = new g();
            gVar12.readExternal(objectInput);
            this.x = true;
            this.y = gVar12;
        }
        if (objectInput.readBoolean()) {
            g gVar13 = new g();
            gVar13.readExternal(objectInput);
            this.z = true;
            this.A = gVar13;
        }
        if (objectInput.readBoolean()) {
            g gVar14 = new g();
            gVar14.readExternal(objectInput);
            this.B = true;
            this.C = gVar14;
        }
        if (objectInput.readBoolean()) {
            g gVar15 = new g();
            gVar15.readExternal(objectInput);
            this.D = true;
            this.E = gVar15;
        }
        if (objectInput.readBoolean()) {
            g gVar16 = new g();
            gVar16.readExternal(objectInput);
            this.F = true;
            this.G = gVar16;
        }
        if (objectInput.readBoolean()) {
            g gVar17 = new g();
            gVar17.readExternal(objectInput);
            this.H = true;
            this.I = gVar17;
        }
        this.J = objectInput.readUTF();
        this.K = objectInput.readInt();
        this.L = objectInput.readUTF();
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.M = true;
            this.N = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.O = true;
            this.P = readUTF2;
        }
        if (objectInput.readBoolean()) {
            String readUTF3 = objectInput.readUTF();
            this.Q = true;
            this.R = readUTF3;
        }
        if (objectInput.readBoolean()) {
            String readUTF4 = objectInput.readUTF();
            this.S = true;
            this.T = readUTF4;
        }
        if (objectInput.readBoolean()) {
            String readUTF5 = objectInput.readUTF();
            this.U = true;
            this.V = readUTF5;
        }
        this.W = objectInput.readBoolean();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            e eVar = new e();
            eVar.readExternal(objectInput);
            this.X.add(eVar);
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            e eVar2 = new e();
            eVar2.readExternal(objectInput);
            this.Y.add(eVar2);
        }
        this.Z = objectInput.readBoolean();
        if (objectInput.readBoolean()) {
            String readUTF6 = objectInput.readUTF();
            this.k0 = true;
            this.v0 = readUTF6;
        }
        this.w0 = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.b);
        if (this.b) {
            this.c.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.d);
        if (this.d) {
            this.e.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.f);
        if (this.f) {
            this.g.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.h);
        if (this.h) {
            this.i.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.j);
        if (this.j) {
            this.k.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.l);
        if (this.l) {
            this.m.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.n);
        if (this.n) {
            this.o.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.p);
        if (this.p) {
            this.q.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.r);
        if (this.r) {
            this.s.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.t);
        if (this.t) {
            this.u.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.v);
        if (this.v) {
            this.w.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.x);
        if (this.x) {
            this.y.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.z);
        if (this.z) {
            this.A.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.B);
        if (this.B) {
            this.C.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.D);
        if (this.D) {
            this.E.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.F);
        if (this.F) {
            this.G.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.H);
        if (this.H) {
            this.I.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.J);
        objectOutput.writeInt(this.K);
        objectOutput.writeUTF(this.L);
        objectOutput.writeBoolean(this.M);
        if (this.M) {
            objectOutput.writeUTF(this.N);
        }
        objectOutput.writeBoolean(this.O);
        if (this.O) {
            objectOutput.writeUTF(this.P);
        }
        objectOutput.writeBoolean(this.Q);
        if (this.Q) {
            objectOutput.writeUTF(this.R);
        }
        objectOutput.writeBoolean(this.S);
        if (this.S) {
            objectOutput.writeUTF(this.T);
        }
        objectOutput.writeBoolean(this.U);
        if (this.U) {
            objectOutput.writeUTF(this.V);
        }
        objectOutput.writeBoolean(this.W);
        ArrayList arrayList = this.X;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            ((e) arrayList.get(i)).writeExternal(objectOutput);
        }
        ArrayList arrayList2 = this.Y;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            ((e) arrayList2.get(i2)).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.Z);
        objectOutput.writeBoolean(this.k0);
        if (this.k0) {
            objectOutput.writeUTF(this.v0);
        }
        objectOutput.writeBoolean(this.w0);
    }
}
