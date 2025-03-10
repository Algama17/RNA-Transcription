package dev.alberto;

public class RNA_Transcription {
    public String transcribe(String dna) {
        StringBuilder rna = new StringBuilder();
        for (char c : dna.toCharArray()) {
            switch (c) {
                case 'G':
                    rna.append('C');
                    break;
                case 'C':
                    rna.append('G');
                    break;
                case 'T':
                    rna.append('A');
                    break;
                case 'A':
                    rna.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Nucleótido inválido: " + c);
            }
        }
        return rna.toString();
    }
}
