package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.InputStream;
import java.net.URI;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/worldturner/medeia/api/StreamSchemaSource;", "Lcom/worldturner/medeia/api/InputSourceSchemaSource;", "stream", "Ljava/io/InputStream;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "baseUri", "Ljava/net/URI;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Ljava/io/InputStream;Lcom/worldturner/medeia/api/JsonSchemaVersion;Ljava/net/URI;Ljava/lang/String;)V", "getBaseUri", "()Ljava/net/URI;", "getStream", "()Ljava/io/InputStream;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class StreamSchemaSource extends InputSourceSchemaSource {
    private final URI baseUri;
    private final InputStream stream;
    private final JsonSchemaVersion version;

    public StreamSchemaSource(InputStream inputStream) {
        this(inputStream, null, null, null, 14, null);
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public URI getBaseUri() {
        return this.baseUri;
    }

    public final InputStream getStream() {
        return this.stream;
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public JsonSchemaVersion getVersion() {
        return this.version;
    }

    public StreamSchemaSource(InputStream inputStream, JsonSchemaVersion jsonSchemaVersion) {
        this(inputStream, jsonSchemaVersion, null, null, 12, null);
    }

    public StreamSchemaSource(InputStream inputStream, JsonSchemaVersion jsonSchemaVersion, URI uri) {
        this(inputStream, jsonSchemaVersion, uri, null, 8, null);
    }

    public /* synthetic */ StreamSchemaSource(InputStream inputStream, JsonSchemaVersion jsonSchemaVersion, URI uri, String str, int i, e eVar) {
        this(inputStream, (i & 2) != 0 ? null : jsonSchemaVersion, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamSchemaSource(InputStream inputStream, JsonSchemaVersion jsonSchemaVersion, URI uri, String str) {
        super(new StreamInputSource(inputStream, str), jsonSchemaVersion, uri);
        j.g(inputStream, "stream");
        this.stream = inputStream;
        this.version = jsonSchemaVersion;
        this.baseUri = uri;
    }
}
