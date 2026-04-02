package com.worldturner.medeia.api;

import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SchemaSource.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/worldturner/medeia/api/MetaSchemaSource;", "Lcom/worldturner/medeia/api/InputSourceSchemaSource;", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "(Lcom/worldturner/medeia/api/JsonSchemaVersion;)V", "getVersion", "()Lcom/worldturner/medeia/api/JsonSchemaVersion;", "toString", "", "Companion", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class MetaSchemaSource extends InputSourceSchemaSource {
    public static final Companion Companion = new Companion(null);
    private static final MetaSchemaSource DRAFT04 = new MetaSchemaSource(JsonSchemaVersion.DRAFT04);
    private static final MetaSchemaSource DRAFT06 = new MetaSchemaSource(JsonSchemaVersion.DRAFT06);
    private static final MetaSchemaSource DRAFT07 = new MetaSchemaSource(JsonSchemaVersion.DRAFT07);
    private final JsonSchemaVersion version;

    /* compiled from: SchemaSource.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/worldturner/medeia/api/MetaSchemaSource$Companion;", "", "()V", "DRAFT04", "Lcom/worldturner/medeia/api/MetaSchemaSource;", "getDRAFT04", "()Lcom/worldturner/medeia/api/MetaSchemaSource;", "DRAFT06", "getDRAFT06", "DRAFT07", "getDRAFT07", "forVersion", "version", "Lcom/worldturner/medeia/api/JsonSchemaVersion;", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
        /* loaded from: classes4.dex */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[JsonSchemaVersion.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[JsonSchemaVersion.DRAFT04.ordinal()] = 1;
                iArr[JsonSchemaVersion.DRAFT06.ordinal()] = 2;
                iArr[JsonSchemaVersion.DRAFT07.ordinal()] = 3;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final MetaSchemaSource forVersion(JsonSchemaVersion jsonSchemaVersion) {
            j.g(jsonSchemaVersion, "version");
            int i = WhenMappings.$EnumSwitchMapping$0[jsonSchemaVersion.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return getDRAFT07();
                    }
                    throw new h();
                }
                return getDRAFT06();
            }
            return getDRAFT04();
        }

        public final MetaSchemaSource getDRAFT04() {
            return MetaSchemaSource.DRAFT04;
        }

        public final MetaSchemaSource getDRAFT06() {
            return MetaSchemaSource.DRAFT06;
        }

        public final MetaSchemaSource getDRAFT07() {
            return MetaSchemaSource.DRAFT07;
        }
    }

    private MetaSchemaSource(JsonSchemaVersion jsonSchemaVersion) {
        super(MetaSchemaInputSource.Companion.forVersion(jsonSchemaVersion), jsonSchemaVersion, null);
        this.version = jsonSchemaVersion;
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource, com.worldturner.medeia.api.SchemaSource
    public JsonSchemaVersion getVersion() {
        return this.version;
    }

    @Override // com.worldturner.medeia.api.InputSourceSchemaSource
    public String toString() {
        return "MetaSchemaSource(version=" + getVersion() + ')';
    }
}
