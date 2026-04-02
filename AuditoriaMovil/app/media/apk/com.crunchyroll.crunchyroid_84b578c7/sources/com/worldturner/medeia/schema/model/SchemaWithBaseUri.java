package com.worldturner.medeia.schema.model;

import com.amazon.aps.iva.yb0.j;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.net.URI;
import kotlin.Metadata;
/* compiled from: SchemaWithBaseUri.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/worldturner/medeia/schema/model/SchemaWithBaseUri;", "Lcom/worldturner/medeia/schema/model/Schema;", "baseUri", "Ljava/net/URI;", "schema", "(Ljava/net/URI;Lcom/worldturner/medeia/schema/model/Schema;)V", "getBaseUri", "()Ljava/net/URI;", "resolvedId", "getResolvedId", "setResolvedId", "(Ljava/net/URI;)V", "getSchema", "()Lcom/worldturner/medeia/schema/model/Schema;", "buildValidator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "context", "Lcom/worldturner/medeia/schema/model/ValidationBuilderContext;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class SchemaWithBaseUri implements Schema {
    private final URI baseUri;
    private URI resolvedId;
    private final Schema schema;

    public SchemaWithBaseUri(URI uri, Schema schema) {
        j.g(uri, "baseUri");
        j.g(schema, "schema");
        this.baseUri = uri;
        this.schema = schema;
        this.resolvedId = uri;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public SchemaValidator buildValidator(ValidationBuilderContext validationBuilderContext) {
        j.g(validationBuilderContext, "context");
        return this.schema.buildValidator(validationBuilderContext.withBaseUri(this.baseUri, true));
    }

    public final URI getBaseUri() {
        return this.baseUri;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public URI getResolvedId() {
        return this.resolvedId;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    @Override // com.worldturner.medeia.schema.model.Schema
    public void setResolvedId(URI uri) {
        this.resolvedId = uri;
    }
}
