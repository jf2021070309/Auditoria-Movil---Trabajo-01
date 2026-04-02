package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes4.dex */
class StreamingAeadDecryptingStream extends FilterInputStream {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingStream(NonceBasedStreamingAead nonceBasedStreamingAead, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.headerLength = nonceBasedStreamingAead.getHeaderLength();
        this.aad = Arrays.copyOf(bArr, bArr.length);
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        ByteBuffer allocate = ByteBuffer.allocate(ciphertextSegmentSize + 1);
        this.ciphertextSegment = allocate;
        allocate.limit(0);
        this.firstCiphertextSegmentSize = ciphertextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset();
        ByteBuffer allocate2 = ByteBuffer.allocate(nonceBasedStreamingAead.getPlaintextSegmentSize() + 16);
        this.plaintextSegment = allocate2;
        allocate2.limit(0);
        this.headerRead = false;
        this.endOfCiphertext = false;
        this.endOfPlaintext = false;
        this.segmentNr = 0;
        this.decryptionErrorOccured = false;
    }

    private void loadSegment() throws IOException {
        byte b;
        while (!this.endOfCiphertext && this.ciphertextSegment.remaining() > 0) {
            int read = ((FilterInputStream) this).in.read(this.ciphertextSegment.array(), this.ciphertextSegment.position(), this.ciphertextSegment.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.ciphertextSegment;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.endOfCiphertext = true;
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        if (!this.endOfCiphertext) {
            ByteBuffer byteBuffer2 = this.ciphertextSegment;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.ciphertextSegment;
            byteBuffer3.position(byteBuffer3.position() - 1);
        } else {
            b = 0;
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);
            this.segmentNr++;
            this.plaintextSegment.flip();
            this.ciphertextSegment.clear();
            if (!this.endOfCiphertext) {
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
                this.ciphertextSegment.put(b);
            }
        } catch (GeneralSecurityException e) {
            setDecryptionErrorOccured();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.segmentNr + " endOfCiphertext:" + this.endOfCiphertext, e);
        }
    }

    private void readHeader() throws IOException {
        if (!this.headerRead) {
            ByteBuffer allocate = ByteBuffer.allocate(this.headerLength);
            while (allocate.remaining() > 0) {
                int read = ((FilterInputStream) this).in.read(allocate.array(), allocate.position(), allocate.remaining());
                if (read != -1) {
                    if (read != 0) {
                        allocate.position(allocate.position() + read);
                    } else {
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    }
                } else {
                    setDecryptionErrorOccured();
                    throw new IOException("Ciphertext is too short");
                }
            }
            allocate.flip();
            try {
                this.decrypter.init(allocate, this.aad);
                this.headerRead = true;
                return;
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        setDecryptionErrorOccured();
        throw new IOException("Decryption failed.");
    }

    private void setDecryptionErrorOccured() {
        this.decryptionErrorOccured = true;
        this.plaintextSegment.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return this.plaintextSegment.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & UnsignedBytes.MAX_VALUE;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        int read;
        long j2 = this.ciphertextSegmentSize;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) Math.min(min, j3))) > 0) {
            j3 -= read;
        }
        return j - j3;
    }

    public synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.segmentNr + "\nciphertextSegmentSize:" + this.ciphertextSegmentSize + "\nheaderRead:" + this.headerRead + "\nendOfCiphertext:" + this.endOfCiphertext + "\nendOfPlaintext:" + this.endOfPlaintext + "\ndecryptionErrorOccured:" + this.decryptionErrorOccured + "\nciphertextSgement position:" + this.ciphertextSegment.position() + " limit:" + this.ciphertextSegment.limit() + "\nplaintextSegment position:" + this.plaintextSegment.position() + " limit:" + this.plaintextSegment.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.decryptionErrorOccured) {
            if (!this.headerRead) {
                readHeader();
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);
            }
            if (this.endOfPlaintext) {
                return -1;
            }
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    break;
                }
                if (this.plaintextSegment.remaining() == 0) {
                    if (this.endOfCiphertext) {
                        this.endOfPlaintext = true;
                        break;
                    }
                    loadSegment();
                }
                int min = Math.min(this.plaintextSegment.remaining(), i2 - i3);
                this.plaintextSegment.get(bArr, i3 + i, min);
                i3 += min;
            }
            if (i3 == 0 && this.endOfPlaintext) {
                return -1;
            }
            return i3;
        }
        throw new IOException("Decryption failed.");
    }
}
