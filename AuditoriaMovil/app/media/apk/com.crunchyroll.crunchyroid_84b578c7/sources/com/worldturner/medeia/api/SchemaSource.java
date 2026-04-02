package com.worldturner.medeia.api;

import java.net.URI;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/api/SchemaSource;", "", "baseUri", "Ljava/net/URI;", "getBaseUri", "()Ljava/net/URI;", "input", "Lcom/worldturner/medeia/api/InputSource;", "getInput", "()Lcom/worldturner/medeia/api/InputSource;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public interface SchemaSource {
    URI getBaseUri();

    InputSource getInput();

    JsonSchemaVersion getVersion();
}
