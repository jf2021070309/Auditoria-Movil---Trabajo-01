package com.amazon.aps.iva.ab0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes4.dex */
public final class g implements Externalizable {
    public boolean b;
    public boolean f;
    public String c = "";
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public String g = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.b = true;
            this.c = readUTF;
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.d.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.e.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.f = true;
            this.g = readUTF2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.b);
        if (this.b) {
            objectOutput.writeUTF(this.c);
        }
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(((Integer) arrayList.get(i)).intValue());
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(((Integer) arrayList2.get(i2)).intValue());
        }
        objectOutput.writeBoolean(this.f);
        if (this.f) {
            objectOutput.writeUTF(this.g);
        }
    }
}
