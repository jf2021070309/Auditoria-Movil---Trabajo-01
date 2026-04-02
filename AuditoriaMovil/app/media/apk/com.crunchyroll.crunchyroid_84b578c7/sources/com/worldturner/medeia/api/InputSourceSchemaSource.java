package com.worldturner.medeia.api;

import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.e0;
import com.amazon.aps.iva.yb0.j;
import java.net.URI;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/worldturner/medeia/api/InputSourceSchemaSource;", "Lcom/worldturner/medeia/api/SchemaSource;", "input", "Lcom/worldturner/medeia/api/InputSource;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "baseUri", "Ljava/net/URI;", "(Lcom/worldturner/medeia/api/InputSource;Lcom/worldturner/medeia/api/JsonSchemaVersion;Ljava/net/URI;)V", "getBaseUri", "()Ljava/net/URI;", "getInput", "()Lcom/worldturner/medeia/api/InputSource;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "toString", "", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public class InputSourceSchemaSource implements SchemaSource {
    private final URI baseUri;
    private final InputSource input;
    private final JsonSchemaVersion version;

    public InputSourceSchemaSource(InputSource inputSource, JsonSchemaVersion jsonSchemaVersion, URI uri) {
        j.g(inputSource, "input");
        this.input = inputSource;
        this.version = jsonSchemaVersion;
        this.baseUri = uri;
    }

    @Override // com.worldturner.medeia.api.SchemaSource
    public URI getBaseUri() {
        return this.baseUri;
    }

    @Override // com.worldturner.medeia.api.SchemaSource
    public InputSource getInput() {
        return this.input;
    }

    @Override // com.worldturner.medeia.api.SchemaSource
    public JsonSchemaVersion getVersion() {
        return this.version;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder(e0.a(getClass()).k());
        sb.append('(');
        String[] strArr = new String[3];
        strArr[0] = "input=" + getInput();
        String str2 = null;
        if (getBaseUri() != null) {
            str = "baseUri=" + getBaseUri();
        } else {
            str = null;
        }
        strArr[1] = str;
        if (getVersion() != null) {
            str2 = "version=" + getVersion();
        }
        strArr[2] = str2;
        sb.append(x.B0(o.O(strArr), null, null, null, null, 63));
        sb.append(")");
        String sb2 = sb.toString();
        j.b(sb2, "builder.append(\")\").toString()");
        return sb2;
    }

    public /* synthetic */ InputSourceSchemaSource(InputSource inputSource, JsonSchemaVersion jsonSchemaVersion, URI uri, int i, e eVar) {
        this(inputSource, (i & 2) != 0 ? null : jsonSchemaVersion, (i & 4) != 0 ? null : uri);
    }
}
