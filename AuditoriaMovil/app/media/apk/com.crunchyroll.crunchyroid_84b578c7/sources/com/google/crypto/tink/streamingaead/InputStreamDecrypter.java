package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.StreamingAead;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
/* loaded from: classes4.dex */
final class InputStreamDecrypter extends InputStream {
    byte[] associatedData;
    InputStream ciphertextStream;
    PrimitiveSet<StreamingAead> primitives;
    boolean attemptedMatching = false;
    InputStream matchingStream = null;

    public InputStreamDecrypter(PrimitiveSet<StreamingAead> primitiveSet, InputStream inputStream, byte[] bArr) {
        this.primitives = primitiveSet;
        if (inputStream.markSupported()) {
            this.ciphertextStream = inputStream;
        } else {
            this.ciphertextStream = new BufferedInputStream(inputStream);
        }
        this.ciphertextStream.mark(Integer.MAX_VALUE);
        this.associatedData = (byte[]) bArr.clone();
    }

    private void disableRewinding() throws IOException {
        this.ciphertextStream.mark(0);
    }

    private void rewind() throws IOException {
        this.ciphertextStream.reset();
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream = this.matchingStream;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.ciphertextStream.close();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == 1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.matchingStream;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        } else if (!this.attemptedMatching) {
            this.attemptedMatching = true;
            for (PrimitiveSet.Entry<StreamingAead> entry : this.primitives.getRawPrimitives()) {
                try {
                    InputStream newDecryptingStream = entry.getPrimitive().newDecryptingStream(this.ciphertextStream, this.associatedData);
                    int read = newDecryptingStream.read(bArr, i, i2);
                    if (read != 0) {
                        this.matchingStream = newDecryptingStream;
                        disableRewinding();
                        return read;
                    }
                    throw new IOException("Could not read bytes from the ciphertext stream");
                } catch (IOException unused) {
                    rewind();
                } catch (GeneralSecurityException unused2) {
                    rewind();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }
}
