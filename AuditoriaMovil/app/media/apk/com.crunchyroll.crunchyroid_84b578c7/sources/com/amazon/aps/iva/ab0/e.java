package com.amazon.aps.iva.ab0;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
/* compiled from: Phonemetadata.java */
/* loaded from: classes4.dex */
public final class e implements Externalizable {
    public boolean e;
    public boolean h;
    public String b = "";
    public String c = "";
    public final ArrayList d = new ArrayList();
    public String f = "";
    public boolean g = false;
    public String i = "";

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        this.b = objectInput.readUTF();
        this.c = objectInput.readUTF();
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.d.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String readUTF = objectInput.readUTF();
            this.e = true;
            this.f = readUTF;
        }
        if (objectInput.readBoolean()) {
            String readUTF2 = objectInput.readUTF();
            this.h = true;
            this.i = readUTF2;
        }
        this.g = objectInput.readBoolean();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.b);
        objectOutput.writeUTF(this.c);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF((String) arrayList.get(i));
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
        objectOutput.writeBoolean(this.h);
        if (this.h) {
            objectOutput.writeUTF(this.i);
        }
        objectOutput.writeBoolean(this.g);
    }
}
