package com.amazon.aps.iva.vp;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
/* compiled from: BatchFileHandler.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<byte[], com.amazon.aps.iva.tp.a> {
    public static final d h = new d();

    public d() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.tp.a invoke(byte[] bArr) {
        byte[] bArr2 = bArr;
        j.f(bArr2, "it");
        try {
            return new com.amazon.aps.iva.tp.a(JsonParser.parseString(new String(bArr2, com.amazon.aps.iva.oe0.a.b)).getAsJsonObject().get("ev_size").getAsInt());
        } catch (ClassCastException e) {
            throw new JsonParseException(e);
        } catch (IllegalStateException e2) {
            throw new JsonParseException(e2);
        } catch (NullPointerException e3) {
            throw new JsonParseException(e3);
        } catch (NumberFormatException e4) {
            throw new JsonParseException(e4);
        }
    }
}
