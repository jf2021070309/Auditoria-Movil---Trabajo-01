package com.worldturner.medeia.parser;

import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.worldturner.medeia.schema.validation.SchemaValidator;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
/* compiled from: AbstractValidatingStreamCopier.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/worldturner/medeia/parser/AbstractValidatingStreamCopier;", "Ljava/io/Closeable;", "Lcom/amazon/aps/iva/kb0/q;", "close", "Ljava/io/InputStream;", FirebaseAnalytics.Param.SOURCE, "Ljava/io/InputStream;", "getSource", "()Ljava/io/InputStream;", "Ljava/io/OutputStream;", "target", "Ljava/io/OutputStream;", "getTarget", "()Ljava/io/OutputStream;", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "validator", "Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "getValidator", "()Lcom/worldturner/medeia/schema/validation/SchemaValidator;", "", "inputSourceName", "Ljava/lang/String;", "getInputSourceName", "()Ljava/lang/String;", "<init>", "(Ljava/io/InputStream;Ljava/io/OutputStream;Lcom/worldturner/medeia/schema/validation/SchemaValidator;Ljava/lang/String;)V", "ValidatorInputStream", "medeia-validator-core"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes4.dex */
public class AbstractValidatingStreamCopier implements Closeable {
    private final String inputSourceName;
    private final InputStream source;
    private final OutputStream target;
    private final SchemaValidator validator;

    public AbstractValidatingStreamCopier(InputStream inputStream, OutputStream outputStream, SchemaValidator schemaValidator, String str) {
        j.g(inputStream, FirebaseAnalytics.Param.SOURCE);
        j.g(outputStream, "target");
        j.g(schemaValidator, "validator");
        this.source = inputStream;
        this.target = outputStream;
        this.validator = schemaValidator;
        this.inputSourceName = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.source.close();
    }

    public final String getInputSourceName() {
        return this.inputSourceName;
    }

    public final InputStream getSource() {
        return this.source;
    }

    public final OutputStream getTarget() {
        return this.target;
    }

    public final SchemaValidator getValidator() {
        return this.validator;
    }

    /* compiled from: AbstractValidatingStreamCopier.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0084\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/worldturner/medeia/parser/AbstractValidatingStreamCopier$ValidatorInputStream;", "Ljava/io/InputStream;", "(Lcom/worldturner/medeia/parser/AbstractValidatingStreamCopier;)V", "read", "", "b", "", "off", "len", "medeia-validator-core"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes4.dex */
    public final class ValidatorInputStream extends InputStream {
        public ValidatorInputStream() {
        }

        @Override // java.io.InputStream
        public int read() {
            int read = AbstractValidatingStreamCopier.this.getSource().read();
            if (read >= 0) {
                AbstractValidatingStreamCopier.this.getTarget().write(read);
            }
            return read;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            j.g(bArr, "b");
            int read = AbstractValidatingStreamCopier.this.getSource().read(bArr, i, i2);
            if (read > 0) {
                AbstractValidatingStreamCopier.this.getTarget().write(bArr, i, read);
            }
            return read;
        }
    }
}
