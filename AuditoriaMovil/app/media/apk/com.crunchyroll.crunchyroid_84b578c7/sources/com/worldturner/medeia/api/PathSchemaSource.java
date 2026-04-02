package com.worldturner.medeia.api;

import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import java.net.URI;
import java.nio.file.Path;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/worldturner/medeia/api/PathSchemaSource;", "Lcom/worldturner/medeia/api/InputSourceSchemaSource;", "path", "Ljava/nio/file/Path;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "baseUri", "Ljava/net/URI;", "(Ljava/nio/file/Path;Lcom/worldturner/medeia/api/JsonSchemaVersion;Ljava/net/URI;)V", "getBaseUri", "()Ljava/net/URI;", "getPath", "()Ljava/nio/file/Path;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class PathSchemaSource extends InputSourceSchemaSource {
    private final URI baseUri;
    private final Path path;
    private final JsonSchemaVersion version;

    public PathSchemaSource(Path path) {
        this(path, null, null, 6, null);
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public URI getBaseUri() {
        return this.baseUri;
    }

    public final Path getPath() {
        return this.path;
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public JsonSchemaVersion getVersion() {
        return this.version;
    }

    public PathSchemaSource(Path path, JsonSchemaVersion jsonSchemaVersion) {
        this(path, jsonSchemaVersion, null, 4, null);
    }

    public /* synthetic */ PathSchemaSource(Path path, JsonSchemaVersion jsonSchemaVersion, URI uri, int i, e eVar) {
        this(path, (i & 2) != 0 ? null : jsonSchemaVersion, (i & 4) != 0 ? null : uri);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathSchemaSource(Path path, JsonSchemaVersion jsonSchemaVersion, URI uri) {
        super(new PathInputSource(path), jsonSchemaVersion, uri);
        j.g(path, "path");
        this.path = path;
        this.version = jsonSchemaVersion;
        this.baseUri = uri;
    }
}
