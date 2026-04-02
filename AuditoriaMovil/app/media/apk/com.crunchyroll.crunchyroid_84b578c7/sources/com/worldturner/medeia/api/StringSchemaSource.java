package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.net.URI;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/worldturner/medeia/api/StringSchemaSource;", "Lcom/worldturner/medeia/api/InputSourceSchemaSource;", "string", "", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "baseUri", "Ljava/net/URI;", AppMeasurementSdk.ConditionalUserProperty.NAME, "(Ljava/lang/String;Lcom/worldturner/medeia/api/JsonSchemaVersion;Ljava/net/URI;Ljava/lang/String;)V", "getBaseUri", "()Ljava/net/URI;", "getString", "()Ljava/lang/String;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class StringSchemaSource extends InputSourceSchemaSource {
    private final URI baseUri;
    private final String string;
    private final JsonSchemaVersion version;

    public StringSchemaSource(String str) {
        this(str, null, null, null, 14, null);
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public URI getBaseUri() {
        return this.baseUri;
    }

    public final String getString() {
        return this.string;
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public JsonSchemaVersion getVersion() {
        return this.version;
    }

    public StringSchemaSource(String str, JsonSchemaVersion jsonSchemaVersion) {
        this(str, jsonSchemaVersion, null, null, 12, null);
    }

    public StringSchemaSource(String str, JsonSchemaVersion jsonSchemaVersion, URI uri) {
        this(str, jsonSchemaVersion, uri, null, 8, null);
    }

    public /* synthetic */ StringSchemaSource(String str, JsonSchemaVersion jsonSchemaVersion, URI uri, String str2, int i, e eVar) {
        this(str, (i & 2) != 0 ? null : jsonSchemaVersion, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringSchemaSource(String str, JsonSchemaVersion jsonSchemaVersion, URI uri, String str2) {
        super(new StringInputSource(str, str2), jsonSchemaVersion, uri);
        j.g(str, "string");
        this.string = str;
        this.version = jsonSchemaVersion;
        this.baseUri = uri;
    }
}
