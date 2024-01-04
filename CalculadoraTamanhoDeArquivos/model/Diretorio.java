package L13.Q1.model;

import java.io.File;

public class Diretorio {

    private File diretorio;

    public Diretorio(String caminho) {
        diretorio = new File(caminho);

        if (!diretorio.exists()) {
            throw new IllegalArgumentException("O diretório: " + caminho + " não existe.");
        }
    }

    public long ObterTamanhoArquivos() {
        return ObterTamanhoArquivos(diretorio);
    }

    public long ObterTamanhoArquivos(File arquivo) {
        long total = 0;

        File[] dir = arquivo.listFiles();
        if (dir != null) {
            for (File f : dir) {
                if (f.isDirectory()) {
                    total += ObterTamanhoArquivos(f);
                } else {
                    total += f.length();
                }
            }
        }
        return total;
    }
}
