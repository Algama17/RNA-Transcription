package dev.alberto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RNA_TranscriptionTest {

    @Test
    void testTranscribe_GCTA_ReturnsCGAU() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("CGAU", transcriber.transcribe("GCTA"));
    }

    @Test
    void testTranscribe_ACGT_ReturnsUGCA() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("UGCA", transcriber.transcribe("ACGT"));
    }

    @Test
    void testTranscribe_T_ReturnsA() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("A", transcriber.transcribe("T"));
    }

    @Test
    void testTranscribe_A_ReturnsU() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("U", transcriber.transcribe("A"));
    }

    @Test
    void testTranscribe_GC_ReturnsCG() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("CG", transcriber.transcribe("GC"));
    }

    @Test
    void testTranscribe_EmptyString_ReturnsEmpty() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertEquals("", transcriber.transcribe(""));
    }

    @Test
    void testTranscribe_InvalidNucleotide_ThrowsException() {
        RNA_Transcription transcriber = new RNA_Transcription();
        assertThrows(IllegalArgumentException.class, () -> {
            transcriber.transcribe("X");
        });
    }
}
