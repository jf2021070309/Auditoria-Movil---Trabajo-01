package com.amazon.aps.iva.od0;

import com.amazon.aps.iva.od0.a;
import com.amazon.aps.iva.od0.p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/* compiled from: AbstractParser.java */
/* loaded from: classes4.dex */
public abstract class b<MessageType extends p> implements r<MessageType> {
    static {
        int i = f.b;
    }

    public static void b(p pVar) throws j {
        v vVar;
        if (pVar != null && !pVar.isInitialized()) {
            if (pVar instanceof a) {
                a aVar = (a) pVar;
                vVar = new v();
            } else {
                vVar = new v();
            }
            j jVar = new j(vVar.getMessage());
            jVar.b = pVar;
            throw jVar;
        }
    }

    public final p c(ByteArrayInputStream byteArrayInputStream, f fVar) throws j {
        p pVar;
        try {
            int read = byteArrayInputStream.read();
            if (read == -1) {
                pVar = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i = 7;
                    while (true) {
                        if (i < 32) {
                            int read2 = byteArrayInputStream.read();
                            if (read2 != -1) {
                                read |= (read2 & 127) << i;
                                if ((read2 & 128) == 0) {
                                    break;
                                }
                                i += 7;
                            } else {
                                throw j.b();
                            }
                        } else {
                            while (i < 64) {
                                int read3 = byteArrayInputStream.read();
                                if (read3 != -1) {
                                    if ((read3 & 128) != 0) {
                                        i += 7;
                                    }
                                } else {
                                    throw j.b();
                                }
                            }
                            throw new j("CodedInputStream encountered a malformed varint.");
                        }
                    }
                }
                d dVar = new d(new a.AbstractC0569a.C0570a(byteArrayInputStream, read));
                p pVar2 = (p) a(dVar, fVar);
                try {
                    dVar.a(0);
                    pVar = pVar2;
                } catch (j e) {
                    e.b = pVar2;
                    throw e;
                }
            }
            b(pVar);
            return pVar;
        } catch (IOException e2) {
            throw new j(e2.getMessage());
        }
    }
}
